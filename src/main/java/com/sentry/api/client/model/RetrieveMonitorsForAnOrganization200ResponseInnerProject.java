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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveMonitorsForAnOrganization200ResponseInnerProject
 */
@JsonPropertyOrder({
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_STATS,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_TRANSACTION_STATS,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_SESSION_STATS,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_ID,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_SLUG,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_NAME,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_PLATFORM,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_DATE_CREATED,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_IS_BOOKMARKED,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_IS_MEMBER,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_FEATURES,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_FIRST_EVENT,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_FIRST_TRANSACTION_EVENT,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_ACCESS,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_HAS_ACCESS,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_HAS_MINIFIED_STACK_TRACE,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_HAS_MONITORS,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_HAS_PROFILES,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_HAS_REPLAYS,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_HAS_SESSIONS,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_IS_INTERNAL,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_IS_PUBLIC,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_AVATAR,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_COLOR,
  RetrieveMonitorsForAnOrganization200ResponseInnerProject.JSON_PROPERTY_STATUS
})
@JsonTypeName("Retrieve_monitors_for_an_organization_200_response_inner_project")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class RetrieveMonitorsForAnOrganization200ResponseInnerProject {
  public static final String JSON_PROPERTY_STATS = "stats";
  private JsonNullable<Object> stats = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TRANSACTION_STATS = "transactionStats";
  private JsonNullable<Object> transactionStats = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SESSION_STATS = "sessionStats";
  private JsonNullable<Object> sessionStats = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_IS_BOOKMARKED = "isBookmarked";
  private Boolean isBookmarked;

  public static final String JSON_PROPERTY_IS_MEMBER = "isMember";
  private Boolean isMember;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<String> features = new ArrayList<>();

  public static final String JSON_PROPERTY_FIRST_EVENT = "firstEvent";
  private OffsetDateTime firstEvent;

  public static final String JSON_PROPERTY_FIRST_TRANSACTION_EVENT = "firstTransactionEvent";
  private Boolean firstTransactionEvent;

  public static final String JSON_PROPERTY_ACCESS = "access";
  private List<String> access = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_ACCESS = "hasAccess";
  private Boolean hasAccess;

  public static final String JSON_PROPERTY_HAS_MINIFIED_STACK_TRACE = "hasMinifiedStackTrace";
  private Boolean hasMinifiedStackTrace;

  public static final String JSON_PROPERTY_HAS_MONITORS = "hasMonitors";
  private Boolean hasMonitors;

  public static final String JSON_PROPERTY_HAS_PROFILES = "hasProfiles";
  private Boolean hasProfiles;

  public static final String JSON_PROPERTY_HAS_REPLAYS = "hasReplays";
  private Boolean hasReplays;

  public static final String JSON_PROPERTY_HAS_SESSIONS = "hasSessions";
  private Boolean hasSessions;

  public static final String JSON_PROPERTY_IS_INTERNAL = "isInternal";
  private Boolean isInternal;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  private Boolean isPublic;

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private Object avatar = null;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public RetrieveMonitorsForAnOrganization200ResponseInnerProject() { 
  }

  public RetrieveMonitorsForAnOrganization200ResponseInnerProject stats(Object stats) {
    this.stats = JsonNullable.<Object>of(stats);
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getStats() {
        return stats.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStats_JsonNullable() {
    return stats;
  }
  
  @JsonProperty(JSON_PROPERTY_STATS)
  public void setStats_JsonNullable(JsonNullable<Object> stats) {
    this.stats = stats;
  }

  public void setStats(Object stats) {
    this.stats = JsonNullable.<Object>of(stats);
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject transactionStats(Object transactionStats) {
    this.transactionStats = JsonNullable.<Object>of(transactionStats);
    return this;
  }

   /**
   * Get transactionStats
   * @return transactionStats
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getTransactionStats() {
        return transactionStats.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANSACTION_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTransactionStats_JsonNullable() {
    return transactionStats;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANSACTION_STATS)
  public void setTransactionStats_JsonNullable(JsonNullable<Object> transactionStats) {
    this.transactionStats = transactionStats;
  }

  public void setTransactionStats(Object transactionStats) {
    this.transactionStats = JsonNullable.<Object>of(transactionStats);
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject sessionStats(Object sessionStats) {
    this.sessionStats = JsonNullable.<Object>of(sessionStats);
    return this;
  }

   /**
   * Get sessionStats
   * @return sessionStats
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getSessionStats() {
        return sessionStats.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSessionStats_JsonNullable() {
    return sessionStats;
  }
  
  @JsonProperty(JSON_PROPERTY_SESSION_STATS)
  public void setSessionStats_JsonNullable(JsonNullable<Object> sessionStats) {
    this.sessionStats = sessionStats;
  }

  public void setSessionStats(Object sessionStats) {
    this.sessionStats = JsonNullable.<Object>of(sessionStats);
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject id(String id) {
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


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
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


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject dateCreated(OffsetDateTime dateCreated) {
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


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject isBookmarked(Boolean isBookmarked) {
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


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

   /**
   * Get isMember
   * @return isMember
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_MEMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsMember() {
    return isMember;
  }


  @JsonProperty(JSON_PROPERTY_IS_MEMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject features(List<String> features) {
    this.features = features;
    return this;
  }

  public RetrieveMonitorsForAnOrganization200ResponseInnerProject addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getFeatures() {
    return features;
  }


  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject firstEvent(OffsetDateTime firstEvent) {
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


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject firstTransactionEvent(Boolean firstTransactionEvent) {
    this.firstTransactionEvent = firstTransactionEvent;
    return this;
  }

   /**
   * Get firstTransactionEvent
   * @return firstTransactionEvent
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRST_TRANSACTION_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFirstTransactionEvent() {
    return firstTransactionEvent;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_TRANSACTION_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstTransactionEvent(Boolean firstTransactionEvent) {
    this.firstTransactionEvent = firstTransactionEvent;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject access(List<String> access) {
    this.access = access;
    return this;
  }

  public RetrieveMonitorsForAnOrganization200ResponseInnerProject addAccessItem(String accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<>();
    }
    this.access.add(accessItem);
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAccess() {
    return access;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccess(List<String> access) {
    this.access = access;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject hasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

   /**
   * Get hasAccess
   * @return hasAccess
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasAccess() {
    return hasAccess;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject hasMinifiedStackTrace(Boolean hasMinifiedStackTrace) {
    this.hasMinifiedStackTrace = hasMinifiedStackTrace;
    return this;
  }

   /**
   * Get hasMinifiedStackTrace
   * @return hasMinifiedStackTrace
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_MINIFIED_STACK_TRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasMinifiedStackTrace() {
    return hasMinifiedStackTrace;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MINIFIED_STACK_TRACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasMinifiedStackTrace(Boolean hasMinifiedStackTrace) {
    this.hasMinifiedStackTrace = hasMinifiedStackTrace;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject hasMonitors(Boolean hasMonitors) {
    this.hasMonitors = hasMonitors;
    return this;
  }

   /**
   * Get hasMonitors
   * @return hasMonitors
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_MONITORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasMonitors() {
    return hasMonitors;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MONITORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasMonitors(Boolean hasMonitors) {
    this.hasMonitors = hasMonitors;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject hasProfiles(Boolean hasProfiles) {
    this.hasProfiles = hasProfiles;
    return this;
  }

   /**
   * Get hasProfiles
   * @return hasProfiles
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_PROFILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasProfiles() {
    return hasProfiles;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PROFILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasProfiles(Boolean hasProfiles) {
    this.hasProfiles = hasProfiles;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject hasReplays(Boolean hasReplays) {
    this.hasReplays = hasReplays;
    return this;
  }

   /**
   * Get hasReplays
   * @return hasReplays
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_REPLAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasReplays() {
    return hasReplays;
  }


  @JsonProperty(JSON_PROPERTY_HAS_REPLAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasReplays(Boolean hasReplays) {
    this.hasReplays = hasReplays;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject hasSessions(Boolean hasSessions) {
    this.hasSessions = hasSessions;
    return this;
  }

   /**
   * Get hasSessions
   * @return hasSessions
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasSessions() {
    return hasSessions;
  }


  @JsonProperty(JSON_PROPERTY_HAS_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasSessions(Boolean hasSessions) {
    this.hasSessions = hasSessions;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject isInternal(Boolean isInternal) {
    this.isInternal = isInternal;
    return this;
  }

   /**
   * Get isInternal
   * @return isInternal
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsInternal() {
    return isInternal;
  }


  @JsonProperty(JSON_PROPERTY_IS_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsInternal(Boolean isInternal) {
    this.isInternal = isInternal;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject isPublic(Boolean isPublic) {
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


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject avatar(Object avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatar(Object avatar) {
    this.avatar = avatar;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setColor(String color) {
    this.color = color;
  }


  public RetrieveMonitorsForAnOrganization200ResponseInnerProject status(String status) {
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

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this Retrieve_monitors_for_an_organization_200_response_inner_project object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveMonitorsForAnOrganization200ResponseInnerProject retrieveMonitorsForAnOrganization200ResponseInnerProject = (RetrieveMonitorsForAnOrganization200ResponseInnerProject) o;
    return equalsNullable(this.stats, retrieveMonitorsForAnOrganization200ResponseInnerProject.stats) &&
        equalsNullable(this.transactionStats, retrieveMonitorsForAnOrganization200ResponseInnerProject.transactionStats) &&
        equalsNullable(this.sessionStats, retrieveMonitorsForAnOrganization200ResponseInnerProject.sessionStats) &&
        Objects.equals(this.id, retrieveMonitorsForAnOrganization200ResponseInnerProject.id) &&
        Objects.equals(this.slug, retrieveMonitorsForAnOrganization200ResponseInnerProject.slug) &&
        Objects.equals(this.name, retrieveMonitorsForAnOrganization200ResponseInnerProject.name) &&
        Objects.equals(this.platform, retrieveMonitorsForAnOrganization200ResponseInnerProject.platform) &&
        Objects.equals(this.dateCreated, retrieveMonitorsForAnOrganization200ResponseInnerProject.dateCreated) &&
        Objects.equals(this.isBookmarked, retrieveMonitorsForAnOrganization200ResponseInnerProject.isBookmarked) &&
        Objects.equals(this.isMember, retrieveMonitorsForAnOrganization200ResponseInnerProject.isMember) &&
        Objects.equals(this.features, retrieveMonitorsForAnOrganization200ResponseInnerProject.features) &&
        Objects.equals(this.firstEvent, retrieveMonitorsForAnOrganization200ResponseInnerProject.firstEvent) &&
        Objects.equals(this.firstTransactionEvent, retrieveMonitorsForAnOrganization200ResponseInnerProject.firstTransactionEvent) &&
        Objects.equals(this.access, retrieveMonitorsForAnOrganization200ResponseInnerProject.access) &&
        Objects.equals(this.hasAccess, retrieveMonitorsForAnOrganization200ResponseInnerProject.hasAccess) &&
        Objects.equals(this.hasMinifiedStackTrace, retrieveMonitorsForAnOrganization200ResponseInnerProject.hasMinifiedStackTrace) &&
        Objects.equals(this.hasMonitors, retrieveMonitorsForAnOrganization200ResponseInnerProject.hasMonitors) &&
        Objects.equals(this.hasProfiles, retrieveMonitorsForAnOrganization200ResponseInnerProject.hasProfiles) &&
        Objects.equals(this.hasReplays, retrieveMonitorsForAnOrganization200ResponseInnerProject.hasReplays) &&
        Objects.equals(this.hasSessions, retrieveMonitorsForAnOrganization200ResponseInnerProject.hasSessions) &&
        Objects.equals(this.isInternal, retrieveMonitorsForAnOrganization200ResponseInnerProject.isInternal) &&
        Objects.equals(this.isPublic, retrieveMonitorsForAnOrganization200ResponseInnerProject.isPublic) &&
        Objects.equals(this.avatar, retrieveMonitorsForAnOrganization200ResponseInnerProject.avatar) &&
        Objects.equals(this.color, retrieveMonitorsForAnOrganization200ResponseInnerProject.color) &&
        Objects.equals(this.status, retrieveMonitorsForAnOrganization200ResponseInnerProject.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(stats), hashCodeNullable(transactionStats), hashCodeNullable(sessionStats), id, slug, name, platform, dateCreated, isBookmarked, isMember, features, firstEvent, firstTransactionEvent, access, hasAccess, hasMinifiedStackTrace, hasMonitors, hasProfiles, hasReplays, hasSessions, isInternal, isPublic, avatar, color, status);
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
    sb.append("class RetrieveMonitorsForAnOrganization200ResponseInnerProject {\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    transactionStats: ").append(toIndentedString(transactionStats)).append("\n");
    sb.append("    sessionStats: ").append(toIndentedString(sessionStats)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    isBookmarked: ").append(toIndentedString(isBookmarked)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    firstEvent: ").append(toIndentedString(firstEvent)).append("\n");
    sb.append("    firstTransactionEvent: ").append(toIndentedString(firstTransactionEvent)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    hasMinifiedStackTrace: ").append(toIndentedString(hasMinifiedStackTrace)).append("\n");
    sb.append("    hasMonitors: ").append(toIndentedString(hasMonitors)).append("\n");
    sb.append("    hasProfiles: ").append(toIndentedString(hasProfiles)).append("\n");
    sb.append("    hasReplays: ").append(toIndentedString(hasReplays)).append("\n");
    sb.append("    hasSessions: ").append(toIndentedString(hasSessions)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

