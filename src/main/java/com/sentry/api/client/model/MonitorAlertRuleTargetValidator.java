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
 * MonitorAlertRuleTargetValidator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class MonitorAlertRuleTargetValidator {
  public static final String SERIALIZED_NAME_TARGET_IDENTIFIER = "target_identifier";
  @SerializedName(SERIALIZED_NAME_TARGET_IDENTIFIER)
  private Integer targetIdentifier;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public MonitorAlertRuleTargetValidator() {
  }

  public MonitorAlertRuleTargetValidator targetIdentifier(Integer targetIdentifier) {
    
    this.targetIdentifier = targetIdentifier;
    return this;
  }

   /**
   * ID of target object
   * @return targetIdentifier
  **/
  @javax.annotation.Nonnull
  public Integer getTargetIdentifier() {
    return targetIdentifier;
  }


  public void setTargetIdentifier(Integer targetIdentifier) {
    this.targetIdentifier = targetIdentifier;
  }


  public MonitorAlertRuleTargetValidator targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * One of [Member, Team]
   * @return targetType
  **/
  @javax.annotation.Nonnull
  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorAlertRuleTargetValidator monitorAlertRuleTargetValidator = (MonitorAlertRuleTargetValidator) o;
    return Objects.equals(this.targetIdentifier, monitorAlertRuleTargetValidator.targetIdentifier) &&
        Objects.equals(this.targetType, monitorAlertRuleTargetValidator.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetIdentifier, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorAlertRuleTargetValidator {\n");
    sb.append("    targetIdentifier: ").append(toIndentedString(targetIdentifier)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("target_identifier");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("target_identifier");
    openapiRequiredFields.add("target_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MonitorAlertRuleTargetValidator
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MonitorAlertRuleTargetValidator.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MonitorAlertRuleTargetValidator is not found in the empty JSON string", MonitorAlertRuleTargetValidator.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MonitorAlertRuleTargetValidator.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MonitorAlertRuleTargetValidator` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MonitorAlertRuleTargetValidator.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MonitorAlertRuleTargetValidator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MonitorAlertRuleTargetValidator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MonitorAlertRuleTargetValidator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MonitorAlertRuleTargetValidator.class));

       return (TypeAdapter<T>) new TypeAdapter<MonitorAlertRuleTargetValidator>() {
           @Override
           public void write(JsonWriter out, MonitorAlertRuleTargetValidator value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MonitorAlertRuleTargetValidator read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MonitorAlertRuleTargetValidator given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MonitorAlertRuleTargetValidator
  * @throws IOException if the JSON string is invalid with respect to MonitorAlertRuleTargetValidator
  */
  public static MonitorAlertRuleTargetValidator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MonitorAlertRuleTargetValidator.class);
  }

 /**
  * Convert an instance of MonitorAlertRuleTargetValidator to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

