// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/spring.proto

package com.spring.discovery.models;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:models.User)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    java.lang.String getUsername();
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string email = 3;</code>
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>string email = 3;</code>
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>string role = 4;</code>
     * @return The role.
     */
    java.lang.String getRole();
    /**
     * <code>string role = 4;</code>
     * @return The bytes for role.
     */
    com.google.protobuf.ByteString
        getRoleBytes();

    /**
     * <code>repeated string authorities = 5;</code>
     * @return A list containing the authorities.
     */
    java.util.List<java.lang.String>
        getAuthoritiesList();
    /**
     * <code>repeated string authorities = 5;</code>
     * @return The count of authorities.
     */
    int getAuthoritiesCount();
    /**
     * <code>repeated string authorities = 5;</code>
     * @param index The index of the element to return.
     * @return The authorities at the given index.
     */
    java.lang.String getAuthorities(int index);
    /**
     * <code>repeated string authorities = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the authorities at the given index.
     */
    com.google.protobuf.ByteString
        getAuthoritiesBytes(int index);
  }
  /**
   * Protobuf type {@code models.User}
   */
  public static final class User extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:models.User)
      UserOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use User.newBuilder() to construct.
    private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private User() {
      username_ = "";
      email_ = "";
      role_ = "";
      authorities_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new User();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.spring.discovery.models.UserProto.internal_static_models_User_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.spring.discovery.models.UserProto.internal_static_models_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.spring.discovery.models.UserProto.User.class, com.spring.discovery.models.UserProto.User.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object username_ = "";
    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    @java.lang.Override
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EMAIL_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object email_ = "";
    /**
     * <code>string email = 3;</code>
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }
    /**
     * <code>string email = 3;</code>
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROLE_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object role_ = "";
    /**
     * <code>string role = 4;</code>
     * @return The role.
     */
    @java.lang.Override
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      }
    }
    /**
     * <code>string role = 4;</code>
     * @return The bytes for role.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUTHORITIES_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList authorities_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string authorities = 5;</code>
     * @return A list containing the authorities.
     */
    public com.google.protobuf.ProtocolStringList
        getAuthoritiesList() {
      return authorities_;
    }
    /**
     * <code>repeated string authorities = 5;</code>
     * @return The count of authorities.
     */
    public int getAuthoritiesCount() {
      return authorities_.size();
    }
    /**
     * <code>repeated string authorities = 5;</code>
     * @param index The index of the element to return.
     * @return The authorities at the given index.
     */
    public java.lang.String getAuthorities(int index) {
      return authorities_.get(index);
    }
    /**
     * <code>repeated string authorities = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the authorities at the given index.
     */
    public com.google.protobuf.ByteString
        getAuthoritiesBytes(int index) {
      return authorities_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, role_);
      }
      for (int i = 0; i < authorities_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, authorities_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, role_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < authorities_.size(); i++) {
          dataSize += computeStringSizeNoTag(authorities_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getAuthoritiesList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.spring.discovery.models.UserProto.User)) {
        return super.equals(obj);
      }
      com.spring.discovery.models.UserProto.User other = (com.spring.discovery.models.UserProto.User) obj;

      if (getId()
          != other.getId()) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getEmail()
          .equals(other.getEmail())) return false;
      if (!getRole()
          .equals(other.getRole())) return false;
      if (!getAuthoritiesList()
          .equals(other.getAuthoritiesList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
      hash = (37 * hash) + ROLE_FIELD_NUMBER;
      hash = (53 * hash) + getRole().hashCode();
      if (getAuthoritiesCount() > 0) {
        hash = (37 * hash) + AUTHORITIES_FIELD_NUMBER;
        hash = (53 * hash) + getAuthoritiesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.spring.discovery.models.UserProto.User parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.spring.discovery.models.UserProto.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.spring.discovery.models.UserProto.User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.spring.discovery.models.UserProto.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.spring.discovery.models.UserProto.User prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code models.User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:models.User)
        com.spring.discovery.models.UserProto.UserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.spring.discovery.models.UserProto.internal_static_models_User_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.spring.discovery.models.UserProto.internal_static_models_User_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.spring.discovery.models.UserProto.User.class, com.spring.discovery.models.UserProto.User.Builder.class);
      }

      // Construct using com.spring.protoBuff.models.UserProto.User.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        id_ = 0;
        username_ = "";
        email_ = "";
        role_ = "";
        authorities_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.spring.discovery.models.UserProto.internal_static_models_User_descriptor;
      }

      @java.lang.Override
      public com.spring.discovery.models.UserProto.User getDefaultInstanceForType() {
        return com.spring.discovery.models.UserProto.User.getDefaultInstance();
      }

      @java.lang.Override
      public com.spring.discovery.models.UserProto.User build() {
        com.spring.discovery.models.UserProto.User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.spring.discovery.models.UserProto.User buildPartial() {
        com.spring.discovery.models.UserProto.User result = new com.spring.discovery.models.UserProto.User(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.spring.discovery.models.UserProto.User result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.username_ = username_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.email_ = email_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.role_ = role_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          authorities_.makeImmutable();
          result.authorities_ = authorities_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.spring.discovery.models.UserProto.User) {
          return mergeFrom((com.spring.discovery.models.UserProto.User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.spring.discovery.models.UserProto.User other) {
        if (other == com.spring.discovery.models.UserProto.User.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getEmail().isEmpty()) {
          email_ = other.email_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getRole().isEmpty()) {
          role_ = other.role_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (!other.authorities_.isEmpty()) {
          if (authorities_.isEmpty()) {
            authorities_ = other.authorities_;
            bitField0_ |= 0x00000010;
          } else {
            ensureAuthoritiesIsMutable();
            authorities_.addAll(other.authorities_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                id_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                username_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                email_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                role_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 42: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureAuthoritiesIsMutable();
                authorities_.add(s);
                break;
              } // case 42
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object username_ = "";
      /**
       * <code>string username = 2;</code>
       * @return The username.
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       * @return The bytes for username.
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       * @param value The username to set.
       * @return This builder for chaining.
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        username_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsername() {
        username_ = getDefaultInstance().getUsername();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       * @param value The bytes for username to set.
       * @return This builder for chaining.
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        username_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>string email = 3;</code>
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string email = 3;</code>
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string email = 3;</code>
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        email_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string email = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        email_ = getDefaultInstance().getEmail();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string email = 3;</code>
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        email_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object role_ = "";
      /**
       * <code>string role = 4;</code>
       * @return The role.
       */
      public java.lang.String getRole() {
        java.lang.Object ref = role_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          role_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string role = 4;</code>
       * @return The bytes for role.
       */
      public com.google.protobuf.ByteString
          getRoleBytes() {
        java.lang.Object ref = role_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          role_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string role = 4;</code>
       * @param value The role to set.
       * @return This builder for chaining.
       */
      public Builder setRole(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        role_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string role = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRole() {
        role_ = getDefaultInstance().getRole();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string role = 4;</code>
       * @param value The bytes for role to set.
       * @return This builder for chaining.
       */
      public Builder setRoleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        role_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList authorities_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureAuthoritiesIsMutable() {
        if (!authorities_.isModifiable()) {
          authorities_ = new com.google.protobuf.LazyStringArrayList(authorities_);
        }
        bitField0_ |= 0x00000010;
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @return A list containing the authorities.
       */
      public com.google.protobuf.ProtocolStringList
          getAuthoritiesList() {
        authorities_.makeImmutable();
        return authorities_;
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @return The count of authorities.
       */
      public int getAuthoritiesCount() {
        return authorities_.size();
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @param index The index of the element to return.
       * @return The authorities at the given index.
       */
      public java.lang.String getAuthorities(int index) {
        return authorities_.get(index);
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @param index The index of the value to return.
       * @return The bytes of the authorities at the given index.
       */
      public com.google.protobuf.ByteString
          getAuthoritiesBytes(int index) {
        return authorities_.getByteString(index);
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @param index The index to set the value at.
       * @param value The authorities to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorities(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAuthoritiesIsMutable();
        authorities_.set(index, value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @param value The authorities to add.
       * @return This builder for chaining.
       */
      public Builder addAuthorities(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureAuthoritiesIsMutable();
        authorities_.add(value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @param values The authorities to add.
       * @return This builder for chaining.
       */
      public Builder addAllAuthorities(
          java.lang.Iterable<java.lang.String> values) {
        ensureAuthoritiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, authorities_);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorities() {
        authorities_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string authorities = 5;</code>
       * @param value The bytes of the authorities to add.
       * @return This builder for chaining.
       */
      public Builder addAuthoritiesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureAuthoritiesIsMutable();
        authorities_.add(value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:models.User)
    }

    // @@protoc_insertion_point(class_scope:models.User)
    private static final com.spring.discovery.models.UserProto.User DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.spring.discovery.models.UserProto.User();
    }

    public static com.spring.discovery.models.UserProto.User getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<User>
        PARSER = new com.google.protobuf.AbstractParser<User>() {
      @java.lang.Override
      public User parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<User> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<User> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.spring.discovery.models.UserProto.User getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_models_User_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_models_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026resources/spring.proto\022\006models\"V\n\004User" +
      "\022\n\n\002id\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\022\r\n\005email\030" +
      "\003 \001(\t\022\014\n\004role\030\004 \001(\t\022\023\n\013authorities\030\005 \003(\t" +
      "B(\n\033com.spring.protoBuff.modelsB\tUserPro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_models_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_models_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_models_User_descriptor,
        new java.lang.String[] { "Id", "Username", "Email", "Role", "Authorities", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
