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
 * ListAnOrganizationSUsers200ResponseInnerUserEmailsInner
 */
@JsonPropertyOrder({
  ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.JSON_PROPERTY_IS_VERIFIED,
  ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.JSON_PROPERTY_ID,
  ListAnOrganizationSUsers200ResponseInnerUserEmailsInner.JSON_PROPERTY_EMAIL
})
@JsonTypeName("List_an_Organization_s_Users_200_response_inner_user_emails_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ListAnOrganizationSUsers200ResponseInnerUserEmailsInner {
  public static final String JSON_PROPERTY_IS_VERIFIED = "is_verified";
  private Boolean isVerified;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner() { 
  }

  public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Get isVerified
   * @return isVerified
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsVerified() {
    return isVerified;
  }


  @JsonProperty(JSON_PROPERTY_IS_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }


  public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ListAnOrganizationSUsers200ResponseInnerUserEmailsInner email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Return true if this List_an_Organization_s_Users_200_response_inner_user_emails_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSUsers200ResponseInnerUserEmailsInner listAnOrganizationSUsers200ResponseInnerUserEmailsInner = (ListAnOrganizationSUsers200ResponseInnerUserEmailsInner) o;
    return Objects.equals(this.isVerified, listAnOrganizationSUsers200ResponseInnerUserEmailsInner.isVerified) &&
        Objects.equals(this.id, listAnOrganizationSUsers200ResponseInnerUserEmailsInner.id) &&
        Objects.equals(this.email, listAnOrganizationSUsers200ResponseInnerUserEmailsInner.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isVerified, id, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSUsers200ResponseInnerUserEmailsInner {\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

