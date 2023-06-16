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
 * RetrieveAnOrganizationMember200ResponseTeamRolesInner
 */
@JsonPropertyOrder({
  RetrieveAnOrganizationMember200ResponseTeamRolesInner.JSON_PROPERTY_TEAM_SLUG,
  RetrieveAnOrganizationMember200ResponseTeamRolesInner.JSON_PROPERTY_ROLE
})
@JsonTypeName("Retrieve_an_Organization_Member_200_response_teamRoles_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseTeamRolesInner {
  public static final String JSON_PROPERTY_TEAM_SLUG = "teamSlug";
  private String teamSlug;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public RetrieveAnOrganizationMember200ResponseTeamRolesInner() { 
  }

  public RetrieveAnOrganizationMember200ResponseTeamRolesInner teamSlug(String teamSlug) {
    this.teamSlug = teamSlug;
    return this;
  }

   /**
   * Get teamSlug
   * @return teamSlug
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEAM_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTeamSlug() {
    return teamSlug;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeamSlug(String teamSlug) {
    this.teamSlug = teamSlug;
  }


  public RetrieveAnOrganizationMember200ResponseTeamRolesInner role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(String role) {
    this.role = role;
  }


  /**
   * Return true if this Retrieve_an_Organization_Member_200_response_teamRoles_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganizationMember200ResponseTeamRolesInner retrieveAnOrganizationMember200ResponseTeamRolesInner = (RetrieveAnOrganizationMember200ResponseTeamRolesInner) o;
    return Objects.equals(this.teamSlug, retrieveAnOrganizationMember200ResponseTeamRolesInner.teamSlug) &&
        Objects.equals(this.role, retrieveAnOrganizationMember200ResponseTeamRolesInner.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamSlug, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseTeamRolesInner {\n");
    sb.append("    teamSlug: ").append(toIndentedString(teamSlug)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

