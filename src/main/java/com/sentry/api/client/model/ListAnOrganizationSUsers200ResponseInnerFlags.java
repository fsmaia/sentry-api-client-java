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
 * ListAnOrganizationSUsers200ResponseInnerFlags
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ListAnOrganizationSUsers200ResponseInnerFlags implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SSO_COLON_LINKED = "sso: linked";
  @SerializedName(SERIALIZED_NAME_SSO_COLON_LINKED)
  private Boolean ssoColonLinked;

  public static final String SERIALIZED_NAME_SSO_COLON_INVALID = "sso: invalid";
  @SerializedName(SERIALIZED_NAME_SSO_COLON_INVALID)
  private Boolean ssoColonInvalid;

  public ListAnOrganizationSUsers200ResponseInnerFlags() {
  }

  public ListAnOrganizationSUsers200ResponseInnerFlags ssoColonLinked(Boolean ssoColonLinked) {
    
    this.ssoColonLinked = ssoColonLinked;
    return this;
  }

   /**
   * Get ssoColonLinked
   * @return ssoColonLinked
  **/
  @jakarta.annotation.Nullable
  public Boolean getSsoColonLinked() {
    return ssoColonLinked;
  }


  public void setSsoColonLinked(Boolean ssoColonLinked) {
    this.ssoColonLinked = ssoColonLinked;
  }


  public ListAnOrganizationSUsers200ResponseInnerFlags ssoColonInvalid(Boolean ssoColonInvalid) {
    
    this.ssoColonInvalid = ssoColonInvalid;
    return this;
  }

   /**
   * Get ssoColonInvalid
   * @return ssoColonInvalid
  **/
  @jakarta.annotation.Nullable
  public Boolean getSsoColonInvalid() {
    return ssoColonInvalid;
  }


  public void setSsoColonInvalid(Boolean ssoColonInvalid) {
    this.ssoColonInvalid = ssoColonInvalid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSUsers200ResponseInnerFlags listAnOrganizationSUsers200ResponseInnerFlags = (ListAnOrganizationSUsers200ResponseInnerFlags) o;
    return Objects.equals(this.ssoColonLinked, listAnOrganizationSUsers200ResponseInnerFlags.ssoColonLinked) &&
        Objects.equals(this.ssoColonInvalid, listAnOrganizationSUsers200ResponseInnerFlags.ssoColonInvalid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssoColonLinked, ssoColonInvalid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSUsers200ResponseInnerFlags {\n");
    sb.append("    ssoColonLinked: ").append(toIndentedString(ssoColonLinked)).append("\n");
    sb.append("    ssoColonInvalid: ").append(toIndentedString(ssoColonInvalid)).append("\n");
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
    openapiFields.add("sso: linked");
    openapiFields.add("sso: invalid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnOrganizationSUsers200ResponseInnerFlags
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnOrganizationSUsers200ResponseInnerFlags.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnOrganizationSUsers200ResponseInnerFlags is not found in the empty JSON string", ListAnOrganizationSUsers200ResponseInnerFlags.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnOrganizationSUsers200ResponseInnerFlags.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnOrganizationSUsers200ResponseInnerFlags` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnOrganizationSUsers200ResponseInnerFlags.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnOrganizationSUsers200ResponseInnerFlags' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnOrganizationSUsers200ResponseInnerFlags> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnOrganizationSUsers200ResponseInnerFlags.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnOrganizationSUsers200ResponseInnerFlags>() {
           @Override
           public void write(JsonWriter out, ListAnOrganizationSUsers200ResponseInnerFlags value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnOrganizationSUsers200ResponseInnerFlags read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnOrganizationSUsers200ResponseInnerFlags given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnOrganizationSUsers200ResponseInnerFlags
  * @throws IOException if the JSON string is invalid with respect to ListAnOrganizationSUsers200ResponseInnerFlags
  */
  public static ListAnOrganizationSUsers200ResponseInnerFlags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnOrganizationSUsers200ResponseInnerFlags.class);
  }

 /**
  * Convert an instance of ListAnOrganizationSUsers200ResponseInnerFlags to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

