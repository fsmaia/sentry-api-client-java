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
 * ListAProjectSEvents200ResponseInnerTagsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ListAProjectSEvents200ResponseInnerTagsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public ListAProjectSEvents200ResponseInnerTagsInner() {
  }

  public ListAProjectSEvents200ResponseInnerTagsInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ListAProjectSEvents200ResponseInnerTagsInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @jakarta.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSEvents200ResponseInnerTagsInner listAProjectSEvents200ResponseInnerTagsInner = (ListAProjectSEvents200ResponseInnerTagsInner) o;
    return Objects.equals(this.value, listAProjectSEvents200ResponseInnerTagsInner.value) &&
        Objects.equals(this.key, listAProjectSEvents200ResponseInnerTagsInner.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSEvents200ResponseInnerTagsInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAProjectSEvents200ResponseInnerTagsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAProjectSEvents200ResponseInnerTagsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAProjectSEvents200ResponseInnerTagsInner is not found in the empty JSON string", ListAProjectSEvents200ResponseInnerTagsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAProjectSEvents200ResponseInnerTagsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAProjectSEvents200ResponseInnerTagsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAProjectSEvents200ResponseInnerTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAProjectSEvents200ResponseInnerTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAProjectSEvents200ResponseInnerTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAProjectSEvents200ResponseInnerTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAProjectSEvents200ResponseInnerTagsInner>() {
           @Override
           public void write(JsonWriter out, ListAProjectSEvents200ResponseInnerTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAProjectSEvents200ResponseInnerTagsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAProjectSEvents200ResponseInnerTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAProjectSEvents200ResponseInnerTagsInner
  * @throws IOException if the JSON string is invalid with respect to ListAProjectSEvents200ResponseInnerTagsInner
  */
  public static ListAProjectSEvents200ResponseInnerTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAProjectSEvents200ResponseInnerTagsInner.class);
  }

 /**
  * Convert an instance of ListAProjectSEvents200ResponseInnerTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
