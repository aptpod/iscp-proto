// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/extensions/upstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1.extensions;

@kotlin.jvm.JvmName("-initializeupstreamOpenRequestExtensionFields")
public inline fun upstreamOpenRequestExtensionFields(block: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFieldsKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields =
  com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFieldsKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.extensions.UpstreamOpenRequestExtensionFields`
 */
public object UpstreamOpenRequestExtensionFieldsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields = _builder.build()

    /**
     * `bool persist = 1 [json_name = "persist"];`
     */
    public var persist: kotlin.Boolean
      @JvmName("getPersist")
      get() = _builder.getPersist()
      @JvmName("setPersist")
      set(value) {
        _builder.setPersist(value)
      }
    /**
     * `bool persist = 1 [json_name = "persist"];`
     */
    public fun clearPersist() {
      _builder.clearPersist()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields.copy(block: `com.github.aptpod.proto.iscp2.v1.extensions`.UpstreamOpenRequestExtensionFieldsKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.extensions.UpstreamOpenRequestExtensionFields =
  `com.github.aptpod.proto.iscp2.v1.extensions`.UpstreamOpenRequestExtensionFieldsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

