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
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data.JSON_PROPERTY_FORMATTED
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_2_data")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data {
  public static final String JSON_PROPERTY_FORMATTED = "formatted";
  private String formatted;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data() { 
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

   /**
   * Get formatted
   * @return formatted
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFormatted() {
    return formatted;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_2_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data resolveAnEventID200ResponseEventEntriesInnerAnyOf2Data = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data) o;
    return Objects.equals(this.formatted, resolveAnEventID200ResponseEventEntriesInnerAnyOf2Data.formatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data {\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
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

