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
import com.sentry.api.client.model.RetrieveATeam200ResponseAvatar;
import com.sentry.api.client.model.RetrieveAnOrganization200ResponseAvailableRolesInner;
import com.sentry.api.client.model.RetrieveAnOrganization200ResponseOnboardingTasksInner;
import com.sentry.api.client.model.RetrieveAnOrganization200ResponseProjectsInner;
import com.sentry.api.client.model.RetrieveAnOrganization200ResponseQuota;
import com.sentry.api.client.model.UpdateATeam200Response;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnOrganization200Response
 */
@JsonPropertyOrder({
  RetrieveAnOrganization200Response.JSON_PROPERTY_ACCESS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_ALLOW_SHARED_ISSUES,
  RetrieveAnOrganization200Response.JSON_PROPERTY_AVAILABLE_ROLES,
  RetrieveAnOrganization200Response.JSON_PROPERTY_AVATAR,
  RetrieveAnOrganization200Response.JSON_PROPERTY_DATA_SCRUBBER,
  RetrieveAnOrganization200Response.JSON_PROPERTY_DATA_SCRUBBER_DEFAULTS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_DATE_CREATED,
  RetrieveAnOrganization200Response.JSON_PROPERTY_DEFAULT_ROLE,
  RetrieveAnOrganization200Response.JSON_PROPERTY_ENHANCED_PRIVACY,
  RetrieveAnOrganization200Response.JSON_PROPERTY_EXPERIMENTS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_FEATURES,
  RetrieveAnOrganization200Response.JSON_PROPERTY_ID,
  RetrieveAnOrganization200Response.JSON_PROPERTY_IS_DEFAULT,
  RetrieveAnOrganization200Response.JSON_PROPERTY_IS_EARLY_ADOPTER,
  RetrieveAnOrganization200Response.JSON_PROPERTY_NAME,
  RetrieveAnOrganization200Response.JSON_PROPERTY_ONBOARDING_TASKS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_OPEN_MEMBERSHIP,
  RetrieveAnOrganization200Response.JSON_PROPERTY_PENDING_ACCESS_REQUESTS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_PROJECTS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_QUOTA,
  RetrieveAnOrganization200Response.JSON_PROPERTY_REQUIRE2_F_A,
  RetrieveAnOrganization200Response.JSON_PROPERTY_SAFE_FIELDS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_SCRAPE_JAVA_SCRIPT,
  RetrieveAnOrganization200Response.JSON_PROPERTY_SCRUB_I_P_ADDRESSES,
  RetrieveAnOrganization200Response.JSON_PROPERTY_SENSITIVE_FIELDS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_SLUG,
  RetrieveAnOrganization200Response.JSON_PROPERTY_STATUS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_STORE_CRASH_REPORTS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_TEAMS,
  RetrieveAnOrganization200Response.JSON_PROPERTY_TRUSTED_RELAYS
})
@JsonTypeName("Retrieve_an_Organization_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveAnOrganization200Response {
  public static final String JSON_PROPERTY_ACCESS = "access";
  private List<String> access = new ArrayList<>();

  public static final String JSON_PROPERTY_ALLOW_SHARED_ISSUES = "allowSharedIssues";
  private Boolean allowSharedIssues;

  public static final String JSON_PROPERTY_AVAILABLE_ROLES = "availableRoles";
  private List<RetrieveAnOrganization200ResponseAvailableRolesInner> availableRoles = new ArrayList<>();

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private RetrieveATeam200ResponseAvatar avatar;

  public static final String JSON_PROPERTY_DATA_SCRUBBER = "dataScrubber";
  private Boolean dataScrubber;

  public static final String JSON_PROPERTY_DATA_SCRUBBER_DEFAULTS = "dataScrubberDefaults";
  private Boolean dataScrubberDefaults;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DEFAULT_ROLE = "defaultRole";
  private String defaultRole;

  public static final String JSON_PROPERTY_ENHANCED_PRIVACY = "enhancedPrivacy";
  private Boolean enhancedPrivacy;

  public static final String JSON_PROPERTY_EXPERIMENTS = "experiments";
  private Object experiments;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<String> features = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_IS_EARLY_ADOPTER = "isEarlyAdopter";
  private Boolean isEarlyAdopter;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ONBOARDING_TASKS = "onboardingTasks";
  private List<RetrieveAnOrganization200ResponseOnboardingTasksInner> onboardingTasks = new ArrayList<>();

  public static final String JSON_PROPERTY_OPEN_MEMBERSHIP = "openMembership";
  private Boolean openMembership;

  public static final String JSON_PROPERTY_PENDING_ACCESS_REQUESTS = "pendingAccessRequests";
  private Long pendingAccessRequests;

  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private List<RetrieveAnOrganization200ResponseProjectsInner> projects = new ArrayList<>();

  public static final String JSON_PROPERTY_QUOTA = "quota";
  private RetrieveAnOrganization200ResponseQuota quota;

  public static final String JSON_PROPERTY_REQUIRE2_F_A = "require2FA";
  private Boolean require2FA;

  public static final String JSON_PROPERTY_SAFE_FIELDS = "safeFields";
  private List<String> safeFields = new ArrayList<>();

  public static final String JSON_PROPERTY_SCRAPE_JAVA_SCRIPT = "scrapeJavaScript";
  private Boolean scrapeJavaScript;

  public static final String JSON_PROPERTY_SCRUB_I_P_ADDRESSES = "scrubIPAddresses";
  private Boolean scrubIPAddresses;

  public static final String JSON_PROPERTY_SENSITIVE_FIELDS = "sensitiveFields";
  private List<String> sensitiveFields = new ArrayList<>();

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RetrieveAnOrganization200ResponseAvailableRolesInner status;

  public static final String JSON_PROPERTY_STORE_CRASH_REPORTS = "storeCrashReports";
  private Long storeCrashReports;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<UpdateATeam200Response> teams = new ArrayList<>();

  public static final String JSON_PROPERTY_TRUSTED_RELAYS = "trustedRelays";
  private List<String> trustedRelays = new ArrayList<>();

  public RetrieveAnOrganization200Response() { 
  }

  public RetrieveAnOrganization200Response access(List<String> access) {
    this.access = access;
    return this;
  }

  public RetrieveAnOrganization200Response addAccessItem(String accessItem) {
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


  public RetrieveAnOrganization200Response allowSharedIssues(Boolean allowSharedIssues) {
    this.allowSharedIssues = allowSharedIssues;
    return this;
  }

   /**
   * Get allowSharedIssues
   * @return allowSharedIssues
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOW_SHARED_ISSUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAllowSharedIssues() {
    return allowSharedIssues;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_SHARED_ISSUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowSharedIssues(Boolean allowSharedIssues) {
    this.allowSharedIssues = allowSharedIssues;
  }


  public RetrieveAnOrganization200Response availableRoles(List<RetrieveAnOrganization200ResponseAvailableRolesInner> availableRoles) {
    this.availableRoles = availableRoles;
    return this;
  }

  public RetrieveAnOrganization200Response addAvailableRolesItem(RetrieveAnOrganization200ResponseAvailableRolesInner availableRolesItem) {
    if (this.availableRoles == null) {
      this.availableRoles = new ArrayList<>();
    }
    this.availableRoles.add(availableRolesItem);
    return this;
  }

   /**
   * Get availableRoles
   * @return availableRoles
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVAILABLE_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnOrganization200ResponseAvailableRolesInner> getAvailableRoles() {
    return availableRoles;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailableRoles(List<RetrieveAnOrganization200ResponseAvailableRolesInner> availableRoles) {
    this.availableRoles = availableRoles;
  }


  public RetrieveAnOrganization200Response avatar(RetrieveATeam200ResponseAvatar avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveATeam200ResponseAvatar getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatar(RetrieveATeam200ResponseAvatar avatar) {
    this.avatar = avatar;
  }


  public RetrieveAnOrganization200Response dataScrubber(Boolean dataScrubber) {
    this.dataScrubber = dataScrubber;
    return this;
  }

   /**
   * Get dataScrubber
   * @return dataScrubber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA_SCRUBBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDataScrubber() {
    return dataScrubber;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SCRUBBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataScrubber(Boolean dataScrubber) {
    this.dataScrubber = dataScrubber;
  }


  public RetrieveAnOrganization200Response dataScrubberDefaults(Boolean dataScrubberDefaults) {
    this.dataScrubberDefaults = dataScrubberDefaults;
    return this;
  }

   /**
   * Get dataScrubberDefaults
   * @return dataScrubberDefaults
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA_SCRUBBER_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDataScrubberDefaults() {
    return dataScrubberDefaults;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SCRUBBER_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataScrubberDefaults(Boolean dataScrubberDefaults) {
    this.dataScrubberDefaults = dataScrubberDefaults;
  }


  public RetrieveAnOrganization200Response dateCreated(OffsetDateTime dateCreated) {
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


  public RetrieveAnOrganization200Response defaultRole(String defaultRole) {
    this.defaultRole = defaultRole;
    return this;
  }

   /**
   * Get defaultRole
   * @return defaultRole
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEFAULT_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDefaultRole() {
    return defaultRole;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultRole(String defaultRole) {
    this.defaultRole = defaultRole;
  }


  public RetrieveAnOrganization200Response enhancedPrivacy(Boolean enhancedPrivacy) {
    this.enhancedPrivacy = enhancedPrivacy;
    return this;
  }

   /**
   * Get enhancedPrivacy
   * @return enhancedPrivacy
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENHANCED_PRIVACY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnhancedPrivacy() {
    return enhancedPrivacy;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_PRIVACY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnhancedPrivacy(Boolean enhancedPrivacy) {
    this.enhancedPrivacy = enhancedPrivacy;
  }


  public RetrieveAnOrganization200Response experiments(Object experiments) {
    this.experiments = experiments;
    return this;
  }

   /**
   * Get experiments
   * @return experiments
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPERIMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getExperiments() {
    return experiments;
  }


  @JsonProperty(JSON_PROPERTY_EXPERIMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExperiments(Object experiments) {
    this.experiments = experiments;
  }


  public RetrieveAnOrganization200Response features(List<String> features) {
    this.features = features;
    return this;
  }

  public RetrieveAnOrganization200Response addFeaturesItem(String featuresItem) {
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


  public RetrieveAnOrganization200Response id(String id) {
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


  public RetrieveAnOrganization200Response isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public RetrieveAnOrganization200Response isEarlyAdopter(Boolean isEarlyAdopter) {
    this.isEarlyAdopter = isEarlyAdopter;
    return this;
  }

   /**
   * Get isEarlyAdopter
   * @return isEarlyAdopter
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_EARLY_ADOPTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsEarlyAdopter() {
    return isEarlyAdopter;
  }


  @JsonProperty(JSON_PROPERTY_IS_EARLY_ADOPTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsEarlyAdopter(Boolean isEarlyAdopter) {
    this.isEarlyAdopter = isEarlyAdopter;
  }


  public RetrieveAnOrganization200Response name(String name) {
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


  public RetrieveAnOrganization200Response onboardingTasks(List<RetrieveAnOrganization200ResponseOnboardingTasksInner> onboardingTasks) {
    this.onboardingTasks = onboardingTasks;
    return this;
  }

  public RetrieveAnOrganization200Response addOnboardingTasksItem(RetrieveAnOrganization200ResponseOnboardingTasksInner onboardingTasksItem) {
    if (this.onboardingTasks == null) {
      this.onboardingTasks = new ArrayList<>();
    }
    this.onboardingTasks.add(onboardingTasksItem);
    return this;
  }

   /**
   * Get onboardingTasks
   * @return onboardingTasks
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ONBOARDING_TASKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnOrganization200ResponseOnboardingTasksInner> getOnboardingTasks() {
    return onboardingTasks;
  }


  @JsonProperty(JSON_PROPERTY_ONBOARDING_TASKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnboardingTasks(List<RetrieveAnOrganization200ResponseOnboardingTasksInner> onboardingTasks) {
    this.onboardingTasks = onboardingTasks;
  }


  public RetrieveAnOrganization200Response openMembership(Boolean openMembership) {
    this.openMembership = openMembership;
    return this;
  }

   /**
   * Get openMembership
   * @return openMembership
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPEN_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getOpenMembership() {
    return openMembership;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenMembership(Boolean openMembership) {
    this.openMembership = openMembership;
  }


  public RetrieveAnOrganization200Response pendingAccessRequests(Long pendingAccessRequests) {
    this.pendingAccessRequests = pendingAccessRequests;
    return this;
  }

   /**
   * Get pendingAccessRequests
   * @return pendingAccessRequests
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PENDING_ACCESS_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPendingAccessRequests() {
    return pendingAccessRequests;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_ACCESS_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPendingAccessRequests(Long pendingAccessRequests) {
    this.pendingAccessRequests = pendingAccessRequests;
  }


  public RetrieveAnOrganization200Response projects(List<RetrieveAnOrganization200ResponseProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  public RetrieveAnOrganization200Response addProjectsItem(RetrieveAnOrganization200ResponseProjectsInner projectsItem) {
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

  public List<RetrieveAnOrganization200ResponseProjectsInner> getProjects() {
    return projects;
  }


  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjects(List<RetrieveAnOrganization200ResponseProjectsInner> projects) {
    this.projects = projects;
  }


  public RetrieveAnOrganization200Response quota(RetrieveAnOrganization200ResponseQuota quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnOrganization200ResponseQuota getQuota() {
    return quota;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuota(RetrieveAnOrganization200ResponseQuota quota) {
    this.quota = quota;
  }


  public RetrieveAnOrganization200Response require2FA(Boolean require2FA) {
    this.require2FA = require2FA;
    return this;
  }

   /**
   * Get require2FA
   * @return require2FA
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUIRE2_F_A)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRequire2FA() {
    return require2FA;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE2_F_A)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequire2FA(Boolean require2FA) {
    this.require2FA = require2FA;
  }


  public RetrieveAnOrganization200Response safeFields(List<String> safeFields) {
    this.safeFields = safeFields;
    return this;
  }

  public RetrieveAnOrganization200Response addSafeFieldsItem(String safeFieldsItem) {
    if (this.safeFields == null) {
      this.safeFields = new ArrayList<>();
    }
    this.safeFields.add(safeFieldsItem);
    return this;
  }

   /**
   * Get safeFields
   * @return safeFields
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SAFE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSafeFields() {
    return safeFields;
  }


  @JsonProperty(JSON_PROPERTY_SAFE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSafeFields(List<String> safeFields) {
    this.safeFields = safeFields;
  }


  public RetrieveAnOrganization200Response scrapeJavaScript(Boolean scrapeJavaScript) {
    this.scrapeJavaScript = scrapeJavaScript;
    return this;
  }

   /**
   * Get scrapeJavaScript
   * @return scrapeJavaScript
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCRAPE_JAVA_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getScrapeJavaScript() {
    return scrapeJavaScript;
  }


  @JsonProperty(JSON_PROPERTY_SCRAPE_JAVA_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScrapeJavaScript(Boolean scrapeJavaScript) {
    this.scrapeJavaScript = scrapeJavaScript;
  }


  public RetrieveAnOrganization200Response scrubIPAddresses(Boolean scrubIPAddresses) {
    this.scrubIPAddresses = scrubIPAddresses;
    return this;
  }

   /**
   * Get scrubIPAddresses
   * @return scrubIPAddresses
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCRUB_I_P_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getScrubIPAddresses() {
    return scrubIPAddresses;
  }


  @JsonProperty(JSON_PROPERTY_SCRUB_I_P_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScrubIPAddresses(Boolean scrubIPAddresses) {
    this.scrubIPAddresses = scrubIPAddresses;
  }


  public RetrieveAnOrganization200Response sensitiveFields(List<String> sensitiveFields) {
    this.sensitiveFields = sensitiveFields;
    return this;
  }

  public RetrieveAnOrganization200Response addSensitiveFieldsItem(String sensitiveFieldsItem) {
    if (this.sensitiveFields == null) {
      this.sensitiveFields = new ArrayList<>();
    }
    this.sensitiveFields.add(sensitiveFieldsItem);
    return this;
  }

   /**
   * Get sensitiveFields
   * @return sensitiveFields
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENSITIVE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSensitiveFields() {
    return sensitiveFields;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSensitiveFields(List<String> sensitiveFields) {
    this.sensitiveFields = sensitiveFields;
  }


  public RetrieveAnOrganization200Response slug(String slug) {
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


  public RetrieveAnOrganization200Response status(RetrieveAnOrganization200ResponseAvailableRolesInner status) {
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

  public RetrieveAnOrganization200ResponseAvailableRolesInner getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(RetrieveAnOrganization200ResponseAvailableRolesInner status) {
    this.status = status;
  }


  public RetrieveAnOrganization200Response storeCrashReports(Long storeCrashReports) {
    this.storeCrashReports = storeCrashReports;
    return this;
  }

   /**
   * Get storeCrashReports
   * @return storeCrashReports
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STORE_CRASH_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStoreCrashReports() {
    return storeCrashReports;
  }


  @JsonProperty(JSON_PROPERTY_STORE_CRASH_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStoreCrashReports(Long storeCrashReports) {
    this.storeCrashReports = storeCrashReports;
  }


  public RetrieveAnOrganization200Response teams(List<UpdateATeam200Response> teams) {
    this.teams = teams;
    return this;
  }

  public RetrieveAnOrganization200Response addTeamsItem(UpdateATeam200Response teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UpdateATeam200Response> getTeams() {
    return teams;
  }


  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeams(List<UpdateATeam200Response> teams) {
    this.teams = teams;
  }


  public RetrieveAnOrganization200Response trustedRelays(List<String> trustedRelays) {
    this.trustedRelays = trustedRelays;
    return this;
  }

  public RetrieveAnOrganization200Response addTrustedRelaysItem(String trustedRelaysItem) {
    if (this.trustedRelays == null) {
      this.trustedRelays = new ArrayList<>();
    }
    this.trustedRelays.add(trustedRelaysItem);
    return this;
  }

   /**
   * Get trustedRelays
   * @return trustedRelays
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRUSTED_RELAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTrustedRelays() {
    return trustedRelays;
  }


  @JsonProperty(JSON_PROPERTY_TRUSTED_RELAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrustedRelays(List<String> trustedRelays) {
    this.trustedRelays = trustedRelays;
  }


  /**
   * Return true if this Retrieve_an_Organization_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganization200Response retrieveAnOrganization200Response = (RetrieveAnOrganization200Response) o;
    return Objects.equals(this.access, retrieveAnOrganization200Response.access) &&
        Objects.equals(this.allowSharedIssues, retrieveAnOrganization200Response.allowSharedIssues) &&
        Objects.equals(this.availableRoles, retrieveAnOrganization200Response.availableRoles) &&
        Objects.equals(this.avatar, retrieveAnOrganization200Response.avatar) &&
        Objects.equals(this.dataScrubber, retrieveAnOrganization200Response.dataScrubber) &&
        Objects.equals(this.dataScrubberDefaults, retrieveAnOrganization200Response.dataScrubberDefaults) &&
        Objects.equals(this.dateCreated, retrieveAnOrganization200Response.dateCreated) &&
        Objects.equals(this.defaultRole, retrieveAnOrganization200Response.defaultRole) &&
        Objects.equals(this.enhancedPrivacy, retrieveAnOrganization200Response.enhancedPrivacy) &&
        Objects.equals(this.experiments, retrieveAnOrganization200Response.experiments) &&
        Objects.equals(this.features, retrieveAnOrganization200Response.features) &&
        Objects.equals(this.id, retrieveAnOrganization200Response.id) &&
        Objects.equals(this.isDefault, retrieveAnOrganization200Response.isDefault) &&
        Objects.equals(this.isEarlyAdopter, retrieveAnOrganization200Response.isEarlyAdopter) &&
        Objects.equals(this.name, retrieveAnOrganization200Response.name) &&
        Objects.equals(this.onboardingTasks, retrieveAnOrganization200Response.onboardingTasks) &&
        Objects.equals(this.openMembership, retrieveAnOrganization200Response.openMembership) &&
        Objects.equals(this.pendingAccessRequests, retrieveAnOrganization200Response.pendingAccessRequests) &&
        Objects.equals(this.projects, retrieveAnOrganization200Response.projects) &&
        Objects.equals(this.quota, retrieveAnOrganization200Response.quota) &&
        Objects.equals(this.require2FA, retrieveAnOrganization200Response.require2FA) &&
        Objects.equals(this.safeFields, retrieveAnOrganization200Response.safeFields) &&
        Objects.equals(this.scrapeJavaScript, retrieveAnOrganization200Response.scrapeJavaScript) &&
        Objects.equals(this.scrubIPAddresses, retrieveAnOrganization200Response.scrubIPAddresses) &&
        Objects.equals(this.sensitiveFields, retrieveAnOrganization200Response.sensitiveFields) &&
        Objects.equals(this.slug, retrieveAnOrganization200Response.slug) &&
        Objects.equals(this.status, retrieveAnOrganization200Response.status) &&
        Objects.equals(this.storeCrashReports, retrieveAnOrganization200Response.storeCrashReports) &&
        Objects.equals(this.teams, retrieveAnOrganization200Response.teams) &&
        Objects.equals(this.trustedRelays, retrieveAnOrganization200Response.trustedRelays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, allowSharedIssues, availableRoles, avatar, dataScrubber, dataScrubberDefaults, dateCreated, defaultRole, enhancedPrivacy, experiments, features, id, isDefault, isEarlyAdopter, name, onboardingTasks, openMembership, pendingAccessRequests, projects, quota, require2FA, safeFields, scrapeJavaScript, scrubIPAddresses, sensitiveFields, slug, status, storeCrashReports, teams, trustedRelays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganization200Response {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    allowSharedIssues: ").append(toIndentedString(allowSharedIssues)).append("\n");
    sb.append("    availableRoles: ").append(toIndentedString(availableRoles)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    dataScrubber: ").append(toIndentedString(dataScrubber)).append("\n");
    sb.append("    dataScrubberDefaults: ").append(toIndentedString(dataScrubberDefaults)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    defaultRole: ").append(toIndentedString(defaultRole)).append("\n");
    sb.append("    enhancedPrivacy: ").append(toIndentedString(enhancedPrivacy)).append("\n");
    sb.append("    experiments: ").append(toIndentedString(experiments)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isEarlyAdopter: ").append(toIndentedString(isEarlyAdopter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onboardingTasks: ").append(toIndentedString(onboardingTasks)).append("\n");
    sb.append("    openMembership: ").append(toIndentedString(openMembership)).append("\n");
    sb.append("    pendingAccessRequests: ").append(toIndentedString(pendingAccessRequests)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    require2FA: ").append(toIndentedString(require2FA)).append("\n");
    sb.append("    safeFields: ").append(toIndentedString(safeFields)).append("\n");
    sb.append("    scrapeJavaScript: ").append(toIndentedString(scrapeJavaScript)).append("\n");
    sb.append("    scrubIPAddresses: ").append(toIndentedString(scrubIPAddresses)).append("\n");
    sb.append("    sensitiveFields: ").append(toIndentedString(sensitiveFields)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeCrashReports: ").append(toIndentedString(storeCrashReports)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    trustedRelays: ").append(toIndentedString(trustedRelays)).append("\n");
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

