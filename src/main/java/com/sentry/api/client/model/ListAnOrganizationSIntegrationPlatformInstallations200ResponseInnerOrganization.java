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
 * ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization() {
  }

  public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @jakarta.annotation.Nonnull
  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization listAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization = (ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization) o;
    return Objects.equals(this.slug, listAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization {\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("slug");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization is not found in the empty JSON string", ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization>() {
           @Override
           public void write(JsonWriter out, ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization
  * @throws IOException if the JSON string is invalid with respect to ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization
  */
  public static ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization.class);
  }

 /**
  * Convert an instance of ListAnOrganizationSIntegrationPlatformInstallations200ResponseInnerOrganization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

