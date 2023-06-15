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
 * ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner() {
  }

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner display(String display) {
    
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  @jakarta.annotation.Nonnull
  public String getDisplay() {
    return display;
  }


  public void setDisplay(String display) {
    this.display = display;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner listAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner = (ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner) o;
    return Objects.equals(this.value, listAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.value) &&
        Objects.equals(this.display, listAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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
    openapiFields.add("display");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("display");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner is not found in the empty JSON string", ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (!jsonObj.get("display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner>() {
           @Override
           public void write(JsonWriter out, ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner
  * @throws IOException if the JSON string is invalid with respect to ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner
  */
  public static ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner.class);
  }

 /**
  * Convert an instance of ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMembersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

