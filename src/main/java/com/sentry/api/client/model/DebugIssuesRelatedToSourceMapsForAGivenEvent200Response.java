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
import com.sentry.api.client.model.DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * DebugIssuesRelatedToSourceMapsForAGivenEvent200Response
 */
@JsonPropertyOrder({
  DebugIssuesRelatedToSourceMapsForAGivenEvent200Response.JSON_PROPERTY_ERRORS
})
@JsonTypeName("Debug_issues_related_to_source_maps_for_a_given_event_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class DebugIssuesRelatedToSourceMapsForAGivenEvent200Response {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner> errors = new ArrayList<>();

  public DebugIssuesRelatedToSourceMapsForAGivenEvent200Response() { 
  }

  public DebugIssuesRelatedToSourceMapsForAGivenEvent200Response errors(List<DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public DebugIssuesRelatedToSourceMapsForAGivenEvent200Response addErrorsItem(DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrors(List<DebugIssuesRelatedToSourceMapsForAGivenEvent200ResponseErrorsInner> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this Debug_issues_related_to_source_maps_for_a_given_event_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugIssuesRelatedToSourceMapsForAGivenEvent200Response debugIssuesRelatedToSourceMapsForAGivenEvent200Response = (DebugIssuesRelatedToSourceMapsForAGivenEvent200Response) o;
    return Objects.equals(this.errors, debugIssuesRelatedToSourceMapsForAGivenEvent200Response.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugIssuesRelatedToSourceMapsForAGivenEvent200Response {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

