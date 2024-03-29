// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/metadata.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializedownstreamResume")
public inline fun downstreamResume(block: com.github.aptpod.proto.iscp2.v1.DownstreamResumeKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamResume =
  com.github.aptpod.proto.iscp2.v1.DownstreamResumeKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.DownstreamResume.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.DownstreamResume`
 */
public object DownstreamResumeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.DownstreamResume.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.DownstreamResume.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.DownstreamResume = _builder.build()

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
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DownstreamFiltersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 2 [json_name = "downstreamFilters"];`
     */
     public val downstreamFilters: com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDownstreamFiltersList()
      )
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 2 [json_name = "downstreamFilters"];`
     * @param value The downstreamFilters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDownstreamFilters")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.add(value: com.github.aptpod.proto.iscp2.v1.DownstreamFilter) {
      _builder.addDownstreamFilters(value)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 2 [json_name = "downstreamFilters"];`
     * @param value The downstreamFilters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDownstreamFilters")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.plusAssign(value: com.github.aptpod.proto.iscp2.v1.DownstreamFilter) {
      add(value)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 2 [json_name = "downstreamFilters"];`
     * @param values The downstreamFilters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDownstreamFilters")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.addAll(values: kotlin.collections.Iterable<com.github.aptpod.proto.iscp2.v1.DownstreamFilter>) {
      _builder.addAllDownstreamFilters(values)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 2 [json_name = "downstreamFilters"];`
     * @param values The downstreamFilters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDownstreamFilters")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.plusAssign(values: kotlin.collections.Iterable<com.github.aptpod.proto.iscp2.v1.DownstreamFilter>) {
      addAll(values)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 2 [json_name = "downstreamFilters"];`
     * @param index The index to set the value at.
     * @param value The downstreamFilters to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDownstreamFilters")
    public operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.set(index: kotlin.Int, value: com.github.aptpod.proto.iscp2.v1.DownstreamFilter) {
      _builder.setDownstreamFilters(index, value)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 2 [json_name = "downstreamFilters"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDownstreamFilters")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.clear() {
      _builder.clearDownstreamFilters()
    }


    /**
     * `.iscp2.v1.QoS qos = 3 [json_name = "qos"];`
     */
    public var qos: com.github.aptpod.proto.iscp2.v1.QoS
      @JvmName("getQos")
      get() = _builder.getQos()
      @JvmName("setQos")
      set(value) {
        _builder.setQos(value)
      }
    public var qosValue: kotlin.Int
      @JvmName("getQosValue")
      get() = _builder.getQosValue()
      @JvmName("setQosValue")
      set(value) {
        _builder.setQosValue(value)
      }
    /**
     * `.iscp2.v1.QoS qos = 3 [json_name = "qos"];`
     */
    public fun clearQos() {
      _builder.clearQos()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.DownstreamResume.copy(block: `com.github.aptpod.proto.iscp2.v1`.DownstreamResumeKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamResume =
  `com.github.aptpod.proto.iscp2.v1`.DownstreamResumeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

