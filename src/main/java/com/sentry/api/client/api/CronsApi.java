package com.sentry.api.client.api;

import com.sentry.api.client.ApiException;
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiResponse;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.sentry.api.client.model.CreateAMonitorRequest;
import com.sentry.api.client.model.CreateANewCheckInRequest;
import com.sentry.api.client.model.RetrieveCheckInsForAMonitor200ResponseInner;
import com.sentry.api.client.model.RetrieveMonitorsForAnOrganization200ResponseInner;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:23:11.909078Z[Etc/UTC]")
public class CronsApi {
  private ApiClient apiClient;

  public CronsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CronsApi(ApiClient apiClient) {
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
   * Create a new monitor.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param createAMonitorRequest  (required)
   * @return RetrieveMonitorsForAnOrganization200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMonitorsForAnOrganization200ResponseInner createAMonitor(String organizationSlug, CreateAMonitorRequest createAMonitorRequest) throws ApiException {
    return createAMonitorWithHttpInfo(organizationSlug, createAMonitorRequest).getData();
  }

  /**
   * 
   * Create a new monitor.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param createAMonitorRequest  (required)
   * @return ApiResponse&lt;RetrieveMonitorsForAnOrganization200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMonitorsForAnOrganization200ResponseInner> createAMonitorWithHttpInfo(String organizationSlug, CreateAMonitorRequest createAMonitorRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling createAMonitor");
    }
    if (createAMonitorRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createAMonitorRequest' when calling createAMonitor");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/monitors/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveMonitorsForAnOrganization200ResponseInner> localVarReturnType = new GenericType<RetrieveMonitorsForAnOrganization200ResponseInner>() {};
    return apiClient.invokeAPI("CronsApi.createAMonitor", localVarPath, "POST", new ArrayList<>(), createAMonitorRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Creates a new check-in for a monitor.  If &#x60;status&#x60; is not present, it will be assumed that the check-in is starting, and be marked as &#x60;in_progress&#x60;.  To achieve a ping-like behavior, you can simply define &#x60;status&#x60; and optionally &#x60;duration&#x60; and this check-in will be automatically marked as finished.  Note: If a DSN is utilized for authentication, the response will be limited in details.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param createANewCheckInRequest  (required)
   * @return RetrieveCheckInsForAMonitor200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveCheckInsForAMonitor200ResponseInner createANewCheckIn(String organizationSlug, String monitorSlug, CreateANewCheckInRequest createANewCheckInRequest) throws ApiException {
    return createANewCheckInWithHttpInfo(organizationSlug, monitorSlug, createANewCheckInRequest).getData();
  }

  /**
   * 
   * Creates a new check-in for a monitor.  If &#x60;status&#x60; is not present, it will be assumed that the check-in is starting, and be marked as &#x60;in_progress&#x60;.  To achieve a ping-like behavior, you can simply define &#x60;status&#x60; and optionally &#x60;duration&#x60; and this check-in will be automatically marked as finished.  Note: If a DSN is utilized for authentication, the response will be limited in details.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param createANewCheckInRequest  (required)
   * @return ApiResponse&lt;RetrieveCheckInsForAMonitor200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveCheckInsForAMonitor200ResponseInner> createANewCheckInWithHttpInfo(String organizationSlug, String monitorSlug, CreateANewCheckInRequest createANewCheckInRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling createANewCheckIn");
    }
    if (monitorSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorSlug' when calling createANewCheckIn");
    }
    if (createANewCheckInRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createANewCheckInRequest' when calling createANewCheckIn");
    }

    // Path parameters
    String localVarPath = "/api/0/organization/{organization_slug}/monitors/{monitor_slug}/checkins/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{monitor_slug}", apiClient.escapeString(monitorSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveCheckInsForAMonitor200ResponseInner> localVarReturnType = new GenericType<RetrieveCheckInsForAMonitor200ResponseInner>() {};
    return apiClient.invokeAPI("CronsApi.createANewCheckIn", localVarPath, "POST", new ArrayList<>(), createANewCheckInRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Delete a monitor or monitor environments.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param environment The name of environments to filter by. (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAMonitorOrMonitorEnvironments(String organizationSlug, String monitorSlug, List<String> environment) throws ApiException {
    deleteAMonitorOrMonitorEnvironmentsWithHttpInfo(organizationSlug, monitorSlug, environment);
  }

  /**
   * 
   * Delete a monitor or monitor environments.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param environment The name of environments to filter by. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAMonitorOrMonitorEnvironmentsWithHttpInfo(String organizationSlug, String monitorSlug, List<String> environment) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling deleteAMonitorOrMonitorEnvironments");
    }
    if (monitorSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorSlug' when calling deleteAMonitorOrMonitorEnvironments");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/monitors/{monitor_slug}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{monitor_slug}", apiClient.escapeString(monitorSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "environment", environment)
    );

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("CronsApi.deleteAMonitorOrMonitorEnvironments", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Retrieves details for a monitor.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param environment The name of environments to filter by. (optional)
   * @return RetrieveMonitorsForAnOrganization200ResponseInner
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
  public RetrieveMonitorsForAnOrganization200ResponseInner retrieveAMonitor(String organizationSlug, String monitorSlug, List<String> environment) throws ApiException {
    return retrieveAMonitorWithHttpInfo(organizationSlug, monitorSlug, environment).getData();
  }

  /**
   * 
   * Retrieves details for a monitor.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param environment The name of environments to filter by. (optional)
   * @return ApiResponse&lt;RetrieveMonitorsForAnOrganization200ResponseInner&gt;
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
  public ApiResponse<RetrieveMonitorsForAnOrganization200ResponseInner> retrieveAMonitorWithHttpInfo(String organizationSlug, String monitorSlug, List<String> environment) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveAMonitor");
    }
    if (monitorSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorSlug' when calling retrieveAMonitor");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/monitors/{monitor_slug}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{monitor_slug}", apiClient.escapeString(monitorSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "environment", environment)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveMonitorsForAnOrganization200ResponseInner> localVarReturnType = new GenericType<RetrieveMonitorsForAnOrganization200ResponseInner>() {};
    return apiClient.invokeAPI("CronsApi.retrieveAMonitor", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Retrieve a list of check-ins for a monitor
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param checkinId The id of the check-in (required)
   * @return List&lt;RetrieveCheckInsForAMonitor200ResponseInner&gt;
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
  public List<RetrieveCheckInsForAMonitor200ResponseInner> retrieveCheckInsForAMonitor(String organizationSlug, String monitorSlug, UUID checkinId) throws ApiException {
    return retrieveCheckInsForAMonitorWithHttpInfo(organizationSlug, monitorSlug, checkinId).getData();
  }

  /**
   * 
   * Retrieve a list of check-ins for a monitor
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param checkinId The id of the check-in (required)
   * @return ApiResponse&lt;List&lt;RetrieveCheckInsForAMonitor200ResponseInner&gt;&gt;
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
  public ApiResponse<List<RetrieveCheckInsForAMonitor200ResponseInner>> retrieveCheckInsForAMonitorWithHttpInfo(String organizationSlug, String monitorSlug, UUID checkinId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveCheckInsForAMonitor");
    }
    if (monitorSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorSlug' when calling retrieveCheckInsForAMonitor");
    }
    if (checkinId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkinId' when calling retrieveCheckInsForAMonitor");
    }

    // Path parameters
    String localVarPath = "/api/0/organization/{organization_slug}/monitors/{monitor_slug}/checkins/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{monitor_slug}", apiClient.escapeString(monitorSlug))
            .replaceAll("\\{checkin_id}", apiClient.escapeString(checkinId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<RetrieveCheckInsForAMonitor200ResponseInner>> localVarReturnType = new GenericType<List<RetrieveCheckInsForAMonitor200ResponseInner>>() {};
    return apiClient.invokeAPI("CronsApi.retrieveCheckInsForAMonitor", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Lists monitors, including nested monitor enviroments. May be filtered to a project or environment.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param project The ids of projects to filter by. &#x60;-1&#x60; means all available projects. If this parameter is omitted, the request will default to using &#39;My Projects&#39; (optional)
   * @param environment The name of environments to filter by. (optional)
   * @return List&lt;RetrieveMonitorsForAnOrganization200ResponseInner&gt;
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
  public List<RetrieveMonitorsForAnOrganization200ResponseInner> retrieveMonitorsForAnOrganization(String organizationSlug, List<Integer> project, List<String> environment) throws ApiException {
    return retrieveMonitorsForAnOrganizationWithHttpInfo(organizationSlug, project, environment).getData();
  }

  /**
   * 
   * Lists monitors, including nested monitor enviroments. May be filtered to a project or environment.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param project The ids of projects to filter by. &#x60;-1&#x60; means all available projects. If this parameter is omitted, the request will default to using &#39;My Projects&#39; (optional)
   * @param environment The name of environments to filter by. (optional)
   * @return ApiResponse&lt;List&lt;RetrieveMonitorsForAnOrganization200ResponseInner&gt;&gt;
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
  public ApiResponse<List<RetrieveMonitorsForAnOrganization200ResponseInner>> retrieveMonitorsForAnOrganizationWithHttpInfo(String organizationSlug, List<Integer> project, List<String> environment) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveMonitorsForAnOrganization");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/monitors/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "project", project)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "environment", environment));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<RetrieveMonitorsForAnOrganization200ResponseInner>> localVarReturnType = new GenericType<List<RetrieveMonitorsForAnOrganization200ResponseInner>>() {};
    return apiClient.invokeAPI("CronsApi.retrieveMonitorsForAnOrganization", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Updates a check-in.  Once a check-in is finished (indicated via an &#x60;ok&#x60; or &#x60;error&#x60; status) it can no longer be changed.  If you simply wish to update that the task is still running, you can simply send an empty payload.  You may use &#x60;latest&#x60; for the &#x60;checkin_id&#x60; parameter in order to retrieve the most recent (by creation date) check-in which is still mutable (not marked as finished).
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param checkinId The id of the check-in (required)
   * @param createANewCheckInRequest  (required)
   * @return RetrieveCheckInsForAMonitor200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 208 </td><td> Already Reported </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveCheckInsForAMonitor200ResponseInner updateACheckIn(String organizationSlug, String monitorSlug, UUID checkinId, CreateANewCheckInRequest createANewCheckInRequest) throws ApiException {
    return updateACheckInWithHttpInfo(organizationSlug, monitorSlug, checkinId, createANewCheckInRequest).getData();
  }

  /**
   * 
   * Updates a check-in.  Once a check-in is finished (indicated via an &#x60;ok&#x60; or &#x60;error&#x60; status) it can no longer be changed.  If you simply wish to update that the task is still running, you can simply send an empty payload.  You may use &#x60;latest&#x60; for the &#x60;checkin_id&#x60; parameter in order to retrieve the most recent (by creation date) check-in which is still mutable (not marked as finished).
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param checkinId The id of the check-in (required)
   * @param createANewCheckInRequest  (required)
   * @return ApiResponse&lt;RetrieveCheckInsForAMonitor200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 208 </td><td> Already Reported </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveCheckInsForAMonitor200ResponseInner> updateACheckInWithHttpInfo(String organizationSlug, String monitorSlug, UUID checkinId, CreateANewCheckInRequest createANewCheckInRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateACheckIn");
    }
    if (monitorSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorSlug' when calling updateACheckIn");
    }
    if (checkinId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkinId' when calling updateACheckIn");
    }
    if (createANewCheckInRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createANewCheckInRequest' when calling updateACheckIn");
    }

    // Path parameters
    String localVarPath = "/api/0/organization/{organization_slug}/monitors/{monitor_slug}/checkins/{checkin_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{monitor_slug}", apiClient.escapeString(monitorSlug))
            .replaceAll("\\{checkin_id}", apiClient.escapeString(checkinId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveCheckInsForAMonitor200ResponseInner> localVarReturnType = new GenericType<RetrieveCheckInsForAMonitor200ResponseInner>() {};
    return apiClient.invokeAPI("CronsApi.updateACheckIn", localVarPath, "PUT", new ArrayList<>(), createANewCheckInRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Update a monitor.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param createAMonitorRequest  (required)
   * @return RetrieveMonitorsForAnOrganization200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMonitorsForAnOrganization200ResponseInner updateAMonitor(String organizationSlug, String monitorSlug, CreateAMonitorRequest createAMonitorRequest) throws ApiException {
    return updateAMonitorWithHttpInfo(organizationSlug, monitorSlug, createAMonitorRequest).getData();
  }

  /**
   * 
   * Update a monitor.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param monitorSlug The slug of the monitor (required)
   * @param createAMonitorRequest  (required)
   * @return ApiResponse&lt;RetrieveMonitorsForAnOrganization200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMonitorsForAnOrganization200ResponseInner> updateAMonitorWithHttpInfo(String organizationSlug, String monitorSlug, CreateAMonitorRequest createAMonitorRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateAMonitor");
    }
    if (monitorSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'monitorSlug' when calling updateAMonitor");
    }
    if (createAMonitorRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createAMonitorRequest' when calling updateAMonitor");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/monitors/{monitor_slug}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{monitor_slug}", apiClient.escapeString(monitorSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveMonitorsForAnOrganization200ResponseInner> localVarReturnType = new GenericType<RetrieveMonitorsForAnOrganization200ResponseInner>() {};
    return apiClient.invokeAPI("CronsApi.updateAMonitor", localVarPath, "PUT", new ArrayList<>(), createAMonitorRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
