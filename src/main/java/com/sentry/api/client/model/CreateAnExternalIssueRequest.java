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
 * CreateAnExternalIssueRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class CreateAnExternalIssueRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ISSUE_ID = "issueId";
  @SerializedName(SERIALIZED_NAME_ISSUE_ID)
  private Integer issueId;

  public static final String SERIALIZED_NAME_WEB_URL = "webUrl";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public CreateAnExternalIssueRequest() {
  }

  public CreateAnExternalIssueRequest issueId(Integer issueId) {
    
    this.issueId = issueId;
    return this;
  }

   /**
   * The ID of the Sentry issue to link the external issue to.
   * @return issueId
  **/
  @jakarta.annotation.Nonnull
  public Integer getIssueId() {
    return issueId;
  }


  public void setIssueId(Integer issueId) {
    this.issueId = issueId;
  }


  public CreateAnExternalIssueRequest webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * The URL of the external service to link the issue to.
   * @return webUrl
  **/
  @jakarta.annotation.Nonnull
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  public CreateAnExternalIssueRequest project(String project) {
    
    this.project = project;
    return this;
  }

   /**
   * The external service&#39;s project.
   * @return project
  **/
  @jakarta.annotation.Nonnull
  public String getProject() {
    return project;
  }


  public void setProject(String project) {
    this.project = project;
  }


  public CreateAnExternalIssueRequest identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * A unique identifier of the external issue.
   * @return identifier
  **/
  @jakarta.annotation.Nonnull
  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAnExternalIssueRequest createAnExternalIssueRequest = (CreateAnExternalIssueRequest) o;
    return Objects.equals(this.issueId, createAnExternalIssueRequest.issueId) &&
        Objects.equals(this.webUrl, createAnExternalIssueRequest.webUrl) &&
        Objects.equals(this.project, createAnExternalIssueRequest.project) &&
        Objects.equals(this.identifier, createAnExternalIssueRequest.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueId, webUrl, project, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAnExternalIssueRequest {\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
    openapiFields.add("issueId");
    openapiFields.add("webUrl");
    openapiFields.add("project");
    openapiFields.add("identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issueId");
    openapiRequiredFields.add("webUrl");
    openapiRequiredFields.add("project");
    openapiRequiredFields.add("identifier");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAnExternalIssueRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateAnExternalIssueRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAnExternalIssueRequest is not found in the empty JSON string", CreateAnExternalIssueRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateAnExternalIssueRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAnExternalIssueRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAnExternalIssueRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("webUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webUrl").toString()));
      }
      if (!jsonObj.get("project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project").toString()));
      }
      if (!jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAnExternalIssueRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAnExternalIssueRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAnExternalIssueRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAnExternalIssueRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAnExternalIssueRequest>() {
           @Override
           public void write(JsonWriter out, CreateAnExternalIssueRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAnExternalIssueRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAnExternalIssueRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAnExternalIssueRequest
  * @throws IOException if the JSON string is invalid with respect to CreateAnExternalIssueRequest
  */
  public static CreateAnExternalIssueRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAnExternalIssueRequest.class);
  }

 /**
  * Convert an instance of CreateAnExternalIssueRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

