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
import com.sentry.api.client.model.ListAnIssueSHashes200ResponseInnerLatestEvent;
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
 * ListAnIssueSHashes200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:28:08.282703Z[Etc/UTC]")
public class ListAnIssueSHashes200ResponseInner {
  public static final String SERIALIZED_NAME_LATEST_EVENT = "latestEvent";
  @SerializedName(SERIALIZED_NAME_LATEST_EVENT)
  private ListAnIssueSHashes200ResponseInnerLatestEvent latestEvent;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
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
  @javax.annotation.Nullable
  public ListAnIssueSHashes200ResponseInnerLatestEvent getLatestEvent() {
    return latestEvent;
  }


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
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("latestEvent");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnIssueSHashes200ResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnIssueSHashes200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnIssueSHashes200ResponseInner is not found in the empty JSON string", ListAnIssueSHashes200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnIssueSHashes200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnIssueSHashes200ResponseInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `latestEvent`
      if (jsonObj.get("latestEvent") != null && !jsonObj.get("latestEvent").isJsonNull()) {
        ListAnIssueSHashes200ResponseInnerLatestEvent.validateJsonObject(jsonObj.getAsJsonObject("latestEvent"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnIssueSHashes200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnIssueSHashes200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnIssueSHashes200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnIssueSHashes200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnIssueSHashes200ResponseInner>() {
           @Override
           public void write(JsonWriter out, ListAnIssueSHashes200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnIssueSHashes200ResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnIssueSHashes200ResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnIssueSHashes200ResponseInner
  * @throws IOException if the JSON string is invalid with respect to ListAnIssueSHashes200ResponseInner
  */
  public static ListAnIssueSHashes200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnIssueSHashes200ResponseInner.class);
  }

 /**
  * Convert an instance of ListAnIssueSHashes200ResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

