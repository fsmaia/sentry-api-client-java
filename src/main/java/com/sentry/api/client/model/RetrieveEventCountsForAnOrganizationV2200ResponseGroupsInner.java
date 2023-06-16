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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner
 */
@JsonPropertyOrder({
  RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.JSON_PROPERTY_BY,
  RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.JSON_PROPERTY_TOTALS,
  RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.JSON_PROPERTY_SERIES
})
@JsonTypeName("Retrieve_Event_Counts_for_an_Organization__v2__200_response_groups_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner {
  public static final String JSON_PROPERTY_BY = "by";
  private Map<String, Object> by = new HashMap<>();

  public static final String JSON_PROPERTY_TOTALS = "totals";
  private Map<String, Object> totals = new HashMap<>();

  public static final String JSON_PROPERTY_SERIES = "series";
  private Map<String, Object> series = new HashMap<>();

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner() { 
  }

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner by(Map<String, Object> by) {
    this.by = by;
    return this;
  }

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner putByItem(String key, Object byItem) {
    if (this.by == null) {
      this.by = new HashMap<>();
    }
    this.by.put(key, byItem);
    return this;
  }

   /**
   * Get by
   * @return by
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BY)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getBy() {
    return by;
  }


  @JsonProperty(JSON_PROPERTY_BY)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setBy(Map<String, Object> by) {
    this.by = by;
  }


  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner totals(Map<String, Object> totals) {
    this.totals = totals;
    return this;
  }

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner putTotalsItem(String key, Object totalsItem) {
    if (this.totals == null) {
      this.totals = new HashMap<>();
    }
    this.totals.put(key, totalsItem);
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTALS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getTotals() {
    return totals;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setTotals(Map<String, Object> totals) {
    this.totals = totals;
  }


  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner series(Map<String, Object> series) {
    this.series = series;
    return this;
  }

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner putSeriesItem(String key, Object seriesItem) {
    if (this.series == null) {
      this.series = new HashMap<>();
    }
    this.series.put(key, seriesItem);
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getSeries() {
    return series;
  }


  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setSeries(Map<String, Object> series) {
    this.series = series;
  }


  /**
   * Return true if this Retrieve_Event_Counts_for_an_Organization__v2__200_response_groups_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner retrieveEventCountsForAnOrganizationV2200ResponseGroupsInner = (RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner) o;
    return Objects.equals(this.by, retrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.by) &&
        Objects.equals(this.totals, retrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.totals) &&
        Objects.equals(this.series, retrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, totals, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner {\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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

