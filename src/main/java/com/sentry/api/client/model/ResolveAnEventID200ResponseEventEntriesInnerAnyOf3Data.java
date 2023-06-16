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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data.JSON_PROPERTY_EXC_OMITTED,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data.JSON_PROPERTY_HAS_SYSTEM_FRAMES,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data.JSON_PROPERTY_VALUES
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data {
  public static final String JSON_PROPERTY_EXC_OMITTED = "excOmitted";
  private List<Integer> excOmitted;

  public static final String JSON_PROPERTY_HAS_SYSTEM_FRAMES = "hasSystemFrames";
  private Boolean hasSystemFrames;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner> values = new ArrayList<>();

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data() { 
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data excOmitted(List<Integer> excOmitted) {
    this.excOmitted = excOmitted;
    return this;
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data addExcOmittedItem(Integer excOmittedItem) {
    if (this.excOmitted == null) {
      this.excOmitted = new ArrayList<>();
    }
    this.excOmitted.add(excOmittedItem);
    return this;
  }

   /**
   * Get excOmitted
   * @return excOmitted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXC_OMITTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Integer> getExcOmitted() {
    return excOmitted;
  }


  @JsonProperty(JSON_PROPERTY_EXC_OMITTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExcOmitted(List<Integer> excOmitted) {
    this.excOmitted = excOmitted;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data hasSystemFrames(Boolean hasSystemFrames) {
    this.hasSystemFrames = hasSystemFrames;
    return this;
  }

   /**
   * Get hasSystemFrames
   * @return hasSystemFrames
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_SYSTEM_FRAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasSystemFrames() {
    return hasSystemFrames;
  }


  @JsonProperty(JSON_PROPERTY_HAS_SYSTEM_FRAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasSystemFrames(Boolean hasSystemFrames) {
    this.hasSystemFrames = hasSystemFrames;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data values(List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner> values) {
    this.values = values;
    return this;
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data addValuesItem(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner> values) {
    this.values = values;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data resolveAnEventID200ResponseEventEntriesInnerAnyOf3Data = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data) o;
    return Objects.equals(this.excOmitted, resolveAnEventID200ResponseEventEntriesInnerAnyOf3Data.excOmitted) &&
        Objects.equals(this.hasSystemFrames, resolveAnEventID200ResponseEventEntriesInnerAnyOf3Data.hasSystemFrames) &&
        Objects.equals(this.values, resolveAnEventID200ResponseEventEntriesInnerAnyOf3Data.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excOmitted, hasSystemFrames, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data {\n");
    sb.append("    excOmitted: ").append(toIndentedString(excOmitted)).append("\n");
    sb.append("    hasSystemFrames: ").append(toIndentedString(hasSystemFrames)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

