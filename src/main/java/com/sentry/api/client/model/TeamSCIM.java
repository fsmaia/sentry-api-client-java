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
import com.sentry.api.client.model.ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner;
import com.sentry.api.client.model.QueryAnIndividualTeam200ResponseMeta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * TeamSCIM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class TeamSCIM {
  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<String> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private QueryAnIndividualTeam200ResponseMeta meta;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members;

  public TeamSCIM() {
  }

  public TeamSCIM schemas(List<String> schemas) {
    
    this.schemas = schemas;
    return this;
  }

  public TeamSCIM addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nonnull
  public List<String> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }


  public TeamSCIM id(String id) {
    
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


  public TeamSCIM displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public TeamSCIM meta(QueryAnIndividualTeam200ResponseMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  public QueryAnIndividualTeam200ResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(QueryAnIndividualTeam200ResponseMeta meta) {
    this.meta = meta;
  }


  public TeamSCIM members(List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members) {
    
    this.members = members;
    return this;
  }

  public TeamSCIM addMembersItem(ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nullable
  public List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> getMembers() {
    return members;
  }


  public void setMembers(List<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> members) {
    this.members = members;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSCIM teamSCIM = (TeamSCIM) o;
    return Objects.equals(this.schemas, teamSCIM.schemas) &&
        Objects.equals(this.id, teamSCIM.id) &&
        Objects.equals(this.displayName, teamSCIM.displayName) &&
        Objects.equals(this.meta, teamSCIM.meta) &&
        Objects.equals(this.members, teamSCIM.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, displayName, meta, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSCIM {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("id");
    openapiFields.add("displayName");
    openapiFields.add("meta");
    openapiFields.add("members");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TeamSCIM
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TeamSCIM.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TeamSCIM is not found in the empty JSON string", TeamSCIM.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TeamSCIM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TeamSCIM` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TeamSCIM.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("schemas") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // validate the required field `meta`
      QueryAnIndividualTeam200ResponseMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
        if (jsonArraymembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
          }

          // validate the optional field `members` (array)
          for (int i = 0; i < jsonArraymembers.size(); i++) {
            ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.validateJsonObject(jsonArraymembers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TeamSCIM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TeamSCIM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TeamSCIM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TeamSCIM.class));

       return (TypeAdapter<T>) new TypeAdapter<TeamSCIM>() {
           @Override
           public void write(JsonWriter out, TeamSCIM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TeamSCIM read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TeamSCIM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TeamSCIM
  * @throws IOException if the JSON string is invalid with respect to TeamSCIM
  */
  public static TeamSCIM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TeamSCIM.class);
  }

 /**
  * Convert an instance of TeamSCIM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

