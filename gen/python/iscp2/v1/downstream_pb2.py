# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: iscp2/v1/downstream.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from iscp2.v1 import common_pb2 as iscp2_dot_v1_dot_common__pb2
from iscp2.v1.extensions import downstream_pb2 as iscp2_dot_v1_dot_extensions_dot_downstream__pb2
from iscp2.v1 import metadata_pb2 as iscp2_dot_v1_dot_metadata__pb2
from iscp2.v1 import result_code_pb2 as iscp2_dot_v1_dot_result__code__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19iscp2/v1/downstream.proto\x12\x08iscp2.v1\x1a\x15iscp2/v1/common.proto\x1a$iscp2/v1/extensions/downstream.proto\x1a\x17iscp2/v1/metadata.proto\x1a\x1aiscp2/v1/result_code.proto\"\xc2\x04\n\x15\x44ownstreamOpenRequest\x12\x1d\n\nrequest_id\x18\x01 \x01(\rR\trequestId\x12\x35\n\x17\x64\x65sired_stream_id_alias\x18\x02 \x01(\rR\x14\x64\x65siredStreamIdAlias\x12I\n\x12\x64ownstream_filters\x18\x03 \x03(\x0b\x32\x1a.iscp2.v1.DownstreamFilterR\x11\x64ownstreamFilters\x12\'\n\x0f\x65xpiry_interval\x18\x04 \x01(\rR\x0e\x65xpiryInterval\x12Z\n\x0f\x64\x61ta_id_aliases\x18\x05 \x03(\x0b\x32\x32.iscp2.v1.DownstreamOpenRequest.DataIdAliasesEntryR\rdataIdAliases\x12\x1f\n\x03qos\x18\x06 \x01(\x0e\x32\r.iscp2.v1.QoSR\x03qos\x12\x64\n\x10\x65xtension_fields\x18\x07 \x01(\x0b\x32\x39.iscp2.v1.extensions.DownstreamOpenRequestExtensionFieldsR\x0f\x65xtensionFields\x12(\n\x10omit_empty_chunk\x18\x08 \x01(\x08R\x0eomitEmptyChunk\x1aR\n\x12\x44\x61taIdAliasesEntry\x12\x10\n\x03key\x18\x01 \x01(\rR\x03key\x12&\n\x05value\x18\x02 \x01(\x0b\x32\x10.iscp2.v1.DataIDR\x05value:\x02\x38\x01\"\xc9\x02\n\x16\x44ownstreamOpenResponse\x12\x1d\n\nrequest_id\x18\x01 \x01(\rR\trequestId\x12,\n\x12\x61ssigned_stream_id\x18\x02 \x01(\x0cR\x10\x61ssignedStreamId\x12\x1f\n\x0bserver_time\x18\x03 \x01(\x12R\nserverTime\x12\x35\n\x0bresult_code\x18\x04 \x01(\x0e\x32\x14.iscp2.v1.ResultCodeR\nresultCode\x12#\n\rresult_string\x18\x05 \x01(\tR\x0cresultString\x12\x65\n\x10\x65xtension_fields\x18\x06 \x01(\x0b\x32:.iscp2.v1.extensions.DownstreamOpenResponseExtensionFieldsR\x0f\x65xtensionFields\"\xf4\x01\n\x17\x44ownstreamResumeRequest\x12\x1d\n\nrequest_id\x18\x01 \x01(\rR\trequestId\x12\x1b\n\tstream_id\x18\x02 \x01(\x0cR\x08streamId\x12\x35\n\x17\x64\x65sired_stream_id_alias\x18\x03 \x01(\rR\x14\x64\x65siredStreamIdAlias\x12\x66\n\x10\x65xtension_fields\x18\x04 \x01(\x0b\x32;.iscp2.v1.extensions.DownstreamResumeRequestExtensionFieldsR\x0f\x65xtensionFields\"\xfe\x01\n\x18\x44ownstreamResumeResponse\x12\x1d\n\nrequest_id\x18\x01 \x01(\rR\trequestId\x12\x35\n\x0bresult_code\x18\x02 \x01(\x0e\x32\x14.iscp2.v1.ResultCodeR\nresultCode\x12#\n\rresult_string\x18\x03 \x01(\tR\x0cresultString\x12g\n\x10\x65xtension_fields\x18\x04 \x01(\x0b\x32<.iscp2.v1.extensions.DownstreamResumeResponseExtensionFieldsR\x0f\x65xtensionFields\"\xbb\x01\n\x16\x44ownstreamCloseRequest\x12\x1d\n\nrequest_id\x18\x01 \x01(\rR\trequestId\x12\x1b\n\tstream_id\x18\x02 \x01(\x0cR\x08streamId\x12\x65\n\x10\x65xtension_fields\x18\x03 \x01(\x0b\x32:.iscp2.v1.extensions.DownstreamCloseRequestExtensionFieldsR\x0f\x65xtensionFields\"\xfc\x01\n\x17\x44ownstreamCloseResponse\x12\x1d\n\nrequest_id\x18\x01 \x01(\rR\trequestId\x12\x35\n\x0bresult_code\x18\x02 \x01(\x0e\x32\x14.iscp2.v1.ResultCodeR\nresultCode\x12#\n\rresult_string\x18\x03 \x01(\tR\x0cresultString\x12\x66\n\x10\x65xtension_fields\x18\x04 \x01(\x0b\x32;.iscp2.v1.extensions.DownstreamCloseResponseExtensionFieldsR\x0f\x65xtensionFields\"\xd0\x02\n\x0f\x44ownstreamChunk\x12&\n\x0fstream_id_alias\x18\x01 \x01(\rR\rstreamIdAlias\x12=\n\rupstream_info\x18\x02 \x01(\x0b\x32\x16.iscp2.v1.UpstreamInfoH\x00R\x0cupstreamInfo\x12\'\n\x0eupstream_alias\x18\x03 \x01(\rH\x00R\rupstreamAlias\x12\x38\n\x0cstream_chunk\x18\x04 \x01(\x0b\x32\x15.iscp2.v1.StreamChunkR\x0bstreamChunk\x12^\n\x10\x65xtension_fields\x18\x05 \x01(\x0b\x32\x33.iscp2.v1.extensions.DownstreamChunkExtensionFieldsR\x0f\x65xtensionFieldsB\x13\n\x11upstream_or_alias\"\xd8\x04\n\x12\x44ownstreamChunkAck\x12&\n\x0fstream_id_alias\x18\x01 \x01(\rR\rstreamIdAlias\x12\x15\n\x06\x61\x63k_id\x18\x02 \x01(\rR\x05\x61\x63kId\x12\x39\n\x07results\x18\x03 \x03(\x0b\x32\x1f.iscp2.v1.DownstreamChunkResultR\x07results\x12\\\n\x10upstream_aliases\x18\x04 \x03(\x0b\x32\x31.iscp2.v1.DownstreamChunkAck.UpstreamAliasesEntryR\x0fupstreamAliases\x12W\n\x0f\x64\x61ta_id_aliases\x18\x05 \x03(\x0b\x32/.iscp2.v1.DownstreamChunkAck.DataIdAliasesEntryR\rdataIdAliases\x12\x61\n\x10\x65xtension_fields\x18\x06 \x01(\x0b\x32\x36.iscp2.v1.extensions.DownstreamChunkAckExtensionFieldsR\x0f\x65xtensionFields\x1aZ\n\x14UpstreamAliasesEntry\x12\x10\n\x03key\x18\x01 \x01(\rR\x03key\x12,\n\x05value\x18\x02 \x01(\x0b\x32\x16.iscp2.v1.UpstreamInfoR\x05value:\x02\x38\x01\x1aR\n\x12\x44\x61taIdAliasesEntry\x12\x10\n\x03key\x18\x01 \x01(\rR\x03key\x12&\n\x05value\x18\x02 \x01(\x0b\x32\x10.iscp2.v1.DataIDR\x05value:\x02\x38\x01\"\xa2\x02\n\x1a\x44ownstreamChunkAckComplete\x12&\n\x0fstream_id_alias\x18\x01 \x01(\rR\rstreamIdAlias\x12\x15\n\x06\x61\x63k_id\x18\x02 \x01(\rR\x05\x61\x63kId\x12\x35\n\x0bresult_code\x18\x03 \x01(\x0e\x32\x14.iscp2.v1.ResultCodeR\nresultCode\x12#\n\rresult_string\x18\x04 \x01(\tR\x0cresultString\x12i\n\x10\x65xtension_fields\x18\x05 \x01(\x0b\x32>.iscp2.v1.extensions.DownstreamChunkAckCompleteExtensionFieldsR\x0f\x65xtensionFields\"\xa3\x07\n\x12\x44ownstreamMetadata\x12\x1d\n\nrequest_id\x18\x01 \x01(\rR\trequestId\x12&\n\x0fstream_id_alias\x18\r \x01(\rR\rstreamIdAlias\x12\x31\n\tbase_time\x18\x02 \x01(\x0b\x32\x12.iscp2.v1.BaseTimeH\x00R\x08\x62\x61seTime\x12=\n\rupstream_open\x18\x03 \x01(\x0b\x32\x16.iscp2.v1.UpstreamOpenH\x00R\x0cupstreamOpen\x12Y\n\x17upstream_abnormal_close\x18\x04 \x01(\x0b\x32\x1f.iscp2.v1.UpstreamAbnormalCloseH\x00R\x15upstreamAbnormalClose\x12\x43\n\x0fupstream_resume\x18\x05 \x01(\x0b\x32\x18.iscp2.v1.UpstreamResumeH\x00R\x0eupstreamResume\x12S\n\x15upstream_normal_close\x18\x06 \x01(\x0b\x32\x1d.iscp2.v1.UpstreamNormalCloseH\x00R\x13upstreamNormalClose\x12\x43\n\x0f\x64ownstream_open\x18\x07 \x01(\x0b\x32\x18.iscp2.v1.DownstreamOpenH\x00R\x0e\x64ownstreamOpen\x12_\n\x19\x64ownstream_abnormal_close\x18\x08 \x01(\x0b\x32!.iscp2.v1.DownstreamAbnormalCloseH\x00R\x17\x64ownstreamAbnormalClose\x12I\n\x11\x64ownstream_resume\x18\t \x01(\x0b\x32\x1a.iscp2.v1.DownstreamResumeH\x00R\x10\x64ownstreamResume\x12Y\n\x17\x64ownstream_normal_close\x18\n \x01(\x0b\x32\x1f.iscp2.v1.DownstreamNormalCloseH\x00R\x15\x64ownstreamNormalClose\x12$\n\x0esource_node_id\x18\x0b \x01(\tR\x0csourceNodeId\x12\x61\n\x10\x65xtension_fields\x18\x0c \x01(\x0b\x32\x36.iscp2.v1.extensions.DownstreamMetadataExtensionFieldsR\x0f\x65xtensionFieldsB\n\n\x08metadata\"\xf8\x01\n\x15\x44ownstreamMetadataAck\x12\x1d\n\nrequest_id\x18\x01 \x01(\rR\trequestId\x12\x35\n\x0bresult_code\x18\x02 \x01(\x0e\x32\x14.iscp2.v1.ResultCodeR\nresultCode\x12#\n\rresult_string\x18\x03 \x01(\tR\x0cresultString\x12\x64\n\x10\x65xtension_fields\x18\x04 \x01(\x0b\x32\x39.iscp2.v1.extensions.DownstreamMetadataAckExtensionFieldsR\x0f\x65xtensionFields\"p\n\x0cUpstreamInfo\x12\x1d\n\nsession_id\x18\x01 \x01(\tR\tsessionId\x12\x1b\n\tstream_id\x18\x02 \x01(\x0cR\x08streamId\x12$\n\x0esource_node_id\x18\x03 \x01(\tR\x0csourceNodeId\"\xcb\x02\n\x15\x44ownstreamChunkResult\x12\x31\n\x15stream_id_of_upstream\x18\x01 \x01(\x0cR\x12streamIdOfUpstream\x12=\n\x1bsequence_number_in_upstream\x18\x02 \x01(\rR\x18sequenceNumberInUpstream\x12\x35\n\x0bresult_code\x18\x03 \x01(\x0e\x32\x14.iscp2.v1.ResultCodeR\nresultCode\x12#\n\rresult_string\x18\x04 \x01(\tR\x0cresultString\x12\x64\n\x10\x65xtension_fields\x18\x05 \x01(\x0b\x32\x39.iscp2.v1.extensions.DownstreamChunkResultExtensionFieldsR\x0f\x65xtensionFieldsB\xaa\x01\n com.github.aptpod.proto.iscp2.v1B\x0f\x44ownstreamProtoP\x01Z4github.com/aptpod/iscp-proto/gen/go/iscp2/v1;iscp2v1\xa2\x02\x03IXX\xaa\x02\x08Iscp2.V1\xca\x02\x08Iscp2\\V1\xe2\x02\x14Iscp2\\V1\\GPBMetadata\xea\x02\tIscp2::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'iscp2.v1.downstream_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.github.aptpod.proto.iscp2.v1B\017DownstreamProtoP\001Z4github.com/aptpod/iscp-proto/gen/go/iscp2/v1;iscp2v1\242\002\003IXX\252\002\010Iscp2.V1\312\002\010Iscp2\\V1\342\002\024Iscp2\\V1\\GPBMetadata\352\002\tIscp2::V1'
  _DOWNSTREAMOPENREQUEST_DATAIDALIASESENTRY._options = None
  _DOWNSTREAMOPENREQUEST_DATAIDALIASESENTRY._serialized_options = b'8\001'
  _DOWNSTREAMCHUNKACK_UPSTREAMALIASESENTRY._options = None
  _DOWNSTREAMCHUNKACK_UPSTREAMALIASESENTRY._serialized_options = b'8\001'
  _DOWNSTREAMCHUNKACK_DATAIDALIASESENTRY._options = None
  _DOWNSTREAMCHUNKACK_DATAIDALIASESENTRY._serialized_options = b'8\001'
  _globals['_DOWNSTREAMOPENREQUEST']._serialized_start=154
  _globals['_DOWNSTREAMOPENREQUEST']._serialized_end=732
  _globals['_DOWNSTREAMOPENREQUEST_DATAIDALIASESENTRY']._serialized_start=650
  _globals['_DOWNSTREAMOPENREQUEST_DATAIDALIASESENTRY']._serialized_end=732
  _globals['_DOWNSTREAMOPENRESPONSE']._serialized_start=735
  _globals['_DOWNSTREAMOPENRESPONSE']._serialized_end=1064
  _globals['_DOWNSTREAMRESUMEREQUEST']._serialized_start=1067
  _globals['_DOWNSTREAMRESUMEREQUEST']._serialized_end=1311
  _globals['_DOWNSTREAMRESUMERESPONSE']._serialized_start=1314
  _globals['_DOWNSTREAMRESUMERESPONSE']._serialized_end=1568
  _globals['_DOWNSTREAMCLOSEREQUEST']._serialized_start=1571
  _globals['_DOWNSTREAMCLOSEREQUEST']._serialized_end=1758
  _globals['_DOWNSTREAMCLOSERESPONSE']._serialized_start=1761
  _globals['_DOWNSTREAMCLOSERESPONSE']._serialized_end=2013
  _globals['_DOWNSTREAMCHUNK']._serialized_start=2016
  _globals['_DOWNSTREAMCHUNK']._serialized_end=2352
  _globals['_DOWNSTREAMCHUNKACK']._serialized_start=2355
  _globals['_DOWNSTREAMCHUNKACK']._serialized_end=2955
  _globals['_DOWNSTREAMCHUNKACK_UPSTREAMALIASESENTRY']._serialized_start=2781
  _globals['_DOWNSTREAMCHUNKACK_UPSTREAMALIASESENTRY']._serialized_end=2871
  _globals['_DOWNSTREAMCHUNKACK_DATAIDALIASESENTRY']._serialized_start=650
  _globals['_DOWNSTREAMCHUNKACK_DATAIDALIASESENTRY']._serialized_end=732
  _globals['_DOWNSTREAMCHUNKACKCOMPLETE']._serialized_start=2958
  _globals['_DOWNSTREAMCHUNKACKCOMPLETE']._serialized_end=3248
  _globals['_DOWNSTREAMMETADATA']._serialized_start=3251
  _globals['_DOWNSTREAMMETADATA']._serialized_end=4182
  _globals['_DOWNSTREAMMETADATAACK']._serialized_start=4185
  _globals['_DOWNSTREAMMETADATAACK']._serialized_end=4433
  _globals['_UPSTREAMINFO']._serialized_start=4435
  _globals['_UPSTREAMINFO']._serialized_end=4547
  _globals['_DOWNSTREAMCHUNKRESULT']._serialized_start=4550
  _globals['_DOWNSTREAMCHUNKRESULT']._serialized_end=4881
# @@protoc_insertion_point(module_scope)
