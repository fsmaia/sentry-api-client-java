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
import com.sentry.api.client.model.ListAProjectSEvents200ResponseInnerTagsInner;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventUser;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAProjectSEvents200ResponseInner
 */
@JsonPropertyOrder({
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_EVENT_I_D,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_TAGS,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_DATE_CREATED,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_USER,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_MESSAGE,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_ID,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_PLATFORM,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_EVENT_TYPE,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_GROUP_I_D,
  ListAProjectSEvents200ResponseInner.JSON_PROPERTY_TITLE
})
@JsonTypeName("List_a_Project_s_Events_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ListAProjectSEvents200ResponseInner {
  public static final String JSON_PROPERTY_EVENT_I_D = "eventID";
  private String eventID;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<ListAProjectSEvents200ResponseInnerTagsInner> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_USER = "user";
  private ResolveAnEventID200ResponseEventUser user;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_EVENT_TYPE = "event.type";
  private String eventType;

  public static final String JSON_PROPERTY_GROUP_I_D = "groupID";
  private String groupID;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ListAProjectSEvents200ResponseInner() { 
  }

  public ListAProjectSEvents200ResponseInner eventID(String eventID) {
    this.eventID = eventID;
    return this;
  }

   /**
   * Get eventID
   * @return eventID
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventID() {
    return eventID;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventID(String eventID) {
    this.eventID = eventID;
  }


  public ListAProjectSEvents200ResponseInner tags(List<ListAProjectSEvents200ResponseInnerTagsInner> tags) {
    this.tags = tags;
    return this;
  }

  public ListAProjectSEvents200ResponseInner addTagsItem(ListAProjectSEvents200ResponseInnerTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ListAProjectSEvents200ResponseInnerTagsInner> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(List<ListAProjectSEvents200ResponseInnerTagsInner> tags) {
    this.tags = tags;
  }


  public ListAProjectSEvents200ResponseInner dateCreated(String dateCreated) {
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


  public ListAProjectSEvents200ResponseInner user(ResolveAnEventID200ResponseEventUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAnEventID200ResponseEventUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUser(ResolveAnEventID200ResponseEventUser user) {
    this.user = user;
  }


  public ListAProjectSEvents200ResponseInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nonnull
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


  public ListAProjectSEvents200ResponseInner id(String id) {
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


  public ListAProjectSEvents200ResponseInner platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public ListAProjectSEvents200ResponseInner eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public ListAProjectSEvents200ResponseInner groupID(String groupID) {
    this.groupID = groupID;
    return this;
  }

   /**
   * Get groupID
   * @return groupID
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROUP_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupID() {
    return groupID;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupID(String groupID) {
    this.groupID = groupID;
  }


  public ListAProjectSEvents200ResponseInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this List_a_Project_s_Events_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSEvents200ResponseInner listAProjectSEvents200ResponseInner = (ListAProjectSEvents200ResponseInner) o;
    return Objects.equals(this.eventID, listAProjectSEvents200ResponseInner.eventID) &&
        Objects.equals(this.tags, listAProjectSEvents200ResponseInner.tags) &&
        Objects.equals(this.dateCreated, listAProjectSEvents200ResponseInner.dateCreated) &&
        Objects.equals(this.user, listAProjectSEvents200ResponseInner.user) &&
        Objects.equals(this.message, listAProjectSEvents200ResponseInner.message) &&
        Objects.equals(this.id, listAProjectSEvents200ResponseInner.id) &&
        Objects.equals(this.platform, listAProjectSEvents200ResponseInner.platform) &&
        Objects.equals(this.eventType, listAProjectSEvents200ResponseInner.eventType) &&
        Objects.equals(this.groupID, listAProjectSEvents200ResponseInner.groupID) &&
        Objects.equals(this.title, listAProjectSEvents200ResponseInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventID, tags, dateCreated, user, message, id, platform, eventType, groupID, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSEvents200ResponseInner {\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    groupID: ").append(toIndentedString(groupID)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

