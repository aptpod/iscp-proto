// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/extensions/downstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1.extensions;

@kotlin.jvm.JvmName("-initializedownstreamChunkAckExtensionFields")
public inline fun downstreamChunkAckExtensionFields(block: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFieldsKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFields =
  com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFieldsKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFields.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.extensions.DownstreamChunkAckExtensionFields`
 */
public object DownstreamChunkAckExtensionFieldsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFields.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFields.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFields = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFields.copy(block: `com.github.aptpod.proto.iscp2.v1.extensions`.DownstreamChunkAckExtensionFieldsKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.extensions.DownstreamChunkAckExtensionFields =
  `com.github.aptpod.proto.iscp2.v1.extensions`.DownstreamChunkAckExtensionFieldsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
