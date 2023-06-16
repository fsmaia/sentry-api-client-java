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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOfData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf.JSON_PROPERTY_TYPE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf.JSON_PROPERTY_DATA
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_entries_inner_anyOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:23:11.909078Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DATA = "data";
  private ResolveAnEventID200ResponseEventEntriesInnerAnyOfData data;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf() { 
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf data(ResolveAnEventID200ResponseEventEntriesInnerAnyOfData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(ResolveAnEventID200ResponseEventEntriesInnerAnyOfData data) {
    this.data = data;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_entries_inner_anyOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf resolveAnEventID200ResponseEventEntriesInnerAnyOf = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf) o;
    return Objects.equals(this.type, resolveAnEventID200ResponseEventEntriesInnerAnyOf.type) &&
        Objects.equals(this.data, resolveAnEventID200ResponseEventEntriesInnerAnyOf.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

