// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/ping_pong.proto

package com.github.aptpod.proto.iscp2.v1;

public interface PingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iscp2.v1.Ping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 request_id = 1 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  int getRequestId();

  /**
   * <code>.iscp2.v1.extensions.PingExtensionFields extension_fields = 2 [json_name = "extensionFields"];</code>
   * @return Whether the extensionFields field is set.
   */
  boolean hasExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.PingExtensionFields extension_fields = 2 [json_name = "extensionFields"];</code>
   * @return The extensionFields.
   */
  com.github.aptpod.proto.iscp2.v1.extensions.PingExtensionFields getExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.PingExtensionFields extension_fields = 2 [json_name = "extensionFields"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.extensions.PingExtensionFieldsOrBuilder getExtensionFieldsOrBuilder();
}