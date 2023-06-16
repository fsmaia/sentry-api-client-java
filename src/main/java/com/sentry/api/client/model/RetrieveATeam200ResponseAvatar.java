/*
 * API Reference
 * Sentry Public API
 *
 * The version of the OpenAPI document: v0
 * Contact: partners@sentry.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sentry.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveATeam200ResponseAvatar
 */
@JsonPropertyOrder({
  RetrieveATeam200ResponseAvatar.JSON_PROPERTY_AVATAR_TYPE,
  RetrieveATeam200ResponseAvatar.JSON_PROPERTY_AVATAR_UUID
})
@JsonTypeName("Retrieve_a_Team_200_response_avatar")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class RetrieveATeam200ResponseAvatar {
  public static final String JSON_PROPERTY_AVATAR_TYPE = "avatarType";
  private String avatarType;

  public static final String JSON_PROPERTY_AVATAR_UUID = "avatarUuid";
  private JsonNullable<String> avatarUuid = JsonNullable.<String>undefined();

  public RetrieveATeam200ResponseAvatar() { 
  }

  public RetrieveATeam200ResponseAvatar avatarType(String avatarType) {
    this.avatarType = avatarType;
    return this;
  }

   /**
   * Get avatarType
   * @return avatarType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVATAR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvatarType() {
    return avatarType;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvatarType(String avatarType) {
    this.avatarType = avatarType;
  }


  public RetrieveATeam200ResponseAvatar avatarUuid(String avatarUuid) {
    this.avatarUuid = JsonNullable.<String>of(avatarUuid);
    return this;
  }

   /**
   * Get avatarUuid
   * @return avatarUuid
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getAvatarUuid() {
        return avatarUuid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAvatarUuid_JsonNullable() {
    return avatarUuid;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_UUID)
  public void setAvatarUuid_JsonNullable(JsonNullable<String> avatarUuid) {
    this.avatarUuid = avatarUuid;
  }

  public void setAvatarUuid(String avatarUuid) {
    this.avatarUuid = JsonNullable.<String>of(avatarUuid);
  }


  /**
   * Return true if this Retrieve_a_Team_200_response_avatar object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveATeam200ResponseAvatar retrieveATeam200ResponseAvatar = (RetrieveATeam200ResponseAvatar) o;
    return Objects.equals(this.avatarType, retrieveATeam200ResponseAvatar.avatarType) &&
        equalsNullable(this.avatarUuid, retrieveATeam200ResponseAvatar.avatarUuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarType, hashCodeNullable(avatarUuid));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveATeam200ResponseAvatar {\n");
    sb.append("    avatarType: ").append(toIndentedString(avatarType)).append("\n");
    sb.append("    avatarUuid: ").append(toIndentedString(avatarUuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

