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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner;
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
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOfData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T09:39:48.475487Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOfData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner> values = new ArrayList<>();

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfData() {
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfData values(List<ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner> values) {
    
    this.values = values;
    return this;
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOfData addValuesItem(ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nonnull
  public List<ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner> getValues() {
    return values;
  }


  public void setValues(List<ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOfData resolveAnEventID200ResponseEventEntriesInnerAnyOfData = (ResolveAnEventID200ResponseEventEntriesInnerAnyOfData) o;
    return Objects.equals(this.values, resolveAnEventID200ResponseEventEntriesInnerAnyOfData.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOfData {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("values");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResolveAnEventID200ResponseEventEntriesInnerAnyOfData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOfData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolveAnEventID200ResponseEventEntriesInnerAnyOfData is not found in the empty JSON string", ResolveAnEventID200ResponseEventEntriesInnerAnyOfData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOfData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolveAnEventID200ResponseEventEntriesInnerAnyOfData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResolveAnEventID200ResponseEventEntriesInnerAnyOfData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }

      JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
      // validate the required field `values` (array)
      for (int i = 0; i < jsonArrayvalues.size(); i++) {
        ResolveAnEventID200ResponseEventEntriesInnerAnyOfDataValuesInner.validateJsonObject(jsonArrayvalues.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOfData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolveAnEventID200ResponseEventEntriesInnerAnyOfData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOfData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventEntriesInnerAnyOfData.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOfData>() {
           @Override
           public void write(JsonWriter out, ResolveAnEventID200ResponseEventEntriesInnerAnyOfData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolveAnEventID200ResponseEventEntriesInnerAnyOfData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOfData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOfData
  * @throws IOException if the JSON string is invalid with respect to ResolveAnEventID200ResponseEventEntriesInnerAnyOfData
  */
  public static ResolveAnEventID200ResponseEventEntriesInnerAnyOfData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolveAnEventID200ResponseEventEntriesInnerAnyOfData.class);
  }

 /**
  * Convert an instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOfData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

