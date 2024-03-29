// @generated by protoc-gen-es v1.3.0 with parameter "target=ts"
// @generated from file iscp2/v1/connection.proto (package iscp2.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3 } from "@bufbuild/protobuf";
import { ConnectRequestExtensionFields, ConnectResponseExtensionFields, DisconnectExtensionFields } from "./extensions/connection_pb.js";
import { ResultCode } from "./result_code_pb.js";

/**
 * @generated from message iscp2.v1.ConnectRequest
 */
export class ConnectRequest extends Message<ConnectRequest> {
  /**
   * @generated from field: uint32 request_id = 1;
   */
  requestId = 0;

  /**
   * @generated from field: string protocol_version = 2;
   */
  protocolVersion = "";

  /**
   * @generated from field: string node_id = 3;
   */
  nodeId = "";

  /**
   * @generated from field: uint32 ping_interval = 4;
   */
  pingInterval = 0;

  /**
   * @generated from field: uint32 ping_timeout = 5;
   */
  pingTimeout = 0;

  /**
   * @generated from field: iscp2.v1.extensions.ConnectRequestExtensionFields extension_fields = 6;
   */
  extensionFields?: ConnectRequestExtensionFields;

  constructor(data?: PartialMessage<ConnectRequest>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "iscp2.v1.ConnectRequest";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "request_id", kind: "scalar", T: 13 /* ScalarType.UINT32 */ },
    { no: 2, name: "protocol_version", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 3, name: "node_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "ping_interval", kind: "scalar", T: 13 /* ScalarType.UINT32 */ },
    { no: 5, name: "ping_timeout", kind: "scalar", T: 13 /* ScalarType.UINT32 */ },
    { no: 6, name: "extension_fields", kind: "message", T: ConnectRequestExtensionFields },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ConnectRequest {
    return new ConnectRequest().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ConnectRequest {
    return new ConnectRequest().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ConnectRequest {
    return new ConnectRequest().fromJsonString(jsonString, options);
  }

  static equals(a: ConnectRequest | PlainMessage<ConnectRequest> | undefined, b: ConnectRequest | PlainMessage<ConnectRequest> | undefined): boolean {
    return proto3.util.equals(ConnectRequest, a, b);
  }
}

/**
 * @generated from message iscp2.v1.ConnectResponse
 */
export class ConnectResponse extends Message<ConnectResponse> {
  /**
   * @generated from field: uint32 request_id = 1;
   */
  requestId = 0;

  /**
   * @generated from field: string protocol_version = 2;
   */
  protocolVersion = "";

  /**
   * @generated from field: iscp2.v1.ResultCode result_code = 3;
   */
  resultCode = ResultCode.SUCCEEDED;

  /**
   * @generated from field: string result_string = 4;
   */
  resultString = "";

  /**
   * @generated from field: iscp2.v1.extensions.ConnectResponseExtensionFields extension_fields = 5;
   */
  extensionFields?: ConnectResponseExtensionFields;

  constructor(data?: PartialMessage<ConnectResponse>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "iscp2.v1.ConnectResponse";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "request_id", kind: "scalar", T: 13 /* ScalarType.UINT32 */ },
    { no: 2, name: "protocol_version", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 3, name: "result_code", kind: "enum", T: proto3.getEnumType(ResultCode) },
    { no: 4, name: "result_string", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 5, name: "extension_fields", kind: "message", T: ConnectResponseExtensionFields },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ConnectResponse {
    return new ConnectResponse().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ConnectResponse {
    return new ConnectResponse().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ConnectResponse {
    return new ConnectResponse().fromJsonString(jsonString, options);
  }

  static equals(a: ConnectResponse | PlainMessage<ConnectResponse> | undefined, b: ConnectResponse | PlainMessage<ConnectResponse> | undefined): boolean {
    return proto3.util.equals(ConnectResponse, a, b);
  }
}

/**
 * @generated from message iscp2.v1.Disconnect
 */
export class Disconnect extends Message<Disconnect> {
  /**
   * @generated from field: iscp2.v1.ResultCode result_code = 1;
   */
  resultCode = ResultCode.SUCCEEDED;

  /**
   * @generated from field: string result_string = 2;
   */
  resultString = "";

  /**
   * @generated from field: iscp2.v1.extensions.DisconnectExtensionFields extension_fields = 3;
   */
  extensionFields?: DisconnectExtensionFields;

  constructor(data?: PartialMessage<Disconnect>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "iscp2.v1.Disconnect";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "result_code", kind: "enum", T: proto3.getEnumType(ResultCode) },
    { no: 2, name: "result_string", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 3, name: "extension_fields", kind: "message", T: DisconnectExtensionFields },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): Disconnect {
    return new Disconnect().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): Disconnect {
    return new Disconnect().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): Disconnect {
    return new Disconnect().fromJsonString(jsonString, options);
  }

  static equals(a: Disconnect | PlainMessage<Disconnect> | undefined, b: Disconnect | PlainMessage<Disconnect> | undefined): boolean {
    return proto3.util.equals(Disconnect, a, b);
  }
}

