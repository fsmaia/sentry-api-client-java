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
import com.sentry.api.client.model.RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * OutcomesResponse
 */
@JsonPropertyOrder({
  OutcomesResponse.JSON_PROPERTY_START,
  OutcomesResponse.JSON_PROPERTY_END,
  OutcomesResponse.JSON_PROPERTY_INTERVALS,
  OutcomesResponse.JSON_PROPERTY_GROUPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class OutcomesResponse {
  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public static final String JSON_PROPERTY_INTERVALS = "intervals";
  private List<String> intervals = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner> groups = new ArrayList<>();

  public OutcomesResponse() { 
  }

  public OutcomesResponse start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(String start) {
    this.start = start;
  }


  public OutcomesResponse end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(String end) {
    this.end = end;
  }


  public OutcomesResponse intervals(List<String> intervals) {
    this.intervals = intervals;
    return this;
  }

  public OutcomesResponse addIntervalsItem(String intervalsItem) {
    if (this.intervals == null) {
      this.intervals = new ArrayList<>();
    }
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * Get intervals
   * @return intervals
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getIntervals() {
    return intervals;
  }


  @JsonProperty(JSON_PROPERTY_INTERVALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntervals(List<String> intervals) {
    this.intervals = intervals;
  }


  public OutcomesResponse groups(List<RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public OutcomesResponse addGroupsItem(RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner groupsItem) {
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

  public List<RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroups(List<RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner> groups) {
    this.groups = groups;
  }


  /**
   * Return true if this OutcomesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomesResponse outcomesResponse = (OutcomesResponse) o;
    return Objects.equals(this.start, outcomesResponse.start) &&
        Objects.equals(this.end, outcomesResponse.end) &&
        Objects.equals(this.intervals, outcomesResponse.intervals) &&
        Objects.equals(this.groups, outcomesResponse.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, intervals, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomesResponse {\n");
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

