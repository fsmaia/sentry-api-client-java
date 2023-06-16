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
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseExternalUsersInner;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseFlags;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseTeamRolesInner;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUser;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * OrganizationMemberWithRoles
 */
@JsonPropertyOrder({
  OrganizationMemberWithRoles.JSON_PROPERTY_EXTERNAL_USERS,
  OrganizationMemberWithRoles.JSON_PROPERTY_ID,
  OrganizationMemberWithRoles.JSON_PROPERTY_EMAIL,
  OrganizationMemberWithRoles.JSON_PROPERTY_NAME,
  OrganizationMemberWithRoles.JSON_PROPERTY_USER,
  OrganizationMemberWithRoles.JSON_PROPERTY_ROLE,
  OrganizationMemberWithRoles.JSON_PROPERTY_ROLE_NAME,
  OrganizationMemberWithRoles.JSON_PROPERTY_ORG_ROLE,
  OrganizationMemberWithRoles.JSON_PROPERTY_GROUP_ORG_ROLES,
  OrganizationMemberWithRoles.JSON_PROPERTY_PENDING,
  OrganizationMemberWithRoles.JSON_PROPERTY_EXPIRED,
  OrganizationMemberWithRoles.JSON_PROPERTY_FLAGS,
  OrganizationMemberWithRoles.JSON_PROPERTY_DATE_CREATED,
  OrganizationMemberWithRoles.JSON_PROPERTY_INVITE_STATUS,
  OrganizationMemberWithRoles.JSON_PROPERTY_INVITER_NAME,
  OrganizationMemberWithRoles.JSON_PROPERTY_TEAMS,
  OrganizationMemberWithRoles.JSON_PROPERTY_TEAM_ROLES,
  OrganizationMemberWithRoles.JSON_PROPERTY_INVITE_LINK,
  OrganizationMemberWithRoles.JSON_PROPERTY_IS_ONLY_OWNER,
  OrganizationMemberWithRoles.JSON_PROPERTY_ROLES,
  OrganizationMemberWithRoles.JSON_PROPERTY_ORG_ROLE_LIST,
  OrganizationMemberWithRoles.JSON_PROPERTY_TEAM_ROLE_LIST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class OrganizationMemberWithRoles {
  public static final String JSON_PROPERTY_EXTERNAL_USERS = "externalUsers";
  private List<RetrieveAnOrganizationMember200ResponseExternalUsersInner> externalUsers;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_USER = "user";
  private RetrieveAnOrganizationMember200ResponseUser user;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  private String roleName;

  public static final String JSON_PROPERTY_ORG_ROLE = "orgRole";
  private String orgRole;

  public static final String JSON_PROPERTY_GROUP_ORG_ROLES = "groupOrgRoles";
  private List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> groupOrgRoles = new ArrayList<>();

  public static final String JSON_PROPERTY_PENDING = "pending";
  private Boolean pending;

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  private String expired;

  public static final String JSON_PROPERTY_FLAGS = "flags";
  private RetrieveAnOrganizationMember200ResponseFlags flags;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_INVITE_STATUS = "inviteStatus";
  private String inviteStatus;

  public static final String JSON_PROPERTY_INVITER_NAME = "inviterName";
  private String inviterName;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = new ArrayList<>();

  public static final String JSON_PROPERTY_TEAM_ROLES = "teamRoles";
  private List<RetrieveAnOrganizationMember200ResponseTeamRolesInner> teamRoles = new ArrayList<>();

  public static final String JSON_PROPERTY_INVITE_LINK = "invite_link";
  private String inviteLink;

  public static final String JSON_PROPERTY_IS_ONLY_OWNER = "isOnlyOwner";
  private Boolean isOnlyOwner;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> roles = new ArrayList<>();

  public static final String JSON_PROPERTY_ORG_ROLE_LIST = "orgRoleList";
  private List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> orgRoleList = new ArrayList<>();

  public static final String JSON_PROPERTY_TEAM_ROLE_LIST = "teamRoleList";
  private List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> teamRoleList = new ArrayList<>();

  public OrganizationMemberWithRoles() { 
  }

  public OrganizationMemberWithRoles externalUsers(List<RetrieveAnOrganizationMember200ResponseExternalUsersInner> externalUsers) {
    this.externalUsers = externalUsers;
    return this;
  }

  public OrganizationMemberWithRoles addExternalUsersItem(RetrieveAnOrganizationMember200ResponseExternalUsersInner externalUsersItem) {
    if (this.externalUsers == null) {
      this.externalUsers = new ArrayList<>();
    }
    this.externalUsers.add(externalUsersItem);
    return this;
  }

   /**
   * Get externalUsers
   * @return externalUsers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetrieveAnOrganizationMember200ResponseExternalUsersInner> getExternalUsers() {
    return externalUsers;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalUsers(List<RetrieveAnOrganizationMember200ResponseExternalUsersInner> externalUsers) {
    this.externalUsers = externalUsers;
  }


  public OrganizationMemberWithRoles id(String id) {
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


  public OrganizationMemberWithRoles email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public OrganizationMemberWithRoles name(String name) {
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


  public OrganizationMemberWithRoles user(RetrieveAnOrganizationMember200ResponseUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnOrganizationMember200ResponseUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUser(RetrieveAnOrganizationMember200ResponseUser user) {
    this.user = user;
  }


  public OrganizationMemberWithRoles role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(String role) {
    this.role = role;
  }


  public OrganizationMemberWithRoles roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoleName() {
    return roleName;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public OrganizationMemberWithRoles orgRole(String orgRole) {
    this.orgRole = orgRole;
    return this;
  }

   /**
   * Get orgRole
   * @return orgRole
  **/
  @jakarta.annotation.Nonnull
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


  public OrganizationMemberWithRoles groupOrgRoles(List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> groupOrgRoles) {
    this.groupOrgRoles = groupOrgRoles;
    return this;
  }

  public OrganizationMemberWithRoles addGroupOrgRolesItem(RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner groupOrgRolesItem) {
    if (this.groupOrgRoles == null) {
      this.groupOrgRoles = new ArrayList<>();
    }
    this.groupOrgRoles.add(groupOrgRolesItem);
    return this;
  }

   /**
   * Get groupOrgRoles
   * @return groupOrgRoles
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROUP_ORG_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> getGroupOrgRoles() {
    return groupOrgRoles;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ORG_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupOrgRoles(List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> groupOrgRoles) {
    this.groupOrgRoles = groupOrgRoles;
  }


  public OrganizationMemberWithRoles pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getPending() {
    return pending;
  }


  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPending(Boolean pending) {
    this.pending = pending;
  }


  public OrganizationMemberWithRoles expired(String expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpired() {
    return expired;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpired(String expired) {
    this.expired = expired;
  }


  public OrganizationMemberWithRoles flags(RetrieveAnOrganizationMember200ResponseFlags flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RetrieveAnOrganizationMember200ResponseFlags getFlags() {
    return flags;
  }


  @JsonProperty(JSON_PROPERTY_FLAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlags(RetrieveAnOrganizationMember200ResponseFlags flags) {
    this.flags = flags;
  }


  public OrganizationMemberWithRoles dateCreated(OffsetDateTime dateCreated) {
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


  public OrganizationMemberWithRoles inviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

   /**
   * Get inviteStatus
   * @return inviteStatus
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVITE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInviteStatus() {
    return inviteStatus;
  }


  @JsonProperty(JSON_PROPERTY_INVITE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }


  public OrganizationMemberWithRoles inviterName(String inviterName) {
    this.inviterName = inviterName;
    return this;
  }

   /**
   * Get inviterName
   * @return inviterName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInviterName() {
    return inviterName;
  }


  @JsonProperty(JSON_PROPERTY_INVITER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInviterName(String inviterName) {
    this.inviterName = inviterName;
  }


  public OrganizationMemberWithRoles teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public OrganizationMemberWithRoles addTeamsItem(String teamsItem) {
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

  public List<String> getTeams() {
    return teams;
  }


  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeams(List<String> teams) {
    this.teams = teams;
  }


  public OrganizationMemberWithRoles teamRoles(List<RetrieveAnOrganizationMember200ResponseTeamRolesInner> teamRoles) {
    this.teamRoles = teamRoles;
    return this;
  }

  public OrganizationMemberWithRoles addTeamRolesItem(RetrieveAnOrganizationMember200ResponseTeamRolesInner teamRolesItem) {
    if (this.teamRoles == null) {
      this.teamRoles = new ArrayList<>();
    }
    this.teamRoles.add(teamRolesItem);
    return this;
  }

   /**
   * Get teamRoles
   * @return teamRoles
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEAM_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnOrganizationMember200ResponseTeamRolesInner> getTeamRoles() {
    return teamRoles;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeamRoles(List<RetrieveAnOrganizationMember200ResponseTeamRolesInner> teamRoles) {
    this.teamRoles = teamRoles;
  }


  public OrganizationMemberWithRoles inviteLink(String inviteLink) {
    this.inviteLink = inviteLink;
    return this;
  }

   /**
   * Get inviteLink
   * @return inviteLink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITE_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInviteLink() {
    return inviteLink;
  }


  @JsonProperty(JSON_PROPERTY_INVITE_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInviteLink(String inviteLink) {
    this.inviteLink = inviteLink;
  }


  public OrganizationMemberWithRoles isOnlyOwner(Boolean isOnlyOwner) {
    this.isOnlyOwner = isOnlyOwner;
    return this;
  }

   /**
   * Get isOnlyOwner
   * @return isOnlyOwner
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_ONLY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsOnlyOwner() {
    return isOnlyOwner;
  }


  @JsonProperty(JSON_PROPERTY_IS_ONLY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsOnlyOwner(Boolean isOnlyOwner) {
    this.isOnlyOwner = isOnlyOwner;
  }


  public OrganizationMemberWithRoles roles(List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> roles) {
    this.roles = roles;
    return this;
  }

  public OrganizationMemberWithRoles addRolesItem(RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoles(List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> roles) {
    this.roles = roles;
  }


  public OrganizationMemberWithRoles orgRoleList(List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> orgRoleList) {
    this.orgRoleList = orgRoleList;
    return this;
  }

  public OrganizationMemberWithRoles addOrgRoleListItem(RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner orgRoleListItem) {
    if (this.orgRoleList == null) {
      this.orgRoleList = new ArrayList<>();
    }
    this.orgRoleList.add(orgRoleListItem);
    return this;
  }

   /**
   * Get orgRoleList
   * @return orgRoleList
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORG_ROLE_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> getOrgRoleList() {
    return orgRoleList;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ROLE_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrgRoleList(List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> orgRoleList) {
    this.orgRoleList = orgRoleList;
  }


  public OrganizationMemberWithRoles teamRoleList(List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> teamRoleList) {
    this.teamRoleList = teamRoleList;
    return this;
  }

  public OrganizationMemberWithRoles addTeamRoleListItem(RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner teamRoleListItem) {
    if (this.teamRoleList == null) {
      this.teamRoleList = new ArrayList<>();
    }
    this.teamRoleList.add(teamRoleListItem);
    return this;
  }

   /**
   * Get teamRoleList
   * @return teamRoleList
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEAM_ROLE_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> getTeamRoleList() {
    return teamRoleList;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_ROLE_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTeamRoleList(List<RetrieveAnOrganizationMember200ResponseGroupOrgRolesInner> teamRoleList) {
    this.teamRoleList = teamRoleList;
  }


  /**
   * Return true if this OrganizationMemberWithRoles object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationMemberWithRoles organizationMemberWithRoles = (OrganizationMemberWithRoles) o;
    return Objects.equals(this.externalUsers, organizationMemberWithRoles.externalUsers) &&
        Objects.equals(this.id, organizationMemberWithRoles.id) &&
        Objects.equals(this.email, organizationMemberWithRoles.email) &&
        Objects.equals(this.name, organizationMemberWithRoles.name) &&
        Objects.equals(this.user, organizationMemberWithRoles.user) &&
        Objects.equals(this.role, organizationMemberWithRoles.role) &&
        Objects.equals(this.roleName, organizationMemberWithRoles.roleName) &&
        Objects.equals(this.orgRole, organizationMemberWithRoles.orgRole) &&
        Objects.equals(this.groupOrgRoles, organizationMemberWithRoles.groupOrgRoles) &&
        Objects.equals(this.pending, organizationMemberWithRoles.pending) &&
        Objects.equals(this.expired, organizationMemberWithRoles.expired) &&
        Objects.equals(this.flags, organizationMemberWithRoles.flags) &&
        Objects.equals(this.dateCreated, organizationMemberWithRoles.dateCreated) &&
        Objects.equals(this.inviteStatus, organizationMemberWithRoles.inviteStatus) &&
        Objects.equals(this.inviterName, organizationMemberWithRoles.inviterName) &&
        Objects.equals(this.teams, organizationMemberWithRoles.teams) &&
        Objects.equals(this.teamRoles, organizationMemberWithRoles.teamRoles) &&
        Objects.equals(this.inviteLink, organizationMemberWithRoles.inviteLink) &&
        Objects.equals(this.isOnlyOwner, organizationMemberWithRoles.isOnlyOwner) &&
        Objects.equals(this.roles, organizationMemberWithRoles.roles) &&
        Objects.equals(this.orgRoleList, organizationMemberWithRoles.orgRoleList) &&
        Objects.equals(this.teamRoleList, organizationMemberWithRoles.teamRoleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUsers, id, email, name, user, role, roleName, orgRole, groupOrgRoles, pending, expired, flags, dateCreated, inviteStatus, inviterName, teams, teamRoles, inviteLink, isOnlyOwner, roles, orgRoleList, teamRoleList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationMemberWithRoles {\n");
    sb.append("    externalUsers: ").append(toIndentedString(externalUsers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    orgRole: ").append(toIndentedString(orgRole)).append("\n");
    sb.append("    groupOrgRoles: ").append(toIndentedString(groupOrgRoles)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    inviteStatus: ").append(toIndentedString(inviteStatus)).append("\n");
    sb.append("    inviterName: ").append(toIndentedString(inviterName)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    teamRoles: ").append(toIndentedString(teamRoles)).append("\n");
    sb.append("    inviteLink: ").append(toIndentedString(inviteLink)).append("\n");
    sb.append("    isOnlyOwner: ").append(toIndentedString(isOnlyOwner)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    orgRoleList: ").append(toIndentedString(orgRoleList)).append("\n");
    sb.append("    teamRoleList: ").append(toIndentedString(teamRoleList)).append("\n");
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

