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
 * CreateAnExternalIssue200Response
 */
@JsonPropertyOrder({
  CreateAnExternalIssue200Response.JSON_PROPERTY_ID,
  CreateAnExternalIssue200Response.JSON_PROPERTY_ISSUE_ID,
  CreateAnExternalIssue200Response.JSON_PROPERTY_SERVICE_TYPE,
  CreateAnExternalIssue200Response.JSON_PROPERTY_DISPLAY_NAME,
  CreateAnExternalIssue200Response.JSON_PROPERTY_WEB_URL
})
@JsonTypeName("Create_an_External_Issue_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class CreateAnExternalIssue200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ISSUE_ID = "issueId";
  private String issueId;

  public static final String JSON_PROPERTY_SERVICE_TYPE = "serviceType";
  private String serviceType;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_WEB_URL = "webUrl";
  private String webUrl;

  public CreateAnExternalIssue200Response() { 
  }

  public CreateAnExternalIssue200Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public CreateAnExternalIssue200Response issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

   /**
   * Get issueId
   * @return issueId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIssueId() {
    return issueId;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }


  public CreateAnExternalIssue200Response serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceType() {
    return serviceType;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  public CreateAnExternalIssue200Response displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateAnExternalIssue200Response webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

   /**
   * Get webUrl
   * @return webUrl
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEB_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWebUrl() {
    return webUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEB_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  /**
   * Return true if this Create_an_External_Issue_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAnExternalIssue200Response createAnExternalIssue200Response = (CreateAnExternalIssue200Response) o;
    return Objects.equals(this.id, createAnExternalIssue200Response.id) &&
        Objects.equals(this.issueId, createAnExternalIssue200Response.issueId) &&
        Objects.equals(this.serviceType, createAnExternalIssue200Response.serviceType) &&
        Objects.equals(this.displayName, createAnExternalIssue200Response.displayName) &&
        Objects.equals(this.webUrl, createAnExternalIssue200Response.webUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, issueId, serviceType, displayName, webUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAnExternalIssue200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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

