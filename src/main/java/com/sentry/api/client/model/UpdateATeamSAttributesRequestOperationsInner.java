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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * UpdateATeamSAttributesRequestOperationsInner
 */
@JsonPropertyOrder({
  UpdateATeamSAttributesRequestOperationsInner.JSON_PROPERTY_OP,
  UpdateATeamSAttributesRequestOperationsInner.JSON_PROPERTY_VALUE,
  UpdateATeamSAttributesRequestOperationsInner.JSON_PROPERTY_PATH
})
@JsonTypeName("Update_a_Team_s_Attributes_request_Operations_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class UpdateATeamSAttributesRequestOperationsInner {
  public static final String JSON_PROPERTY_OP = "op";
  private String op;

  public static final String JSON_PROPERTY_VALUE = "value";
  private List<Object> value = new ArrayList<>();

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public UpdateATeamSAttributesRequestOperationsInner() { 
  }

  @JsonCreator
  public UpdateATeamSAttributesRequestOperationsInner(
    @JsonProperty(JSON_PROPERTY_VALUE) List<Object> value
  ) {
    this();
    this.value = value;
  }

  public UpdateATeamSAttributesRequestOperationsInner op(String op) {
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


   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getValue() {
    return value;
  }




  public UpdateATeamSAttributesRequestOperationsInner path(String path) {
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
   * Return true if this Update_a_Team_s_Attributes_request_Operations_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateATeamSAttributesRequestOperationsInner updateATeamSAttributesRequestOperationsInner = (UpdateATeamSAttributesRequestOperationsInner) o;
    return Objects.equals(this.op, updateATeamSAttributesRequestOperationsInner.op) &&
        Objects.equals(this.value, updateATeamSAttributesRequestOperationsInner.value) &&
        Objects.equals(this.path, updateATeamSAttributesRequestOperationsInner.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, value, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateATeamSAttributesRequestOperationsInner {\n");
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

