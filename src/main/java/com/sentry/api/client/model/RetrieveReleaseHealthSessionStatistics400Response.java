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
 * RetrieveReleaseHealthSessionStatistics400Response
 */
@JsonPropertyOrder({
  RetrieveReleaseHealthSessionStatistics400Response.JSON_PROPERTY_DETAIL
})
@JsonTypeName("Retrieve_Release_Health_Session_Statistics_400_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveReleaseHealthSessionStatistics400Response {
  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public RetrieveReleaseHealthSessionStatistics400Response() { 
  }

  public RetrieveReleaseHealthSessionStatistics400Response detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetail(String detail) {
    this.detail = detail;
  }


  /**
   * Return true if this Retrieve_Release_Health_Session_Statistics_400_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveReleaseHealthSessionStatistics400Response retrieveReleaseHealthSessionStatistics400Response = (RetrieveReleaseHealthSessionStatistics400Response) o;
    return Objects.equals(this.detail, retrieveReleaseHealthSessionStatistics400Response.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveReleaseHealthSessionStatistics400Response {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

