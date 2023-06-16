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
import com.sentry.api.client.model.ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ProvisionANewTeamRequest
 */
@JsonPropertyOrder({
  ProvisionANewTeamRequest.JSON_PROPERTY_SCHEMAS,
  ProvisionANewTeamRequest.JSON_PROPERTY_DISPLAY_NAME,
  ProvisionANewTeamRequest.JSON_PROPERTY_MEMBERS
})
@JsonTypeName("Provision_a_New_Team_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ProvisionANewTeamRequest {
  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private List<String> schemas = new ArrayList<>();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  private List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members;

  public ProvisionANewTeamRequest() { 
  }

  public ProvisionANewTeamRequest schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public ProvisionANewTeamRequest addSchemasItem(String schemasItem) {
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


  public ProvisionANewTeamRequest displayName(String displayName) {
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


  public ProvisionANewTeamRequest members(List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members) {
    this.members = members;
    return this;
  }

  public ProvisionANewTeamRequest addMembersItem(ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> getMembers() {
    return members;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMembers(List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members) {
    this.members = members;
  }


  /**
   * Return true if this Provision_a_New_Team_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionANewTeamRequest provisionANewTeamRequest = (ProvisionANewTeamRequest) o;
    return Objects.equals(this.schemas, provisionANewTeamRequest.schemas) &&
        Objects.equals(this.displayName, provisionANewTeamRequest.displayName) &&
        Objects.equals(this.members, provisionANewTeamRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, displayName, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionANewTeamRequest {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

