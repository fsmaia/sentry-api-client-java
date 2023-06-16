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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsForbiddenErrorResponseJSON;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnEventForAProject200ResponseContextResp
 */
@JsonPropertyOrder({
  RetrieveAnEventForAProject200ResponseContextResp.JSON_PROPERTY_STATUS,
  RetrieveAnEventForAProject200ResponseContextResp.JSON_PROPERTY_RESPONSE_J_S_O_N,
  RetrieveAnEventForAProject200ResponseContextResp.JSON_PROPERTY_NAME,
  RetrieveAnEventForAProject200ResponseContextResp.JSON_PROPERTY_STATUS_TEXT,
  RetrieveAnEventForAProject200ResponseContextResp.JSON_PROPERTY_MESSAGE,
  RetrieveAnEventForAProject200ResponseContextResp.JSON_PROPERTY_STACK
})
@JsonTypeName("Retrieve_an_Event_for_a_Project_200_response_context_resp")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class RetrieveAnEventForAProject200ResponseContextResp {
  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_RESPONSE_J_S_O_N = "responseJSON";
  private ResolveAnEventID200ResponseEventContextsForbiddenErrorResponseJSON responseJSON;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS_TEXT = "statusText";
  private String statusText;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_STACK = "stack";
  private String stack;

  public RetrieveAnEventForAProject200ResponseContextResp() { 
  }

  public RetrieveAnEventForAProject200ResponseContextResp status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public RetrieveAnEventForAProject200ResponseContextResp responseJSON(ResolveAnEventID200ResponseEventContextsForbiddenErrorResponseJSON responseJSON) {
    this.responseJSON = responseJSON;
    return this;
  }

   /**
   * Get responseJSON
   * @return responseJSON
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_J_S_O_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolveAnEventID200ResponseEventContextsForbiddenErrorResponseJSON getResponseJSON() {
    return responseJSON;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_J_S_O_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseJSON(ResolveAnEventID200ResponseEventContextsForbiddenErrorResponseJSON responseJSON) {
    this.responseJSON = responseJSON;
  }


  public RetrieveAnEventForAProject200ResponseContextResp name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public RetrieveAnEventForAProject200ResponseContextResp statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Get statusText
   * @return statusText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusText() {
    return statusText;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }


  public RetrieveAnEventForAProject200ResponseContextResp message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public RetrieveAnEventForAProject200ResponseContextResp stack(String stack) {
    this.stack = stack;
    return this;
  }

   /**
   * Get stack
   * @return stack
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStack() {
    return stack;
  }


  @JsonProperty(JSON_PROPERTY_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStack(String stack) {
    this.stack = stack;
  }


  /**
   * Return true if this Retrieve_an_Event_for_a_Project_200_response_context_resp object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnEventForAProject200ResponseContextResp retrieveAnEventForAProject200ResponseContextResp = (RetrieveAnEventForAProject200ResponseContextResp) o;
    return Objects.equals(this.status, retrieveAnEventForAProject200ResponseContextResp.status) &&
        Objects.equals(this.responseJSON, retrieveAnEventForAProject200ResponseContextResp.responseJSON) &&
        Objects.equals(this.name, retrieveAnEventForAProject200ResponseContextResp.name) &&
        Objects.equals(this.statusText, retrieveAnEventForAProject200ResponseContextResp.statusText) &&
        Objects.equals(this.message, retrieveAnEventForAProject200ResponseContextResp.message) &&
        Objects.equals(this.stack, retrieveAnEventForAProject200ResponseContextResp.stack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, responseJSON, name, statusText, message, stack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnEventForAProject200ResponseContextResp {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    responseJSON: ").append(toIndentedString(responseJSON)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
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

