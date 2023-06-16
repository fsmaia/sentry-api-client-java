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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * RetrieveATeam200ResponseAvatar
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class RetrieveATeam200ResponseAvatar {
  public static final String SERIALIZED_NAME_AVATAR_TYPE = "avatarType";
  @SerializedName(SERIALIZED_NAME_AVATAR_TYPE)
  private String avatarType;

  public static final String SERIALIZED_NAME_AVATAR_UUID = "avatarUuid";
  @SerializedName(SERIALIZED_NAME_AVATAR_UUID)
  private String avatarUuid;

  public RetrieveATeam200ResponseAvatar() {
  }

  public RetrieveATeam200ResponseAvatar avatarType(String avatarType) {
    
    this.avatarType = avatarType;
    return this;
  }

   /**
   * Get avatarType
   * @return avatarType
  **/
  @javax.annotation.Nullable
  public String getAvatarType() {
    return avatarType;
  }


  public void setAvatarType(String avatarType) {
    this.avatarType = avatarType;
  }


  public RetrieveATeam200ResponseAvatar avatarUuid(String avatarUuid) {
    
    this.avatarUuid = avatarUuid;
    return this;
  }

   /**
   * Get avatarUuid
   * @return avatarUuid
  **/
  @javax.annotation.Nullable
  public String getAvatarUuid() {
    return avatarUuid;
  }


  public void setAvatarUuid(String avatarUuid) {
    this.avatarUuid = avatarUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveATeam200ResponseAvatar retrieveATeam200ResponseAvatar = (RetrieveATeam200ResponseAvatar) o;
    return Objects.equals(this.avatarType, retrieveATeam200ResponseAvatar.avatarType) &&
        Objects.equals(this.avatarUuid, retrieveATeam200ResponseAvatar.avatarUuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarType, avatarUuid);
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
    sb.append("class RetrieveATeam200ResponseAvatar {\n");
    sb.append("    avatarType: ").append(toIndentedString(avatarType)).append("\n");
    sb.append("    avatarUuid: ").append(toIndentedString(avatarUuid)).append("\n");
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
    openapiFields.add("avatarType");
    openapiFields.add("avatarUuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveATeam200ResponseAvatar
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveATeam200ResponseAvatar.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveATeam200ResponseAvatar is not found in the empty JSON string", RetrieveATeam200ResponseAvatar.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveATeam200ResponseAvatar.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveATeam200ResponseAvatar` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("avatarType") != null && !jsonObj.get("avatarType").isJsonNull()) && !jsonObj.get("avatarType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarType").toString()));
      }
      if ((jsonObj.get("avatarUuid") != null && !jsonObj.get("avatarUuid").isJsonNull()) && !jsonObj.get("avatarUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveATeam200ResponseAvatar.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveATeam200ResponseAvatar' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveATeam200ResponseAvatar> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveATeam200ResponseAvatar.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveATeam200ResponseAvatar>() {
           @Override
           public void write(JsonWriter out, RetrieveATeam200ResponseAvatar value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveATeam200ResponseAvatar read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveATeam200ResponseAvatar given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveATeam200ResponseAvatar
  * @throws IOException if the JSON string is invalid with respect to RetrieveATeam200ResponseAvatar
  */
  public static RetrieveATeam200ResponseAvatar fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveATeam200ResponseAvatar.class);
  }

 /**
  * Convert an instance of RetrieveATeam200ResponseAvatar to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

