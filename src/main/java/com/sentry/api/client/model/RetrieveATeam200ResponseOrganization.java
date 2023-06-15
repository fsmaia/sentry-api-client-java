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
import com.sentry.api.client.model.RetrieveATeam200ResponseAvatar;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * RetrieveATeam200ResponseOrganization
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class RetrieveATeam200ResponseOrganization implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private RetrieveATeam200ResponseAvatar avatar;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_EARLY_ADOPTER = "isEarlyAdopter";
  @SerializedName(SERIALIZED_NAME_IS_EARLY_ADOPTER)
  private Boolean isEarlyAdopter;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REQUIRE2_F_A = "require2FA";
  @SerializedName(SERIALIZED_NAME_REQUIRE2_F_A)
  private Boolean require2FA;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider status;

  public RetrieveATeam200ResponseOrganization() {
  }

  public RetrieveATeam200ResponseOrganization avatar(RetrieveATeam200ResponseAvatar avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @jakarta.annotation.Nonnull
  public RetrieveATeam200ResponseAvatar getAvatar() {
    return avatar;
  }


  public void setAvatar(RetrieveATeam200ResponseAvatar avatar) {
    this.avatar = avatar;
  }


  public RetrieveATeam200ResponseOrganization dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public RetrieveATeam200ResponseOrganization id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RetrieveATeam200ResponseOrganization isEarlyAdopter(Boolean isEarlyAdopter) {
    
    this.isEarlyAdopter = isEarlyAdopter;
    return this;
  }

   /**
   * Get isEarlyAdopter
   * @return isEarlyAdopter
  **/
  @jakarta.annotation.Nonnull
  public Boolean getIsEarlyAdopter() {
    return isEarlyAdopter;
  }


  public void setIsEarlyAdopter(Boolean isEarlyAdopter) {
    this.isEarlyAdopter = isEarlyAdopter;
  }


  public RetrieveATeam200ResponseOrganization name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RetrieveATeam200ResponseOrganization require2FA(Boolean require2FA) {
    
    this.require2FA = require2FA;
    return this;
  }

   /**
   * Get require2FA
   * @return require2FA
  **/
  @jakarta.annotation.Nonnull
  public Boolean getRequire2FA() {
    return require2FA;
  }


  public void setRequire2FA(Boolean require2FA) {
    this.require2FA = require2FA;
  }


  public RetrieveATeam200ResponseOrganization slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @jakarta.annotation.Nonnull
  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public RetrieveATeam200ResponseOrganization status(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider getStatus() {
    return status;
  }


  public void setStatus(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveATeam200ResponseOrganization retrieveATeam200ResponseOrganization = (RetrieveATeam200ResponseOrganization) o;
    return Objects.equals(this.avatar, retrieveATeam200ResponseOrganization.avatar) &&
        Objects.equals(this.dateCreated, retrieveATeam200ResponseOrganization.dateCreated) &&
        Objects.equals(this.id, retrieveATeam200ResponseOrganization.id) &&
        Objects.equals(this.isEarlyAdopter, retrieveATeam200ResponseOrganization.isEarlyAdopter) &&
        Objects.equals(this.name, retrieveATeam200ResponseOrganization.name) &&
        Objects.equals(this.require2FA, retrieveATeam200ResponseOrganization.require2FA) &&
        Objects.equals(this.slug, retrieveATeam200ResponseOrganization.slug) &&
        Objects.equals(this.status, retrieveATeam200ResponseOrganization.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, dateCreated, id, isEarlyAdopter, name, require2FA, slug, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveATeam200ResponseOrganization {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEarlyAdopter: ").append(toIndentedString(isEarlyAdopter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    require2FA: ").append(toIndentedString(require2FA)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("avatar");
    openapiFields.add("dateCreated");
    openapiFields.add("id");
    openapiFields.add("isEarlyAdopter");
    openapiFields.add("name");
    openapiFields.add("require2FA");
    openapiFields.add("slug");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("avatar");
    openapiRequiredFields.add("dateCreated");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isEarlyAdopter");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("require2FA");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveATeam200ResponseOrganization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveATeam200ResponseOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveATeam200ResponseOrganization is not found in the empty JSON string", RetrieveATeam200ResponseOrganization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveATeam200ResponseOrganization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveATeam200ResponseOrganization` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveATeam200ResponseOrganization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `avatar`
      RetrieveATeam200ResponseAvatar.validateJsonObject(jsonObj.getAsJsonObject("avatar"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      // validate the required field `status`
      RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.validateJsonObject(jsonObj.getAsJsonObject("status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveATeam200ResponseOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveATeam200ResponseOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveATeam200ResponseOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveATeam200ResponseOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveATeam200ResponseOrganization>() {
           @Override
           public void write(JsonWriter out, RetrieveATeam200ResponseOrganization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveATeam200ResponseOrganization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveATeam200ResponseOrganization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveATeam200ResponseOrganization
  * @throws IOException if the JSON string is invalid with respect to RetrieveATeam200ResponseOrganization
  */
  public static RetrieveATeam200ResponseOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveATeam200ResponseOrganization.class);
  }

 /**
  * Convert an instance of RetrieveATeam200ResponseOrganization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

