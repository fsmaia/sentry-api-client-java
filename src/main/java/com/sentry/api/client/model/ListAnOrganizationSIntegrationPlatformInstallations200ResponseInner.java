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
import com.sentry.api.client.model.ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerApp;
import com.sentry.api.client.model.ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner
 */
@JsonPropertyOrder({
  ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner.JSON_PROPERTY_APP,
  ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner.JSON_PROPERTY_ORGANIZATION,
  ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner.JSON_PROPERTY_UUID,
  ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner.JSON_PROPERTY_STATUS
})
@JsonTypeName("List_an_Organization_s_Integration_Platform_Installations_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner {
  public static final String JSON_PROPERTY_APP = "app";
  private ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerApp app;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization organization;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner() { 
  }

  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner app(ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerApp app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerApp getApp() {
    return app;
  }


  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApp(ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerApp app) {
    this.app = app;
  }


  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner organization(ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrganization(ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization organization) {
    this.organization = organization;
  }


  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner status(String status) {
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

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this List_an_Organization_s_Integration_Platform_Installations_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner listAnOrganizationSIntegrationPlatformInstallations200ResponseInner = (ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner) o;
    return Objects.equals(this.app, listAnOrganizationSIntegrationPlatformInstallations200ResponseInner.app) &&
        Objects.equals(this.organization, listAnOrganizationSIntegrationPlatformInstallations200ResponseInner.organization) &&
        Objects.equals(this.uuid, listAnOrganizationSIntegrationPlatformInstallations200ResponseInner.uuid) &&
        Objects.equals(this.status, listAnOrganizationSIntegrationPlatformInstallations200ResponseInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, organization, uuid, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

