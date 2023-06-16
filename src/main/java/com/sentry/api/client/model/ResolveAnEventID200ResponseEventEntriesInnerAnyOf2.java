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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data;
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
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data data;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf2() {
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 data(ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data getData() {
    return data;
  }


  public void setData(ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 resolveAnEventID200ResponseEventEntriesInnerAnyOf2 = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf2) o;
    return Objects.equals(this.type, resolveAnEventID200ResponseEventEntriesInnerAnyOf2.type) &&
        Objects.equals(this.data, resolveAnEventID200ResponseEventEntriesInnerAnyOf2.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResolveAnEventID200ResponseEventEntriesInnerAnyOf2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 is not found in the empty JSON string", ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolveAnEventID200ResponseEventEntriesInnerAnyOf2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `data`
      ResolveAnEventID200ResponseEventEntriesInnerAnyOf2Data.validateJsonObject(jsonObj.getAsJsonObject("data"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOf2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOf2>() {
           @Override
           public void write(JsonWriter out, ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOf2
  * @throws IOException if the JSON string is invalid with respect to ResolveAnEventID200ResponseEventEntriesInnerAnyOf2
  */
  public static ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.class);
  }

 /**
  * Convert an instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

