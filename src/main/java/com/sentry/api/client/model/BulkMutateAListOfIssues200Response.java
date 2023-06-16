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
 * BulkMutateAListOfIssues200Response
 */
@JsonPropertyOrder({
  BulkMutateAListOfIssues200Response.JSON_PROPERTY_IS_PUBLIC,
  BulkMutateAListOfIssues200Response.JSON_PROPERTY_STATUS,
  BulkMutateAListOfIssues200Response.JSON_PROPERTY_STATUS_DETAILS
})
@JsonTypeName("Bulk_Mutate_a_List_of_Issues_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class BulkMutateAListOfIssues200Response {
  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  private Boolean isPublic;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RESOLVED("resolved"),
    
    UNRESOLVED("unresolved"),
    
    IGNORED("ignored");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_STATUS_DETAILS = "statusDetails";
  private Object statusDetails;

  public BulkMutateAListOfIssues200Response() { 
  }

  public BulkMutateAListOfIssues200Response isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public BulkMutateAListOfIssues200Response status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BulkMutateAListOfIssues200Response statusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Get statusDetails
   * @return statusDetails
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getStatusDetails() {
    return statusDetails;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
  }


  /**
   * Return true if this Bulk_Mutate_a_List_of_Issues_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkMutateAListOfIssues200Response bulkMutateAListOfIssues200Response = (BulkMutateAListOfIssues200Response) o;
    return Objects.equals(this.isPublic, bulkMutateAListOfIssues200Response.isPublic) &&
        Objects.equals(this.status, bulkMutateAListOfIssues200Response.status) &&
        Objects.equals(this.statusDetails, bulkMutateAListOfIssues200Response.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPublic, status, statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkMutateAListOfIssues200Response {\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

