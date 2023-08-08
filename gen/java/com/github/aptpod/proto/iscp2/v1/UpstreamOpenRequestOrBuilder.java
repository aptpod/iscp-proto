// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/upstream.proto

package com.github.aptpod.proto.iscp2.v1;

public interface UpstreamOpenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iscp2.v1.UpstreamOpenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 request_id = 1 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  int getRequestId();

  /**
   * <code>string session_id = 2 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string session_id = 2 [json_name = "sessionId"];</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>uint32 ack_interval = 3 [json_name = "ackInterval"];</code>
   * @return The ackInterval.
   */
  int getAckInterval();

  /**
   * <code>uint32 expiry_interval = 5 [json_name = "expiryInterval"];</code>
   * @return The expiryInterval.
   */
  int getExpiryInterval();

  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 6 [json_name = "dataIds"];</code>
   */
  java.util.List<com.github.aptpod.proto.iscp2.v1.DataID> 
      getDataIdsList();
  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 6 [json_name = "dataIds"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.DataID getDataIds(int index);
  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 6 [json_name = "dataIds"];</code>
   */
  int getDataIdsCount();
  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 6 [json_name = "dataIds"];</code>
   */
  java.util.List<? extends com.github.aptpod.proto.iscp2.v1.DataIDOrBuilder> 
      getDataIdsOrBuilderList();
  /**
   * <code>repeated .iscp2.v1.DataID data_ids = 6 [json_name = "dataIds"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.DataIDOrBuilder getDataIdsOrBuilder(
      int index);

  /**
   * <code>.iscp2.v1.QoS qos = 7 [json_name = "qos"];</code>
   * @return The enum numeric value on the wire for qos.
   */
  int getQosValue();
  /**
   * <code>.iscp2.v1.QoS qos = 7 [json_name = "qos"];</code>
   * @return The qos.
   */
  com.github.aptpod.proto.iscp2.v1.QoS getQos();

  /**
   * <code>.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields extension_fields = 8 [json_name = "extensionFields"];</code>
   * @return Whether the extensionFields field is set.
   */
  boolean hasExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields extension_fields = 8 [json_name = "extensionFields"];</code>
   * @return The extensionFields.
   */
  com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields getExtensionFields();
  /**
   * <code>.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields extension_fields = 8 [json_name = "extensionFields"];</code>
   */
  com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFieldsOrBuilder getExtensionFieldsOrBuilder();
}
