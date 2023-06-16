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
import com.sentry.api.client.model.RetrieveATeam200ResponseAvatar;
import com.sentry.api.client.model.RetrieveATeam200ResponseOrganization;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveATeam200Response
 */
@JsonPropertyOrder({
  RetrieveATeam200Response.JSON_PROPERTY_AVATAR,
  RetrieveATeam200Response.JSON_PROPERTY_DATE_CREATED,
  RetrieveATeam200Response.JSON_PROPERTY_HAS_ACCESS,
  RetrieveATeam200Response.JSON_PROPERTY_ID,
  RetrieveATeam200Response.JSON_PROPERTY_IS_MEMBER,
  RetrieveATeam200Response.JSON_PROPERTY_IS_PENDING,
  RetrieveATeam200Response.JSON_PROPERTY_MEMBER_COUNT,
  RetrieveATeam200Response.JSON_PROPERTY_ORGANIZATION,
  RetrieveATeam200Response.JSON_PROPERTY_NAME,
  RetrieveATeam200Response.JSON_PROPERTY_SLUG
})
@JsonTypeName("Retrieve_a_Team_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveATeam200Response {
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private RetrieveATeam200ResponseAvatar avatar;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_HAS_ACCESS = "hasAccess";
  private Boolean hasAccess;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_MEMBER = "isMember";
  private Boolean isMember;

  public static final String JSON_PROPERTY_IS_PENDING = "isPending";
  private Boolean isPending;

  public static final String JSON_PROPERTY_MEMBER_COUNT = "memberCount";
  private Long memberCount;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private RetrieveATeam200ResponseOrganization organization;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public RetrieveATeam200Response() { 
  }

  public RetrieveATeam200Response avatar(RetrieveATeam200ResponseAvatar avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveATeam200ResponseAvatar getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatar(RetrieveATeam200ResponseAvatar avatar) {
    this.avatar = avatar;
  }


  public RetrieveATeam200Response dateCreated(OffsetDateTime dateCreated) {
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


  public RetrieveATeam200Response hasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

   /**
   * Get hasAccess
   * @return hasAccess
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasAccess() {
    return hasAccess;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }


  public RetrieveATeam200Response id(String id) {
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


  public RetrieveATeam200Response isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

   /**
   * Get isMember
   * @return isMember
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_MEMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsMember() {
    return isMember;
  }


  @JsonProperty(JSON_PROPERTY_IS_MEMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  public RetrieveATeam200Response isPending(Boolean isPending) {
    this.isPending = isPending;
    return this;
  }

   /**
   * Get isPending
   * @return isPending
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_PENDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPending() {
    return isPending;
  }


  @JsonProperty(JSON_PROPERTY_IS_PENDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPending(Boolean isPending) {
    this.isPending = isPending;
  }


  public RetrieveATeam200Response memberCount(Long memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Get memberCount
   * @return memberCount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMemberCount() {
    return memberCount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberCount(Long memberCount) {
    this.memberCount = memberCount;
  }


  public RetrieveATeam200Response organization(RetrieveATeam200ResponseOrganization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveATeam200ResponseOrganization getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrganization(RetrieveATeam200ResponseOrganization organization) {
    this.organization = organization;
  }


  public RetrieveATeam200Response name(String name) {
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


  public RetrieveATeam200Response slug(String slug) {
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


  /**
   * Return true if this Retrieve_a_Team_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveATeam200Response retrieveATeam200Response = (RetrieveATeam200Response) o;
    return Objects.equals(this.avatar, retrieveATeam200Response.avatar) &&
        Objects.equals(this.dateCreated, retrieveATeam200Response.dateCreated) &&
        Objects.equals(this.hasAccess, retrieveATeam200Response.hasAccess) &&
        Objects.equals(this.id, retrieveATeam200Response.id) &&
        Objects.equals(this.isMember, retrieveATeam200Response.isMember) &&
        Objects.equals(this.isPending, retrieveATeam200Response.isPending) &&
        Objects.equals(this.memberCount, retrieveATeam200Response.memberCount) &&
        Objects.equals(this.organization, retrieveATeam200Response.organization) &&
        Objects.equals(this.name, retrieveATeam200Response.name) &&
        Objects.equals(this.slug, retrieveATeam200Response.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, dateCreated, hasAccess, id, isMember, isPending, memberCount, organization, name, slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveATeam200Response {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    isPending: ").append(toIndentedString(isPending)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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

