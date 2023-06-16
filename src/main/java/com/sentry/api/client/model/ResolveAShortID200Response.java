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
import com.sentry.api.client.model.ResolveAShortID200ResponseGroup;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAShortID200Response
 */
@JsonPropertyOrder({
  ResolveAShortID200Response.JSON_PROPERTY_ORGANIZATION_SLUG,
  ResolveAShortID200Response.JSON_PROPERTY_PROJECT_SLUG,
  ResolveAShortID200Response.JSON_PROPERTY_SHORT_ID,
  ResolveAShortID200Response.JSON_PROPERTY_GROUP,
  ResolveAShortID200Response.JSON_PROPERTY_GROUP_ID
})
@JsonTypeName("Resolve_a_Short_ID_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class ResolveAShortID200Response {
  public static final String JSON_PROPERTY_ORGANIZATION_SLUG = "organizationSlug";
  private String organizationSlug;

  public static final String JSON_PROPERTY_PROJECT_SLUG = "projectSlug";
  private String projectSlug;

  public static final String JSON_PROPERTY_SHORT_ID = "shortId";
  private String shortId;

  public static final String JSON_PROPERTY_GROUP = "group";
  private ResolveAShortID200ResponseGroup group;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public ResolveAShortID200Response() { 
  }

  public ResolveAShortID200Response organizationSlug(String organizationSlug) {
    this.organizationSlug = organizationSlug;
    return this;
  }

   /**
   * Get organizationSlug
   * @return organizationSlug
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrganizationSlug() {
    return organizationSlug;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrganizationSlug(String organizationSlug) {
    this.organizationSlug = organizationSlug;
  }


  public ResolveAShortID200Response projectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
    return this;
  }

   /**
   * Get projectSlug
   * @return projectSlug
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECT_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProjectSlug() {
    return projectSlug;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }


  public ResolveAShortID200Response shortId(String shortId) {
    this.shortId = shortId;
    return this;
  }

   /**
   * Get shortId
   * @return shortId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHORT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShortId() {
    return shortId;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShortId(String shortId) {
    this.shortId = shortId;
  }


  public ResolveAShortID200Response group(ResolveAShortID200ResponseGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAShortID200ResponseGroup getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroup(ResolveAShortID200ResponseGroup group) {
    this.group = group;
  }


  public ResolveAShortID200Response groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  /**
   * Return true if this Resolve_a_Short_ID_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAShortID200Response resolveAShortID200Response = (ResolveAShortID200Response) o;
    return Objects.equals(this.organizationSlug, resolveAShortID200Response.organizationSlug) &&
        Objects.equals(this.projectSlug, resolveAShortID200Response.projectSlug) &&
        Objects.equals(this.shortId, resolveAShortID200Response.shortId) &&
        Objects.equals(this.group, resolveAShortID200Response.group) &&
        Objects.equals(this.groupId, resolveAShortID200Response.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationSlug, projectSlug, shortId, group, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAShortID200Response {\n");
    sb.append("    organizationSlug: ").append(toIndentedString(organizationSlug)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

