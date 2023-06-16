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
import com.sentry.api.client.model.CreateANewCheckInRequestMonitorConfig;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * MonitorCheckInValidator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:28:08.282703Z[Etc/UTC]")
public class MonitorCheckInValidator {
  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OK("ok"),
    
    ERROR("error"),
    
    IN_PROGRESS("in_progress");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_MONITOR_CONFIG = "monitor_config";
  @SerializedName(SERIALIZED_NAME_MONITOR_CONFIG)
  private CreateANewCheckInRequestMonitorConfig monitorConfig;

  public MonitorCheckInValidator() {
  }

  public MonitorCheckInValidator status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public MonitorCheckInValidator duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * minimum: 0
   * maximum: 2147483647
   * @return duration
  **/
  @javax.annotation.Nullable
  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public MonitorCheckInValidator environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public MonitorCheckInValidator monitorConfig(CreateANewCheckInRequestMonitorConfig monitorConfig) {
    
    this.monitorConfig = monitorConfig;
    return this;
  }

   /**
   * Get monitorConfig
   * @return monitorConfig
  **/
  @javax.annotation.Nullable
  public CreateANewCheckInRequestMonitorConfig getMonitorConfig() {
    return monitorConfig;
  }


  public void setMonitorConfig(CreateANewCheckInRequestMonitorConfig monitorConfig) {
    this.monitorConfig = monitorConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorCheckInValidator monitorCheckInValidator = (MonitorCheckInValidator) o;
    return Objects.equals(this.status, monitorCheckInValidator.status) &&
        Objects.equals(this.duration, monitorCheckInValidator.duration) &&
        Objects.equals(this.environment, monitorCheckInValidator.environment) &&
        Objects.equals(this.monitorConfig, monitorCheckInValidator.monitorConfig);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, duration, environment, monitorConfig);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorCheckInValidator {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    monitorConfig: ").append(toIndentedString(monitorConfig)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("duration");
    openapiFields.add("environment");
    openapiFields.add("monitor_config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MonitorCheckInValidator
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MonitorCheckInValidator.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MonitorCheckInValidator is not found in the empty JSON string", MonitorCheckInValidator.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MonitorCheckInValidator.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MonitorCheckInValidator` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MonitorCheckInValidator.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      // validate the optional field `monitor_config`
      if (jsonObj.get("monitor_config") != null && !jsonObj.get("monitor_config").isJsonNull()) {
        CreateANewCheckInRequestMonitorConfig.validateJsonObject(jsonObj.getAsJsonObject("monitor_config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MonitorCheckInValidator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MonitorCheckInValidator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MonitorCheckInValidator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MonitorCheckInValidator.class));

       return (TypeAdapter<T>) new TypeAdapter<MonitorCheckInValidator>() {
           @Override
           public void write(JsonWriter out, MonitorCheckInValidator value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MonitorCheckInValidator read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MonitorCheckInValidator given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MonitorCheckInValidator
  * @throws IOException if the JSON string is invalid with respect to MonitorCheckInValidator
  */
  public static MonitorCheckInValidator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MonitorCheckInValidator.class);
  }

 /**
  * Convert an instance of MonitorCheckInValidator to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

