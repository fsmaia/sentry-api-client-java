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
import java.io.IOException;

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
 * ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta {
  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta() {
  }

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta resourceType(String resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  public String getResourceType() {
    return resourceType;
  }


  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta listAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta = (ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta) o;
    return Objects.equals(this.resourceType, listAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
    openapiFields.add("resourceType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta is not found in the empty JSON string", ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull()) && !jsonObj.get("resourceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta>() {
           @Override
           public void write(JsonWriter out, ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta
  * @throws IOException if the JSON string is invalid with respect to ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta
  */
  public static ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.class);
  }

 /**
  * Convert an instance of ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

