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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.client.model.ListAProjectSUserFeedback200ResponseInnerEvent;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sentry.api.client.JSON;

/**
 * ListAProjectSUserFeedback200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T09:39:48.475487Z[Etc/UTC]")
public class ListAProjectSUserFeedback200ResponseInner implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private ListAProjectSUserFeedback200ResponseInnerEvent event;

  public static final String SERIALIZED_NAME_EVENT_I_D = "eventID";
  @SerializedName(SERIALIZED_NAME_EVENT_I_D)
  private String eventID;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUE = "issue";
  @SerializedName(SERIALIZED_NAME_ISSUE)
  private Object issue;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
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
  @javax.annotation.Nonnull
  public String getComments() {
    return comments;
  }


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
  @javax.annotation.Nonnull
  public String getDateCreated() {
    return dateCreated;
  }


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
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


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
  @javax.annotation.Nonnull
  public ListAProjectSUserFeedback200ResponseInnerEvent getEvent() {
    return event;
  }


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
  @javax.annotation.Nonnull
  public String getEventID() {
    return eventID;
  }


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
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


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
  @javax.annotation.Nullable
  public Object getIssue() {
    return issue;
  }


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
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


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
  @javax.annotation.Nullable
  public Object getUser() {
    return user;
  }


  public void setUser(Object user) {
    this.user = user;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("comments");
    openapiFields.add("dateCreated");
    openapiFields.add("email");
    openapiFields.add("event");
    openapiFields.add("eventID");
    openapiFields.add("id");
    openapiFields.add("issue");
    openapiFields.add("name");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comments");
    openapiRequiredFields.add("dateCreated");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("eventID");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issue");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("user");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAProjectSUserFeedback200ResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAProjectSUserFeedback200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAProjectSUserFeedback200ResponseInner is not found in the empty JSON string", ListAProjectSUserFeedback200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAProjectSUserFeedback200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAProjectSUserFeedback200ResponseInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAProjectSUserFeedback200ResponseInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if (!jsonObj.get("dateCreated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateCreated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateCreated").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the required field `event`
      ListAProjectSUserFeedback200ResponseInnerEvent.validateJsonObject(jsonObj.getAsJsonObject("event"));
      if (!jsonObj.get("eventID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventID").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAProjectSUserFeedback200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAProjectSUserFeedback200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAProjectSUserFeedback200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAProjectSUserFeedback200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAProjectSUserFeedback200ResponseInner>() {
           @Override
           public void write(JsonWriter out, ListAProjectSUserFeedback200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAProjectSUserFeedback200ResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAProjectSUserFeedback200ResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAProjectSUserFeedback200ResponseInner
  * @throws IOException if the JSON string is invalid with respect to ListAProjectSUserFeedback200ResponseInner
  */
  public static ListAProjectSUserFeedback200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAProjectSUserFeedback200ResponseInner.class);
  }

 /**
  * Convert an instance of ListAProjectSUserFeedback200ResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

