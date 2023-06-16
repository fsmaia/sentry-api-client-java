package com.sentry.api.client.api;

import com.sentry.api.client.ApiException;
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiResponse;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.sentry.api.client.model.ListARepositorySCommits200ResponseInner;
import com.sentry.api.client.model.ListAnOrganizationSProjects200ResponseInner;
import com.sentry.api.client.model.ListAnOrganizationSRepositories200ResponseInner;
import com.sentry.api.client.model.ListAnOrganizationSUsers200ResponseInner;
import java.time.OffsetDateTime;
import com.sentry.api.client.model.ResolveAShortID200Response;
import com.sentry.api.client.model.ResolveAnEventID200Response;
import com.sentry.api.client.model.RetrieveATeam200ResponseOrganization;
import com.sentry.api.client.model.RetrieveAnOrganization200Response;
import com.sentry.api.client.model.RetrieveAnOrganizationMember200Response;
import com.sentry.api.client.model.RetrieveEventCountsForAnOrganizationV2200Response;
import com.sentry.api.client.model.UpdateAnOrganizationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class OrganizationsApi {
  private ApiClient apiClient;

  public OrganizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Remove an organization member.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The member ID. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAnOrganizationMember(String organizationSlug, String memberId) throws ApiException {
    deleteAnOrganizationMemberWithHttpInfo(organizationSlug, memberId);
  }

  /**
   * 
   * Remove an organization member.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The member ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAnOrganizationMemberWithHttpInfo(String organizationSlug, String memberId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling deleteAnOrganizationMember");
    }
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling deleteAnOrganizationMember");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/members/{member_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{member_id}", apiClient.escapeString(memberId));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("OrganizationsApi.deleteAnOrganizationMember", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Return a list of commits for a given repository.
   * @param organizationSlug The organization short name. (required)
   * @param repoId The repository ID. (required)
   * @return List&lt;ListARepositorySCommits200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListARepositorySCommits200ResponseInner> listARepositorysCommits(String organizationSlug, String repoId) throws ApiException {
    return listARepositorysCommitsWithHttpInfo(organizationSlug, repoId).getData();
  }

  /**
   * 
   * Return a list of commits for a given repository.
   * @param organizationSlug The organization short name. (required)
   * @param repoId The repository ID. (required)
   * @return ApiResponse&lt;List&lt;ListARepositorySCommits200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListARepositorySCommits200ResponseInner>> listARepositorysCommitsWithHttpInfo(String organizationSlug, String repoId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listARepositorysCommits");
    }
    if (repoId == null) {
      throw new ApiException(400, "Missing the required parameter 'repoId' when calling listARepositorysCommits");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/repos/{repo_id}/commits/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{repo_id}", apiClient.escapeString(repoId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListARepositorySCommits200ResponseInner>> localVarReturnType = new GenericType<List<ListARepositorySCommits200ResponseInner>>() {};
    return apiClient.invokeAPI("OrganizationsApi.listARepositorysCommits", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of projects bound to a organization.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return List&lt;ListAnOrganizationSProjects200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnOrganizationSProjects200ResponseInner> listAnOrganizationsProjects(String organizationSlug, String cursor) throws ApiException {
    return listAnOrganizationsProjectsWithHttpInfo(organizationSlug, cursor).getData();
  }

  /**
   * 
   * Return a list of projects bound to a organization.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return ApiResponse&lt;List&lt;ListAnOrganizationSProjects200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnOrganizationSProjects200ResponseInner>> listAnOrganizationsProjectsWithHttpInfo(String organizationSlug, String cursor) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsProjects");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/projects/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "cursor", cursor)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnOrganizationSProjects200ResponseInner>> localVarReturnType = new GenericType<List<ListAnOrganizationSProjects200ResponseInner>>() {};
    return apiClient.invokeAPI("OrganizationsApi.listAnOrganizationsProjects", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of version control repositories for a given organization.
   * @param organizationSlug The organization short name. (required)
   * @return List&lt;ListAnOrganizationSRepositories200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnOrganizationSRepositories200ResponseInner> listAnOrganizationsRepositories(String organizationSlug) throws ApiException {
    return listAnOrganizationsRepositoriesWithHttpInfo(organizationSlug).getData();
  }

  /**
   * 
   * Return a list of version control repositories for a given organization.
   * @param organizationSlug The organization short name. (required)
   * @return ApiResponse&lt;List&lt;ListAnOrganizationSRepositories200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnOrganizationSRepositories200ResponseInner>> listAnOrganizationsRepositoriesWithHttpInfo(String organizationSlug) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsRepositories");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/repos/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnOrganizationSRepositories200ResponseInner>> localVarReturnType = new GenericType<List<ListAnOrganizationSRepositories200ResponseInner>>() {};
    return apiClient.invokeAPI("OrganizationsApi.listAnOrganizationsRepositories", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of users that belong to a given organization.
   * @param organizationSlug The slug of the organization the event ID should be looked up in. (required)
   * @param project Restrict results to users who have access to a given project ID (optional)
   * @return List&lt;ListAnOrganizationSUsers200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnOrganizationSUsers200ResponseInner> listAnOrganizationsUsers(String organizationSlug, String project) throws ApiException {
    return listAnOrganizationsUsersWithHttpInfo(organizationSlug, project).getData();
  }

  /**
   * 
   * Return a list of users that belong to a given organization.
   * @param organizationSlug The slug of the organization the event ID should be looked up in. (required)
   * @param project Restrict results to users who have access to a given project ID (optional)
   * @return ApiResponse&lt;List&lt;ListAnOrganizationSUsers200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnOrganizationSUsers200ResponseInner>> listAnOrganizationsUsersWithHttpInfo(String organizationSlug, String project) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsUsers");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/users/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "project", project)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnOrganizationSUsers200ResponseInner>> localVarReturnType = new GenericType<List<ListAnOrganizationSUsers200ResponseInner>>() {};
    return apiClient.invokeAPI("OrganizationsApi.listAnOrganizationsUsers", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of organizations available to the authenticated session.  This is particularly useful for requests with an user bound context.  For API key based requests this will only return the organization that belongs to the key.
   * @param owner Restrict results to organizations in which you are an organization owner. (optional)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return List&lt;RetrieveATeam200ResponseOrganization&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public List<RetrieveATeam200ResponseOrganization> listYourOrganizations(Boolean owner, String cursor) throws ApiException {
    return listYourOrganizationsWithHttpInfo(owner, cursor).getData();
  }

  /**
   * 
   * Return a list of organizations available to the authenticated session.  This is particularly useful for requests with an user bound context.  For API key based requests this will only return the organization that belongs to the key.
   * @param owner Restrict results to organizations in which you are an organization owner. (optional)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return ApiResponse&lt;List&lt;RetrieveATeam200ResponseOrganization&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<RetrieveATeam200ResponseOrganization>> listYourOrganizationsWithHttpInfo(Boolean owner, String cursor) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "owner", owner)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<RetrieveATeam200ResponseOrganization>> localVarReturnType = new GenericType<List<RetrieveATeam200ResponseOrganization>>() {};
    return apiClient.invokeAPI("OrganizationsApi.listYourOrganizations", "/api/0/organizations/", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * This resolves a short ID to the project slug and internal issue ID.
   * @param organizationSlug The slug of the organization the short ID should be looked up in. (required)
   * @param shortId The short ID to look up. (required)
   * @return ResolveAShortID200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ResolveAShortID200Response resolveAShortID(String organizationSlug, String shortId) throws ApiException {
    return resolveAShortIDWithHttpInfo(organizationSlug, shortId).getData();
  }

  /**
   * 
   * This resolves a short ID to the project slug and internal issue ID.
   * @param organizationSlug The slug of the organization the short ID should be looked up in. (required)
   * @param shortId The short ID to look up. (required)
   * @return ApiResponse&lt;ResolveAShortID200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResolveAShortID200Response> resolveAShortIDWithHttpInfo(String organizationSlug, String shortId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling resolveAShortID");
    }
    if (shortId == null) {
      throw new ApiException(400, "Missing the required parameter 'shortId' when calling resolveAShortID");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/shortids/{short_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{short_id}", apiClient.escapeString(shortId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ResolveAShortID200Response> localVarReturnType = new GenericType<ResolveAShortID200Response>() {};
    return apiClient.invokeAPI("OrganizationsApi.resolveAShortID", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * This resolves an event ID to the project slug and internal issue ID and internal event ID.
   * @param organizationSlug The slug of the organization the event ID should be looked up in. (required)
   * @param eventId The event ID to look up. (required)
   * @return ResolveAnEventID200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ResolveAnEventID200Response resolveAnEventID(String organizationSlug, String eventId) throws ApiException {
    return resolveAnEventIDWithHttpInfo(organizationSlug, eventId).getData();
  }

  /**
   * 
   * This resolves an event ID to the project slug and internal issue ID and internal event ID.
   * @param organizationSlug The slug of the organization the event ID should be looked up in. (required)
   * @param eventId The event ID to look up. (required)
   * @return ApiResponse&lt;ResolveAnEventID200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResolveAnEventID200Response> resolveAnEventIDWithHttpInfo(String organizationSlug, String eventId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling resolveAnEventID");
    }
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling resolveAnEventID");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/eventids/{event_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{event_id}", apiClient.escapeString(eventId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ResolveAnEventID200Response> localVarReturnType = new GenericType<ResolveAnEventID200Response>() {};
    return apiClient.invokeAPI("OrganizationsApi.resolveAnEventID", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return details on an individual organization including various details such as membership access, features, and teams.
   * @param organizationSlug The slug of the organization to look up. (required)
   * @return RetrieveAnOrganization200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource does not exist </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveAnOrganization200Response retrieveAnOrganization(String organizationSlug) throws ApiException {
    return retrieveAnOrganizationWithHttpInfo(organizationSlug).getData();
  }

  /**
   * 
   * Return details on an individual organization including various details such as membership access, features, and teams.
   * @param organizationSlug The slug of the organization to look up. (required)
   * @return ApiResponse&lt;RetrieveAnOrganization200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveAnOrganization200Response> retrieveAnOrganizationWithHttpInfo(String organizationSlug) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveAnOrganization");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveAnOrganization200Response> localVarReturnType = new GenericType<RetrieveAnOrganization200Response>() {};
    return apiClient.invokeAPI("OrganizationsApi.retrieveAnOrganization", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Retrieve an organization member&#39;s details.  Will return a pending invite as long as it&#39;s already approved.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The member ID. (required)
   * @return RetrieveAnOrganizationMember200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveAnOrganizationMember200Response retrieveAnOrganizationMember(String organizationSlug, String memberId) throws ApiException {
    return retrieveAnOrganizationMemberWithHttpInfo(organizationSlug, memberId).getData();
  }

  /**
   * 
   * Retrieve an organization member&#39;s details.  Will return a pending invite as long as it&#39;s already approved.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The member ID. (required)
   * @return ApiResponse&lt;RetrieveAnOrganizationMember200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveAnOrganizationMember200Response> retrieveAnOrganizationMemberWithHttpInfo(String organizationSlug, String memberId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveAnOrganizationMember");
    }
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling retrieveAnOrganizationMember");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/members/{member_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{member_id}", apiClient.escapeString(memberId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveAnOrganizationMember200Response> localVarReturnType = new GenericType<RetrieveAnOrganizationMember200Response>() {};
    return apiClient.invokeAPI("OrganizationsApi.retrieveAnOrganizationMember", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * This endpoint is deprecated in favor of [Organization Stats V2](/api/organizations/retrieve-event-counts-for-an-organization-v2/).
   * @param organizationSlug The slug of the organization the event ID should be looked up in. (required)
   * @param stat The name of the stat to query &#x60;(\&quot;received\&quot;, \&quot;rejected\&quot;, \&quot;blacklisted\&quot;)&#x60;. (optional)
   * @param since A timestamp to set the start of the query in seconds since UNIX epoch. (optional)
   * @param until A timestamp to set the end of the query in seconds since UNIX epoch. (optional)
   * @param resolution An explicit resolution to search for (one of &#x60;10s&#x60;, &#x60;1h&#x60;, and &#x60;1d&#x60;). (optional)
   * @return List&lt;List&lt;Integer&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<List<Integer>> retrieveEventCountsForAnOrganization(String organizationSlug, String stat, OffsetDateTime since, OffsetDateTime until, String resolution) throws ApiException {
    return retrieveEventCountsForAnOrganizationWithHttpInfo(organizationSlug, stat, since, until, resolution).getData();
  }

  /**
   * 
   * This endpoint is deprecated in favor of [Organization Stats V2](/api/organizations/retrieve-event-counts-for-an-organization-v2/).
   * @param organizationSlug The slug of the organization the event ID should be looked up in. (required)
   * @param stat The name of the stat to query &#x60;(\&quot;received\&quot;, \&quot;rejected\&quot;, \&quot;blacklisted\&quot;)&#x60;. (optional)
   * @param since A timestamp to set the start of the query in seconds since UNIX epoch. (optional)
   * @param until A timestamp to set the end of the query in seconds since UNIX epoch. (optional)
   * @param resolution An explicit resolution to search for (one of &#x60;10s&#x60;, &#x60;1h&#x60;, and &#x60;1d&#x60;). (optional)
   * @return ApiResponse&lt;List&lt;List&lt;Integer&gt;&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<List<Integer>>> retrieveEventCountsForAnOrganizationWithHttpInfo(String organizationSlug, String stat, OffsetDateTime since, OffsetDateTime until, String resolution) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveEventCountsForAnOrganization");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/stats/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "stat", stat)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "until", until));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<List<Integer>>> localVarReturnType = new GenericType<List<List<Integer>>>() {};
    return apiClient.invokeAPI("OrganizationsApi.retrieveEventCountsForAnOrganization", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Query event counts for your Organization. Select a field, define a date range, and group or filter by columns.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param groupBy can pass multiple groupBy parameters to group by multiple, e.g. &#x60;groupBy&#x3D;project&amp;groupBy&#x3D;outcome&#x60; to group by multiple dimensions. Note that grouping by project can cause missing rows if the number of projects / interval is large. If you have a large number of projects, we recommend filtering and querying by them individually.Also note that grouping by projects does not currently support timeseries interval responses and will instead be a sum of the projectover the entire period specified. (required)
   * @param field the &#x60;sum(quantity)&#x60; field is bytes for attachments, and all others the &#39;event&#39; count for those types of events.  &#x60;sum(times_seen)&#x60; sums the number of times an event has been seen. For &#39;normal&#39; event types, this will be equal to &#x60;sum(quantity)&#x60; for now. For sessions, quantity will sum the total number of events seen in a session, while &#x60;times_seen&#x60; will be the unique number of sessions. and for attachments, &#x60;times_seen&#x60; will be the total number of attachments, while quantity will be the total sum of attachment bytes. (required)
   * @param statsPeriod This defines the range of the time series, relative to now. The range is given in a &#x60;&lt;number&gt;&lt;unit&gt;&#x60; format. For example &#x60;1d&#x60; for a one day range. Possible units are &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days and &#x60;w&#x60; for weeks.You must either provide a &#x60;statsPeriod&#x60;, or a &#x60;start&#x60; and &#x60;end&#x60;. (optional)
   * @param interval This is the resolution of the time series, given in the same format as &#x60;statsPeriod&#x60;. The default resolution is &#x60;1h&#x60; and the minimum resolution is currently restricted to &#x60;1h&#x60; as well. Intervals larger than &#x60;1d&#x60; are not supported, and the interval has to cleanly divide one day. (optional)
   * @param start This defines the start of the time series range as an explicit datetime, either in UTC ISO8601 or epoch seconds.Use along with &#x60;end&#x60; instead of &#x60;statsPeriod&#x60;. (optional)
   * @param end This defines the inclusive end of the time series range as an explicit datetime, either in UTC ISO8601 or epoch seconds.Use along with &#x60;start&#x60; instead of &#x60;statsPeriod&#x60;. (optional)
   * @param project The ID of the projects to filter by.  Use &#x60;-1&#x60; to include all accessible projects. (optional)
   * @param category If filtering by attachments, you cannot filter by any other category due to quantity values becoming nonsensical (combining bytes and event counts).  If filtering by &#x60;error&#x60;, it will automatically add &#x60;default&#x60; and &#x60;security&#x60; as we currently roll those two categories into &#x60;error&#x60; for displaying. (optional)
   * @param outcome See https://docs.sentry.io/product/stats/ for more information on outcome statuses. (optional)
   * @param reason The reason field will contain why an event was filtered/dropped. (optional)
   * @return RetrieveEventCountsForAnOrganizationV2200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveEventCountsForAnOrganizationV2200Response retrieveEventCountsForAnOrganizationV2(String organizationSlug, List<String> groupBy, String field, String statsPeriod, String interval, OffsetDateTime start, OffsetDateTime end, List<Object> project, String category, String outcome, String reason) throws ApiException {
    return retrieveEventCountsForAnOrganizationV2WithHttpInfo(organizationSlug, groupBy, field, statsPeriod, interval, start, end, project, category, outcome, reason).getData();
  }

  /**
   * 
   * Query event counts for your Organization. Select a field, define a date range, and group or filter by columns.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param groupBy can pass multiple groupBy parameters to group by multiple, e.g. &#x60;groupBy&#x3D;project&amp;groupBy&#x3D;outcome&#x60; to group by multiple dimensions. Note that grouping by project can cause missing rows if the number of projects / interval is large. If you have a large number of projects, we recommend filtering and querying by them individually.Also note that grouping by projects does not currently support timeseries interval responses and will instead be a sum of the projectover the entire period specified. (required)
   * @param field the &#x60;sum(quantity)&#x60; field is bytes for attachments, and all others the &#39;event&#39; count for those types of events.  &#x60;sum(times_seen)&#x60; sums the number of times an event has been seen. For &#39;normal&#39; event types, this will be equal to &#x60;sum(quantity)&#x60; for now. For sessions, quantity will sum the total number of events seen in a session, while &#x60;times_seen&#x60; will be the unique number of sessions. and for attachments, &#x60;times_seen&#x60; will be the total number of attachments, while quantity will be the total sum of attachment bytes. (required)
   * @param statsPeriod This defines the range of the time series, relative to now. The range is given in a &#x60;&lt;number&gt;&lt;unit&gt;&#x60; format. For example &#x60;1d&#x60; for a one day range. Possible units are &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days and &#x60;w&#x60; for weeks.You must either provide a &#x60;statsPeriod&#x60;, or a &#x60;start&#x60; and &#x60;end&#x60;. (optional)
   * @param interval This is the resolution of the time series, given in the same format as &#x60;statsPeriod&#x60;. The default resolution is &#x60;1h&#x60; and the minimum resolution is currently restricted to &#x60;1h&#x60; as well. Intervals larger than &#x60;1d&#x60; are not supported, and the interval has to cleanly divide one day. (optional)
   * @param start This defines the start of the time series range as an explicit datetime, either in UTC ISO8601 or epoch seconds.Use along with &#x60;end&#x60; instead of &#x60;statsPeriod&#x60;. (optional)
   * @param end This defines the inclusive end of the time series range as an explicit datetime, either in UTC ISO8601 or epoch seconds.Use along with &#x60;start&#x60; instead of &#x60;statsPeriod&#x60;. (optional)
   * @param project The ID of the projects to filter by.  Use &#x60;-1&#x60; to include all accessible projects. (optional)
   * @param category If filtering by attachments, you cannot filter by any other category due to quantity values becoming nonsensical (combining bytes and event counts).  If filtering by &#x60;error&#x60;, it will automatically add &#x60;default&#x60; and &#x60;security&#x60; as we currently roll those two categories into &#x60;error&#x60; for displaying. (optional)
   * @param outcome See https://docs.sentry.io/product/stats/ for more information on outcome statuses. (optional)
   * @param reason The reason field will contain why an event was filtered/dropped. (optional)
   * @return ApiResponse&lt;RetrieveEventCountsForAnOrganizationV2200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveEventCountsForAnOrganizationV2200Response> retrieveEventCountsForAnOrganizationV2WithHttpInfo(String organizationSlug, List<String> groupBy, String field, String statsPeriod, String interval, OffsetDateTime start, OffsetDateTime end, List<Object> project, String category, String outcome, String reason) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveEventCountsForAnOrganizationV2");
    }
    if (groupBy == null) {
      throw new ApiException(400, "Missing the required parameter 'groupBy' when calling retrieveEventCountsForAnOrganizationV2");
    }
    if (field == null) {
      throw new ApiException(400, "Missing the required parameter 'field' when calling retrieveEventCountsForAnOrganizationV2");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/stats_v2/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "statsPeriod", statsPeriod)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "field", field));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "project", project));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outcome", outcome));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reason", reason));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveEventCountsForAnOrganizationV2200Response> localVarReturnType = new GenericType<RetrieveEventCountsForAnOrganizationV2200Response>() {};
    return apiClient.invokeAPI("OrganizationsApi.retrieveEventCountsForAnOrganizationV2", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Update various attributes and configurable settings for the given organization.
   * @param organizationSlug The slug of the organization to update. (required)
   * @param updateAnOrganizationRequest  (optional)
   * @return RetrieveAnOrganization200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveAnOrganization200Response updateAnOrganization(String organizationSlug, UpdateAnOrganizationRequest updateAnOrganizationRequest) throws ApiException {
    return updateAnOrganizationWithHttpInfo(organizationSlug, updateAnOrganizationRequest).getData();
  }

  /**
   * 
   * Update various attributes and configurable settings for the given organization.
   * @param organizationSlug The slug of the organization to update. (required)
   * @param updateAnOrganizationRequest  (optional)
   * @return ApiResponse&lt;RetrieveAnOrganization200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveAnOrganization200Response> updateAnOrganizationWithHttpInfo(String organizationSlug, UpdateAnOrganizationRequest updateAnOrganizationRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateAnOrganization");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveAnOrganization200Response> localVarReturnType = new GenericType<RetrieveAnOrganization200Response>() {};
    return apiClient.invokeAPI("OrganizationsApi.updateAnOrganization", localVarPath, "PUT", new ArrayList<>(), updateAnOrganizationRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
