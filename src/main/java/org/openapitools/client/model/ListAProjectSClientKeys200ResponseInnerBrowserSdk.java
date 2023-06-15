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
 * ListAProjectSClientKeys200ResponseInnerBrowserSdk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T09:39:48.475487Z[Etc/UTC]")
public class ListAProjectSClientKeys200ResponseInnerBrowserSdk implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CHOICES = "choices";
  @SerializedName(SERIALIZED_NAME_CHOICES)
  private List<List<String>> choices;

  public ListAProjectSClientKeys200ResponseInnerBrowserSdk() {
  }

  public ListAProjectSClientKeys200ResponseInnerBrowserSdk choices(List<List<String>> choices) {
    
    this.choices = choices;
    return this;
  }

  public ListAProjectSClientKeys200ResponseInnerBrowserSdk addChoicesItem(List<String> choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * Get choices
   * @return choices
  **/
  @javax.annotation.Nullable
  public List<List<String>> getChoices() {
    return choices;
  }


  public void setChoices(List<List<String>> choices) {
    this.choices = choices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSClientKeys200ResponseInnerBrowserSdk listAProjectSClientKeys200ResponseInnerBrowserSdk = (ListAProjectSClientKeys200ResponseInnerBrowserSdk) o;
    return Objects.equals(this.choices, listAProjectSClientKeys200ResponseInnerBrowserSdk.choices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSClientKeys200ResponseInnerBrowserSdk {\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
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
    openapiFields.add("choices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAProjectSClientKeys200ResponseInnerBrowserSdk
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAProjectSClientKeys200ResponseInnerBrowserSdk.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAProjectSClientKeys200ResponseInnerBrowserSdk is not found in the empty JSON string", ListAProjectSClientKeys200ResponseInnerBrowserSdk.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAProjectSClientKeys200ResponseInnerBrowserSdk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAProjectSClientKeys200ResponseInnerBrowserSdk` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("choices") != null && !jsonObj.get("choices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `choices` to be an array in the JSON string but got `%s`", jsonObj.get("choices").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAProjectSClientKeys200ResponseInnerBrowserSdk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAProjectSClientKeys200ResponseInnerBrowserSdk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAProjectSClientKeys200ResponseInnerBrowserSdk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAProjectSClientKeys200ResponseInnerBrowserSdk.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAProjectSClientKeys200ResponseInnerBrowserSdk>() {
           @Override
           public void write(JsonWriter out, ListAProjectSClientKeys200ResponseInnerBrowserSdk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAProjectSClientKeys200ResponseInnerBrowserSdk read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAProjectSClientKeys200ResponseInnerBrowserSdk given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAProjectSClientKeys200ResponseInnerBrowserSdk
  * @throws IOException if the JSON string is invalid with respect to ListAProjectSClientKeys200ResponseInnerBrowserSdk
  */
  public static ListAProjectSClientKeys200ResponseInnerBrowserSdk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAProjectSClientKeys200ResponseInnerBrowserSdk.class);
  }

 /**
  * Convert an instance of ListAProjectSClientKeys200ResponseInnerBrowserSdk to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

