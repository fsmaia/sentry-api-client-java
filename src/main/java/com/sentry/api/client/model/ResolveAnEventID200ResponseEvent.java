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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContext;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContexts;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInner;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventErrorsInner;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventMeta;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventMetadata;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventPackages;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventTagsInner;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventUser;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEvent
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_META,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_CONTEXT,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_CONTEXTS,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_DATE_CREATED,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_DATE_RECEIVED,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_DIST,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_ENTRIES,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_ERRORS,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_EVENT_I_D,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_FINGERPRINTS,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_GROUP_I_D,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_ID,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_MESSAGE,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_METADATA,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_PACKAGES,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_PLATFORM,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_SDK,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_SIZE,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_TAGS,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_TYPE,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_USER,
  ResolveAnEventID200ResponseEvent.JSON_PROPERTY_TITLE
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEvent {
  public static final String JSON_PROPERTY_META = "_meta";
  private ResolveAnEventID200ResponseEventMeta meta;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private ResolveAnEventID200ResponseEventContext context;

  public static final String JSON_PROPERTY_CONTEXTS = "contexts";
  private ResolveAnEventID200ResponseEventContexts contexts;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_DATE_RECEIVED = "dateReceived";
  private String dateReceived;

  public static final String JSON_PROPERTY_DIST = "dist";
  private String dist;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<ResolveAnEventID200ResponseEventEntriesInner> entries = new ArrayList<>();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<ResolveAnEventID200ResponseEventErrorsInner> errors = new ArrayList<>();

  public static final String JSON_PROPERTY_EVENT_I_D = "eventID";
  private String eventID;

  public static final String JSON_PROPERTY_FINGERPRINTS = "fingerprints";
  private List<String> fingerprints = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUP_I_D = "groupID";
  private String groupID;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ResolveAnEventID200ResponseEventMetadata metadata;

  public static final String JSON_PROPERTY_PACKAGES = "packages";
  private ResolveAnEventID200ResponseEventPackages packages;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_SDK = "sdk";
  private Object sdk;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<ResolveAnEventID200ResponseEventTagsInner> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USER = "user";
  private ResolveAnEventID200ResponseEventUser user;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ResolveAnEventID200ResponseEvent() { 
  }

  public ResolveAnEventID200ResponseEvent meta(ResolveAnEventID200ResponseEventMeta meta) {
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

  public ResolveAnEventID200ResponseEventMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(ResolveAnEventID200ResponseEventMeta meta) {
    this.meta = meta;
  }


  public ResolveAnEventID200ResponseEvent context(ResolveAnEventID200ResponseEventContext context) {
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

  public ResolveAnEventID200ResponseEventContext getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContext(ResolveAnEventID200ResponseEventContext context) {
    this.context = context;
  }


  public ResolveAnEventID200ResponseEvent contexts(ResolveAnEventID200ResponseEventContexts contexts) {
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


  public ResolveAnEventID200ResponseEvent dateCreated(String dateCreated) {
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


  public ResolveAnEventID200ResponseEvent dateReceived(String dateReceived) {
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


  public ResolveAnEventID200ResponseEvent dist(String dist) {
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


  public ResolveAnEventID200ResponseEvent entries(List<ResolveAnEventID200ResponseEventEntriesInner> entries) {
    this.entries = entries;
    return this;
  }

  public ResolveAnEventID200ResponseEvent addEntriesItem(ResolveAnEventID200ResponseEventEntriesInner entriesItem) {
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


  public ResolveAnEventID200ResponseEvent errors(List<ResolveAnEventID200ResponseEventErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public ResolveAnEventID200ResponseEvent addErrorsItem(ResolveAnEventID200ResponseEventErrorsInner errorsItem) {
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

  public List<ResolveAnEventID200ResponseEventErrorsInner> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrors(List<ResolveAnEventID200ResponseEventErrorsInner> errors) {
    this.errors = errors;
  }


  public ResolveAnEventID200ResponseEvent eventID(String eventID) {
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


  public ResolveAnEventID200ResponseEvent fingerprints(List<String> fingerprints) {
    this.fingerprints = fingerprints;
    return this;
  }

  public ResolveAnEventID200ResponseEvent addFingerprintsItem(String fingerprintsItem) {
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


  public ResolveAnEventID200ResponseEvent groupID(String groupID) {
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


  public ResolveAnEventID200ResponseEvent id(String id) {
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


  public ResolveAnEventID200ResponseEvent message(String message) {
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


  public ResolveAnEventID200ResponseEvent metadata(ResolveAnEventID200ResponseEventMetadata metadata) {
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

  public ResolveAnEventID200ResponseEventMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(ResolveAnEventID200ResponseEventMetadata metadata) {
    this.metadata = metadata;
  }


  public ResolveAnEventID200ResponseEvent packages(ResolveAnEventID200ResponseEventPackages packages) {
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

  public ResolveAnEventID200ResponseEventPackages getPackages() {
    return packages;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPackages(ResolveAnEventID200ResponseEventPackages packages) {
    this.packages = packages;
  }


  public ResolveAnEventID200ResponseEvent platform(String platform) {
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


  public ResolveAnEventID200ResponseEvent sdk(Object sdk) {
    this.sdk = sdk;
    return this;
  }

   /**
   * Get sdk
   * @return sdk
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSdk() {
    return sdk;
  }


  @JsonProperty(JSON_PROPERTY_SDK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdk(Object sdk) {
    this.sdk = sdk;
  }


  public ResolveAnEventID200ResponseEvent size(Integer size) {
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


  public ResolveAnEventID200ResponseEvent tags(List<ResolveAnEventID200ResponseEventTagsInner> tags) {
    this.tags = tags;
    return this;
  }

  public ResolveAnEventID200ResponseEvent addTagsItem(ResolveAnEventID200ResponseEventTagsInner tagsItem) {
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

  public List<ResolveAnEventID200ResponseEventTagsInner> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(List<ResolveAnEventID200ResponseEventTagsInner> tags) {
    this.tags = tags;
  }


  public ResolveAnEventID200ResponseEvent type(String type) {
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


  public ResolveAnEventID200ResponseEvent user(ResolveAnEventID200ResponseEventUser user) {
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


  public ResolveAnEventID200ResponseEvent title(String title) {
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
   * Return true if this Resolve_an_Event_ID_200_response_event object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEvent resolveAnEventID200ResponseEvent = (ResolveAnEventID200ResponseEvent) o;
    return Objects.equals(this.meta, resolveAnEventID200ResponseEvent.meta) &&
        Objects.equals(this.context, resolveAnEventID200ResponseEvent.context) &&
        Objects.equals(this.contexts, resolveAnEventID200ResponseEvent.contexts) &&
        Objects.equals(this.dateCreated, resolveAnEventID200ResponseEvent.dateCreated) &&
        Objects.equals(this.dateReceived, resolveAnEventID200ResponseEvent.dateReceived) &&
        Objects.equals(this.dist, resolveAnEventID200ResponseEvent.dist) &&
        Objects.equals(this.entries, resolveAnEventID200ResponseEvent.entries) &&
        Objects.equals(this.errors, resolveAnEventID200ResponseEvent.errors) &&
        Objects.equals(this.eventID, resolveAnEventID200ResponseEvent.eventID) &&
        Objects.equals(this.fingerprints, resolveAnEventID200ResponseEvent.fingerprints) &&
        Objects.equals(this.groupID, resolveAnEventID200ResponseEvent.groupID) &&
        Objects.equals(this.id, resolveAnEventID200ResponseEvent.id) &&
        Objects.equals(this.message, resolveAnEventID200ResponseEvent.message) &&
        Objects.equals(this.metadata, resolveAnEventID200ResponseEvent.metadata) &&
        Objects.equals(this.packages, resolveAnEventID200ResponseEvent.packages) &&
        Objects.equals(this.platform, resolveAnEventID200ResponseEvent.platform) &&
        Objects.equals(this.sdk, resolveAnEventID200ResponseEvent.sdk) &&
        Objects.equals(this.size, resolveAnEventID200ResponseEvent.size) &&
        Objects.equals(this.tags, resolveAnEventID200ResponseEvent.tags) &&
        Objects.equals(this.type, resolveAnEventID200ResponseEvent.type) &&
        Objects.equals(this.user, resolveAnEventID200ResponseEvent.user) &&
        Objects.equals(this.title, resolveAnEventID200ResponseEvent.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, context, contexts, dateCreated, dateReceived, dist, entries, errors, eventID, fingerprints, groupID, id, message, metadata, packages, platform, sdk, size, tags, type, user, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEvent {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateReceived: ").append(toIndentedString(dateReceived)).append("\n");
    sb.append("    dist: ").append(toIndentedString(dist)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    fingerprints: ").append(toIndentedString(fingerprints)).append("\n");
    sb.append("    groupID: ").append(toIndentedString(groupID)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    sdk: ").append(toIndentedString(sdk)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

