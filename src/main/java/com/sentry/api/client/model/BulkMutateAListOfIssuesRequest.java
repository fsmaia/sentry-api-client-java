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
import com.sentry.api.client.model.BulkMutateAListOfIssuesRequestStatusDetails;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * BulkMutateAListOfIssuesRequest
 */
@JsonPropertyOrder({
  BulkMutateAListOfIssuesRequest.JSON_PROPERTY_STATUS,
  BulkMutateAListOfIssuesRequest.JSON_PROPERTY_STATUS_DETAILS,
  BulkMutateAListOfIssuesRequest.JSON_PROPERTY_IGNORE_DURATION,
  BulkMutateAListOfIssuesRequest.JSON_PROPERTY_IS_PUBLIC,
  BulkMutateAListOfIssuesRequest.JSON_PROPERTY_MERGE,
  BulkMutateAListOfIssuesRequest.JSON_PROPERTY_ASSIGNED_TO,
  BulkMutateAListOfIssuesRequest.JSON_PROPERTY_HAS_SEEN,
  BulkMutateAListOfIssuesRequest.JSON_PROPERTY_IS_BOOKMARKED
})
@JsonTypeName("Bulk_Mutate_a_List_of_Issues_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class BulkMutateAListOfIssuesRequest {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_DETAILS = "statusDetails";
  private BulkMutateAListOfIssuesRequestStatusDetails statusDetails;

  public static final String JSON_PROPERTY_IGNORE_DURATION = "ignoreDuration";
  private Integer ignoreDuration;

  public static final String JSON_PROPERTY_IS_PUBLIC = "isPublic";
  private Boolean isPublic;

  public static final String JSON_PROPERTY_MERGE = "merge";
  private Boolean merge;

  public static final String JSON_PROPERTY_ASSIGNED_TO = "assignedTo";
  private String assignedTo;

  public static final String JSON_PROPERTY_HAS_SEEN = "hasSeen";
  private Boolean hasSeen;

  public static final String JSON_PROPERTY_IS_BOOKMARKED = "isBookmarked";
  private Boolean isBookmarked;

  public BulkMutateAListOfIssuesRequest() { 
  }

  public BulkMutateAListOfIssuesRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The new status for the issues. Valid values are &#x60;\&quot;resolved\&quot;&#x60;, &#x60;\&quot;resolvedInNextRelease\&quot;&#x60;, &#x60;\&quot;unresolved\&quot;&#x60;, and &#x60;\&quot;ignored\&quot;&#x60;.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public BulkMutateAListOfIssuesRequest statusDetails(BulkMutateAListOfIssuesRequestStatusDetails statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Get statusDetails
   * @return statusDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BulkMutateAListOfIssuesRequestStatusDetails getStatusDetails() {
    return statusDetails;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusDetails(BulkMutateAListOfIssuesRequestStatusDetails statusDetails) {
    this.statusDetails = statusDetails;
  }


  public BulkMutateAListOfIssuesRequest ignoreDuration(Integer ignoreDuration) {
    this.ignoreDuration = ignoreDuration;
    return this;
  }

   /**
   * The number of minutes to ignore this issue.
   * @return ignoreDuration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIgnoreDuration() {
    return ignoreDuration;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnoreDuration(Integer ignoreDuration) {
    this.ignoreDuration = ignoreDuration;
  }


  public BulkMutateAListOfIssuesRequest isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Sets the issue to public or private.
   * @return isPublic
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public BulkMutateAListOfIssuesRequest merge(Boolean merge) {
    this.merge = merge;
    return this;
  }

   /**
   * Allows to merge or unmerge different issues.
   * @return merge
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerge() {
    return merge;
  }


  @JsonProperty(JSON_PROPERTY_MERGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerge(Boolean merge) {
    this.merge = merge;
  }


  public BulkMutateAListOfIssuesRequest assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * The actor id (or username) of the user or team that should be assigned to this issue.
   * @return assignedTo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssignedTo() {
    return assignedTo;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }


  public BulkMutateAListOfIssuesRequest hasSeen(Boolean hasSeen) {
    this.hasSeen = hasSeen;
    return this;
  }

   /**
   * In case this API call is invoked with a user context this allows changing of the flag that indicates if the user has seen the event.
   * @return hasSeen
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasSeen() {
    return hasSeen;
  }


  @JsonProperty(JSON_PROPERTY_HAS_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasSeen(Boolean hasSeen) {
    this.hasSeen = hasSeen;
  }


  public BulkMutateAListOfIssuesRequest isBookmarked(Boolean isBookmarked) {
    this.isBookmarked = isBookmarked;
    return this;
  }

   /**
   * In case this API call is invoked with a user context this allows changing of the bookmark flag.
   * @return isBookmarked
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BOOKMARKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBookmarked() {
    return isBookmarked;
  }


  @JsonProperty(JSON_PROPERTY_IS_BOOKMARKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBookmarked(Boolean isBookmarked) {
    this.isBookmarked = isBookmarked;
  }


  /**
   * Return true if this Bulk_Mutate_a_List_of_Issues_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkMutateAListOfIssuesRequest bulkMutateAListOfIssuesRequest = (BulkMutateAListOfIssuesRequest) o;
    return Objects.equals(this.status, bulkMutateAListOfIssuesRequest.status) &&
        Objects.equals(this.statusDetails, bulkMutateAListOfIssuesRequest.statusDetails) &&
        Objects.equals(this.ignoreDuration, bulkMutateAListOfIssuesRequest.ignoreDuration) &&
        Objects.equals(this.isPublic, bulkMutateAListOfIssuesRequest.isPublic) &&
        Objects.equals(this.merge, bulkMutateAListOfIssuesRequest.merge) &&
        Objects.equals(this.assignedTo, bulkMutateAListOfIssuesRequest.assignedTo) &&
        Objects.equals(this.hasSeen, bulkMutateAListOfIssuesRequest.hasSeen) &&
        Objects.equals(this.isBookmarked, bulkMutateAListOfIssuesRequest.isBookmarked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusDetails, ignoreDuration, isPublic, merge, assignedTo, hasSeen, isBookmarked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkMutateAListOfIssuesRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    ignoreDuration: ").append(toIndentedString(ignoreDuration)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    hasSeen: ").append(toIndentedString(hasSeen)).append("\n");
    sb.append("    isBookmarked: ").append(toIndentedString(isBookmarked)).append("\n");
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

