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
 * RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T09:39:48.475487Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization() {
  }

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization name(String name) {
    
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
    RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization retrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization = (RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization) o;
    return Objects.equals(this.slug, retrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.slug) &&
        Objects.equals(this.name, retrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization {\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
    openapiFields.add("slug");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization is not found in the empty JSON string", RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization>() {
           @Override
           public void write(JsonWriter out, RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization
  * @throws IOException if the JSON string is invalid with respect to RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization
  */
  public static RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization.class);
  }

 /**
  * Convert an instance of RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

