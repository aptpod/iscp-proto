// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/metadata.proto

package com.github.aptpod.proto.iscp2.v1;

public interface UpstreamResumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iscp2.v1.UpstreamResume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes stream_id = 1 [json_name = "streamId"];</code>
   * @return The streamId.
   */
  com.google.protobuf.ByteString getStreamId();

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
   * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
   * @return The enum numeric value on the wire for qos.
   */
  int getQosValue();
  /**
   * <code>.iscp2.v1.QoS qos = 3 [json_name = "qos"];</code>
   * @return The qos.
   */
  com.github.aptpod.proto.iscp2.v1.QoS getQos();
}