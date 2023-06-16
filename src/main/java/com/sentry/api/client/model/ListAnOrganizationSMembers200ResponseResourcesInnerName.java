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
 * ListAnOrganizationSMembers200ResponseResourcesInnerName
 */
@JsonPropertyOrder({
  ListAnOrganizationSMembers200ResponseResourcesInnerName.JSON_PROPERTY_GIVEN_NAME,
  ListAnOrganizationSMembers200ResponseResourcesInnerName.JSON_PROPERTY_FAMILY_NAME
})
@JsonTypeName("List_an_Organization_s_Members_200_response_Resources_inner_name")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class ListAnOrganizationSMembers200ResponseResourcesInnerName {
  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public ListAnOrganizationSMembers200ResponseResourcesInnerName() { 
  }

  public ListAnOrganizationSMembers200ResponseResourcesInnerName givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGivenName() {
    return givenName;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public ListAnOrganizationSMembers200ResponseResourcesInnerName familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFamilyName() {
    return familyName;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  /**
   * Return true if this List_an_Organization_s_Members_200_response_Resources_inner_name object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSMembers200ResponseResourcesInnerName listAnOrganizationSMembers200ResponseResourcesInnerName = (ListAnOrganizationSMembers200ResponseResourcesInnerName) o;
    return Objects.equals(this.givenName, listAnOrganizationSMembers200ResponseResourcesInnerName.givenName) &&
        Objects.equals(this.familyName, listAnOrganizationSMembers200ResponseResourcesInnerName.familyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSMembers200ResponseResourcesInnerName {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
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

