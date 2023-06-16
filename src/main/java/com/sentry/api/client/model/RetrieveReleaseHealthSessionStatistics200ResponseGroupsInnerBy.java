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
 * These are key/value pairs, the key being the requested &#x60;groupBy&#x60; property with its corresponding value.
 */
@JsonPropertyOrder({
  RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy.JSON_PROPERTY_SESSION_STATUS
})
@JsonTypeName("Retrieve_Release_Health_Session_Statistics_200_response_groups_inner_by")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy {
  public static final String JSON_PROPERTY_SESSION_STATUS = "session.status";
  private String sessionStatus;

  public RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy() { 
  }

  public RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy sessionStatus(String sessionStatus) {
    this.sessionStatus = sessionStatus;
    return this;
  }

   /**
   * Example &#x60;groupBy&#x60; property
   * @return sessionStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSessionStatus() {
    return sessionStatus;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionStatus(String sessionStatus) {
    this.sessionStatus = sessionStatus;
  }


  /**
   * Return true if this Retrieve_Release_Health_Session_Statistics_200_response_groups_inner_by object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy retrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy = (RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy) o;
    return Objects.equals(this.sessionStatus, retrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy.sessionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy {\n");
    sb.append("    sessionStatus: ").append(toIndentedString(sessionStatus)).append("\n");
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

