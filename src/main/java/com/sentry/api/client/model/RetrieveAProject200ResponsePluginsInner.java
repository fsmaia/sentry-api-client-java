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
import com.sentry.api.client.model.RetrieveAProject200ResponsePluginsInnerAuthor;
import com.sentry.api.client.model.RetrieveAProject200ResponsePluginsInnerResourceLinksInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * RetrieveAProject200ResponsePluginsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class RetrieveAProject200ResponsePluginsInner {
  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private List<String> assets = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private RetrieveAProject200ResponsePluginsInnerAuthor author;

  public static final String SERIALIZED_NAME_CAN_DISABLE = "canDisable";
  @SerializedName(SERIALIZED_NAME_CAN_DISABLE)
  private Boolean canDisable;

  public static final String SERIALIZED_NAME_CONTEXTS = "contexts";
  @SerializedName(SERIALIZED_NAME_CONTEXTS)
  private List<String> contexts = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOC = "doc";
  @SerializedName(SERIALIZED_NAME_DOC)
  private String doc;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_HAS_CONFIGURATION = "hasConfiguration";
  @SerializedName(SERIALIZED_NAME_HAS_CONFIGURATION)
  private Boolean hasConfiguration;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_TESTABLE = "isTestable";
  @SerializedName(SERIALIZED_NAME_IS_TESTABLE)
  private Boolean isTestable;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCE_LINKS = "resourceLinks";
  @SerializedName(SERIALIZED_NAME_RESOURCE_LINKS)
  private List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner> resourceLinks;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public RetrieveAProject200ResponsePluginsInner() {
  }

  public RetrieveAProject200ResponsePluginsInner assets(List<String> assets) {
    
    this.assets = assets;
    return this;
  }

  public RetrieveAProject200ResponsePluginsInner addAssetsItem(String assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nonnull
  public List<String> getAssets() {
    return assets;
  }


  public void setAssets(List<String> assets) {
    this.assets = assets;
  }


  public RetrieveAProject200ResponsePluginsInner author(RetrieveAProject200ResponsePluginsInnerAuthor author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  public RetrieveAProject200ResponsePluginsInnerAuthor getAuthor() {
    return author;
  }


  public void setAuthor(RetrieveAProject200ResponsePluginsInnerAuthor author) {
    this.author = author;
  }


  public RetrieveAProject200ResponsePluginsInner canDisable(Boolean canDisable) {
    
    this.canDisable = canDisable;
    return this;
  }

   /**
   * Get canDisable
   * @return canDisable
  **/
  @javax.annotation.Nonnull
  public Boolean getCanDisable() {
    return canDisable;
  }


  public void setCanDisable(Boolean canDisable) {
    this.canDisable = canDisable;
  }


  public RetrieveAProject200ResponsePluginsInner contexts(List<String> contexts) {
    
    this.contexts = contexts;
    return this;
  }

  public RetrieveAProject200ResponsePluginsInner addContextsItem(String contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }
    this.contexts.add(contextsItem);
    return this;
  }

   /**
   * Get contexts
   * @return contexts
  **/
  @javax.annotation.Nonnull
  public List<String> getContexts() {
    return contexts;
  }


  public void setContexts(List<String> contexts) {
    this.contexts = contexts;
  }


  public RetrieveAProject200ResponsePluginsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RetrieveAProject200ResponsePluginsInner doc(String doc) {
    
    this.doc = doc;
    return this;
  }

   /**
   * Get doc
   * @return doc
  **/
  @javax.annotation.Nonnull
  public String getDoc() {
    return doc;
  }


  public void setDoc(String doc) {
    this.doc = doc;
  }


  public RetrieveAProject200ResponsePluginsInner enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public RetrieveAProject200ResponsePluginsInner hasConfiguration(Boolean hasConfiguration) {
    
    this.hasConfiguration = hasConfiguration;
    return this;
  }

   /**
   * Get hasConfiguration
   * @return hasConfiguration
  **/
  @javax.annotation.Nonnull
  public Boolean getHasConfiguration() {
    return hasConfiguration;
  }


  public void setHasConfiguration(Boolean hasConfiguration) {
    this.hasConfiguration = hasConfiguration;
  }


  public RetrieveAProject200ResponsePluginsInner id(String id) {
    
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


  public RetrieveAProject200ResponsePluginsInner isTestable(Boolean isTestable) {
    
    this.isTestable = isTestable;
    return this;
  }

   /**
   * Get isTestable
   * @return isTestable
  **/
  @javax.annotation.Nonnull
  public Boolean getIsTestable() {
    return isTestable;
  }


  public void setIsTestable(Boolean isTestable) {
    this.isTestable = isTestable;
  }


  public RetrieveAProject200ResponsePluginsInner metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public RetrieveAProject200ResponsePluginsInner name(String name) {
    
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


  public RetrieveAProject200ResponsePluginsInner resourceLinks(List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner> resourceLinks) {
    
    this.resourceLinks = resourceLinks;
    return this;
  }

  public RetrieveAProject200ResponsePluginsInner addResourceLinksItem(RetrieveAProject200ResponsePluginsInnerResourceLinksInner resourceLinksItem) {
    if (this.resourceLinks == null) {
      this.resourceLinks = new ArrayList<>();
    }
    this.resourceLinks.add(resourceLinksItem);
    return this;
  }

   /**
   * Get resourceLinks
   * @return resourceLinks
  **/
  @javax.annotation.Nullable
  public List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner> getResourceLinks() {
    return resourceLinks;
  }


  public void setResourceLinks(List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner> resourceLinks) {
    this.resourceLinks = resourceLinks;
  }


  public RetrieveAProject200ResponsePluginsInner shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nonnull
  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public RetrieveAProject200ResponsePluginsInner slug(String slug) {
    
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


  public RetrieveAProject200ResponsePluginsInner status(String status) {
    
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


  public RetrieveAProject200ResponsePluginsInner type(String type) {
    
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


  public RetrieveAProject200ResponsePluginsInner version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAProject200ResponsePluginsInner retrieveAProject200ResponsePluginsInner = (RetrieveAProject200ResponsePluginsInner) o;
    return Objects.equals(this.assets, retrieveAProject200ResponsePluginsInner.assets) &&
        Objects.equals(this.author, retrieveAProject200ResponsePluginsInner.author) &&
        Objects.equals(this.canDisable, retrieveAProject200ResponsePluginsInner.canDisable) &&
        Objects.equals(this.contexts, retrieveAProject200ResponsePluginsInner.contexts) &&
        Objects.equals(this.description, retrieveAProject200ResponsePluginsInner.description) &&
        Objects.equals(this.doc, retrieveAProject200ResponsePluginsInner.doc) &&
        Objects.equals(this.enabled, retrieveAProject200ResponsePluginsInner.enabled) &&
        Objects.equals(this.hasConfiguration, retrieveAProject200ResponsePluginsInner.hasConfiguration) &&
        Objects.equals(this.id, retrieveAProject200ResponsePluginsInner.id) &&
        Objects.equals(this.isTestable, retrieveAProject200ResponsePluginsInner.isTestable) &&
        Objects.equals(this.metadata, retrieveAProject200ResponsePluginsInner.metadata) &&
        Objects.equals(this.name, retrieveAProject200ResponsePluginsInner.name) &&
        Objects.equals(this.resourceLinks, retrieveAProject200ResponsePluginsInner.resourceLinks) &&
        Objects.equals(this.shortName, retrieveAProject200ResponsePluginsInner.shortName) &&
        Objects.equals(this.slug, retrieveAProject200ResponsePluginsInner.slug) &&
        Objects.equals(this.status, retrieveAProject200ResponsePluginsInner.status) &&
        Objects.equals(this.type, retrieveAProject200ResponsePluginsInner.type) &&
        Objects.equals(this.version, retrieveAProject200ResponsePluginsInner.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, author, canDisable, contexts, description, doc, enabled, hasConfiguration, id, isTestable, metadata, name, resourceLinks, shortName, slug, status, type, version);
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
    sb.append("class RetrieveAProject200ResponsePluginsInner {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    canDisable: ").append(toIndentedString(canDisable)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hasConfiguration: ").append(toIndentedString(hasConfiguration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isTestable: ").append(toIndentedString(isTestable)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceLinks: ").append(toIndentedString(resourceLinks)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("assets");
    openapiFields.add("author");
    openapiFields.add("canDisable");
    openapiFields.add("contexts");
    openapiFields.add("description");
    openapiFields.add("doc");
    openapiFields.add("enabled");
    openapiFields.add("hasConfiguration");
    openapiFields.add("id");
    openapiFields.add("isTestable");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("resourceLinks");
    openapiFields.add("shortName");
    openapiFields.add("slug");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assets");
    openapiRequiredFields.add("canDisable");
    openapiRequiredFields.add("contexts");
    openapiRequiredFields.add("doc");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("hasConfiguration");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("isTestable");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("shortName");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveAProject200ResponsePluginsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveAProject200ResponsePluginsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAProject200ResponsePluginsInner is not found in the empty JSON string", RetrieveAProject200ResponsePluginsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAProject200ResponsePluginsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAProject200ResponsePluginsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveAProject200ResponsePluginsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("assets") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("assets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assets` to be an array in the JSON string but got `%s`", jsonObj.get("assets").toString()));
      }
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        RetrieveAProject200ResponsePluginsInnerAuthor.validateJsonObject(jsonObj.getAsJsonObject("author"));
      }
      // ensure the required json array is present
      if (jsonObj.get("contexts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("contexts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contexts` to be an array in the JSON string but got `%s`", jsonObj.get("contexts").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("doc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("resourceLinks") != null && !jsonObj.get("resourceLinks").isJsonNull()) {
        JsonArray jsonArrayresourceLinks = jsonObj.getAsJsonArray("resourceLinks");
        if (jsonArrayresourceLinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceLinks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourceLinks` to be an array in the JSON string but got `%s`", jsonObj.get("resourceLinks").toString()));
          }

          // validate the optional field `resourceLinks` (array)
          for (int i = 0; i < jsonArrayresourceLinks.size(); i++) {
            RetrieveAProject200ResponsePluginsInnerResourceLinksInner.validateJsonObject(jsonArrayresourceLinks.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("shortName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortName").toString()));
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
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAProject200ResponsePluginsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAProject200ResponsePluginsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAProject200ResponsePluginsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAProject200ResponsePluginsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAProject200ResponsePluginsInner>() {
           @Override
           public void write(JsonWriter out, RetrieveAProject200ResponsePluginsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAProject200ResponsePluginsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveAProject200ResponsePluginsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveAProject200ResponsePluginsInner
  * @throws IOException if the JSON string is invalid with respect to RetrieveAProject200ResponsePluginsInner
  */
  public static RetrieveAProject200ResponsePluginsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAProject200ResponsePluginsInner.class);
  }

 /**
  * Convert an instance of RetrieveAProject200ResponsePluginsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

