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
import com.sentry.api.client.model.ListAProjectSClientKeys200ResponseInnerBrowserSdk;
import com.sentry.api.client.model.ListAProjectSClientKeys200ResponseInnerDsn;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAProjectSClientKeys200ResponseInner
 */
@JsonPropertyOrder({
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_BROWSER_SDK,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_BROWSER_SDK_VERSION,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_DATE_CREATED,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_DSN,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_ID,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_IS_ACTIVE,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_LABEL,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_NAME,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_PROJECT_ID,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_PUBLIC,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_RATE_LIMIT,
  ListAProjectSClientKeys200ResponseInner.JSON_PROPERTY_SECRET
})
@JsonTypeName("List_a_Project_s_Client_Keys_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:23:11.909078Z[Etc/UTC]")
public class ListAProjectSClientKeys200ResponseInner {
  public static final String JSON_PROPERTY_BROWSER_SDK = "browserSdk";
  private ListAProjectSClientKeys200ResponseInnerBrowserSdk browserSdk;

  public static final String JSON_PROPERTY_BROWSER_SDK_VERSION = "browserSdkVersion";
  private String browserSdkVersion;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_DSN = "dsn";
  private ListAProjectSClientKeys200ResponseInnerDsn dsn;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  private Boolean isActive;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private Integer projectId;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  private String _public;

  public static final String JSON_PROPERTY_RATE_LIMIT = "rateLimit";
  private String rateLimit;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  public ListAProjectSClientKeys200ResponseInner() { 
  }

  public ListAProjectSClientKeys200ResponseInner browserSdk(ListAProjectSClientKeys200ResponseInnerBrowserSdk browserSdk) {
    this.browserSdk = browserSdk;
    return this;
  }

   /**
   * Get browserSdk
   * @return browserSdk
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BROWSER_SDK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListAProjectSClientKeys200ResponseInnerBrowserSdk getBrowserSdk() {
    return browserSdk;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER_SDK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrowserSdk(ListAProjectSClientKeys200ResponseInnerBrowserSdk browserSdk) {
    this.browserSdk = browserSdk;
  }


  public ListAProjectSClientKeys200ResponseInner browserSdkVersion(String browserSdkVersion) {
    this.browserSdkVersion = browserSdkVersion;
    return this;
  }

   /**
   * Get browserSdkVersion
   * @return browserSdkVersion
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BROWSER_SDK_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBrowserSdkVersion() {
    return browserSdkVersion;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER_SDK_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrowserSdkVersion(String browserSdkVersion) {
    this.browserSdkVersion = browserSdkVersion;
  }


  public ListAProjectSClientKeys200ResponseInner dateCreated(String dateCreated) {
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


  public ListAProjectSClientKeys200ResponseInner dsn(ListAProjectSClientKeys200ResponseInnerDsn dsn) {
    this.dsn = dsn;
    return this;
  }

   /**
   * Get dsn
   * @return dsn
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DSN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListAProjectSClientKeys200ResponseInnerDsn getDsn() {
    return dsn;
  }


  @JsonProperty(JSON_PROPERTY_DSN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDsn(ListAProjectSClientKeys200ResponseInnerDsn dsn) {
    this.dsn = dsn;
  }


  public ListAProjectSClientKeys200ResponseInner id(String id) {
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


  public ListAProjectSClientKeys200ResponseInner isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ListAProjectSClientKeys200ResponseInner label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(String label) {
    this.label = label;
  }


  public ListAProjectSClientKeys200ResponseInner name(String name) {
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


  public ListAProjectSClientKeys200ResponseInner projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }


  public ListAProjectSClientKeys200ResponseInner _public(String _public) {
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


  public ListAProjectSClientKeys200ResponseInner rateLimit(String rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

   /**
   * Get rateLimit
   * @return rateLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRateLimit() {
    return rateLimit;
  }


  @JsonProperty(JSON_PROPERTY_RATE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRateLimit(String rateLimit) {
    this.rateLimit = rateLimit;
  }


  public ListAProjectSClientKeys200ResponseInner secret(String secret) {
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


  /**
   * Return true if this List_a_Project_s_Client_Keys_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSClientKeys200ResponseInner listAProjectSClientKeys200ResponseInner = (ListAProjectSClientKeys200ResponseInner) o;
    return Objects.equals(this.browserSdk, listAProjectSClientKeys200ResponseInner.browserSdk) &&
        Objects.equals(this.browserSdkVersion, listAProjectSClientKeys200ResponseInner.browserSdkVersion) &&
        Objects.equals(this.dateCreated, listAProjectSClientKeys200ResponseInner.dateCreated) &&
        Objects.equals(this.dsn, listAProjectSClientKeys200ResponseInner.dsn) &&
        Objects.equals(this.id, listAProjectSClientKeys200ResponseInner.id) &&
        Objects.equals(this.isActive, listAProjectSClientKeys200ResponseInner.isActive) &&
        Objects.equals(this.label, listAProjectSClientKeys200ResponseInner.label) &&
        Objects.equals(this.name, listAProjectSClientKeys200ResponseInner.name) &&
        Objects.equals(this.projectId, listAProjectSClientKeys200ResponseInner.projectId) &&
        Objects.equals(this._public, listAProjectSClientKeys200ResponseInner._public) &&
        Objects.equals(this.rateLimit, listAProjectSClientKeys200ResponseInner.rateLimit) &&
        Objects.equals(this.secret, listAProjectSClientKeys200ResponseInner.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserSdk, browserSdkVersion, dateCreated, dsn, id, isActive, label, name, projectId, _public, rateLimit, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSClientKeys200ResponseInner {\n");
    sb.append("    browserSdk: ").append(toIndentedString(browserSdk)).append("\n");
    sb.append("    browserSdkVersion: ").append(toIndentedString(browserSdkVersion)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dsn: ").append(toIndentedString(dsn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

