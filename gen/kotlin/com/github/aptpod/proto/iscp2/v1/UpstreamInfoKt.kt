// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/downstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializeupstreamInfo")
public inline fun upstreamInfo(block: com.github.aptpod.proto.iscp2.v1.UpstreamInfoKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamInfo =
  com.github.aptpod.proto.iscp2.v1.UpstreamInfoKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.UpstreamInfo.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.UpstreamInfo`
 */
public object UpstreamInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.UpstreamInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.UpstreamInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.UpstreamInfo = _builder.build()

    /**
     * `string session_id = 1 [json_name = "sessionId"];`
     */
    public var sessionId: kotlin.String
      @JvmName("getSessionId")
      get() = _builder.getSessionId()
      @JvmName("setSessionId")
      set(value) {
        _builder.setSessionId(value)
      }
    /**
     * `string session_id = 1 [json_name = "sessionId"];`
     */
    public fun clearSessionId() {
      _builder.clearSessionId()
    }

    /**
     * `bytes stream_id = 2 [json_name = "streamId"];`
     */
    public var streamId: com.google.protobuf.ByteString
      @JvmName("getStreamId")
      get() = _builder.getStreamId()
      @JvmName("setStreamId")
      set(value) {
        _builder.setStreamId(value)
      }
    /**
     * `bytes stream_id = 2 [json_name = "streamId"];`
     */
    public fun clearStreamId() {
      _builder.clearStreamId()
    }

    /**
     * `string source_node_id = 3 [json_name = "sourceNodeId"];`
     */
    public var sourceNodeId: kotlin.String
      @JvmName("getSourceNodeId")
      get() = _builder.getSourceNodeId()
      @JvmName("setSourceNodeId")
      set(value) {
        _builder.setSourceNodeId(value)
      }
    /**
     * `string source_node_id = 3 [json_name = "sourceNodeId"];`
     */
    public fun clearSourceNodeId() {
      _builder.clearSourceNodeId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.UpstreamInfo.copy(block: `com.github.aptpod.proto.iscp2.v1`.UpstreamInfoKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamInfo =
  `com.github.aptpod.proto.iscp2.v1`.UpstreamInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
