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
import com.sentry.api.client.model.ListAnOrganizationSTeams200ResponseInnerOrganizationLinks;
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
 * ListAnOrganizationSTeams200ResponseInnerOrganization
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ListAnOrganizationSTeams200ResponseInnerOrganization implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider status;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_IS_EARLY_ADOPTER = "isEarlyAdopter";
  @SerializedName(SERIALIZED_NAME_IS_EARLY_ADOPTER)
  private Boolean isEarlyAdopter;

  public static final String SERIALIZED_NAME_REQUIRE2_F_A = "require2FA";
  @SerializedName(SERIALIZED_NAME_REQUIRE2_F_A)
  private Boolean require2FA;

  public static final String SERIALIZED_NAME_REQUIRE_EMAIL_VERIFICATION = "requireEmailVerification";
  @SerializedName(SERIALIZED_NAME_REQUIRE_EMAIL_VERIFICATION)
  private Boolean requireEmailVerification;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private Object avatar = null;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private Object features = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ListAnOrganizationSTeams200ResponseInnerOrganizationLinks links;

  public static final String SERIALIZED_NAME_HAS_AUTH_PROVIDER = "hasAuthProvider";
  @SerializedName(SERIALIZED_NAME_HAS_AUTH_PROVIDER)
  private Boolean hasAuthProvider;

  public ListAnOrganizationSTeams200ResponseInnerOrganization() {
  }

  public ListAnOrganizationSTeams200ResponseInnerOrganization id(String id) {
    
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


  public ListAnOrganizationSTeams200ResponseInnerOrganization slug(String slug) {
    
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


  public ListAnOrganizationSTeams200ResponseInnerOrganization status(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider status) {
    
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


  public ListAnOrganizationSTeams200ResponseInnerOrganization name(String name) {
    
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


  public ListAnOrganizationSTeams200ResponseInnerOrganization dateCreated(OffsetDateTime dateCreated) {
    
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


  public ListAnOrganizationSTeams200ResponseInnerOrganization isEarlyAdopter(Boolean isEarlyAdopter) {
    
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


  public ListAnOrganizationSTeams200ResponseInnerOrganization require2FA(Boolean require2FA) {
    
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


  public ListAnOrganizationSTeams200ResponseInnerOrganization requireEmailVerification(Boolean requireEmailVerification) {
    
    this.requireEmailVerification = requireEmailVerification;
    return this;
  }

   /**
   * Get requireEmailVerification
   * @return requireEmailVerification
  **/
  @jakarta.annotation.Nonnull
  public Boolean getRequireEmailVerification() {
    return requireEmailVerification;
  }


  public void setRequireEmailVerification(Boolean requireEmailVerification) {
    this.requireEmailVerification = requireEmailVerification;
  }


  public ListAnOrganizationSTeams200ResponseInnerOrganization avatar(Object avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @jakarta.annotation.Nullable
  public Object getAvatar() {
    return avatar;
  }


  public void setAvatar(Object avatar) {
    this.avatar = avatar;
  }


  public ListAnOrganizationSTeams200ResponseInnerOrganization features(Object features) {
    
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @jakarta.annotation.Nullable
  public Object getFeatures() {
    return features;
  }


  public void setFeatures(Object features) {
    this.features = features;
  }


  public ListAnOrganizationSTeams200ResponseInnerOrganization links(ListAnOrganizationSTeams200ResponseInnerOrganizationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nonnull
  public ListAnOrganizationSTeams200ResponseInnerOrganizationLinks getLinks() {
    return links;
  }


  public void setLinks(ListAnOrganizationSTeams200ResponseInnerOrganizationLinks links) {
    this.links = links;
  }


  public ListAnOrganizationSTeams200ResponseInnerOrganization hasAuthProvider(Boolean hasAuthProvider) {
    
    this.hasAuthProvider = hasAuthProvider;
    return this;
  }

   /**
   * Get hasAuthProvider
   * @return hasAuthProvider
  **/
  @jakarta.annotation.Nonnull
  public Boolean getHasAuthProvider() {
    return hasAuthProvider;
  }


  public void setHasAuthProvider(Boolean hasAuthProvider) {
    this.hasAuthProvider = hasAuthProvider;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSTeams200ResponseInnerOrganization listAnOrganizationSTeams200ResponseInnerOrganization = (ListAnOrganizationSTeams200ResponseInnerOrganization) o;
    return Objects.equals(this.id, listAnOrganizationSTeams200ResponseInnerOrganization.id) &&
        Objects.equals(this.slug, listAnOrganizationSTeams200ResponseInnerOrganization.slug) &&
        Objects.equals(this.status, listAnOrganizationSTeams200ResponseInnerOrganization.status) &&
        Objects.equals(this.name, listAnOrganizationSTeams200ResponseInnerOrganization.name) &&
        Objects.equals(this.dateCreated, listAnOrganizationSTeams200ResponseInnerOrganization.dateCreated) &&
        Objects.equals(this.isEarlyAdopter, listAnOrganizationSTeams200ResponseInnerOrganization.isEarlyAdopter) &&
        Objects.equals(this.require2FA, listAnOrganizationSTeams200ResponseInnerOrganization.require2FA) &&
        Objects.equals(this.requireEmailVerification, listAnOrganizationSTeams200ResponseInnerOrganization.requireEmailVerification) &&
        Objects.equals(this.avatar, listAnOrganizationSTeams200ResponseInnerOrganization.avatar) &&
        Objects.equals(this.features, listAnOrganizationSTeams200ResponseInnerOrganization.features) &&
        Objects.equals(this.links, listAnOrganizationSTeams200ResponseInnerOrganization.links) &&
        Objects.equals(this.hasAuthProvider, listAnOrganizationSTeams200ResponseInnerOrganization.hasAuthProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, status, name, dateCreated, isEarlyAdopter, require2FA, requireEmailVerification, avatar, features, links, hasAuthProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSTeams200ResponseInnerOrganization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    isEarlyAdopter: ").append(toIndentedString(isEarlyAdopter)).append("\n");
    sb.append("    require2FA: ").append(toIndentedString(require2FA)).append("\n");
    sb.append("    requireEmailVerification: ").append(toIndentedString(requireEmailVerification)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    hasAuthProvider: ").append(toIndentedString(hasAuthProvider)).append("\n");
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
    openapiFields.add("slug");
    openapiFields.add("status");
    openapiFields.add("name");
    openapiFields.add("dateCreated");
    openapiFields.add("isEarlyAdopter");
    openapiFields.add("require2FA");
    openapiFields.add("requireEmailVerification");
    openapiFields.add("avatar");
    openapiFields.add("features");
    openapiFields.add("links");
    openapiFields.add("hasAuthProvider");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("dateCreated");
    openapiRequiredFields.add("isEarlyAdopter");
    openapiRequiredFields.add("require2FA");
    openapiRequiredFields.add("requireEmailVerification");
    openapiRequiredFields.add("avatar");
    openapiRequiredFields.add("features");
    openapiRequiredFields.add("links");
    openapiRequiredFields.add("hasAuthProvider");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAnOrganizationSTeams200ResponseInnerOrganization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListAnOrganizationSTeams200ResponseInnerOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAnOrganizationSTeams200ResponseInnerOrganization is not found in the empty JSON string", ListAnOrganizationSTeams200ResponseInnerOrganization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAnOrganizationSTeams200ResponseInnerOrganization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAnOrganizationSTeams200ResponseInnerOrganization` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAnOrganizationSTeams200ResponseInnerOrganization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      // validate the required field `status`
      RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider.validateJsonObject(jsonObj.getAsJsonObject("status"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `links`
      ListAnOrganizationSTeams200ResponseInnerOrganizationLinks.validateJsonObject(jsonObj.getAsJsonObject("links"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAnOrganizationSTeams200ResponseInnerOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAnOrganizationSTeams200ResponseInnerOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAnOrganizationSTeams200ResponseInnerOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAnOrganizationSTeams200ResponseInnerOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAnOrganizationSTeams200ResponseInnerOrganization>() {
           @Override
           public void write(JsonWriter out, ListAnOrganizationSTeams200ResponseInnerOrganization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAnOrganizationSTeams200ResponseInnerOrganization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAnOrganizationSTeams200ResponseInnerOrganization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAnOrganizationSTeams200ResponseInnerOrganization
  * @throws IOException if the JSON string is invalid with respect to ListAnOrganizationSTeams200ResponseInnerOrganization
  */
  public static ListAnOrganizationSTeams200ResponseInnerOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAnOrganizationSTeams200ResponseInnerOrganization.class);
  }

 /**
  * Convert an instance of ListAnOrganizationSTeams200ResponseInnerOrganization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
