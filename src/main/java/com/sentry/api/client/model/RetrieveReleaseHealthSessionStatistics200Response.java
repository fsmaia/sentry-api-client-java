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
import com.sentry.api.client.model.RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveReleaseHealthSessionStatistics200Response
 */
@JsonPropertyOrder({
  RetrieveReleaseHealthSessionStatistics200Response.JSON_PROPERTY_START,
  RetrieveReleaseHealthSessionStatistics200Response.JSON_PROPERTY_END,
  RetrieveReleaseHealthSessionStatistics200Response.JSON_PROPERTY_INTERVALS,
  RetrieveReleaseHealthSessionStatistics200Response.JSON_PROPERTY_GROUPS
})
@JsonTypeName("Retrieve_Release_Health_Session_Statistics_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class RetrieveReleaseHealthSessionStatistics200Response {
  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public static final String JSON_PROPERTY_INTERVALS = "intervals";
  private List<OffsetDateTime> intervals = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner> groups = new ArrayList<>();

  public RetrieveReleaseHealthSessionStatistics200Response() { 
  }

  public RetrieveReleaseHealthSessionStatistics200Response start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The start time of the data being returned.
   * @return start
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public RetrieveReleaseHealthSessionStatistics200Response end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * The exclusive end time of the data being returned.
   * @return end
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  public RetrieveReleaseHealthSessionStatistics200Response intervals(List<OffsetDateTime> intervals) {
    this.intervals = intervals;
    return this;
  }

  public RetrieveReleaseHealthSessionStatistics200Response addIntervalsItem(OffsetDateTime intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * The time slices of the timeseries data given in the &#x60;groups[].series&#x60; field.
   * @return intervals
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<OffsetDateTime> getIntervals() {
    return intervals;
  }


  @JsonProperty(JSON_PROPERTY_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntervals(List<OffsetDateTime> intervals) {
    this.intervals = intervals;
  }


  public RetrieveReleaseHealthSessionStatistics200Response groups(List<RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public RetrieveReleaseHealthSessionStatistics200Response addGroupsItem(RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroups(List<RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner> groups) {
    this.groups = groups;
  }


  /**
   * Return true if this Retrieve_Release_Health_Session_Statistics_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveReleaseHealthSessionStatistics200Response retrieveReleaseHealthSessionStatistics200Response = (RetrieveReleaseHealthSessionStatistics200Response) o;
    return Objects.equals(this.start, retrieveReleaseHealthSessionStatistics200Response.start) &&
        Objects.equals(this.end, retrieveReleaseHealthSessionStatistics200Response.end) &&
        Objects.equals(this.intervals, retrieveReleaseHealthSessionStatistics200Response.intervals) &&
        Objects.equals(this.groups, retrieveReleaseHealthSessionStatistics200Response.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, intervals, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveReleaseHealthSessionStatistics200Response {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

