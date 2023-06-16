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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace.JSON_PROPERTY_FRAMES,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace.JSON_PROPERTY_FRAMES_OMITTED,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace.JSON_PROPERTY_REGISTERS,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace.JSON_PROPERTY_HAS_SYSTEM_FRAMES
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data_values_inner_stacktrace")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace {
  public static final String JSON_PROPERTY_FRAMES = "frames";
  private List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner> frames = new ArrayList<>();

  public static final String JSON_PROPERTY_FRAMES_OMITTED = "framesOmitted";
  private String framesOmitted;

  public static final String JSON_PROPERTY_REGISTERS = "registers";
  private String registers;

  public static final String JSON_PROPERTY_HAS_SYSTEM_FRAMES = "hasSystemFrames";
  private Boolean hasSystemFrames;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace() { 
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace frames(List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner> frames) {
    this.frames = frames;
    return this;
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace addFramesItem(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner framesItem) {
    if (this.frames == null) {
      this.frames = new ArrayList<>();
    }
    this.frames.add(framesItem);
    return this;
  }

   /**
   * Get frames
   * @return frames
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FRAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner> getFrames() {
    return frames;
  }


  @JsonProperty(JSON_PROPERTY_FRAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrames(List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner> frames) {
    this.frames = frames;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace framesOmitted(String framesOmitted) {
    this.framesOmitted = framesOmitted;
    return this;
  }

   /**
   * Get framesOmitted
   * @return framesOmitted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAMES_OMITTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFramesOmitted() {
    return framesOmitted;
  }


  @JsonProperty(JSON_PROPERTY_FRAMES_OMITTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFramesOmitted(String framesOmitted) {
    this.framesOmitted = framesOmitted;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace registers(String registers) {
    this.registers = registers;
    return this;
  }

   /**
   * Get registers
   * @return registers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegisters() {
    return registers;
  }


  @JsonProperty(JSON_PROPERTY_REGISTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegisters(String registers) {
    this.registers = registers;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace hasSystemFrames(Boolean hasSystemFrames) {
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


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data_values_inner_stacktrace object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace) o;
    return Objects.equals(this.frames, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace.frames) &&
        Objects.equals(this.framesOmitted, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace.framesOmitted) &&
        Objects.equals(this.registers, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace.registers) &&
        Objects.equals(this.hasSystemFrames, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace.hasSystemFrames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frames, framesOmitted, registers, hasSystemFrames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace {\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    framesOmitted: ").append(toIndentedString(framesOmitted)).append("\n");
    sb.append("    registers: ").append(toIndentedString(registers)).append("\n");
    sb.append("    hasSystemFrames: ").append(toIndentedString(hasSystemFrames)).append("\n");
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

