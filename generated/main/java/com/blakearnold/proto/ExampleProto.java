// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package com.blakearnold.proto;

public final class ExampleProto {
  private ExampleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_blakearnold_proto_example_Example_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_blakearnold_proto_example_Example_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rexample.proto\022\035com.blakearnold.proto.e" +
      "xample\032\034google/protobuf/struct.proto\"0\n\007" +
      "Example\022%\n\004data\030\001 \001(\0132\027.google.protobuf." +
      "StructB\'\n\025com.blakearnold.protoB\014Example" +
      "ProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_com_blakearnold_proto_example_Example_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_blakearnold_proto_example_Example_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_blakearnold_proto_example_Example_descriptor,
        new java.lang.String[] { "Data", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
