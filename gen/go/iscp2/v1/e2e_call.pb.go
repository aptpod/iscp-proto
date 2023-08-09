// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        (unknown)
// source: iscp2/v1/e2e_call.proto

package iscp2v1

import (
	extensions "github.com/aptpod/iscp-proto/gen/go/iscp2/v1/extensions"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type UpstreamCall struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	CallId            string                                  `protobuf:"bytes,1,opt,name=call_id,json=callId,proto3" json:"call_id,omitempty"`
	RequestCallId     string                                  `protobuf:"bytes,2,opt,name=request_call_id,json=requestCallId,proto3" json:"request_call_id,omitempty"`
	DestinationNodeId string                                  `protobuf:"bytes,3,opt,name=destination_node_id,json=destinationNodeId,proto3" json:"destination_node_id,omitempty"`
	Name              string                                  `protobuf:"bytes,4,opt,name=name,proto3" json:"name,omitempty"`
	Type              string                                  `protobuf:"bytes,5,opt,name=type,proto3" json:"type,omitempty"`
	Payload           []byte                                  `protobuf:"bytes,6,opt,name=payload,proto3" json:"payload,omitempty"`
	ExtensionFields   *extensions.UpstreamCallExtensionFields `protobuf:"bytes,7,opt,name=extension_fields,json=extensionFields,proto3" json:"extension_fields,omitempty"`
}

func (x *UpstreamCall) Reset() {
	*x = UpstreamCall{}
	if protoimpl.UnsafeEnabled {
		mi := &file_iscp2_v1_e2e_call_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpstreamCall) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpstreamCall) ProtoMessage() {}

func (x *UpstreamCall) ProtoReflect() protoreflect.Message {
	mi := &file_iscp2_v1_e2e_call_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpstreamCall.ProtoReflect.Descriptor instead.
func (*UpstreamCall) Descriptor() ([]byte, []int) {
	return file_iscp2_v1_e2e_call_proto_rawDescGZIP(), []int{0}
}

func (x *UpstreamCall) GetCallId() string {
	if x != nil {
		return x.CallId
	}
	return ""
}

func (x *UpstreamCall) GetRequestCallId() string {
	if x != nil {
		return x.RequestCallId
	}
	return ""
}

func (x *UpstreamCall) GetDestinationNodeId() string {
	if x != nil {
		return x.DestinationNodeId
	}
	return ""
}

func (x *UpstreamCall) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *UpstreamCall) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *UpstreamCall) GetPayload() []byte {
	if x != nil {
		return x.Payload
	}
	return nil
}

func (x *UpstreamCall) GetExtensionFields() *extensions.UpstreamCallExtensionFields {
	if x != nil {
		return x.ExtensionFields
	}
	return nil
}

type UpstreamCallAck struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	CallId          string                                     `protobuf:"bytes,1,opt,name=call_id,json=callId,proto3" json:"call_id,omitempty"`
	ResultCode      ResultCode                                 `protobuf:"varint,2,opt,name=result_code,json=resultCode,proto3,enum=iscp2.v1.ResultCode" json:"result_code,omitempty"`
	ResultString    string                                     `protobuf:"bytes,3,opt,name=result_string,json=resultString,proto3" json:"result_string,omitempty"`
	ExtensionFields *extensions.UpstreamCallAckExtensionFields `protobuf:"bytes,4,opt,name=extension_fields,json=extensionFields,proto3" json:"extension_fields,omitempty"`
}

func (x *UpstreamCallAck) Reset() {
	*x = UpstreamCallAck{}
	if protoimpl.UnsafeEnabled {
		mi := &file_iscp2_v1_e2e_call_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpstreamCallAck) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpstreamCallAck) ProtoMessage() {}

func (x *UpstreamCallAck) ProtoReflect() protoreflect.Message {
	mi := &file_iscp2_v1_e2e_call_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpstreamCallAck.ProtoReflect.Descriptor instead.
func (*UpstreamCallAck) Descriptor() ([]byte, []int) {
	return file_iscp2_v1_e2e_call_proto_rawDescGZIP(), []int{1}
}

func (x *UpstreamCallAck) GetCallId() string {
	if x != nil {
		return x.CallId
	}
	return ""
}

func (x *UpstreamCallAck) GetResultCode() ResultCode {
	if x != nil {
		return x.ResultCode
	}
	return ResultCode_SUCCEEDED
}

func (x *UpstreamCallAck) GetResultString() string {
	if x != nil {
		return x.ResultString
	}
	return ""
}

func (x *UpstreamCallAck) GetExtensionFields() *extensions.UpstreamCallAckExtensionFields {
	if x != nil {
		return x.ExtensionFields
	}
	return nil
}

type DownstreamCall struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	CallId          string                                    `protobuf:"bytes,1,opt,name=call_id,json=callId,proto3" json:"call_id,omitempty"`
	RequestCallId   string                                    `protobuf:"bytes,2,opt,name=request_call_id,json=requestCallId,proto3" json:"request_call_id,omitempty"`
	SourceNodeId    string                                    `protobuf:"bytes,3,opt,name=source_node_id,json=sourceNodeId,proto3" json:"source_node_id,omitempty"`
	Name            string                                    `protobuf:"bytes,4,opt,name=name,proto3" json:"name,omitempty"`
	Type            string                                    `protobuf:"bytes,5,opt,name=type,proto3" json:"type,omitempty"`
	Payload         []byte                                    `protobuf:"bytes,6,opt,name=payload,proto3" json:"payload,omitempty"`
	ExtensionFields *extensions.DownstreamCallExtensionFields `protobuf:"bytes,7,opt,name=extension_fields,json=extensionFields,proto3" json:"extension_fields,omitempty"`
}

func (x *DownstreamCall) Reset() {
	*x = DownstreamCall{}
	if protoimpl.UnsafeEnabled {
		mi := &file_iscp2_v1_e2e_call_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DownstreamCall) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DownstreamCall) ProtoMessage() {}

func (x *DownstreamCall) ProtoReflect() protoreflect.Message {
	mi := &file_iscp2_v1_e2e_call_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DownstreamCall.ProtoReflect.Descriptor instead.
func (*DownstreamCall) Descriptor() ([]byte, []int) {
	return file_iscp2_v1_e2e_call_proto_rawDescGZIP(), []int{2}
}

func (x *DownstreamCall) GetCallId() string {
	if x != nil {
		return x.CallId
	}
	return ""
}

func (x *DownstreamCall) GetRequestCallId() string {
	if x != nil {
		return x.RequestCallId
	}
	return ""
}

func (x *DownstreamCall) GetSourceNodeId() string {
	if x != nil {
		return x.SourceNodeId
	}
	return ""
}

func (x *DownstreamCall) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *DownstreamCall) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *DownstreamCall) GetPayload() []byte {
	if x != nil {
		return x.Payload
	}
	return nil
}

func (x *DownstreamCall) GetExtensionFields() *extensions.DownstreamCallExtensionFields {
	if x != nil {
		return x.ExtensionFields
	}
	return nil
}

var File_iscp2_v1_e2e_call_proto protoreflect.FileDescriptor

var file_iscp2_v1_e2e_call_proto_rawDesc = []byte{
	0x0a, 0x17, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2f, 0x76, 0x31, 0x2f, 0x65, 0x32, 0x65, 0x5f, 0x63,
	0x61, 0x6c, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x69, 0x73, 0x63, 0x70, 0x32,
	0x2e, 0x76, 0x31, 0x1a, 0x22, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2f, 0x76, 0x31, 0x2f, 0x65, 0x78,
	0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x65, 0x32, 0x65, 0x5f, 0x63, 0x61, 0x6c,
	0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1a, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2f, 0x76,
	0x31, 0x2f, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0x9e, 0x02, 0x0a, 0x0c, 0x55, 0x70, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x43, 0x61, 0x6c, 0x6c, 0x12, 0x17, 0x0a, 0x07, 0x63, 0x61, 0x6c, 0x6c, 0x5f, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x63, 0x61, 0x6c, 0x6c, 0x49, 0x64, 0x12, 0x26, 0x0a,
	0x0f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x63, 0x61, 0x6c, 0x6c, 0x5f, 0x69, 0x64,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x43,
	0x61, 0x6c, 0x6c, 0x49, 0x64, 0x12, 0x2e, 0x0a, 0x13, 0x64, 0x65, 0x73, 0x74, 0x69, 0x6e, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x6e, 0x6f, 0x64, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x11, 0x64, 0x65, 0x73, 0x74, 0x69, 0x6e, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x4e,
	0x6f, 0x64, 0x65, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x79, 0x70,
	0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x18, 0x0a,
	0x07, 0x70, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x07,
	0x70, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x12, 0x5b, 0x0a, 0x10, 0x65, 0x78, 0x74, 0x65, 0x6e,
	0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x30, 0x2e, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2e, 0x76, 0x31, 0x2e, 0x65, 0x78, 0x74,
	0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x55, 0x70, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x43, 0x61, 0x6c, 0x6c, 0x45, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x46, 0x69, 0x65,
	0x6c, 0x64, 0x73, 0x52, 0x0f, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x46, 0x69,
	0x65, 0x6c, 0x64, 0x73, 0x22, 0xe6, 0x01, 0x0a, 0x0f, 0x55, 0x70, 0x73, 0x74, 0x72, 0x65, 0x61,
	0x6d, 0x43, 0x61, 0x6c, 0x6c, 0x41, 0x63, 0x6b, 0x12, 0x17, 0x0a, 0x07, 0x63, 0x61, 0x6c, 0x6c,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x63, 0x61, 0x6c, 0x6c, 0x49,
	0x64, 0x12, 0x35, 0x0a, 0x0b, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x5f, 0x63, 0x6f, 0x64, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x14, 0x2e, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2e, 0x76,
	0x31, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x43, 0x6f, 0x64, 0x65, 0x52, 0x0a, 0x72, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x23, 0x0a, 0x0d, 0x72, 0x65, 0x73, 0x75,
	0x6c, 0x74, 0x5f, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0c, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x12, 0x5e, 0x0a,
	0x10, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64,
	0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x33, 0x2e, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2e,
	0x76, 0x31, 0x2e, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x55, 0x70,
	0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x43, 0x61, 0x6c, 0x6c, 0x41, 0x63, 0x6b, 0x45, 0x78, 0x74,
	0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x52, 0x0f, 0x65, 0x78,
	0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x22, 0x98, 0x02,
	0x0a, 0x0e, 0x44, 0x6f, 0x77, 0x6e, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x43, 0x61, 0x6c, 0x6c,
	0x12, 0x17, 0x0a, 0x07, 0x63, 0x61, 0x6c, 0x6c, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x06, 0x63, 0x61, 0x6c, 0x6c, 0x49, 0x64, 0x12, 0x26, 0x0a, 0x0f, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x5f, 0x63, 0x61, 0x6c, 0x6c, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0d, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x43, 0x61, 0x6c, 0x6c, 0x49,
	0x64, 0x12, 0x24, 0x0a, 0x0e, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x6e, 0x6f, 0x64, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x4e, 0x6f, 0x64, 0x65, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74,
	0x79, 0x70, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12,
	0x18, 0x0a, 0x07, 0x70, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0c,
	0x52, 0x07, 0x70, 0x61, 0x79, 0x6c, 0x6f, 0x61, 0x64, 0x12, 0x5d, 0x0a, 0x10, 0x65, 0x78, 0x74,
	0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x32, 0x2e, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2e, 0x76, 0x31, 0x2e, 0x65,
	0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x44, 0x6f, 0x77, 0x6e, 0x73, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x43, 0x61, 0x6c, 0x6c, 0x45, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69, 0x6f,
	0x6e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x52, 0x0f, 0x65, 0x78, 0x74, 0x65, 0x6e, 0x73, 0x69,
	0x6f, 0x6e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x42, 0xa7, 0x01, 0x0a, 0x20, 0x63, 0x6f, 0x6d,
	0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x61, 0x70, 0x74, 0x70, 0x6f, 0x64, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2e, 0x76, 0x31, 0x42, 0x0c, 0x45,
	0x32, 0x65, 0x43, 0x61, 0x6c, 0x6c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x34, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x61, 0x70, 0x74, 0x70, 0x6f, 0x64,
	0x2f, 0x69, 0x73, 0x63, 0x70, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x65, 0x6e, 0x2f,
	0x67, 0x6f, 0x2f, 0x69, 0x73, 0x63, 0x70, 0x32, 0x2f, 0x76, 0x31, 0x3b, 0x69, 0x73, 0x63, 0x70,
	0x32, 0x76, 0x31, 0xa2, 0x02, 0x03, 0x49, 0x58, 0x58, 0xaa, 0x02, 0x08, 0x49, 0x73, 0x63, 0x70,
	0x32, 0x2e, 0x56, 0x31, 0xca, 0x02, 0x08, 0x49, 0x73, 0x63, 0x70, 0x32, 0x5c, 0x56, 0x31, 0xe2,
	0x02, 0x14, 0x49, 0x73, 0x63, 0x70, 0x32, 0x5c, 0x56, 0x31, 0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65,
	0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x09, 0x49, 0x73, 0x63, 0x70, 0x32, 0x3a, 0x3a,
	0x56, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_iscp2_v1_e2e_call_proto_rawDescOnce sync.Once
	file_iscp2_v1_e2e_call_proto_rawDescData = file_iscp2_v1_e2e_call_proto_rawDesc
)

func file_iscp2_v1_e2e_call_proto_rawDescGZIP() []byte {
	file_iscp2_v1_e2e_call_proto_rawDescOnce.Do(func() {
		file_iscp2_v1_e2e_call_proto_rawDescData = protoimpl.X.CompressGZIP(file_iscp2_v1_e2e_call_proto_rawDescData)
	})
	return file_iscp2_v1_e2e_call_proto_rawDescData
}

var file_iscp2_v1_e2e_call_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_iscp2_v1_e2e_call_proto_goTypes = []interface{}{
	(*UpstreamCall)(nil),                              // 0: iscp2.v1.UpstreamCall
	(*UpstreamCallAck)(nil),                           // 1: iscp2.v1.UpstreamCallAck
	(*DownstreamCall)(nil),                            // 2: iscp2.v1.DownstreamCall
	(*extensions.UpstreamCallExtensionFields)(nil),    // 3: iscp2.v1.extensions.UpstreamCallExtensionFields
	(ResultCode)(0),                                   // 4: iscp2.v1.ResultCode
	(*extensions.UpstreamCallAckExtensionFields)(nil), // 5: iscp2.v1.extensions.UpstreamCallAckExtensionFields
	(*extensions.DownstreamCallExtensionFields)(nil),  // 6: iscp2.v1.extensions.DownstreamCallExtensionFields
}
var file_iscp2_v1_e2e_call_proto_depIdxs = []int32{
	3, // 0: iscp2.v1.UpstreamCall.extension_fields:type_name -> iscp2.v1.extensions.UpstreamCallExtensionFields
	4, // 1: iscp2.v1.UpstreamCallAck.result_code:type_name -> iscp2.v1.ResultCode
	5, // 2: iscp2.v1.UpstreamCallAck.extension_fields:type_name -> iscp2.v1.extensions.UpstreamCallAckExtensionFields
	6, // 3: iscp2.v1.DownstreamCall.extension_fields:type_name -> iscp2.v1.extensions.DownstreamCallExtensionFields
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_iscp2_v1_e2e_call_proto_init() }
func file_iscp2_v1_e2e_call_proto_init() {
	if File_iscp2_v1_e2e_call_proto != nil {
		return
	}
	file_iscp2_v1_result_code_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_iscp2_v1_e2e_call_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpstreamCall); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_iscp2_v1_e2e_call_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpstreamCallAck); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_iscp2_v1_e2e_call_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DownstreamCall); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_iscp2_v1_e2e_call_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_iscp2_v1_e2e_call_proto_goTypes,
		DependencyIndexes: file_iscp2_v1_e2e_call_proto_depIdxs,
		MessageInfos:      file_iscp2_v1_e2e_call_proto_msgTypes,
	}.Build()
	File_iscp2_v1_e2e_call_proto = out.File
	file_iscp2_v1_e2e_call_proto_rawDesc = nil
	file_iscp2_v1_e2e_call_proto_goTypes = nil
	file_iscp2_v1_e2e_call_proto_depIdxs = nil
}