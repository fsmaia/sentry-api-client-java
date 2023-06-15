# EventsApi

All URIs are relative to *https://sentry.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkMutateAListOfIssues**](EventsApi.md#bulkMutateAListOfIssues) | **PUT** /api/0/projects/{organization_slug}/{project_slug}/issues/ |  |
| [**bulkRemoveAListOfIssues**](EventsApi.md#bulkRemoveAListOfIssues) | **DELETE** /api/0/projects/{organization_slug}/{project_slug}/issues/ |  |
| [**debugIssuesRelatedToSourceMapsForAGivenEvent**](EventsApi.md#debugIssuesRelatedToSourceMapsForAGivenEvent) | **GET** /api/0/projects/{organization_slug}/{project_slug}/events/{event_id}/source-map-debug/ |  |
| [**listAProjectsEvents**](EventsApi.md#listAProjectsEvents) | **GET** /api/0/projects/{organization_slug}/{project_slug}/events/ |  |
| [**listAProjectsIssues**](EventsApi.md#listAProjectsIssues) | **GET** /api/0/projects/{organization_slug}/{project_slug}/issues/ |  |
| [**listATagsValuesRelatedToAnIssue**](EventsApi.md#listATagsValuesRelatedToAnIssue) | **GET** /api/0/issues/{issue_id}/tags/{key}/values/ |  |
| [**listAnIssuesEvents**](EventsApi.md#listAnIssuesEvents) | **GET** /api/0/issues/{issue_id}/events/ |  |
| [**listAnIssuesHashes**](EventsApi.md#listAnIssuesHashes) | **GET** /api/0/issues/{issue_id}/hashes/ |  |
| [**removeAnIssue**](EventsApi.md#removeAnIssue) | **DELETE** /api/0/issues/{issue_id}/ |  |
| [**retrieveAnEventForAProject**](EventsApi.md#retrieveAnEventForAProject) | **GET** /api/0/projects/{organization_slug}/{project_slug}/events/{event_id}/ |  |
| [**retrieveAnIssue**](EventsApi.md#retrieveAnIssue) | **GET** /api/0/issues/{issue_id}/ |  |
| [**retrieveTagDetails**](EventsApi.md#retrieveTagDetails) | **GET** /api/0/issues/{issue_id}/tags/{key}/ |  |
| [**retrieveTheLatestEventForAnIssue**](EventsApi.md#retrieveTheLatestEventForAnIssue) | **GET** /api/0/issues/{issue_id}/events/latest/ |  |
| [**retrieveTheOldestEventForAnIssue**](EventsApi.md#retrieveTheOldestEventForAnIssue) | **GET** /api/0/issues/{issue_id}/events/oldest/ |  |
| [**updateAnIssue**](EventsApi.md#updateAnIssue) | **PUT** /api/0/issues/{issue_id}/ |  |


<a id="bulkMutateAListOfIssues"></a>
# **bulkMutateAListOfIssues**
> BulkMutateAListOfIssues200Response bulkMutateAListOfIssues(organizationSlug, projectSlug, bulkMutateAListOfIssuesRequest, id, status)



Bulk mutate various attributes on issues.  The list of issues to modify is given through the &#x60;id&#x60; query parameter.  It is repeated for each issue that should be modified.  - For non-status updates, the &#x60;id&#x60; query parameter is required. - For status updates, the &#x60;id&#x60; query parameter may be omitted for a batch \&quot;update all\&quot; query. - An optional &#x60;status&#x60; query parameter may be used to restrict mutations to only events with the given status.  The following attributes can be modified and are supplied as JSON object in the body:  If any ids are out of scope this operation will succeed without any data mutation.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the issues belong to.
    String projectSlug = "projectSlug_example"; // String | The slug of the project the issues belong to.
    BulkMutateAListOfIssuesRequest bulkMutateAListOfIssuesRequest = new BulkMutateAListOfIssuesRequest(); // BulkMutateAListOfIssuesRequest | 
    Integer id = 56; // Integer | A list of IDs of the issues to be mutated. This parameter shall be repeated for each issue. It is optional only if a status is mutated in which case an implicit update all is assumed.
    String status = "status_example"; // String | Optionally limits the query to issues of the specified status. Valid values are `\"resolved\"`, `\"unresolved\"`, and `\"ignored\"`.
    try {
      BulkMutateAListOfIssues200Response result = apiInstance.bulkMutateAListOfIssues(organizationSlug, projectSlug, bulkMutateAListOfIssuesRequest, id, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#bulkMutateAListOfIssues");
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
| **organizationSlug** | **String**| The slug of the organization the issues belong to. | |
| **projectSlug** | **String**| The slug of the project the issues belong to. | |
| **bulkMutateAListOfIssuesRequest** | [**BulkMutateAListOfIssuesRequest**](BulkMutateAListOfIssuesRequest.md)|  | |
| **id** | **Integer**| A list of IDs of the issues to be mutated. This parameter shall be repeated for each issue. It is optional only if a status is mutated in which case an implicit update all is assumed. | [optional] |
| **status** | **String**| Optionally limits the query to issues of the specified status. Valid values are &#x60;\&quot;resolved\&quot;&#x60;, &#x60;\&quot;unresolved\&quot;&#x60;, and &#x60;\&quot;ignored\&quot;&#x60;. | [optional] |

### Return type

[**BulkMutateAListOfIssues200Response**](BulkMutateAListOfIssues200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Input |  -  |
| **403** | Forbidden |  -  |
| **404** | The requested resource does not exist |  -  |

<a id="bulkRemoveAListOfIssues"></a>
# **bulkRemoveAListOfIssues**
> bulkRemoveAListOfIssues(organizationSlug, projectSlug, id)



Permanently remove the given issues. The list of issues to modify is given through the &#x60;id&#x60; query parameter.  It is repeated for each issue that should be removed.  Only queries by &#39;id&#39; are accepted.  If any ids are out of scope this operation will succeed without any data mutation.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the issues belong to.
    String projectSlug = "projectSlug_example"; // String | The slug of the project the issues belong to.
    Integer id = 56; // Integer | A list of IDs of the issues to be removed. This parameter shall be repeated for each issue.
    try {
      apiInstance.bulkRemoveAListOfIssues(organizationSlug, projectSlug, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#bulkRemoveAListOfIssues");
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
| **organizationSlug** | **String**| The slug of the organization the issues belong to. | |
| **projectSlug** | **String**| The slug of the project the issues belong to. | |
| **id** | **Integer**| A list of IDs of the issues to be removed. This parameter shall be repeated for each issue. | [optional] |

### Return type

null (empty response body)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Project not found |  -  |

<a id="debugIssuesRelatedToSourceMapsForAGivenEvent"></a>
# **debugIssuesRelatedToSourceMapsForAGivenEvent**
> DebugIssuesRelatedToSourceMapsForAGivenEvent200Response debugIssuesRelatedToSourceMapsForAGivenEvent(organizationSlug, projectSlug, eventId, frameIdx, exceptionIdx)



Retrieve information about source maps for a given event. &#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60;&#x60; Return a list of source map errors for a given event.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String projectSlug = "projectSlug_example"; // String | The slug of the project the resource belongs to.
    UUID eventId = UUID.randomUUID(); // UUID | The id of the event
    Integer frameIdx = 56; // Integer | Index of the frame that should be used for source map resolution.
    Integer exceptionIdx = 56; // Integer | Index of the exception that should be used for source map resolution.
    try {
      DebugIssuesRelatedToSourceMapsForAGivenEvent200Response result = apiInstance.debugIssuesRelatedToSourceMapsForAGivenEvent(organizationSlug, projectSlug, eventId, frameIdx, exceptionIdx);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#debugIssuesRelatedToSourceMapsForAGivenEvent");
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
| **projectSlug** | **String**| The slug of the project the resource belongs to. | |
| **eventId** | **UUID**| The id of the event | |
| **frameIdx** | **Integer**| Index of the frame that should be used for source map resolution. | |
| **exceptionIdx** | **Integer**| Index of the exception that should be used for source map resolution. | |

### Return type

[**DebugIssuesRelatedToSourceMapsForAGivenEvent200Response**](DebugIssuesRelatedToSourceMapsForAGivenEvent200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="listAProjectsEvents"></a>
# **listAProjectsEvents**
> List&lt;ListAProjectSEvents200ResponseInner&gt; listAProjectsEvents(organizationSlug, projectSlug, full, cursor)



Return a list of events bound to a project.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the groups belong to.
    String projectSlug = "projectSlug_example"; // String | The slug of the project the groups belong to.
    Boolean full = true; // Boolean | If this is set to true then the event payload will include the full event body, including the stacktrace.  Set to true to enable.
    String cursor = "cursor_example"; // String | A pointer to the last object fetched and its sort order; used to retrieve the next or previous results.
    try {
      List<ListAProjectSEvents200ResponseInner> result = apiInstance.listAProjectsEvents(organizationSlug, projectSlug, full, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listAProjectsEvents");
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
| **organizationSlug** | **String**| The slug of the organization the groups belong to. | |
| **projectSlug** | **String**| The slug of the project the groups belong to. | |
| **full** | **Boolean**| If this is set to true then the event payload will include the full event body, including the stacktrace.  Set to true to enable. | [optional] |
| **cursor** | **String**| A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. | [optional] |

### Return type

[**List&lt;ListAProjectSEvents200ResponseInner&gt;**](ListAProjectSEvents200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="listAProjectsIssues"></a>
# **listAProjectsIssues**
> List&lt;ListAProjectSIssues200ResponseInner&gt; listAProjectsIssues(organizationSlug, projectSlug, statsPeriod, shortIdLookup, query, cursor)



Return a list of issues (groups) bound to a project.  All parameters are supplied as query string parameters.    A default query of &#x60;&#x60;is:unresolved&#x60;&#x60; is applied. To return results with other statuses send an new query value (i.e. &#x60;&#x60;?query&#x3D;&#x60;&#x60; for all results).  The &#x60;&#x60;statsPeriod&#x60;&#x60; parameter can be used to select the timeline stats which should be present. Possible values are: &#x60;&#x60;\&quot;\&quot;&#x60;&#x60; (disable),&#x60;&#x60;\&quot;24h\&quot;&#x60;&#x60;, &#x60;&#x60;\&quot;14d\&quot;&#x60;&#x60;

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the issues belong to.
    String projectSlug = "projectSlug_example"; // String | The slug of the project the issues belong to.
    String statsPeriod = "statsPeriod_example"; // String | An optional stat period (can be one of `\"24h\"`, `\"14d\"`, and `\"\"`).
    Boolean shortIdLookup = true; // Boolean | If this is set to true then short IDs are looked up by this function as well. This can cause the return value of the function to return an event issue of a different project which is why this is an opt-in. Set to 1 to enable.
    String query = "query_example"; // String | An optional Sentry structured search query. If not provided an implied `\"is:unresolved\"` is assumed.
    String cursor = "cursor_example"; // String | A pointer to the last object fetched and its sort order; used to retrieve the next or previous results.
    try {
      List<ListAProjectSIssues200ResponseInner> result = apiInstance.listAProjectsIssues(organizationSlug, projectSlug, statsPeriod, shortIdLookup, query, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listAProjectsIssues");
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
| **organizationSlug** | **String**| The slug of the organization the issues belong to. | |
| **projectSlug** | **String**| The slug of the project the issues belong to. | |
| **statsPeriod** | **String**| An optional stat period (can be one of &#x60;\&quot;24h\&quot;&#x60;, &#x60;\&quot;14d\&quot;&#x60;, and &#x60;\&quot;\&quot;&#x60;). | [optional] |
| **shortIdLookup** | **Boolean**| If this is set to true then short IDs are looked up by this function as well. This can cause the return value of the function to return an event issue of a different project which is why this is an opt-in. Set to 1 to enable. | [optional] |
| **query** | **String**| An optional Sentry structured search query. If not provided an implied &#x60;\&quot;is:unresolved\&quot;&#x60; is assumed. | [optional] |
| **cursor** | **String**| A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. | [optional] |

### Return type

[**List&lt;ListAProjectSIssues200ResponseInner&gt;**](ListAProjectSIssues200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="listATagsValuesRelatedToAnIssue"></a>
# **listATagsValuesRelatedToAnIssue**
> List&lt;ListATagSValuesRelatedToAnIssue200ResponseInner&gt; listATagsValuesRelatedToAnIssue(issueId, key)



Returns details for given tag key related to an issue.   When [paginated](/api/pagination) can return at most 1000 values.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the issue to retrieve.
    String key = "key_example"; // String | The tag key to look the values up for.
    try {
      List<ListATagSValuesRelatedToAnIssue200ResponseInner> result = apiInstance.listATagsValuesRelatedToAnIssue(issueId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listATagsValuesRelatedToAnIssue");
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
| **issueId** | **String**| The ID of the issue to retrieve. | |
| **key** | **String**| The tag key to look the values up for. | |

### Return type

[**List&lt;ListATagSValuesRelatedToAnIssue200ResponseInner&gt;**](ListATagSValuesRelatedToAnIssue200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="listAnIssuesEvents"></a>
# **listAnIssuesEvents**
> List&lt;ListAProjectSEvents200ResponseInner&gt; listAnIssuesEvents(issueId, full)



This endpoint lists an issue&#39;s events.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the issue to retrieve.
    Boolean full = true; // Boolean | If this is set to true then the event payload will include the full event body, including the stacktrace.  Set to true to enable.
    try {
      List<ListAProjectSEvents200ResponseInner> result = apiInstance.listAnIssuesEvents(issueId, full);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listAnIssuesEvents");
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
| **issueId** | **String**| The ID of the issue to retrieve. | |
| **full** | **Boolean**| If this is set to true then the event payload will include the full event body, including the stacktrace.  Set to true to enable. | [optional] |

### Return type

[**List&lt;ListAProjectSEvents200ResponseInner&gt;**](ListAProjectSEvents200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="listAnIssuesHashes"></a>
# **listAnIssuesHashes**
> List&lt;ListAnIssueSHashes200ResponseInner&gt; listAnIssuesHashes(issueId, cursor)



This endpoint lists an issue&#39;s hashes, which are the generated checksums used to aggregate individual events.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the issue to retrieve.
    String cursor = "cursor_example"; // String | A pointer to the last object fetched and its sort order; used to retrieve the next or previous results.
    try {
      List<ListAnIssueSHashes200ResponseInner> result = apiInstance.listAnIssuesHashes(issueId, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#listAnIssuesHashes");
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
| **issueId** | **String**| The ID of the issue to retrieve. | |
| **cursor** | **String**| A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. | [optional] |

### Return type

[**List&lt;ListAnIssueSHashes200ResponseInner&gt;**](ListAnIssueSHashes200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="removeAnIssue"></a>
# **removeAnIssue**
> removeAnIssue(issueId)



Removes an individual issue.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the issue to delete.
    try {
      apiInstance.removeAnIssue(issueId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#removeAnIssue");
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
| **issueId** | **String**| The ID of the issue to delete. | |

### Return type

null (empty response body)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | The requested resource does not exist |  -  |

<a id="retrieveAnEventForAProject"></a>
# **retrieveAnEventForAProject**
> RetrieveAnEventForAProject200Response retrieveAnEventForAProject(organizationSlug, projectSlug, eventId)



Return details on an individual event.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the event belongs to.
    String projectSlug = "projectSlug_example"; // String | The slug of the project the event belongs to.
    String eventId = "eventId_example"; // String | The ID of the event to retrieve. It is the hexadecimal ID as reported by the client.
    try {
      RetrieveAnEventForAProject200Response result = apiInstance.retrieveAnEventForAProject(organizationSlug, projectSlug, eventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#retrieveAnEventForAProject");
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
| **organizationSlug** | **String**| The slug of the organization the event belongs to. | |
| **projectSlug** | **String**| The slug of the project the event belongs to. | |
| **eventId** | **String**| The ID of the event to retrieve. It is the hexadecimal ID as reported by the client. | |

### Return type

[**RetrieveAnEventForAProject200Response**](RetrieveAnEventForAProject200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="retrieveAnIssue"></a>
# **retrieveAnIssue**
> RetrieveAnIssue200Response retrieveAnIssue(issueId)



Return details on an individual issue. This returns the basic stats for the issue (title, last seen, first seen), some overall numbers (number of comments, user reports) as well as the summarized event data.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the issue to retrieve.
    try {
      RetrieveAnIssue200Response result = apiInstance.retrieveAnIssue(issueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#retrieveAnIssue");
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
| **issueId** | **String**| The ID of the issue to retrieve. | |

### Return type

[**RetrieveAnIssue200Response**](RetrieveAnIssue200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="retrieveTagDetails"></a>
# **retrieveTagDetails**
> RetrieveTagDetails200Response retrieveTagDetails(issueId, key)



Returns details for given tag key related to an issue.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the issue to retrieve.
    String key = "key_example"; // String | The tag key to look the values up for.
    try {
      RetrieveTagDetails200Response result = apiInstance.retrieveTagDetails(issueId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#retrieveTagDetails");
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
| **issueId** | **String**| The ID of the issue to retrieve. | |
| **key** | **String**| The tag key to look the values up for. | |

### Return type

[**RetrieveTagDetails200Response**](RetrieveTagDetails200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="retrieveTheLatestEventForAnIssue"></a>
# **retrieveTheLatestEventForAnIssue**
> RetrieveAnEventForAProject200Response retrieveTheLatestEventForAnIssue(issueId)



Retrieves the details of the latest event for an issue.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the issue.
    try {
      RetrieveAnEventForAProject200Response result = apiInstance.retrieveTheLatestEventForAnIssue(issueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#retrieveTheLatestEventForAnIssue");
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
| **issueId** | **String**| The ID of the issue. | |

### Return type

[**RetrieveAnEventForAProject200Response**](RetrieveAnEventForAProject200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="retrieveTheOldestEventForAnIssue"></a>
# **retrieveTheOldestEventForAnIssue**
> RetrieveAnEventForAProject200Response retrieveTheOldestEventForAnIssue(issueId)



Retrieves the details of the oldest event for an issue.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the issue.
    try {
      RetrieveAnEventForAProject200Response result = apiInstance.retrieveTheOldestEventForAnIssue(issueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#retrieveTheOldestEventForAnIssue");
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
| **issueId** | **String**| The ID of the issue. | |

### Return type

[**RetrieveAnEventForAProject200Response**](RetrieveAnEventForAProject200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |

<a id="updateAnIssue"></a>
# **updateAnIssue**
> UpdateAnIssue200Response updateAnIssue(issueId, updateAnIssueRequest)



Updates an individual issue&#39;s attributes.  Only the attributes submitted are modified.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String issueId = "issueId_example"; // String | The ID of the group to retrieve.
    UpdateAnIssueRequest updateAnIssueRequest = new UpdateAnIssueRequest(); // UpdateAnIssueRequest | 
    try {
      UpdateAnIssue200Response result = apiInstance.updateAnIssue(issueId, updateAnIssueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#updateAnIssue");
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
| **issueId** | **String**| The ID of the group to retrieve. | |
| **updateAnIssueRequest** | [**UpdateAnIssueRequest**](UpdateAnIssueRequest.md)|  | |

### Return type

[**UpdateAnIssue200Response**](UpdateAnIssue200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | The requested resource does not exist |  -  |

