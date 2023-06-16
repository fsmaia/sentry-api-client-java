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
import com.sentry.api.client.model.CreateANewReleaseForAnOrganizationRequestCommitsInnerPatchSetInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * CreateANewReleaseForAnOrganizationRequestCommitsInner
 */
@JsonPropertyOrder({
  CreateANewReleaseForAnOrganizationRequestCommitsInner.JSON_PROPERTY_PATCH_SET,
  CreateANewReleaseForAnOrganizationRequestCommitsInner.JSON_PROPERTY_REPOSITORY,
  CreateANewReleaseForAnOrganizationRequestCommitsInner.JSON_PROPERTY_AUTHOR_NAME,
  CreateANewReleaseForAnOrganizationRequestCommitsInner.JSON_PROPERTY_AUTHOR_EMAIL,
  CreateANewReleaseForAnOrganizationRequestCommitsInner.JSON_PROPERTY_TIMESTAMP,
  CreateANewReleaseForAnOrganizationRequestCommitsInner.JSON_PROPERTY_MESSAGE,
  CreateANewReleaseForAnOrganizationRequestCommitsInner.JSON_PROPERTY_ID
})
@JsonTypeName("Create_a_New_Release_for_an_Organization_request_commits_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class CreateANewReleaseForAnOrganizationRequestCommitsInner {
  public static final String JSON_PROPERTY_PATCH_SET = "patch_set";
  private List<CreateANewReleaseForAnOrganizationRequestCommitsInnerPatchSetInner> patchSet;

  public static final String JSON_PROPERTY_REPOSITORY = "repository";
  private String repository;

  public static final String JSON_PROPERTY_AUTHOR_NAME = "author_name";
  private String authorName;

  public static final String JSON_PROPERTY_AUTHOR_EMAIL = "author_email";
  private String authorEmail;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public CreateANewReleaseForAnOrganizationRequestCommitsInner() { 
  }

  public CreateANewReleaseForAnOrganizationRequestCommitsInner patchSet(List<CreateANewReleaseForAnOrganizationRequestCommitsInnerPatchSetInner> patchSet) {
    this.patchSet = patchSet;
    return this;
  }

  public CreateANewReleaseForAnOrganizationRequestCommitsInner addPatchSetItem(CreateANewReleaseForAnOrganizationRequestCommitsInnerPatchSetInner patchSetItem) {
    if (this.patchSet == null) {
      this.patchSet = new ArrayList<>();
    }
    this.patchSet.add(patchSetItem);
    return this;
  }

   /**
   * A list of the files that have been changed in the commit. Specifying the patch_set is necessary to power suspect commits and suggested assignees.
   * @return patchSet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATCH_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateANewReleaseForAnOrganizationRequestCommitsInnerPatchSetInner> getPatchSet() {
    return patchSet;
  }


  @JsonProperty(JSON_PROPERTY_PATCH_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatchSet(List<CreateANewReleaseForAnOrganizationRequestCommitsInnerPatchSetInner> patchSet) {
    this.patchSet = patchSet;
  }


  public CreateANewReleaseForAnOrganizationRequestCommitsInner repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * The full name of the repository the commit belongs to. If this field is not given Sentry will generate a name in the form: u&#39;organization-&lt;organization_id&gt;&#39; (i.e. if the organization id is 123, then the generated repository name will be u&#39;organization-123).
   * @return repository
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRepository() {
    return repository;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepository(String repository) {
    this.repository = repository;
  }


  public CreateANewReleaseForAnOrganizationRequestCommitsInner authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

   /**
   * The name of the commit author.
   * @return authorName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorName() {
    return authorName;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public CreateANewReleaseForAnOrganizationRequestCommitsInner authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
  }

   /**
   * The email of the commit author. The commit author&#39;s email is required to enable the suggested assignee feature.
   * @return authorEmail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorEmail() {
    return authorEmail;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
  }


  public CreateANewReleaseForAnOrganizationRequestCommitsInner timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The commit timestamp is used to sort the commits given. If a timestamp is not included, the commits will remain sorted in the order given.
   * @return timestamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public CreateANewReleaseForAnOrganizationRequestCommitsInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The commit message.
   * @return message
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public CreateANewReleaseForAnOrganizationRequestCommitsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The commit ID (the commit SHA).
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


  /**
   * Return true if this Create_a_New_Release_for_an_Organization_request_commits_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateANewReleaseForAnOrganizationRequestCommitsInner createANewReleaseForAnOrganizationRequestCommitsInner = (CreateANewReleaseForAnOrganizationRequestCommitsInner) o;
    return Objects.equals(this.patchSet, createANewReleaseForAnOrganizationRequestCommitsInner.patchSet) &&
        Objects.equals(this.repository, createANewReleaseForAnOrganizationRequestCommitsInner.repository) &&
        Objects.equals(this.authorName, createANewReleaseForAnOrganizationRequestCommitsInner.authorName) &&
        Objects.equals(this.authorEmail, createANewReleaseForAnOrganizationRequestCommitsInner.authorEmail) &&
        Objects.equals(this.timestamp, createANewReleaseForAnOrganizationRequestCommitsInner.timestamp) &&
        Objects.equals(this.message, createANewReleaseForAnOrganizationRequestCommitsInner.message) &&
        Objects.equals(this.id, createANewReleaseForAnOrganizationRequestCommitsInner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchSet, repository, authorName, authorEmail, timestamp, message, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateANewReleaseForAnOrganizationRequestCommitsInner {\n");
    sb.append("    patchSet: ").append(toIndentedString(patchSet)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

