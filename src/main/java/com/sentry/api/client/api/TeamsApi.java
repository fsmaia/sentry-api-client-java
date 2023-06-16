package com.sentry.api.client.api;

import com.sentry.api.client.ApiException;
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiResponse;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.sentry.api.client.model.CreateANewTeamRequest;
import com.sentry.api.client.model.ListAnOrganizationSProjects200ResponseInner;
import com.sentry.api.client.model.ListAnOrganizationSTeams200ResponseInner;
import java.time.OffsetDateTime;
import com.sentry.api.client.model.RetrieveATeam200Response;
import com.sentry.api.client.model.UpdateATeam200Response;
import com.sentry.api.client.model.UpdateATeamRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class TeamsApi {
  private ApiClient apiClient;

  public TeamsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeamsApi(ApiClient apiClient) {
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
   * Create a new team bound to an organization.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param name The name of the team. (required)
   * @param slug Optional slug for the team. If not provided a slug is generated from the name. (optional)
   * @param createANewTeamRequest  (optional)
   * @return ListAnOrganizationSTeams200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A team with this slug already exists. </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSTeams200ResponseInner createANewTeam(String organizationSlug, String name, String slug, CreateANewTeamRequest createANewTeamRequest) throws ApiException {
    return createANewTeamWithHttpInfo(organizationSlug, name, slug, createANewTeamRequest).getData();
  }

  /**
   * 
   * Create a new team bound to an organization.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param name The name of the team. (required)
   * @param slug Optional slug for the team. If not provided a slug is generated from the name. (optional)
   * @param createANewTeamRequest  (optional)
   * @return ApiResponse&lt;ListAnOrganizationSTeams200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A team with this slug already exists. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSTeams200ResponseInner> createANewTeamWithHttpInfo(String organizationSlug, String name, String slug, CreateANewTeamRequest createANewTeamRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling createANewTeam");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createANewTeam");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/teams/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "name", name)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "slug", slug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSTeams200ResponseInner> localVarReturnType = new GenericType<ListAnOrganizationSTeams200ResponseInner>() {};
    return apiClient.invokeAPI("TeamsApi.createANewTeam", localVarPath, "POST", localVarQueryParams, createANewTeamRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Schedules a team for deletion.  Note: Deletion happens asynchronously and therefore is not immediate. However once deletion has begun the state of a project changes and will be hidden from most public views.
   * @param organizationSlug The slug of the organization the team belongs to. (required)
   * @param teamSlug The slug of the team to get. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteATeam(String organizationSlug, String teamSlug) throws ApiException {
    deleteATeamWithHttpInfo(organizationSlug, teamSlug);
  }

  /**
   * 
   * Schedules a team for deletion.  Note: Deletion happens asynchronously and therefore is not immediate. However once deletion has begun the state of a project changes and will be hidden from most public views.
   * @param organizationSlug The slug of the organization the team belongs to. (required)
   * @param teamSlug The slug of the team to get. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteATeamWithHttpInfo(String organizationSlug, String teamSlug) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling deleteATeam");
    }
    if (teamSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'teamSlug' when calling deleteATeam");
    }

    // Path parameters
    String localVarPath = "/api/0/teams/{organization_slug}/{team_slug}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{team_slug}", apiClient.escapeString(teamSlug));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("TeamsApi.deleteATeam", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Return a list of projects bound to a team.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param teamSlug The slug of the team the resource belongs to. (required)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return List&lt;ListAnOrganizationSProjects200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found. </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnOrganizationSProjects200ResponseInner> listATeamsProjects(String organizationSlug, String teamSlug, String cursor) throws ApiException {
    return listATeamsProjectsWithHttpInfo(organizationSlug, teamSlug, cursor).getData();
  }

  /**
   * 
   * Return a list of projects bound to a team.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param teamSlug The slug of the team the resource belongs to. (required)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return ApiResponse&lt;List&lt;ListAnOrganizationSProjects200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnOrganizationSProjects200ResponseInner>> listATeamsProjectsWithHttpInfo(String organizationSlug, String teamSlug, String cursor) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listATeamsProjects");
    }
    if (teamSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'teamSlug' when calling listATeamsProjects");
    }

    // Path parameters
    String localVarPath = "/api/0/teams/{organization_slug}/{team_slug}/projects/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{team_slug}", apiClient.escapeString(teamSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "cursor", cursor)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnOrganizationSProjects200ResponseInner>> localVarReturnType = new GenericType<List<ListAnOrganizationSProjects200ResponseInner>>() {};
    return apiClient.invokeAPI("TeamsApi.listATeamsProjects", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Returns a list of teams bound to a organization.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param detailed Specify \&quot;0\&quot; to return team details that do not include projects (optional)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return List&lt;ListAnOrganizationSTeams200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnOrganizationSTeams200ResponseInner> listAnOrganizationsTeams(String organizationSlug, String detailed, String cursor) throws ApiException {
    return listAnOrganizationsTeamsWithHttpInfo(organizationSlug, detailed, cursor).getData();
  }

  /**
   * 
   * Returns a list of teams bound to a organization.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param detailed Specify \&quot;0\&quot; to return team details that do not include projects (optional)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return ApiResponse&lt;List&lt;ListAnOrganizationSTeams200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnOrganizationSTeams200ResponseInner>> listAnOrganizationsTeamsWithHttpInfo(String organizationSlug, String detailed, String cursor) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsTeams");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/teams/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "detailed", detailed)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnOrganizationSTeams200ResponseInner>> localVarReturnType = new GenericType<List<ListAnOrganizationSTeams200ResponseInner>>() {};
    return apiClient.invokeAPI("TeamsApi.listAnOrganizationsTeams", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return details on an individual team.
   * @param organizationSlug The slug of the organization the team belongs to. (required)
   * @param teamSlug The slug of the team to get. (required)
   * @return RetrieveATeam200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveATeam200Response retrieveATeam(String organizationSlug, String teamSlug) throws ApiException {
    return retrieveATeamWithHttpInfo(organizationSlug, teamSlug).getData();
  }

  /**
   * 
   * Return details on an individual team.
   * @param organizationSlug The slug of the organization the team belongs to. (required)
   * @param teamSlug The slug of the team to get. (required)
   * @return ApiResponse&lt;RetrieveATeam200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveATeam200Response> retrieveATeamWithHttpInfo(String organizationSlug, String teamSlug) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveATeam");
    }
    if (teamSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'teamSlug' when calling retrieveATeam");
    }

    // Path parameters
    String localVarPath = "/api/0/teams/{organization_slug}/{team_slug}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{team_slug}", apiClient.escapeString(teamSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveATeam200Response> localVarReturnType = new GenericType<RetrieveATeam200Response>() {};
    return apiClient.invokeAPI("TeamsApi.retrieveATeam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Caution: this endpoint may change in the future without notice.
   * Return a set of points representing a normalized timestamp and the number of events seen in the period.  Query ranges are limited to Sentry’s configured time-series resolutions.
   * @param organizationSlug The slug of the organization the team belongs to. (required)
   * @param teamSlug The slug of the team to get. (required)
   * @param stat The name of the stat to query &#x60;(\&quot;received\&quot;, \&quot;rejected\&quot;)&#x60;. (optional)
   * @param since A timestamp to set the start of the query in seconds since UNIX epoch. (optional)
   * @param until A timestamp to set the end of the query in seconds since UNIX epoch. (optional)
   * @param resolution An explicit resolution to search for (one of &#x60;10s&#x60;, &#x60;1h&#x60;, and &#x60;1d&#x60;). (optional)
   * @return List&lt;List&lt;Integer&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found </td><td>  -  </td></tr>
     </table>
   */
  public List<List<Integer>> retrieveEventCountsForATeam(String organizationSlug, String teamSlug, String stat, OffsetDateTime since, OffsetDateTime until, String resolution) throws ApiException {
    return retrieveEventCountsForATeamWithHttpInfo(organizationSlug, teamSlug, stat, since, until, resolution).getData();
  }

  /**
   * Caution: this endpoint may change in the future without notice.
   * Return a set of points representing a normalized timestamp and the number of events seen in the period.  Query ranges are limited to Sentry’s configured time-series resolutions.
   * @param organizationSlug The slug of the organization the team belongs to. (required)
   * @param teamSlug The slug of the team to get. (required)
   * @param stat The name of the stat to query &#x60;(\&quot;received\&quot;, \&quot;rejected\&quot;)&#x60;. (optional)
   * @param since A timestamp to set the start of the query in seconds since UNIX epoch. (optional)
   * @param until A timestamp to set the end of the query in seconds since UNIX epoch. (optional)
   * @param resolution An explicit resolution to search for (one of &#x60;10s&#x60;, &#x60;1h&#x60;, and &#x60;1d&#x60;). (optional)
   * @return ApiResponse&lt;List&lt;List&lt;Integer&gt;&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<List<Integer>>> retrieveEventCountsForATeamWithHttpInfo(String organizationSlug, String teamSlug, String stat, OffsetDateTime since, OffsetDateTime until, String resolution) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveEventCountsForATeam");
    }
    if (teamSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'teamSlug' when calling retrieveEventCountsForATeam");
    }

    // Path parameters
    String localVarPath = "/api/0/teams/{organization_slug}/{team_slug}/stats/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{team_slug}", apiClient.escapeString(teamSlug));

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
    return apiClient.invokeAPI("TeamsApi.retrieveEventCountsForATeam", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Update various attributes and configurable settings for the given team.
   * @param organizationSlug The slug of the organization the team belongs to. (required)
   * @param teamSlug The slug of the team to get. (required)
   * @param updateATeamRequest  (required)
   * @return UpdateATeam200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found </td><td>  -  </td></tr>
     </table>
   */
  public UpdateATeam200Response updateATeam(String organizationSlug, String teamSlug, UpdateATeamRequest updateATeamRequest) throws ApiException {
    return updateATeamWithHttpInfo(organizationSlug, teamSlug, updateATeamRequest).getData();
  }

  /**
   * 
   * Update various attributes and configurable settings for the given team.
   * @param organizationSlug The slug of the organization the team belongs to. (required)
   * @param teamSlug The slug of the team to get. (required)
   * @param updateATeamRequest  (required)
   * @return ApiResponse&lt;UpdateATeam200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Team not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateATeam200Response> updateATeamWithHttpInfo(String organizationSlug, String teamSlug, UpdateATeamRequest updateATeamRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateATeam");
    }
    if (teamSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'teamSlug' when calling updateATeam");
    }
    if (updateATeamRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateATeamRequest' when calling updateATeam");
    }

    // Path parameters
    String localVarPath = "/api/0/teams/{organization_slug}/{team_slug}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{team_slug}", apiClient.escapeString(teamSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<UpdateATeam200Response> localVarReturnType = new GenericType<UpdateATeam200Response>() {};
    return apiClient.invokeAPI("TeamsApi.updateATeam", localVarPath, "PUT", new ArrayList<>(), updateATeamRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
