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
 * ListAProjectSClientKeys200ResponseInnerDsn
 */
@JsonPropertyOrder({
  ListAProjectSClientKeys200ResponseInnerDsn.JSON_PROPERTY_CDN,
  ListAProjectSClientKeys200ResponseInnerDsn.JSON_PROPERTY_CSP,
  ListAProjectSClientKeys200ResponseInnerDsn.JSON_PROPERTY_MINIDUMP,
  ListAProjectSClientKeys200ResponseInnerDsn.JSON_PROPERTY_PUBLIC,
  ListAProjectSClientKeys200ResponseInnerDsn.JSON_PROPERTY_SECRET,
  ListAProjectSClientKeys200ResponseInnerDsn.JSON_PROPERTY_SECURITY
})
@JsonTypeName("List_a_Project_s_Client_Keys_200_response_inner_dsn")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ListAProjectSClientKeys200ResponseInnerDsn {
  public static final String JSON_PROPERTY_CDN = "cdn";
  private String cdn;

  public static final String JSON_PROPERTY_CSP = "csp";
  private String csp;

  public static final String JSON_PROPERTY_MINIDUMP = "minidump";
  private String minidump;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  private String _public;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  public static final String JSON_PROPERTY_SECURITY = "security";
  private String security;

  public ListAProjectSClientKeys200ResponseInnerDsn() { 
  }

  public ListAProjectSClientKeys200ResponseInnerDsn cdn(String cdn) {
    this.cdn = cdn;
    return this;
  }

   /**
   * Get cdn
   * @return cdn
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CDN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCdn() {
    return cdn;
  }


  @JsonProperty(JSON_PROPERTY_CDN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCdn(String cdn) {
    this.cdn = cdn;
  }


  public ListAProjectSClientKeys200ResponseInnerDsn csp(String csp) {
    this.csp = csp;
    return this;
  }

   /**
   * Get csp
   * @return csp
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CSP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCsp() {
    return csp;
  }


  @JsonProperty(JSON_PROPERTY_CSP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCsp(String csp) {
    this.csp = csp;
  }


  public ListAProjectSClientKeys200ResponseInnerDsn minidump(String minidump) {
    this.minidump = minidump;
    return this;
  }

   /**
   * Get minidump
   * @return minidump
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MINIDUMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMinidump() {
    return minidump;
  }


  @JsonProperty(JSON_PROPERTY_MINIDUMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinidump(String minidump) {
    this.minidump = minidump;
  }


  public ListAProjectSClientKeys200ResponseInnerDsn _public(String _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPublic() {
    return _public;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublic(String _public) {
    this._public = _public;
  }


  public ListAProjectSClientKeys200ResponseInnerDsn secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecret() {
    return secret;
  }


  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecret(String secret) {
    this.secret = secret;
  }


  public ListAProjectSClientKeys200ResponseInnerDsn security(String security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SECURITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecurity() {
    return security;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecurity(String security) {
    this.security = security;
  }


  /**
   * Return true if this List_a_Project_s_Client_Keys_200_response_inner_dsn object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSClientKeys200ResponseInnerDsn listAProjectSClientKeys200ResponseInnerDsn = (ListAProjectSClientKeys200ResponseInnerDsn) o;
    return Objects.equals(this.cdn, listAProjectSClientKeys200ResponseInnerDsn.cdn) &&
        Objects.equals(this.csp, listAProjectSClientKeys200ResponseInnerDsn.csp) &&
        Objects.equals(this.minidump, listAProjectSClientKeys200ResponseInnerDsn.minidump) &&
        Objects.equals(this._public, listAProjectSClientKeys200ResponseInnerDsn._public) &&
        Objects.equals(this.secret, listAProjectSClientKeys200ResponseInnerDsn.secret) &&
        Objects.equals(this.security, listAProjectSClientKeys200ResponseInnerDsn.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdn, csp, minidump, _public, secret, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSClientKeys200ResponseInnerDsn {\n");
    sb.append("    cdn: ").append(toIndentedString(cdn)).append("\n");
    sb.append("    csp: ").append(toIndentedString(csp)).append("\n");
    sb.append("    minidump: ").append(toIndentedString(minidump)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

