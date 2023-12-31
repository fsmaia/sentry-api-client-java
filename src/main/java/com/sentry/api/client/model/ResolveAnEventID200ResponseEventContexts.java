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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsBrowser;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsForbiddenError;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsOrganization;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextsTrace;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEventContexts
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventContexts.JSON_PROPERTY_FORBIDDEN_ERROR,
  ResolveAnEventID200ResponseEventContexts.JSON_PROPERTY_BROWSER,
  ResolveAnEventID200ResponseEventContexts.JSON_PROPERTY_OS,
  ResolveAnEventID200ResponseEventContexts.JSON_PROPERTY_TRACE,
  ResolveAnEventID200ResponseEventContexts.JSON_PROPERTY_ORGANIZATION
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_contexts")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventContexts {
  public static final String JSON_PROPERTY_FORBIDDEN_ERROR = "ForbiddenError";
  private ResolveAnEventID200ResponseEventContextsForbiddenError forbiddenError;

  public static final String JSON_PROPERTY_BROWSER = "browser";
  private ResolveAnEventID200ResponseEventContextsBrowser browser;

  public static final String JSON_PROPERTY_OS = "os";
  private ResolveAnEventID200ResponseEventContextsBrowser os;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private ResolveAnEventID200ResponseEventContextsTrace trace;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private ResolveAnEventID200ResponseEventContextsOrganization organization;

  public ResolveAnEventID200ResponseEventContexts() { 
  }

  public ResolveAnEventID200ResponseEventContexts forbiddenError(ResolveAnEventID200ResponseEventContextsForbiddenError forbiddenError) {
    this.forbiddenError = forbiddenError;
    return this;
  }

   /**
   * Get forbiddenError
   * @return forbiddenError
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORBIDDEN_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolveAnEventID200ResponseEventContextsForbiddenError getForbiddenError() {
    return forbiddenError;
  }


  @JsonProperty(JSON_PROPERTY_FORBIDDEN_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForbiddenError(ResolveAnEventID200ResponseEventContextsForbiddenError forbiddenError) {
    this.forbiddenError = forbiddenError;
  }


  public ResolveAnEventID200ResponseEventContexts browser(ResolveAnEventID200ResponseEventContextsBrowser browser) {
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolveAnEventID200ResponseEventContextsBrowser getBrowser() {
    return browser;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrowser(ResolveAnEventID200ResponseEventContextsBrowser browser) {
    this.browser = browser;
  }


  public ResolveAnEventID200ResponseEventContexts os(ResolveAnEventID200ResponseEventContextsBrowser os) {
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolveAnEventID200ResponseEventContextsBrowser getOs() {
    return os;
  }


  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOs(ResolveAnEventID200ResponseEventContextsBrowser os) {
    this.os = os;
  }


  public ResolveAnEventID200ResponseEventContexts trace(ResolveAnEventID200ResponseEventContextsTrace trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Get trace
   * @return trace
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolveAnEventID200ResponseEventContextsTrace getTrace() {
    return trace;
  }


  @JsonProperty(JSON_PROPERTY_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrace(ResolveAnEventID200ResponseEventContextsTrace trace) {
    this.trace = trace;
  }


  public ResolveAnEventID200ResponseEventContexts organization(ResolveAnEventID200ResponseEventContextsOrganization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolveAnEventID200ResponseEventContextsOrganization getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(ResolveAnEventID200ResponseEventContextsOrganization organization) {
    this.organization = organization;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_contexts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventContexts resolveAnEventID200ResponseEventContexts = (ResolveAnEventID200ResponseEventContexts) o;
    return Objects.equals(this.forbiddenError, resolveAnEventID200ResponseEventContexts.forbiddenError) &&
        Objects.equals(this.browser, resolveAnEventID200ResponseEventContexts.browser) &&
        Objects.equals(this.os, resolveAnEventID200ResponseEventContexts.os) &&
        Objects.equals(this.trace, resolveAnEventID200ResponseEventContexts.trace) &&
        Objects.equals(this.organization, resolveAnEventID200ResponseEventContexts.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forbiddenError, browser, os, trace, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventContexts {\n");
    sb.append("    forbiddenError: ").append(toIndentedString(forbiddenError)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

