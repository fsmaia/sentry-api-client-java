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
import com.sentry.api.client.model.CreateANewReleaseForAnOrganizationRequestCommitsInner;
import com.sentry.api.client.model.CreateANewReleaseForAnOrganizationRequestRefsInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * CreateANewReleaseForAnOrganizationRequest
 */
@JsonPropertyOrder({
  CreateANewReleaseForAnOrganizationRequest.JSON_PROPERTY_VERSION,
  CreateANewReleaseForAnOrganizationRequest.JSON_PROPERTY_REF,
  CreateANewReleaseForAnOrganizationRequest.JSON_PROPERTY_URL,
  CreateANewReleaseForAnOrganizationRequest.JSON_PROPERTY_PROJECTS,
  CreateANewReleaseForAnOrganizationRequest.JSON_PROPERTY_DATE_RELEASED,
  CreateANewReleaseForAnOrganizationRequest.JSON_PROPERTY_COMMITS,
  CreateANewReleaseForAnOrganizationRequest.JSON_PROPERTY_REFS
})
@JsonTypeName("Create_a_New_Release_for_an_Organization_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class CreateANewReleaseForAnOrganizationRequest {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private List<String> projects = new ArrayList<>();

  public static final String JSON_PROPERTY_DATE_RELEASED = "dateReleased";
  private OffsetDateTime dateReleased;

  public static final String JSON_PROPERTY_COMMITS = "commits";
  private List<CreateANewReleaseForAnOrganizationRequestCommitsInner> commits;

  public static final String JSON_PROPERTY_REFS = "refs";
  private List<CreateANewReleaseForAnOrganizationRequestRefsInner> refs;

  public CreateANewReleaseForAnOrganizationRequest() { 
  }

  public CreateANewReleaseForAnOrganizationRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * A version identifier for this release. Can be a version number, a commit hash, etc.
   * @return version
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(String version) {
    this.version = version;
  }


  public CreateANewReleaseForAnOrganizationRequest ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * An optional commit reference. This is useful if a tagged version has been provided.
   * @return ref
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRef() {
    return ref;
  }


  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRef(String ref) {
    this.ref = ref;
  }


  public CreateANewReleaseForAnOrganizationRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL that points to the release. This can be the path to an online interface to the source code for instance
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public CreateANewReleaseForAnOrganizationRequest projects(List<String> projects) {
    this.projects = projects;
    return this;
  }

  public CreateANewReleaseForAnOrganizationRequest addProjectsItem(String projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * A list of project slugs that are involved in this release.
   * @return projects
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getProjects() {
    return projects;
  }


  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjects(List<String> projects) {
    this.projects = projects;
  }


  public CreateANewReleaseForAnOrganizationRequest dateReleased(OffsetDateTime dateReleased) {
    this.dateReleased = dateReleased;
    return this;
  }

   /**
   * An optional date that indicates when the release went live. If not provided the current time is assumed.
   * @return dateReleased
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_RELEASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateReleased() {
    return dateReleased;
  }


  @JsonProperty(JSON_PROPERTY_DATE_RELEASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateReleased(OffsetDateTime dateReleased) {
    this.dateReleased = dateReleased;
  }


  public CreateANewReleaseForAnOrganizationRequest commits(List<CreateANewReleaseForAnOrganizationRequestCommitsInner> commits) {
    this.commits = commits;
    return this;
  }

  public CreateANewReleaseForAnOrganizationRequest addCommitsItem(CreateANewReleaseForAnOrganizationRequestCommitsInner commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<>();
    }
    this.commits.add(commitsItem);
    return this;
  }

   /**
   * An optional list of commit data to be associated with the release. Commits must include parameters &#x60;id&#x60; (the SHA of the commit), and can optionally include &#x60;repository&#x60;, &#x60;message&#x60;, &#x60;patch_set&#x60;, &#x60;author_name&#x60;, &#x60;author_email&#x60;, and &#x60;timestamp&#x60;.
   * @return commits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateANewReleaseForAnOrganizationRequestCommitsInner> getCommits() {
    return commits;
  }


  @JsonProperty(JSON_PROPERTY_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommits(List<CreateANewReleaseForAnOrganizationRequestCommitsInner> commits) {
    this.commits = commits;
  }


  public CreateANewReleaseForAnOrganizationRequest refs(List<CreateANewReleaseForAnOrganizationRequestRefsInner> refs) {
    this.refs = refs;
    return this;
  }

  public CreateANewReleaseForAnOrganizationRequest addRefsItem(CreateANewReleaseForAnOrganizationRequestRefsInner refsItem) {
    if (this.refs == null) {
      this.refs = new ArrayList<>();
    }
    this.refs.add(refsItem);
    return this;
  }

   /**
   * An optional way to indicate the start and end commits for each repository included in a release. Head commits must include parameters &#x60;repository&#x60; and &#x60;commit&#x60; (the HEAD sha). They can optionally include &#x60;previousCommit&#x60; (the sha of the HEAD of the previous release), which should be specified if this is the first time you&#39;ve sent commit data. &#x60;commit&#x60; may contain a range in the form of &#x60;previousCommit..commit&#x60;.
   * @return refs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateANewReleaseForAnOrganizationRequestRefsInner> getRefs() {
    return refs;
  }


  @JsonProperty(JSON_PROPERTY_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefs(List<CreateANewReleaseForAnOrganizationRequestRefsInner> refs) {
    this.refs = refs;
  }


  /**
   * Return true if this Create_a_New_Release_for_an_Organization_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateANewReleaseForAnOrganizationRequest createANewReleaseForAnOrganizationRequest = (CreateANewReleaseForAnOrganizationRequest) o;
    return Objects.equals(this.version, createANewReleaseForAnOrganizationRequest.version) &&
        Objects.equals(this.ref, createANewReleaseForAnOrganizationRequest.ref) &&
        Objects.equals(this.url, createANewReleaseForAnOrganizationRequest.url) &&
        Objects.equals(this.projects, createANewReleaseForAnOrganizationRequest.projects) &&
        Objects.equals(this.dateReleased, createANewReleaseForAnOrganizationRequest.dateReleased) &&
        Objects.equals(this.commits, createANewReleaseForAnOrganizationRequest.commits) &&
        Objects.equals(this.refs, createANewReleaseForAnOrganizationRequest.refs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, ref, url, projects, dateReleased, commits, refs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateANewReleaseForAnOrganizationRequest {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    dateReleased: ").append(toIndentedString(dateReleased)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    refs: ").append(toIndentedString(refs)).append("\n");
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

