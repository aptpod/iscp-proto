// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: iscp2/v1/extensions/ping_pong.proto

package extensions

import (
	fmt "fmt"
	proto "github.com/gogo/protobuf/proto"
	io "io"
	math "math"
	math_bits "math/bits"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.GoGoProtoPackageIsVersion3 // please upgrade the proto package

type PingExtensionFields struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *PingExtensionFields) Reset()         { *m = PingExtensionFields{} }
func (m *PingExtensionFields) String() string { return proto.CompactTextString(m) }
func (*PingExtensionFields) ProtoMessage()    {}
func (*PingExtensionFields) Descriptor() ([]byte, []int) {
	return fileDescriptor_c52ad60b58ea2a61, []int{0}
}
func (m *PingExtensionFields) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *PingExtensionFields) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_PingExtensionFields.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *PingExtensionFields) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PingExtensionFields.Merge(m, src)
}
func (m *PingExtensionFields) XXX_Size() int {
	return m.Size()
}
func (m *PingExtensionFields) XXX_DiscardUnknown() {
	xxx_messageInfo_PingExtensionFields.DiscardUnknown(m)
}

var xxx_messageInfo_PingExtensionFields proto.InternalMessageInfo

type PongExtensionFields struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *PongExtensionFields) Reset()         { *m = PongExtensionFields{} }
func (m *PongExtensionFields) String() string { return proto.CompactTextString(m) }
func (*PongExtensionFields) ProtoMessage()    {}
func (*PongExtensionFields) Descriptor() ([]byte, []int) {
	return fileDescriptor_c52ad60b58ea2a61, []int{1}
}
func (m *PongExtensionFields) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *PongExtensionFields) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_PongExtensionFields.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *PongExtensionFields) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PongExtensionFields.Merge(m, src)
}
func (m *PongExtensionFields) XXX_Size() int {
	return m.Size()
}
func (m *PongExtensionFields) XXX_DiscardUnknown() {
	xxx_messageInfo_PongExtensionFields.DiscardUnknown(m)
}

var xxx_messageInfo_PongExtensionFields proto.InternalMessageInfo

func init() {
	proto.RegisterType((*PingExtensionFields)(nil), "iscp2.v1.extensions.PingExtensionFields")
	proto.RegisterType((*PongExtensionFields)(nil), "iscp2.v1.extensions.PongExtensionFields")
}

func init() {
	proto.RegisterFile("iscp2/v1/extensions/ping_pong.proto", fileDescriptor_c52ad60b58ea2a61)
}

var fileDescriptor_c52ad60b58ea2a61 = []byte{
	// 232 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0xce, 0x2c, 0x4e, 0x2e,
	0x30, 0xd2, 0x2f, 0x33, 0xd4, 0x4f, 0xad, 0x28, 0x49, 0xcd, 0x2b, 0xce, 0xcc, 0xcf, 0x2b, 0xd6,
	0x2f, 0xc8, 0xcc, 0x4b, 0x8f, 0x2f, 0xc8, 0xcf, 0x4b, 0xd7, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17,
	0x12, 0x06, 0x2b, 0xd2, 0x2b, 0x33, 0xd4, 0x43, 0x28, 0x52, 0x12, 0xe5, 0x12, 0x0e, 0xc8, 0xcc,
	0x4b, 0x77, 0x85, 0x89, 0xb8, 0x65, 0xa6, 0xe6, 0xa4, 0x40, 0x84, 0xf3, 0x31, 0x84, 0x9d, 0x1e,
	0x32, 0x9e, 0x78, 0x24, 0xc7, 0x78, 0xe1, 0x91, 0x1c, 0xe3, 0x83, 0x47, 0x72, 0x8c, 0x5c, 0xe2,
	0xc9, 0xf9, 0xb9, 0x7a, 0x58, 0x4c, 0x75, 0xe2, 0x05, 0x99, 0x09, 0x32, 0x20, 0x00, 0x64, 0x73,
	0x00, 0x63, 0x94, 0x6d, 0x7a, 0x66, 0x49, 0x46, 0x69, 0x92, 0x5e, 0x72, 0x7e, 0xae, 0x7e, 0x62,
	0x41, 0x49, 0x41, 0x7e, 0x8a, 0x3e, 0x48, 0x9f, 0x2e, 0xd8, 0x65, 0xfa, 0xe9, 0xa9, 0x79, 0xfa,
	0xe9, 0xf9, 0xe9, 0xf9, 0x69, 0x89, 0xc5, 0x25, 0xfa, 0x58, 0xbc, 0xb2, 0x88, 0x89, 0xd9, 0x33,
	0xcc, 0x75, 0x15, 0x93, 0xb0, 0x27, 0xd8, 0xae, 0x30, 0x43, 0x3d, 0xb8, 0xc3, 0x8a, 0x4f, 0x41,
	0x45, 0x63, 0xc2, 0x0c, 0x63, 0x10, 0xa2, 0x8f, 0x98, 0xe4, 0xb1, 0x88, 0xc6, 0xb8, 0x07, 0x38,
	0xf9, 0xa6, 0x96, 0x24, 0xa6, 0x24, 0x96, 0x24, 0xbe, 0x62, 0x12, 0x05, 0xab, 0xb0, 0xb2, 0x0a,
	0x33, 0xb4, 0xb2, 0x42, 0xa8, 0x49, 0x62, 0x03, 0xbb, 0xc9, 0x18, 0x10, 0x00, 0x00, 0xff, 0xff,
	0x28, 0xeb, 0x88, 0x06, 0x54, 0x01, 0x00, 0x00,
}

func (m *PingExtensionFields) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *PingExtensionFields) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *PingExtensionFields) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if m.XXX_unrecognized != nil {
		i -= len(m.XXX_unrecognized)
		copy(dAtA[i:], m.XXX_unrecognized)
	}
	return len(dAtA) - i, nil
}

func (m *PongExtensionFields) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *PongExtensionFields) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *PongExtensionFields) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if m.XXX_unrecognized != nil {
		i -= len(m.XXX_unrecognized)
		copy(dAtA[i:], m.XXX_unrecognized)
	}
	return len(dAtA) - i, nil
}

func encodeVarintPingPong(dAtA []byte, offset int, v uint64) int {
	offset -= sovPingPong(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *PingExtensionFields) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.XXX_unrecognized != nil {
		n += len(m.XXX_unrecognized)
	}
	return n
}

func (m *PongExtensionFields) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.XXX_unrecognized != nil {
		n += len(m.XXX_unrecognized)
	}
	return n
}

func sovPingPong(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozPingPong(x uint64) (n int) {
	return sovPingPong(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *PingExtensionFields) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowPingPong
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: PingExtensionFields: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: PingExtensionFields: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		default:
			iNdEx = preIndex
			skippy, err := skipPingPong(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthPingPong
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			m.XXX_unrecognized = append(m.XXX_unrecognized, dAtA[iNdEx:iNdEx+skippy]...)
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *PongExtensionFields) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowPingPong
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: PongExtensionFields: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: PongExtensionFields: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		default:
			iNdEx = preIndex
			skippy, err := skipPingPong(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if (skippy < 0) || (iNdEx+skippy) < 0 {
				return ErrInvalidLengthPingPong
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			m.XXX_unrecognized = append(m.XXX_unrecognized, dAtA[iNdEx:iNdEx+skippy]...)
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func skipPingPong(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowPingPong
			}
			if iNdEx >= l {
				return 0, io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= (uint64(b) & 0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		wireType := int(wire & 0x7)
		switch wireType {
		case 0:
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowPingPong
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				iNdEx++
				if dAtA[iNdEx-1] < 0x80 {
					break
				}
			}
		case 1:
			iNdEx += 8
		case 2:
			var length int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowPingPong
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				length |= (int(b) & 0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if length < 0 {
				return 0, ErrInvalidLengthPingPong
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupPingPong
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthPingPong
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthPingPong        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowPingPong          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupPingPong = fmt.Errorf("proto: unexpected end of group")
)
