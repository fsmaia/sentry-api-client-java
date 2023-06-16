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
 * These are key/value pairs, the key being the requested &#x60;field&#x60;, and the value the corresponding total over the requested time frame.
 */
@JsonPropertyOrder({
  RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals.JSON_PROPERTY_SUM_SESSION
})
@JsonTypeName("Retrieve_Release_Health_Session_Statistics_200_response_groups_inner_totals")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals {
  public static final String JSON_PROPERTY_SUM_SESSION = "sum(session)";
  private Integer sumSession;

  public RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals() { 
  }

  public RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals sumSession(Integer sumSession) {
    this.sumSession = sumSession;
    return this;
  }

   /**
   * Example &#x60;field&#x60; value
   * @return sumSession
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUM_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSumSession() {
    return sumSession;
  }


  @JsonProperty(JSON_PROPERTY_SUM_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSumSession(Integer sumSession) {
    this.sumSession = sumSession;
  }


  /**
   * Return true if this Retrieve_Release_Health_Session_Statistics_200_response_groups_inner_totals object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals retrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals = (RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals) o;
    return Objects.equals(this.sumSession, retrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals.sumSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals {\n");
    sb.append("    sumSession: ").append(toIndentedString(sumSession)).append("\n");
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

