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
 * Additional details about the resolution. Valid values are &#x60;\&quot;inRelease\&quot;&#x60;, &#x60;\&quot;inNextRelease\&quot;&#x60;, &#x60;\&quot;inCommit\&quot;&#x60;, &#x60;\&quot;ignoreDuration\&quot;&#x60;, &#x60;\&quot;ignoreCount\&quot;&#x60;, &#x60;\&quot;ignoreWindow\&quot;&#x60;, &#x60;\&quot;ignoreUserCount\&quot;&#x60;, and &#x60;\&quot;ignoreUserWindow\&quot;&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class BulkMutateAListOfIssuesRequestStatusDetails {
  public static final String SERIALIZED_NAME_IN_RELEASE = "inRelease";
  @SerializedName(SERIALIZED_NAME_IN_RELEASE)
  private String inRelease;

  public static final String SERIALIZED_NAME_IN_NEXT_RELEASE = "inNextRelease";
  @SerializedName(SERIALIZED_NAME_IN_NEXT_RELEASE)
  private Boolean inNextRelease;

  public static final String SERIALIZED_NAME_IN_COMMIT = "inCommit";
  @SerializedName(SERIALIZED_NAME_IN_COMMIT)
  private String inCommit;

  public static final String SERIALIZED_NAME_IGNORE_DURATION = "ignoreDuration";
  @SerializedName(SERIALIZED_NAME_IGNORE_DURATION)
  private Integer ignoreDuration;

  public static final String SERIALIZED_NAME_IGNORE_COUNT = "ignoreCount";
  @SerializedName(SERIALIZED_NAME_IGNORE_COUNT)
  private Integer ignoreCount;

  public static final String SERIALIZED_NAME_IGNORE_WINDOW = "ignoreWindow";
  @SerializedName(SERIALIZED_NAME_IGNORE_WINDOW)
  private Integer ignoreWindow;

  public static final String SERIALIZED_NAME_IGNORE_USER_COUNT = "ignoreUserCount";
  @SerializedName(SERIALIZED_NAME_IGNORE_USER_COUNT)
  private Integer ignoreUserCount;

  public static final String SERIALIZED_NAME_IGNORE_USER_WINDOW = "ignoreUserWindow";
  @SerializedName(SERIALIZED_NAME_IGNORE_USER_WINDOW)
  private Integer ignoreUserWindow;

  public BulkMutateAListOfIssuesRequestStatusDetails() {
  }

  public BulkMutateAListOfIssuesRequestStatusDetails inRelease(String inRelease) {
    
    this.inRelease = inRelease;
    return this;
  }

   /**
   * Get inRelease
   * @return inRelease
  **/
  @javax.annotation.Nullable
  public String getInRelease() {
    return inRelease;
  }


  public void setInRelease(String inRelease) {
    this.inRelease = inRelease;
  }


  public BulkMutateAListOfIssuesRequestStatusDetails inNextRelease(Boolean inNextRelease) {
    
    this.inNextRelease = inNextRelease;
    return this;
  }

   /**
   * Get inNextRelease
   * @return inNextRelease
  **/
  @javax.annotation.Nullable
  public Boolean getInNextRelease() {
    return inNextRelease;
  }


  public void setInNextRelease(Boolean inNextRelease) {
    this.inNextRelease = inNextRelease;
  }


  public BulkMutateAListOfIssuesRequestStatusDetails inCommit(String inCommit) {
    
    this.inCommit = inCommit;
    return this;
  }

   /**
   * Get inCommit
   * @return inCommit
  **/
  @javax.annotation.Nullable
  public String getInCommit() {
    return inCommit;
  }


  public void setInCommit(String inCommit) {
    this.inCommit = inCommit;
  }


  public BulkMutateAListOfIssuesRequestStatusDetails ignoreDuration(Integer ignoreDuration) {
    
    this.ignoreDuration = ignoreDuration;
    return this;
  }

   /**
   * Get ignoreDuration
   * @return ignoreDuration
  **/
  @javax.annotation.Nullable
  public Integer getIgnoreDuration() {
    return ignoreDuration;
  }


  public void setIgnoreDuration(Integer ignoreDuration) {
    this.ignoreDuration = ignoreDuration;
  }


  public BulkMutateAListOfIssuesRequestStatusDetails ignoreCount(Integer ignoreCount) {
    
    this.ignoreCount = ignoreCount;
    return this;
  }

   /**
   * Get ignoreCount
   * @return ignoreCount
  **/
  @javax.annotation.Nullable
  public Integer getIgnoreCount() {
    return ignoreCount;
  }


  public void setIgnoreCount(Integer ignoreCount) {
    this.ignoreCount = ignoreCount;
  }


  public BulkMutateAListOfIssuesRequestStatusDetails ignoreWindow(Integer ignoreWindow) {
    
    this.ignoreWindow = ignoreWindow;
    return this;
  }

   /**
   * Get ignoreWindow
   * @return ignoreWindow
  **/
  @javax.annotation.Nullable
  public Integer getIgnoreWindow() {
    return ignoreWindow;
  }


  public void setIgnoreWindow(Integer ignoreWindow) {
    this.ignoreWindow = ignoreWindow;
  }


  public BulkMutateAListOfIssuesRequestStatusDetails ignoreUserCount(Integer ignoreUserCount) {
    
    this.ignoreUserCount = ignoreUserCount;
    return this;
  }

   /**
   * Get ignoreUserCount
   * @return ignoreUserCount
  **/
  @javax.annotation.Nullable
  public Integer getIgnoreUserCount() {
    return ignoreUserCount;
  }


  public void setIgnoreUserCount(Integer ignoreUserCount) {
    this.ignoreUserCount = ignoreUserCount;
  }


  public BulkMutateAListOfIssuesRequestStatusDetails ignoreUserWindow(Integer ignoreUserWindow) {
    
    this.ignoreUserWindow = ignoreUserWindow;
    return this;
  }

   /**
   * Get ignoreUserWindow
   * @return ignoreUserWindow
  **/
  @javax.annotation.Nullable
  public Integer getIgnoreUserWindow() {
    return ignoreUserWindow;
  }


  public void setIgnoreUserWindow(Integer ignoreUserWindow) {
    this.ignoreUserWindow = ignoreUserWindow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkMutateAListOfIssuesRequestStatusDetails bulkMutateAListOfIssuesRequestStatusDetails = (BulkMutateAListOfIssuesRequestStatusDetails) o;
    return Objects.equals(this.inRelease, bulkMutateAListOfIssuesRequestStatusDetails.inRelease) &&
        Objects.equals(this.inNextRelease, bulkMutateAListOfIssuesRequestStatusDetails.inNextRelease) &&
        Objects.equals(this.inCommit, bulkMutateAListOfIssuesRequestStatusDetails.inCommit) &&
        Objects.equals(this.ignoreDuration, bulkMutateAListOfIssuesRequestStatusDetails.ignoreDuration) &&
        Objects.equals(this.ignoreCount, bulkMutateAListOfIssuesRequestStatusDetails.ignoreCount) &&
        Objects.equals(this.ignoreWindow, bulkMutateAListOfIssuesRequestStatusDetails.ignoreWindow) &&
        Objects.equals(this.ignoreUserCount, bulkMutateAListOfIssuesRequestStatusDetails.ignoreUserCount) &&
        Objects.equals(this.ignoreUserWindow, bulkMutateAListOfIssuesRequestStatusDetails.ignoreUserWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inRelease, inNextRelease, inCommit, ignoreDuration, ignoreCount, ignoreWindow, ignoreUserCount, ignoreUserWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkMutateAListOfIssuesRequestStatusDetails {\n");
    sb.append("    inRelease: ").append(toIndentedString(inRelease)).append("\n");
    sb.append("    inNextRelease: ").append(toIndentedString(inNextRelease)).append("\n");
    sb.append("    inCommit: ").append(toIndentedString(inCommit)).append("\n");
    sb.append("    ignoreDuration: ").append(toIndentedString(ignoreDuration)).append("\n");
    sb.append("    ignoreCount: ").append(toIndentedString(ignoreCount)).append("\n");
    sb.append("    ignoreWindow: ").append(toIndentedString(ignoreWindow)).append("\n");
    sb.append("    ignoreUserCount: ").append(toIndentedString(ignoreUserCount)).append("\n");
    sb.append("    ignoreUserWindow: ").append(toIndentedString(ignoreUserWindow)).append("\n");
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
    openapiFields.add("inRelease");
    openapiFields.add("inNextRelease");
    openapiFields.add("inCommit");
    openapiFields.add("ignoreDuration");
    openapiFields.add("ignoreCount");
    openapiFields.add("ignoreWindow");
    openapiFields.add("ignoreUserCount");
    openapiFields.add("ignoreUserWindow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BulkMutateAListOfIssuesRequestStatusDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BulkMutateAListOfIssuesRequestStatusDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkMutateAListOfIssuesRequestStatusDetails is not found in the empty JSON string", BulkMutateAListOfIssuesRequestStatusDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BulkMutateAListOfIssuesRequestStatusDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkMutateAListOfIssuesRequestStatusDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("inRelease") != null && !jsonObj.get("inRelease").isJsonNull()) && !jsonObj.get("inRelease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inRelease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inRelease").toString()));
      }
      if ((jsonObj.get("inCommit") != null && !jsonObj.get("inCommit").isJsonNull()) && !jsonObj.get("inCommit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inCommit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inCommit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkMutateAListOfIssuesRequestStatusDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkMutateAListOfIssuesRequestStatusDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkMutateAListOfIssuesRequestStatusDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkMutateAListOfIssuesRequestStatusDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkMutateAListOfIssuesRequestStatusDetails>() {
           @Override
           public void write(JsonWriter out, BulkMutateAListOfIssuesRequestStatusDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkMutateAListOfIssuesRequestStatusDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BulkMutateAListOfIssuesRequestStatusDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkMutateAListOfIssuesRequestStatusDetails
  * @throws IOException if the JSON string is invalid with respect to BulkMutateAListOfIssuesRequestStatusDetails
  */
  public static BulkMutateAListOfIssuesRequestStatusDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkMutateAListOfIssuesRequestStatusDetails.class);
  }

 /**
  * Convert an instance of BulkMutateAListOfIssuesRequestStatusDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

