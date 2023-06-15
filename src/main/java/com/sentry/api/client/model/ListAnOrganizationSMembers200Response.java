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
import com.sentry.api.client.model.ListAnOrganizationSMembers200ResponseResourcesInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ListAnOrganizationSMembers200Response
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ListAnOrganizationSMembers200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SCHEMAS = "schemas";
  @SerializedName(SERIALIZED_NAME_SCHEMAS)
  private List<String> schemas = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_RESULTS = "totalResults";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESULTS)
  private Integer totalResults;

  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "itemsPerPage";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  private Integer itemsPerPage;

  public static final String SERIALIZED_NAME_RESOURCES = "Resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<ListAnOrganizationSMembers200ResponseResourcesInner> resources = new ArrayList<>();

  public ListAnOrganizationSMembers200Response() {
  }

  public ListAnOrganizationSMembers200Response schemas(List<String> schemas) {
    
    this.schemas = schemas;
    return this;
  }

  public ListAnOrganizationSMembers200Response addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @jakarta.annotation.Nonnull
  public List<String> getSchemas() {
    return schemas;
  }


  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }


  public ListAnOrganizationSMembers200Response totalResults(Integer totalResults) {
    
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @jakarta.annotation.Nonnull
  public Integer getTotalResults() {
    return totalResults;
  }


  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  public ListAnOrganizationSMembers200Response startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @jakarta.annotation.Nonnull
  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public ListAnOrganizationSMembers200Response itemsPerPage(Integer itemsPerPage) {
    
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * Get itemsPerPage
   * @return itemsPerPage
  **/
  @jakarta.annotation.Nonnull
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }


  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }


  public ListAnOrganizationSMembers200Response resources(List<ListAnOrganizationSMembers200ResponseResourcesInner> resources) {
    
    this.resources = resources;
    return this;
  }

  public ListAnOrganizationSMembers200Response addResourcesItem(ListAnOrganizationSMembers200ResponseResourcesInner resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nonnull
  public List<ListAnOrganizationSMembers200ResponseResourcesInner> getResources() {
    return resources;
  }


  public void setResources(List<ListAnOrganizationSMembers200ResponseResourcesInner> resources) {
    this.resources = resources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSMembers200Response listAnOrganizationSMembers200Response = (ListAnOrganizationSMembers200Response) o;
    return Objects.equals(this.schemas, listAnOrganizationSMembers200Response.schemas) &&
        Objects.equals(this.totalResults, listAnOrganizationSMembers200Response.totalResults) &&
        Objects.equals(this.startIndex, listAnOrganizationSMembers200Response.startIndex) &&
        Objects.equals(this.itemsPerPage, listAnOrganizationSMembers200Response.itemsPerPage) &&
        Objects.equals(this.resources, listAnOrganizationSMembers200Response.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, totalResults, startIndex, itemsPerPage, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSMembers200Response {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
    openapiFields.add("schemas");
    openapiFields.add("totalResults");
    openapiFields.add("startIndex");
    openapiFields.add("itemsPerPage");
    openapiFields.add("Resources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schemas");
    openapiRequiredFields.add("totalResults");
    openapiRequiredFields.add("startIndex");
    openapiRequiredFields.add("itemsPerPage");
    openapiRequiredFields.add("Resources");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnOrganizationSMembers200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnOrganizationSMembers200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnOrganizationSMembers200Response is not found in the empty JSON string", ListAnOrganizationSMembers200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnOrganizationSMembers200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnOrganizationSMembers200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAnOrganizationSMembers200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("schemas") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("schemas").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemas` to be an array in the JSON string but got `%s`", jsonObj.get("schemas").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("Resources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Resources` to be an array in the JSON string but got `%s`", jsonObj.get("Resources").toString()));
      }

      JsonArray jsonArrayresources = jsonObj.getAsJsonArray("Resources");
      // validate the required field `Resources` (array)
      for (int i = 0; i < jsonArrayresources.size(); i++) {
        ListAnOrganizationSMembers200ResponseResourcesInner.validateJsonObject(jsonArrayresources.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnOrganizationSMembers200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnOrganizationSMembers200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnOrganizationSMembers200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnOrganizationSMembers200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnOrganizationSMembers200Response>() {
           @Override
           public void write(JsonWriter out, ListAnOrganizationSMembers200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnOrganizationSMembers200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnOrganizationSMembers200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnOrganizationSMembers200Response
  * @throws IOException if the JSON string is invalid with respect to ListAnOrganizationSMembers200Response
  */
  public static ListAnOrganizationSMembers200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnOrganizationSMembers200Response.class);
  }

 /**
  * Convert an instance of ListAnOrganizationSMembers200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

