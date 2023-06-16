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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnOrganization200ResponseOnboardingTasksInner
 */
@JsonPropertyOrder({
  RetrieveAnOrganization200ResponseOnboardingTasksInner.JSON_PROPERTY_DATA,
  RetrieveAnOrganization200ResponseOnboardingTasksInner.JSON_PROPERTY_DATE_COMPLETED,
  RetrieveAnOrganization200ResponseOnboardingTasksInner.JSON_PROPERTY_STATUS,
  RetrieveAnOrganization200ResponseOnboardingTasksInner.JSON_PROPERTY_TASK,
  RetrieveAnOrganization200ResponseOnboardingTasksInner.JSON_PROPERTY_USER
})
@JsonTypeName("Retrieve_an_Organization_200_response_onboardingTasks_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class RetrieveAnOrganization200ResponseOnboardingTasksInner {
  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<Object> data = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_DATE_COMPLETED = "dateCompleted";
  private OffsetDateTime dateCompleted;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TASK = "task";
  private Integer task;

  public static final String JSON_PROPERTY_USER = "user";
  private JsonNullable<String> user = JsonNullable.<String>undefined();

  public RetrieveAnOrganization200ResponseOnboardingTasksInner() { 
  }

  public RetrieveAnOrganization200ResponseOnboardingTasksInner data(Object data) {
    this.data = JsonNullable.<Object>of(data);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getData() {
        return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getData_JsonNullable() {
    return data;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<Object> data) {
    this.data = data;
  }

  public void setData(Object data) {
    this.data = JsonNullable.<Object>of(data);
  }


  public RetrieveAnOrganization200ResponseOnboardingTasksInner dateCompleted(OffsetDateTime dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }

   /**
   * Get dateCompleted
   * @return dateCompleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateCompleted() {
    return dateCompleted;
  }


  @JsonProperty(JSON_PROPERTY_DATE_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCompleted(OffsetDateTime dateCompleted) {
    this.dateCompleted = dateCompleted;
  }


  public RetrieveAnOrganization200ResponseOnboardingTasksInner status(String status) {
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

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public RetrieveAnOrganization200ResponseOnboardingTasksInner task(Integer task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTask() {
    return task;
  }


  @JsonProperty(JSON_PROPERTY_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTask(Integer task) {
    this.task = task;
  }


  public RetrieveAnOrganization200ResponseOnboardingTasksInner user(String user) {
    this.user = JsonNullable.<String>of(user);
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getUser() {
        return user.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUser_JsonNullable() {
    return user;
  }
  
  @JsonProperty(JSON_PROPERTY_USER)
  public void setUser_JsonNullable(JsonNullable<String> user) {
    this.user = user;
  }

  public void setUser(String user) {
    this.user = JsonNullable.<String>of(user);
  }


  /**
   * Return true if this Retrieve_an_Organization_200_response_onboardingTasks_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganization200ResponseOnboardingTasksInner retrieveAnOrganization200ResponseOnboardingTasksInner = (RetrieveAnOrganization200ResponseOnboardingTasksInner) o;
    return equalsNullable(this.data, retrieveAnOrganization200ResponseOnboardingTasksInner.data) &&
        Objects.equals(this.dateCompleted, retrieveAnOrganization200ResponseOnboardingTasksInner.dateCompleted) &&
        Objects.equals(this.status, retrieveAnOrganization200ResponseOnboardingTasksInner.status) &&
        Objects.equals(this.task, retrieveAnOrganization200ResponseOnboardingTasksInner.task) &&
        equalsNullable(this.user, retrieveAnOrganization200ResponseOnboardingTasksInner.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(data), dateCompleted, status, task, hashCodeNullable(user));
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
    sb.append("class RetrieveAnOrganization200ResponseOnboardingTasksInner {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

