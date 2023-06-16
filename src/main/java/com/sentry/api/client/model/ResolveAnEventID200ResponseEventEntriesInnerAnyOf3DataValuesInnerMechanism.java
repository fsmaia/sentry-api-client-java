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
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism.JSON_PROPERTY_TYPE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism.JSON_PROPERTY_HANDLED
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data_values_inner_mechanism")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_HANDLED = "handled";
  private Boolean handled;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism() { 
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism handled(Boolean handled) {
    this.handled = handled;
    return this;
  }

   /**
   * Get handled
   * @return handled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHandled() {
    return handled;
  }


  @JsonProperty(JSON_PROPERTY_HANDLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHandled(Boolean handled) {
    this.handled = handled;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data_values_inner_mechanism object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism) o;
    return Objects.equals(this.type, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism.type) &&
        Objects.equals(this.handled, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism.handled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, handled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerMechanism {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    handled: ").append(toIndentedString(handled)).append("\n");
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

