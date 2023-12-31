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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * UpdateAnOrganizationReleaseFileRequest
 */
@JsonPropertyOrder({
  UpdateAnOrganizationReleaseFileRequest.JSON_PROPERTY_NAME,
  UpdateAnOrganizationReleaseFileRequest.JSON_PROPERTY_DIST
})
@JsonTypeName("Update_an_Organization_Release_File_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class UpdateAnOrganizationReleaseFileRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DIST = "dist";
  private String dist;

  public UpdateAnOrganizationReleaseFileRequest() { 
  }

  public UpdateAnOrganizationReleaseFileRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The new name (full path) of the file.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateAnOrganizationReleaseFileRequest dist(String dist) {
    this.dist = dist;
    return this;
  }

   /**
   * The new name of the dist.
   * @return dist
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDist() {
    return dist;
  }


  @JsonProperty(JSON_PROPERTY_DIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDist(String dist) {
    this.dist = dist;
  }


  /**
   * Return true if this Update_an_Organization_Release_File_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest = (UpdateAnOrganizationReleaseFileRequest) o;
    return Objects.equals(this.name, updateAnOrganizationReleaseFileRequest.name) &&
        Objects.equals(this.dist, updateAnOrganizationReleaseFileRequest.dist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnOrganizationReleaseFileRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dist: ").append(toIndentedString(dist)).append("\n");
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

