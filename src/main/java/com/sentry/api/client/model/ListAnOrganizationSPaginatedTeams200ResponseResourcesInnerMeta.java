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
 * ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta
 */
@JsonPropertyOrder({
  ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.JSON_PROPERTY_RESOURCE_TYPE
})
@JsonTypeName("List_an_Organization_s_Paginated_Teams_200_response_Resources_inner_meta")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta {
  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private String resourceType;

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta() { 
  }

  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  /**
   * Return true if this List_an_Organization_s_Paginated_Teams_200_response_Resources_inner_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta listAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta = (ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta) o;
    return Objects.equals(this.resourceType, listAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSPaginatedTeams200ResponseResourcesInnerMeta {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

