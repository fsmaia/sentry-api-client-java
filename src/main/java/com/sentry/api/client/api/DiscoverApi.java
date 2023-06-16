package com.sentry.api.client.api;

import com.sentry.api.client.ApiException;
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiResponse;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.Pair;

import jakarta.ws.rs.core.GenericType;

import java.time.OffsetDateTime;
import com.sentry.api.client.model.QueryDiscoverEventsInTableFormat200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:43:30.075015Z[Etc/UTC]")
public class DiscoverApi {
  private ApiClient apiClient;

  public DiscoverApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DiscoverApi(ApiClient apiClient) {
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
   * Retrieves discover (also known as events) data for a given organization.  **Eventsv2 Deprecation Note**: Users who may be using the &#x60;eventsv2&#x60; endpoint should update their requests to the &#x60;events&#x60; endpoint outline in this document. The &#x60;eventsv2&#x60; endpoint is not a public endpoint and has no guaranteed availability. If you are not making any API calls to &#x60;eventsv2&#x60;, you can safely ignore this. Changes between &#x60;eventsv2&#x60; and &#x60;events&#x60; include: - Field keys in the response now match the keys in the requested &#x60;field&#x60; param exactly. - The &#x60;meta&#x60; object in the response now shows types in the nested &#x60;field&#x60; object.  Aside from the url change, there are no changes to the request payload itself.  **Note**: This endpoint is intended to get a table of results, and is not for doing a full export of data sent to Sentry.  The &#x60;field&#x60; query parameter determines what fields will be selected in the &#x60;data&#x60; and &#x60;meta&#x60; keys of the endpoint response. - The &#x60;data&#x60; key contains a list of results row by row that match the &#x60;query&#x60; made - The &#x60;meta&#x60; key contains information about the response, including the unit or type of the fields requested
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param field The fields, functions, or equations to request for the query. At most 20 fields can be selected per request. Each field can be one of the following types: - A built-in key field. See possible fields in the [properties table](/product/sentry-basics/search/searchable-properties/#properties-table), under any field that is an event property     - example: &#x60;field&#x3D;transaction&#x60; - A tag. Tags should use the &#x60;tag[]&#x60; formatting to avoid ambiguity with any fields     - example: &#x60;field&#x3D;tag[isEnterprise]&#x60; - A function which will be in the format of &#x60;function_name(parameters,...)&#x60;. See possible functions in the [query builder documentation](/product/discover-queries/query-builder/#stacking-functions)     - when a function is included, Discover will group by any tags or fields     - example: &#x60;field&#x3D;count_if(transaction.duration,greater,300)&#x60; - An equation when prefixed with &#x60;equation|&#x60;. Read more about [equations here](https://docs.sentry.io/product/discover-queries/query-builder/query-equations/)     - example: &#x60;field&#x3D;equation|count_if(transaction.duration,greater,300) / count() * 100&#x60;  (required)
   * @param end The end of the period of time for the query, expected in ISO-8601 format. For example &#x60;2001-12-14T12:34:56.7890&#x60; (optional)
   * @param environment The name of environments to filter by. (optional)
   * @param project The ids of projects to filter by. &#x60;-1&#x60; means all available projects. If this parameter is omitted, the request will default to using &#39;My Projects&#39; (optional)
   * @param start The start of the period of time for the query, expected in ISO-8601 format. For example &#x60;2001-12-14T12:34:56.7890&#x60; (optional)
   * @param statsPeriod The period of time for the query, will override the start &amp; end parameters, a number followed by one of: - &#x60;d&#x60; for days - &#x60;h&#x60; for hours - &#x60;m&#x60; for minutes - &#x60;s&#x60; for seconds - &#x60;w&#x60; for weeks  For example &#x60;24h&#x60;, to mean query data starting from 24 hours ago to now. (optional)
   * @param perPage Limit the number of rows to return in the result. Default and maximum allowed is 100. (optional)
   * @param query The search filter for your query, read more about query syntax [here](https://docs.sentry.io/product/sentry-basics/search/)  example: &#x60;query&#x3D;(transaction:foo AND release:abc) OR (transaction:[bar,baz] AND release:def)&#x60;  (optional)
   * @param sort What to order the results of the query by. Must be something in the &#x60;field&#x60; list, excluding equations. (optional)
   * @return QueryDiscoverEventsInTableFormat200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid Query </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public QueryDiscoverEventsInTableFormat200Response queryDiscoverEventsInTableFormat(String organizationSlug, List<String> field, OffsetDateTime end, List<String> environment, List<Integer> project, OffsetDateTime start, String statsPeriod, Integer perPage, String query, String sort) throws ApiException {
    return queryDiscoverEventsInTableFormatWithHttpInfo(organizationSlug, field, end, environment, project, start, statsPeriod, perPage, query, sort).getData();
  }

  /**
   * 
   * Retrieves discover (also known as events) data for a given organization.  **Eventsv2 Deprecation Note**: Users who may be using the &#x60;eventsv2&#x60; endpoint should update their requests to the &#x60;events&#x60; endpoint outline in this document. The &#x60;eventsv2&#x60; endpoint is not a public endpoint and has no guaranteed availability. If you are not making any API calls to &#x60;eventsv2&#x60;, you can safely ignore this. Changes between &#x60;eventsv2&#x60; and &#x60;events&#x60; include: - Field keys in the response now match the keys in the requested &#x60;field&#x60; param exactly. - The &#x60;meta&#x60; object in the response now shows types in the nested &#x60;field&#x60; object.  Aside from the url change, there are no changes to the request payload itself.  **Note**: This endpoint is intended to get a table of results, and is not for doing a full export of data sent to Sentry.  The &#x60;field&#x60; query parameter determines what fields will be selected in the &#x60;data&#x60; and &#x60;meta&#x60; keys of the endpoint response. - The &#x60;data&#x60; key contains a list of results row by row that match the &#x60;query&#x60; made - The &#x60;meta&#x60; key contains information about the response, including the unit or type of the fields requested
   * @param organizationSlug The slug of the organization the resource belongs to. (required)
   * @param field The fields, functions, or equations to request for the query. At most 20 fields can be selected per request. Each field can be one of the following types: - A built-in key field. See possible fields in the [properties table](/product/sentry-basics/search/searchable-properties/#properties-table), under any field that is an event property     - example: &#x60;field&#x3D;transaction&#x60; - A tag. Tags should use the &#x60;tag[]&#x60; formatting to avoid ambiguity with any fields     - example: &#x60;field&#x3D;tag[isEnterprise]&#x60; - A function which will be in the format of &#x60;function_name(parameters,...)&#x60;. See possible functions in the [query builder documentation](/product/discover-queries/query-builder/#stacking-functions)     - when a function is included, Discover will group by any tags or fields     - example: &#x60;field&#x3D;count_if(transaction.duration,greater,300)&#x60; - An equation when prefixed with &#x60;equation|&#x60;. Read more about [equations here](https://docs.sentry.io/product/discover-queries/query-builder/query-equations/)     - example: &#x60;field&#x3D;equation|count_if(transaction.duration,greater,300) / count() * 100&#x60;  (required)
   * @param end The end of the period of time for the query, expected in ISO-8601 format. For example &#x60;2001-12-14T12:34:56.7890&#x60; (optional)
   * @param environment The name of environments to filter by. (optional)
   * @param project The ids of projects to filter by. &#x60;-1&#x60; means all available projects. If this parameter is omitted, the request will default to using &#39;My Projects&#39; (optional)
   * @param start The start of the period of time for the query, expected in ISO-8601 format. For example &#x60;2001-12-14T12:34:56.7890&#x60; (optional)
   * @param statsPeriod The period of time for the query, will override the start &amp; end parameters, a number followed by one of: - &#x60;d&#x60; for days - &#x60;h&#x60; for hours - &#x60;m&#x60; for minutes - &#x60;s&#x60; for seconds - &#x60;w&#x60; for weeks  For example &#x60;24h&#x60;, to mean query data starting from 24 hours ago to now. (optional)
   * @param perPage Limit the number of rows to return in the result. Default and maximum allowed is 100. (optional)
   * @param query The search filter for your query, read more about query syntax [here](https://docs.sentry.io/product/sentry-basics/search/)  example: &#x60;query&#x3D;(transaction:foo AND release:abc) OR (transaction:[bar,baz] AND release:def)&#x60;  (optional)
   * @param sort What to order the results of the query by. Must be something in the &#x60;field&#x60; list, excluding equations. (optional)
   * @return ApiResponse&lt;QueryDiscoverEventsInTableFormat200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid Query </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QueryDiscoverEventsInTableFormat200Response> queryDiscoverEventsInTableFormatWithHttpInfo(String organizationSlug, List<String> field, OffsetDateTime end, List<String> environment, List<Integer> project, OffsetDateTime start, String statsPeriod, Integer perPage, String query, String sort) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling queryDiscoverEventsInTableFormat");
    }
    if (field == null) {
      throw new ApiException(400, "Missing the required parameter 'field' when calling queryDiscoverEventsInTableFormat");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/events/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "end", end)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "environment", environment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "project", project));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statsPeriod", statsPeriod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "field", field));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<QueryDiscoverEventsInTableFormat200Response> localVarReturnType = new GenericType<QueryDiscoverEventsInTableFormat200Response>() {};
    return apiClient.invokeAPI("DiscoverApi.queryDiscoverEventsInTableFormat", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
