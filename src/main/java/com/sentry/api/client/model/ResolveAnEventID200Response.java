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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEvent;
import java.io.IOException;
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
 * ResolveAnEventID200Response
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ResolveAnEventID200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private ResolveAnEventID200ResponseEvent event;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_ORGANIZATION_SLUG = "organizationSlug";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_SLUG)
  private String organizationSlug;

  public static final String SERIALIZED_NAME_PROJECT_SLUG = "projectSlug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG)
  private String projectSlug;

  public ResolveAnEventID200Response() {
  }

  public ResolveAnEventID200Response event(ResolveAnEventID200ResponseEvent event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @jakarta.annotation.Nonnull
  public ResolveAnEventID200ResponseEvent getEvent() {
    return event;
  }


  public void setEvent(ResolveAnEventID200ResponseEvent event) {
    this.event = event;
  }


  public ResolveAnEventID200Response eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @jakarta.annotation.Nonnull
  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public ResolveAnEventID200Response groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @jakarta.annotation.Nonnull
  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ResolveAnEventID200Response organizationSlug(String organizationSlug) {
    
    this.organizationSlug = organizationSlug;
    return this;
  }

   /**
   * Get organizationSlug
   * @return organizationSlug
  **/
  @jakarta.annotation.Nonnull
  public String getOrganizationSlug() {
    return organizationSlug;
  }


  public void setOrganizationSlug(String organizationSlug) {
    this.organizationSlug = organizationSlug;
  }


  public ResolveAnEventID200Response projectSlug(String projectSlug) {
    
    this.projectSlug = projectSlug;
    return this;
  }

   /**
   * Get projectSlug
   * @return projectSlug
  **/
  @jakarta.annotation.Nonnull
  public String getProjectSlug() {
    return projectSlug;
  }


  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200Response resolveAnEventID200Response = (ResolveAnEventID200Response) o;
    return Objects.equals(this.event, resolveAnEventID200Response.event) &&
        Objects.equals(this.eventId, resolveAnEventID200Response.eventId) &&
        Objects.equals(this.groupId, resolveAnEventID200Response.groupId) &&
        Objects.equals(this.organizationSlug, resolveAnEventID200Response.organizationSlug) &&
        Objects.equals(this.projectSlug, resolveAnEventID200Response.projectSlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, groupId, organizationSlug, projectSlug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200Response {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    organizationSlug: ").append(toIndentedString(organizationSlug)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("eventId");
    openapiFields.add("groupId");
    openapiFields.add("organizationSlug");
    openapiFields.add("projectSlug");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("eventId");
    openapiRequiredFields.add("groupId");
    openapiRequiredFields.add("organizationSlug");
    openapiRequiredFields.add("projectSlug");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResolveAnEventID200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResolveAnEventID200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolveAnEventID200Response is not found in the empty JSON string", ResolveAnEventID200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResolveAnEventID200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolveAnEventID200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResolveAnEventID200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `event`
      ResolveAnEventID200ResponseEvent.validateJsonObject(jsonObj.getAsJsonObject("event"));
      if (!jsonObj.get("eventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventId").toString()));
      }
      if (!jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if (!jsonObj.get("organizationSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationSlug").toString()));
      }
      if (!jsonObj.get("projectSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectSlug").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolveAnEventID200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolveAnEventID200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolveAnEventID200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolveAnEventID200Response>() {
           @Override
           public void write(JsonWriter out, ResolveAnEventID200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolveAnEventID200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResolveAnEventID200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResolveAnEventID200Response
  * @throws IOException if the JSON string is invalid with respect to ResolveAnEventID200Response
  */
  public static ResolveAnEventID200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolveAnEventID200Response.class);
  }

 /**
  * Convert an instance of ResolveAnEventID200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

