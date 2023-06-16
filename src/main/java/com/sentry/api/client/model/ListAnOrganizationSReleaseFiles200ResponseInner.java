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
import com.sentry.api.client.model.ListAnOrganizationSReleaseFiles200ResponseInnerHeaders;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnOrganizationSReleaseFiles200ResponseInner
 */
@JsonPropertyOrder({
  ListAnOrganizationSReleaseFiles200ResponseInner.JSON_PROPERTY_SHA1,
  ListAnOrganizationSReleaseFiles200ResponseInner.JSON_PROPERTY_DIST,
  ListAnOrganizationSReleaseFiles200ResponseInner.JSON_PROPERTY_NAME,
  ListAnOrganizationSReleaseFiles200ResponseInner.JSON_PROPERTY_DATE_CREATED,
  ListAnOrganizationSReleaseFiles200ResponseInner.JSON_PROPERTY_HEADERS,
  ListAnOrganizationSReleaseFiles200ResponseInner.JSON_PROPERTY_ID,
  ListAnOrganizationSReleaseFiles200ResponseInner.JSON_PROPERTY_SIZE
})
@JsonTypeName("List_an_Organization_s_Release_Files_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class ListAnOrganizationSReleaseFiles200ResponseInner {
  public static final String JSON_PROPERTY_SHA1 = "sha1";
  private String sha1;

  public static final String JSON_PROPERTY_DIST = "dist";
  private String dist;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private ListAnOrganizationSReleaseFiles200ResponseInnerHeaders headers;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public ListAnOrganizationSReleaseFiles200ResponseInner() { 
  }

  public ListAnOrganizationSReleaseFiles200ResponseInner sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * Get sha1
   * @return sha1
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHA1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSha1() {
    return sha1;
  }


  @JsonProperty(JSON_PROPERTY_SHA1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }


  public ListAnOrganizationSReleaseFiles200ResponseInner dist(String dist) {
    this.dist = dist;
    return this;
  }

   /**
   * Get dist
   * @return dist
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDist() {
    return dist;
  }


  @JsonProperty(JSON_PROPERTY_DIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDist(String dist) {
    this.dist = dist;
  }


  public ListAnOrganizationSReleaseFiles200ResponseInner name(String name) {
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


  public ListAnOrganizationSReleaseFiles200ResponseInner dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public ListAnOrganizationSReleaseFiles200ResponseInner headers(ListAnOrganizationSReleaseFiles200ResponseInnerHeaders headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListAnOrganizationSReleaseFiles200ResponseInnerHeaders getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeaders(ListAnOrganizationSReleaseFiles200ResponseInnerHeaders headers) {
    this.headers = headers;
  }


  public ListAnOrganizationSReleaseFiles200ResponseInner id(String id) {
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


  public ListAnOrganizationSReleaseFiles200ResponseInner size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(Integer size) {
    this.size = size;
  }


  /**
   * Return true if this List_an_Organization_s_Release_Files_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSReleaseFiles200ResponseInner listAnOrganizationSReleaseFiles200ResponseInner = (ListAnOrganizationSReleaseFiles200ResponseInner) o;
    return Objects.equals(this.sha1, listAnOrganizationSReleaseFiles200ResponseInner.sha1) &&
        Objects.equals(this.dist, listAnOrganizationSReleaseFiles200ResponseInner.dist) &&
        Objects.equals(this.name, listAnOrganizationSReleaseFiles200ResponseInner.name) &&
        Objects.equals(this.dateCreated, listAnOrganizationSReleaseFiles200ResponseInner.dateCreated) &&
        Objects.equals(this.headers, listAnOrganizationSReleaseFiles200ResponseInner.headers) &&
        Objects.equals(this.id, listAnOrganizationSReleaseFiles200ResponseInner.id) &&
        Objects.equals(this.size, listAnOrganizationSReleaseFiles200ResponseInner.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha1, dist, name, dateCreated, headers, id, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSReleaseFiles200ResponseInner {\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    dist: ").append(toIndentedString(dist)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

