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
import com.sentry.api.client.model.RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments;
import com.sentry.api.client.model.RetrieveMonitorsForAnOrganization200ResponseInnerProject;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * RetrieveMonitorsForAnOrganization200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class RetrieveMonitorsForAnOrganization200ResponseInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Object config = null;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private RetrieveMonitorsForAnOrganization200ResponseInnerProject project;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments environments;

  public RetrieveMonitorsForAnOrganization200ResponseInner() {
  }

  public RetrieveMonitorsForAnOrganization200ResponseInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner config(Object config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  public Object getConfig() {
    return config;
  }


  public void setConfig(Object config) {
    this.config = config;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner project(RetrieveMonitorsForAnOrganization200ResponseInnerProject project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nonnull
  public RetrieveMonitorsForAnOrganization200ResponseInnerProject getProject() {
    return project;
  }


  public void setProject(RetrieveMonitorsForAnOrganization200ResponseInnerProject project) {
    this.project = project;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInner environments(RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments environments) {
    
    this.environments = environments;
    return this;
  }

   /**
   * Get environments
   * @return environments
  **/
  @javax.annotation.Nonnull
  public RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments getEnvironments() {
    return environments;
  }


  public void setEnvironments(RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments environments) {
    this.environments = environments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveMonitorsForAnOrganization200ResponseInner retrieveMonitorsForAnOrganization200ResponseInner = (RetrieveMonitorsForAnOrganization200ResponseInner) o;
    return Objects.equals(this.id, retrieveMonitorsForAnOrganization200ResponseInner.id) &&
        Objects.equals(this.name, retrieveMonitorsForAnOrganization200ResponseInner.name) &&
        Objects.equals(this.slug, retrieveMonitorsForAnOrganization200ResponseInner.slug) &&
        Objects.equals(this.status, retrieveMonitorsForAnOrganization200ResponseInner.status) &&
        Objects.equals(this.type, retrieveMonitorsForAnOrganization200ResponseInner.type) &&
        Objects.equals(this.config, retrieveMonitorsForAnOrganization200ResponseInner.config) &&
        Objects.equals(this.dateCreated, retrieveMonitorsForAnOrganization200ResponseInner.dateCreated) &&
        Objects.equals(this.project, retrieveMonitorsForAnOrganization200ResponseInner.project) &&
        Objects.equals(this.environments, retrieveMonitorsForAnOrganization200ResponseInner.environments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, slug, status, type, config, dateCreated, project, environments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveMonitorsForAnOrganization200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("slug");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("config");
    openapiFields.add("dateCreated");
    openapiFields.add("project");
    openapiFields.add("environments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("config");
    openapiRequiredFields.add("dateCreated");
    openapiRequiredFields.add("project");
    openapiRequiredFields.add("environments");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveMonitorsForAnOrganization200ResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveMonitorsForAnOrganization200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveMonitorsForAnOrganization200ResponseInner is not found in the empty JSON string", RetrieveMonitorsForAnOrganization200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveMonitorsForAnOrganization200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveMonitorsForAnOrganization200ResponseInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveMonitorsForAnOrganization200ResponseInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `project`
      RetrieveMonitorsForAnOrganization200ResponseInnerProject.validateJsonObject(jsonObj.getAsJsonObject("project"));
      // validate the required field `environments`
      RetrieveMonitorsForAnOrganization200ResponseInnerEnvironments.validateJsonObject(jsonObj.getAsJsonObject("environments"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveMonitorsForAnOrganization200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveMonitorsForAnOrganization200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveMonitorsForAnOrganization200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveMonitorsForAnOrganization200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveMonitorsForAnOrganization200ResponseInner>() {
           @Override
           public void write(JsonWriter out, RetrieveMonitorsForAnOrganization200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveMonitorsForAnOrganization200ResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveMonitorsForAnOrganization200ResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveMonitorsForAnOrganization200ResponseInner
  * @throws IOException if the JSON string is invalid with respect to RetrieveMonitorsForAnOrganization200ResponseInner
  */
  public static RetrieveMonitorsForAnOrganization200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveMonitorsForAnOrganization200ResponseInner.class);
  }

 /**
  * Convert an instance of RetrieveMonitorsForAnOrganization200ResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

