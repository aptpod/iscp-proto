package iscp2v1_test

import (
	"bytes"
	"encoding/hex"
	"testing"

	iscp2v1 "github.com/aptpod/iscp-proto/gen/go/iscp2/v1"
	gogofast "github.com/aptpod/iscp-proto/gen/gogofast/iscp2/v1"
	"google.golang.org/protobuf/proto"
)

const invalidUTF8 = "\xff\xfe-invalid"

type gogoMessage interface {
	Marshal() ([]byte, error)
	Unmarshal([]byte) error
}

type vtMessage interface {
	proto.Message
	MarshalVTStrict() ([]byte, error)
	UnmarshalVT([]byte) error
}

// MarshalVTStrict must emit the same bytes as gogofast, which writes fields
// (oneof members included) in field number order.
func TestMarshalVTStrictMatchesGogofast(t *testing.T) {
	streamChunk := &iscp2v1.StreamChunk{
		SequenceNumber: 3,
		DataPointGroups: []*iscp2v1.DataPointGroup{
			{
				DataIdOrAlias: &iscp2v1.DataPointGroup_DataIdAlias{DataIdAlias: 5},
				DataPoints:    []*iscp2v1.DataPoint{{ElapsedTime: -1, Payload: []byte{1, 2}}},
				DataFilterIds: []uint32{7, 8},
			},
			{
				DataIdOrAlias: &iscp2v1.DataPointGroup_DataId{DataId: &iscp2v1.DataID{Name: invalidUTF8, Type: "float64"}},
				DataPoints:    []*iscp2v1.DataPoint{{ElapsedTime: 10, Payload: []byte{3}}},
			},
		},
	}
	baseTime := &iscp2v1.BaseTime{SessionId: invalidUTF8, Name: "edge_rtc", Priority: 20, ElapsedTime: 4, BaseTime: 1700000000}
	tests := []struct {
		name string
		in   vtMessage
		gogo func() gogoMessage
		// want is the hex of the gogofast Marshal output for in.
		want string
	}{
		{
			name: "Message/UpstreamChunk",
			in: &iscp2v1.Message{Message: &iscp2v1.Message_UpstreamChunk{UpstreamChunk: &iscp2v1.UpstreamChunk{
				StreamIdAlias: 1,
				StreamChunk:   streamChunk,
				DataIds:       []*iscp2v1.DataID{{Name: "a", Type: "b"}},
			}}},
			gogo: func() gogoMessage { return &gogofast.Message{} },
			want: "b2043e080112320803120e10051a0608011202010222020708121e0a150a0afffe2d696e76616c69641207666c6f617436341a0508141201031a060a0161120162",
		},
		{
			name: "Message/DownstreamChunk",
			in: &iscp2v1.Message{Message: &iscp2v1.Message_DownstreamChunk{DownstreamChunk: &iscp2v1.DownstreamChunk{
				StreamIdAlias:   2,
				UpstreamOrAlias: &iscp2v1.DownstreamChunk_UpstreamInfo{UpstreamInfo: &iscp2v1.UpstreamInfo{SessionId: "s", StreamId: []byte{1, 2, 3}, SourceNodeId: invalidUTF8}},
				StreamChunk:     streamChunk,
				DownstreamFilterReferences: []*iscp2v1.DownstreamFilterReferences{
					{References: []*iscp2v1.DownstreamFilterReference{{DownstreamFilterIndex: 1, DataFilterIndex: 2}}},
				},
			}}},
			gogo: func() gogoMessage { return &gogofast.Message{} },
			want: "b20854080212140a017312030102031a0afffe2d696e76616c696422320803120e10051a0608011202010222020708121e0a150a0afffe2d696e76616c69641207666c6f617436341a05081412010332060a0408011002",
		},
		{
			name: "Message/DownstreamMetadata",
			in: &iscp2v1.Message{Message: &iscp2v1.Message_DownstreamMetadata{DownstreamMetadata: &iscp2v1.DownstreamMetadata{
				RequestId:     9,
				StreamIdAlias: 4,
				Metadata:      &iscp2v1.DownstreamMetadata_BaseTime{BaseTime: baseTime},
				SourceNodeId:  "node",
			}}},
			gogo: func() gogoMessage { return &gogofast.Message{} },
			want: "ca082c080912200a0afffe2d696e76616c69641208656467655f727463181420042880c49fd50c5a046e6f64656804",
		},
		{
			name: "UpstreamMetadata",
			in: &iscp2v1.UpstreamMetadata{
				RequestId: 1,
				Metadata:  &iscp2v1.UpstreamMetadata_BaseTime{BaseTime: baseTime},
			},
			gogo: func() gogoMessage { return &gogofast.UpstreamMetadata{} },
			want: "080112200a0afffe2d696e76616c69641208656467655f727463181420042880c49fd50c",
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got, err := tt.in.MarshalVTStrict()
			if err != nil {
				t.Fatal(err)
			}
			g := tt.gogo()
			if err := g.Unmarshal(got); err != nil {
				t.Fatalf("gogofast Unmarshal: %v", err)
			}
			want, err := g.Marshal()
			if err != nil {
				t.Fatal(err)
			}
			if !bytes.Equal(want, got) {
				t.Fatalf("MarshalVTStrict differs from gogofast\n got: %x\nwant: %x", got, want)
			}
			fixed := mustDecodeHex(t, tt.want)
			if !bytes.Equal(fixed, want) {
				t.Fatalf("fixed value differs from gogofast\nfixed: %x\n gogo: %x", fixed, want)
			}

			decoded := tt.in.ProtoReflect().New().Interface().(vtMessage)
			if err := decoded.UnmarshalVT(fixed); err != nil {
				t.Fatalf("UnmarshalVT: %v", err)
			}
			if !proto.Equal(tt.in, decoded) {
				t.Fatalf("round trip differs\n got: %v\nwant: %v", decoded, tt.in)
			}
		})
	}
}

// The round trip above cannot catch differences that gogofast normalizes on
// decode, so compare against a value built directly with the gogofast types.
func TestMarshalVTStrictMatchesIndependentGogofastValue(t *testing.T) {
	vt := &iscp2v1.DownstreamMetadata{
		RequestId:     9,
		StreamIdAlias: 4,
		Metadata:      &iscp2v1.DownstreamMetadata_BaseTime{BaseTime: &iscp2v1.BaseTime{SessionId: invalidUTF8, Name: "edge_rtc", Priority: 20, ElapsedTime: 4, BaseTime: 1700000000}},
		SourceNodeId:  "node",
	}
	gogo := &gogofast.DownstreamMetadata{
		RequestId:     9,
		StreamIdAlias: 4,
		Metadata:      &gogofast.DownstreamMetadata_BaseTime{BaseTime: &gogofast.BaseTime{SessionId: invalidUTF8, Name: "edge_rtc", Priority: 20, ElapsedTime: 4, BaseTime: 1700000000}},
		SourceNodeId:  "node",
	}
	got, err := vt.MarshalVTStrict()
	if err != nil {
		t.Fatal(err)
	}
	want, err := gogo.Marshal()
	if err != nil {
		t.Fatal(err)
	}
	if !bytes.Equal(want, got) {
		t.Fatalf("MarshalVTStrict differs from gogofast\n got: %x\nwant: %x", got, want)
	}
	fixed := mustDecodeHex(t, "080912200a0afffe2d696e76616c69641208656467655f727463181420042880c49fd50c5a046e6f64656804")
	if !bytes.Equal(fixed, want) {
		t.Fatalf("fixed value differs from gogofast\nfixed: %x\n gogo: %x", fixed, want)
	}
}

func mustDecodeHex(t *testing.T, s string) []byte {
	t.Helper()
	b, err := hex.DecodeString(s)
	if err != nil {
		t.Fatal(err)
	}
	return b
}
