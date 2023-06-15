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
 * ListAnOrganizationSUsers200ResponseInnerUserEmailsInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ListAnOrganizationSUsers200ResponseInnerUserEmailsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IS_VERIFIED = "is_verified";
  @SerializedName(SERIALIZED_NAME_IS_VERIFIED)
  private Boolean isVerified;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner() {
  }

  public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner isVerified(Boolean isVerified) {
    
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Get isVerified
   * @return isVerified
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsVerified() {
    return isVerified;
  }


  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }


  public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSUsers200ResponseInnerUserEmailsInner listAnOrganizationSUsers200ResponseInnerUserEmailsInner = (ListAnOrganizationSUsers200ResponseInnerUserEmailsInner) o;
    return Objects.equals(this.isVerified, listAnOrganizationSUsers200ResponseInnerUserEmailsInner.isVerified) &&
        Objects.equals(this.id, listAnOrganizationSUsers200ResponseInnerUserEmailsInner.id) &&
        Objects.equals(this.email, listAnOrganizationSUsers200ResponseInnerUserEmailsInner.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isVerified, id, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSUsers200ResponseInnerUserEmailsInner {\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("is_verified");
    openapiFields.add("id");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnOrganizationSUsers200ResponseInnerUserEmailsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnOrganizationSUsers200ResponseInnerUserEmailsInner is not found in the empty JSON string", ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnOrganizationSUsers200ResponseInnerUserEmailsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnOrganizationSUsers200ResponseInnerUserEmailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnOrganizationSUsers200ResponseInnerUserEmailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnOrganizationSUsers200ResponseInnerUserEmailsInner>() {
           @Override
           public void write(JsonWriter out, ListAnOrganizationSUsers200ResponseInnerUserEmailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnOrganizationSUsers200ResponseInnerUserEmailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnOrganizationSUsers200ResponseInnerUserEmailsInner
  * @throws IOException if the JSON string is invalid with respect to ListAnOrganizationSUsers200ResponseInnerUserEmailsInner
  */
  public static ListAnOrganizationSUsers200ResponseInnerUserEmailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.class);
  }

 /**
  * Convert an instance of ListAnOrganizationSUsers200ResponseInnerUserEmailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
