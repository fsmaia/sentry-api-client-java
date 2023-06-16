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
import com.sentry.api.client.model.ListAnOrganizationSUsers200ResponseInnerUserEmailsInner;
import com.sentry.api.client.model.RetrieveATeam200ResponseAvatar;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnOrganizationSUsers200ResponseInnerUser
 */
@JsonPropertyOrder({
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_USERNAME,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_LAST_LOGIN,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_IS_SUPERUSER,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_IS_MANAGED,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_LAST_ACTIVE,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_IS_STAFF,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_ID,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_IS_ACTIVE,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_HAS2FA,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_NAME,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_AVATAR_URL,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_DATE_JOINED,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_EMAILS,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_AVATAR,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_HAS_PASSWORD_AUTH,
  ListAnOrganizationSUsers200ResponseInnerUser.JSON_PROPERTY_EMAIL
})
@JsonTypeName("List_an_Organization_s_Users_200_response_inner_user")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class ListAnOrganizationSUsers200ResponseInnerUser {
  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_LAST_LOGIN = "lastLogin";
  private String lastLogin;

  public static final String JSON_PROPERTY_IS_SUPERUSER = "isSuperuser";
  private Boolean isSuperuser;

  public static final String JSON_PROPERTY_IS_MANAGED = "isManaged";
  private Boolean isManaged;

  public static final String JSON_PROPERTY_LAST_ACTIVE = "lastActive";
  private String lastActive;

  public static final String JSON_PROPERTY_IS_STAFF = "isStaff";
  private Boolean isStaff;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  private Boolean isActive;

  public static final String JSON_PROPERTY_HAS2FA = "has2fa";
  private Boolean has2fa;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  private String avatarUrl;

  public static final String JSON_PROPERTY_DATE_JOINED = "dateJoined";
  private String dateJoined;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<ListAnOrganizationSUsers200ResponseInnerUserEmailsInner> emails = new ArrayList<>();

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private RetrieveATeam200ResponseAvatar avatar;

  public static final String JSON_PROPERTY_HAS_PASSWORD_AUTH = "hasPasswordAuth";
  private Boolean hasPasswordAuth;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public ListAnOrganizationSUsers200ResponseInnerUser() { 
  }

  public ListAnOrganizationSUsers200ResponseInnerUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastLogin() {
    return lastLogin;
  }


  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser isSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
    return this;
  }

   /**
   * Get isSuperuser
   * @return isSuperuser
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_SUPERUSER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsSuperuser() {
    return isSuperuser;
  }


  @JsonProperty(JSON_PROPERTY_IS_SUPERUSER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser isManaged(Boolean isManaged) {
    this.isManaged = isManaged;
    return this;
  }

   /**
   * Get isManaged
   * @return isManaged
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_MANAGED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsManaged() {
    return isManaged;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANAGED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsManaged(Boolean isManaged) {
    this.isManaged = isManaged;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser lastActive(String lastActive) {
    this.lastActive = lastActive;
    return this;
  }

   /**
   * Get lastActive
   * @return lastActive
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastActive() {
    return lastActive;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastActive(String lastActive) {
    this.lastActive = lastActive;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser isStaff(Boolean isStaff) {
    this.isStaff = isStaff;
    return this;
  }

   /**
   * Get isStaff
   * @return isStaff
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_STAFF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsStaff() {
    return isStaff;
  }


  @JsonProperty(JSON_PROPERTY_IS_STAFF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsStaff(Boolean isStaff) {
    this.isStaff = isStaff;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser id(String id) {
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


  public ListAnOrganizationSUsers200ResponseInnerUser isActive(Boolean isActive) {
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


  public ListAnOrganizationSUsers200ResponseInnerUser has2fa(Boolean has2fa) {
    this.has2fa = has2fa;
    return this;
  }

   /**
   * Get has2fa
   * @return has2fa
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS2FA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHas2fa() {
    return has2fa;
  }


  @JsonProperty(JSON_PROPERTY_HAS2FA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHas2fa(Boolean has2fa) {
    this.has2fa = has2fa;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser name(String name) {
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


  public ListAnOrganizationSUsers200ResponseInnerUser avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAvatarUrl() {
    return avatarUrl;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser dateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

   /**
   * Get dateJoined
   * @return dateJoined
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_JOINED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDateJoined() {
    return dateJoined;
  }


  @JsonProperty(JSON_PROPERTY_DATE_JOINED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser emails(List<ListAnOrganizationSUsers200ResponseInnerUserEmailsInner> emails) {
    this.emails = emails;
    return this;
  }

  public ListAnOrganizationSUsers200ResponseInnerUser addEmailsItem(ListAnOrganizationSUsers200ResponseInnerUserEmailsInner emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ListAnOrganizationSUsers200ResponseInnerUserEmailsInner> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmails(List<ListAnOrganizationSUsers200ResponseInnerUserEmailsInner> emails) {
    this.emails = emails;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser avatar(RetrieveATeam200ResponseAvatar avatar) {
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

  public RetrieveATeam200ResponseAvatar getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvatar(RetrieveATeam200ResponseAvatar avatar) {
    this.avatar = avatar;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser hasPasswordAuth(Boolean hasPasswordAuth) {
    this.hasPasswordAuth = hasPasswordAuth;
    return this;
  }

   /**
   * Get hasPasswordAuth
   * @return hasPasswordAuth
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_PASSWORD_AUTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasPasswordAuth() {
    return hasPasswordAuth;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PASSWORD_AUTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasPasswordAuth(Boolean hasPasswordAuth) {
    this.hasPasswordAuth = hasPasswordAuth;
  }


  public ListAnOrganizationSUsers200ResponseInnerUser email(String email) {
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


  /**
   * Return true if this List_an_Organization_s_Users_200_response_inner_user object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSUsers200ResponseInnerUser listAnOrganizationSUsers200ResponseInnerUser = (ListAnOrganizationSUsers200ResponseInnerUser) o;
    return Objects.equals(this.username, listAnOrganizationSUsers200ResponseInnerUser.username) &&
        Objects.equals(this.lastLogin, listAnOrganizationSUsers200ResponseInnerUser.lastLogin) &&
        Objects.equals(this.isSuperuser, listAnOrganizationSUsers200ResponseInnerUser.isSuperuser) &&
        Objects.equals(this.isManaged, listAnOrganizationSUsers200ResponseInnerUser.isManaged) &&
        Objects.equals(this.lastActive, listAnOrganizationSUsers200ResponseInnerUser.lastActive) &&
        Objects.equals(this.isStaff, listAnOrganizationSUsers200ResponseInnerUser.isStaff) &&
        Objects.equals(this.id, listAnOrganizationSUsers200ResponseInnerUser.id) &&
        Objects.equals(this.isActive, listAnOrganizationSUsers200ResponseInnerUser.isActive) &&
        Objects.equals(this.has2fa, listAnOrganizationSUsers200ResponseInnerUser.has2fa) &&
        Objects.equals(this.name, listAnOrganizationSUsers200ResponseInnerUser.name) &&
        Objects.equals(this.avatarUrl, listAnOrganizationSUsers200ResponseInnerUser.avatarUrl) &&
        Objects.equals(this.dateJoined, listAnOrganizationSUsers200ResponseInnerUser.dateJoined) &&
        Objects.equals(this.emails, listAnOrganizationSUsers200ResponseInnerUser.emails) &&
        Objects.equals(this.avatar, listAnOrganizationSUsers200ResponseInnerUser.avatar) &&
        Objects.equals(this.hasPasswordAuth, listAnOrganizationSUsers200ResponseInnerUser.hasPasswordAuth) &&
        Objects.equals(this.email, listAnOrganizationSUsers200ResponseInnerUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, lastLogin, isSuperuser, isManaged, lastActive, isStaff, id, isActive, has2fa, name, avatarUrl, dateJoined, emails, avatar, hasPasswordAuth, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSUsers200ResponseInnerUser {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
    sb.append("    isManaged: ").append(toIndentedString(isManaged)).append("\n");
    sb.append("    lastActive: ").append(toIndentedString(lastActive)).append("\n");
    sb.append("    isStaff: ").append(toIndentedString(isStaff)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    has2fa: ").append(toIndentedString(has2fa)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    hasPasswordAuth: ").append(toIndentedString(hasPasswordAuth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

