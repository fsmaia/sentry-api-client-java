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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAProjectSClientKeys200ResponseInnerBrowserSdk
 */
@JsonPropertyOrder({
  ListAProjectSClientKeys200ResponseInnerBrowserSdk.JSON_PROPERTY_CHOICES
})
@JsonTypeName("List_a_Project_s_Client_Keys_200_response_inner_browserSdk")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class ListAProjectSClientKeys200ResponseInnerBrowserSdk {
  public static final String JSON_PROPERTY_CHOICES = "choices";
  private List<List<String>> choices;

  public ListAProjectSClientKeys200ResponseInnerBrowserSdk() { 
  }

  public ListAProjectSClientKeys200ResponseInnerBrowserSdk choices(List<List<String>> choices) {
    this.choices = choices;
    return this;
  }

  public ListAProjectSClientKeys200ResponseInnerBrowserSdk addChoicesItem(List<String> choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * Get choices
   * @return choices
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHOICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<String>> getChoices() {
    return choices;
  }


  @JsonProperty(JSON_PROPERTY_CHOICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChoices(List<List<String>> choices) {
    this.choices = choices;
  }


  /**
   * Return true if this List_a_Project_s_Client_Keys_200_response_inner_browserSdk object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAProjectSClientKeys200ResponseInnerBrowserSdk listAProjectSClientKeys200ResponseInnerBrowserSdk = (ListAProjectSClientKeys200ResponseInnerBrowserSdk) o;
    return Objects.equals(this.choices, listAProjectSClientKeys200ResponseInnerBrowserSdk.choices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAProjectSClientKeys200ResponseInnerBrowserSdk {\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
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

