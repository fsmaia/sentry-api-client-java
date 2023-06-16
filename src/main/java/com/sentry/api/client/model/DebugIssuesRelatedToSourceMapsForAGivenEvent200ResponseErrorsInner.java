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
 * DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner
 */
@JsonPropertyOrder({
  DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner.JSON_PROPERTY_TYPE,
  DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner.JSON_PROPERTY_MESSAGE,
  DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner.JSON_PROPERTY_DATA
})
@JsonTypeName("Debug_issues_related_to_source_maps_for_a_given_event_200_response_errors_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_DATA = "data";
  private Map<String, Object> data;

  public DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner() { 
  }

  public DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner type(String type) {
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


  public DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner data(Map<String, Object> data) {
    this.data = data;
    return this;
  }

  public DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner putDataItem(String key, Object dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setData(Map<String, Object> data) {
    this.data = data;
  }


  /**
   * Return true if this Debug_issues_related_to_source_maps_for_a_given_event_200_response_errors_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner debugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner = (DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner) o;
    return Objects.equals(this.type, debugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner.type) &&
        Objects.equals(this.message, debugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner.message) &&
        Objects.equals(this.data, debugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

