// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/extensions/connection.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1.extensions;

@kotlin.jvm.JvmName("-initializedisconnectExtensionFields")
public inline fun disconnectExtensionFields(block: com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFieldsKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFields =
  com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFieldsKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFields.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.extensions.DisconnectExtensionFields`
 */
public object DisconnectExtensionFieldsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFields.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFields.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFields = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFields.copy(block: `com.github.aptpod.proto.iscp2.v1.extensions`.DisconnectExtensionFieldsKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.extensions.DisconnectExtensionFields =
  `com.github.aptpod.proto.iscp2.v1.extensions`.DisconnectExtensionFieldsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
