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
import com.sentry.api.client.model.CreateAMonitorRequestAlertRule;
import com.sentry.api.client.model.CreateANewCheckInRequestMonitorConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * Allows parameters to be defined in snake case, but passed as camel case.  Errors are output in camel case.
 */
@JsonPropertyOrder({
  CreateAMonitorRequest.JSON_PROPERTY_PROJECT,
  CreateAMonitorRequest.JSON_PROPERTY_NAME,
  CreateAMonitorRequest.JSON_PROPERTY_SLUG,
  CreateAMonitorRequest.JSON_PROPERTY_STATUS,
  CreateAMonitorRequest.JSON_PROPERTY_TYPE,
  CreateAMonitorRequest.JSON_PROPERTY_CONFIG,
  CreateAMonitorRequest.JSON_PROPERTY_ALERT_RULE
})
@JsonTypeName("Create_a_monitor_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:23:11.909078Z[Etc/UTC]")
public class CreateAMonitorRequest {
  public static final String JSON_PROPERTY_PROJECT = "project";
  private String project;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    DISABLED("disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status = StatusEnum.ACTIVE;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CRON_JOB("cron_job");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private CreateANewCheckInRequestMonitorConfig config;

  public static final String JSON_PROPERTY_ALERT_RULE = "alert_rule";
  private CreateAMonitorRequestAlertRule alertRule;

  public CreateAMonitorRequest() { 
  }

  public CreateAMonitorRequest project(String project) {
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

  public String getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProject(String project) {
    this.project = project;
  }


  public CreateAMonitorRequest name(String name) {
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


  public CreateAMonitorRequest slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


  public CreateAMonitorRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CreateAMonitorRequest type(TypeEnum type) {
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

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateAMonitorRequest config(CreateANewCheckInRequestMonitorConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateANewCheckInRequestMonitorConfig getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfig(CreateANewCheckInRequestMonitorConfig config) {
    this.config = config;
  }


  public CreateAMonitorRequest alertRule(CreateAMonitorRequestAlertRule alertRule) {
    this.alertRule = alertRule;
    return this;
  }

   /**
   * Get alertRule
   * @return alertRule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateAMonitorRequestAlertRule getAlertRule() {
    return alertRule;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertRule(CreateAMonitorRequestAlertRule alertRule) {
    this.alertRule = alertRule;
  }


  /**
   * Return true if this Create_a_monitor_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAMonitorRequest createAMonitorRequest = (CreateAMonitorRequest) o;
    return Objects.equals(this.project, createAMonitorRequest.project) &&
        Objects.equals(this.name, createAMonitorRequest.name) &&
        Objects.equals(this.slug, createAMonitorRequest.slug) &&
        Objects.equals(this.status, createAMonitorRequest.status) &&
        Objects.equals(this.type, createAMonitorRequest.type) &&
        Objects.equals(this.config, createAMonitorRequest.config) &&
        Objects.equals(this.alertRule, createAMonitorRequest.alertRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, name, slug, status, type, config, alertRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAMonitorRequest {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    alertRule: ").append(toIndentedString(alertRule)).append("\n");
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

