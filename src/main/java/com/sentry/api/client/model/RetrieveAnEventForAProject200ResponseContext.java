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
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseContextResp;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnEventForAProject200ResponseContext
 */
@JsonPropertyOrder({
  RetrieveAnEventForAProject200ResponseContext.JSON_PROPERTY_RESP,
  RetrieveAnEventForAProject200ResponseContext.JSON_PROPERTY_SESSION,
  RetrieveAnEventForAProject200ResponseContext.JSON_PROPERTY_UNAUTHORIZED,
  RetrieveAnEventForAProject200ResponseContext.JSON_PROPERTY_URL
})
@JsonTypeName("Retrieve_an_Event_for_a_Project_200_response_context")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveAnEventForAProject200ResponseContext {
  public static final String JSON_PROPERTY_RESP = "resp";
  private RetrieveAnEventForAProject200ResponseContextResp resp;

  public static final String JSON_PROPERTY_SESSION = "session";
  private ResolveAnEventID200ResponseEventContextSession session;

  public static final String JSON_PROPERTY_UNAUTHORIZED = "unauthorized";
  private Boolean unauthorized;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public RetrieveAnEventForAProject200ResponseContext() { 
  }

  public RetrieveAnEventForAProject200ResponseContext resp(RetrieveAnEventForAProject200ResponseContextResp resp) {
    this.resp = resp;
    return this;
  }

   /**
   * Get resp
   * @return resp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetrieveAnEventForAProject200ResponseContextResp getResp() {
    return resp;
  }


  @JsonProperty(JSON_PROPERTY_RESP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResp(RetrieveAnEventForAProject200ResponseContextResp resp) {
    this.resp = resp;
  }


  public RetrieveAnEventForAProject200ResponseContext session(ResolveAnEventID200ResponseEventContextSession session) {
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


  public RetrieveAnEventForAProject200ResponseContext unauthorized(Boolean unauthorized) {
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


  public RetrieveAnEventForAProject200ResponseContext url(String url) {
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
   * Return true if this Retrieve_an_Event_for_a_Project_200_response_context object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnEventForAProject200ResponseContext retrieveAnEventForAProject200ResponseContext = (RetrieveAnEventForAProject200ResponseContext) o;
    return Objects.equals(this.resp, retrieveAnEventForAProject200ResponseContext.resp) &&
        Objects.equals(this.session, retrieveAnEventForAProject200ResponseContext.session) &&
        Objects.equals(this.unauthorized, retrieveAnEventForAProject200ResponseContext.unauthorized) &&
        Objects.equals(this.url, retrieveAnEventForAProject200ResponseContext.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resp, session, unauthorized, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnEventForAProject200ResponseContext {\n");
    sb.append("    resp: ").append(toIndentedString(resp)).append("\n");
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

