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
import com.sentry.api.client.model.CreateANewCheckInRequestMonitorConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * CreateANewCheckInRequest
 */
@JsonPropertyOrder({
  CreateANewCheckInRequest.JSON_PROPERTY_STATUS,
  CreateANewCheckInRequest.JSON_PROPERTY_DURATION,
  CreateANewCheckInRequest.JSON_PROPERTY_ENVIRONMENT,
  CreateANewCheckInRequest.JSON_PROPERTY_MONITOR_CONFIG
})
@JsonTypeName("Create_a_new_check_in_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class CreateANewCheckInRequest {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("ok"),
    
    ERROR("error"),
    
    IN_PROGRESS("in_progress");

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
  private StatusEnum status;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private JsonNullable<Integer> duration = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private JsonNullable<String> environment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MONITOR_CONFIG = "monitor_config";
  private CreateANewCheckInRequestMonitorConfig monitorConfig;

  public CreateANewCheckInRequest() { 
  }

  public CreateANewCheckInRequest status(StatusEnum status) {
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

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CreateANewCheckInRequest duration(Integer duration) {
    this.duration = JsonNullable.<Integer>of(duration);
    return this;
  }

   /**
   * Get duration
   * minimum: 0
   * maximum: 2147483647
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getDuration() {
        return duration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getDuration_JsonNullable() {
    return duration;
  }
  
  @JsonProperty(JSON_PROPERTY_DURATION)
  public void setDuration_JsonNullable(JsonNullable<Integer> duration) {
    this.duration = duration;
  }

  public void setDuration(Integer duration) {
    this.duration = JsonNullable.<Integer>of(duration);
  }


  public CreateANewCheckInRequest environment(String environment) {
    this.environment = JsonNullable.<String>of(environment);
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getEnvironment() {
        return environment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEnvironment_JsonNullable() {
    return environment;
  }
  
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  public void setEnvironment_JsonNullable(JsonNullable<String> environment) {
    this.environment = environment;
  }

  public void setEnvironment(String environment) {
    this.environment = JsonNullable.<String>of(environment);
  }


  public CreateANewCheckInRequest monitorConfig(CreateANewCheckInRequestMonitorConfig monitorConfig) {
    this.monitorConfig = monitorConfig;
    return this;
  }

   /**
   * Get monitorConfig
   * @return monitorConfig
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateANewCheckInRequestMonitorConfig getMonitorConfig() {
    return monitorConfig;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorConfig(CreateANewCheckInRequestMonitorConfig monitorConfig) {
    this.monitorConfig = monitorConfig;
  }


  /**
   * Return true if this Create_a_new_check_in_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateANewCheckInRequest createANewCheckInRequest = (CreateANewCheckInRequest) o;
    return Objects.equals(this.status, createANewCheckInRequest.status) &&
        equalsNullable(this.duration, createANewCheckInRequest.duration) &&
        equalsNullable(this.environment, createANewCheckInRequest.environment) &&
        Objects.equals(this.monitorConfig, createANewCheckInRequest.monitorConfig);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, hashCodeNullable(duration), hashCodeNullable(environment), monitorConfig);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateANewCheckInRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

