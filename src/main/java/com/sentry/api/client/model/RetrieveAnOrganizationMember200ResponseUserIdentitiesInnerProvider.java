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
 * RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider
 */
@JsonPropertyOrder({
  RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.JSON_PROPERTY_ID,
  RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.JSON_PROPERTY_NAME
})
@JsonTypeName("Retrieve_an_Organization_Member_200_response_user_identities_inner_provider")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider() { 
  }

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider id(String id) {
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


  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
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


  /**
   * Return true if this Retrieve_an_Organization_Member_200_response_user_identities_inner_provider object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider retrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider = (RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider) o;
    return Objects.equals(this.id, retrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.id) &&
        Objects.equals(this.name, retrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

