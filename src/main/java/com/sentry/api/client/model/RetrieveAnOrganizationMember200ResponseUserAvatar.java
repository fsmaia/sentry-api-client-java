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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnOrganizationMember200ResponseUserAvatar
 */
@JsonPropertyOrder({
  RetrieveAnOrganizationMember200ResponseUserAvatar.JSON_PROPERTY_AVATAR_TYPE,
  RetrieveAnOrganizationMember200ResponseUserAvatar.JSON_PROPERTY_AVATAR_UUID
})
@JsonTypeName("Retrieve_an_Organization_Member_200_response_user_avatar")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseUserAvatar {
  public static final String JSON_PROPERTY_AVATAR_TYPE = "avatarType";
  private String avatarType;

  public static final String JSON_PROPERTY_AVATAR_UUID = "avatarUuid";
  private String avatarUuid;

  public RetrieveAnOrganizationMember200ResponseUserAvatar() { 
  }

  public RetrieveAnOrganizationMember200ResponseUserAvatar avatarType(String avatarType) {
    this.avatarType = avatarType;
    return this;
  }

   /**
   * Get avatarType
   * @return avatarType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVATAR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAvatarType() {
    return avatarType;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatarType(String avatarType) {
    this.avatarType = avatarType;
  }


  public RetrieveAnOrganizationMember200ResponseUserAvatar avatarUuid(String avatarUuid) {
    this.avatarUuid = avatarUuid;
    return this;
  }

   /**
   * Get avatarUuid
   * @return avatarUuid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVATAR_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAvatarUuid() {
    return avatarUuid;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatarUuid(String avatarUuid) {
    this.avatarUuid = avatarUuid;
  }


  /**
   * Return true if this Retrieve_an_Organization_Member_200_response_user_avatar object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganizationMember200ResponseUserAvatar retrieveAnOrganizationMember200ResponseUserAvatar = (RetrieveAnOrganizationMember200ResponseUserAvatar) o;
    return Objects.equals(this.avatarType, retrieveAnOrganizationMember200ResponseUserAvatar.avatarType) &&
        Objects.equals(this.avatarUuid, retrieveAnOrganizationMember200ResponseUserAvatar.avatarUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarType, avatarUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseUserAvatar {\n");
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

