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
import java.util.HashMap;
import java.util.Map;
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
 * RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T09:39:48.475487Z[Etc/UTC]")
public class RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BY = "by";
  @SerializedName(SERIALIZED_NAME_BY)
  private Map<String, Object> by = new HashMap<>();

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private Map<String, Object> totals = new HashMap<>();

  public static final String SERIALIZED_NAME_SERIES = "series";
  @SerializedName(SERIALIZED_NAME_SERIES)
  private Map<String, Object> series = new HashMap<>();

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner() {
  }

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner by(Map<String, Object> by) {
    
    this.by = by;
    return this;
  }

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner putByItem(String key, Object byItem) {
    if (this.by == null) {
      this.by = new HashMap<>();
    }
    this.by.put(key, byItem);
    return this;
  }

   /**
   * Get by
   * @return by
  **/
  @javax.annotation.Nonnull
  public Map<String, Object> getBy() {
    return by;
  }


  public void setBy(Map<String, Object> by) {
    this.by = by;
  }


  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner totals(Map<String, Object> totals) {
    
    this.totals = totals;
    return this;
  }

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner putTotalsItem(String key, Object totalsItem) {
    if (this.totals == null) {
      this.totals = new HashMap<>();
    }
    this.totals.put(key, totalsItem);
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nonnull
  public Map<String, Object> getTotals() {
    return totals;
  }


  public void setTotals(Map<String, Object> totals) {
    this.totals = totals;
  }


  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner series(Map<String, Object> series) {
    
    this.series = series;
    return this;
  }

  public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner putSeriesItem(String key, Object seriesItem) {
    if (this.series == null) {
      this.series = new HashMap<>();
    }
    this.series.put(key, seriesItem);
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @javax.annotation.Nonnull
  public Map<String, Object> getSeries() {
    return series;
  }


  public void setSeries(Map<String, Object> series) {
    this.series = series;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner retrieveEventCountsForAnOrganizationV2200ResponseGroupsInner = (RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner) o;
    return Objects.equals(this.by, retrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.by) &&
        Objects.equals(this.totals, retrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.totals) &&
        Objects.equals(this.series, retrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(by, totals, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner {\n");
    sb.append("    by: ").append(toIndentedString(by)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
    openapiFields.add("by");
    openapiFields.add("totals");
    openapiFields.add("series");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("by");
    openapiRequiredFields.add("totals");
    openapiRequiredFields.add("series");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner is not found in the empty JSON string", RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner>() {
           @Override
           public void write(JsonWriter out, RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner
  * @throws IOException if the JSON string is invalid with respect to RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner
  */
  public static RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner.class);
  }

 /**
  * Convert an instance of RetrieveEventCountsForAnOrganizationV2200ResponseGroupsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

