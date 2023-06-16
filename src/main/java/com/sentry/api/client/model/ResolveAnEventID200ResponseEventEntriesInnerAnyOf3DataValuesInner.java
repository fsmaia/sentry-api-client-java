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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.JSON_PROPERTY_STACKTRACE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.JSON_PROPERTY_MODULE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.JSON_PROPERTY_RAW_STACKTRACE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.JSON_PROPERTY_MECHANISM,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.JSON_PROPERTY_THREAD_ID,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.JSON_PROPERTY_VALUE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.JSON_PROPERTY_TYPE
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data_values_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner {
  public static final String JSON_PROPERTY_STACKTRACE = "stacktrace";
  private ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace stacktrace;

  public static final String JSON_PROPERTY_MODULE = "module";
  private String module;

  public static final String JSON_PROPERTY_RAW_STACKTRACE = "rawStacktrace";
  private Object rawStacktrace;

  public static final String JSON_PROPERTY_MECHANISM = "mechanism";
  private ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism mechanism;

  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  private String threadId;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner() { 
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner stacktrace(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace stacktrace) {
    this.stacktrace = stacktrace;
    return this;
  }

   /**
   * Get stacktrace
   * @return stacktrace
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STACKTRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace getStacktrace() {
    return stacktrace;
  }


  @JsonProperty(JSON_PROPERTY_STACKTRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStacktrace(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktrace stacktrace) {
    this.stacktrace = stacktrace;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner module(String module) {
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModule() {
    return module;
  }


  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModule(String module) {
    this.module = module;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner rawStacktrace(Object rawStacktrace) {
    this.rawStacktrace = rawStacktrace;
    return this;
  }

   /**
   * Get rawStacktrace
   * @return rawStacktrace
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW_STACKTRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRawStacktrace() {
    return rawStacktrace;
  }


  @JsonProperty(JSON_PROPERTY_RAW_STACKTRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRawStacktrace(Object rawStacktrace) {
    this.rawStacktrace = rawStacktrace;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner mechanism(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism mechanism) {
    this.mechanism = mechanism;
    return this;
  }

   /**
   * Get mechanism
   * @return mechanism
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MECHANISM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism getMechanism() {
    return mechanism;
  }


  @JsonProperty(JSON_PROPERTY_MECHANISM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMechanism(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism mechanism) {
    this.mechanism = mechanism;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * Get threadId
   * @return threadId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner type(String type) {
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


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner) o;
    return Objects.equals(this.stacktrace, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.stacktrace) &&
        Objects.equals(this.module, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.module) &&
        Objects.equals(this.rawStacktrace, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.rawStacktrace) &&
        Objects.equals(this.mechanism, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.mechanism) &&
        Objects.equals(this.threadId, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.threadId) &&
        Objects.equals(this.value, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.value) &&
        Objects.equals(this.type, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stacktrace, module, rawStacktrace, mechanism, threadId, value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInner {\n");
    sb.append("    stacktrace: ").append(toIndentedString(stacktrace)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    rawStacktrace: ").append(toIndentedString(rawStacktrace)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

