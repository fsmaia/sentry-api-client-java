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
import com.sentry.api.client.model.ListAnOrganizationSMembers200ResponseResourcesInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnOrganizationSMembers200Response
 */
@JsonPropertyOrder({
  ListAnOrganizationSMembers200Response.JSON_PROPERTY_SCHEMAS,
  ListAnOrganizationSMembers200Response.JSON_PROPERTY_TOTAL_RESULTS,
  ListAnOrganizationSMembers200Response.JSON_PROPERTY_START_INDEX,
  ListAnOrganizationSMembers200Response.JSON_PROPERTY_ITEMS_PER_PAGE,
  ListAnOrganizationSMembers200Response.JSON_PROPERTY_RESOURCES
})
@JsonTypeName("List_an_Organization_s_Members_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class ListAnOrganizationSMembers200Response {
  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private List<String> schemas = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_RESULTS = "totalResults";
  private Integer totalResults;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex;

  public static final String JSON_PROPERTY_ITEMS_PER_PAGE = "itemsPerPage";
  private Integer itemsPerPage;

  public static final String JSON_PROPERTY_RESOURCES = "Resources";
  private List<ListAnOrganizationSMembers200ResponseResourcesInner> resources = new ArrayList<>();

  public ListAnOrganizationSMembers200Response() { 
  }

  public ListAnOrganizationSMembers200Response schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public ListAnOrganizationSMembers200Response addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
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


  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }


  public ListAnOrganizationSMembers200Response totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalResults() {
    return totalResults;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  public ListAnOrganizationSMembers200Response startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public ListAnOrganizationSMembers200Response itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * Get itemsPerPage
   * @return itemsPerPage
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEMS_PER_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getItemsPerPage() {
    return itemsPerPage;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS_PER_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }


  public ListAnOrganizationSMembers200Response resources(List<ListAnOrganizationSMembers200ResponseResourcesInner> resources) {
    this.resources = resources;
    return this;
  }

  public ListAnOrganizationSMembers200Response addResourcesItem(ListAnOrganizationSMembers200ResponseResourcesInner resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ListAnOrganizationSMembers200ResponseResourcesInner> getResources() {
    return resources;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResources(List<ListAnOrganizationSMembers200ResponseResourcesInner> resources) {
    this.resources = resources;
  }


  /**
   * Return true if this List_an_Organization_s_Members_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSMembers200Response listAnOrganizationSMembers200Response = (ListAnOrganizationSMembers200Response) o;
    return Objects.equals(this.schemas, listAnOrganizationSMembers200Response.schemas) &&
        Objects.equals(this.totalResults, listAnOrganizationSMembers200Response.totalResults) &&
        Objects.equals(this.startIndex, listAnOrganizationSMembers200Response.startIndex) &&
        Objects.equals(this.itemsPerPage, listAnOrganizationSMembers200Response.itemsPerPage) &&
        Objects.equals(this.resources, listAnOrganizationSMembers200Response.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, totalResults, startIndex, itemsPerPage, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSMembers200Response {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

