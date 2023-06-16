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
 * RetrieveAnOrganizationMember200ResponseUserEmailsInner
 */
@JsonPropertyOrder({
  RetrieveAnOrganizationMember200ResponseUserEmailsInner.JSON_PROPERTY_ID,
  RetrieveAnOrganizationMember200ResponseUserEmailsInner.JSON_PROPERTY_EMAIL,
  RetrieveAnOrganizationMember200ResponseUserEmailsInner.JSON_PROPERTY_IS_VERIFIED
})
@JsonTypeName("Retrieve_an_Organization_Member_200_response_user_emails_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseUserEmailsInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_IS_VERIFIED = "is_verified";
  private Boolean isVerified;

  public RetrieveAnOrganizationMember200ResponseUserEmailsInner() { 
  }

  public RetrieveAnOrganizationMember200ResponseUserEmailsInner id(String id) {
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


  public RetrieveAnOrganizationMember200ResponseUserEmailsInner email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public RetrieveAnOrganizationMember200ResponseUserEmailsInner isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Get isVerified
   * @return isVerified
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsVerified() {
    return isVerified;
  }


  @JsonProperty(JSON_PROPERTY_IS_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }


  /**
   * Return true if this Retrieve_an_Organization_Member_200_response_user_emails_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganizationMember200ResponseUserEmailsInner retrieveAnOrganizationMember200ResponseUserEmailsInner = (RetrieveAnOrganizationMember200ResponseUserEmailsInner) o;
    return Objects.equals(this.id, retrieveAnOrganizationMember200ResponseUserEmailsInner.id) &&
        Objects.equals(this.email, retrieveAnOrganizationMember200ResponseUserEmailsInner.email) &&
        Objects.equals(this.isVerified, retrieveAnOrganizationMember200ResponseUserEmailsInner.isVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, isVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseUserEmailsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
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

