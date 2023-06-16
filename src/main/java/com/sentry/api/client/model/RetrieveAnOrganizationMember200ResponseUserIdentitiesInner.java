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
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnOrganizationMember200ResponseUserIdentitiesInner
 */
@JsonPropertyOrder({
  RetrieveAnOrganizationMember200ResponseUserIdentitiesInner.JSON_PROPERTY_ID,
  RetrieveAnOrganizationMember200ResponseUserIdentitiesInner.JSON_PROPERTY_NAME,
  RetrieveAnOrganizationMember200ResponseUserIdentitiesInner.JSON_PROPERTY_ORGANIZATION,
  RetrieveAnOrganizationMember200ResponseUserIdentitiesInner.JSON_PROPERTY_PROVIDER,
  RetrieveAnOrganizationMember200ResponseUserIdentitiesInner.JSON_PROPERTY_DATE_VERIFIED,
  RetrieveAnOrganizationMember200ResponseUserIdentitiesInner.JSON_PROPERTY_DATE_SYNCED
})
@JsonTypeName("Retrieve_an_Organization_Member_200_response_user_identities_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseUserIdentitiesInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization organization;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider provider;

  public static final String JSON_PROPERTY_DATE_VERIFIED = "dateVerified";
  private OffsetDateTime dateVerified;

  public static final String JSON_PROPERTY_DATE_SYNCED = "dateSynced";
  private OffsetDateTime dateSynced;

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInner() { 
  }

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInner id(String id) {
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


  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInner name(String name) {
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


  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInner organization(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization organization) {
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

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrganization(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerOrganization organization) {
    this.organization = organization;
  }


  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInner provider(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(RetrieveAnOrganizationMember200ResponseUserIdentitiesInnerProvider provider) {
    this.provider = provider;
  }


  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInner dateVerified(OffsetDateTime dateVerified) {
    this.dateVerified = dateVerified;
    return this;
  }

   /**
   * Get dateVerified
   * @return dateVerified
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDateVerified() {
    return dateVerified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateVerified(OffsetDateTime dateVerified) {
    this.dateVerified = dateVerified;
  }


  public RetrieveAnOrganizationMember200ResponseUserIdentitiesInner dateSynced(OffsetDateTime dateSynced) {
    this.dateSynced = dateSynced;
    return this;
  }

   /**
   * Get dateSynced
   * @return dateSynced
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_SYNCED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDateSynced() {
    return dateSynced;
  }


  @JsonProperty(JSON_PROPERTY_DATE_SYNCED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateSynced(OffsetDateTime dateSynced) {
    this.dateSynced = dateSynced;
  }


  /**
   * Return true if this Retrieve_an_Organization_Member_200_response_user_identities_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganizationMember200ResponseUserIdentitiesInner retrieveAnOrganizationMember200ResponseUserIdentitiesInner = (RetrieveAnOrganizationMember200ResponseUserIdentitiesInner) o;
    return Objects.equals(this.id, retrieveAnOrganizationMember200ResponseUserIdentitiesInner.id) &&
        Objects.equals(this.name, retrieveAnOrganizationMember200ResponseUserIdentitiesInner.name) &&
        Objects.equals(this.organization, retrieveAnOrganizationMember200ResponseUserIdentitiesInner.organization) &&
        Objects.equals(this.provider, retrieveAnOrganizationMember200ResponseUserIdentitiesInner.provider) &&
        Objects.equals(this.dateVerified, retrieveAnOrganizationMember200ResponseUserIdentitiesInner.dateVerified) &&
        Objects.equals(this.dateSynced, retrieveAnOrganizationMember200ResponseUserIdentitiesInner.dateSynced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, organization, provider, dateVerified, dateSynced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseUserIdentitiesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    dateVerified: ").append(toIndentedString(dateVerified)).append("\n");
    sb.append("    dateSynced: ").append(toIndentedString(dateSynced)).append("\n");
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

