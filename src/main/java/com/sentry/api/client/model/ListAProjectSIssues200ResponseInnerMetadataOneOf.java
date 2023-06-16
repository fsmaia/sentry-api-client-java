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
 * ListAProjectSIssues200ResponseInnerMetadataOneOf
 */
@JsonPropertyOrder({
  ListAProjectSIssues200ResponseInnerMetadataOneOf.JSON_PROPERTY_FILENAME,
  ListAProjectSIssues200ResponseInnerMetadataOneOf.JSON_PROPERTY_TYPE,
  ListAProjectSIssues200ResponseInnerMetadataOneOf.JSON_PROPERTY_VALUE
})
@JsonTypeName("List_a_Project_s_Issues_200_response_inner_metadata_oneOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ListAProjectSIssues200ResponseInnerMetadataOneOf {
  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ListAProjectSIssues200ResponseInnerMetadataOneOf() { 
  }

  public ListAProjectSIssues200ResponseInnerMetadataOneOf filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public ListAProjectSIssues200ResponseInnerMetadataOneOf type(String type) {
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


  public ListAProjectSIssues200ResponseInnerMetadataOneOf value(String value) {
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


  /**
   * Return true if this List_a_Project_s_Issues_200_response_inner_metadata_oneOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSIssues200ResponseInnerMetadataOneOf listAProjectSIssues200ResponseInnerMetadataOneOf = (ListAProjectSIssues200ResponseInnerMetadataOneOf) o;
    return Objects.equals(this.filename, listAProjectSIssues200ResponseInnerMetadataOneOf.filename) &&
        Objects.equals(this.type, listAProjectSIssues200ResponseInnerMetadataOneOf.type) &&
        Objects.equals(this.value, listAProjectSIssues200ResponseInnerMetadataOneOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSIssues200ResponseInnerMetadataOneOf {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

