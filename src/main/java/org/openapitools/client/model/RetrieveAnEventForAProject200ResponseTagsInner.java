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
import org.openapitools.jackson.nullable.JsonNullable;
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
 * RetrieveAnEventForAProject200ResponseTagsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T09:39:48.475487Z[Etc/UTC]")
public class RetrieveAnEventForAProject200ResponseTagsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_META = "_meta";
  @SerializedName(SERIALIZED_NAME_META)
  private String meta;

  public RetrieveAnEventForAProject200ResponseTagsInner() {
  }

  public RetrieveAnEventForAProject200ResponseTagsInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public RetrieveAnEventForAProject200ResponseTagsInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public RetrieveAnEventForAProject200ResponseTagsInner meta(String meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  public String getMeta() {
    return meta;
  }


  public void setMeta(String meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnEventForAProject200ResponseTagsInner retrieveAnEventForAProject200ResponseTagsInner = (RetrieveAnEventForAProject200ResponseTagsInner) o;
    return Objects.equals(this.value, retrieveAnEventForAProject200ResponseTagsInner.value) &&
        Objects.equals(this.key, retrieveAnEventForAProject200ResponseTagsInner.key) &&
        Objects.equals(this.meta, retrieveAnEventForAProject200ResponseTagsInner.meta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, key, meta);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnEventForAProject200ResponseTagsInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("_meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveAnEventForAProject200ResponseTagsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveAnEventForAProject200ResponseTagsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAnEventForAProject200ResponseTagsInner is not found in the empty JSON string", RetrieveAnEventForAProject200ResponseTagsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAnEventForAProject200ResponseTagsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAnEventForAProject200ResponseTagsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("_meta") != null && !jsonObj.get("_meta").isJsonNull()) && !jsonObj.get("_meta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_meta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_meta").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAnEventForAProject200ResponseTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAnEventForAProject200ResponseTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAnEventForAProject200ResponseTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAnEventForAProject200ResponseTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAnEventForAProject200ResponseTagsInner>() {
           @Override
           public void write(JsonWriter out, RetrieveAnEventForAProject200ResponseTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAnEventForAProject200ResponseTagsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveAnEventForAProject200ResponseTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveAnEventForAProject200ResponseTagsInner
  * @throws IOException if the JSON string is invalid with respect to RetrieveAnEventForAProject200ResponseTagsInner
  */
  public static RetrieveAnEventForAProject200ResponseTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAnEventForAProject200ResponseTagsInner.class);
  }

 /**
  * Convert an instance of RetrieveAnEventForAProject200ResponseTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

