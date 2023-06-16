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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnIssueSHashes200ResponseInnerLatestEvent
 */
@JsonPropertyOrder({
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_EVENT_I_D,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_DIST,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_MESSAGE,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_ID,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_SIZE,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_ERRORS,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_PLATFORM,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_TYPE,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_METADATA,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_TAGS,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_DATE_CREATED,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_DATE_RECEIVED,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_USER,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_ENTRIES,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_PACKAGES,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_SDK,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_META,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_CONTEXTS,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_FINGERPRINTS,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_CONTEXT,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_GROUP_I_D,
  ListAnIssueSHashes200ResponseInnerLatestEvent.JSON_PROPERTY_TITLE
})
@JsonTypeName("List_an_Issue_s_Hashes_200_response_inner_latestEvent")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class ListAnIssueSHashes200ResponseInnerLatestEvent {
  public static final String JSON_PROPERTY_EVENT_I_D = "eventID";
  private String eventID;

  public static final String JSON_PROPERTY_DIST = "dist";
  private String dist;

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

  public static final String JSON_PROPERTY_GROUP_I_D = "groupID";
  private String groupID;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ListAnIssueSHashes200ResponseInnerLatestEvent() { 
  }

  public ListAnIssueSHashes200ResponseInnerLatestEvent eventID(String eventID) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent dist(String dist) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent message(String message) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent id(String id) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent size(Integer size) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent errors(List<RetrieveAnEventForAProject200ResponseErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public ListAnIssueSHashes200ResponseInnerLatestEvent addErrorsItem(RetrieveAnEventForAProject200ResponseErrorsInner errorsItem) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent platform(String platform) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent type(String type) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent metadata(RetrieveAnEventForAProject200ResponseMetadata metadata) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent tags(List<RetrieveAnEventForAProject200ResponseTagsInner> tags) {
    this.tags = tags;
    return this;
  }

  public ListAnIssueSHashes200ResponseInnerLatestEvent addTagsItem(RetrieveAnEventForAProject200ResponseTagsInner tagsItem) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent dateCreated(String dateCreated) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent dateReceived(String dateReceived) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent user(ResolveAnEventID200ResponseEventUser user) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent entries(List<ResolveAnEventID200ResponseEventEntriesInner> entries) {
    this.entries = entries;
    return this;
  }

  public ListAnIssueSHashes200ResponseInnerLatestEvent addEntriesItem(ResolveAnEventID200ResponseEventEntriesInner entriesItem) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent packages(Object packages) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent sdk(RetrieveAnEventForAProject200ResponseSdk sdk) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent meta(RetrieveAnEventForAProject200ResponseMeta meta) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent contexts(ResolveAnEventID200ResponseEventContexts contexts) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent fingerprints(List<String> fingerprints) {
    this.fingerprints = fingerprints;
    return this;
  }

  public ListAnIssueSHashes200ResponseInnerLatestEvent addFingerprintsItem(String fingerprintsItem) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent context(RetrieveAnEventForAProject200ResponseContext context) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent groupID(String groupID) {
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


  public ListAnIssueSHashes200ResponseInnerLatestEvent title(String title) {
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
   * Return true if this List_an_Issue_s_Hashes_200_response_inner_latestEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnIssueSHashes200ResponseInnerLatestEvent listAnIssueSHashes200ResponseInnerLatestEvent = (ListAnIssueSHashes200ResponseInnerLatestEvent) o;
    return Objects.equals(this.eventID, listAnIssueSHashes200ResponseInnerLatestEvent.eventID) &&
        Objects.equals(this.dist, listAnIssueSHashes200ResponseInnerLatestEvent.dist) &&
        Objects.equals(this.message, listAnIssueSHashes200ResponseInnerLatestEvent.message) &&
        Objects.equals(this.id, listAnIssueSHashes200ResponseInnerLatestEvent.id) &&
        Objects.equals(this.size, listAnIssueSHashes200ResponseInnerLatestEvent.size) &&
        Objects.equals(this.errors, listAnIssueSHashes200ResponseInnerLatestEvent.errors) &&
        Objects.equals(this.platform, listAnIssueSHashes200ResponseInnerLatestEvent.platform) &&
        Objects.equals(this.type, listAnIssueSHashes200ResponseInnerLatestEvent.type) &&
        Objects.equals(this.metadata, listAnIssueSHashes200ResponseInnerLatestEvent.metadata) &&
        Objects.equals(this.tags, listAnIssueSHashes200ResponseInnerLatestEvent.tags) &&
        Objects.equals(this.dateCreated, listAnIssueSHashes200ResponseInnerLatestEvent.dateCreated) &&
        Objects.equals(this.dateReceived, listAnIssueSHashes200ResponseInnerLatestEvent.dateReceived) &&
        Objects.equals(this.user, listAnIssueSHashes200ResponseInnerLatestEvent.user) &&
        Objects.equals(this.entries, listAnIssueSHashes200ResponseInnerLatestEvent.entries) &&
        Objects.equals(this.packages, listAnIssueSHashes200ResponseInnerLatestEvent.packages) &&
        Objects.equals(this.sdk, listAnIssueSHashes200ResponseInnerLatestEvent.sdk) &&
        Objects.equals(this.meta, listAnIssueSHashes200ResponseInnerLatestEvent.meta) &&
        Objects.equals(this.contexts, listAnIssueSHashes200ResponseInnerLatestEvent.contexts) &&
        Objects.equals(this.fingerprints, listAnIssueSHashes200ResponseInnerLatestEvent.fingerprints) &&
        Objects.equals(this.context, listAnIssueSHashes200ResponseInnerLatestEvent.context) &&
        Objects.equals(this.groupID, listAnIssueSHashes200ResponseInnerLatestEvent.groupID) &&
        Objects.equals(this.title, listAnIssueSHashes200ResponseInnerLatestEvent.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventID, dist, message, id, size, errors, platform, type, metadata, tags, dateCreated, dateReceived, user, entries, packages, sdk, meta, contexts, fingerprints, context, groupID, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnIssueSHashes200ResponseInnerLatestEvent {\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    dist: ").append(toIndentedString(dist)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

