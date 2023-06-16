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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ConfigValidator
 */
@JsonPropertyOrder({
  ConfigValidator.JSON_PROPERTY_SCHEDULE_TYPE,
  ConfigValidator.JSON_PROPERTY_SCHEDULE,
  ConfigValidator.JSON_PROPERTY_CHECKIN_MARGIN,
  ConfigValidator.JSON_PROPERTY_MAX_RUNTIME,
  ConfigValidator.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ConfigValidator {
  /**
   * Currently supports \&quot;crontab\&quot; or \&quot;interval\&quot;
   */
  public enum ScheduleTypeEnum {
    CRONTAB("crontab"),
    
    INTERVAL("interval");

    private String value;

    ScheduleTypeEnum(String value) {
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
    public static ScheduleTypeEnum fromValue(String value) {
      for (ScheduleTypeEnum b : ScheduleTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCHEDULE_TYPE = "schedule_type";
  private ScheduleTypeEnum scheduleType;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private Object schedule = null;

  public static final String JSON_PROPERTY_CHECKIN_MARGIN = "checkin_margin";
  private JsonNullable<Integer> checkinMargin = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MAX_RUNTIME = "max_runtime";
  private JsonNullable<Integer> maxRuntime = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public ConfigValidator() { 
  }

  public ConfigValidator scheduleType(ScheduleTypeEnum scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Currently supports \&quot;crontab\&quot; or \&quot;interval\&quot;
   * @return scheduleType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleTypeEnum getScheduleType() {
    return scheduleType;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleType(ScheduleTypeEnum scheduleType) {
    this.scheduleType = scheduleType;
  }


  public ConfigValidator schedule(Object schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Varies depending on the schedule_type. Is either a crontab string, or a 2 element tuple for intervals (e.g. [1, &#39;day&#39;])
   * @return schedule
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }


  public ConfigValidator checkinMargin(Integer checkinMargin) {
    this.checkinMargin = JsonNullable.<Integer>of(checkinMargin);
    return this;
  }

   /**
   * How long (in minutes) after the expected checkin time will we wait until we consider the checkin to have been missed.
   * minimum: 0
   * @return checkinMargin
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getCheckinMargin() {
        return checkinMargin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHECKIN_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getCheckinMargin_JsonNullable() {
    return checkinMargin;
  }
  
  @JsonProperty(JSON_PROPERTY_CHECKIN_MARGIN)
  public void setCheckinMargin_JsonNullable(JsonNullable<Integer> checkinMargin) {
    this.checkinMargin = checkinMargin;
  }

  public void setCheckinMargin(Integer checkinMargin) {
    this.checkinMargin = JsonNullable.<Integer>of(checkinMargin);
  }


  public ConfigValidator maxRuntime(Integer maxRuntime) {
    this.maxRuntime = JsonNullable.<Integer>of(maxRuntime);
    return this;
  }

   /**
   * How long (in minutes) is the checkin allowed to run for in CheckInStatus.IN_PROGRESS before it is considered failed.
   * minimum: 1
   * @return maxRuntime
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getMaxRuntime() {
        return maxRuntime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMaxRuntime_JsonNullable() {
    return maxRuntime;
  }
  
  @JsonProperty(JSON_PROPERTY_MAX_RUNTIME)
  public void setMaxRuntime_JsonNullable(JsonNullable<Integer> maxRuntime) {
    this.maxRuntime = maxRuntime;
  }

  public void setMaxRuntime(Integer maxRuntime) {
    this.maxRuntime = JsonNullable.<Integer>of(maxRuntime);
  }


  public ConfigValidator timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * tz database style timezone string
   * @return timezone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this ConfigValidator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigValidator configValidator = (ConfigValidator) o;
    return Objects.equals(this.scheduleType, configValidator.scheduleType) &&
        Objects.equals(this.schedule, configValidator.schedule) &&
        equalsNullable(this.checkinMargin, configValidator.checkinMargin) &&
        equalsNullable(this.maxRuntime, configValidator.maxRuntime) &&
        Objects.equals(this.timezone, configValidator.timezone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleType, schedule, hashCodeNullable(checkinMargin), hashCodeNullable(maxRuntime), timezone);
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
    sb.append("class ConfigValidator {\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    checkinMargin: ").append(toIndentedString(checkinMargin)).append("\n");
    sb.append("    maxRuntime: ").append(toIndentedString(maxRuntime)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

