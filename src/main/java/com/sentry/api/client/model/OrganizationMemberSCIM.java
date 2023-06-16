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
  OrganizationMemberSCIM.JSON_PROPERTY_ACTIVE,
  OrganizationMemberSCIM.JSON_PROPERTY_SCHEMAS,
  OrganizationMemberSCIM.JSON_PROPERTY_ID,
  OrganizationMemberSCIM.JSON_PROPERTY_USER_NAME,
  OrganizationMemberSCIM.JSON_PROPERTY_NAME,
  OrganizationMemberSCIM.JSON_PROPERTY_EMAILS,
  OrganizationMemberSCIM.JSON_PROPERTY_META,
  OrganizationMemberSCIM.JSON_PROPERTY_SENTRY_ORG_ROLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class OrganizationMemberSCIM {
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

  public OrganizationMemberSCIM() { 
  }

  public OrganizationMemberSCIM active(Boolean active) {
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


  public OrganizationMemberSCIM schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public OrganizationMemberSCIM addSchemasItem(String schemasItem) {
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


  public OrganizationMemberSCIM id(String id) {
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


  public OrganizationMemberSCIM userName(String userName) {
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


  public OrganizationMemberSCIM name(ListAnOrganizationSMembers200ResponseResourcesInnerName name) {
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


  public OrganizationMemberSCIM emails(List<ListAnOrganizationSMembers200ResponseResourcesInnerEmailsInner> emails) {
    this.emails = emails;
    return this;
  }

  public OrganizationMemberSCIM addEmailsItem(ListAnOrganizationSMembers200ResponseResourcesInnerEmailsInner emailsItem) {
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


  public OrganizationMemberSCIM meta(QueryAnIndividualTeam200ResponseMeta meta) {
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


  public OrganizationMemberSCIM sentryOrgRole(String sentryOrgRole) {
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
   * Return true if this OrganizationMemberSCIM object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationMemberSCIM organizationMemberSCIM = (OrganizationMemberSCIM) o;
    return Objects.equals(this.active, organizationMemberSCIM.active) &&
        Objects.equals(this.schemas, organizationMemberSCIM.schemas) &&
        Objects.equals(this.id, organizationMemberSCIM.id) &&
        Objects.equals(this.userName, organizationMemberSCIM.userName) &&
        Objects.equals(this.name, organizationMemberSCIM.name) &&
        Objects.equals(this.emails, organizationMemberSCIM.emails) &&
        Objects.equals(this.meta, organizationMemberSCIM.meta) &&
        Objects.equals(this.sentryOrgRole, organizationMemberSCIM.sentryOrgRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, schemas, id, userName, name, emails, meta, sentryOrgRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationMemberSCIM {\n");
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

