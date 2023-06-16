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
 * TeamPost
 */
@JsonPropertyOrder({
  TeamPost.JSON_PROPERTY_NAME,
  TeamPost.JSON_PROPERTY_SLUG,
  TeamPost.JSON_PROPERTY_IDP_PROVISIONED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class TeamPost {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SLUG = "slug";
  private JsonNullable<String> slug = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IDP_PROVISIONED = "idp_provisioned";
  private Boolean idpProvisioned = false;

  public TeamPost() { 
  }

  public TeamPost name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public TeamPost slug(String slug) {
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


  public TeamPost idpProvisioned(Boolean idpProvisioned) {
    this.idpProvisioned = idpProvisioned;
    return this;
  }

   /**
   * Get idpProvisioned
   * @return idpProvisioned
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDP_PROVISIONED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIdpProvisioned() {
    return idpProvisioned;
  }


  @JsonProperty(JSON_PROPERTY_IDP_PROVISIONED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdpProvisioned(Boolean idpProvisioned) {
    this.idpProvisioned = idpProvisioned;
  }


  /**
   * Return true if this TeamPost object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamPost teamPost = (TeamPost) o;
    return equalsNullable(this.name, teamPost.name) &&
        equalsNullable(this.slug, teamPost.slug) &&
        Objects.equals(this.idpProvisioned, teamPost.idpProvisioned);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(slug), idpProvisioned);
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
    sb.append("class TeamPost {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    idpProvisioned: ").append(toIndentedString(idpProvisioned)).append("\n");
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

