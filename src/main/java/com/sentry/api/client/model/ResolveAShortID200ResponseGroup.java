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
import com.sentry.api.client.model.ResolveAShortID200ResponseGroupAssignedTo;
import com.sentry.api.client.model.ResolveAShortID200ResponseGroupMetadata;
import com.sentry.api.client.model.ResolveAShortID200ResponseGroupProject;
import com.sentry.api.client.model.ResolveAShortID200ResponseGroupSubscriptionDetails;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAShortID200ResponseGroup
 */
@JsonPropertyOrder({
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_LAST_SEEN,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_NUM_COMMENTS,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_USER_COUNT,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_CULPRIT,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_TITLE,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_ID,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_ASSIGNED_TO,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_LOGGER,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_TYPE,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_ANNOTATIONS,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_METADATA,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_STATUS,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_SUBSCRIPTION_DETAILS,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_IS_PUBLIC,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_HAS_SEEN,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_SHORT_ID,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_SHARE_ID,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_FIRST_SEEN,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_COUNT,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_PERMALINK,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_LEVEL,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_IS_SUBSCRIBED,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_IS_BOOKMARKED,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_PROJECT,
  ResolveAShortID200ResponseGroup.JSON_PROPERTY_STATUS_DETAILS
})
@JsonTypeName("Resolve_a_Short_ID_200_response_group")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class ResolveAShortID200ResponseGroup {
  public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
  private String lastSeen;

  public static final String JSON_PROPERTY_NUM_COMMENTS = "numComments";
  private Integer numComments;

  public static final String JSON_PROPERTY_USER_COUNT = "userCount";
  private Integer userCount;

  public static final String JSON_PROPERTY_CULPRIT = "culprit";
  private String culprit;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ASSIGNED_TO = "assignedTo";
  private ResolveAShortID200ResponseGroupAssignedTo assignedTo;

  public static final String JSON_PROPERTY_LOGGER = "logger";
  private String logger;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<String> annotations = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ResolveAShortID200ResponseGroupMetadata metadata;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    RESOLVED("resolved"),
    
    UNRESOLVED("unresolved"),
    
    IGNORED("ignored");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_SUBSCRIPTION_DETAILS = "subscriptionDetails";
  private ResolveAShortID200ResponseGroupSubscriptionDetails subscriptionDetails;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  private Boolean isPublic;

  public static final String JSON_PROPERTY_HAS_SEEN = "hasSeen";
  private Boolean hasSeen;

  public static final String JSON_PROPERTY_SHORT_ID = "shortId";
  private String shortId;

  public static final String JSON_PROPERTY_SHARE_ID = "shareId";
  private String shareId;

  public static final String JSON_PROPERTY_FIRST_SEEN = "firstSeen";
  private String firstSeen;

  public static final String JSON_PROPERTY_COUNT = "count";
  private String count;

  public static final String JSON_PROPERTY_PERMALINK = "permalink";
  private String permalink;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private String level;

  public static final String JSON_PROPERTY_IS_SUBSCRIBED = "isSubscribed";
  private Boolean isSubscribed;

  public static final String JSON_PROPERTY_IS_BOOKMARKED = "isBookmarked";
  private Boolean isBookmarked;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private ResolveAShortID200ResponseGroupProject project;

  public static final String JSON_PROPERTY_STATUS_DETAILS = "statusDetails";
  private Object statusDetails;

  public ResolveAShortID200ResponseGroup() { 
  }

  public ResolveAShortID200ResponseGroup lastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastSeen() {
    return lastSeen;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }


  public ResolveAShortID200ResponseGroup numComments(Integer numComments) {
    this.numComments = numComments;
    return this;
  }

   /**
   * Get numComments
   * @return numComments
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUM_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumComments() {
    return numComments;
  }


  @JsonProperty(JSON_PROPERTY_NUM_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumComments(Integer numComments) {
    this.numComments = numComments;
  }


  public ResolveAShortID200ResponseGroup userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUserCount() {
    return userCount;
  }


  @JsonProperty(JSON_PROPERTY_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }


  public ResolveAShortID200ResponseGroup culprit(String culprit) {
    this.culprit = culprit;
    return this;
  }

   /**
   * Get culprit
   * @return culprit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CULPRIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCulprit() {
    return culprit;
  }


  @JsonProperty(JSON_PROPERTY_CULPRIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCulprit(String culprit) {
    this.culprit = culprit;
  }


  public ResolveAShortID200ResponseGroup title(String title) {
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


  public ResolveAShortID200ResponseGroup id(String id) {
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


  public ResolveAShortID200ResponseGroup assignedTo(ResolveAShortID200ResponseGroupAssignedTo assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAShortID200ResponseGroupAssignedTo getAssignedTo() {
    return assignedTo;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssignedTo(ResolveAShortID200ResponseGroupAssignedTo assignedTo) {
    this.assignedTo = assignedTo;
  }


  public ResolveAShortID200ResponseGroup logger(String logger) {
    this.logger = logger;
    return this;
  }

   /**
   * Get logger
   * @return logger
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogger() {
    return logger;
  }


  @JsonProperty(JSON_PROPERTY_LOGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogger(String logger) {
    this.logger = logger;
  }


  public ResolveAShortID200ResponseGroup type(String type) {
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


  public ResolveAShortID200ResponseGroup annotations(List<String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public ResolveAShortID200ResponseGroup addAnnotationsItem(String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAnnotations() {
    return annotations;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnnotations(List<String> annotations) {
    this.annotations = annotations;
  }


  public ResolveAShortID200ResponseGroup metadata(ResolveAShortID200ResponseGroupMetadata metadata) {
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

  public ResolveAShortID200ResponseGroupMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(ResolveAShortID200ResponseGroupMetadata metadata) {
    this.metadata = metadata;
  }


  public ResolveAShortID200ResponseGroup status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ResolveAShortID200ResponseGroup subscriptionDetails(ResolveAShortID200ResponseGroupSubscriptionDetails subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
    return this;
  }

   /**
   * Get subscriptionDetails
   * @return subscriptionDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAShortID200ResponseGroupSubscriptionDetails getSubscriptionDetails() {
    return subscriptionDetails;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionDetails(ResolveAShortID200ResponseGroupSubscriptionDetails subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
  }


  public ResolveAShortID200ResponseGroup isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public ResolveAShortID200ResponseGroup hasSeen(Boolean hasSeen) {
    this.hasSeen = hasSeen;
    return this;
  }

   /**
   * Get hasSeen
   * @return hasSeen
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasSeen() {
    return hasSeen;
  }


  @JsonProperty(JSON_PROPERTY_HAS_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasSeen(Boolean hasSeen) {
    this.hasSeen = hasSeen;
  }


  public ResolveAShortID200ResponseGroup shortId(String shortId) {
    this.shortId = shortId;
    return this;
  }

   /**
   * Get shortId
   * @return shortId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHORT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShortId() {
    return shortId;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShortId(String shortId) {
    this.shortId = shortId;
  }


  public ResolveAShortID200ResponseGroup shareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

   /**
   * Get shareId
   * @return shareId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShareId() {
    return shareId;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShareId(String shareId) {
    this.shareId = shareId;
  }


  public ResolveAShortID200ResponseGroup firstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

   /**
   * Get firstSeen
   * @return firstSeen
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstSeen() {
    return firstSeen;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_SEEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstSeen(String firstSeen) {
    this.firstSeen = firstSeen;
  }


  public ResolveAShortID200ResponseGroup count(String count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCount(String count) {
    this.count = count;
  }


  public ResolveAShortID200ResponseGroup permalink(String permalink) {
    this.permalink = permalink;
    return this;
  }

   /**
   * Get permalink
   * @return permalink
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPermalink() {
    return permalink;
  }


  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }


  public ResolveAShortID200ResponseGroup level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLevel(String level) {
    this.level = level;
  }


  public ResolveAShortID200ResponseGroup isSubscribed(Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
    return this;
  }

   /**
   * Get isSubscribed
   * @return isSubscribed
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_SUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsSubscribed() {
    return isSubscribed;
  }


  @JsonProperty(JSON_PROPERTY_IS_SUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsSubscribed(Boolean isSubscribed) {
    this.isSubscribed = isSubscribed;
  }


  public ResolveAShortID200ResponseGroup isBookmarked(Boolean isBookmarked) {
    this.isBookmarked = isBookmarked;
    return this;
  }

   /**
   * Get isBookmarked
   * @return isBookmarked
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_BOOKMARKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsBookmarked() {
    return isBookmarked;
  }


  @JsonProperty(JSON_PROPERTY_IS_BOOKMARKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsBookmarked(Boolean isBookmarked) {
    this.isBookmarked = isBookmarked;
  }


  public ResolveAShortID200ResponseGroup project(ResolveAShortID200ResponseGroupProject project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResolveAShortID200ResponseGroupProject getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProject(ResolveAShortID200ResponseGroupProject project) {
    this.project = project;
  }


  public ResolveAShortID200ResponseGroup statusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Get statusDetails
   * @return statusDetails
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getStatusDetails() {
    return statusDetails;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatusDetails(Object statusDetails) {
    this.statusDetails = statusDetails;
  }


  /**
   * Return true if this Resolve_a_Short_ID_200_response_group object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAShortID200ResponseGroup resolveAShortID200ResponseGroup = (ResolveAShortID200ResponseGroup) o;
    return Objects.equals(this.lastSeen, resolveAShortID200ResponseGroup.lastSeen) &&
        Objects.equals(this.numComments, resolveAShortID200ResponseGroup.numComments) &&
        Objects.equals(this.userCount, resolveAShortID200ResponseGroup.userCount) &&
        Objects.equals(this.culprit, resolveAShortID200ResponseGroup.culprit) &&
        Objects.equals(this.title, resolveAShortID200ResponseGroup.title) &&
        Objects.equals(this.id, resolveAShortID200ResponseGroup.id) &&
        Objects.equals(this.assignedTo, resolveAShortID200ResponseGroup.assignedTo) &&
        Objects.equals(this.logger, resolveAShortID200ResponseGroup.logger) &&
        Objects.equals(this.type, resolveAShortID200ResponseGroup.type) &&
        Objects.equals(this.annotations, resolveAShortID200ResponseGroup.annotations) &&
        Objects.equals(this.metadata, resolveAShortID200ResponseGroup.metadata) &&
        Objects.equals(this.status, resolveAShortID200ResponseGroup.status) &&
        Objects.equals(this.subscriptionDetails, resolveAShortID200ResponseGroup.subscriptionDetails) &&
        Objects.equals(this.isPublic, resolveAShortID200ResponseGroup.isPublic) &&
        Objects.equals(this.hasSeen, resolveAShortID200ResponseGroup.hasSeen) &&
        Objects.equals(this.shortId, resolveAShortID200ResponseGroup.shortId) &&
        Objects.equals(this.shareId, resolveAShortID200ResponseGroup.shareId) &&
        Objects.equals(this.firstSeen, resolveAShortID200ResponseGroup.firstSeen) &&
        Objects.equals(this.count, resolveAShortID200ResponseGroup.count) &&
        Objects.equals(this.permalink, resolveAShortID200ResponseGroup.permalink) &&
        Objects.equals(this.level, resolveAShortID200ResponseGroup.level) &&
        Objects.equals(this.isSubscribed, resolveAShortID200ResponseGroup.isSubscribed) &&
        Objects.equals(this.isBookmarked, resolveAShortID200ResponseGroup.isBookmarked) &&
        Objects.equals(this.project, resolveAShortID200ResponseGroup.project) &&
        Objects.equals(this.statusDetails, resolveAShortID200ResponseGroup.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSeen, numComments, userCount, culprit, title, id, assignedTo, logger, type, annotations, metadata, status, subscriptionDetails, isPublic, hasSeen, shortId, shareId, firstSeen, count, permalink, level, isSubscribed, isBookmarked, project, statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAShortID200ResponseGroup {\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    numComments: ").append(toIndentedString(numComments)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    culprit: ").append(toIndentedString(culprit)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    logger: ").append(toIndentedString(logger)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriptionDetails: ").append(toIndentedString(subscriptionDetails)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    hasSeen: ").append(toIndentedString(hasSeen)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    isSubscribed: ").append(toIndentedString(isSubscribed)).append("\n");
    sb.append("    isBookmarked: ").append(toIndentedString(isBookmarked)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

