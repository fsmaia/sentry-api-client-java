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
import com.sentry.api.client.model.ResolveAShortID200ResponseGroup;
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
 * ResolveAShortID200Response
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ResolveAShortID200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORGANIZATION_SLUG = "organizationSlug";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_SLUG)
  private String organizationSlug;

  public static final String SERIALIZED_NAME_PROJECT_SLUG = "projectSlug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG)
  private String projectSlug;

  public static final String SERIALIZED_NAME_SHORT_ID = "shortId";
  @SerializedName(SERIALIZED_NAME_SHORT_ID)
  private String shortId;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private ResolveAShortID200ResponseGroup group;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public ResolveAShortID200Response() {
  }

  public ResolveAShortID200Response organizationSlug(String organizationSlug) {
    
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


  public ResolveAShortID200Response projectSlug(String projectSlug) {
    
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


  public ResolveAShortID200Response shortId(String shortId) {
    
    this.shortId = shortId;
    return this;
  }

   /**
   * Get shortId
   * @return shortId
  **/
  @jakarta.annotation.Nonnull
  public String getShortId() {
    return shortId;
  }


  public void setShortId(String shortId) {
    this.shortId = shortId;
  }


  public ResolveAShortID200Response group(ResolveAShortID200ResponseGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @jakarta.annotation.Nonnull
  public ResolveAShortID200ResponseGroup getGroup() {
    return group;
  }


  public void setGroup(ResolveAShortID200ResponseGroup group) {
    this.group = group;
  }


  public ResolveAShortID200Response groupId(String groupId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAShortID200Response resolveAShortID200Response = (ResolveAShortID200Response) o;
    return Objects.equals(this.organizationSlug, resolveAShortID200Response.organizationSlug) &&
        Objects.equals(this.projectSlug, resolveAShortID200Response.projectSlug) &&
        Objects.equals(this.shortId, resolveAShortID200Response.shortId) &&
        Objects.equals(this.group, resolveAShortID200Response.group) &&
        Objects.equals(this.groupId, resolveAShortID200Response.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationSlug, projectSlug, shortId, group, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAShortID200Response {\n");
    sb.append("    organizationSlug: ").append(toIndentedString(organizationSlug)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
    openapiFields.add("organizationSlug");
    openapiFields.add("projectSlug");
    openapiFields.add("shortId");
    openapiFields.add("group");
    openapiFields.add("groupId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organizationSlug");
    openapiRequiredFields.add("projectSlug");
    openapiRequiredFields.add("shortId");
    openapiRequiredFields.add("group");
    openapiRequiredFields.add("groupId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResolveAShortID200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResolveAShortID200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolveAShortID200Response is not found in the empty JSON string", ResolveAShortID200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResolveAShortID200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolveAShortID200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResolveAShortID200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("organizationSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationSlug").toString()));
      }
      if (!jsonObj.get("projectSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectSlug").toString()));
      }
      if (!jsonObj.get("shortId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortId").toString()));
      }
      // validate the required field `group`
      ResolveAShortID200ResponseGroup.validateJsonObject(jsonObj.getAsJsonObject("group"));
      if (!jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolveAShortID200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolveAShortID200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolveAShortID200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolveAShortID200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolveAShortID200Response>() {
           @Override
           public void write(JsonWriter out, ResolveAShortID200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolveAShortID200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResolveAShortID200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResolveAShortID200Response
  * @throws IOException if the JSON string is invalid with respect to ResolveAShortID200Response
  */
  public static ResolveAShortID200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolveAShortID200Response.class);
  }

 /**
  * Convert an instance of ResolveAShortID200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

