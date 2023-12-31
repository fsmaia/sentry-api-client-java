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
import com.sentry.api.client.model.ListAProjectSUserFeedback200ResponseInnerEvent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAProjectSUserFeedback200ResponseInner
 */
@JsonPropertyOrder({
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_COMMENTS,
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_DATE_CREATED,
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_EMAIL,
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_EVENT,
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_EVENT_I_D,
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_ID,
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_ISSUE,
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_NAME,
  ListAProjectSUserFeedback200ResponseInner.JSON_PROPERTY_USER
})
@JsonTypeName("List_a_Project_s_User_Feedback_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ListAProjectSUserFeedback200ResponseInner {
  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private String comments;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_EVENT = "event";
  private ListAProjectSUserFeedback200ResponseInnerEvent event;

  public static final String JSON_PROPERTY_EVENT_I_D = "eventID";
  private String eventID;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ISSUE = "issue";
  private Object issue;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_USER = "user";
  private Object user;

  public ListAProjectSUserFeedback200ResponseInner() { 
  }

  public ListAProjectSUserFeedback200ResponseInner comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComments(String comments) {
    this.comments = comments;
  }


  public ListAProjectSUserFeedback200ResponseInner dateCreated(String dateCreated) {
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


  public ListAProjectSUserFeedback200ResponseInner email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public ListAProjectSUserFeedback200ResponseInner event(ListAProjectSUserFeedback200ResponseInnerEvent event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListAProjectSUserFeedback200ResponseInnerEvent getEvent() {
    return event;
  }


  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvent(ListAProjectSUserFeedback200ResponseInnerEvent event) {
    this.event = event;
  }


  public ListAProjectSUserFeedback200ResponseInner eventID(String eventID) {
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


  public ListAProjectSUserFeedback200ResponseInner id(String id) {
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


  public ListAProjectSUserFeedback200ResponseInner issue(Object issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getIssue() {
    return issue;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssue(Object issue) {
    this.issue = issue;
  }


  public ListAProjectSUserFeedback200ResponseInner name(String name) {
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


  public ListAProjectSUserFeedback200ResponseInner user(Object user) {
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

  public Object getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUser(Object user) {
    this.user = user;
  }


  /**
   * Return true if this List_a_Project_s_User_Feedback_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSUserFeedback200ResponseInner listAProjectSUserFeedback200ResponseInner = (ListAProjectSUserFeedback200ResponseInner) o;
    return Objects.equals(this.comments, listAProjectSUserFeedback200ResponseInner.comments) &&
        Objects.equals(this.dateCreated, listAProjectSUserFeedback200ResponseInner.dateCreated) &&
        Objects.equals(this.email, listAProjectSUserFeedback200ResponseInner.email) &&
        Objects.equals(this.event, listAProjectSUserFeedback200ResponseInner.event) &&
        Objects.equals(this.eventID, listAProjectSUserFeedback200ResponseInner.eventID) &&
        Objects.equals(this.id, listAProjectSUserFeedback200ResponseInner.id) &&
        Objects.equals(this.issue, listAProjectSUserFeedback200ResponseInner.issue) &&
        Objects.equals(this.name, listAProjectSUserFeedback200ResponseInner.name) &&
        Objects.equals(this.user, listAProjectSUserFeedback200ResponseInner.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, dateCreated, email, event, eventID, id, issue, name, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSUserFeedback200ResponseInner {\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

