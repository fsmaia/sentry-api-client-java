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
import com.sentry.api.client.model.ListAnOrganizationSTeams200ResponseInnerOrganization;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseExternalUsersInner;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserAvatar;
import com.sentry.api.client.model.RetrieveMonitorsForAnOrganization200ResponseInnerProject;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnOrganizationSTeams200ResponseInner
 */
@JsonPropertyOrder({
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_EXTERNAL_TEAMS,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_ORGANIZATION,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_PROJECTS,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_ID,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_SLUG,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_NAME,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_DATE_CREATED,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_IS_MEMBER,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_TEAM_ROLE,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_FLAGS,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_ACCESS,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_HAS_ACCESS,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_IS_PENDING,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_MEMBER_COUNT,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_AVATAR,
  ListAnOrganizationSTeams200ResponseInner.JSON_PROPERTY_ORG_ROLE
})
@JsonTypeName("List_an_Organization_s_Teams_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class ListAnOrganizationSTeams200ResponseInner {
  public static final String JSON_PROPERTY_EXTERNAL_TEAMS = "externalTeams";
  private List<RetrieveAnOrganizationMember200ResponseExternalUsersInner> externalTeams;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private ListAnOrganizationSTeams200ResponseInnerOrganization organization;

  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private List<RetrieveMonitorsForAnOrganization200ResponseInnerProject> projects;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_IS_MEMBER = "isMember";
  private Boolean isMember;

  public static final String JSON_PROPERTY_TEAM_ROLE = "teamRole";
  private String teamRole;

  public static final String JSON_PROPERTY_FLAGS = "flags";
  private Map<String, Object> flags = new HashMap<>();

  public static final String JSON_PROPERTY_ACCESS = "access";
  private List<String> access = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_ACCESS = "hasAccess";
  private Boolean hasAccess;

  public static final String JSON_PROPERTY_IS_PENDING = "isPending";
  private Boolean isPending;

  public static final String JSON_PROPERTY_MEMBER_COUNT = "memberCount";
  private Integer memberCount;

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private RetrieveAnOrganizationMember200ResponseUserAvatar avatar;

  public static final String JSON_PROPERTY_ORG_ROLE = "orgRole";
  private String orgRole;

  public ListAnOrganizationSTeams200ResponseInner() { 
  }

  public ListAnOrganizationSTeams200ResponseInner externalTeams(List<RetrieveAnOrganizationMember200ResponseExternalUsersInner> externalTeams) {
    this.externalTeams = externalTeams;
    return this;
  }

  public ListAnOrganizationSTeams200ResponseInner addExternalTeamsItem(RetrieveAnOrganizationMember200ResponseExternalUsersInner externalTeamsItem) {
    if (this.externalTeams == null) {
      this.externalTeams = new ArrayList<>();
    }
    this.externalTeams.add(externalTeamsItem);
    return this;
  }

   /**
   * Get externalTeams
   * @return externalTeams
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetrieveAnOrganizationMember200ResponseExternalUsersInner> getExternalTeams() {
    return externalTeams;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalTeams(List<RetrieveAnOrganizationMember200ResponseExternalUsersInner> externalTeams) {
    this.externalTeams = externalTeams;
  }


  public ListAnOrganizationSTeams200ResponseInner organization(ListAnOrganizationSTeams200ResponseInnerOrganization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListAnOrganizationSTeams200ResponseInnerOrganization getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(ListAnOrganizationSTeams200ResponseInnerOrganization organization) {
    this.organization = organization;
  }


  public ListAnOrganizationSTeams200ResponseInner projects(List<RetrieveMonitorsForAnOrganization200ResponseInnerProject> projects) {
    this.projects = projects;
    return this;
  }

  public ListAnOrganizationSTeams200ResponseInner addProjectsItem(RetrieveMonitorsForAnOrganization200ResponseInnerProject projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetrieveMonitorsForAnOrganization200ResponseInnerProject> getProjects() {
    return projects;
  }


  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjects(List<RetrieveMonitorsForAnOrganization200ResponseInnerProject> projects) {
    this.projects = projects;
  }


  public ListAnOrganizationSTeams200ResponseInner id(String id) {
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


  public ListAnOrganizationSTeams200ResponseInner slug(String slug) {
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


  public ListAnOrganizationSTeams200ResponseInner name(String name) {
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


  public ListAnOrganizationSTeams200ResponseInner dateCreated(OffsetDateTime dateCreated) {
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

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public ListAnOrganizationSTeams200ResponseInner isMember(Boolean isMember) {
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


  public ListAnOrganizationSTeams200ResponseInner teamRole(String teamRole) {
    this.teamRole = teamRole;
    return this;
  }

   /**
   * Get teamRole
   * @return teamRole
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTeamRole() {
    return teamRole;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeamRole(String teamRole) {
    this.teamRole = teamRole;
  }


  public ListAnOrganizationSTeams200ResponseInner flags(Map<String, Object> flags) {
    this.flags = flags;
    return this;
  }

  public ListAnOrganizationSTeams200ResponseInner putFlagsItem(String key, Object flagsItem) {
    if (this.flags == null) {
      this.flags = new HashMap<>();
    }
    this.flags.put(key, flagsItem);
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLAGS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getFlags() {
    return flags;
  }


  @JsonProperty(JSON_PROPERTY_FLAGS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setFlags(Map<String, Object> flags) {
    this.flags = flags;
  }


  public ListAnOrganizationSTeams200ResponseInner access(List<String> access) {
    this.access = access;
    return this;
  }

  public ListAnOrganizationSTeams200ResponseInner addAccessItem(String accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<>();
    }
    this.access.add(accessItem);
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAccess() {
    return access;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccess(List<String> access) {
    this.access = access;
  }


  public ListAnOrganizationSTeams200ResponseInner hasAccess(Boolean hasAccess) {
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


  public ListAnOrganizationSTeams200ResponseInner isPending(Boolean isPending) {
    this.isPending = isPending;
    return this;
  }

   /**
   * Get isPending
   * @return isPending
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_PENDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPending() {
    return isPending;
  }


  @JsonProperty(JSON_PROPERTY_IS_PENDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPending(Boolean isPending) {
    this.isPending = isPending;
  }


  public ListAnOrganizationSTeams200ResponseInner memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Get memberCount
   * @return memberCount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMemberCount() {
    return memberCount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }


  public ListAnOrganizationSTeams200ResponseInner avatar(RetrieveAnOrganizationMember200ResponseUserAvatar avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnOrganizationMember200ResponseUserAvatar getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatar(RetrieveAnOrganizationMember200ResponseUserAvatar avatar) {
    this.avatar = avatar;
  }


  public ListAnOrganizationSTeams200ResponseInner orgRole(String orgRole) {
    this.orgRole = orgRole;
    return this;
  }

   /**
   * Get orgRole
   * @return orgRole
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrgRole() {
    return orgRole;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrgRole(String orgRole) {
    this.orgRole = orgRole;
  }


  /**
   * Return true if this List_an_Organization_s_Teams_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSTeams200ResponseInner listAnOrganizationSTeams200ResponseInner = (ListAnOrganizationSTeams200ResponseInner) o;
    return Objects.equals(this.externalTeams, listAnOrganizationSTeams200ResponseInner.externalTeams) &&
        Objects.equals(this.organization, listAnOrganizationSTeams200ResponseInner.organization) &&
        Objects.equals(this.projects, listAnOrganizationSTeams200ResponseInner.projects) &&
        Objects.equals(this.id, listAnOrganizationSTeams200ResponseInner.id) &&
        Objects.equals(this.slug, listAnOrganizationSTeams200ResponseInner.slug) &&
        Objects.equals(this.name, listAnOrganizationSTeams200ResponseInner.name) &&
        Objects.equals(this.dateCreated, listAnOrganizationSTeams200ResponseInner.dateCreated) &&
        Objects.equals(this.isMember, listAnOrganizationSTeams200ResponseInner.isMember) &&
        Objects.equals(this.teamRole, listAnOrganizationSTeams200ResponseInner.teamRole) &&
        Objects.equals(this.flags, listAnOrganizationSTeams200ResponseInner.flags) &&
        Objects.equals(this.access, listAnOrganizationSTeams200ResponseInner.access) &&
        Objects.equals(this.hasAccess, listAnOrganizationSTeams200ResponseInner.hasAccess) &&
        Objects.equals(this.isPending, listAnOrganizationSTeams200ResponseInner.isPending) &&
        Objects.equals(this.memberCount, listAnOrganizationSTeams200ResponseInner.memberCount) &&
        Objects.equals(this.avatar, listAnOrganizationSTeams200ResponseInner.avatar) &&
        Objects.equals(this.orgRole, listAnOrganizationSTeams200ResponseInner.orgRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalTeams, organization, projects, id, slug, name, dateCreated, isMember, teamRole, flags, access, hasAccess, isPending, memberCount, avatar, orgRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSTeams200ResponseInner {\n");
    sb.append("    externalTeams: ").append(toIndentedString(externalTeams)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    teamRole: ").append(toIndentedString(teamRole)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
    sb.append("    isPending: ").append(toIndentedString(isPending)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    orgRole: ").append(toIndentedString(orgRole)).append("\n");
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

