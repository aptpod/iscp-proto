// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/upstream.proto

package com.github.aptpod.proto.iscp2.v1;

public interface UpstreamMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iscp2.v1.UpstreamMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 request_id = 1 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  int getRequestId();

  /**
   * <code>.iscp2.v1.BaseTime base_time = 2 [json_name = "baseTime"];</code>
   * @return Whether the baseTime field is set.
   */
  boolean hasBaseTime();
  /**
   * <code>.iscp2.v1.BaseTime base_time = 2 [json_name = "baseTime"];</code>
   * @return The baseTime.
   */
  com.github.aptpod.proto.iscp2.v1.BaseTime getBaseTime();
  /**
   * <code>.iscp2.v1.BaseTime base_time = 2 [json_name = "baseTime"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.BaseTimeOrBuilder getBaseTimeOrBuilder();

  /**
   * <code>.iscp2.v1.extensions.UpstreamMetadataExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   * @return Whether the extensionFields field is set.
   */
  boolean hasExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.UpstreamMetadataExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   * @return The extensionFields.
   */
  com.github.aptpod.proto.iscp2.v1.extensions.UpstreamMetadataExtensionFields getExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.UpstreamMetadataExtensionFields extension_fields = 4 [json_name = "extensionFields"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.extensions.UpstreamMetadataExtensionFieldsOrBuilder getExtensionFieldsOrBuilder();

  com.github.aptpod.proto.iscp2.v1.UpstreamMetadata.MetadataCase getMetadataCase();
}