// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/upstream.proto

package com.github.aptpod.proto.iscp2.v1;

public interface UpstreamChunkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iscp2.v1.UpstreamChunk)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 stream_id_alias = 1 [json_name = "streamIdAlias"];</code>
   * @return The streamIdAlias.
   */
  int getStreamIdAlias();

  /**
   * <code>.iscp2.v1.StreamChunk stream_chunk = 2 [json_name = "streamChunk"];</code>
   * @return Whether the streamChunk field is set.
   */
  boolean hasStreamChunk();
  /**
   * <code>.iscp2.v1.StreamChunk stream_chunk = 2 [json_name = "streamChunk"];</code>
   * @return The streamChunk.
   */
  com.github.aptpod.proto.iscp2.v1.StreamChunk getStreamChunk();
  /**
   * <code>.iscp2.v1.StreamChunk stream_chunk = 2 [json_name = "streamChunk"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.StreamChunkOrBuilder getStreamChunkOrBuilder();

  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];</code>
   */
  java.util.List<com.github.aptpod.proto.iscp2.v1.DataID> 
      getDataIdsList();
  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.DataID getDataIds(int index);
  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];</code>
   */
  int getDataIdsCount();
  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];</code>
   */
  java.util.List<? extends com.github.aptpod.proto.iscp2.v1.DataIDOrBuilder> 
      getDataIdsOrBuilderList();
  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 3 [json_name = "dataIds"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.DataIDOrBuilder getDataIdsOrBuilder(
      int index);

  /**
   * <code>.iscp2.v1.extensions.UpstreamChunkExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   * @return Whether the extensionFields field is set.
   */
  boolean hasExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.UpstreamChunkExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   * @return The extensionFields.
   */
  com.github.aptpod.proto.iscp2.v1.extensions.UpstreamChunkExtensionFields getExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.UpstreamChunkExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.extensions.UpstreamChunkExtensionFieldsOrBuilder getExtensionFieldsOrBuilder();
}
