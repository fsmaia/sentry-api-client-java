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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * SCIMTeamRequestBody
 */
@JsonPropertyOrder({
  SCIMTeamRequestBody.JSON_PROPERTY_SCHEMAS,
  SCIMTeamRequestBody.JSON_PROPERTY_DISPLAY_NAME,
  SCIMTeamRequestBody.JSON_PROPERTY_MEMBERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class SCIMTeamRequestBody {
  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private List<String> schemas = new ArrayList<>();

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  private List<String> members = new ArrayList<>();

  public SCIMTeamRequestBody() { 
  }

  @JsonCreator
  public SCIMTeamRequestBody(
    @JsonProperty(JSON_PROPERTY_SCHEMAS) List<String> schemas, 
    @JsonProperty(JSON_PROPERTY_MEMBERS) List<String> members
  ) {
    this();
    this.schemas = schemas;
    this.members = members;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSchemas() {
    return schemas;
  }




  public SCIMTeamRequestBody displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


   /**
   * Get members
   * @return members
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getMembers() {
    return members;
  }




  /**
   * Return true if this SCIMTeamRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCIMTeamRequestBody scIMTeamRequestBody = (SCIMTeamRequestBody) o;
    return Objects.equals(this.schemas, scIMTeamRequestBody.schemas) &&
        Objects.equals(this.displayName, scIMTeamRequestBody.displayName) &&
        Objects.equals(this.members, scIMTeamRequestBody.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, displayName, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCIMTeamRequestBody {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

