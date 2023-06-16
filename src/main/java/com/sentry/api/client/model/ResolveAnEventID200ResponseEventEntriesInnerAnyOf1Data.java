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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf1DataEnv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:28:08.282703Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data {
  public static final String SERIALIZED_NAME_FRAGMENT = "fragment";
  @SerializedName(SERIALIZED_NAME_FRAGMENT)
  private String fragment;

  public static final String SERIALIZED_NAME_COOKIES = "cookies";
  @SerializedName(SERIALIZED_NAME_COOKIES)
  private List<List<String>> cookies;

  public static final String SERIALIZED_NAME_INFERRED_CONTENT_TYPE = "inferredContentType";
  @SerializedName(SERIALIZED_NAME_INFERRED_CONTENT_TYPE)
  private String inferredContentType;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private ResolveAnEventID200ResponseEventEntriesInnerAnyOf1DataEnv env;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<List<String>> headers = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private List<List<String>> query = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data() {
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data fragment(String fragment) {
    
    this.fragment = fragment;
    return this;
  }

   /**
   * Get fragment
   * @return fragment
  **/
  @javax.annotation.Nullable
  public String getFragment() {
    return fragment;
  }


  public void setFragment(String fragment) {
    this.fragment = fragment;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data cookies(List<List<String>> cookies) {
    
    this.cookies = cookies;
    return this;
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data addCookiesItem(List<String> cookiesItem) {
    if (this.cookies == null) {
      this.cookies = new ArrayList<>();
    }
    this.cookies.add(cookiesItem);
    return this;
  }

   /**
   * Get cookies
   * @return cookies
  **/
  @javax.annotation.Nullable
  public List<List<String>> getCookies() {
    return cookies;
  }


  public void setCookies(List<List<String>> cookies) {
    this.cookies = cookies;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data inferredContentType(String inferredContentType) {
    
    this.inferredContentType = inferredContentType;
    return this;
  }

   /**
   * Get inferredContentType
   * @return inferredContentType
  **/
  @javax.annotation.Nullable
  public String getInferredContentType() {
    return inferredContentType;
  }


  public void setInferredContentType(String inferredContentType) {
    this.inferredContentType = inferredContentType;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data env(ResolveAnEventID200ResponseEventEntriesInnerAnyOf1DataEnv env) {
    
    this.env = env;
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @javax.annotation.Nullable
  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1DataEnv getEnv() {
    return env;
  }


  public void setEnv(ResolveAnEventID200ResponseEventEntriesInnerAnyOf1DataEnv env) {
    this.env = env;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data headers(List<List<String>> headers) {
    
    this.headers = headers;
    return this;
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data addHeadersItem(List<String> headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nonnull
  public List<List<String>> getHeaders() {
    return headers;
  }


  public void setHeaders(List<List<String>> headers) {
    this.headers = headers;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data query(List<List<String>> query) {
    
    this.query = query;
    return this;
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data addQueryItem(List<String> queryItem) {
    if (this.query == null) {
      this.query = new ArrayList<>();
    }
    this.query.add(queryItem);
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nonnull
  public List<List<String>> getQuery() {
    return query;
  }


  public void setQuery(List<List<String>> query) {
    this.query = query;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data) o;
    return Objects.equals(this.fragment, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.fragment) &&
        Objects.equals(this.cookies, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.cookies) &&
        Objects.equals(this.inferredContentType, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.inferredContentType) &&
        Objects.equals(this.env, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.env) &&
        Objects.equals(this.headers, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.headers) &&
        Objects.equals(this.url, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.url) &&
        Objects.equals(this.query, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.query) &&
        Objects.equals(this.data, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.data) &&
        Objects.equals(this.method, resolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fragment, cookies, inferredContentType, env, headers, url, query, data, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data {\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
    sb.append("    inferredContentType: ").append(toIndentedString(inferredContentType)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
    openapiFields.add("fragment");
    openapiFields.add("cookies");
    openapiFields.add("inferredContentType");
    openapiFields.add("env");
    openapiFields.add("headers");
    openapiFields.add("url");
    openapiFields.add("query");
    openapiFields.add("data");
    openapiFields.add("method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fragment");
    openapiRequiredFields.add("cookies");
    openapiRequiredFields.add("inferredContentType");
    openapiRequiredFields.add("env");
    openapiRequiredFields.add("headers");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("method");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data is not found in the empty JSON string", ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("fragment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fragment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fragment").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("cookies") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("cookies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookies` to be an array in the JSON string but got `%s`", jsonObj.get("cookies").toString()));
      }
      if (!jsonObj.get("inferredContentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inferredContentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inferredContentType").toString()));
      }
      // validate the required field `env`
      ResolveAnEventID200ResponseEventEntriesInnerAnyOf1DataEnv.validateJsonObject(jsonObj.getAsJsonObject("env"));
      // ensure the required json array is present
      if (jsonObj.get("headers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("query") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("query").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be an array in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.class));

       return (TypeAdapter<T>) new TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data>() {
           @Override
           public void write(JsonWriter out, ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data
  * @throws IOException if the JSON string is invalid with respect to ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data
  */
  public static ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data.class);
  }

 /**
  * Convert an instance of ResolveAnEventID200ResponseEventEntriesInnerAnyOf1Data to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

