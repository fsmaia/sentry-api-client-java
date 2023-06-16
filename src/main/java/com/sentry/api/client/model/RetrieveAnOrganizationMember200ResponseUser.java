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
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserAvatar;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserEmailsInner;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserIdentitiesInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * RetrieveAnOrganizationMember200ResponseUser
 */
@JsonPropertyOrder({
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_IDENTITIES,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_AVATAR,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_ID,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_NAME,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_USERNAME,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_EMAIL,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_AVATAR_URL,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_IS_ACTIVE,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_HAS_PASSWORD_AUTH,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_IS_MANAGED,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_DATE_JOINED,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_LAST_LOGIN,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_HAS2FA,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_LAST_ACTIVE,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_IS_SUPERUSER,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_IS_STAFF,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_EXPERIMENTS,
  RetrieveAnOrganizationMember200ResponseUser.JSON_PROPERTY_EMAILS
})
@JsonTypeName("Retrieve_an_Organization_Member_200_response_user")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseUser {
  public static final String JSON_PROPERTY_IDENTITIES = "identities";
  private List<RetrieveAnOrganizationMember200ResponseUserIdentitiesInner> identities;

  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private RetrieveAnOrganizationMember200ResponseUserAvatar avatar;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  private String avatarUrl;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  private Boolean isActive;

  public static final String JSON_PROPERTY_HAS_PASSWORD_AUTH = "hasPasswordAuth";
  private Boolean hasPasswordAuth;

  public static final String JSON_PROPERTY_IS_MANAGED = "isManaged";
  private Boolean isManaged;

  public static final String JSON_PROPERTY_DATE_JOINED = "dateJoined";
  private OffsetDateTime dateJoined;

  public static final String JSON_PROPERTY_LAST_LOGIN = "lastLogin";
  private OffsetDateTime lastLogin;

  public static final String JSON_PROPERTY_HAS2FA = "has2fa";
  private Boolean has2fa;

  public static final String JSON_PROPERTY_LAST_ACTIVE = "lastActive";
  private OffsetDateTime lastActive;

  public static final String JSON_PROPERTY_IS_SUPERUSER = "isSuperuser";
  private Boolean isSuperuser;

  public static final String JSON_PROPERTY_IS_STAFF = "isStaff";
  private Boolean isStaff;

  public static final String JSON_PROPERTY_EXPERIMENTS = "experiments";
  private Map<String, Object> experiments = new HashMap<>();

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<RetrieveAnOrganizationMember200ResponseUserEmailsInner> emails = new ArrayList<>();

  public RetrieveAnOrganizationMember200ResponseUser() { 
  }

  public RetrieveAnOrganizationMember200ResponseUser identities(List<RetrieveAnOrganizationMember200ResponseUserIdentitiesInner> identities) {
    this.identities = identities;
    return this;
  }

  public RetrieveAnOrganizationMember200ResponseUser addIdentitiesItem(RetrieveAnOrganizationMember200ResponseUserIdentitiesInner identitiesItem) {
    if (this.identities == null) {
      this.identities = new ArrayList<>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * Get identities
   * @return identities
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetrieveAnOrganizationMember200ResponseUserIdentitiesInner> getIdentities() {
    return identities;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentities(List<RetrieveAnOrganizationMember200ResponseUserIdentitiesInner> identities) {
    this.identities = identities;
  }


  public RetrieveAnOrganizationMember200ResponseUser avatar(RetrieveAnOrganizationMember200ResponseUserAvatar avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetrieveAnOrganizationMember200ResponseUserAvatar getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvatar(RetrieveAnOrganizationMember200ResponseUserAvatar avatar) {
    this.avatar = avatar;
  }


  public RetrieveAnOrganizationMember200ResponseUser id(String id) {
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


  public RetrieveAnOrganizationMember200ResponseUser name(String name) {
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


  public RetrieveAnOrganizationMember200ResponseUser username(String username) {
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


  public RetrieveAnOrganizationMember200ResponseUser email(String email) {
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


  public RetrieveAnOrganizationMember200ResponseUser avatarUrl(String avatarUrl) {
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


  public RetrieveAnOrganizationMember200ResponseUser isActive(Boolean isActive) {
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


  public RetrieveAnOrganizationMember200ResponseUser hasPasswordAuth(Boolean hasPasswordAuth) {
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


  public RetrieveAnOrganizationMember200ResponseUser isManaged(Boolean isManaged) {
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


  public RetrieveAnOrganizationMember200ResponseUser dateJoined(OffsetDateTime dateJoined) {
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

  public OffsetDateTime getDateJoined() {
    return dateJoined;
  }


  @JsonProperty(JSON_PROPERTY_DATE_JOINED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateJoined(OffsetDateTime dateJoined) {
    this.dateJoined = dateJoined;
  }


  public RetrieveAnOrganizationMember200ResponseUser lastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }


  @JsonProperty(JSON_PROPERTY_LAST_LOGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public RetrieveAnOrganizationMember200ResponseUser has2fa(Boolean has2fa) {
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


  public RetrieveAnOrganizationMember200ResponseUser lastActive(OffsetDateTime lastActive) {
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

  public OffsetDateTime getLastActive() {
    return lastActive;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastActive(OffsetDateTime lastActive) {
    this.lastActive = lastActive;
  }


  public RetrieveAnOrganizationMember200ResponseUser isSuperuser(Boolean isSuperuser) {
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


  public RetrieveAnOrganizationMember200ResponseUser isStaff(Boolean isStaff) {
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


  public RetrieveAnOrganizationMember200ResponseUser experiments(Map<String, Object> experiments) {
    this.experiments = experiments;
    return this;
  }

  public RetrieveAnOrganizationMember200ResponseUser putExperimentsItem(String key, Object experimentsItem) {
    if (this.experiments == null) {
      this.experiments = new HashMap<>();
    }
    this.experiments.put(key, experimentsItem);
    return this;
  }

   /**
   * Get experiments
   * @return experiments
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPERIMENTS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getExperiments() {
    return experiments;
  }


  @JsonProperty(JSON_PROPERTY_EXPERIMENTS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setExperiments(Map<String, Object> experiments) {
    this.experiments = experiments;
  }


  public RetrieveAnOrganizationMember200ResponseUser emails(List<RetrieveAnOrganizationMember200ResponseUserEmailsInner> emails) {
    this.emails = emails;
    return this;
  }

  public RetrieveAnOrganizationMember200ResponseUser addEmailsItem(RetrieveAnOrganizationMember200ResponseUserEmailsInner emailsItem) {
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

  public List<RetrieveAnOrganizationMember200ResponseUserEmailsInner> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmails(List<RetrieveAnOrganizationMember200ResponseUserEmailsInner> emails) {
    this.emails = emails;
  }


  /**
   * Return true if this Retrieve_an_Organization_Member_200_response_user object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAnOrganizationMember200ResponseUser retrieveAnOrganizationMember200ResponseUser = (RetrieveAnOrganizationMember200ResponseUser) o;
    return Objects.equals(this.identities, retrieveAnOrganizationMember200ResponseUser.identities) &&
        Objects.equals(this.avatar, retrieveAnOrganizationMember200ResponseUser.avatar) &&
        Objects.equals(this.id, retrieveAnOrganizationMember200ResponseUser.id) &&
        Objects.equals(this.name, retrieveAnOrganizationMember200ResponseUser.name) &&
        Objects.equals(this.username, retrieveAnOrganizationMember200ResponseUser.username) &&
        Objects.equals(this.email, retrieveAnOrganizationMember200ResponseUser.email) &&
        Objects.equals(this.avatarUrl, retrieveAnOrganizationMember200ResponseUser.avatarUrl) &&
        Objects.equals(this.isActive, retrieveAnOrganizationMember200ResponseUser.isActive) &&
        Objects.equals(this.hasPasswordAuth, retrieveAnOrganizationMember200ResponseUser.hasPasswordAuth) &&
        Objects.equals(this.isManaged, retrieveAnOrganizationMember200ResponseUser.isManaged) &&
        Objects.equals(this.dateJoined, retrieveAnOrganizationMember200ResponseUser.dateJoined) &&
        Objects.equals(this.lastLogin, retrieveAnOrganizationMember200ResponseUser.lastLogin) &&
        Objects.equals(this.has2fa, retrieveAnOrganizationMember200ResponseUser.has2fa) &&
        Objects.equals(this.lastActive, retrieveAnOrganizationMember200ResponseUser.lastActive) &&
        Objects.equals(this.isSuperuser, retrieveAnOrganizationMember200ResponseUser.isSuperuser) &&
        Objects.equals(this.isStaff, retrieveAnOrganizationMember200ResponseUser.isStaff) &&
        Objects.equals(this.experiments, retrieveAnOrganizationMember200ResponseUser.experiments) &&
        Objects.equals(this.emails, retrieveAnOrganizationMember200ResponseUser.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identities, avatar, id, name, username, email, avatarUrl, isActive, hasPasswordAuth, isManaged, dateJoined, lastLogin, has2fa, lastActive, isSuperuser, isStaff, experiments, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAnOrganizationMember200ResponseUser {\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    hasPasswordAuth: ").append(toIndentedString(hasPasswordAuth)).append("\n");
    sb.append("    isManaged: ").append(toIndentedString(isManaged)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    has2fa: ").append(toIndentedString(has2fa)).append("\n");
    sb.append("    lastActive: ").append(toIndentedString(lastActive)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
    sb.append("    isStaff: ").append(toIndentedString(isStaff)).append("\n");
    sb.append("    experiments: ").append(toIndentedString(experiments)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

