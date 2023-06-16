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
import com.sentry.api.client.model.CreateAMonitorRequestAlertRuleTargetsInner;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * MonitorAlertRuleValidator
 */
@JsonPropertyOrder({
  MonitorAlertRuleValidator.JSON_PROPERTY_ENVIRONMENT,
  MonitorAlertRuleValidator.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class MonitorAlertRuleValidator {
  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private JsonNullable<String> environment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<CreateAMonitorRequestAlertRuleTargetsInner> targets = new ArrayList<>();

  public MonitorAlertRuleValidator() { 
  }

  public MonitorAlertRuleValidator environment(String environment) {
    this.environment = JsonNullable.<String>of(environment);
    return this;
  }

   /**
   * Name of the environment
   * @return environment
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getEnvironment() {
        return environment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEnvironment_JsonNullable() {
    return environment;
  }
  
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  public void setEnvironment_JsonNullable(JsonNullable<String> environment) {
    this.environment = environment;
  }

  public void setEnvironment(String environment) {
    this.environment = JsonNullable.<String>of(environment);
  }


  public MonitorAlertRuleValidator targets(List<CreateAMonitorRequestAlertRuleTargetsInner> targets) {
    this.targets = targets;
    return this;
  }

  public MonitorAlertRuleValidator addTargetsItem(CreateAMonitorRequestAlertRuleTargetsInner targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Array of dictionaries with information of the user or team to be notified
   * @return targets
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CreateAMonitorRequestAlertRuleTargetsInner> getTargets() {
    return targets;
  }


  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargets(List<CreateAMonitorRequestAlertRuleTargetsInner> targets) {
    this.targets = targets;
  }


  /**
   * Return true if this MonitorAlertRuleValidator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorAlertRuleValidator monitorAlertRuleValidator = (MonitorAlertRuleValidator) o;
    return equalsNullable(this.environment, monitorAlertRuleValidator.environment) &&
        Objects.equals(this.targets, monitorAlertRuleValidator.targets);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(environment), targets);
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
    sb.append("class MonitorAlertRuleValidator {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

