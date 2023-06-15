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
 * ResolveAnEventID200ResponseEventErrorsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventErrorsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public ResolveAnEventID200ResponseEventErrorsInner() {
  }

  public ResolveAnEventID200ResponseEventErrorsInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ResolveAnEventID200ResponseEventErrorsInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ResolveAnEventID200ResponseEventErrorsInner data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  public Object getData() {
    return data;
  }


  public void setData(Object data) {
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
    ResolveAnEventID200ResponseEventErrorsInner resolveAnEventID200ResponseEventErrorsInner = (ResolveAnEventID200ResponseEventErrorsInner) o;
    return Objects.equals(this.message, resolveAnEventID200ResponseEventErrorsInner.message) &&
        Objects.equals(this.type, resolveAnEventID200ResponseEventErrorsInner.type) &&
        Objects.equals(this.data, resolveAnEventID200ResponseEventErrorsInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventErrorsInner {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("type");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResolveAnEventID200ResponseEventErrorsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResolveAnEventID200ResponseEventErrorsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolveAnEventID200ResponseEventErrorsInner is not found in the empty JSON string", ResolveAnEventID200ResponseEventErrorsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResolveAnEventID200ResponseEventErrorsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolveAnEventID200ResponseEventErrorsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolveAnEventID200ResponseEventErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolveAnEventID200ResponseEventErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolveAnEventID200ResponseEventErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolveAnEventID200ResponseEventErrorsInner>() {
           @Override
           public void write(JsonWriter out, ResolveAnEventID200ResponseEventErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolveAnEventID200ResponseEventErrorsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResolveAnEventID200ResponseEventErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResolveAnEventID200ResponseEventErrorsInner
  * @throws IOException if the JSON string is invalid with respect to ResolveAnEventID200ResponseEventErrorsInner
  */
  public static ResolveAnEventID200ResponseEventErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolveAnEventID200ResponseEventErrorsInner.class);
  }

 /**
  * Convert an instance of ResolveAnEventID200ResponseEventErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

