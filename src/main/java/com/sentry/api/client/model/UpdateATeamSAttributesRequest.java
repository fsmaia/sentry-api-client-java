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
import com.sentry.api.client.model.UpdateATeamSAttributesRequestOperationsInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * UpdateATeamSAttributesRequest
 */
@JsonPropertyOrder({
  UpdateATeamSAttributesRequest.JSON_PROPERTY_SCHEMAS,
  UpdateATeamSAttributesRequest.JSON_PROPERTY_OPERATIONS
})
@JsonTypeName("Update_a_Team_s_Attributes_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class UpdateATeamSAttributesRequest {
  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private List<String> schemas = new ArrayList<>();

  public static final String JSON_PROPERTY_OPERATIONS = "Operations";
  private List<UpdateATeamSAttributesRequestOperationsInner> operations = new ArrayList<>();

  public UpdateATeamSAttributesRequest() { 
  }

  public UpdateATeamSAttributesRequest schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public UpdateATeamSAttributesRequest addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSchemas() {
    return schemas;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }


  public UpdateATeamSAttributesRequest operations(List<UpdateATeamSAttributesRequestOperationsInner> operations) {
    this.operations = operations;
    return this;
  }

  public UpdateATeamSAttributesRequest addOperationsItem(UpdateATeamSAttributesRequestOperationsInner operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UpdateATeamSAttributesRequestOperationsInner> getOperations() {
    return operations;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperations(List<UpdateATeamSAttributesRequestOperationsInner> operations) {
    this.operations = operations;
  }


  /**
   * Return true if this Update_a_Team_s_Attributes_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateATeamSAttributesRequest updateATeamSAttributesRequest = (UpdateATeamSAttributesRequest) o;
    return Objects.equals(this.schemas, updateATeamSAttributesRequest.schemas) &&
        Objects.equals(this.operations, updateATeamSAttributesRequest.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateATeamSAttributesRequest {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

