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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAProject200ResponseOptions
 */
@JsonPropertyOrder({
  RetrieveAProject200ResponseOptions.JSON_PROPERTY_FEEDBACK_COLON_BRANDING,
  RetrieveAProject200ResponseOptions.JSON_PROPERTY_FILTERS_COLON_BLACKLISTED_IPS,
  RetrieveAProject200ResponseOptions.JSON_PROPERTY_FILTERS_COLON_ERROR_MESSAGES,
  RetrieveAProject200ResponseOptions.JSON_PROPERTY_FILTERS_COLON_RELEASES,
  RetrieveAProject200ResponseOptions.JSON_PROPERTY_SENTRY_COLON_CSP_IGNORED_SOURCES,
  RetrieveAProject200ResponseOptions.JSON_PROPERTY_SENTRY_COLON_CSP_IGNORED_SOURCES_DEFAULTS,
  RetrieveAProject200ResponseOptions.JSON_PROPERTY_SENTRY_COLON_REPROCESSING_ACTIVE
})
@JsonTypeName("Retrieve_a_Project_200_response_options")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class RetrieveAProject200ResponseOptions {
  public static final String JSON_PROPERTY_FEEDBACK_COLON_BRANDING = "feedback:branding";
  private Boolean feedbackColonBranding;

  public static final String JSON_PROPERTY_FILTERS_COLON_BLACKLISTED_IPS = "filters:blacklisted_ips";
  private String filtersColonBlacklistedIps;

  public static final String JSON_PROPERTY_FILTERS_COLON_ERROR_MESSAGES = "filters:error_messages";
  private String filtersColonErrorMessages;

  public static final String JSON_PROPERTY_FILTERS_COLON_RELEASES = "filters:releases";
  private String filtersColonReleases;

  public static final String JSON_PROPERTY_SENTRY_COLON_CSP_IGNORED_SOURCES = "sentry:csp_ignored_sources";
  private String sentryColonCspIgnoredSources;

  public static final String JSON_PROPERTY_SENTRY_COLON_CSP_IGNORED_SOURCES_DEFAULTS = "sentry:csp_ignored_sources_defaults";
  private Boolean sentryColonCspIgnoredSourcesDefaults;

  public static final String JSON_PROPERTY_SENTRY_COLON_REPROCESSING_ACTIVE = "sentry:reprocessing_active";
  private Boolean sentryColonReprocessingActive;

  public RetrieveAProject200ResponseOptions() { 
  }

  public RetrieveAProject200ResponseOptions feedbackColonBranding(Boolean feedbackColonBranding) {
    this.feedbackColonBranding = feedbackColonBranding;
    return this;
  }

   /**
   * Get feedbackColonBranding
   * @return feedbackColonBranding
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK_COLON_BRANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFeedbackColonBranding() {
    return feedbackColonBranding;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK_COLON_BRANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbackColonBranding(Boolean feedbackColonBranding) {
    this.feedbackColonBranding = feedbackColonBranding;
  }


  public RetrieveAProject200ResponseOptions filtersColonBlacklistedIps(String filtersColonBlacklistedIps) {
    this.filtersColonBlacklistedIps = filtersColonBlacklistedIps;
    return this;
  }

   /**
   * Get filtersColonBlacklistedIps
   * @return filtersColonBlacklistedIps
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS_COLON_BLACKLISTED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiltersColonBlacklistedIps() {
    return filtersColonBlacklistedIps;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS_COLON_BLACKLISTED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiltersColonBlacklistedIps(String filtersColonBlacklistedIps) {
    this.filtersColonBlacklistedIps = filtersColonBlacklistedIps;
  }


  public RetrieveAProject200ResponseOptions filtersColonErrorMessages(String filtersColonErrorMessages) {
    this.filtersColonErrorMessages = filtersColonErrorMessages;
    return this;
  }

   /**
   * Get filtersColonErrorMessages
   * @return filtersColonErrorMessages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS_COLON_ERROR_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiltersColonErrorMessages() {
    return filtersColonErrorMessages;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS_COLON_ERROR_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiltersColonErrorMessages(String filtersColonErrorMessages) {
    this.filtersColonErrorMessages = filtersColonErrorMessages;
  }


  public RetrieveAProject200ResponseOptions filtersColonReleases(String filtersColonReleases) {
    this.filtersColonReleases = filtersColonReleases;
    return this;
  }

   /**
   * Get filtersColonReleases
   * @return filtersColonReleases
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS_COLON_RELEASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiltersColonReleases() {
    return filtersColonReleases;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS_COLON_RELEASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiltersColonReleases(String filtersColonReleases) {
    this.filtersColonReleases = filtersColonReleases;
  }


  public RetrieveAProject200ResponseOptions sentryColonCspIgnoredSources(String sentryColonCspIgnoredSources) {
    this.sentryColonCspIgnoredSources = sentryColonCspIgnoredSources;
    return this;
  }

   /**
   * Get sentryColonCspIgnoredSources
   * @return sentryColonCspIgnoredSources
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENTRY_COLON_CSP_IGNORED_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSentryColonCspIgnoredSources() {
    return sentryColonCspIgnoredSources;
  }


  @JsonProperty(JSON_PROPERTY_SENTRY_COLON_CSP_IGNORED_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentryColonCspIgnoredSources(String sentryColonCspIgnoredSources) {
    this.sentryColonCspIgnoredSources = sentryColonCspIgnoredSources;
  }


  public RetrieveAProject200ResponseOptions sentryColonCspIgnoredSourcesDefaults(Boolean sentryColonCspIgnoredSourcesDefaults) {
    this.sentryColonCspIgnoredSourcesDefaults = sentryColonCspIgnoredSourcesDefaults;
    return this;
  }

   /**
   * Get sentryColonCspIgnoredSourcesDefaults
   * @return sentryColonCspIgnoredSourcesDefaults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENTRY_COLON_CSP_IGNORED_SOURCES_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSentryColonCspIgnoredSourcesDefaults() {
    return sentryColonCspIgnoredSourcesDefaults;
  }


  @JsonProperty(JSON_PROPERTY_SENTRY_COLON_CSP_IGNORED_SOURCES_DEFAULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentryColonCspIgnoredSourcesDefaults(Boolean sentryColonCspIgnoredSourcesDefaults) {
    this.sentryColonCspIgnoredSourcesDefaults = sentryColonCspIgnoredSourcesDefaults;
  }


  public RetrieveAProject200ResponseOptions sentryColonReprocessingActive(Boolean sentryColonReprocessingActive) {
    this.sentryColonReprocessingActive = sentryColonReprocessingActive;
    return this;
  }

   /**
   * Get sentryColonReprocessingActive
   * @return sentryColonReprocessingActive
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENTRY_COLON_REPROCESSING_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSentryColonReprocessingActive() {
    return sentryColonReprocessingActive;
  }


  @JsonProperty(JSON_PROPERTY_SENTRY_COLON_REPROCESSING_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentryColonReprocessingActive(Boolean sentryColonReprocessingActive) {
    this.sentryColonReprocessingActive = sentryColonReprocessingActive;
  }


  /**
   * Return true if this Retrieve_a_Project_200_response_options object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAProject200ResponseOptions retrieveAProject200ResponseOptions = (RetrieveAProject200ResponseOptions) o;
    return Objects.equals(this.feedbackColonBranding, retrieveAProject200ResponseOptions.feedbackColonBranding) &&
        Objects.equals(this.filtersColonBlacklistedIps, retrieveAProject200ResponseOptions.filtersColonBlacklistedIps) &&
        Objects.equals(this.filtersColonErrorMessages, retrieveAProject200ResponseOptions.filtersColonErrorMessages) &&
        Objects.equals(this.filtersColonReleases, retrieveAProject200ResponseOptions.filtersColonReleases) &&
        Objects.equals(this.sentryColonCspIgnoredSources, retrieveAProject200ResponseOptions.sentryColonCspIgnoredSources) &&
        Objects.equals(this.sentryColonCspIgnoredSourcesDefaults, retrieveAProject200ResponseOptions.sentryColonCspIgnoredSourcesDefaults) &&
        Objects.equals(this.sentryColonReprocessingActive, retrieveAProject200ResponseOptions.sentryColonReprocessingActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackColonBranding, filtersColonBlacklistedIps, filtersColonErrorMessages, filtersColonReleases, sentryColonCspIgnoredSources, sentryColonCspIgnoredSourcesDefaults, sentryColonReprocessingActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAProject200ResponseOptions {\n");
    sb.append("    feedbackColonBranding: ").append(toIndentedString(feedbackColonBranding)).append("\n");
    sb.append("    filtersColonBlacklistedIps: ").append(toIndentedString(filtersColonBlacklistedIps)).append("\n");
    sb.append("    filtersColonErrorMessages: ").append(toIndentedString(filtersColonErrorMessages)).append("\n");
    sb.append("    filtersColonReleases: ").append(toIndentedString(filtersColonReleases)).append("\n");
    sb.append("    sentryColonCspIgnoredSources: ").append(toIndentedString(sentryColonCspIgnoredSources)).append("\n");
    sb.append("    sentryColonCspIgnoredSourcesDefaults: ").append(toIndentedString(sentryColonCspIgnoredSourcesDefaults)).append("\n");
    sb.append("    sentryColonReprocessingActive: ").append(toIndentedString(sentryColonReprocessingActive)).append("\n");
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

