// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package com.blakearnold.proto;

/**
 * Protobuf type {@code com.blakearnold.proto.example.Example}
 */
public  final class Example extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.blakearnold.proto.example.Example)
    ExampleOrBuilder {
  // Use Example.newBuilder() to construct.
  private Example(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Example() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Example(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.blakearnold.proto.ExampleProto.internal_static_com_blakearnold_proto_example_Example_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.blakearnold.proto.ExampleProto.internal_static_com_blakearnold_proto_example_Example_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.blakearnold.proto.Example.class, com.blakearnold.proto.Example.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.Struct data_;
  /**
   * <code>optional .google.protobuf.Struct data = 1;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>optional .google.protobuf.Struct data = 1;</code>
   */
  public com.google.protobuf.Struct getData() {
    return data_ == null ? com.google.protobuf.Struct.getDefaultInstance() : data_;
  }
  /**
   * <code>optional .google.protobuf.Struct data = 1;</code>
   */
  public com.google.protobuf.StructOrBuilder getDataOrBuilder() {
    return getData();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (data_ != null) {
      output.writeMessage(1, getData());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getData());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.blakearnold.proto.Example parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.blakearnold.proto.Example parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.blakearnold.proto.Example parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.blakearnold.proto.Example parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.blakearnold.proto.Example parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.blakearnold.proto.Example parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.blakearnold.proto.Example parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.blakearnold.proto.Example parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.blakearnold.proto.Example parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.blakearnold.proto.Example parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.blakearnold.proto.Example prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.blakearnold.proto.example.Example}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.blakearnold.proto.example.Example)
      com.blakearnold.proto.ExampleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.blakearnold.proto.ExampleProto.internal_static_com_blakearnold_proto_example_Example_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.blakearnold.proto.ExampleProto.internal_static_com_blakearnold_proto_example_Example_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.blakearnold.proto.Example.class, com.blakearnold.proto.Example.Builder.class);
    }

    // Construct using com.blakearnold.proto.Example.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.blakearnold.proto.ExampleProto.internal_static_com_blakearnold_proto_example_Example_descriptor;
    }

    public com.blakearnold.proto.Example getDefaultInstanceForType() {
      return com.blakearnold.proto.Example.getDefaultInstance();
    }

    public com.blakearnold.proto.Example build() {
      com.blakearnold.proto.Example result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.blakearnold.proto.Example buildPartial() {
      com.blakearnold.proto.Example result = new com.blakearnold.proto.Example(this);
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.blakearnold.proto.Example) {
        return mergeFrom((com.blakearnold.proto.Example)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.blakearnold.proto.Example other) {
      if (other == com.blakearnold.proto.Example.getDefaultInstance()) return this;
      if (other.hasData()) {
        mergeData(other.getData());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.blakearnold.proto.Example parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.blakearnold.proto.Example) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Struct data_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> dataBuilder_;
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    public com.google.protobuf.Struct getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.google.protobuf.Struct.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    public Builder setData(com.google.protobuf.Struct value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    public Builder setData(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    public Builder mergeData(com.google.protobuf.Struct value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            com.google.protobuf.Struct.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    public com.google.protobuf.Struct.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    public com.google.protobuf.StructOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>optional .google.protobuf.Struct data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.blakearnold.proto.example.Example)
  }

  // @@protoc_insertion_point(class_scope:com.blakearnold.proto.example.Example)
  private static final com.blakearnold.proto.Example DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.blakearnold.proto.Example();
  }

  public static com.blakearnold.proto.Example getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Example>
      PARSER = new com.google.protobuf.AbstractParser<Example>() {
    public Example parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Example(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Example> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Example> getParserForType() {
    return PARSER;
  }

  public com.blakearnold.proto.Example getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

