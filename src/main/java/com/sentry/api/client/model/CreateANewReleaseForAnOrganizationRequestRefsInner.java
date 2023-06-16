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
 * CreateANewReleaseForAnOrganizationRequestRefsInner
 */
@JsonPropertyOrder({
  CreateANewReleaseForAnOrganizationRequestRefsInner.JSON_PROPERTY_REPOSITORY,
  CreateANewReleaseForAnOrganizationRequestRefsInner.JSON_PROPERTY_COMMIT,
  CreateANewReleaseForAnOrganizationRequestRefsInner.JSON_PROPERTY_PREVIOUS_COMMIT
})
@JsonTypeName("Create_a_New_Release_for_an_Organization_request_refs_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class CreateANewReleaseForAnOrganizationRequestRefsInner {
  public static final String JSON_PROPERTY_REPOSITORY = "repository";
  private String repository;

  public static final String JSON_PROPERTY_COMMIT = "commit";
  private String commit;

  public static final String JSON_PROPERTY_PREVIOUS_COMMIT = "previousCommit";
  private String previousCommit;

  public CreateANewReleaseForAnOrganizationRequestRefsInner() { 
  }

  public CreateANewReleaseForAnOrganizationRequestRefsInner repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * The full name of the repository the commit belongs to.
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


  public CreateANewReleaseForAnOrganizationRequestRefsInner commit(String commit) {
    this.commit = commit;
    return this;
  }

   /**
   * The current release&#39;s commit.
   * @return commit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommit() {
    return commit;
  }


  @JsonProperty(JSON_PROPERTY_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommit(String commit) {
    this.commit = commit;
  }


  public CreateANewReleaseForAnOrganizationRequestRefsInner previousCommit(String previousCommit) {
    this.previousCommit = previousCommit;
    return this;
  }

   /**
   * The previous release&#39;s commit.
   * @return previousCommit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviousCommit() {
    return previousCommit;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousCommit(String previousCommit) {
    this.previousCommit = previousCommit;
  }


  /**
   * Return true if this Create_a_New_Release_for_an_Organization_request_refs_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateANewReleaseForAnOrganizationRequestRefsInner createANewReleaseForAnOrganizationRequestRefsInner = (CreateANewReleaseForAnOrganizationRequestRefsInner) o;
    return Objects.equals(this.repository, createANewReleaseForAnOrganizationRequestRefsInner.repository) &&
        Objects.equals(this.commit, createANewReleaseForAnOrganizationRequestRefsInner.commit) &&
        Objects.equals(this.previousCommit, createANewReleaseForAnOrganizationRequestRefsInner.previousCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repository, commit, previousCommit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateANewReleaseForAnOrganizationRequestRefsInner {\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    previousCommit: ").append(toIndentedString(previousCommit)).append("\n");
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

