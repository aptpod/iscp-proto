// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/common.proto

package com.github.aptpod.proto.iscp2.v1;

public interface DataPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iscp2.v1.DataPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>sint64 elapsed_time = 1 [json_name = "elapsedTime"];</code>
   * @return The elapsedTime.
   */
  long getElapsedTime();

  /**
   * <code>bytes payload = 2 [json_name = "payload"];</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}