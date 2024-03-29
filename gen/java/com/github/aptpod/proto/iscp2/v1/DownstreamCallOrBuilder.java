// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/e2e_call.proto

package com.github.aptpod.proto.iscp2.v1;

public interface DownstreamCallOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iscp2.v1.DownstreamCall)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string call_id = 1 [json_name = "callId"];</code>
   * @return The callId.
   */
  java.lang.String getCallId();
  /**
   * <code>string call_id = 1 [json_name = "callId"];</code>
   * @return The bytes for callId.
   */
  com.google.protobuf.ByteString
      getCallIdBytes();

  /**
   * <code>string request_call_id = 2 [json_name = "requestCallId"];</code>
   * @return The requestCallId.
   */
  java.lang.String getRequestCallId();
  /**
   * <code>string request_call_id = 2 [json_name = "requestCallId"];</code>
   * @return The bytes for requestCallId.
   */
  com.google.protobuf.ByteString
      getRequestCallIdBytes();

  /**
   * <code>string source_node_id = 3 [json_name = "sourceNodeId"];</code>
   * @return The sourceNodeId.
   */
  java.lang.String getSourceNodeId();
  /**
   * <code>string source_node_id = 3 [json_name = "sourceNodeId"];</code>
   * @return The bytes for sourceNodeId.
   */
  com.google.protobuf.ByteString
      getSourceNodeIdBytes();

  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string type = 5 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 5 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>bytes payload = 6 [json_name = "payload"];</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>.iscp2.v1.extensions.DownstreamCallExtensionFields extension_fields = 7 [json_name = "extensionFields"];</code>
   * @return Whether the extensionFields field is set.
   */
  boolean hasExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.DownstreamCallExtensionFields extension_fields = 7 [json_name = "extensionFields"];</code>
   * @return The extensionFields.
   */
  com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCallExtensionFields getExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.DownstreamCallExtensionFields extension_fields = 7 [json_name = "extensionFields"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.extensions.DownstreamCallExtensionFieldsOrBuilder getExtensionFieldsOrBuilder();
}
