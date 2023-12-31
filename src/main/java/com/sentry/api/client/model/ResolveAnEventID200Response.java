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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEvent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200Response
 */
@JsonPropertyOrder({
  ResolveAnEventID200Response.JSON_PROPERTY_EVENT,
  ResolveAnEventID200Response.JSON_PROPERTY_EVENT_ID,
  ResolveAnEventID200Response.JSON_PROPERTY_GROUP_ID,
  ResolveAnEventID200Response.JSON_PROPERTY_ORGANIZATION_SLUG,
  ResolveAnEventID200Response.JSON_PROPERTY_PROJECT_SLUG
})
@JsonTypeName("Resolve_an_Event_ID_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ResolveAnEventID200Response {
  public static final String JSON_PROPERTY_EVENT = "event";
  private ResolveAnEventID200ResponseEvent event;

  public static final String JSON_PROPERTY_EVENT_ID = "eventId";
  private String eventId;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_ORGANIZATION_SLUG = "organizationSlug";
  private String organizationSlug;

  public static final String JSON_PROPERTY_PROJECT_SLUG = "projectSlug";
  private String projectSlug;

  public ResolveAnEventID200Response() { 
  }

  public ResolveAnEventID200Response event(ResolveAnEventID200ResponseEvent event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAnEventID200ResponseEvent getEvent() {
    return event;
  }


  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvent(ResolveAnEventID200ResponseEvent event) {
    this.event = event;
  }


  public ResolveAnEventID200Response eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public ResolveAnEventID200Response groupId(String groupId) {
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


  public ResolveAnEventID200Response organizationSlug(String organizationSlug) {
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


  public ResolveAnEventID200Response projectSlug(String projectSlug) {
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


  /**
   * Return true if this Resolve_an_Event_ID_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200Response resolveAnEventID200Response = (ResolveAnEventID200Response) o;
    return Objects.equals(this.event, resolveAnEventID200Response.event) &&
        Objects.equals(this.eventId, resolveAnEventID200Response.eventId) &&
        Objects.equals(this.groupId, resolveAnEventID200Response.groupId) &&
        Objects.equals(this.organizationSlug, resolveAnEventID200Response.organizationSlug) &&
        Objects.equals(this.projectSlug, resolveAnEventID200Response.projectSlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, groupId, organizationSlug, projectSlug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200Response {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    organizationSlug: ").append(toIndentedString(organizationSlug)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
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

