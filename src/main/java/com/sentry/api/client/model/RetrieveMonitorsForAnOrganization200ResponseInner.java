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
import com.sentry.api.client.model.RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments;
import com.sentry.api.client.model.RetrieveMonitorsForAnOrganization200ResponseInnerProject;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveMonitorsForAnOrganization200ResponseInner
 */
@JsonPropertyOrder({
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_ID,
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_NAME,
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_SLUG,
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_STATUS,
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_TYPE,
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_CONFIG,
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_DATE_CREATED,
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_PROJECT,
  RetrieveMonitorsForAnOrganization200ResponseInner.JSON_PROPERTY_ENVIRONMENTS
})
@JsonTypeName("Retrieve_monitors_for_an_organization_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class RetrieveMonitorsForAnOrganization200ResponseInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private Object config = null;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private RetrieveMonitorsForAnOrganization200ResponseInnerProject project;

  public static final String JSON_PROPERTY_ENVIRONMENTS = "environments";
  private RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments environments;

  public RetrieveMonitorsForAnOrganization200ResponseInner() { 
  }

  public RetrieveMonitorsForAnOrganization200ResponseInner id(String id) {
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


  public RetrieveMonitorsForAnOrganization200ResponseInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner status(String status) {
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


  public RetrieveMonitorsForAnOrganization200ResponseInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner config(Object config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfig(Object config) {
    this.config = config;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner project(RetrieveMonitorsForAnOrganization200ResponseInnerProject project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveMonitorsForAnOrganization200ResponseInnerProject getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProject(RetrieveMonitorsForAnOrganization200ResponseInnerProject project) {
    this.project = project;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner environments(RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments environments) {
    this.environments = environments;
    return this;
  }

   /**
   * Get environments
   * @return environments
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENVIRONMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments getEnvironments() {
    return environments;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnvironments(RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments environments) {
    this.environments = environments;
  }


  /**
   * Return true if this Retrieve_monitors_for_an_organization_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveMonitorsForAnOrganization200ResponseInner retrieveMonitorsForAnOrganization200ResponseInner = (RetrieveMonitorsForAnOrganization200ResponseInner) o;
    return Objects.equals(this.id, retrieveMonitorsForAnOrganization200ResponseInner.id) &&
        Objects.equals(this.name, retrieveMonitorsForAnOrganization200ResponseInner.name) &&
        Objects.equals(this.slug, retrieveMonitorsForAnOrganization200ResponseInner.slug) &&
        Objects.equals(this.status, retrieveMonitorsForAnOrganization200ResponseInner.status) &&
        Objects.equals(this.type, retrieveMonitorsForAnOrganization200ResponseInner.type) &&
        Objects.equals(this.config, retrieveMonitorsForAnOrganization200ResponseInner.config) &&
        Objects.equals(this.dateCreated, retrieveMonitorsForAnOrganization200ResponseInner.dateCreated) &&
        Objects.equals(this.project, retrieveMonitorsForAnOrganization200ResponseInner.project) &&
        Objects.equals(this.environments, retrieveMonitorsForAnOrganization200ResponseInner.environments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, slug, status, type, config, dateCreated, project, environments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveMonitorsForAnOrganization200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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

