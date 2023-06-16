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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventUserData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEventUser
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventUser.JSON_PROPERTY_USERNAME,
  ResolveAnEventID200ResponseEventUser.JSON_PROPERTY_NAME,
  ResolveAnEventID200ResponseEventUser.JSON_PROPERTY_IP_ADDRESS,
  ResolveAnEventID200ResponseEventUser.JSON_PROPERTY_EMAIL,
  ResolveAnEventID200ResponseEventUser.JSON_PROPERTY_DATA,
  ResolveAnEventID200ResponseEventUser.JSON_PROPERTY_ID
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_user")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:23:11.909078Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventUser {
  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_DATA = "data";
  private ResolveAnEventID200ResponseEventUserData data;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public ResolveAnEventID200ResponseEventUser() { 
  }

  public ResolveAnEventID200ResponseEventUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public ResolveAnEventID200ResponseEventUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ResolveAnEventID200ResponseEventUser ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public ResolveAnEventID200ResponseEventUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public ResolveAnEventID200ResponseEventUser data(ResolveAnEventID200ResponseEventUserData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAnEventID200ResponseEventUserData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(ResolveAnEventID200ResponseEventUserData data) {
    this.data = data;
  }


  public ResolveAnEventID200ResponseEventUser id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_user object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventUser resolveAnEventID200ResponseEventUser = (ResolveAnEventID200ResponseEventUser) o;
    return Objects.equals(this.username, resolveAnEventID200ResponseEventUser.username) &&
        Objects.equals(this.name, resolveAnEventID200ResponseEventUser.name) &&
        Objects.equals(this.ipAddress, resolveAnEventID200ResponseEventUser.ipAddress) &&
        Objects.equals(this.email, resolveAnEventID200ResponseEventUser.email) &&
        Objects.equals(this.data, resolveAnEventID200ResponseEventUser.data) &&
        Objects.equals(this.id, resolveAnEventID200ResponseEventUser.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, name, ipAddress, email, data, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventUser {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

