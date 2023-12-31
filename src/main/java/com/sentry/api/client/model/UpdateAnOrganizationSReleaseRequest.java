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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * UpdateAnOrganizationSReleaseRequest
 */
@JsonPropertyOrder({
  UpdateAnOrganizationSReleaseRequest.JSON_PROPERTY_REF,
  UpdateAnOrganizationSReleaseRequest.JSON_PROPERTY_URL,
  UpdateAnOrganizationSReleaseRequest.JSON_PROPERTY_DATE_RELEASED,
  UpdateAnOrganizationSReleaseRequest.JSON_PROPERTY_COMMITS,
  UpdateAnOrganizationSReleaseRequest.JSON_PROPERTY_REFS
})
@JsonTypeName("Update_an_Organization_s_Release_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class UpdateAnOrganizationSReleaseRequest {
  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DATE_RELEASED = "dateReleased";
  private OffsetDateTime dateReleased;

  public static final String JSON_PROPERTY_COMMITS = "commits";
  private List<Object> commits;

  public static final String JSON_PROPERTY_REFS = "refs";
  private List<Object> refs;

  public UpdateAnOrganizationSReleaseRequest() { 
  }

  public UpdateAnOrganizationSReleaseRequest ref(String ref) {
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


  public UpdateAnOrganizationSReleaseRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL that points to the release. This can be the path to an online interface to the source code for instance.
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


  public UpdateAnOrganizationSReleaseRequest dateReleased(OffsetDateTime dateReleased) {
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


  public UpdateAnOrganizationSReleaseRequest commits(List<Object> commits) {
    this.commits = commits;
    return this;
  }

  public UpdateAnOrganizationSReleaseRequest addCommitsItem(Object commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<>();
    }
    this.commits.add(commitsItem);
    return this;
  }

   /**
   * An optional list of commit data to be associated with the release. Commits must include parameters &#x60;id&#x60; (the sha of the commit), and can optionally include &#x60;repository&#x60;, &#x60;message&#x60;, &#x60;author_name&#x60;, &#x60;author_email&#x60;, and &#x60;timestamp&#x60;.
   * @return commits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getCommits() {
    return commits;
  }


  @JsonProperty(JSON_PROPERTY_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommits(List<Object> commits) {
    this.commits = commits;
  }


  public UpdateAnOrganizationSReleaseRequest refs(List<Object> refs) {
    this.refs = refs;
    return this;
  }

  public UpdateAnOrganizationSReleaseRequest addRefsItem(Object refsItem) {
    if (this.refs == null) {
      this.refs = new ArrayList<>();
    }
    this.refs.add(refsItem);
    return this;
  }

   /**
   * An optional way to indicate the start and end commits for each repository included in a release. Head commits must include parameters &#x60;repository&#x60; and &#x60;commit&#x60; (the HEAD sha). They can optionally include &#x60;previousCommit&#x60; (the sha of the HEAD of the previous release), which should be specified if this is the first time you&#39;ve sent commit data.
   * @return refs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getRefs() {
    return refs;
  }


  @JsonProperty(JSON_PROPERTY_REFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefs(List<Object> refs) {
    this.refs = refs;
  }


  /**
   * Return true if this Update_an_Organization_s_Release_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnOrganizationSReleaseRequest updateAnOrganizationSReleaseRequest = (UpdateAnOrganizationSReleaseRequest) o;
    return Objects.equals(this.ref, updateAnOrganizationSReleaseRequest.ref) &&
        Objects.equals(this.url, updateAnOrganizationSReleaseRequest.url) &&
        Objects.equals(this.dateReleased, updateAnOrganizationSReleaseRequest.dateReleased) &&
        Objects.equals(this.commits, updateAnOrganizationSReleaseRequest.commits) &&
        Objects.equals(this.refs, updateAnOrganizationSReleaseRequest.refs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, url, dateReleased, commits, refs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnOrganizationSReleaseRequest {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

