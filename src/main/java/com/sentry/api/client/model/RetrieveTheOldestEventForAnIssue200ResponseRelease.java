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
import com.sentry.api.client.model.RetrieveAProject200ResponseLatestReleaseProjectsInner;
import com.sentry.api.client.model.RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveTheOldestEventForAnIssue200ResponseRelease
 */
@JsonPropertyOrder({
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_ID,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_AUTHORS,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_COMMIT_COUNT,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_DATA,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_DATE_CREATED,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_DATE_RELEASED,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_DEPLOY_COUNT,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_FIRST_EVENT,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_LAST_COMMIT,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_LAST_DEPLOY,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_LAST_EVENT,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_NEW_GROUPS,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_OWNER,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_PROJECTS,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_REF,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_SHORT_VERSION,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_VERSION,
  RetrieveTheOldestEventForAnIssue200ResponseRelease.JSON_PROPERTY_URL
})
@JsonTypeName("Retrieve_the_Oldest_Event_for_an_Issue_200_response_release")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class RetrieveTheOldestEventForAnIssue200ResponseRelease {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_AUTHORS = "authors";
  private List<Object> authors = new ArrayList<>();

  public static final String JSON_PROPERTY_COMMIT_COUNT = "commitCount";
  private Long commitCount;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_RELEASED = "dateReleased";
  private OffsetDateTime dateReleased;

  public static final String JSON_PROPERTY_DEPLOY_COUNT = "deployCount";
  private Long deployCount;

  public static final String JSON_PROPERTY_FIRST_EVENT = "firstEvent";
  private OffsetDateTime firstEvent;

  public static final String JSON_PROPERTY_LAST_COMMIT = "lastCommit";
  private Object lastCommit;

  public static final String JSON_PROPERTY_LAST_DEPLOY = "lastDeploy";
  private RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy lastDeploy;

  public static final String JSON_PROPERTY_LAST_EVENT = "lastEvent";
  private OffsetDateTime lastEvent;

  public static final String JSON_PROPERTY_NEW_GROUPS = "newGroups";
  private Long newGroups;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private Object owner;

  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private List<RetrieveAProject200ResponseLatestReleaseProjectsInner> projects = new ArrayList<>();

  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public static final String JSON_PROPERTY_SHORT_VERSION = "shortVersion";
  private String shortVersion;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public RetrieveTheOldestEventForAnIssue200ResponseRelease() { 
  }

  public RetrieveTheOldestEventForAnIssue200ResponseRelease id(Integer id) {
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

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease authors(List<Object> authors) {
    this.authors = authors;
    return this;
  }

  public RetrieveTheOldestEventForAnIssue200ResponseRelease addAuthorsItem(Object authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * Get authors
   * @return authors
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getAuthors() {
    return authors;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthors(List<Object> authors) {
    this.authors = authors;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease commitCount(Long commitCount) {
    this.commitCount = commitCount;
    return this;
  }

   /**
   * Get commitCount
   * @return commitCount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCommitCount() {
    return commitCount;
  }


  @JsonProperty(JSON_PROPERTY_COMMIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommitCount(Long commitCount) {
    this.commitCount = commitCount;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(Object data) {
    this.data = data;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease dateCreated(OffsetDateTime dateCreated) {
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


  public RetrieveTheOldestEventForAnIssue200ResponseRelease dateReleased(OffsetDateTime dateReleased) {
    this.dateReleased = dateReleased;
    return this;
  }

   /**
   * Get dateReleased
   * @return dateReleased
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_RELEASED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDateReleased() {
    return dateReleased;
  }


  @JsonProperty(JSON_PROPERTY_DATE_RELEASED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateReleased(OffsetDateTime dateReleased) {
    this.dateReleased = dateReleased;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease deployCount(Long deployCount) {
    this.deployCount = deployCount;
    return this;
  }

   /**
   * Get deployCount
   * @return deployCount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPLOY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDeployCount() {
    return deployCount;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeployCount(Long deployCount) {
    this.deployCount = deployCount;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease firstEvent(OffsetDateTime firstEvent) {
    this.firstEvent = firstEvent;
    return this;
  }

   /**
   * Get firstEvent
   * @return firstEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getFirstEvent() {
    return firstEvent;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstEvent(OffsetDateTime firstEvent) {
    this.firstEvent = firstEvent;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease lastCommit(Object lastCommit) {
    this.lastCommit = lastCommit;
    return this;
  }

   /**
   * Get lastCommit
   * @return lastCommit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_COMMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getLastCommit() {
    return lastCommit;
  }


  @JsonProperty(JSON_PROPERTY_LAST_COMMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastCommit(Object lastCommit) {
    this.lastCommit = lastCommit;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease lastDeploy(RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy lastDeploy) {
    this.lastDeploy = lastDeploy;
    return this;
  }

   /**
   * Get lastDeploy
   * @return lastDeploy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_DEPLOY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy getLastDeploy() {
    return lastDeploy;
  }


  @JsonProperty(JSON_PROPERTY_LAST_DEPLOY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastDeploy(RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy lastDeploy) {
    this.lastDeploy = lastDeploy;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease lastEvent(OffsetDateTime lastEvent) {
    this.lastEvent = lastEvent;
    return this;
  }

   /**
   * Get lastEvent
   * @return lastEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getLastEvent() {
    return lastEvent;
  }


  @JsonProperty(JSON_PROPERTY_LAST_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastEvent(OffsetDateTime lastEvent) {
    this.lastEvent = lastEvent;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease newGroups(Long newGroups) {
    this.newGroups = newGroups;
    return this;
  }

   /**
   * Get newGroups
   * @return newGroups
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NEW_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getNewGroups() {
    return newGroups;
  }


  @JsonProperty(JSON_PROPERTY_NEW_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNewGroups(Long newGroups) {
    this.newGroups = newGroups;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease owner(Object owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwner(Object owner) {
    this.owner = owner;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease projects(List<RetrieveAProject200ResponseLatestReleaseProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  public RetrieveTheOldestEventForAnIssue200ResponseRelease addProjectsItem(RetrieveAProject200ResponseLatestReleaseProjectsInner projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAProject200ResponseLatestReleaseProjectsInner> getProjects() {
    return projects;
  }


  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjects(List<RetrieveAProject200ResponseLatestReleaseProjectsInner> projects) {
    this.projects = projects;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRef() {
    return ref;
  }


  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRef(String ref) {
    this.ref = ref;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease shortVersion(String shortVersion) {
    this.shortVersion = shortVersion;
    return this;
  }

   /**
   * Get shortVersion
   * @return shortVersion
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHORT_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShortVersion() {
    return shortVersion;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShortVersion(String shortVersion) {
    this.shortVersion = shortVersion;
  }


  public RetrieveTheOldestEventForAnIssue200ResponseRelease version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
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


  public RetrieveTheOldestEventForAnIssue200ResponseRelease url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this Retrieve_the_Oldest_Event_for_an_Issue_200_response_release object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveTheOldestEventForAnIssue200ResponseRelease retrieveTheOldestEventForAnIssue200ResponseRelease = (RetrieveTheOldestEventForAnIssue200ResponseRelease) o;
    return Objects.equals(this.id, retrieveTheOldestEventForAnIssue200ResponseRelease.id) &&
        Objects.equals(this.authors, retrieveTheOldestEventForAnIssue200ResponseRelease.authors) &&
        Objects.equals(this.commitCount, retrieveTheOldestEventForAnIssue200ResponseRelease.commitCount) &&
        Objects.equals(this.data, retrieveTheOldestEventForAnIssue200ResponseRelease.data) &&
        Objects.equals(this.dateCreated, retrieveTheOldestEventForAnIssue200ResponseRelease.dateCreated) &&
        Objects.equals(this.dateReleased, retrieveTheOldestEventForAnIssue200ResponseRelease.dateReleased) &&
        Objects.equals(this.deployCount, retrieveTheOldestEventForAnIssue200ResponseRelease.deployCount) &&
        Objects.equals(this.firstEvent, retrieveTheOldestEventForAnIssue200ResponseRelease.firstEvent) &&
        Objects.equals(this.lastCommit, retrieveTheOldestEventForAnIssue200ResponseRelease.lastCommit) &&
        Objects.equals(this.lastDeploy, retrieveTheOldestEventForAnIssue200ResponseRelease.lastDeploy) &&
        Objects.equals(this.lastEvent, retrieveTheOldestEventForAnIssue200ResponseRelease.lastEvent) &&
        Objects.equals(this.newGroups, retrieveTheOldestEventForAnIssue200ResponseRelease.newGroups) &&
        Objects.equals(this.owner, retrieveTheOldestEventForAnIssue200ResponseRelease.owner) &&
        Objects.equals(this.projects, retrieveTheOldestEventForAnIssue200ResponseRelease.projects) &&
        Objects.equals(this.ref, retrieveTheOldestEventForAnIssue200ResponseRelease.ref) &&
        Objects.equals(this.shortVersion, retrieveTheOldestEventForAnIssue200ResponseRelease.shortVersion) &&
        Objects.equals(this.version, retrieveTheOldestEventForAnIssue200ResponseRelease.version) &&
        Objects.equals(this.url, retrieveTheOldestEventForAnIssue200ResponseRelease.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authors, commitCount, data, dateCreated, dateReleased, deployCount, firstEvent, lastCommit, lastDeploy, lastEvent, newGroups, owner, projects, ref, shortVersion, version, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveTheOldestEventForAnIssue200ResponseRelease {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateReleased: ").append(toIndentedString(dateReleased)).append("\n");
    sb.append("    deployCount: ").append(toIndentedString(deployCount)).append("\n");
    sb.append("    firstEvent: ").append(toIndentedString(firstEvent)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
    sb.append("    lastDeploy: ").append(toIndentedString(lastDeploy)).append("\n");
    sb.append("    lastEvent: ").append(toIndentedString(lastEvent)).append("\n");
    sb.append("    newGroups: ").append(toIndentedString(newGroups)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    shortVersion: ").append(toIndentedString(shortVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

