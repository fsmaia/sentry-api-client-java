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
 * RetrieveAnEventForAProject200ResponseErrorsInnerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:28:08.282703Z[Etc/UTC]")
public class RetrieveAnEventForAProject200ResponseErrorsInnerData {
  public static final String SERIALIZED_NAME_COLUMN = "column";
  @SerializedName(SERIALIZED_NAME_COLUMN)
  private Integer column;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_ROW = "row";
  @SerializedName(SERIALIZED_NAME_ROW)
  private Integer row;

  public RetrieveAnEventForAProject200ResponseErrorsInnerData() {
  }

  public RetrieveAnEventForAProject200ResponseErrorsInnerData column(Integer column) {
    
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @javax.annotation.Nullable
  public Integer getColumn() {
    return column;
  }


  public void setColumn(Integer column) {
    this.column = column;
  }


  public RetrieveAnEventForAProject200ResponseErrorsInnerData source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public RetrieveAnEventForAProject200ResponseErrorsInnerData row(Integer row) {
    
    this.row = row;
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @javax.annotation.Nullable
  public Integer getRow() {
    return row;
  }


  public void setRow(Integer row) {
    this.row = row;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnEventForAProject200ResponseErrorsInnerData retrieveAnEventForAProject200ResponseErrorsInnerData = (RetrieveAnEventForAProject200ResponseErrorsInnerData) o;
    return Objects.equals(this.column, retrieveAnEventForAProject200ResponseErrorsInnerData.column) &&
        Objects.equals(this.source, retrieveAnEventForAProject200ResponseErrorsInnerData.source) &&
        Objects.equals(this.row, retrieveAnEventForAProject200ResponseErrorsInnerData.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, source, row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnEventForAProject200ResponseErrorsInnerData {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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
    openapiFields.add("column");
    openapiFields.add("source");
    openapiFields.add("row");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveAnEventForAProject200ResponseErrorsInnerData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveAnEventForAProject200ResponseErrorsInnerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAnEventForAProject200ResponseErrorsInnerData is not found in the empty JSON string", RetrieveAnEventForAProject200ResponseErrorsInnerData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAnEventForAProject200ResponseErrorsInnerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAnEventForAProject200ResponseErrorsInnerData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAnEventForAProject200ResponseErrorsInnerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAnEventForAProject200ResponseErrorsInnerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAnEventForAProject200ResponseErrorsInnerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAnEventForAProject200ResponseErrorsInnerData.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAnEventForAProject200ResponseErrorsInnerData>() {
           @Override
           public void write(JsonWriter out, RetrieveAnEventForAProject200ResponseErrorsInnerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAnEventForAProject200ResponseErrorsInnerData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveAnEventForAProject200ResponseErrorsInnerData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveAnEventForAProject200ResponseErrorsInnerData
  * @throws IOException if the JSON string is invalid with respect to RetrieveAnEventForAProject200ResponseErrorsInnerData
  */
  public static RetrieveAnEventForAProject200ResponseErrorsInnerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAnEventForAProject200ResponseErrorsInnerData.class);
  }

 /**
  * Convert an instance of RetrieveAnEventForAProject200ResponseErrorsInnerData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
