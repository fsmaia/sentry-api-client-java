# DiscoverApi

All URIs are relative to *https://sentry.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryDiscoverEventsInTableFormat**](DiscoverApi.md#queryDiscoverEventsInTableFormat) | **GET** /api/0/organizations/{organization_slug}/events/ |  |


<a id="queryDiscoverEventsInTableFormat"></a>
# **queryDiscoverEventsInTableFormat**
> QueryDiscoverEventsInTableFormat200Response queryDiscoverEventsInTableFormat(organizationSlug, field, end, environment, project, start, statsPeriod, perPage, query, sort)



Retrieves discover (also known as events) data for a given organization.  **Eventsv2 Deprecation Note**: Users who may be using the &#x60;eventsv2&#x60; endpoint should update their requests to the &#x60;events&#x60; endpoint outline in this document. The &#x60;eventsv2&#x60; endpoint is not a public endpoint and has no guaranteed availability. If you are not making any API calls to &#x60;eventsv2&#x60;, you can safely ignore this. Changes between &#x60;eventsv2&#x60; and &#x60;events&#x60; include: - Field keys in the response now match the keys in the requested &#x60;field&#x60; param exactly. - The &#x60;meta&#x60; object in the response now shows types in the nested &#x60;field&#x60; object.  Aside from the url change, there are no changes to the request payload itself.  **Note**: This endpoint is intended to get a table of results, and is not for doing a full export of data sent to Sentry.  The &#x60;field&#x60; query parameter determines what fields will be selected in the &#x60;data&#x60; and &#x60;meta&#x60; keys of the endpoint response. - The &#x60;data&#x60; key contains a list of results row by row that match the &#x60;query&#x60; made - The &#x60;meta&#x60; key contains information about the response, including the unit or type of the fields requested

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.DiscoverApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    DiscoverApi apiInstance = new DiscoverApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    List<String> field = Arrays.asList(); // List<String> | The fields, functions, or equations to request for the query. At most 20 fields can be selected per request. Each field can be one of the following types: - A built-in key field. See possible fields in the [properties table](/product/sentry-basics/search/searchable-properties/#properties-table), under any field that is an event property     - example: `field=transaction` - A tag. Tags should use the `tag[]` formatting to avoid ambiguity with any fields     - example: `field=tag[isEnterprise]` - A function which will be in the format of `function_name(parameters,...)`. See possible functions in the [query builder documentation](/product/discover-queries/query-builder/#stacking-functions)     - when a function is included, Discover will group by any tags or fields     - example: `field=count_if(transaction.duration,greater,300)` - An equation when prefixed with `equation|`. Read more about [equations here](https://docs.sentry.io/product/discover-queries/query-builder/query-equations/)     - example: `field=equation|count_if(transaction.duration,greater,300) / count() * 100` 
    OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | The end of the period of time for the query, expected in ISO-8601 format. For example `2001-12-14T12:34:56.7890`
    List<String> environment = Arrays.asList(); // List<String> | The name of environments to filter by.
    List<Integer> project = Arrays.asList(); // List<Integer> | The ids of projects to filter by. `-1` means all available projects. If this parameter is omitted, the request will default to using 'My Projects'
    OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | The start of the period of time for the query, expected in ISO-8601 format. For example `2001-12-14T12:34:56.7890`
    String statsPeriod = "statsPeriod_example"; // String | The period of time for the query, will override the start & end parameters, a number followed by one of: - `d` for days - `h` for hours - `m` for minutes - `s` for seconds - `w` for weeks  For example `24h`, to mean query data starting from 24 hours ago to now.
    Integer perPage = 56; // Integer | Limit the number of rows to return in the result. Default and maximum allowed is 100.
    String query = "query_example"; // String | The search filter for your query, read more about query syntax [here](https://docs.sentry.io/product/sentry-basics/search/)  example: `query=(transaction:foo AND release:abc) OR (transaction:[bar,baz] AND release:def)` 
    String sort = "sort_example"; // String | What to order the results of the query by. Must be something in the `field` list, excluding equations.
    try {
      QueryDiscoverEventsInTableFormat200Response result = apiInstance.queryDiscoverEventsInTableFormat(organizationSlug, field, end, environment, project, start, statsPeriod, perPage, query, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscoverApi#queryDiscoverEventsInTableFormat");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationSlug** | **String**| The slug of the organization the resource belongs to. | |
| **field** | [**List&lt;String&gt;**](String.md)| The fields, functions, or equations to request for the query. At most 20 fields can be selected per request. Each field can be one of the following types: - A built-in key field. See possible fields in the [properties table](/product/sentry-basics/search/searchable-properties/#properties-table), under any field that is an event property     - example: &#x60;field&#x3D;transaction&#x60; - A tag. Tags should use the &#x60;tag[]&#x60; formatting to avoid ambiguity with any fields     - example: &#x60;field&#x3D;tag[isEnterprise]&#x60; - A function which will be in the format of &#x60;function_name(parameters,...)&#x60;. See possible functions in the [query builder documentation](/product/discover-queries/query-builder/#stacking-functions)     - when a function is included, Discover will group by any tags or fields     - example: &#x60;field&#x3D;count_if(transaction.duration,greater,300)&#x60; - An equation when prefixed with &#x60;equation|&#x60;. Read more about [equations here](https://docs.sentry.io/product/discover-queries/query-builder/query-equations/)     - example: &#x60;field&#x3D;equation|count_if(transaction.duration,greater,300) / count() * 100&#x60;  | |
| **end** | **OffsetDateTime**| The end of the period of time for the query, expected in ISO-8601 format. For example &#x60;2001-12-14T12:34:56.7890&#x60; | [optional] |
| **environment** | [**List&lt;String&gt;**](String.md)| The name of environments to filter by. | [optional] |
| **project** | [**List&lt;Integer&gt;**](Integer.md)| The ids of projects to filter by. &#x60;-1&#x60; means all available projects. If this parameter is omitted, the request will default to using &#39;My Projects&#39; | [optional] |
| **start** | **OffsetDateTime**| The start of the period of time for the query, expected in ISO-8601 format. For example &#x60;2001-12-14T12:34:56.7890&#x60; | [optional] |
| **statsPeriod** | **String**| The period of time for the query, will override the start &amp; end parameters, a number followed by one of: - &#x60;d&#x60; for days - &#x60;h&#x60; for hours - &#x60;m&#x60; for minutes - &#x60;s&#x60; for seconds - &#x60;w&#x60; for weeks  For example &#x60;24h&#x60;, to mean query data starting from 24 hours ago to now. | [optional] |
| **perPage** | **Integer**| Limit the number of rows to return in the result. Default and maximum allowed is 100. | [optional] |
| **query** | **String**| The search filter for your query, read more about query syntax [here](https://docs.sentry.io/product/sentry-basics/search/)  example: &#x60;query&#x3D;(transaction:foo AND release:abc) OR (transaction:[bar,baz] AND release:def)&#x60;  | [optional] |
| **sort** | **String**| What to order the results of the query by. Must be something in the &#x60;field&#x60; list, excluding equations. | [optional] |

### Return type

[**QueryDiscoverEventsInTableFormat200Response**](QueryDiscoverEventsInTableFormat200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid Query |  -  |
| **404** | Not Found |  -  |

