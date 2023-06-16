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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * CreateANewProjectRequest
 */
@JsonPropertyOrder({
  CreateANewProjectRequest.JSON_PROPERTY_NAME,
  CreateANewProjectRequest.JSON_PROPERTY_SLUG,
  CreateANewProjectRequest.JSON_PROPERTY_PLATFORM,
  CreateANewProjectRequest.JSON_PROPERTY_DEFAULT_RULES
})
@JsonTypeName("Create_a_New_Project_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class CreateANewProjectRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private JsonNullable<String> slug = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private JsonNullable<String> platform = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_RULES = "default_rules";
  private Boolean defaultRules;

  public CreateANewProjectRequest() { 
  }

  public CreateANewProjectRequest name(String name) {
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


  public CreateANewProjectRequest slug(String slug) {
    this.slug = JsonNullable.<String>of(slug);
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSlug() {
        return slug.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSlug_JsonNullable() {
    return slug;
  }
  
  @JsonProperty(JSON_PROPERTY_SLUG)
  public void setSlug_JsonNullable(JsonNullable<String> slug) {
    this.slug = slug;
  }

  public void setSlug(String slug) {
    this.slug = JsonNullable.<String>of(slug);
  }


  public CreateANewProjectRequest platform(String platform) {
    this.platform = JsonNullable.<String>of(platform);
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getPlatform() {
        return platform.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPlatform_JsonNullable() {
    return platform;
  }
  
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  public void setPlatform_JsonNullable(JsonNullable<String> platform) {
    this.platform = platform;
  }

  public void setPlatform(String platform) {
    this.platform = JsonNullable.<String>of(platform);
  }


  public CreateANewProjectRequest defaultRules(Boolean defaultRules) {
    this.defaultRules = defaultRules;
    return this;
  }

   /**
   * Get defaultRules
   * @return defaultRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultRules() {
    return defaultRules;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultRules(Boolean defaultRules) {
    this.defaultRules = defaultRules;
  }


  /**
   * Return true if this Create_a_New_Project_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateANewProjectRequest createANewProjectRequest = (CreateANewProjectRequest) o;
    return Objects.equals(this.name, createANewProjectRequest.name) &&
        equalsNullable(this.slug, createANewProjectRequest.slug) &&
        equalsNullable(this.platform, createANewProjectRequest.platform) &&
        Objects.equals(this.defaultRules, createANewProjectRequest.defaultRules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hashCodeNullable(slug), hashCodeNullable(platform), defaultRules);
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
    sb.append("class CreateANewProjectRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    defaultRules: ").append(toIndentedString(defaultRules)).append("\n");
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

