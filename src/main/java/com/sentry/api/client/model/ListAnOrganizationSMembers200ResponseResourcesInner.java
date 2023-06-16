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
import com.sentry.api.client.model.ListAnOrganizationSMembers200ResponseResourcesInnerEmailsInner;
import com.sentry.api.client.model.ListAnOrganizationSMembers200ResponseResourcesInnerName;
import com.sentry.api.client.model.QueryAnIndividualTeam200ResponseMeta;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * Conforming to the SCIM RFC, this represents a Sentry Org Member as a SCIM user object.
 */
@JsonPropertyOrder({
  ListAnOrganizationSMembers200ResponseResourcesInner.JSON_PROPERTY_ACTIVE,
  ListAnOrganizationSMembers200ResponseResourcesInner.JSON_PROPERTY_SCHEMAS,
  ListAnOrganizationSMembers200ResponseResourcesInner.JSON_PROPERTY_ID,
  ListAnOrganizationSMembers200ResponseResourcesInner.JSON_PROPERTY_USER_NAME,
  ListAnOrganizationSMembers200ResponseResourcesInner.JSON_PROPERTY_NAME,
  ListAnOrganizationSMembers200ResponseResourcesInner.JSON_PROPERTY_EMAILS,
  ListAnOrganizationSMembers200ResponseResourcesInner.JSON_PROPERTY_META,
  ListAnOrganizationSMembers200ResponseResourcesInner.JSON_PROPERTY_SENTRY_ORG_ROLE
})
@JsonTypeName("List_an_Organization_s_Members_200_response_Resources_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class ListAnOrganizationSMembers200ResponseResourcesInner {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private List<String> schemas = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_NAME = "name";
  private ListAnOrganizationSMembers200ResponseResourcesInnerName name;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<ListAnOrganizationSMembers200ResponseResourcesInnerEmailsInner> emails = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private QueryAnIndividualTeam200ResponseMeta meta;

  public static final String JSON_PROPERTY_SENTRY_ORG_ROLE = "sentryOrgRole";
  private String sentryOrgRole;

  public ListAnOrganizationSMembers200ResponseResourcesInner() { 
  }

  public ListAnOrganizationSMembers200ResponseResourcesInner active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public ListAnOrganizationSMembers200ResponseResourcesInner schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public ListAnOrganizationSMembers200ResponseResourcesInner addSchemasItem(String schemasItem) {
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


  public ListAnOrganizationSMembers200ResponseResourcesInner id(String id) {
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


  public ListAnOrganizationSMembers200ResponseResourcesInner userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ListAnOrganizationSMembers200ResponseResourcesInner name(ListAnOrganizationSMembers200ResponseResourcesInnerName name) {
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

  public ListAnOrganizationSMembers200ResponseResourcesInnerName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(ListAnOrganizationSMembers200ResponseResourcesInnerName name) {
    this.name = name;
  }


  public ListAnOrganizationSMembers200ResponseResourcesInner emails(List<ListAnOrganizationSMembers200ResponseResourcesInnerEmailsInner> emails) {
    this.emails = emails;
    return this;
  }

  public ListAnOrganizationSMembers200ResponseResourcesInner addEmailsItem(ListAnOrganizationSMembers200ResponseResourcesInnerEmailsInner emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ListAnOrganizationSMembers200ResponseResourcesInnerEmailsInner> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmails(List<ListAnOrganizationSMembers200ResponseResourcesInnerEmailsInner> emails) {
    this.emails = emails;
  }


  public ListAnOrganizationSMembers200ResponseResourcesInner meta(QueryAnIndividualTeam200ResponseMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public QueryAnIndividualTeam200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(QueryAnIndividualTeam200ResponseMeta meta) {
    this.meta = meta;
  }


  public ListAnOrganizationSMembers200ResponseResourcesInner sentryOrgRole(String sentryOrgRole) {
    this.sentryOrgRole = sentryOrgRole;
    return this;
  }

   /**
   * Get sentryOrgRole
   * @return sentryOrgRole
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENTRY_ORG_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSentryOrgRole() {
    return sentryOrgRole;
  }


  @JsonProperty(JSON_PROPERTY_SENTRY_ORG_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSentryOrgRole(String sentryOrgRole) {
    this.sentryOrgRole = sentryOrgRole;
  }


  /**
   * Return true if this List_an_Organization_s_Members_200_response_Resources_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSMembers200ResponseResourcesInner listAnOrganizationSMembers200ResponseResourcesInner = (ListAnOrganizationSMembers200ResponseResourcesInner) o;
    return Objects.equals(this.active, listAnOrganizationSMembers200ResponseResourcesInner.active) &&
        Objects.equals(this.schemas, listAnOrganizationSMembers200ResponseResourcesInner.schemas) &&
        Objects.equals(this.id, listAnOrganizationSMembers200ResponseResourcesInner.id) &&
        Objects.equals(this.userName, listAnOrganizationSMembers200ResponseResourcesInner.userName) &&
        Objects.equals(this.name, listAnOrganizationSMembers200ResponseResourcesInner.name) &&
        Objects.equals(this.emails, listAnOrganizationSMembers200ResponseResourcesInner.emails) &&
        Objects.equals(this.meta, listAnOrganizationSMembers200ResponseResourcesInner.meta) &&
        Objects.equals(this.sentryOrgRole, listAnOrganizationSMembers200ResponseResourcesInner.sentryOrgRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, schemas, id, userName, name, emails, meta, sentryOrgRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSMembers200ResponseResourcesInner {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    sentryOrgRole: ").append(toIndentedString(sentryOrgRole)).append("\n");
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

