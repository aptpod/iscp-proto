// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/metadata.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializeupstreamAbnormalClose")
public inline fun upstreamAbnormalClose(block: com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalCloseKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose =
  com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalCloseKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.UpstreamAbnormalClose`
 */
public object UpstreamAbnormalCloseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose = _builder.build()

    /**
     * `bytes stream_id = 1 [json_name = "streamId"];`
     */
    public var streamId: com.google.protobuf.ByteString
      @JvmName("getStreamId")
      get() = _builder.getStreamId()
      @JvmName("setStreamId")
      set(value) {
        _builder.setStreamId(value)
      }
    /**
     * `bytes stream_id = 1 [json_name = "streamId"];`
     */
    public fun clearStreamId() {
      _builder.clearStreamId()
    }

    /**
     * `string session_id = 2 [json_name = "sessionId"];`
     */
    public var sessionId: kotlin.String
      @JvmName("getSessionId")
      get() = _builder.getSessionId()
      @JvmName("setSessionId")
      set(value) {
        _builder.setSessionId(value)
      }
    /**
     * `string session_id = 2 [json_name = "sessionId"];`
     */
    public fun clearSessionId() {
      _builder.clearSessionId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose.copy(block: `com.github.aptpod.proto.iscp2.v1`.UpstreamAbnormalCloseKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.UpstreamAbnormalClose =
  `com.github.aptpod.proto.iscp2.v1`.UpstreamAbnormalCloseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

