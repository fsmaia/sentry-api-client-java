package com.sentry.api.client.api;

import com.sentry.api.client.ApiException;
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiResponse;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.sentry.api.client.model.BulkMutateAListOfIssues200Response;
import com.sentry.api.client.model.BulkMutateAListOfIssuesRequest;
import com.sentry.api.client.model.DebugIssuesRelatedToSourceMapsForAGivenEvent200Response;
import com.sentry.api.client.model.ListAProjectSEvents200ResponseInner;
import com.sentry.api.client.model.ListAProjectSIssues200ResponseInner;
import com.sentry.api.client.model.ListATagSValuesRelatedToAnIssue200ResponseInner;
import com.sentry.api.client.model.ListAnIssueSHashes200ResponseInner;
import com.sentry.api.client.model.RetrieveAnEventForAProject200Response;
import com.sentry.api.client.model.RetrieveAnIssue200Response;
import com.sentry.api.client.model.RetrieveTagDetails200Response;
import com.sentry.api.client.model.RetrieveTheOldestEventForAnIssue200Response;
import java.util.UUID;
import com.sentry.api.client.model.UpdateAnIssue200Response;
import com.sentry.api.client.model.UpdateAnIssueRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
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
   * Bulk mutate various attributes on issues.  The list of issues to modify is given through the &#x60;id&#x60; query parameter.  It is repeated for each issue that should be modified.  - For non-status updates, the &#x60;id&#x60; query parameter is required. - For status updates, the &#x60;id&#x60; query parameter may be omitted for a batch \&quot;update all\&quot; query. - An optional &#x60;status&#x60; query parameter may be used to restrict mutations to only events with the given status.  The following attributes can be modified and are supplied as JSON object in the body:  If any ids are out of scope this operation will succeed without any data mutation.
   * @param organizationSlug The slug of the organization the issues belong to. (required)
   * @param projectSlug The slug of the project the issues belong to. (required)
   * @param bulkMutateAListOfIssuesRequest  (required)
   * @param id A list of IDs of the issues to be mutated. This parameter shall be repeated for each issue. It is optional only if a status is mutated in which case an implicit update all is assumed. (optional)
   * @param status Optionally limits the query to issues of the specified status. Valid values are &#x60;\&quot;resolved\&quot;&#x60;, &#x60;\&quot;unresolved\&quot;&#x60;, and &#x60;\&quot;ignored\&quot;&#x60;. (optional)
   * @return BulkMutateAListOfIssues200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource does not exist </td><td>  -  </td></tr>
     </table>
   */
  public BulkMutateAListOfIssues200Response bulkMutateAListOfIssues(String organizationSlug, String projectSlug, BulkMutateAListOfIssuesRequest bulkMutateAListOfIssuesRequest, Integer id, String status) throws ApiException {
    return bulkMutateAListOfIssuesWithHttpInfo(organizationSlug, projectSlug, bulkMutateAListOfIssuesRequest, id, status).getData();
  }

  /**
   * 
   * Bulk mutate various attributes on issues.  The list of issues to modify is given through the &#x60;id&#x60; query parameter.  It is repeated for each issue that should be modified.  - For non-status updates, the &#x60;id&#x60; query parameter is required. - For status updates, the &#x60;id&#x60; query parameter may be omitted for a batch \&quot;update all\&quot; query. - An optional &#x60;status&#x60; query parameter may be used to restrict mutations to only events with the given status.  The following attributes can be modified and are supplied as JSON object in the body:  If any ids are out of scope this operation will succeed without any data mutation.
   * @param organizationSlug The slug of the organization the issues belong to. (required)
   * @param projectSlug The slug of the project the issues belong to. (required)
   * @param bulkMutateAListOfIssuesRequest  (required)
   * @param id A list of IDs of the issues to be mutated. This parameter shall be repeated for each issue. It is optional only if a status is mutated in which case an implicit update all is assumed. (optional)
   * @param status Optionally limits the query to issues of the specified status. Valid values are &#x60;\&quot;resolved\&quot;&#x60;, &#x60;\&quot;unresolved\&quot;&#x60;, and &#x60;\&quot;ignored\&quot;&#x60;. (optional)
   * @return ApiResponse&lt;BulkMutateAListOfIssues200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkMutateAListOfIssues200Response> bulkMutateAListOfIssuesWithHttpInfo(String organizationSlug, String projectSlug, BulkMutateAListOfIssuesRequest bulkMutateAListOfIssuesRequest, Integer id, String status) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling bulkMutateAListOfIssues");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling bulkMutateAListOfIssues");
    }
    if (bulkMutateAListOfIssuesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkMutateAListOfIssuesRequest' when calling bulkMutateAListOfIssues");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/issues/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "id", id)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<BulkMutateAListOfIssues200Response> localVarReturnType = new GenericType<BulkMutateAListOfIssues200Response>() {};
    return apiClient.invokeAPI("EventsApi.bulkMutateAListOfIssues", localVarPath, "PUT", localVarQueryParams, bulkMutateAListOfIssuesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Permanently remove the given issues. The list of issues to modify is given through the &#x60;id&#x60; query parameter.  It is repeated for each issue that should be removed.  Only queries by &#39;id&#39; are accepted.  If any ids are out of scope this operation will succeed without any data mutation.
   * @param organizationSlug The slug of the organization the issues belong to. (required)
   * @param projectSlug The slug of the project the issues belong to. (required)
   * @param id A list of IDs of the issues to be removed. This parameter shall be repeated for each issue. (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project not found </td><td>  -  </td></tr>
     </table>
   */
  public void bulkRemoveAListOfIssues(String organizationSlug, String projectSlug, Integer id) throws ApiException {
    bulkRemoveAListOfIssuesWithHttpInfo(organizationSlug, projectSlug, id);
  }

  /**
   * 
   * Permanently remove the given issues. The list of issues to modify is given through the &#x60;id&#x60; query parameter.  It is repeated for each issue that should be removed.  Only queries by &#39;id&#39; are accepted.  If any ids are out of scope this operation will succeed without any data mutation.
   * @param organizationSlug The slug of the organization the issues belong to. (required)
   * @param projectSlug The slug of the project the issues belong to. (required)
   * @param id A list of IDs of the issues to be removed. This parameter shall be repeated for each issue. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> bulkRemoveAListOfIssuesWithHttpInfo(String organizationSlug, String projectSlug, Integer id) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling bulkRemoveAListOfIssues");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling bulkRemoveAListOfIssues");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/issues/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "id", id)
    );

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("EventsApi.bulkRemoveAListOfIssues", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Retrieve information about source maps for a given event. &#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60; Return a list of source map errors for a given event.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param projectSlug The slug of the project the resource belongs to. (required)
   * @param eventId The id of the event (required)
   * @param frameIdx Index of the frame that should be used for source map resolution. (required)
   * @param exceptionIdx Index of the exception that should be used for source map resolution. (required)
   * @return DebugIssuesRelatedToSourceMapsForAGivenEvent200Response
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
  public DebugIssuesRelatedToSourceMapsForAGivenEvent200Response debugIssuesRelatedToSourceMapsForAGivenEvent(String organizationSlug, String projectSlug, UUID eventId, Integer frameIdx, Integer exceptionIdx) throws ApiException {
    return debugIssuesRelatedToSourceMapsForAGivenEventWithHttpInfo(organizationSlug, projectSlug, eventId, frameIdx, exceptionIdx).getData();
  }

  /**
   * 
   * Retrieve information about source maps for a given event. &#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60; Return a list of source map errors for a given event.
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param projectSlug The slug of the project the resource belongs to. (required)
   * @param eventId The id of the event (required)
   * @param frameIdx Index of the frame that should be used for source map resolution. (required)
   * @param exceptionIdx Index of the exception that should be used for source map resolution. (required)
   * @return ApiResponse&lt;DebugIssuesRelatedToSourceMapsForAGivenEvent200Response&gt;
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
  public ApiResponse<DebugIssuesRelatedToSourceMapsForAGivenEvent200Response> debugIssuesRelatedToSourceMapsForAGivenEventWithHttpInfo(String organizationSlug, String projectSlug, UUID eventId, Integer frameIdx, Integer exceptionIdx) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling debugIssuesRelatedToSourceMapsForAGivenEvent");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling debugIssuesRelatedToSourceMapsForAGivenEvent");
    }
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling debugIssuesRelatedToSourceMapsForAGivenEvent");
    }
    if (frameIdx == null) {
      throw new ApiException(400, "Missing the required parameter 'frameIdx' when calling debugIssuesRelatedToSourceMapsForAGivenEvent");
    }
    if (exceptionIdx == null) {
      throw new ApiException(400, "Missing the required parameter 'exceptionIdx' when calling debugIssuesRelatedToSourceMapsForAGivenEvent");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/events/{event_id}/source-map-debug/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{event_id}", apiClient.escapeString(eventId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "frame_idx", frameIdx)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exception_idx", exceptionIdx));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<DebugIssuesRelatedToSourceMapsForAGivenEvent200Response> localVarReturnType = new GenericType<DebugIssuesRelatedToSourceMapsForAGivenEvent200Response>() {};
    return apiClient.invokeAPI("EventsApi.debugIssuesRelatedToSourceMapsForAGivenEvent", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of events bound to a project.
   * @param organizationSlug The slug of the organization the groups belong to. (required)
   * @param projectSlug The slug of the project the groups belong to. (required)
   * @param full If this is set to true then the event payload will include the full event body, including the stacktrace.  Set to true to enable. (optional)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return List&lt;ListAProjectSEvents200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAProjectSEvents200ResponseInner> listAProjectsEvents(String organizationSlug, String projectSlug, Boolean full, String cursor) throws ApiException {
    return listAProjectsEventsWithHttpInfo(organizationSlug, projectSlug, full, cursor).getData();
  }

  /**
   * 
   * Return a list of events bound to a project.
   * @param organizationSlug The slug of the organization the groups belong to. (required)
   * @param projectSlug The slug of the project the groups belong to. (required)
   * @param full If this is set to true then the event payload will include the full event body, including the stacktrace.  Set to true to enable. (optional)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return ApiResponse&lt;List&lt;ListAProjectSEvents200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAProjectSEvents200ResponseInner>> listAProjectsEventsWithHttpInfo(String organizationSlug, String projectSlug, Boolean full, String cursor) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAProjectsEvents");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listAProjectsEvents");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/events/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "full", full)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAProjectSEvents200ResponseInner>> localVarReturnType = new GenericType<List<ListAProjectSEvents200ResponseInner>>() {};
    return apiClient.invokeAPI("EventsApi.listAProjectsEvents", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of issues (groups) bound to a project.  All parameters are supplied as query string parameters.    A default query of &#x60;&#x60;is:unresolved&#x60;&#x60; is applied. To return results with other statuses send an new query value (i.e. &#x60;&#x60;?query&#x3D;&#x60;&#x60; for all results).  The &#x60;&#x60;statsPeriod&#x60;&#x60; parameter can be used to select the timeline stats which should be present. Possible values are: &#x60;&#x60;\&quot;\&quot;&#x60;&#x60; (disable),&#x60;&#x60;\&quot;24h\&quot;&#x60;&#x60;, &#x60;&#x60;\&quot;14d\&quot;&#x60;&#x60;
   * @param organizationSlug The slug of the organization the issues belong to. (required)
   * @param projectSlug The slug of the project the issues belong to. (required)
   * @param statsPeriod An optional stat period (can be one of &#x60;\&quot;24h\&quot;&#x60;, &#x60;\&quot;14d\&quot;&#x60;, and &#x60;\&quot;\&quot;&#x60;). (optional)
   * @param shortIdLookup If this is set to true then short IDs are looked up by this function as well. This can cause the return value of the function to return an event issue of a different project which is why this is an opt-in. Set to 1 to enable. (optional)
   * @param query An optional Sentry structured search query. If not provided an implied &#x60;\&quot;is:unresolved\&quot;&#x60; is assumed. (optional)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return List&lt;ListAProjectSIssues200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAProjectSIssues200ResponseInner> listAProjectsIssues(String organizationSlug, String projectSlug, String statsPeriod, Boolean shortIdLookup, String query, String cursor) throws ApiException {
    return listAProjectsIssuesWithHttpInfo(organizationSlug, projectSlug, statsPeriod, shortIdLookup, query, cursor).getData();
  }

  /**
   * 
   * Return a list of issues (groups) bound to a project.  All parameters are supplied as query string parameters.    A default query of &#x60;&#x60;is:unresolved&#x60;&#x60; is applied. To return results with other statuses send an new query value (i.e. &#x60;&#x60;?query&#x3D;&#x60;&#x60; for all results).  The &#x60;&#x60;statsPeriod&#x60;&#x60; parameter can be used to select the timeline stats which should be present. Possible values are: &#x60;&#x60;\&quot;\&quot;&#x60;&#x60; (disable),&#x60;&#x60;\&quot;24h\&quot;&#x60;&#x60;, &#x60;&#x60;\&quot;14d\&quot;&#x60;&#x60;
   * @param organizationSlug The slug of the organization the issues belong to. (required)
   * @param projectSlug The slug of the project the issues belong to. (required)
   * @param statsPeriod An optional stat period (can be one of &#x60;\&quot;24h\&quot;&#x60;, &#x60;\&quot;14d\&quot;&#x60;, and &#x60;\&quot;\&quot;&#x60;). (optional)
   * @param shortIdLookup If this is set to true then short IDs are looked up by this function as well. This can cause the return value of the function to return an event issue of a different project which is why this is an opt-in. Set to 1 to enable. (optional)
   * @param query An optional Sentry structured search query. If not provided an implied &#x60;\&quot;is:unresolved\&quot;&#x60; is assumed. (optional)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return ApiResponse&lt;List&lt;ListAProjectSIssues200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAProjectSIssues200ResponseInner>> listAProjectsIssuesWithHttpInfo(String organizationSlug, String projectSlug, String statsPeriod, Boolean shortIdLookup, String query, String cursor) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAProjectsIssues");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listAProjectsIssues");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/issues/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "statsPeriod", statsPeriod)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shortIdLookup", shortIdLookup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAProjectSIssues200ResponseInner>> localVarReturnType = new GenericType<List<ListAProjectSIssues200ResponseInner>>() {};
    return apiClient.invokeAPI("EventsApi.listAProjectsIssues", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Returns details for given tag key related to an issue.   When [paginated](/api/pagination) can return at most 1000 values.
   * @param issueId The ID of the issue to retrieve. (required)
   * @param key The tag key to look the values up for. (required)
   * @return List&lt;ListATagSValuesRelatedToAnIssue200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public List<ListATagSValuesRelatedToAnIssue200ResponseInner> listATagsValuesRelatedToAnIssue(String issueId, String key) throws ApiException {
    return listATagsValuesRelatedToAnIssueWithHttpInfo(issueId, key).getData();
  }

  /**
   * 
   * Returns details for given tag key related to an issue.   When [paginated](/api/pagination) can return at most 1000 values.
   * @param issueId The ID of the issue to retrieve. (required)
   * @param key The tag key to look the values up for. (required)
   * @return ApiResponse&lt;List&lt;ListATagSValuesRelatedToAnIssue200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListATagSValuesRelatedToAnIssue200ResponseInner>> listATagsValuesRelatedToAnIssueWithHttpInfo(String issueId, String key) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling listATagsValuesRelatedToAnIssue");
    }
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling listATagsValuesRelatedToAnIssue");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/tags/{key}/values/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId))
            .replaceAll("\\{key}", apiClient.escapeString(key));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListATagSValuesRelatedToAnIssue200ResponseInner>> localVarReturnType = new GenericType<List<ListATagSValuesRelatedToAnIssue200ResponseInner>>() {};
    return apiClient.invokeAPI("EventsApi.listATagsValuesRelatedToAnIssue", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * This endpoint lists an issue&#39;s events.
   * @param issueId The ID of the issue to retrieve. (required)
   * @param full If this is set to true then the event payload will include the full event body, including the stacktrace.  Set to true to enable. (optional)
   * @return List&lt;ListAProjectSEvents200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAProjectSEvents200ResponseInner> listAnIssuesEvents(String issueId, Boolean full) throws ApiException {
    return listAnIssuesEventsWithHttpInfo(issueId, full).getData();
  }

  /**
   * 
   * This endpoint lists an issue&#39;s events.
   * @param issueId The ID of the issue to retrieve. (required)
   * @param full If this is set to true then the event payload will include the full event body, including the stacktrace.  Set to true to enable. (optional)
   * @return ApiResponse&lt;List&lt;ListAProjectSEvents200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAProjectSEvents200ResponseInner>> listAnIssuesEventsWithHttpInfo(String issueId, Boolean full) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling listAnIssuesEvents");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/events/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "full", full)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAProjectSEvents200ResponseInner>> localVarReturnType = new GenericType<List<ListAProjectSEvents200ResponseInner>>() {};
    return apiClient.invokeAPI("EventsApi.listAnIssuesEvents", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * This endpoint lists an issue&#39;s hashes, which are the generated checksums used to aggregate individual events.
   * @param issueId The ID of the issue to retrieve. (required)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return List&lt;ListAnIssueSHashes200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnIssueSHashes200ResponseInner> listAnIssuesHashes(String issueId, String cursor) throws ApiException {
    return listAnIssuesHashesWithHttpInfo(issueId, cursor).getData();
  }

  /**
   * 
   * This endpoint lists an issue&#39;s hashes, which are the generated checksums used to aggregate individual events.
   * @param issueId The ID of the issue to retrieve. (required)
   * @param cursor A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. (optional)
   * @return ApiResponse&lt;List&lt;ListAnIssueSHashes200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnIssueSHashes200ResponseInner>> listAnIssuesHashesWithHttpInfo(String issueId, String cursor) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling listAnIssuesHashes");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/hashes/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "cursor", cursor)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnIssueSHashes200ResponseInner>> localVarReturnType = new GenericType<List<ListAnIssueSHashes200ResponseInner>>() {};
    return apiClient.invokeAPI("EventsApi.listAnIssuesHashes", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Removes an individual issue.
   * @param issueId The ID of the issue to delete. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource does not exist </td><td>  -  </td></tr>
     </table>
   */
  public void removeAnIssue(String issueId) throws ApiException {
    removeAnIssueWithHttpInfo(issueId);
  }

  /**
   * 
   * Removes an individual issue.
   * @param issueId The ID of the issue to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeAnIssueWithHttpInfo(String issueId) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling removeAnIssue");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("EventsApi.removeAnIssue", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Return details on an individual event.
   * @param organizationSlug The slug of the organization the event belongs to. (required)
   * @param projectSlug The slug of the project the event belongs to. (required)
   * @param eventId The ID of the event to retrieve. It is the hexadecimal ID as reported by the client. (required)
   * @return RetrieveAnEventForAProject200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveAnEventForAProject200Response retrieveAnEventForAProject(String organizationSlug, String projectSlug, String eventId) throws ApiException {
    return retrieveAnEventForAProjectWithHttpInfo(organizationSlug, projectSlug, eventId).getData();
  }

  /**
   * 
   * Return details on an individual event.
   * @param organizationSlug The slug of the organization the event belongs to. (required)
   * @param projectSlug The slug of the project the event belongs to. (required)
   * @param eventId The ID of the event to retrieve. It is the hexadecimal ID as reported by the client. (required)
   * @return ApiResponse&lt;RetrieveAnEventForAProject200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveAnEventForAProject200Response> retrieveAnEventForAProjectWithHttpInfo(String organizationSlug, String projectSlug, String eventId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveAnEventForAProject");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling retrieveAnEventForAProject");
    }
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling retrieveAnEventForAProject");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/events/{event_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{event_id}", apiClient.escapeString(eventId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveAnEventForAProject200Response> localVarReturnType = new GenericType<RetrieveAnEventForAProject200Response>() {};
    return apiClient.invokeAPI("EventsApi.retrieveAnEventForAProject", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return details on an individual issue. This returns the basic stats for the issue (title, last seen, first seen), some overall numbers (number of comments, user reports) as well as the summarized event data.
   * @param issueId The ID of the issue to retrieve. (required)
   * @return RetrieveAnIssue200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveAnIssue200Response retrieveAnIssue(String issueId) throws ApiException {
    return retrieveAnIssueWithHttpInfo(issueId).getData();
  }

  /**
   * 
   * Return details on an individual issue. This returns the basic stats for the issue (title, last seen, first seen), some overall numbers (number of comments, user reports) as well as the summarized event data.
   * @param issueId The ID of the issue to retrieve. (required)
   * @return ApiResponse&lt;RetrieveAnIssue200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveAnIssue200Response> retrieveAnIssueWithHttpInfo(String issueId) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling retrieveAnIssue");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveAnIssue200Response> localVarReturnType = new GenericType<RetrieveAnIssue200Response>() {};
    return apiClient.invokeAPI("EventsApi.retrieveAnIssue", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Returns details for given tag key related to an issue.
   * @param issueId The ID of the issue to retrieve. (required)
   * @param key The tag key to look the values up for. (required)
   * @return RetrieveTagDetails200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveTagDetails200Response retrieveTagDetails(String issueId, String key) throws ApiException {
    return retrieveTagDetailsWithHttpInfo(issueId, key).getData();
  }

  /**
   * 
   * Returns details for given tag key related to an issue.
   * @param issueId The ID of the issue to retrieve. (required)
   * @param key The tag key to look the values up for. (required)
   * @return ApiResponse&lt;RetrieveTagDetails200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveTagDetails200Response> retrieveTagDetailsWithHttpInfo(String issueId, String key) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling retrieveTagDetails");
    }
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling retrieveTagDetails");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/tags/{key}/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId))
            .replaceAll("\\{key}", apiClient.escapeString(key));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveTagDetails200Response> localVarReturnType = new GenericType<RetrieveTagDetails200Response>() {};
    return apiClient.invokeAPI("EventsApi.retrieveTagDetails", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Retrieves the details of the latest event for an issue.
   * @param issueId The ID of the issue. (required)
   * @return RetrieveTheOldestEventForAnIssue200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveTheOldestEventForAnIssue200Response retrieveTheLatestEventForAnIssue(String issueId) throws ApiException {
    return retrieveTheLatestEventForAnIssueWithHttpInfo(issueId).getData();
  }

  /**
   * 
   * Retrieves the details of the latest event for an issue.
   * @param issueId The ID of the issue. (required)
   * @return ApiResponse&lt;RetrieveTheOldestEventForAnIssue200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveTheOldestEventForAnIssue200Response> retrieveTheLatestEventForAnIssueWithHttpInfo(String issueId) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling retrieveTheLatestEventForAnIssue");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/events/latest/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveTheOldestEventForAnIssue200Response> localVarReturnType = new GenericType<RetrieveTheOldestEventForAnIssue200Response>() {};
    return apiClient.invokeAPI("EventsApi.retrieveTheLatestEventForAnIssue", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Retrieves the details of the oldest event for an issue.
   * @param issueId The ID of the issue. (required)
   * @return RetrieveTheOldestEventForAnIssue200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveTheOldestEventForAnIssue200Response retrieveTheOldestEventForAnIssue(String issueId) throws ApiException {
    return retrieveTheOldestEventForAnIssueWithHttpInfo(issueId).getData();
  }

  /**
   * 
   * Retrieves the details of the oldest event for an issue.
   * @param issueId The ID of the issue. (required)
   * @return ApiResponse&lt;RetrieveTheOldestEventForAnIssue200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveTheOldestEventForAnIssue200Response> retrieveTheOldestEventForAnIssueWithHttpInfo(String issueId) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling retrieveTheOldestEventForAnIssue");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/events/oldest/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveTheOldestEventForAnIssue200Response> localVarReturnType = new GenericType<RetrieveTheOldestEventForAnIssue200Response>() {};
    return apiClient.invokeAPI("EventsApi.retrieveTheOldestEventForAnIssue", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Updates an individual issue&#39;s attributes.  Only the attributes submitted are modified.
   * @param issueId The ID of the group to retrieve. (required)
   * @param updateAnIssueRequest  (required)
   * @return UpdateAnIssue200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource does not exist </td><td>  -  </td></tr>
     </table>
   */
  public UpdateAnIssue200Response updateAnIssue(String issueId, UpdateAnIssueRequest updateAnIssueRequest) throws ApiException {
    return updateAnIssueWithHttpInfo(issueId, updateAnIssueRequest).getData();
  }

  /**
   * 
   * Updates an individual issue&#39;s attributes.  Only the attributes submitted are modified.
   * @param issueId The ID of the group to retrieve. (required)
   * @param updateAnIssueRequest  (required)
   * @return ApiResponse&lt;UpdateAnIssue200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The requested resource does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateAnIssue200Response> updateAnIssueWithHttpInfo(String issueId, UpdateAnIssueRequest updateAnIssueRequest) throws ApiException {
    // Check required parameters
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling updateAnIssue");
    }
    if (updateAnIssueRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateAnIssueRequest' when calling updateAnIssue");
    }

    // Path parameters
    String localVarPath = "/api/0/issues/{issue_id}/"
            .replaceAll("\\{issue_id}", apiClient.escapeString(issueId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<UpdateAnIssue200Response> localVarReturnType = new GenericType<UpdateAnIssue200Response>() {};
    return apiClient.invokeAPI("EventsApi.updateAnIssue", localVarPath, "PUT", new ArrayList<>(), updateAnIssueRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
