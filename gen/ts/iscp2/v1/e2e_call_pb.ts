// @generated by protoc-gen-es v1.3.0 with parameter "target=ts"
// @generated from file iscp2/v1/e2e_call.proto (package iscp2.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3 } from "@bufbuild/protobuf";
import { DownstreamCallExtensionFields, UpstreamCallAckExtensionFields, UpstreamCallExtensionFields } from "./extensions/e2e_call_pb.js";
import { ResultCode } from "./result_code_pb.js";

/**
 * @generated from message iscp2.v1.UpstreamCall
 */
export class UpstreamCall extends Message<UpstreamCall> {
  /**
   * @generated from field: string call_id = 1;
   */
  callId = "";

  /**
   * @generated from field: string request_call_id = 2;
   */
  requestCallId = "";

  /**
   * @generated from field: string destination_node_id = 3;
   */
  destinationNodeId = "";

  /**
   * @generated from field: string name = 4;
   */
  name = "";

  /**
   * @generated from field: string type = 5;
   */
  type = "";

  /**
   * @generated from field: bytes payload = 6;
   */
  payload = new Uint8Array(0);

  /**
   * @generated from field: iscp2.v1.extensions.UpstreamCallExtensionFields extension_fields = 7;
   */
  extensionFields?: UpstreamCallExtensionFields;

  constructor(data?: PartialMessage<UpstreamCall>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "iscp2.v1.UpstreamCall";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "call_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 2, name: "request_call_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 3, name: "destination_node_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "name", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 5, name: "type", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 6, name: "payload", kind: "scalar", T: 12 /* ScalarType.BYTES */ },
    { no: 7, name: "extension_fields", kind: "message", T: UpstreamCallExtensionFields },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): UpstreamCall {
    return new UpstreamCall().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): UpstreamCall {
    return new UpstreamCall().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): UpstreamCall {
    return new UpstreamCall().fromJsonString(jsonString, options);
  }

  static equals(a: UpstreamCall | PlainMessage<UpstreamCall> | undefined, b: UpstreamCall | PlainMessage<UpstreamCall> | undefined): boolean {
    return proto3.util.equals(UpstreamCall, a, b);
  }
}

/**
 * @generated from message iscp2.v1.UpstreamCallAck
 */
export class UpstreamCallAck extends Message<UpstreamCallAck> {
  /**
   * @generated from field: string call_id = 1;
   */
  callId = "";

  /**
   * @generated from field: iscp2.v1.ResultCode result_code = 2;
   */
  resultCode = ResultCode.SUCCEEDED;

  /**
   * @generated from field: string result_string = 3;
   */
  resultString = "";

  /**
   * @generated from field: iscp2.v1.extensions.UpstreamCallAckExtensionFields extension_fields = 4;
   */
  extensionFields?: UpstreamCallAckExtensionFields;

  constructor(data?: PartialMessage<UpstreamCallAck>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "iscp2.v1.UpstreamCallAck";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "call_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 2, name: "result_code", kind: "enum", T: proto3.getEnumType(ResultCode) },
    { no: 3, name: "result_string", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "extension_fields", kind: "message", T: UpstreamCallAckExtensionFields },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): UpstreamCallAck {
    return new UpstreamCallAck().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): UpstreamCallAck {
    return new UpstreamCallAck().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): UpstreamCallAck {
    return new UpstreamCallAck().fromJsonString(jsonString, options);
  }

  static equals(a: UpstreamCallAck | PlainMessage<UpstreamCallAck> | undefined, b: UpstreamCallAck | PlainMessage<UpstreamCallAck> | undefined): boolean {
    return proto3.util.equals(UpstreamCallAck, a, b);
  }
}

/**
 * @generated from message iscp2.v1.DownstreamCall
 */
export class DownstreamCall extends Message<DownstreamCall> {
  /**
   * @generated from field: string call_id = 1;
   */
  callId = "";

  /**
   * @generated from field: string request_call_id = 2;
   */
  requestCallId = "";

  /**
   * @generated from field: string source_node_id = 3;
   */
  sourceNodeId = "";

  /**
   * @generated from field: string name = 4;
   */
  name = "";

  /**
   * @generated from field: string type = 5;
   */
  type = "";

  /**
   * @generated from field: bytes payload = 6;
   */
  payload = new Uint8Array(0);

  /**
   * @generated from field: iscp2.v1.extensions.DownstreamCallExtensionFields extension_fields = 7;
   */
  extensionFields?: DownstreamCallExtensionFields;

  constructor(data?: PartialMessage<DownstreamCall>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "iscp2.v1.DownstreamCall";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "call_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 2, name: "request_call_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 3, name: "source_node_id", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "name", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 5, name: "type", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 6, name: "payload", kind: "scalar", T: 12 /* ScalarType.BYTES */ },
    { no: 7, name: "extension_fields", kind: "message", T: DownstreamCallExtensionFields },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): DownstreamCall {
    return new DownstreamCall().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): DownstreamCall {
    return new DownstreamCall().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): DownstreamCall {
    return new DownstreamCall().fromJsonString(jsonString, options);
  }

  static equals(a: DownstreamCall | PlainMessage<DownstreamCall> | undefined, b: DownstreamCall | PlainMessage<DownstreamCall> | undefined): boolean {
    return proto3.util.equals(DownstreamCall, a, b);
  }
}

