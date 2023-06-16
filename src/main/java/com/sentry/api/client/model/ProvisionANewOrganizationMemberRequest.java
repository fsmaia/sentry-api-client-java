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
 * ProvisionANewOrganizationMemberRequest
 */
@JsonPropertyOrder({
  ProvisionANewOrganizationMemberRequest.JSON_PROPERTY_USER_NAME,
  ProvisionANewOrganizationMemberRequest.JSON_PROPERTY_SENTRY_ORG_ROLE
})
@JsonTypeName("Provision_a_New_Organization_Member_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ProvisionANewOrganizationMemberRequest {
  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_SENTRY_ORG_ROLE = "sentryOrgRole";
  private String sentryOrgRole;

  public ProvisionANewOrganizationMemberRequest() { 
  }

  public ProvisionANewOrganizationMemberRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ProvisionANewOrganizationMemberRequest sentryOrgRole(String sentryOrgRole) {
    this.sentryOrgRole = sentryOrgRole;
    return this;
  }

   /**
   * Get sentryOrgRole
   * @return sentryOrgRole
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENTRY_ORG_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSentryOrgRole() {
    return sentryOrgRole;
  }


  @JsonProperty(JSON_PROPERTY_SENTRY_ORG_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentryOrgRole(String sentryOrgRole) {
    this.sentryOrgRole = sentryOrgRole;
  }


  /**
   * Return true if this Provision_a_New_Organization_Member_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionANewOrganizationMemberRequest provisionANewOrganizationMemberRequest = (ProvisionANewOrganizationMemberRequest) o;
    return Objects.equals(this.userName, provisionANewOrganizationMemberRequest.userName) &&
        Objects.equals(this.sentryOrgRole, provisionANewOrganizationMemberRequest.sentryOrgRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, sentryOrgRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionANewOrganizationMemberRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    sentryOrgRole: ").append(toIndentedString(sentryOrgRole)).append("\n");
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

