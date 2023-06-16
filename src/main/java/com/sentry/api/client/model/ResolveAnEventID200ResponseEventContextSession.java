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
 * ResolveAnEventID200ResponseEventContextSession
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventContextSession.JSON_PROPERTY_FOO
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_context_session")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventContextSession {
  public static final String JSON_PROPERTY_FOO = "foo";
  private String foo;

  public ResolveAnEventID200ResponseEventContextSession() { 
  }

  public ResolveAnEventID200ResponseEventContextSession foo(String foo) {
    this.foo = foo;
    return this;
  }

   /**
   * Get foo
   * @return foo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFoo() {
    return foo;
  }


  @JsonProperty(JSON_PROPERTY_FOO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFoo(String foo) {
    this.foo = foo;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_context_session object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventContextSession resolveAnEventID200ResponseEventContextSession = (ResolveAnEventID200ResponseEventContextSession) o;
    return Objects.equals(this.foo, resolveAnEventID200ResponseEventContextSession.foo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventContextSession {\n");
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
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

