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
import com.sentry.api.client.model.ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnOrganizationSPaginatedTeams200ResponseResourcesInner
 */
@JsonPropertyOrder({
  ListAnOrganizationSPaginatedTeams200ResponseResourcesInner.JSON_PROPERTY_SCHEMAS,
  ListAnOrganizationSPaginatedTeams200ResponseResourcesInner.JSON_PROPERTY_ID,
  ListAnOrganizationSPaginatedTeams200ResponseResourcesInner.JSON_PROPERTY_DISPLAY_NAME,
  ListAnOrganizationSPaginatedTeams200ResponseResourcesInner.JSON_PROPERTY_MEMBERS,
  ListAnOrganizationSPaginatedTeams200ResponseResourcesInner.JSON_PROPERTY_META
})
@JsonTypeName("List_an_Organization_s_Paginated_Teams_200_response_Resources_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class ListAnOrganizationSPaginatedTeams200ResponseResourcesInner {
  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private List<String> schemas = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  private List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta meta;

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner() { 
  }

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner addSchemasItem(String schemasItem) {
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


  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner id(String id) {
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


  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner displayName(String displayName) {
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


  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner members(List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members) {
    this.members = members;
    return this;
  }

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner addMembersItem(ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner membersItem) {
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> getMembers() {
    return members;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMembers(List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members) {
    this.members = members;
  }


  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner meta(ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this List_an_Organization_s_Paginated_Teams_200_response_Resources_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSPaginatedTeams200ResponseResourcesInner listAnOrganizationSPaginatedTeams200ResponseResourcesInner = (ListAnOrganizationSPaginatedTeams200ResponseResourcesInner) o;
    return Objects.equals(this.schemas, listAnOrganizationSPaginatedTeams200ResponseResourcesInner.schemas) &&
        Objects.equals(this.id, listAnOrganizationSPaginatedTeams200ResponseResourcesInner.id) &&
        Objects.equals(this.displayName, listAnOrganizationSPaginatedTeams200ResponseResourcesInner.displayName) &&
        Objects.equals(this.members, listAnOrganizationSPaginatedTeams200ResponseResourcesInner.members) &&
        Objects.equals(this.meta, listAnOrganizationSPaginatedTeams200ResponseResourcesInner.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, displayName, members, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSPaginatedTeams200ResponseResourcesInner {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

