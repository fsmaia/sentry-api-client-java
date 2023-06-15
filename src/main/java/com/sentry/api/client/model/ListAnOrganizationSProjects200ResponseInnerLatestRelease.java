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
 * ListAnOrganizationSProjects200ResponseInnerLatestRelease
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ListAnOrganizationSProjects200ResponseInnerLatestRelease implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public ListAnOrganizationSProjects200ResponseInnerLatestRelease() {
  }

  public ListAnOrganizationSProjects200ResponseInnerLatestRelease version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nonnull
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSProjects200ResponseInnerLatestRelease listAnOrganizationSProjects200ResponseInnerLatestRelease = (ListAnOrganizationSProjects200ResponseInnerLatestRelease) o;
    return Objects.equals(this.version, listAnOrganizationSProjects200ResponseInnerLatestRelease.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSProjects200ResponseInnerLatestRelease {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnOrganizationSProjects200ResponseInnerLatestRelease
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnOrganizationSProjects200ResponseInnerLatestRelease.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnOrganizationSProjects200ResponseInnerLatestRelease is not found in the empty JSON string", ListAnOrganizationSProjects200ResponseInnerLatestRelease.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnOrganizationSProjects200ResponseInnerLatestRelease.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnOrganizationSProjects200ResponseInnerLatestRelease` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAnOrganizationSProjects200ResponseInnerLatestRelease.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnOrganizationSProjects200ResponseInnerLatestRelease.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnOrganizationSProjects200ResponseInnerLatestRelease' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnOrganizationSProjects200ResponseInnerLatestRelease> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnOrganizationSProjects200ResponseInnerLatestRelease.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnOrganizationSProjects200ResponseInnerLatestRelease>() {
           @Override
           public void write(JsonWriter out, ListAnOrganizationSProjects200ResponseInnerLatestRelease value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnOrganizationSProjects200ResponseInnerLatestRelease read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnOrganizationSProjects200ResponseInnerLatestRelease given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnOrganizationSProjects200ResponseInnerLatestRelease
  * @throws IOException if the JSON string is invalid with respect to ListAnOrganizationSProjects200ResponseInnerLatestRelease
  */
  public static ListAnOrganizationSProjects200ResponseInnerLatestRelease fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnOrganizationSProjects200ResponseInnerLatestRelease.class);
  }

 /**
  * Convert an instance of ListAnOrganizationSProjects200ResponseInnerLatestRelease to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

