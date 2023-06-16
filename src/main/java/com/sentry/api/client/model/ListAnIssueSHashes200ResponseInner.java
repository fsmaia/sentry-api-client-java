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
import com.sentry.api.client.model.ListAnIssueSHashes200ResponseInnerLatestEvent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnIssueSHashes200ResponseInner
 */
@JsonPropertyOrder({
  ListAnIssueSHashes200ResponseInner.JSON_PROPERTY_LATEST_EVENT,
  ListAnIssueSHashes200ResponseInner.JSON_PROPERTY_ID
})
@JsonTypeName("List_an_Issue_s_Hashes_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class ListAnIssueSHashes200ResponseInner {
  public static final String JSON_PROPERTY_LATEST_EVENT = "latestEvent";
  private ListAnIssueSHashes200ResponseInnerLatestEvent latestEvent;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public ListAnIssueSHashes200ResponseInner() { 
  }

  public ListAnIssueSHashes200ResponseInner latestEvent(ListAnIssueSHashes200ResponseInnerLatestEvent latestEvent) {
    this.latestEvent = latestEvent;
    return this;
  }

   /**
   * Get latestEvent
   * @return latestEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListAnIssueSHashes200ResponseInnerLatestEvent getLatestEvent() {
    return latestEvent;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestEvent(ListAnIssueSHashes200ResponseInnerLatestEvent latestEvent) {
    this.latestEvent = latestEvent;
  }


  public ListAnIssueSHashes200ResponseInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Return true if this List_an_Issue_s_Hashes_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnIssueSHashes200ResponseInner listAnIssueSHashes200ResponseInner = (ListAnIssueSHashes200ResponseInner) o;
    return Objects.equals(this.latestEvent, listAnIssueSHashes200ResponseInner.latestEvent) &&
        Objects.equals(this.id, listAnIssueSHashes200ResponseInner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestEvent, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnIssueSHashes200ResponseInner {\n");
    sb.append("    latestEvent: ").append(toIndentedString(latestEvent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

