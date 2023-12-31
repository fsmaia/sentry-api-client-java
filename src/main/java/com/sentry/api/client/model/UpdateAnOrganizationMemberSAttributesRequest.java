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
import com.sentry.api.client.model.UpdateAnOrganizationMemberSAttributesRequestOperationsInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * UpdateAnOrganizationMemberSAttributesRequest
 */
@JsonPropertyOrder({
  UpdateAnOrganizationMemberSAttributesRequest.JSON_PROPERTY_SCHEMAS,
  UpdateAnOrganizationMemberSAttributesRequest.JSON_PROPERTY_OPERATIONS
})
@JsonTypeName("Update_an_Organization_Member_s_Attributes_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class UpdateAnOrganizationMemberSAttributesRequest {
  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private List<String> schemas;

  public static final String JSON_PROPERTY_OPERATIONS = "Operations";
  private List<UpdateAnOrganizationMemberSAttributesRequestOperationsInner> operations = new ArrayList<>();

  public UpdateAnOrganizationMemberSAttributesRequest() { 
  }

  public UpdateAnOrganizationMemberSAttributesRequest schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public UpdateAnOrganizationMemberSAttributesRequest addSchemasItem(String schemasItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSchemas() {
    return schemas;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }


  public UpdateAnOrganizationMemberSAttributesRequest operations(List<UpdateAnOrganizationMemberSAttributesRequestOperationsInner> operations) {
    this.operations = operations;
    return this;
  }

  public UpdateAnOrganizationMemberSAttributesRequest addOperationsItem(UpdateAnOrganizationMemberSAttributesRequestOperationsInner operationsItem) {
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

  public List<UpdateAnOrganizationMemberSAttributesRequestOperationsInner> getOperations() {
    return operations;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperations(List<UpdateAnOrganizationMemberSAttributesRequestOperationsInner> operations) {
    this.operations = operations;
  }


  /**
   * Return true if this Update_an_Organization_Member_s_Attributes_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnOrganizationMemberSAttributesRequest updateAnOrganizationMemberSAttributesRequest = (UpdateAnOrganizationMemberSAttributesRequest) o;
    return Objects.equals(this.schemas, updateAnOrganizationMemberSAttributesRequest.schemas) &&
        Objects.equals(this.operations, updateAnOrganizationMemberSAttributesRequest.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnOrganizationMemberSAttributesRequest {\n");
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

