package com.sentry.api.client.api;

import com.sentry.api.client.ApiException;
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiResponse;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.sentry.api.client.model.ListAnOrganizationSMembers200Response;
import com.sentry.api.client.model.ListAnOrganizationSMembers200ResponseResourcesInner;
import com.sentry.api.client.model.ListAnOrganizationSPaginatedTeams200Response;
import com.sentry.api.client.model.ListAnOrganizationSPaginatedTeams200ResponseResourcesInner;
import com.sentry.api.client.model.ProvisionANewOrganizationMemberRequest;
import com.sentry.api.client.model.ProvisionANewTeamRequest;
import com.sentry.api.client.model.QueryAnIndividualTeam200Response;
import com.sentry.api.client.model.UpdateATeamSAttributesRequest;
import com.sentry.api.client.model.UpdateAnOrganizationMemberSAttributesRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T12:58:30.193453Z[Etc/UTC]")
public class ScimApi {
  private ApiClient apiClient;

  public ScimApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScimApi(ApiClient apiClient) {
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
   * Delete a team with a SCIM Group DELETE Request.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param teamId The id of the team you&#39;d like to query / update. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAnIndividualTeam(String organizationSlug, Integer teamId) throws ApiException {
    deleteAnIndividualTeamWithHttpInfo(organizationSlug, teamId);
  }

  /**
   * 
   * Delete a team with a SCIM Group DELETE Request.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param teamId The id of the team you&#39;d like to query / update. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAnIndividualTeamWithHttpInfo(String organizationSlug, Integer teamId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling deleteAnIndividualTeam");
    }
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling deleteAnIndividualTeam");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Groups/{team_id}"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{team_id}", apiClient.escapeString(teamId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ScimApi.deleteAnIndividualTeam", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Delete an organization member with a SCIM User DELETE Request.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The id of the member you&#39;d like to query. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAnOrganizationMemberViaSCIM(String organizationSlug, Integer memberId) throws ApiException {
    deleteAnOrganizationMemberViaSCIMWithHttpInfo(organizationSlug, memberId);
  }

  /**
   * 
   * Delete an organization member with a SCIM User DELETE Request.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The id of the member you&#39;d like to query. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAnOrganizationMemberViaSCIMWithHttpInfo(String organizationSlug, Integer memberId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling deleteAnOrganizationMemberViaSCIM");
    }
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling deleteAnOrganizationMemberViaSCIM");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Users/{member_id}"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{member_id}", apiClient.escapeString(memberId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ScimApi.deleteAnOrganizationMemberViaSCIM", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Returns a paginated list of members bound to a organization with a SCIM Users GET Request.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param startIndex SCIM 1-offset based index for pagination. (optional, default to 1)
   * @param count The maximum number of results the query should return, maximum of 100. (optional, default to 100)
   * @param filter A SCIM filter expression. The only operator currently supported is &#x60;eq&#x60;. (optional)
   * @param excludedAttributes Fields that should be left off of return values. Right now the only supported field for this query is members. (optional, default to )
   * @return ListAnOrganizationSMembers200Response
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
  public ListAnOrganizationSMembers200Response listAnOrganizationsMembers(String organizationSlug, Integer startIndex, Integer count, String filter, List<String> excludedAttributes) throws ApiException {
    return listAnOrganizationsMembersWithHttpInfo(organizationSlug, startIndex, count, filter, excludedAttributes).getData();
  }

  /**
   * 
   * Returns a paginated list of members bound to a organization with a SCIM Users GET Request.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param startIndex SCIM 1-offset based index for pagination. (optional, default to 1)
   * @param count The maximum number of results the query should return, maximum of 100. (optional, default to 100)
   * @param filter A SCIM filter expression. The only operator currently supported is &#x60;eq&#x60;. (optional)
   * @param excludedAttributes Fields that should be left off of return values. Right now the only supported field for this query is members. (optional, default to )
   * @return ApiResponse&lt;ListAnOrganizationSMembers200Response&gt;
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
  public ApiResponse<ListAnOrganizationSMembers200Response> listAnOrganizationsMembersWithHttpInfo(String organizationSlug, Integer startIndex, Integer count, String filter, List<String> excludedAttributes) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsMembers");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Users"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "startIndex", startIndex)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "excludedAttributes", excludedAttributes));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSMembers200Response> localVarReturnType = new GenericType<ListAnOrganizationSMembers200Response>() {};
    return apiClient.invokeAPI("ScimApi.listAnOrganizationsMembers", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Returns a paginated list of teams bound to a organization with a SCIM Groups GET Request. - Note that the members field will only contain up to 10000 members.
   * @param organizationSlug The slug of the organization. (required)
   * @param startIndex SCIM 1-offset based index for pagination. (optional)
   * @param filter A SCIM filter expression. The only operator currently supported is &#x60;eq&#x60;. (optional)
   * @param count The maximum number of results the query should return, maximum of 100. (optional)
   * @param excludedAttributes Fields that should be left off of return values. Right now the only supported field for this query is &#x60;members&#x60;. (optional)
   * @return ListAnOrganizationSPaginatedTeams200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Permission Denied </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSPaginatedTeams200Response listAnOrganizationsPaginatedTeams(String organizationSlug, Integer startIndex, String filter, Integer count, String excludedAttributes) throws ApiException {
    return listAnOrganizationsPaginatedTeamsWithHttpInfo(organizationSlug, startIndex, filter, count, excludedAttributes).getData();
  }

  /**
   * 
   * Returns a paginated list of teams bound to a organization with a SCIM Groups GET Request. - Note that the members field will only contain up to 10000 members.
   * @param organizationSlug The slug of the organization. (required)
   * @param startIndex SCIM 1-offset based index for pagination. (optional)
   * @param filter A SCIM filter expression. The only operator currently supported is &#x60;eq&#x60;. (optional)
   * @param count The maximum number of results the query should return, maximum of 100. (optional)
   * @param excludedAttributes Fields that should be left off of return values. Right now the only supported field for this query is &#x60;members&#x60;. (optional)
   * @return ApiResponse&lt;ListAnOrganizationSPaginatedTeams200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Permission Denied </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSPaginatedTeams200Response> listAnOrganizationsPaginatedTeamsWithHttpInfo(String organizationSlug, Integer startIndex, String filter, Integer count, String excludedAttributes) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsPaginatedTeams");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Groups"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "startIndex", startIndex)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "excludedAttributes", excludedAttributes));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSPaginatedTeams200Response> localVarReturnType = new GenericType<ListAnOrganizationSPaginatedTeams200Response>() {};
    return apiClient.invokeAPI("ScimApi.listAnOrganizationsPaginatedTeams", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Create a new Organization Member via a SCIM Users POST Request. - &#x60;userName&#x60; should be set to the SAML field used for email, and active should be set to &#x60;true&#x60;. - &#x60;sentryOrgRole&#x60; can only be &#x60;admin&#x60;, &#x60;manager&#x60;, &#x60;billing&#x60;, or &#x60;member&#x60;. - Sentry&#39;s SCIM API doesn&#39;t currently support setting users to inactive, and the member will be deleted if active is set to &#x60;false&#x60;. - The API also does not support setting secondary emails.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param provisionANewOrganizationMemberRequest  (required)
   * @return ListAnOrganizationSMembers200ResponseResourcesInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSMembers200ResponseResourcesInner provisionANewOrganizationMember(String organizationSlug, ProvisionANewOrganizationMemberRequest provisionANewOrganizationMemberRequest) throws ApiException {
    return provisionANewOrganizationMemberWithHttpInfo(organizationSlug, provisionANewOrganizationMemberRequest).getData();
  }

  /**
   * 
   * Create a new Organization Member via a SCIM Users POST Request. - &#x60;userName&#x60; should be set to the SAML field used for email, and active should be set to &#x60;true&#x60;. - &#x60;sentryOrgRole&#x60; can only be &#x60;admin&#x60;, &#x60;manager&#x60;, &#x60;billing&#x60;, or &#x60;member&#x60;. - Sentry&#39;s SCIM API doesn&#39;t currently support setting users to inactive, and the member will be deleted if active is set to &#x60;false&#x60;. - The API also does not support setting secondary emails.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param provisionANewOrganizationMemberRequest  (required)
   * @return ApiResponse&lt;ListAnOrganizationSMembers200ResponseResourcesInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSMembers200ResponseResourcesInner> provisionANewOrganizationMemberWithHttpInfo(String organizationSlug, ProvisionANewOrganizationMemberRequest provisionANewOrganizationMemberRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling provisionANewOrganizationMember");
    }
    if (provisionANewOrganizationMemberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'provisionANewOrganizationMemberRequest' when calling provisionANewOrganizationMember");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Users"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSMembers200ResponseResourcesInner> localVarReturnType = new GenericType<ListAnOrganizationSMembers200ResponseResourcesInner>() {};
    return apiClient.invokeAPI("ScimApi.provisionANewOrganizationMember", localVarPath, "POST", new ArrayList<>(), provisionANewOrganizationMemberRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Create a new team bound to an organization via a SCIM Groups POST Request. Note that teams are always created with an empty member set. The endpoint will also do a normalization of uppercase / spaces to lowercase and dashes.
   * @param organizationSlug The slug of the organization. (required)
   * @param provisionANewTeamRequest  (required)
   * @return ListAnOrganizationSPaginatedTeams200ResponseResourcesInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad input </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Team slug already exists </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSPaginatedTeams200ResponseResourcesInner provisionANewTeam(String organizationSlug, ProvisionANewTeamRequest provisionANewTeamRequest) throws ApiException {
    return provisionANewTeamWithHttpInfo(organizationSlug, provisionANewTeamRequest).getData();
  }

  /**
   * 
   * Create a new team bound to an organization via a SCIM Groups POST Request. Note that teams are always created with an empty member set. The endpoint will also do a normalization of uppercase / spaces to lowercase and dashes.
   * @param organizationSlug The slug of the organization. (required)
   * @param provisionANewTeamRequest  (required)
   * @return ApiResponse&lt;ListAnOrganizationSPaginatedTeams200ResponseResourcesInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad input </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Team slug already exists </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSPaginatedTeams200ResponseResourcesInner> provisionANewTeamWithHttpInfo(String organizationSlug, ProvisionANewTeamRequest provisionANewTeamRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling provisionANewTeam");
    }
    if (provisionANewTeamRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'provisionANewTeamRequest' when calling provisionANewTeam");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Groups"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSPaginatedTeams200ResponseResourcesInner> localVarReturnType = new GenericType<ListAnOrganizationSPaginatedTeams200ResponseResourcesInner>() {};
    return apiClient.invokeAPI("ScimApi.provisionANewTeam", localVarPath, "POST", new ArrayList<>(), provisionANewTeamRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Query an individual organization member with a SCIM User GET Request. - The &#x60;name&#x60; object will contain fields &#x60;firstName&#x60; and &#x60;lastName&#x60; with the values of &#x60;N/A&#x60;. Sentry&#39;s SCIM API does not currently support these fields but returns them for compatibility purposes.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The id of the member you&#39;d like to query. (required)
   * @return ListAnOrganizationSMembers200ResponseResourcesInner
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
  public ListAnOrganizationSMembers200ResponseResourcesInner queryAnIndividualOrganizationMember(String organizationSlug, Integer memberId) throws ApiException {
    return queryAnIndividualOrganizationMemberWithHttpInfo(organizationSlug, memberId).getData();
  }

  /**
   * 
   * Query an individual organization member with a SCIM User GET Request. - The &#x60;name&#x60; object will contain fields &#x60;firstName&#x60; and &#x60;lastName&#x60; with the values of &#x60;N/A&#x60;. Sentry&#39;s SCIM API does not currently support these fields but returns them for compatibility purposes.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The id of the member you&#39;d like to query. (required)
   * @return ApiResponse&lt;ListAnOrganizationSMembers200ResponseResourcesInner&gt;
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
  public ApiResponse<ListAnOrganizationSMembers200ResponseResourcesInner> queryAnIndividualOrganizationMemberWithHttpInfo(String organizationSlug, Integer memberId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling queryAnIndividualOrganizationMember");
    }
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling queryAnIndividualOrganizationMember");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Users/{member_id}"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{member_id}", apiClient.escapeString(memberId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSMembers200ResponseResourcesInner> localVarReturnType = new GenericType<ListAnOrganizationSMembers200ResponseResourcesInner>() {};
    return apiClient.invokeAPI("ScimApi.queryAnIndividualOrganizationMember", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Query an individual team with a SCIM Group GET Request. - Note that the members field will only contain up to 10000 members.
   * @param teamId The id of the team you&#39;d like to query / update. (required)
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @return QueryAnIndividualTeam200Response
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
  public QueryAnIndividualTeam200Response queryAnIndividualTeam(Integer teamId, String organizationSlug) throws ApiException {
    return queryAnIndividualTeamWithHttpInfo(teamId, organizationSlug).getData();
  }

  /**
   * 
   * Query an individual team with a SCIM Group GET Request. - Note that the members field will only contain up to 10000 members.
   * @param teamId The id of the team you&#39;d like to query / update. (required)
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @return ApiResponse&lt;QueryAnIndividualTeam200Response&gt;
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
  public ApiResponse<QueryAnIndividualTeam200Response> queryAnIndividualTeamWithHttpInfo(Integer teamId, String organizationSlug) throws ApiException {
    // Check required parameters
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling queryAnIndividualTeam");
    }
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling queryAnIndividualTeam");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Groups/{team_id}"
            .replaceAll("\\{team_id}", apiClient.escapeString(teamId.toString()))
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<QueryAnIndividualTeam200Response> localVarReturnType = new GenericType<QueryAnIndividualTeam200Response>() {};
    return apiClient.invokeAPI("ScimApi.queryAnIndividualTeam", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Update a team&#39;s attributes with a SCIM Group PATCH Request. Valid operations are:  * Renaming a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;replace\&quot;,         \&quot;value\&quot;: {             \&quot;id\&quot;: 23,             \&quot;displayName\&quot;: \&quot;newName\&quot;         }     }] } &#x60;&#x60;&#x60; * Adding a member to a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;add\&quot;,         \&quot;path\&quot;: \&quot;members\&quot;,         \&quot;value\&quot;: [             {                 \&quot;value\&quot;: 23,                 \&quot;display\&quot;: \&quot;testexample@example.com\&quot;             }         ]     }] } &#x60;&#x60;&#x60; * Removing a member from a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;remove\&quot;,         \&quot;path\&quot;: \&quot;members[value eq \&quot;23\&quot;]\&quot;     }] } &#x60;&#x60;&#x60; * Replacing an entire member set of a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;replace\&quot;,         \&quot;path\&quot;: \&quot;members\&quot;,         \&quot;value\&quot;: [             {                 \&quot;value\&quot;: 23,                 \&quot;display\&quot;: \&quot;testexample2@sentry.io\&quot;             },             {                 \&quot;value\&quot;: 24,                 \&quot;display\&quot;: \&quot;testexample3@sentry.io\&quot;             }         ]     }] } &#x60;&#x60;&#x60;
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param teamId The id of the team you&#39;d like to query / update. (required)
   * @param updateATeamSAttributesRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void updateATeamsAttributes(String organizationSlug, Integer teamId, UpdateATeamSAttributesRequest updateATeamSAttributesRequest) throws ApiException {
    updateATeamsAttributesWithHttpInfo(organizationSlug, teamId, updateATeamSAttributesRequest);
  }

  /**
   * 
   * Update a team&#39;s attributes with a SCIM Group PATCH Request. Valid operations are:  * Renaming a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;replace\&quot;,         \&quot;value\&quot;: {             \&quot;id\&quot;: 23,             \&quot;displayName\&quot;: \&quot;newName\&quot;         }     }] } &#x60;&#x60;&#x60; * Adding a member to a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;add\&quot;,         \&quot;path\&quot;: \&quot;members\&quot;,         \&quot;value\&quot;: [             {                 \&quot;value\&quot;: 23,                 \&quot;display\&quot;: \&quot;testexample@example.com\&quot;             }         ]     }] } &#x60;&#x60;&#x60; * Removing a member from a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;remove\&quot;,         \&quot;path\&quot;: \&quot;members[value eq \&quot;23\&quot;]\&quot;     }] } &#x60;&#x60;&#x60; * Replacing an entire member set of a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;replace\&quot;,         \&quot;path\&quot;: \&quot;members\&quot;,         \&quot;value\&quot;: [             {                 \&quot;value\&quot;: 23,                 \&quot;display\&quot;: \&quot;testexample2@sentry.io\&quot;             },             {                 \&quot;value\&quot;: 24,                 \&quot;display\&quot;: \&quot;testexample3@sentry.io\&quot;             }         ]     }] } &#x60;&#x60;&#x60;
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param teamId The id of the team you&#39;d like to query / update. (required)
   * @param updateATeamSAttributesRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateATeamsAttributesWithHttpInfo(String organizationSlug, Integer teamId, UpdateATeamSAttributesRequest updateATeamSAttributesRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateATeamsAttributes");
    }
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling updateATeamsAttributes");
    }
    if (updateATeamSAttributesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateATeamSAttributesRequest' when calling updateATeamsAttributes");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Groups/{team_id}"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{team_id}", apiClient.escapeString(teamId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ScimApi.updateATeamsAttributes", localVarPath, "PATCH", new ArrayList<>(), updateATeamSAttributesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Update an organization member&#39;s attributes with a SCIM PATCH Request. The only supported attribute is &#x60;active&#x60;. After setting &#x60;active&#x60; to false Sentry will permanently delete the Organization Member.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The id of the member you&#39;d like to query. (required)
   * @param updateAnOrganizationMemberSAttributesRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void updateAnOrganizationMembersAttributes(String organizationSlug, Integer memberId, UpdateAnOrganizationMemberSAttributesRequest updateAnOrganizationMemberSAttributesRequest) throws ApiException {
    updateAnOrganizationMembersAttributesWithHttpInfo(organizationSlug, memberId, updateAnOrganizationMemberSAttributesRequest);
  }

  /**
   * 
   * Update an organization member&#39;s attributes with a SCIM PATCH Request. The only supported attribute is &#x60;active&#x60;. After setting &#x60;active&#x60; to false Sentry will permanently delete the Organization Member.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param memberId The id of the member you&#39;d like to query. (required)
   * @param updateAnOrganizationMemberSAttributesRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateAnOrganizationMembersAttributesWithHttpInfo(String organizationSlug, Integer memberId, UpdateAnOrganizationMemberSAttributesRequest updateAnOrganizationMemberSAttributesRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateAnOrganizationMembersAttributes");
    }
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling updateAnOrganizationMembersAttributes");
    }
    if (updateAnOrganizationMemberSAttributesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateAnOrganizationMemberSAttributesRequest' when calling updateAnOrganizationMembersAttributes");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/scim/v2/Users/{member_id}"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{member_id}", apiClient.escapeString(memberId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ScimApi.updateAnOrganizationMembersAttributes", localVarPath, "PATCH", new ArrayList<>(), updateAnOrganizationMemberSAttributesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
