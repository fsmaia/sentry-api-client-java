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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnEventForAProject200ResponseMeta
 */
@JsonPropertyOrder({
  RetrieveAnEventForAProject200ResponseMeta.JSON_PROPERTY_USER,
  RetrieveAnEventForAProject200ResponseMeta.JSON_PROPERTY_CONTEXT,
  RetrieveAnEventForAProject200ResponseMeta.JSON_PROPERTY_ENTRIES,
  RetrieveAnEventForAProject200ResponseMeta.JSON_PROPERTY_CONTEXTS,
  RetrieveAnEventForAProject200ResponseMeta.JSON_PROPERTY_MESSAGE,
  RetrieveAnEventForAProject200ResponseMeta.JSON_PROPERTY_PACKAGES,
  RetrieveAnEventForAProject200ResponseMeta.JSON_PROPERTY_TAGS,
  RetrieveAnEventForAProject200ResponseMeta.JSON_PROPERTY_SDK
})
@JsonTypeName("Retrieve_an_Event_for_a_Project_200_response__meta")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class RetrieveAnEventForAProject200ResponseMeta {
  public static final String JSON_PROPERTY_USER = "user";
  private JsonNullable<String> user = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private JsonNullable<String> context = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private Object entries;

  public static final String JSON_PROPERTY_CONTEXTS = "contexts";
  private JsonNullable<String> contexts = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PACKAGES = "packages";
  private JsonNullable<String> packages = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_SDK = "sdk";
  private JsonNullable<String> sdk = JsonNullable.<String>undefined();

  public RetrieveAnEventForAProject200ResponseMeta() { 
  }

  public RetrieveAnEventForAProject200ResponseMeta user(String user) {
    this.user = JsonNullable.<String>of(user);
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getUser() {
        return user.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUser_JsonNullable() {
    return user;
  }
  
  @JsonProperty(JSON_PROPERTY_USER)
  public void setUser_JsonNullable(JsonNullable<String> user) {
    this.user = user;
  }

  public void setUser(String user) {
    this.user = JsonNullable.<String>of(user);
  }


  public RetrieveAnEventForAProject200ResponseMeta context(String context) {
    this.context = JsonNullable.<String>of(context);
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getContext() {
        return context.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContext_JsonNullable() {
    return context;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  public void setContext_JsonNullable(JsonNullable<String> context) {
    this.context = context;
  }

  public void setContext(String context) {
    this.context = JsonNullable.<String>of(context);
  }


  public RetrieveAnEventForAProject200ResponseMeta entries(Object entries) {
    this.entries = entries;
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getEntries() {
    return entries;
  }


  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntries(Object entries) {
    this.entries = entries;
  }


  public RetrieveAnEventForAProject200ResponseMeta contexts(String contexts) {
    this.contexts = JsonNullable.<String>of(contexts);
    return this;
  }

   /**
   * Get contexts
   * @return contexts
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getContexts() {
        return contexts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTEXTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContexts_JsonNullable() {
    return contexts;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTEXTS)
  public void setContexts_JsonNullable(JsonNullable<String> contexts) {
    this.contexts = contexts;
  }

  public void setContexts(String contexts) {
    this.contexts = JsonNullable.<String>of(contexts);
  }


  public RetrieveAnEventForAProject200ResponseMeta message(String message) {
    this.message = JsonNullable.<String>of(message);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getMessage() {
        return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }


  public RetrieveAnEventForAProject200ResponseMeta packages(String packages) {
    this.packages = JsonNullable.<String>of(packages);
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getPackages() {
        return packages.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPackages_JsonNullable() {
    return packages;
  }
  
  @JsonProperty(JSON_PROPERTY_PACKAGES)
  public void setPackages_JsonNullable(JsonNullable<String> packages) {
    this.packages = packages;
  }

  public void setPackages(String packages) {
    this.packages = JsonNullable.<String>of(packages);
  }


  public RetrieveAnEventForAProject200ResponseMeta tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Object tags) {
    this.tags = tags;
  }


  public RetrieveAnEventForAProject200ResponseMeta sdk(String sdk) {
    this.sdk = JsonNullable.<String>of(sdk);
    return this;
  }

   /**
   * Get sdk
   * @return sdk
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSdk() {
        return sdk.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SDK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSdk_JsonNullable() {
    return sdk;
  }
  
  @JsonProperty(JSON_PROPERTY_SDK)
  public void setSdk_JsonNullable(JsonNullable<String> sdk) {
    this.sdk = sdk;
  }

  public void setSdk(String sdk) {
    this.sdk = JsonNullable.<String>of(sdk);
  }


  /**
   * Return true if this Retrieve_an_Event_for_a_Project_200_response__meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnEventForAProject200ResponseMeta retrieveAnEventForAProject200ResponseMeta = (RetrieveAnEventForAProject200ResponseMeta) o;
    return equalsNullable(this.user, retrieveAnEventForAProject200ResponseMeta.user) &&
        equalsNullable(this.context, retrieveAnEventForAProject200ResponseMeta.context) &&
        Objects.equals(this.entries, retrieveAnEventForAProject200ResponseMeta.entries) &&
        equalsNullable(this.contexts, retrieveAnEventForAProject200ResponseMeta.contexts) &&
        equalsNullable(this.message, retrieveAnEventForAProject200ResponseMeta.message) &&
        equalsNullable(this.packages, retrieveAnEventForAProject200ResponseMeta.packages) &&
        Objects.equals(this.tags, retrieveAnEventForAProject200ResponseMeta.tags) &&
        equalsNullable(this.sdk, retrieveAnEventForAProject200ResponseMeta.sdk);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(user), hashCodeNullable(context), entries, hashCodeNullable(contexts), hashCodeNullable(message), hashCodeNullable(packages), tags, hashCodeNullable(sdk));
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
    sb.append("class RetrieveAnEventForAProject200ResponseMeta {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    sdk: ").append(toIndentedString(sdk)).append("\n");
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

