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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * CreateANewDeployForAnOrganizationRequest
 */
@JsonPropertyOrder({
  CreateANewDeployForAnOrganizationRequest.JSON_PROPERTY_ENVIRONMENT,
  CreateANewDeployForAnOrganizationRequest.JSON_PROPERTY_URL,
  CreateANewDeployForAnOrganizationRequest.JSON_PROPERTY_NAME,
  CreateANewDeployForAnOrganizationRequest.JSON_PROPERTY_PROJECTS,
  CreateANewDeployForAnOrganizationRequest.JSON_PROPERTY_DATE_STARTED,
  CreateANewDeployForAnOrganizationRequest.JSON_PROPERTY_DATE_FINISHED
})
@JsonTypeName("Create_a_New_Deploy_for_an_Organization_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class CreateANewDeployForAnOrganizationRequest {
  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private List<String> projects;

  public static final String JSON_PROPERTY_DATE_STARTED = "dateStarted";
  private OffsetDateTime dateStarted;

  public static final String JSON_PROPERTY_DATE_FINISHED = "dateFinished";
  private OffsetDateTime dateFinished;

  public CreateANewDeployForAnOrganizationRequest() { 
  }

  public CreateANewDeployForAnOrganizationRequest environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment you&#39;re deploying to.
   * @return environment
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public CreateANewDeployForAnOrganizationRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The optional URL that points to the deploy.
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public CreateANewDeployForAnOrganizationRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The optional name of the deploy.
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


  public CreateANewDeployForAnOrganizationRequest projects(List<String> projects) {
    this.projects = projects;
    return this;
  }

  public CreateANewDeployForAnOrganizationRequest addProjectsItem(String projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * The optional list of projects to deploy.
   * @return projects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProjects() {
    return projects;
  }


  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjects(List<String> projects) {
    this.projects = projects;
  }


  public CreateANewDeployForAnOrganizationRequest dateStarted(OffsetDateTime dateStarted) {
    this.dateStarted = dateStarted;
    return this;
  }

   /**
   * An optional date that indicates when the deploy started.
   * @return dateStarted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_STARTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateStarted() {
    return dateStarted;
  }


  @JsonProperty(JSON_PROPERTY_DATE_STARTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateStarted(OffsetDateTime dateStarted) {
    this.dateStarted = dateStarted;
  }


  public CreateANewDeployForAnOrganizationRequest dateFinished(OffsetDateTime dateFinished) {
    this.dateFinished = dateFinished;
    return this;
  }

   /**
   * An optional date that indicates when the deploy ended. If not provided, the current time is used.
   * @return dateFinished
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_FINISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateFinished() {
    return dateFinished;
  }


  @JsonProperty(JSON_PROPERTY_DATE_FINISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateFinished(OffsetDateTime dateFinished) {
    this.dateFinished = dateFinished;
  }


  /**
   * Return true if this Create_a_New_Deploy_for_an_Organization_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateANewDeployForAnOrganizationRequest createANewDeployForAnOrganizationRequest = (CreateANewDeployForAnOrganizationRequest) o;
    return Objects.equals(this.environment, createANewDeployForAnOrganizationRequest.environment) &&
        Objects.equals(this.url, createANewDeployForAnOrganizationRequest.url) &&
        Objects.equals(this.name, createANewDeployForAnOrganizationRequest.name) &&
        Objects.equals(this.projects, createANewDeployForAnOrganizationRequest.projects) &&
        Objects.equals(this.dateStarted, createANewDeployForAnOrganizationRequest.dateStarted) &&
        Objects.equals(this.dateFinished, createANewDeployForAnOrganizationRequest.dateFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, url, name, projects, dateStarted, dateFinished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateANewDeployForAnOrganizationRequest {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
    sb.append("    dateFinished: ").append(toIndentedString(dateFinished)).append("\n");
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

