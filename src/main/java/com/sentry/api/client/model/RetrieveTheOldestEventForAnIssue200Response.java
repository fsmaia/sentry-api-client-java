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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContexts;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInner;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventUser;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseContext;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseErrorsInner;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseMeta;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseMetadata;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseSdk;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseTagsInner;
import com.sentry.api.client.model.RetrieveTheOldestEventForAnIssue200ResponseRelease;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveTheOldestEventForAnIssue200Response
 */
@JsonPropertyOrder({
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_EVENT_I_D,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_DIST,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_USER_REPORT,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_PREVIOUS_EVENT_I_D,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_MESSAGE,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_ID,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_SIZE,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_ERRORS,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_PLATFORM,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_NEXT_EVENT_I_D,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_TYPE,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_METADATA,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_TAGS,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_DATE_CREATED,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_DATE_RECEIVED,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_USER,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_ENTRIES,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_PACKAGES,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_SDK,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_META,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_CONTEXTS,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_FINGERPRINTS,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_CONTEXT,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_RELEASE,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_GROUP_I_D,
  RetrieveTheOldestEventForAnIssue200Response.JSON_PROPERTY_TITLE
})
@JsonTypeName("Retrieve_the_Oldest_Event_for_an_Issue_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class RetrieveTheOldestEventForAnIssue200Response {
  public static final String JSON_PROPERTY_EVENT_I_D = "eventID";
  private String eventID;

  public static final String JSON_PROPERTY_DIST = "dist";
  private String dist;

  public static final String JSON_PROPERTY_USER_REPORT = "userReport";
  private Object userReport;

  public static final String JSON_PROPERTY_PREVIOUS_EVENT_I_D = "previousEventID";
  private String previousEventID;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<RetrieveAnEventForAProject200ResponseErrorsInner> errors = new ArrayList<>();

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_NEXT_EVENT_I_D = "nextEventID";
  private String nextEventID;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private RetrieveAnEventForAProject200ResponseMetadata metadata;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<RetrieveAnEventForAProject200ResponseTagsInner> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_DATE_RECEIVED = "dateReceived";
  private String dateReceived;

  public static final String JSON_PROPERTY_USER = "user";
  private ResolveAnEventID200ResponseEventUser user;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<ResolveAnEventID200ResponseEventEntriesInner> entries = new ArrayList<>();

  public static final String JSON_PROPERTY_PACKAGES = "packages";
  private Object packages;

  public static final String JSON_PROPERTY_SDK = "sdk";
  private RetrieveAnEventForAProject200ResponseSdk sdk;

  public static final String JSON_PROPERTY_META = "_meta";
  private RetrieveAnEventForAProject200ResponseMeta meta;

  public static final String JSON_PROPERTY_CONTEXTS = "contexts";
  private ResolveAnEventID200ResponseEventContexts contexts;

  public static final String JSON_PROPERTY_FINGERPRINTS = "fingerprints";
  private List<String> fingerprints = new ArrayList<>();

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private RetrieveAnEventForAProject200ResponseContext context;

  public static final String JSON_PROPERTY_RELEASE = "release";
  private RetrieveTheOldestEventForAnIssue200ResponseRelease release;

  public static final String JSON_PROPERTY_GROUP_I_D = "groupID";
  private String groupID;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public RetrieveTheOldestEventForAnIssue200Response() { 
  }

  public RetrieveTheOldestEventForAnIssue200Response eventID(String eventID) {
    this.eventID = eventID;
    return this;
  }

   /**
   * Get eventID
   * @return eventID
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventID() {
    return eventID;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventID(String eventID) {
    this.eventID = eventID;
  }


  public RetrieveTheOldestEventForAnIssue200Response dist(String dist) {
    this.dist = dist;
    return this;
  }

   /**
   * Get dist
   * @return dist
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDist() {
    return dist;
  }


  @JsonProperty(JSON_PROPERTY_DIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDist(String dist) {
    this.dist = dist;
  }


  public RetrieveTheOldestEventForAnIssue200Response userReport(Object userReport) {
    this.userReport = userReport;
    return this;
  }

   /**
   * Get userReport
   * @return userReport
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_REPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUserReport() {
    return userReport;
  }


  @JsonProperty(JSON_PROPERTY_USER_REPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserReport(Object userReport) {
    this.userReport = userReport;
  }


  public RetrieveTheOldestEventForAnIssue200Response previousEventID(String previousEventID) {
    this.previousEventID = previousEventID;
    return this;
  }

   /**
   * Get previousEventID
   * @return previousEventID
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPreviousEventID() {
    return previousEventID;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreviousEventID(String previousEventID) {
    this.previousEventID = previousEventID;
  }


  public RetrieveTheOldestEventForAnIssue200Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public RetrieveTheOldestEventForAnIssue200Response id(String id) {
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


  public RetrieveTheOldestEventForAnIssue200Response size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public RetrieveTheOldestEventForAnIssue200Response errors(List<RetrieveAnEventForAProject200ResponseErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public RetrieveTheOldestEventForAnIssue200Response addErrorsItem(RetrieveAnEventForAProject200ResponseErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnEventForAProject200ResponseErrorsInner> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrors(List<RetrieveAnEventForAProject200ResponseErrorsInner> errors) {
    this.errors = errors;
  }


  public RetrieveTheOldestEventForAnIssue200Response platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public RetrieveTheOldestEventForAnIssue200Response nextEventID(String nextEventID) {
    this.nextEventID = nextEventID;
    return this;
  }

   /**
   * Get nextEventID
   * @return nextEventID
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNextEventID() {
    return nextEventID;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_EVENT_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNextEventID(String nextEventID) {
    this.nextEventID = nextEventID;
  }


  public RetrieveTheOldestEventForAnIssue200Response type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public RetrieveTheOldestEventForAnIssue200Response metadata(RetrieveAnEventForAProject200ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnEventForAProject200ResponseMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(RetrieveAnEventForAProject200ResponseMetadata metadata) {
    this.metadata = metadata;
  }


  public RetrieveTheOldestEventForAnIssue200Response tags(List<RetrieveAnEventForAProject200ResponseTagsInner> tags) {
    this.tags = tags;
    return this;
  }

  public RetrieveTheOldestEventForAnIssue200Response addTagsItem(RetrieveAnEventForAProject200ResponseTagsInner tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnEventForAProject200ResponseTagsInner> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(List<RetrieveAnEventForAProject200ResponseTagsInner> tags) {
    this.tags = tags;
  }


  public RetrieveTheOldestEventForAnIssue200Response dateCreated(String dateCreated) {
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

  public String getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public RetrieveTheOldestEventForAnIssue200Response dateReceived(String dateReceived) {
    this.dateReceived = dateReceived;
    return this;
  }

   /**
   * Get dateReceived
   * @return dateReceived
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDateReceived() {
    return dateReceived;
  }


  @JsonProperty(JSON_PROPERTY_DATE_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateReceived(String dateReceived) {
    this.dateReceived = dateReceived;
  }


  public RetrieveTheOldestEventForAnIssue200Response user(ResolveAnEventID200ResponseEventUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAnEventID200ResponseEventUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUser(ResolveAnEventID200ResponseEventUser user) {
    this.user = user;
  }


  public RetrieveTheOldestEventForAnIssue200Response entries(List<ResolveAnEventID200ResponseEventEntriesInner> entries) {
    this.entries = entries;
    return this;
  }

  public RetrieveTheOldestEventForAnIssue200Response addEntriesItem(ResolveAnEventID200ResponseEventEntriesInner entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ResolveAnEventID200ResponseEventEntriesInner> getEntries() {
    return entries;
  }


  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntries(List<ResolveAnEventID200ResponseEventEntriesInner> entries) {
    this.entries = entries;
  }


  public RetrieveTheOldestEventForAnIssue200Response packages(Object packages) {
    this.packages = packages;
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPackages() {
    return packages;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPackages(Object packages) {
    this.packages = packages;
  }


  public RetrieveTheOldestEventForAnIssue200Response sdk(RetrieveAnEventForAProject200ResponseSdk sdk) {
    this.sdk = sdk;
    return this;
  }

   /**
   * Get sdk
   * @return sdk
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnEventForAProject200ResponseSdk getSdk() {
    return sdk;
  }


  @JsonProperty(JSON_PROPERTY_SDK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdk(RetrieveAnEventForAProject200ResponseSdk sdk) {
    this.sdk = sdk;
  }


  public RetrieveTheOldestEventForAnIssue200Response meta(RetrieveAnEventForAProject200ResponseMeta meta) {
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

  public RetrieveAnEventForAProject200ResponseMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(RetrieveAnEventForAProject200ResponseMeta meta) {
    this.meta = meta;
  }


  public RetrieveTheOldestEventForAnIssue200Response contexts(ResolveAnEventID200ResponseEventContexts contexts) {
    this.contexts = contexts;
    return this;
  }

   /**
   * Get contexts
   * @return contexts
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTEXTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAnEventID200ResponseEventContexts getContexts() {
    return contexts;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContexts(ResolveAnEventID200ResponseEventContexts contexts) {
    this.contexts = contexts;
  }


  public RetrieveTheOldestEventForAnIssue200Response fingerprints(List<String> fingerprints) {
    this.fingerprints = fingerprints;
    return this;
  }

  public RetrieveTheOldestEventForAnIssue200Response addFingerprintsItem(String fingerprintsItem) {
    if (this.fingerprints == null) {
      this.fingerprints = new ArrayList<>();
    }
    this.fingerprints.add(fingerprintsItem);
    return this;
  }

   /**
   * Get fingerprints
   * @return fingerprints
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FINGERPRINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getFingerprints() {
    return fingerprints;
  }


  @JsonProperty(JSON_PROPERTY_FINGERPRINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFingerprints(List<String> fingerprints) {
    this.fingerprints = fingerprints;
  }


  public RetrieveTheOldestEventForAnIssue200Response context(RetrieveAnEventForAProject200ResponseContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnEventForAProject200ResponseContext getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContext(RetrieveAnEventForAProject200ResponseContext context) {
    this.context = context;
  }


  public RetrieveTheOldestEventForAnIssue200Response release(RetrieveTheOldestEventForAnIssue200ResponseRelease release) {
    this.release = release;
    return this;
  }

   /**
   * Get release
   * @return release
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveTheOldestEventForAnIssue200ResponseRelease getRelease() {
    return release;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRelease(RetrieveTheOldestEventForAnIssue200ResponseRelease release) {
    this.release = release;
  }


  public RetrieveTheOldestEventForAnIssue200Response groupID(String groupID) {
    this.groupID = groupID;
    return this;
  }

   /**
   * Get groupID
   * @return groupID
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROUP_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupID() {
    return groupID;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_I_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupID(String groupID) {
    this.groupID = groupID;
  }


  public RetrieveTheOldestEventForAnIssue200Response title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this Retrieve_the_Oldest_Event_for_an_Issue_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveTheOldestEventForAnIssue200Response retrieveTheOldestEventForAnIssue200Response = (RetrieveTheOldestEventForAnIssue200Response) o;
    return Objects.equals(this.eventID, retrieveTheOldestEventForAnIssue200Response.eventID) &&
        Objects.equals(this.dist, retrieveTheOldestEventForAnIssue200Response.dist) &&
        Objects.equals(this.userReport, retrieveTheOldestEventForAnIssue200Response.userReport) &&
        Objects.equals(this.previousEventID, retrieveTheOldestEventForAnIssue200Response.previousEventID) &&
        Objects.equals(this.message, retrieveTheOldestEventForAnIssue200Response.message) &&
        Objects.equals(this.id, retrieveTheOldestEventForAnIssue200Response.id) &&
        Objects.equals(this.size, retrieveTheOldestEventForAnIssue200Response.size) &&
        Objects.equals(this.errors, retrieveTheOldestEventForAnIssue200Response.errors) &&
        Objects.equals(this.platform, retrieveTheOldestEventForAnIssue200Response.platform) &&
        Objects.equals(this.nextEventID, retrieveTheOldestEventForAnIssue200Response.nextEventID) &&
        Objects.equals(this.type, retrieveTheOldestEventForAnIssue200Response.type) &&
        Objects.equals(this.metadata, retrieveTheOldestEventForAnIssue200Response.metadata) &&
        Objects.equals(this.tags, retrieveTheOldestEventForAnIssue200Response.tags) &&
        Objects.equals(this.dateCreated, retrieveTheOldestEventForAnIssue200Response.dateCreated) &&
        Objects.equals(this.dateReceived, retrieveTheOldestEventForAnIssue200Response.dateReceived) &&
        Objects.equals(this.user, retrieveTheOldestEventForAnIssue200Response.user) &&
        Objects.equals(this.entries, retrieveTheOldestEventForAnIssue200Response.entries) &&
        Objects.equals(this.packages, retrieveTheOldestEventForAnIssue200Response.packages) &&
        Objects.equals(this.sdk, retrieveTheOldestEventForAnIssue200Response.sdk) &&
        Objects.equals(this.meta, retrieveTheOldestEventForAnIssue200Response.meta) &&
        Objects.equals(this.contexts, retrieveTheOldestEventForAnIssue200Response.contexts) &&
        Objects.equals(this.fingerprints, retrieveTheOldestEventForAnIssue200Response.fingerprints) &&
        Objects.equals(this.context, retrieveTheOldestEventForAnIssue200Response.context) &&
        Objects.equals(this.release, retrieveTheOldestEventForAnIssue200Response.release) &&
        Objects.equals(this.groupID, retrieveTheOldestEventForAnIssue200Response.groupID) &&
        Objects.equals(this.title, retrieveTheOldestEventForAnIssue200Response.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventID, dist, userReport, previousEventID, message, id, size, errors, platform, nextEventID, type, metadata, tags, dateCreated, dateReceived, user, entries, packages, sdk, meta, contexts, fingerprints, context, release, groupID, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveTheOldestEventForAnIssue200Response {\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    dist: ").append(toIndentedString(dist)).append("\n");
    sb.append("    userReport: ").append(toIndentedString(userReport)).append("\n");
    sb.append("    previousEventID: ").append(toIndentedString(previousEventID)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    nextEventID: ").append(toIndentedString(nextEventID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateReceived: ").append(toIndentedString(dateReceived)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    sdk: ").append(toIndentedString(sdk)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    fingerprints: ").append(toIndentedString(fingerprints)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    groupID: ").append(toIndentedString(groupID)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

