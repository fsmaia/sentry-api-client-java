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
 * RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner
 */
@JsonPropertyOrder({
  RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner.JSON_PROPERTY_ID,
  RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner.JSON_PROPERTY_NAME,
  RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner.JSON_PROPERTY_DESC,
  RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner.JSON_PROPERTY_SCOPES,
  RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner.JSON_PROPERTY_IS_GLOBAL,
  RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner.JSON_PROPERTY_ALLOWED
})
@JsonTypeName("Retrieve_an_Organization_Member_200_response_groupOrgRoles_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:23:11.909078Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESC = "desc";
  private String desc;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private List<String> scopes = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_GLOBAL = "is_global";
  private Boolean isGlobal;

  public static final String JSON_PROPERTY_ALLOWED = "allowed";
  private Boolean allowed;

  public RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner() { 
  }

  public RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner id(String id) {
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


  public RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner name(String name) {
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


  public RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDesc(String desc) {
    this.desc = desc;
  }


  public RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getScopes() {
    return scopes;
  }


  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner isGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
    return this;
  }

   /**
   * Get isGlobal
   * @return isGlobal
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsGlobal() {
    return isGlobal;
  }


  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }


  public RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

   /**
   * Get allowed
   * @return allowed
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAllowed() {
    return allowed;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  /**
   * Return true if this Retrieve_an_Organization_Member_200_response_groupOrgRoles_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner retrieveAnOrganizationMember200ResponseGroupOrgRolesInner = (RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner) o;
    return Objects.equals(this.id, retrieveAnOrganizationMember200ResponseGroupOrgRolesInner.id) &&
        Objects.equals(this.name, retrieveAnOrganizationMember200ResponseGroupOrgRolesInner.name) &&
        Objects.equals(this.desc, retrieveAnOrganizationMember200ResponseGroupOrgRolesInner.desc) &&
        Objects.equals(this.scopes, retrieveAnOrganizationMember200ResponseGroupOrgRolesInner.scopes) &&
        Objects.equals(this.isGlobal, retrieveAnOrganizationMember200ResponseGroupOrgRolesInner.isGlobal) &&
        Objects.equals(this.allowed, retrieveAnOrganizationMember200ResponseGroupOrgRolesInner.allowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, desc, scopes, isGlobal, allowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
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

