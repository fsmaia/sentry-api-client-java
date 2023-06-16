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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventContextSession;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEventContext
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventContext.JSON_PROPERTY_LENGTH,
  ResolveAnEventID200ResponseEventContext.JSON_PROPERTY_RESULTS,
  ResolveAnEventID200ResponseEventContext.JSON_PROPERTY_SESSION,
  ResolveAnEventID200ResponseEventContext.JSON_PROPERTY_UNAUTHORIZED,
  ResolveAnEventID200ResponseEventContext.JSON_PROPERTY_URL
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_context")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventContext {
  public static final String JSON_PROPERTY_LENGTH = "length";
  private Integer length;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Integer> results;

  public static final String JSON_PROPERTY_SESSION = "session";
  private ResolveAnEventID200ResponseEventContextSession session;

  public static final String JSON_PROPERTY_UNAUTHORIZED = "unauthorized";
  private Boolean unauthorized;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public ResolveAnEventID200ResponseEventContext() { 
  }

  public ResolveAnEventID200ResponseEventContext length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(Integer length) {
    this.length = length;
  }


  public ResolveAnEventID200ResponseEventContext results(List<Integer> results) {
    this.results = results;
    return this;
  }

  public ResolveAnEventID200ResponseEventContext addResultsItem(Integer resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<Integer> results) {
    this.results = results;
  }


  public ResolveAnEventID200ResponseEventContext session(ResolveAnEventID200ResponseEventContextSession session) {
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolveAnEventID200ResponseEventContextSession getSession() {
    return session;
  }


  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSession(ResolveAnEventID200ResponseEventContextSession session) {
    this.session = session;
  }


  public ResolveAnEventID200ResponseEventContext unauthorized(Boolean unauthorized) {
    this.unauthorized = unauthorized;
    return this;
  }

   /**
   * Get unauthorized
   * @return unauthorized
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNAUTHORIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUnauthorized() {
    return unauthorized;
  }


  @JsonProperty(JSON_PROPERTY_UNAUTHORIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnauthorized(Boolean unauthorized) {
    this.unauthorized = unauthorized;
  }


  public ResolveAnEventID200ResponseEventContext url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_context object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventContext resolveAnEventID200ResponseEventContext = (ResolveAnEventID200ResponseEventContext) o;
    return Objects.equals(this.length, resolveAnEventID200ResponseEventContext.length) &&
        Objects.equals(this.results, resolveAnEventID200ResponseEventContext.results) &&
        Objects.equals(this.session, resolveAnEventID200ResponseEventContext.session) &&
        Objects.equals(this.unauthorized, resolveAnEventID200ResponseEventContext.unauthorized) &&
        Objects.equals(this.url, resolveAnEventID200ResponseEventContext.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, results, session, unauthorized, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventContext {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    unauthorized: ").append(toIndentedString(unauthorized)).append("\n");
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

