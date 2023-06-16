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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sentry.api.client.model.RetrieveAProject200ResponsePluginsInnerAuthor;
import com.sentry.api.client.model.RetrieveAProject200ResponsePluginsInnerResourceLinksInner;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAProject200ResponsePluginsInner
 */
@JsonPropertyOrder({
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_ASSETS,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_AUTHOR,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_CAN_DISABLE,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_CONTEXTS,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_DESCRIPTION,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_DOC,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_ENABLED,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_HAS_CONFIGURATION,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_ID,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_IS_TESTABLE,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_METADATA,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_NAME,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_RESOURCE_LINKS,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_SHORT_NAME,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_SLUG,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_STATUS,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_TYPE,
  RetrieveAProject200ResponsePluginsInner.JSON_PROPERTY_VERSION
})
@JsonTypeName("Retrieve_a_Project_200_response_plugins_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveAProject200ResponsePluginsInner {
  public static final String JSON_PROPERTY_ASSETS = "assets";
  private List<String> assets = new ArrayList<>();

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private JsonNullable<RetrieveAProject200ResponsePluginsInnerAuthor> author = JsonNullable.<RetrieveAProject200ResponsePluginsInnerAuthor>undefined();

  public static final String JSON_PROPERTY_CAN_DISABLE = "canDisable";
  private Boolean canDisable;

  public static final String JSON_PROPERTY_CONTEXTS = "contexts";
  private List<String> contexts = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DOC = "doc";
  private String doc;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_HAS_CONFIGURATION = "hasConfiguration";
  private Boolean hasConfiguration;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_TESTABLE = "isTestable";
  private Boolean isTestable;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCE_LINKS = "resourceLinks";
  private JsonNullable<List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner>> resourceLinks = JsonNullable.<List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner>>undefined();

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private String shortName;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VERSION = "version";
  private JsonNullable<String> version = JsonNullable.<String>undefined();

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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAssets() {
    return assets;
  }


  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssets(List<String> assets) {
    this.assets = assets;
  }


  public RetrieveAProject200ResponsePluginsInner author(RetrieveAProject200ResponsePluginsInnerAuthor author) {
    this.author = JsonNullable.<RetrieveAProject200ResponsePluginsInnerAuthor>of(author);
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public RetrieveAProject200ResponsePluginsInnerAuthor getAuthor() {
        return author.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RetrieveAProject200ResponsePluginsInnerAuthor> getAuthor_JsonNullable() {
    return author;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  public void setAuthor_JsonNullable(JsonNullable<RetrieveAProject200ResponsePluginsInnerAuthor> author) {
    this.author = author;
  }

  public void setAuthor(RetrieveAProject200ResponsePluginsInnerAuthor author) {
    this.author = JsonNullable.<RetrieveAProject200ResponsePluginsInnerAuthor>of(author);
  }


  public RetrieveAProject200ResponsePluginsInner canDisable(Boolean canDisable) {
    this.canDisable = canDisable;
    return this;
  }

   /**
   * Get canDisable
   * @return canDisable
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAN_DISABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanDisable() {
    return canDisable;
  }


  @JsonProperty(JSON_PROPERTY_CAN_DISABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTEXTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getContexts() {
    return contexts;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDoc() {
    return doc;
  }


  @JsonProperty(JSON_PROPERTY_DOC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasConfiguration() {
    return hasConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_HAS_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_TESTABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsTestable() {
    return isTestable;
  }


  @JsonProperty(JSON_PROPERTY_IS_TESTABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RetrieveAProject200ResponsePluginsInner resourceLinks(List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner> resourceLinks) {
    this.resourceLinks = JsonNullable.<List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner>>of(resourceLinks);
    return this;
  }

  public RetrieveAProject200ResponsePluginsInner addResourceLinksItem(RetrieveAProject200ResponsePluginsInnerResourceLinksInner resourceLinksItem) {
    if (this.resourceLinks == null || !this.resourceLinks.isPresent()) {
      this.resourceLinks = JsonNullable.<List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner>>of(new ArrayList<>());
    }
    try {
      this.resourceLinks.get().add(resourceLinksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get resourceLinks
   * @return resourceLinks
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner> getResourceLinks() {
        return resourceLinks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner>> getResourceLinks_JsonNullable() {
    return resourceLinks;
  }
  
  @JsonProperty(JSON_PROPERTY_RESOURCE_LINKS)
  public void setResourceLinks_JsonNullable(JsonNullable<List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner>> resourceLinks) {
    this.resourceLinks = resourceLinks;
  }

  public void setResourceLinks(List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner> resourceLinks) {
    this.resourceLinks = JsonNullable.<List<RetrieveAProject200ResponsePluginsInnerResourceLinksInner>>of(resourceLinks);
  }


  public RetrieveAProject200ResponsePluginsInner shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShortName() {
    return shortName;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public RetrieveAProject200ResponsePluginsInner version(String version) {
    this.version = JsonNullable.<String>of(version);
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getVersion() {
        return version.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getVersion_JsonNullable() {
    return version;
  }
  
  @JsonProperty(JSON_PROPERTY_VERSION)
  public void setVersion_JsonNullable(JsonNullable<String> version) {
    this.version = version;
  }

  public void setVersion(String version) {
    this.version = JsonNullable.<String>of(version);
  }


  /**
   * Return true if this Retrieve_a_Project_200_response_plugins_inner object is equal to o.
   */
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
        equalsNullable(this.author, retrieveAProject200ResponsePluginsInner.author) &&
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
        equalsNullable(this.resourceLinks, retrieveAProject200ResponsePluginsInner.resourceLinks) &&
        Objects.equals(this.shortName, retrieveAProject200ResponsePluginsInner.shortName) &&
        Objects.equals(this.slug, retrieveAProject200ResponsePluginsInner.slug) &&
        Objects.equals(this.status, retrieveAProject200ResponsePluginsInner.status) &&
        Objects.equals(this.type, retrieveAProject200ResponsePluginsInner.type) &&
        equalsNullable(this.version, retrieveAProject200ResponsePluginsInner.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, hashCodeNullable(author), canDisable, contexts, description, doc, enabled, hasConfiguration, id, isTestable, metadata, name, hashCodeNullable(resourceLinks), shortName, slug, status, type, hashCodeNullable(version));
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

}

