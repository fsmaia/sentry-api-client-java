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
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.JSON_PROPERTY_CATEGORY,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.JSON_PROPERTY_LEVEL,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.JSON_PROPERTY_EVENT_ID,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.JSON_PROPERTY_TIMESTAMP,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.JSON_PROPERTY_DATA,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.JSON_PROPERTY_MESSAGE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.JSON_PROPERTY_TYPE
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_data_values_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner {
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private String level;

  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner() { 
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(String category) {
    this.category = category;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLevel(String level) {
    this.level = level;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @jakarta.annotation.Nullable
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


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(Object data) {
    this.data = data;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner type(String type) {
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


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_data_values_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner resolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner = (ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner) o;
    return Objects.equals(this.category, resolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.category) &&
        Objects.equals(this.level, resolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.level) &&
        Objects.equals(this.eventId, resolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.eventId) &&
        Objects.equals(this.timestamp, resolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.timestamp) &&
        Objects.equals(this.data, resolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.data) &&
        Objects.equals(this.message, resolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.message) &&
        Objects.equals(this.type, resolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, level, eventId, timestamp, data, message, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

