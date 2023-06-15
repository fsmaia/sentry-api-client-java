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
 * RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T09:39:48.475487Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider() {
  }

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider id(String id) {
    
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


  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider retrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider = (RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider) o;
    return Objects.equals(this.id, retrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.id) &&
        Objects.equals(this.name, retrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider is not found in the empty JSON string", RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider>() {
           @Override
           public void write(JsonWriter out, RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider
  * @throws IOException if the JSON string is invalid with respect to RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider
  */
  public static RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.class);
  }

 /**
  * Convert an instance of RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

