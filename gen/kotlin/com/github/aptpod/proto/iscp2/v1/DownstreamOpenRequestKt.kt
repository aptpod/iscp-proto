// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: iscp2/v1/downstream.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.github.aptpod.proto.iscp2.v1;

@kotlin.jvm.JvmName("-initializedownstreamOpenRequest")
public inline fun downstreamOpenRequest(block: com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequestKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequest =
  com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequestKt.Dsl._create(com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `iscp2.v1.DownstreamOpenRequest`
 */
public object DownstreamOpenRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequest = _builder.build()

    /**
     * `uint32 request_id = 1 [json_name = "requestId"];`
     */
    public var requestId: kotlin.Int
      @JvmName("getRequestId")
      get() = _builder.getRequestId()
      @JvmName("setRequestId")
      set(value) {
        _builder.setRequestId(value)
      }
    /**
     * `uint32 request_id = 1 [json_name = "requestId"];`
     */
    public fun clearRequestId() {
      _builder.clearRequestId()
    }

    /**
     * `uint32 desired_stream_id_alias = 2 [json_name = "desiredStreamIdAlias"];`
     */
    public var desiredStreamIdAlias: kotlin.Int
      @JvmName("getDesiredStreamIdAlias")
      get() = _builder.getDesiredStreamIdAlias()
      @JvmName("setDesiredStreamIdAlias")
      set(value) {
        _builder.setDesiredStreamIdAlias(value)
      }
    /**
     * `uint32 desired_stream_id_alias = 2 [json_name = "desiredStreamIdAlias"];`
     */
    public fun clearDesiredStreamIdAlias() {
      _builder.clearDesiredStreamIdAlias()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DownstreamFiltersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 3 [json_name = "downstreamFilters"];`
     */
     public val downstreamFilters: com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDownstreamFiltersList()
      )
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 3 [json_name = "downstreamFilters"];`
     * @param value The downstreamFilters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDownstreamFilters")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.add(value: com.github.aptpod.proto.iscp2.v1.DownstreamFilter) {
      _builder.addDownstreamFilters(value)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 3 [json_name = "downstreamFilters"];`
     * @param value The downstreamFilters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDownstreamFilters")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.plusAssign(value: com.github.aptpod.proto.iscp2.v1.DownstreamFilter) {
      add(value)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 3 [json_name = "downstreamFilters"];`
     * @param values The downstreamFilters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDownstreamFilters")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.addAll(values: kotlin.collections.Iterable<com.github.aptpod.proto.iscp2.v1.DownstreamFilter>) {
      _builder.addAllDownstreamFilters(values)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 3 [json_name = "downstreamFilters"];`
     * @param values The downstreamFilters to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDownstreamFilters")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.plusAssign(values: kotlin.collections.Iterable<com.github.aptpod.proto.iscp2.v1.DownstreamFilter>) {
      addAll(values)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 3 [json_name = "downstreamFilters"];`
     * @param index The index to set the value at.
     * @param value The downstreamFilters to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDownstreamFilters")
    public operator fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.set(index: kotlin.Int, value: com.github.aptpod.proto.iscp2.v1.DownstreamFilter) {
      _builder.setDownstreamFilters(index, value)
    }
    /**
     * `repeated .iscp2.v1.DownstreamFilter downstream_filters = 3 [json_name = "downstreamFilters"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDownstreamFilters")
    public fun com.google.protobuf.kotlin.DslList<com.github.aptpod.proto.iscp2.v1.DownstreamFilter, DownstreamFiltersProxy>.clear() {
      _builder.clearDownstreamFilters()
    }


    /**
     * `uint32 expiry_interval = 4 [json_name = "expiryInterval"];`
     */
    public var expiryInterval: kotlin.Int
      @JvmName("getExpiryInterval")
      get() = _builder.getExpiryInterval()
      @JvmName("setExpiryInterval")
      set(value) {
        _builder.setExpiryInterval(value)
      }
    /**
     * `uint32 expiry_interval = 4 [json_name = "expiryInterval"];`
     */
    public fun clearExpiryInterval() {
      _builder.clearExpiryInterval()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DataIdAliasesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<uint32, .iscp2.v1.DataID> data_id_aliases = 5 [json_name = "dataIdAliases"];`
     */
     public val dataIdAliases: com.google.protobuf.kotlin.DslMap<kotlin.Int, com.github.aptpod.proto.iscp2.v1.DataID, DataIdAliasesProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getDataIdAliasesMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getDataIdAliasesMap()
      )
    /**
     * `map<uint32, .iscp2.v1.DataID> data_id_aliases = 5 [json_name = "dataIdAliases"];`
     */
    @JvmName("putDataIdAliases")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.github.aptpod.proto.iscp2.v1.DataID, DataIdAliasesProxy>
      .put(key: kotlin.Int, value: com.github.aptpod.proto.iscp2.v1.DataID) {
         _builder.putDataIdAliases(key, value)
       }
    /**
     * `map<uint32, .iscp2.v1.DataID> data_id_aliases = 5 [json_name = "dataIdAliases"];`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setDataIdAliases")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.github.aptpod.proto.iscp2.v1.DataID, DataIdAliasesProxy>
      .set(key: kotlin.Int, value: com.github.aptpod.proto.iscp2.v1.DataID) {
         put(key, value)
       }
    /**
     * `map<uint32, .iscp2.v1.DataID> data_id_aliases = 5 [json_name = "dataIdAliases"];`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeDataIdAliases")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.github.aptpod.proto.iscp2.v1.DataID, DataIdAliasesProxy>
      .remove(key: kotlin.Int) {
         _builder.removeDataIdAliases(key)
       }
    /**
     * `map<uint32, .iscp2.v1.DataID> data_id_aliases = 5 [json_name = "dataIdAliases"];`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllDataIdAliases")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.github.aptpod.proto.iscp2.v1.DataID, DataIdAliasesProxy>
      .putAll(map: kotlin.collections.Map<kotlin.Int, com.github.aptpod.proto.iscp2.v1.DataID>) {
         _builder.putAllDataIdAliases(map)
       }
    /**
     * `map<uint32, .iscp2.v1.DataID> data_id_aliases = 5 [json_name = "dataIdAliases"];`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearDataIdAliases")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.github.aptpod.proto.iscp2.v1.DataID, DataIdAliasesProxy>
      .clear() {
         _builder.clearDataIdAliases()
       }

    /**
     * `.iscp2.v1.QoS qos = 6 [json_name = "qos"];`
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
     * `.iscp2.v1.QoS qos = 6 [json_name = "qos"];`
     */
    public fun clearQos() {
      _builder.clearQos()
    }

    /**
     * `.iscp2.v1.extensions.DownstreamOpenRequestExtensionFields extension_fields = 7 [json_name = "extensionFields"];`
     */
    public var extensionFields: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamOpenRequestExtensionFields
      @JvmName("getExtensionFields")
      get() = _builder.getExtensionFields()
      @JvmName("setExtensionFields")
      set(value) {
        _builder.setExtensionFields(value)
      }
    /**
     * `.iscp2.v1.extensions.DownstreamOpenRequestExtensionFields extension_fields = 7 [json_name = "extensionFields"];`
     */
    public fun clearExtensionFields() {
      _builder.clearExtensionFields()
    }
    /**
     * `.iscp2.v1.extensions.DownstreamOpenRequestExtensionFields extension_fields = 7 [json_name = "extensionFields"];`
     * @return Whether the extensionFields field is set.
     */
    public fun hasExtensionFields(): kotlin.Boolean {
      return _builder.hasExtensionFields()
    }

    /**
     * `bool omit_empty_chunk = 8 [json_name = "omitEmptyChunk"];`
     */
    public var omitEmptyChunk: kotlin.Boolean
      @JvmName("getOmitEmptyChunk")
      get() = _builder.getOmitEmptyChunk()
      @JvmName("setOmitEmptyChunk")
      set(value) {
        _builder.setOmitEmptyChunk(value)
      }
    /**
     * `bool omit_empty_chunk = 8 [json_name = "omitEmptyChunk"];`
     */
    public fun clearOmitEmptyChunk() {
      _builder.clearOmitEmptyChunk()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequest.copy(block: `com.github.aptpod.proto.iscp2.v1`.DownstreamOpenRequestKt.Dsl.() -> kotlin.Unit): com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequest =
  `com.github.aptpod.proto.iscp2.v1`.DownstreamOpenRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.github.aptpod.proto.iscp2.v1.DownstreamOpenRequestOrBuilder.extensionFieldsOrNull: com.github.aptpod.proto.iscp2.v1.extensions.DownstreamOpenRequestExtensionFields?
  get() = if (hasExtensionFields()) getExtensionFields() else null

