// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iscp2/v1/result_code.proto

package com.github.aptpod.proto.iscp2.v1;

public final class ResultCodeProto {
  private ResultCodeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032iscp2/v1/result_code.proto\022\010iscp2.v1*\374" +
      "\006\n\nResultCode\022\r\n\tSUCCEEDED\020\000\022\022\n\016NORMAL_C" +
      "LOSURE\020\000\022\030\n\024INCOMPATIBLE_VERSION\020\001\022\031\n\025MA" +
      "XIMUM_DATA_ID_ALIAS\020\002\022\032\n\026MAXIMUM_UPSTREA" +
      "M_ALIAS\020\003\022\025\n\021UNSPECIFIED_ERROR\020@\022\016\n\nNO_N" +
      "ODE_ID\020A\022\017\n\013AUTH_FAILED\020B\022\023\n\017CONNECT_TIM" +
      "EOUT\020C\022\025\n\021MALFORMED_MESSAGE\020D\022\022\n\016PROTOCO" +
      "L_ERROR\020E\022\017\n\013ACK_TIMEOUT\020F\022\023\n\017INVALID_PA" +
      "YLOAD\020G\022\023\n\017INVALID_DATA_ID\020H\022\031\n\025INVALID_" +
      "DATA_ID_ALIAS\020I\022\027\n\023INVALID_DATA_FILTER\020J" +
      "\022\024\n\020STREAM_NOT_FOUND\020K\022\033\n\027RESUME_REQUEST" +
      "_CONFLICT\020L\022\022\n\016PROCESS_FAILED\020M\022\035\n\031DESIR" +
      "ED_QOS_NOT_SUPPORTED\020N\022\020\n\014PING_TIMEOUT\020O" +
      "\022\032\n\026TOO_LARGE_MESSAGE_SIZE\020P\022\034\n\030TOO_MANY" +
      "_DATA_ID_ALIASES\020Q\022\024\n\020TOO_MANY_STREAMS\020R" +
      "\022\031\n\025TOO_LONG_ACK_INTERVAL\020S\022\037\n\033TOO_MANY_" +
      "DOWNSTREAM_FILTERS\020T\022\031\n\025TOO_MANY_DATA_FI" +
      "LTERS\020U\022\034\n\030TOO_LONG_EXPIRY_INTERVAL\020V\022\031\n" +
      "\025TOO_LONG_PING_TIMEOUT\020W\022\033\n\027TOO_SHORT_PI" +
      "NG_INTERVAL\020X\022\032\n\026TOO_SHORT_PING_TIMEOUT\020" +
      "Y\022\026\n\022RATE_LIMIT_REACHED\020Z\022\025\n\020NODE_ID_MIS" +
      "MATCH\020\200\001\022\026\n\021SESSION_NOT_FOUND\020\201\001\022\033\n\026SESS" +
      "ION_ALREADY_CLOSED\020\202\001\022\032\n\025SESSION_CANNOT_" +
      "CLOSED\020\203\001\032\002\020\001B\252\001\n com.github.aptpod.prot" +
      "o.iscp2.v1B\017ResultCodeProtoP\001Z4github.co" +
      "m/aptpod/iscp-proto/gen/go/iscp2/v1;iscp" +
      "2v1\242\002\003IXX\252\002\010Iscp2.V1\312\002\010Iscp2\\V1\342\002\024Iscp2\\" +
      "V1\\GPBMetadata\352\002\tIscp2::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
