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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * MonitorCheckIn
 */
@JsonPropertyOrder({
  MonitorCheckIn.JSON_PROPERTY_ID,
  MonitorCheckIn.JSON_PROPERTY_ENVIRONMENT,
  MonitorCheckIn.JSON_PROPERTY_STATUS,
  MonitorCheckIn.JSON_PROPERTY_DURATION,
  MonitorCheckIn.JSON_PROPERTY_DATE_CREATED,
  MonitorCheckIn.JSON_PROPERTY_ATTACHMENT_ID,
  MonitorCheckIn.JSON_PROPERTY_EXPECTED_TIME,
  MonitorCheckIn.JSON_PROPERTY_MONITOR_CONFIG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class MonitorCheckIn {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachmentId";
  private String attachmentId;

  public static final String JSON_PROPERTY_EXPECTED_TIME = "expectedTime";
  private OffsetDateTime expectedTime;

  public static final String JSON_PROPERTY_MONITOR_CONFIG = "monitorConfig";
  private Object monitorConfig = null;

  public MonitorCheckIn() { 
  }

  public MonitorCheckIn id(String id) {
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


  public MonitorCheckIn environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
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


  public MonitorCheckIn status(String status) {
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


  public MonitorCheckIn duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public MonitorCheckIn dateCreated(OffsetDateTime dateCreated) {
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


  public MonitorCheckIn attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * Get attachmentId
   * @return attachmentId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAttachmentId() {
    return attachmentId;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  public MonitorCheckIn expectedTime(OffsetDateTime expectedTime) {
    this.expectedTime = expectedTime;
    return this;
  }

   /**
   * Get expectedTime
   * @return expectedTime
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPECTED_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getExpectedTime() {
    return expectedTime;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpectedTime(OffsetDateTime expectedTime) {
    this.expectedTime = expectedTime;
  }


  public MonitorCheckIn monitorConfig(Object monitorConfig) {
    this.monitorConfig = monitorConfig;
    return this;
  }

   /**
   * Get monitorConfig
   * @return monitorConfig
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMonitorConfig() {
    return monitorConfig;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonitorConfig(Object monitorConfig) {
    this.monitorConfig = monitorConfig;
  }


  /**
   * Return true if this MonitorCheckIn object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorCheckIn monitorCheckIn = (MonitorCheckIn) o;
    return Objects.equals(this.id, monitorCheckIn.id) &&
        Objects.equals(this.environment, monitorCheckIn.environment) &&
        Objects.equals(this.status, monitorCheckIn.status) &&
        Objects.equals(this.duration, monitorCheckIn.duration) &&
        Objects.equals(this.dateCreated, monitorCheckIn.dateCreated) &&
        Objects.equals(this.attachmentId, monitorCheckIn.attachmentId) &&
        Objects.equals(this.expectedTime, monitorCheckIn.expectedTime) &&
        Objects.equals(this.monitorConfig, monitorCheckIn.monitorConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, environment, status, duration, dateCreated, attachmentId, expectedTime, monitorConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorCheckIn {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    expectedTime: ").append(toIndentedString(expectedTime)).append("\n");
    sb.append("    monitorConfig: ").append(toIndentedString(monitorConfig)).append("\n");
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

