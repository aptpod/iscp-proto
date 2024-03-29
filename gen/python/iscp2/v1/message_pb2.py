# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: iscp2/v1/message.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from iscp2.v1 import connection_pb2 as iscp2_dot_v1_dot_connection__pb2
from iscp2.v1 import downstream_pb2 as iscp2_dot_v1_dot_downstream__pb2
from iscp2.v1 import e2e_call_pb2 as iscp2_dot_v1_dot_e2e__call__pb2
from iscp2.v1 import ping_pong_pb2 as iscp2_dot_v1_dot_ping__pong__pb2
from iscp2.v1 import upstream_pb2 as iscp2_dot_v1_dot_upstream__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16iscp2/v1/message.proto\x12\x08iscp2.v1\x1a\x19iscp2/v1/connection.proto\x1a\x19iscp2/v1/downstream.proto\x1a\x17iscp2/v1/e2e_call.proto\x1a\x18iscp2/v1/ping_pong.proto\x1a\x17iscp2/v1/upstream.proto\"\xb7\x12\n\x07Message\x12\x43\n\x0f\x63onnect_request\x18\x01 \x01(\x0b\x32\x18.iscp2.v1.ConnectRequestH\x00R\x0e\x63onnectRequest\x12\x46\n\x10\x63onnect_response\x18\x02 \x01(\x0b\x32\x19.iscp2.v1.ConnectResponseH\x00R\x0f\x63onnectResponse\x12\x36\n\ndisconnect\x18\x03 \x01(\x0b\x32\x14.iscp2.v1.DisconnectH\x00R\ndisconnect\x12S\n\x15upstream_open_request\x18@ \x01(\x0b\x32\x1d.iscp2.v1.UpstreamOpenRequestH\x00R\x13upstreamOpenRequest\x12V\n\x16upstream_open_response\x18\x41 \x01(\x0b\x32\x1e.iscp2.v1.UpstreamOpenResponseH\x00R\x14upstreamOpenResponse\x12Y\n\x17upstream_resume_request\x18\x42 \x01(\x0b\x32\x1f.iscp2.v1.UpstreamResumeRequestH\x00R\x15upstreamResumeRequest\x12\\\n\x18upstream_resume_response\x18\x43 \x01(\x0b\x32 .iscp2.v1.UpstreamResumeResponseH\x00R\x16upstreamResumeResponse\x12V\n\x16upstream_close_request\x18\x44 \x01(\x0b\x32\x1e.iscp2.v1.UpstreamCloseRequestH\x00R\x14upstreamCloseRequest\x12Y\n\x17upstream_close_response\x18\x45 \x01(\x0b\x32\x1f.iscp2.v1.UpstreamCloseResponseH\x00R\x15upstreamCloseResponse\x12@\n\x0eupstream_chunk\x18\x46 \x01(\x0b\x32\x17.iscp2.v1.UpstreamChunkH\x00R\rupstreamChunk\x12J\n\x12upstream_chunk_ack\x18G \x01(\x0b\x32\x1a.iscp2.v1.UpstreamChunkAckH\x00R\x10upstreamChunkAck\x12I\n\x11upstream_metadata\x18H \x01(\x0b\x32\x1a.iscp2.v1.UpstreamMetadataH\x00R\x10upstreamMetadata\x12S\n\x15upstream_metadata_ack\x18I \x01(\x0b\x32\x1d.iscp2.v1.UpstreamMetadataAckH\x00R\x13upstreamMetadataAck\x12Z\n\x17\x64ownstream_open_request\x18\x80\x01 \x01(\x0b\x32\x1f.iscp2.v1.DownstreamOpenRequestH\x00R\x15\x64ownstreamOpenRequest\x12]\n\x18\x64ownstream_open_response\x18\x81\x01 \x01(\x0b\x32 .iscp2.v1.DownstreamOpenResponseH\x00R\x16\x64ownstreamOpenResponse\x12`\n\x19\x64ownstream_resume_request\x18\x82\x01 \x01(\x0b\x32!.iscp2.v1.DownstreamResumeRequestH\x00R\x17\x64ownstreamResumeRequest\x12\x63\n\x1a\x64ownstream_resume_response\x18\x83\x01 \x01(\x0b\x32\".iscp2.v1.DownstreamResumeResponseH\x00R\x18\x64ownstreamResumeResponse\x12]\n\x18\x64ownstream_close_request\x18\x84\x01 \x01(\x0b\x32 .iscp2.v1.DownstreamCloseRequestH\x00R\x16\x64ownstreamCloseRequest\x12`\n\x19\x64ownstream_close_response\x18\x85\x01 \x01(\x0b\x32!.iscp2.v1.DownstreamCloseResponseH\x00R\x17\x64ownstreamCloseResponse\x12G\n\x10\x64ownstream_chunk\x18\x86\x01 \x01(\x0b\x32\x19.iscp2.v1.DownstreamChunkH\x00R\x0f\x64ownstreamChunk\x12Q\n\x14\x64ownstream_chunk_ack\x18\x87\x01 \x01(\x0b\x32\x1c.iscp2.v1.DownstreamChunkAckH\x00R\x12\x64ownstreamChunkAck\x12j\n\x1d\x64ownstream_chunk_ack_complete\x18\x88\x01 \x01(\x0b\x32$.iscp2.v1.DownstreamChunkAckCompleteH\x00R\x1a\x64ownstreamChunkAckComplete\x12P\n\x13\x64ownstream_metadata\x18\x89\x01 \x01(\x0b\x32\x1c.iscp2.v1.DownstreamMetadataH\x00R\x12\x64ownstreamMetadata\x12Z\n\x17\x64ownstream_metadata_ack\x18\x8a\x01 \x01(\x0b\x32\x1f.iscp2.v1.DownstreamMetadataAckH\x00R\x15\x64ownstreamMetadataAck\x12%\n\x04ping\x18\xc0\x01 \x01(\x0b\x32\x0e.iscp2.v1.PingH\x00R\x04ping\x12%\n\x04pong\x18\xc1\x01 \x01(\x0b\x32\x0e.iscp2.v1.PongH\x00R\x04pong\x12>\n\rupstream_call\x18\x80\x02 \x01(\x0b\x32\x16.iscp2.v1.UpstreamCallH\x00R\x0cupstreamCall\x12H\n\x11upstream_call_ack\x18\x81\x02 \x01(\x0b\x32\x19.iscp2.v1.UpstreamCallAckH\x00R\x0fupstreamCallAck\x12\x44\n\x0f\x64ownstream_call\x18\x82\x02 \x01(\x0b\x32\x18.iscp2.v1.DownstreamCallH\x00R\x0e\x64ownstreamCallB\t\n\x07messageB\xa7\x01\n com.github.aptpod.proto.iscp2.v1B\x0cMessageProtoP\x01Z4github.com/aptpod/iscp-proto/gen/go/iscp2/v1;iscp2v1\xa2\x02\x03IXX\xaa\x02\x08Iscp2.V1\xca\x02\x08Iscp2\\V1\xe2\x02\x14Iscp2\\V1\\GPBMetadata\xea\x02\tIscp2::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'iscp2.v1.message_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.github.aptpod.proto.iscp2.v1B\014MessageProtoP\001Z4github.com/aptpod/iscp-proto/gen/go/iscp2/v1;iscp2v1\242\002\003IXX\252\002\010Iscp2.V1\312\002\010Iscp2\\V1\342\002\024Iscp2\\V1\\GPBMetadata\352\002\tIscp2::V1'
  _globals['_MESSAGE']._serialized_start=167
  _globals['_MESSAGE']._serialized_end=2526
# @@protoc_insertion_point(module_scope)
