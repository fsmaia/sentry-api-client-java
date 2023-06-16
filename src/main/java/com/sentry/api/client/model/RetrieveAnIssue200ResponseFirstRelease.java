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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnIssue200ResponseFirstRelease
 */
@JsonPropertyOrder({
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_AUTHORS,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_COMMIT_COUNT,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_DATA,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_DATE_CREATED,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_DATE_RELEASED,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_DEPLOY_COUNT,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_FIRST_EVENT,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_LAST_COMMIT,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_LAST_DEPLOY,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_LAST_EVENT,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_NEW_GROUPS,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_OWNER,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_PROJECTS,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_REF,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_SHORT_VERSION,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_URL,
  RetrieveAnIssue200ResponseFirstRelease.JSON_PROPERTY_VERSION
})
@JsonTypeName("Retrieve_an_Issue_200_response_firstRelease")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class RetrieveAnIssue200ResponseFirstRelease {
  public static final String JSON_PROPERTY_AUTHORS = "authors";
  private List<String> authors;

  public static final String JSON_PROPERTY_COMMIT_COUNT = "commitCount";
  private Integer commitCount;

  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<Object> data = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_DATE_RELEASED = "dateReleased";
  private JsonNullable<String> dateReleased = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPLOY_COUNT = "deployCount";
  private Integer deployCount;

  public static final String JSON_PROPERTY_FIRST_EVENT = "firstEvent";
  private String firstEvent;

  public static final String JSON_PROPERTY_LAST_COMMIT = "lastCommit";
  private JsonNullable<String> lastCommit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_DEPLOY = "lastDeploy";
  private JsonNullable<String> lastDeploy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_EVENT = "lastEvent";
  private String lastEvent;

  public static final String JSON_PROPERTY_NEW_GROUPS = "newGroups";
  private Integer newGroups;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private JsonNullable<String> owner = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private List<RetrieveAProject200ResponseLatestReleaseProjectsInner> projects;

  public static final String JSON_PROPERTY_REF = "ref";
  private JsonNullable<String> ref = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHORT_VERSION = "shortVersion";
  private String shortVersion;

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public RetrieveAnIssue200ResponseFirstRelease() { 
  }

  public RetrieveAnIssue200ResponseFirstRelease authors(List<String> authors) {
    this.authors = authors;
    return this;
  }

  public RetrieveAnIssue200ResponseFirstRelease addAuthorsItem(String authorsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAuthors() {
    return authors;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }


  public RetrieveAnIssue200ResponseFirstRelease commitCount(Integer commitCount) {
    this.commitCount = commitCount;
    return this;
  }

   /**
   * Get commitCount
   * @return commitCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCommitCount() {
    return commitCount;
  }


  @JsonProperty(JSON_PROPERTY_COMMIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommitCount(Integer commitCount) {
    this.commitCount = commitCount;
  }


  public RetrieveAnIssue200ResponseFirstRelease data(Object data) {
    this.data = JsonNullable.<Object>of(data);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getData() {
        return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getData_JsonNullable() {
    return data;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<Object> data) {
    this.data = data;
  }

  public void setData(Object data) {
    this.data = JsonNullable.<Object>of(data);
  }


  public RetrieveAnIssue200ResponseFirstRelease dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public RetrieveAnIssue200ResponseFirstRelease dateReleased(String dateReleased) {
    this.dateReleased = JsonNullable.<String>of(dateReleased);
    return this;
  }

   /**
   * Get dateReleased
   * @return dateReleased
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDateReleased() {
        return dateReleased.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_RELEASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDateReleased_JsonNullable() {
    return dateReleased;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE_RELEASED)
  public void setDateReleased_JsonNullable(JsonNullable<String> dateReleased) {
    this.dateReleased = dateReleased;
  }

  public void setDateReleased(String dateReleased) {
    this.dateReleased = JsonNullable.<String>of(dateReleased);
  }


  public RetrieveAnIssue200ResponseFirstRelease deployCount(Integer deployCount) {
    this.deployCount = deployCount;
    return this;
  }

   /**
   * Get deployCount
   * @return deployCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPLOY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeployCount() {
    return deployCount;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeployCount(Integer deployCount) {
    this.deployCount = deployCount;
  }


  public RetrieveAnIssue200ResponseFirstRelease firstEvent(String firstEvent) {
    this.firstEvent = firstEvent;
    return this;
  }

   /**
   * Get firstEvent
   * @return firstEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstEvent() {
    return firstEvent;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstEvent(String firstEvent) {
    this.firstEvent = firstEvent;
  }


  public RetrieveAnIssue200ResponseFirstRelease lastCommit(String lastCommit) {
    this.lastCommit = JsonNullable.<String>of(lastCommit);
    return this;
  }

   /**
   * Get lastCommit
   * @return lastCommit
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getLastCommit() {
        return lastCommit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastCommit_JsonNullable() {
    return lastCommit;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_COMMIT)
  public void setLastCommit_JsonNullable(JsonNullable<String> lastCommit) {
    this.lastCommit = lastCommit;
  }

  public void setLastCommit(String lastCommit) {
    this.lastCommit = JsonNullable.<String>of(lastCommit);
  }


  public RetrieveAnIssue200ResponseFirstRelease lastDeploy(String lastDeploy) {
    this.lastDeploy = JsonNullable.<String>of(lastDeploy);
    return this;
  }

   /**
   * Get lastDeploy
   * @return lastDeploy
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getLastDeploy() {
        return lastDeploy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_DEPLOY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastDeploy_JsonNullable() {
    return lastDeploy;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_DEPLOY)
  public void setLastDeploy_JsonNullable(JsonNullable<String> lastDeploy) {
    this.lastDeploy = lastDeploy;
  }

  public void setLastDeploy(String lastDeploy) {
    this.lastDeploy = JsonNullable.<String>of(lastDeploy);
  }


  public RetrieveAnIssue200ResponseFirstRelease lastEvent(String lastEvent) {
    this.lastEvent = lastEvent;
    return this;
  }

   /**
   * Get lastEvent
   * @return lastEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastEvent() {
    return lastEvent;
  }


  @JsonProperty(JSON_PROPERTY_LAST_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastEvent(String lastEvent) {
    this.lastEvent = lastEvent;
  }


  public RetrieveAnIssue200ResponseFirstRelease newGroups(Integer newGroups) {
    this.newGroups = newGroups;
    return this;
  }

   /**
   * Get newGroups
   * @return newGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNewGroups() {
    return newGroups;
  }


  @JsonProperty(JSON_PROPERTY_NEW_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewGroups(Integer newGroups) {
    this.newGroups = newGroups;
  }


  public RetrieveAnIssue200ResponseFirstRelease owner(String owner) {
    this.owner = JsonNullable.<String>of(owner);
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getOwner() {
        return owner.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOwner_JsonNullable() {
    return owner;
  }
  
  @JsonProperty(JSON_PROPERTY_OWNER)
  public void setOwner_JsonNullable(JsonNullable<String> owner) {
    this.owner = owner;
  }

  public void setOwner(String owner) {
    this.owner = JsonNullable.<String>of(owner);
  }


  public RetrieveAnIssue200ResponseFirstRelease projects(List<RetrieveAProject200ResponseLatestReleaseProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  public RetrieveAnIssue200ResponseFirstRelease addProjectsItem(RetrieveAProject200ResponseLatestReleaseProjectsInner projectsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetrieveAProject200ResponseLatestReleaseProjectsInner> getProjects() {
    return projects;
  }


  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjects(List<RetrieveAProject200ResponseLatestReleaseProjectsInner> projects) {
    this.projects = projects;
  }


  public RetrieveAnIssue200ResponseFirstRelease ref(String ref) {
    this.ref = JsonNullable.<String>of(ref);
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getRef() {
        return ref.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRef_JsonNullable() {
    return ref;
  }
  
  @JsonProperty(JSON_PROPERTY_REF)
  public void setRef_JsonNullable(JsonNullable<String> ref) {
    this.ref = ref;
  }

  public void setRef(String ref) {
    this.ref = JsonNullable.<String>of(ref);
  }


  public RetrieveAnIssue200ResponseFirstRelease shortVersion(String shortVersion) {
    this.shortVersion = shortVersion;
    return this;
  }

   /**
   * Get shortVersion
   * @return shortVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortVersion() {
    return shortVersion;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortVersion(String shortVersion) {
    this.shortVersion = shortVersion;
  }


  public RetrieveAnIssue200ResponseFirstRelease url(String url) {
    this.url = JsonNullable.<String>of(url);
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(String url) {
    this.url = JsonNullable.<String>of(url);
  }


  public RetrieveAnIssue200ResponseFirstRelease version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this Retrieve_an_Issue_200_response_firstRelease object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnIssue200ResponseFirstRelease retrieveAnIssue200ResponseFirstRelease = (RetrieveAnIssue200ResponseFirstRelease) o;
    return Objects.equals(this.authors, retrieveAnIssue200ResponseFirstRelease.authors) &&
        Objects.equals(this.commitCount, retrieveAnIssue200ResponseFirstRelease.commitCount) &&
        equalsNullable(this.data, retrieveAnIssue200ResponseFirstRelease.data) &&
        Objects.equals(this.dateCreated, retrieveAnIssue200ResponseFirstRelease.dateCreated) &&
        equalsNullable(this.dateReleased, retrieveAnIssue200ResponseFirstRelease.dateReleased) &&
        Objects.equals(this.deployCount, retrieveAnIssue200ResponseFirstRelease.deployCount) &&
        Objects.equals(this.firstEvent, retrieveAnIssue200ResponseFirstRelease.firstEvent) &&
        equalsNullable(this.lastCommit, retrieveAnIssue200ResponseFirstRelease.lastCommit) &&
        equalsNullable(this.lastDeploy, retrieveAnIssue200ResponseFirstRelease.lastDeploy) &&
        Objects.equals(this.lastEvent, retrieveAnIssue200ResponseFirstRelease.lastEvent) &&
        Objects.equals(this.newGroups, retrieveAnIssue200ResponseFirstRelease.newGroups) &&
        equalsNullable(this.owner, retrieveAnIssue200ResponseFirstRelease.owner) &&
        Objects.equals(this.projects, retrieveAnIssue200ResponseFirstRelease.projects) &&
        equalsNullable(this.ref, retrieveAnIssue200ResponseFirstRelease.ref) &&
        Objects.equals(this.shortVersion, retrieveAnIssue200ResponseFirstRelease.shortVersion) &&
        equalsNullable(this.url, retrieveAnIssue200ResponseFirstRelease.url) &&
        Objects.equals(this.version, retrieveAnIssue200ResponseFirstRelease.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, commitCount, hashCodeNullable(data), dateCreated, hashCodeNullable(dateReleased), deployCount, firstEvent, hashCodeNullable(lastCommit), hashCodeNullable(lastDeploy), lastEvent, newGroups, hashCodeNullable(owner), projects, hashCodeNullable(ref), shortVersion, hashCodeNullable(url), version);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnIssue200ResponseFirstRelease {\n");
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
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

