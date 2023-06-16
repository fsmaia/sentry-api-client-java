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
import com.sentry.api.client.model.QueryDiscoverEventsInTableFormat200ResponseMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * QueryDiscoverEventsInTableFormat200Response
 */
@JsonPropertyOrder({
  QueryDiscoverEventsInTableFormat200Response.JSON_PROPERTY_DATA,
  QueryDiscoverEventsInTableFormat200Response.JSON_PROPERTY_META
})
@JsonTypeName("Query_Discover_Events_in_Table_Format_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:23:11.909078Z[Etc/UTC]")
public class QueryDiscoverEventsInTableFormat200Response {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<Map<String, Object>> data = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private QueryDiscoverEventsInTableFormat200ResponseMeta meta;

  public QueryDiscoverEventsInTableFormat200Response() { 
  }

  public QueryDiscoverEventsInTableFormat200Response data(List<Map<String, Object>> data) {
    this.data = data;
    return this;
  }

  public QueryDiscoverEventsInTableFormat200Response addDataItem(Map<String, Object> dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Map<String, Object>> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(List<Map<String, Object>> data) {
    this.data = data;
  }


  public QueryDiscoverEventsInTableFormat200Response meta(QueryDiscoverEventsInTableFormat200ResponseMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public QueryDiscoverEventsInTableFormat200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(QueryDiscoverEventsInTableFormat200ResponseMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this Query_Discover_Events_in_Table_Format_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryDiscoverEventsInTableFormat200Response queryDiscoverEventsInTableFormat200Response = (QueryDiscoverEventsInTableFormat200Response) o;
    return Objects.equals(this.data, queryDiscoverEventsInTableFormat200Response.data) &&
        Objects.equals(this.meta, queryDiscoverEventsInTableFormat200Response.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryDiscoverEventsInTableFormat200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

