// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/extensions/connection.proto

package com.github.aptpod.proto.iscp2.v1.extensions;

public interface ConnectRequestExtensionFieldsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iscp2.v1.extensions.ConnectRequestExtensionFields)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string access_token = 1 [json_name = "accessToken"];</code>
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <code>string access_token = 1 [json_name = "accessToken"];</code>
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <code>.iscp2.v1.extensions.IntdashExtensionFields intdash = 1024 [json_name = "intdash"];</code>
   * @return Whether the intdash field is set.
   */
  boolean hasIntdash();
  /**
   * <code>.iscp2.v1.extensions.IntdashExtensionFields intdash = 1024 [json_name = "intdash"];</code>
   * @return The intdash.
   */
  com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFields getIntdash();
  /**
   * <code>.iscp2.v1.extensions.IntdashExtensionFields intdash = 1024 [json_name = "intdash"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.extensions.IntdashExtensionFieldsOrBuilder getIntdashOrBuilder();
}
