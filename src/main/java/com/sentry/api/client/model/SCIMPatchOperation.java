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
 * SCIMPatchOperation
 */
@JsonPropertyOrder({
  SCIMPatchOperation.JSON_PROPERTY_OP,
  SCIMPatchOperation.JSON_PROPERTY_VALUE,
  SCIMPatchOperation.JSON_PROPERTY_PATH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class SCIMPatchOperation {
  public static final String JSON_PROPERTY_OP = "op";
  private String op;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public SCIMPatchOperation() { 
  }

  public SCIMPatchOperation op(String op) {
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOp() {
    return op;
  }


  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOp(String op) {
    this.op = op;
  }


  public SCIMPatchOperation value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(Object value) {
    this.value = value;
  }


  public SCIMPatchOperation path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  /**
   * Return true if this SCIMPatchOperation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCIMPatchOperation scIMPatchOperation = (SCIMPatchOperation) o;
    return Objects.equals(this.op, scIMPatchOperation.op) &&
        Objects.equals(this.value, scIMPatchOperation.value) &&
        Objects.equals(this.path, scIMPatchOperation.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, value, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCIMPatchOperation {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

