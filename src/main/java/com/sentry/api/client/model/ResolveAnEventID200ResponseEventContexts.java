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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsBrowser;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsForbiddenError;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsOrganization;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsTrace;
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
 * ResolveAnEventID200ResponseEventContexts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventContexts {
  public static final String SERIALIZED_NAME_FORBIDDEN_ERROR = "ForbiddenError";
  @SerializedName(SERIALIZED_NAME_FORBIDDEN_ERROR)
  private ResolveAnEventID200ResponseEventContextsForbiddenError forbiddenError;

  public static final String SERIALIZED_NAME_BROWSER = "browser";
  @SerializedName(SERIALIZED_NAME_BROWSER)
  private ResolveAnEventID200ResponseEventContextsBrowser browser;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private ResolveAnEventID200ResponseEventContextsBrowser os;

  public static final String SERIALIZED_NAME_TRACE = "trace";
  @SerializedName(SERIALIZED_NAME_TRACE)
  private ResolveAnEventID200ResponseEventContextsTrace trace;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private ResolveAnEventID200ResponseEventContextsOrganization organization;

  public ResolveAnEventID200ResponseEventContexts() {
  }

  public ResolveAnEventID200ResponseEventContexts forbiddenError(ResolveAnEventID200ResponseEventContextsForbiddenError forbiddenError) {
    
    this.forbiddenError = forbiddenError;
    return this;
  }

   /**
   * Get forbiddenError
   * @return forbiddenError
  **/
  @javax.annotation.Nullable
  public ResolveAnEventID200ResponseEventContextsForbiddenError getForbiddenError() {
    return forbiddenError;
  }


  public void setForbiddenError(ResolveAnEventID200ResponseEventContextsForbiddenError forbiddenError) {
    this.forbiddenError = forbiddenError;
  }


  public ResolveAnEventID200ResponseEventContexts browser(ResolveAnEventID200ResponseEventContextsBrowser browser) {
    
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @javax.annotation.Nullable
  public ResolveAnEventID200ResponseEventContextsBrowser getBrowser() {
    return browser;
  }


  public void setBrowser(ResolveAnEventID200ResponseEventContextsBrowser browser) {
    this.browser = browser;
  }


  public ResolveAnEventID200ResponseEventContexts os(ResolveAnEventID200ResponseEventContextsBrowser os) {
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  public ResolveAnEventID200ResponseEventContextsBrowser getOs() {
    return os;
  }


  public void setOs(ResolveAnEventID200ResponseEventContextsBrowser os) {
    this.os = os;
  }


  public ResolveAnEventID200ResponseEventContexts trace(ResolveAnEventID200ResponseEventContextsTrace trace) {
    
    this.trace = trace;
    return this;
  }

   /**
   * Get trace
   * @return trace
  **/
  @javax.annotation.Nullable
  public ResolveAnEventID200ResponseEventContextsTrace getTrace() {
    return trace;
  }


  public void setTrace(ResolveAnEventID200ResponseEventContextsTrace trace) {
    this.trace = trace;
  }


  public ResolveAnEventID200ResponseEventContexts organization(ResolveAnEventID200ResponseEventContextsOrganization organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  public ResolveAnEventID200ResponseEventContextsOrganization getOrganization() {
    return organization;
  }


  public void setOrganization(ResolveAnEventID200ResponseEventContextsOrganization organization) {
    this.organization = organization;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventContexts resolveAnEventID200ResponseEventContexts = (ResolveAnEventID200ResponseEventContexts) o;
    return Objects.equals(this.forbiddenError, resolveAnEventID200ResponseEventContexts.forbiddenError) &&
        Objects.equals(this.browser, resolveAnEventID200ResponseEventContexts.browser) &&
        Objects.equals(this.os, resolveAnEventID200ResponseEventContexts.os) &&
        Objects.equals(this.trace, resolveAnEventID200ResponseEventContexts.trace) &&
        Objects.equals(this.organization, resolveAnEventID200ResponseEventContexts.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forbiddenError, browser, os, trace, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventContexts {\n");
    sb.append("    forbiddenError: ").append(toIndentedString(forbiddenError)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
    openapiFields.add("ForbiddenError");
    openapiFields.add("browser");
    openapiFields.add("os");
    openapiFields.add("trace");
    openapiFields.add("organization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResolveAnEventID200ResponseEventContexts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResolveAnEventID200ResponseEventContexts.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolveAnEventID200ResponseEventContexts is not found in the empty JSON string", ResolveAnEventID200ResponseEventContexts.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResolveAnEventID200ResponseEventContexts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolveAnEventID200ResponseEventContexts` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `ForbiddenError`
      if (jsonObj.get("ForbiddenError") != null && !jsonObj.get("ForbiddenError").isJsonNull()) {
        ResolveAnEventID200ResponseEventContextsForbiddenError.validateJsonObject(jsonObj.getAsJsonObject("ForbiddenError"));
      }
      // validate the optional field `browser`
      if (jsonObj.get("browser") != null && !jsonObj.get("browser").isJsonNull()) {
        ResolveAnEventID200ResponseEventContextsBrowser.validateJsonObject(jsonObj.getAsJsonObject("browser"));
      }
      // validate the optional field `os`
      if (jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) {
        ResolveAnEventID200ResponseEventContextsBrowser.validateJsonObject(jsonObj.getAsJsonObject("os"));
      }
      // validate the optional field `trace`
      if (jsonObj.get("trace") != null && !jsonObj.get("trace").isJsonNull()) {
        ResolveAnEventID200ResponseEventContextsTrace.validateJsonObject(jsonObj.getAsJsonObject("trace"));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        ResolveAnEventID200ResponseEventContextsOrganization.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolveAnEventID200ResponseEventContexts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolveAnEventID200ResponseEventContexts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolveAnEventID200ResponseEventContexts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventContexts.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolveAnEventID200ResponseEventContexts>() {
           @Override
           public void write(JsonWriter out, ResolveAnEventID200ResponseEventContexts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolveAnEventID200ResponseEventContexts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResolveAnEventID200ResponseEventContexts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResolveAnEventID200ResponseEventContexts
  * @throws IOException if the JSON string is invalid with respect to ResolveAnEventID200ResponseEventContexts
  */
  public static ResolveAnEventID200ResponseEventContexts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolveAnEventID200ResponseEventContexts.class);
  }

 /**
  * Convert an instance of ResolveAnEventID200ResponseEventContexts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

