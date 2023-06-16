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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAProjectSServiceHooks200ResponseInner
 */
@JsonPropertyOrder({
  ListAProjectSServiceHooks200ResponseInner.JSON_PROPERTY_DATE_CREATED,
  ListAProjectSServiceHooks200ResponseInner.JSON_PROPERTY_EVENTS,
  ListAProjectSServiceHooks200ResponseInner.JSON_PROPERTY_ID,
  ListAProjectSServiceHooks200ResponseInner.JSON_PROPERTY_SECRET,
  ListAProjectSServiceHooks200ResponseInner.JSON_PROPERTY_STATUS,
  ListAProjectSServiceHooks200ResponseInner.JSON_PROPERTY_URL
})
@JsonTypeName("List_a_Project_s_Service_Hooks_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class ListAProjectSServiceHooks200ResponseInner {
  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<String> events = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ListAProjectSServiceHooks200ResponseInner() { 
  }

  public ListAProjectSServiceHooks200ResponseInner dateCreated(String dateCreated) {
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

  public String getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public ListAProjectSServiceHooks200ResponseInner events(List<String> events) {
    this.events = events;
    return this;
  }

  public ListAProjectSServiceHooks200ResponseInner addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvents(List<String> events) {
    this.events = events;
  }


  public ListAProjectSServiceHooks200ResponseInner id(String id) {
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


  public ListAProjectSServiceHooks200ResponseInner secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecret() {
    return secret;
  }


  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecret(String secret) {
    this.secret = secret;
  }


  public ListAProjectSServiceHooks200ResponseInner status(String status) {
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


  public ListAProjectSServiceHooks200ResponseInner url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this List_a_Project_s_Service_Hooks_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSServiceHooks200ResponseInner listAProjectSServiceHooks200ResponseInner = (ListAProjectSServiceHooks200ResponseInner) o;
    return Objects.equals(this.dateCreated, listAProjectSServiceHooks200ResponseInner.dateCreated) &&
        Objects.equals(this.events, listAProjectSServiceHooks200ResponseInner.events) &&
        Objects.equals(this.id, listAProjectSServiceHooks200ResponseInner.id) &&
        Objects.equals(this.secret, listAProjectSServiceHooks200ResponseInner.secret) &&
        Objects.equals(this.status, listAProjectSServiceHooks200ResponseInner.status) &&
        Objects.equals(this.url, listAProjectSServiceHooks200ResponseInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, events, id, secret, status, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSServiceHooks200ResponseInner {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

