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
 * ListAnOrganizationSReleaseFiles200ResponseInnerHeaders
 */
@JsonPropertyOrder({
  ListAnOrganizationSReleaseFiles200ResponseInnerHeaders.JSON_PROPERTY_CONTENT_TYPE
})
@JsonTypeName("List_an_Organization_s_Release_Files_200_response_inner_headers")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ListAnOrganizationSReleaseFiles200ResponseInnerHeaders {
  public static final String JSON_PROPERTY_CONTENT_TYPE = "Content-Type";
  private String contentType;

  public ListAnOrganizationSReleaseFiles200ResponseInnerHeaders() { 
  }

  public ListAnOrganizationSReleaseFiles200ResponseInnerHeaders contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  /**
   * Return true if this List_an_Organization_s_Release_Files_200_response_inner_headers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSReleaseFiles200ResponseInnerHeaders listAnOrganizationSReleaseFiles200ResponseInnerHeaders = (ListAnOrganizationSReleaseFiles200ResponseInnerHeaders) o;
    return Objects.equals(this.contentType, listAnOrganizationSReleaseFiles200ResponseInnerHeaders.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSReleaseFiles200ResponseInnerHeaders {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

