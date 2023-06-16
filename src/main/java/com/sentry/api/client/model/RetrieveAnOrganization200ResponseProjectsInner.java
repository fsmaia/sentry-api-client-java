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
import com.sentry.api.client.model.ListAnOrganizationSProjects200ResponseInnerTeamsInner;
import com.sentry.api.client.model.RetrieveAnOrganization200ResponseProjectsInnerTeam;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnOrganization200ResponseProjectsInner
 */
@JsonPropertyOrder({
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_DATE_CREATED,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_FIRST_EVENT,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_HAS_ACCESS,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_ID,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_IS_BOOKMARKED,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_IS_MEMBER,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_LATEST_DEPLOYS,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_NAME,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_PLATFORM,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_PLATFORMS,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_SLUG,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_TEAM,
  RetrieveAnOrganization200ResponseProjectsInner.JSON_PROPERTY_TEAMS
})
@JsonTypeName("Retrieve_an_Organization_200_response_projects_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
public class RetrieveAnOrganization200ResponseProjectsInner {
  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_FIRST_EVENT = "firstEvent";
  private String firstEvent;

  public static final String JSON_PROPERTY_HAS_ACCESS = "hasAccess";
  private Boolean hasAccess;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_BOOKMARKED = "isBookmarked";
  private Boolean isBookmarked;

  public static final String JSON_PROPERTY_IS_MEMBER = "isMember";
  private Boolean isMember;

  public static final String JSON_PROPERTY_LATEST_DEPLOYS = "latestDeploys";
  private String latestDeploys;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_PLATFORMS = "platforms";
  private List<String> platforms = new ArrayList<>();

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_TEAM = "team";
  private RetrieveAnOrganization200ResponseProjectsInnerTeam team;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<ListAnOrganizationSProjects200ResponseInnerTeamsInner> teams = new ArrayList<>();

  public RetrieveAnOrganization200ResponseProjectsInner() { 
  }

  public RetrieveAnOrganization200ResponseProjectsInner dateCreated(String dateCreated) {
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


  public RetrieveAnOrganization200ResponseProjectsInner firstEvent(String firstEvent) {
    this.firstEvent = firstEvent;
    return this;
  }

   /**
   * Get firstEvent
   * @return firstEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstEvent() {
    return firstEvent;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstEvent(String firstEvent) {
    this.firstEvent = firstEvent;
  }


  public RetrieveAnOrganization200ResponseProjectsInner hasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

   /**
   * Get hasAccess
   * @return hasAccess
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasAccess() {
    return hasAccess;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }


  public RetrieveAnOrganization200ResponseProjectsInner id(String id) {
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


  public RetrieveAnOrganization200ResponseProjectsInner isBookmarked(Boolean isBookmarked) {
    this.isBookmarked = isBookmarked;
    return this;
  }

   /**
   * Get isBookmarked
   * @return isBookmarked
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_BOOKMARKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsBookmarked() {
    return isBookmarked;
  }


  @JsonProperty(JSON_PROPERTY_IS_BOOKMARKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsBookmarked(Boolean isBookmarked) {
    this.isBookmarked = isBookmarked;
  }


  public RetrieveAnOrganization200ResponseProjectsInner isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

   /**
   * Get isMember
   * @return isMember
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_MEMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsMember() {
    return isMember;
  }


  @JsonProperty(JSON_PROPERTY_IS_MEMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  public RetrieveAnOrganization200ResponseProjectsInner latestDeploys(String latestDeploys) {
    this.latestDeploys = latestDeploys;
    return this;
  }

   /**
   * Get latestDeploys
   * @return latestDeploys
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_DEPLOYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLatestDeploys() {
    return latestDeploys;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_DEPLOYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatestDeploys(String latestDeploys) {
    this.latestDeploys = latestDeploys;
  }


  public RetrieveAnOrganization200ResponseProjectsInner name(String name) {
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


  public RetrieveAnOrganization200ResponseProjectsInner platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public RetrieveAnOrganization200ResponseProjectsInner platforms(List<String> platforms) {
    this.platforms = platforms;
    return this;
  }

  public RetrieveAnOrganization200ResponseProjectsInner addPlatformsItem(String platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * Get platforms
   * @return platforms
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLATFORMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPlatforms() {
    return platforms;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }


  public RetrieveAnOrganization200ResponseProjectsInner slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


  public RetrieveAnOrganization200ResponseProjectsInner team(RetrieveAnOrganization200ResponseProjectsInnerTeam team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnOrganization200ResponseProjectsInnerTeam getTeam() {
    return team;
  }


  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeam(RetrieveAnOrganization200ResponseProjectsInnerTeam team) {
    this.team = team;
  }


  public RetrieveAnOrganization200ResponseProjectsInner teams(List<ListAnOrganizationSProjects200ResponseInnerTeamsInner> teams) {
    this.teams = teams;
    return this;
  }

  public RetrieveAnOrganization200ResponseProjectsInner addTeamsItem(ListAnOrganizationSProjects200ResponseInnerTeamsInner teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ListAnOrganizationSProjects200ResponseInnerTeamsInner> getTeams() {
    return teams;
  }


  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeams(List<ListAnOrganizationSProjects200ResponseInnerTeamsInner> teams) {
    this.teams = teams;
  }


  /**
   * Return true if this Retrieve_an_Organization_200_response_projects_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganization200ResponseProjectsInner retrieveAnOrganization200ResponseProjectsInner = (RetrieveAnOrganization200ResponseProjectsInner) o;
    return Objects.equals(this.dateCreated, retrieveAnOrganization200ResponseProjectsInner.dateCreated) &&
        Objects.equals(this.firstEvent, retrieveAnOrganization200ResponseProjectsInner.firstEvent) &&
        Objects.equals(this.hasAccess, retrieveAnOrganization200ResponseProjectsInner.hasAccess) &&
        Objects.equals(this.id, retrieveAnOrganization200ResponseProjectsInner.id) &&
        Objects.equals(this.isBookmarked, retrieveAnOrganization200ResponseProjectsInner.isBookmarked) &&
        Objects.equals(this.isMember, retrieveAnOrganization200ResponseProjectsInner.isMember) &&
        Objects.equals(this.latestDeploys, retrieveAnOrganization200ResponseProjectsInner.latestDeploys) &&
        Objects.equals(this.name, retrieveAnOrganization200ResponseProjectsInner.name) &&
        Objects.equals(this.platform, retrieveAnOrganization200ResponseProjectsInner.platform) &&
        Objects.equals(this.platforms, retrieveAnOrganization200ResponseProjectsInner.platforms) &&
        Objects.equals(this.slug, retrieveAnOrganization200ResponseProjectsInner.slug) &&
        Objects.equals(this.team, retrieveAnOrganization200ResponseProjectsInner.team) &&
        Objects.equals(this.teams, retrieveAnOrganization200ResponseProjectsInner.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, firstEvent, hasAccess, id, isBookmarked, isMember, latestDeploys, name, platform, platforms, slug, team, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganization200ResponseProjectsInner {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    firstEvent: ").append(toIndentedString(firstEvent)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBookmarked: ").append(toIndentedString(isBookmarked)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    latestDeploys: ").append(toIndentedString(latestDeploys)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

