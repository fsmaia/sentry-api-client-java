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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserAvatar;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserEmailsInner;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200ResponseUserIdentitiesInner;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sentry.api.client.JSON;

/**
 * RetrieveAnOrganizationMember200ResponseUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:40:29.777755Z[Etc/UTC]")
public class RetrieveAnOrganizationMember200ResponseUser {
  public static final String SERIALIZED_NAME_IDENTITIES = "identities";
  @SerializedName(SERIALIZED_NAME_IDENTITIES)
  private List<RetrieveAnOrganizationMember200ResponseUserIdentitiesInner> identities;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private RetrieveAnOrganizationMember200ResponseUserAvatar avatar;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatarUrl";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_HAS_PASSWORD_AUTH = "hasPasswordAuth";
  @SerializedName(SERIALIZED_NAME_HAS_PASSWORD_AUTH)
  private Boolean hasPasswordAuth;

  public static final String SERIALIZED_NAME_IS_MANAGED = "isManaged";
  @SerializedName(SERIALIZED_NAME_IS_MANAGED)
  private Boolean isManaged;

  public static final String SERIALIZED_NAME_DATE_JOINED = "dateJoined";
  @SerializedName(SERIALIZED_NAME_DATE_JOINED)
  private OffsetDateTime dateJoined;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "lastLogin";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_HAS2FA = "has2fa";
  @SerializedName(SERIALIZED_NAME_HAS2FA)
  private Boolean has2fa;

  public static final String SERIALIZED_NAME_LAST_ACTIVE = "lastActive";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVE)
  private OffsetDateTime lastActive;

  public static final String SERIALIZED_NAME_IS_SUPERUSER = "isSuperuser";
  @SerializedName(SERIALIZED_NAME_IS_SUPERUSER)
  private Boolean isSuperuser;

  public static final String SERIALIZED_NAME_IS_STAFF = "isStaff";
  @SerializedName(SERIALIZED_NAME_IS_STAFF)
  private Boolean isStaff;

  public static final String SERIALIZED_NAME_EXPERIMENTS = "experiments";
  @SerializedName(SERIALIZED_NAME_EXPERIMENTS)
  private Map<String, Object> experiments = new HashMap<>();

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
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
  @javax.annotation.Nullable
  public List<RetrieveAnOrganizationMember200ResponseUserIdentitiesInner> getIdentities() {
    return identities;
  }


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
  @javax.annotation.Nullable
  public RetrieveAnOrganizationMember200ResponseUserAvatar getAvatar() {
    return avatar;
  }


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
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


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
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


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
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }


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
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


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
  @javax.annotation.Nonnull
  public String getAvatarUrl() {
    return avatarUrl;
  }


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
  @javax.annotation.Nonnull
  public Boolean getIsActive() {
    return isActive;
  }


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
  @javax.annotation.Nonnull
  public Boolean getHasPasswordAuth() {
    return hasPasswordAuth;
  }


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
  @javax.annotation.Nonnull
  public Boolean getIsManaged() {
    return isManaged;
  }


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
  @javax.annotation.Nonnull
  public OffsetDateTime getDateJoined() {
    return dateJoined;
  }


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
  @javax.annotation.Nonnull
  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }


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
  @javax.annotation.Nonnull
  public Boolean getHas2fa() {
    return has2fa;
  }


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
  @javax.annotation.Nonnull
  public OffsetDateTime getLastActive() {
    return lastActive;
  }


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
  @javax.annotation.Nonnull
  public Boolean getIsSuperuser() {
    return isSuperuser;
  }


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
  @javax.annotation.Nonnull
  public Boolean getIsStaff() {
    return isStaff;
  }


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
  @javax.annotation.Nonnull
  public Map<String, Object> getExperiments() {
    return experiments;
  }


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
  @javax.annotation.Nonnull
  public List<RetrieveAnOrganizationMember200ResponseUserEmailsInner> getEmails() {
    return emails;
  }


  public void setEmails(List<RetrieveAnOrganizationMember200ResponseUserEmailsInner> emails) {
    this.emails = emails;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("identities");
    openapiFields.add("avatar");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("username");
    openapiFields.add("email");
    openapiFields.add("avatarUrl");
    openapiFields.add("isActive");
    openapiFields.add("hasPasswordAuth");
    openapiFields.add("isManaged");
    openapiFields.add("dateJoined");
    openapiFields.add("lastLogin");
    openapiFields.add("has2fa");
    openapiFields.add("lastActive");
    openapiFields.add("isSuperuser");
    openapiFields.add("isStaff");
    openapiFields.add("experiments");
    openapiFields.add("emails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("username");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("avatarUrl");
    openapiRequiredFields.add("isActive");
    openapiRequiredFields.add("hasPasswordAuth");
    openapiRequiredFields.add("isManaged");
    openapiRequiredFields.add("dateJoined");
    openapiRequiredFields.add("lastLogin");
    openapiRequiredFields.add("has2fa");
    openapiRequiredFields.add("lastActive");
    openapiRequiredFields.add("isSuperuser");
    openapiRequiredFields.add("isStaff");
    openapiRequiredFields.add("experiments");
    openapiRequiredFields.add("emails");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveAnOrganizationMember200ResponseUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveAnOrganizationMember200ResponseUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveAnOrganizationMember200ResponseUser is not found in the empty JSON string", RetrieveAnOrganizationMember200ResponseUser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveAnOrganizationMember200ResponseUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveAnOrganizationMember200ResponseUser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveAnOrganizationMember200ResponseUser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("identities") != null && !jsonObj.get("identities").isJsonNull()) {
        JsonArray jsonArrayidentities = jsonObj.getAsJsonArray("identities");
        if (jsonArrayidentities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("identities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `identities` to be an array in the JSON string but got `%s`", jsonObj.get("identities").toString()));
          }

          // validate the optional field `identities` (array)
          for (int i = 0; i < jsonArrayidentities.size(); i++) {
            RetrieveAnOrganizationMember200ResponseUserIdentitiesInner.validateJsonObject(jsonArrayidentities.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `avatar`
      if (jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonNull()) {
        RetrieveAnOrganizationMember200ResponseUserAvatar.validateJsonObject(jsonObj.getAsJsonObject("avatar"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("avatarUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUrl").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emails` to be an array in the JSON string but got `%s`", jsonObj.get("emails").toString()));
      }

      JsonArray jsonArrayemails = jsonObj.getAsJsonArray("emails");
      // validate the required field `emails` (array)
      for (int i = 0; i < jsonArrayemails.size(); i++) {
        RetrieveAnOrganizationMember200ResponseUserEmailsInner.validateJsonObject(jsonArrayemails.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveAnOrganizationMember200ResponseUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveAnOrganizationMember200ResponseUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveAnOrganizationMember200ResponseUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveAnOrganizationMember200ResponseUser.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveAnOrganizationMember200ResponseUser>() {
           @Override
           public void write(JsonWriter out, RetrieveAnOrganizationMember200ResponseUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveAnOrganizationMember200ResponseUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveAnOrganizationMember200ResponseUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveAnOrganizationMember200ResponseUser
  * @throws IOException if the JSON string is invalid with respect to RetrieveAnOrganizationMember200ResponseUser
  */
  public static RetrieveAnOrganizationMember200ResponseUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAnOrganizationMember200ResponseUser.class);
  }

 /**
  * Convert an instance of RetrieveAnOrganizationMember200ResponseUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

