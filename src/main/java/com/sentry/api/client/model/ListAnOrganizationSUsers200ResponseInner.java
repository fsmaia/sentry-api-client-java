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
import com.sentry.api.client.model.ListAnOrganizationSUsers200ResponseInnerFlags;
import com.sentry.api.client.model.ListAnOrganizationSUsers200ResponseInnerUser;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ListAnOrganizationSUsers200ResponseInner
 */
@JsonPropertyOrder({
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_DATE_CREATED,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_USER,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_ROLE_NAME,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_EXPIRED,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_ID,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_PROJECTS,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_NAME,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_ROLE,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_FLAGS,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_EMAIL,
  ListAnOrganizationSUsers200ResponseInner.JSON_PROPERTY_PENDING
})
@JsonTypeName("List_an_Organization_s_Users_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class ListAnOrganizationSUsers200ResponseInner {
  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private String dateCreated;

  public static final String JSON_PROPERTY_USER = "user";
  private ListAnOrganizationSUsers200ResponseInnerUser user;

  public static final String JSON_PROPERTY_ROLE_NAME = "roleName";
  private String roleName;

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  private Boolean expired;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private List<String> projects = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    OWNER("owner"),
    
    MANAGER("manager"),
    
    ADMIN("admin"),
    
    MEMBER("member"),
    
    BILLING("billing");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;

  public static final String JSON_PROPERTY_FLAGS = "flags";
  private ListAnOrganizationSUsers200ResponseInnerFlags flags;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private Boolean pending;

  public ListAnOrganizationSUsers200ResponseInner() { 
  }

  public ListAnOrganizationSUsers200ResponseInner dateCreated(String dateCreated) {
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


  public ListAnOrganizationSUsers200ResponseInner user(ListAnOrganizationSUsers200ResponseInnerUser user) {
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

  public ListAnOrganizationSUsers200ResponseInnerUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUser(ListAnOrganizationSUsers200ResponseInnerUser user) {
    this.user = user;
  }


  public ListAnOrganizationSUsers200ResponseInner roleName(String roleName) {
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


  public ListAnOrganizationSUsers200ResponseInner expired(Boolean expired) {
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

  public Boolean getExpired() {
    return expired;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  public ListAnOrganizationSUsers200ResponseInner id(String id) {
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


  public ListAnOrganizationSUsers200ResponseInner projects(List<String> projects) {
    this.projects = projects;
    return this;
  }

  public ListAnOrganizationSUsers200ResponseInner addProjectsItem(String projectsItem) {
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getProjects() {
    return projects;
  }


  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjects(List<String> projects) {
    this.projects = projects;
  }


  public ListAnOrganizationSUsers200ResponseInner name(String name) {
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


  public ListAnOrganizationSUsers200ResponseInner role(RoleEnum role) {
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

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public ListAnOrganizationSUsers200ResponseInner flags(ListAnOrganizationSUsers200ResponseInnerFlags flags) {
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

  public ListAnOrganizationSUsers200ResponseInnerFlags getFlags() {
    return flags;
  }


  @JsonProperty(JSON_PROPERTY_FLAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlags(ListAnOrganizationSUsers200ResponseInnerFlags flags) {
    this.flags = flags;
  }


  public ListAnOrganizationSUsers200ResponseInner email(String email) {
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


  public ListAnOrganizationSUsers200ResponseInner pending(Boolean pending) {
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


  /**
   * Return true if this List_an_Organization_s_Users_200_response_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAnOrganizationSUsers200ResponseInner listAnOrganizationSUsers200ResponseInner = (ListAnOrganizationSUsers200ResponseInner) o;
    return Objects.equals(this.dateCreated, listAnOrganizationSUsers200ResponseInner.dateCreated) &&
        Objects.equals(this.user, listAnOrganizationSUsers200ResponseInner.user) &&
        Objects.equals(this.roleName, listAnOrganizationSUsers200ResponseInner.roleName) &&
        Objects.equals(this.expired, listAnOrganizationSUsers200ResponseInner.expired) &&
        Objects.equals(this.id, listAnOrganizationSUsers200ResponseInner.id) &&
        Objects.equals(this.projects, listAnOrganizationSUsers200ResponseInner.projects) &&
        Objects.equals(this.name, listAnOrganizationSUsers200ResponseInner.name) &&
        Objects.equals(this.role, listAnOrganizationSUsers200ResponseInner.role) &&
        Objects.equals(this.flags, listAnOrganizationSUsers200ResponseInner.flags) &&
        Objects.equals(this.email, listAnOrganizationSUsers200ResponseInner.email) &&
        Objects.equals(this.pending, listAnOrganizationSUsers200ResponseInner.pending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, user, roleName, expired, id, projects, name, role, flags, email, pending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAnOrganizationSUsers200ResponseInner {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

