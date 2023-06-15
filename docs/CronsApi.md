# CronsApi

All URIs are relative to *https://sentry.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAMonitor**](CronsApi.md#createAMonitor) | **POST** /api/0/organizations/{organization_slug}/monitors/ |  |
| [**createANewCheckIn**](CronsApi.md#createANewCheckIn) | **POST** /api/0/organization/{organization_slug}/monitors/{monitor_slug}/checkins/ |  |
| [**deleteAMonitorOrMonitorEnvironments**](CronsApi.md#deleteAMonitorOrMonitorEnvironments) | **DELETE** /api/0/organizations/{organization_slug}/monitors/{monitor_slug}/ |  |
| [**retrieveAMonitor**](CronsApi.md#retrieveAMonitor) | **GET** /api/0/organizations/{organization_slug}/monitors/{monitor_slug}/ |  |
| [**retrieveCheckInsForAMonitor**](CronsApi.md#retrieveCheckInsForAMonitor) | **GET** /api/0/organization/{organization_slug}/monitors/{monitor_slug}/checkins/ |  |
| [**retrieveMonitorsForAnOrganization**](CronsApi.md#retrieveMonitorsForAnOrganization) | **GET** /api/0/organizations/{organization_slug}/monitors/ |  |
| [**updateACheckIn**](CronsApi.md#updateACheckIn) | **PUT** /api/0/organization/{organization_slug}/monitors/{monitor_slug}/checkins/{checkin_id}/ |  |
| [**updateAMonitor**](CronsApi.md#updateAMonitor) | **PUT** /api/0/organizations/{organization_slug}/monitors/{monitor_slug}/ |  |


<a id="createAMonitor"></a>
# **createAMonitor**
> RetrieveMonitorsForAnOrganization200ResponseInner createAMonitor(organizationSlug, createAMonitorRequest)



Create a new monitor.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.CronsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    CronsApi apiInstance = new CronsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    CreateAMonitorRequest createAMonitorRequest = new CreateAMonitorRequest(); // CreateAMonitorRequest | 
    try {
      RetrieveMonitorsForAnOrganization200ResponseInner result = apiInstance.createAMonitor(organizationSlug, createAMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronsApi#createAMonitor");
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
| **createAMonitorRequest** | [**CreateAMonitorRequest**](CreateAMonitorRequest.md)|  | |

### Return type

[**RetrieveMonitorsForAnOrganization200ResponseInner**](RetrieveMonitorsForAnOrganization200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="createANewCheckIn"></a>
# **createANewCheckIn**
> RetrieveCheckInsForAMonitor200ResponseInner createANewCheckIn(organizationSlug, monitorSlug, createANewCheckInRequest)



Creates a new check-in for a monitor.  If &#x60;status&#x60; is not present, it will be assumed that the check-in is starting, and be marked as &#x60;in_progress&#x60;.  To achieve a ping-like behavior, you can simply define &#x60;status&#x60; and optionally &#x60;duration&#x60; and this check-in will be automatically marked as finished.  Note: If a DSN is utilized for authentication, the response will be limited in details.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.CronsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    CronsApi apiInstance = new CronsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String monitorSlug = "monitorSlug_example"; // String | The slug of the monitor
    CreateANewCheckInRequest createANewCheckInRequest = new CreateANewCheckInRequest(); // CreateANewCheckInRequest | 
    try {
      RetrieveCheckInsForAMonitor200ResponseInner result = apiInstance.createANewCheckIn(organizationSlug, monitorSlug, createANewCheckInRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronsApi#createANewCheckIn");
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
| **monitorSlug** | **String**| The slug of the monitor | |
| **createANewCheckInRequest** | [**CreateANewCheckInRequest**](CreateANewCheckInRequest.md)|  | |

### Return type

[**RetrieveCheckInsForAMonitor200ResponseInner**](RetrieveCheckInsForAMonitor200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **201** |  |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="deleteAMonitorOrMonitorEnvironments"></a>
# **deleteAMonitorOrMonitorEnvironments**
> deleteAMonitorOrMonitorEnvironments(organizationSlug, monitorSlug, environment)



Delete a monitor or monitor environments.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.CronsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    CronsApi apiInstance = new CronsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String monitorSlug = "monitorSlug_example"; // String | The slug of the monitor
    List<String> environment = Arrays.asList(); // List<String> | The name of environments to filter by.
    try {
      apiInstance.deleteAMonitorOrMonitorEnvironments(organizationSlug, monitorSlug, environment);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronsApi#deleteAMonitorOrMonitorEnvironments");
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
| **monitorSlug** | **String**| The slug of the monitor | |
| **environment** | [**List&lt;String&gt;**](String.md)| The name of environments to filter by. | [optional] |

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
| **202** | Accepted |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="retrieveAMonitor"></a>
# **retrieveAMonitor**
> RetrieveMonitorsForAnOrganization200ResponseInner retrieveAMonitor(organizationSlug, monitorSlug, environment)



Retrieves details for a monitor.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.CronsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    CronsApi apiInstance = new CronsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String monitorSlug = "monitorSlug_example"; // String | The slug of the monitor
    List<String> environment = Arrays.asList(); // List<String> | The name of environments to filter by.
    try {
      RetrieveMonitorsForAnOrganization200ResponseInner result = apiInstance.retrieveAMonitor(organizationSlug, monitorSlug, environment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronsApi#retrieveAMonitor");
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
| **monitorSlug** | **String**| The slug of the monitor | |
| **environment** | [**List&lt;String&gt;**](String.md)| The name of environments to filter by. | [optional] |

### Return type

[**RetrieveMonitorsForAnOrganization200ResponseInner**](RetrieveMonitorsForAnOrganization200ResponseInner.md)

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

<a id="retrieveCheckInsForAMonitor"></a>
# **retrieveCheckInsForAMonitor**
> List&lt;RetrieveCheckInsForAMonitor200ResponseInner&gt; retrieveCheckInsForAMonitor(organizationSlug, monitorSlug, checkinId)



Retrieve a list of check-ins for a monitor

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.CronsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    CronsApi apiInstance = new CronsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String monitorSlug = "monitorSlug_example"; // String | The slug of the monitor
    UUID checkinId = UUID.randomUUID(); // UUID | The id of the check-in
    try {
      List<RetrieveCheckInsForAMonitor200ResponseInner> result = apiInstance.retrieveCheckInsForAMonitor(organizationSlug, monitorSlug, checkinId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronsApi#retrieveCheckInsForAMonitor");
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
| **monitorSlug** | **String**| The slug of the monitor | |
| **checkinId** | **UUID**| The id of the check-in | |

### Return type

[**List&lt;RetrieveCheckInsForAMonitor200ResponseInner&gt;**](RetrieveCheckInsForAMonitor200ResponseInner.md)

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

<a id="retrieveMonitorsForAnOrganization"></a>
# **retrieveMonitorsForAnOrganization**
> List&lt;RetrieveMonitorsForAnOrganization200ResponseInner&gt; retrieveMonitorsForAnOrganization(organizationSlug, project, environment)



Lists monitors, including nested monitor enviroments. May be filtered to a project or environment.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.CronsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    CronsApi apiInstance = new CronsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    List<Integer> project = Arrays.asList(); // List<Integer> | The ids of projects to filter by. `-1` means all available projects. If this parameter is omitted, the request will default to using 'My Projects'
    List<String> environment = Arrays.asList(); // List<String> | The name of environments to filter by.
    try {
      List<RetrieveMonitorsForAnOrganization200ResponseInner> result = apiInstance.retrieveMonitorsForAnOrganization(organizationSlug, project, environment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronsApi#retrieveMonitorsForAnOrganization");
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
| **project** | [**List&lt;Integer&gt;**](Integer.md)| The ids of projects to filter by. &#x60;-1&#x60; means all available projects. If this parameter is omitted, the request will default to using &#39;My Projects&#39; | [optional] |
| **environment** | [**List&lt;String&gt;**](String.md)| The name of environments to filter by. | [optional] |

### Return type

[**List&lt;RetrieveMonitorsForAnOrganization200ResponseInner&gt;**](RetrieveMonitorsForAnOrganization200ResponseInner.md)

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

<a id="updateACheckIn"></a>
# **updateACheckIn**
> RetrieveCheckInsForAMonitor200ResponseInner updateACheckIn(organizationSlug, monitorSlug, checkinId, createANewCheckInRequest)



Updates a check-in.  Once a check-in is finished (indicated via an &#x60;ok&#x60; or &#x60;error&#x60; status) it can no longer be changed.  If you simply wish to update that the task is still running, you can simply send an empty payload.  You may use &#x60;latest&#x60; for the &#x60;checkin_id&#x60; parameter in order to retrieve the most recent (by creation date) check-in which is still mutable (not marked as finished).

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.CronsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    CronsApi apiInstance = new CronsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String monitorSlug = "monitorSlug_example"; // String | The slug of the monitor
    UUID checkinId = UUID.randomUUID(); // UUID | The id of the check-in
    CreateANewCheckInRequest createANewCheckInRequest = new CreateANewCheckInRequest(); // CreateANewCheckInRequest | 
    try {
      RetrieveCheckInsForAMonitor200ResponseInner result = apiInstance.updateACheckIn(organizationSlug, monitorSlug, checkinId, createANewCheckInRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronsApi#updateACheckIn");
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
| **monitorSlug** | **String**| The slug of the monitor | |
| **checkinId** | **UUID**| The id of the check-in | |
| **createANewCheckInRequest** | [**CreateANewCheckInRequest**](CreateANewCheckInRequest.md)|  | |

### Return type

[**RetrieveCheckInsForAMonitor200ResponseInner**](RetrieveCheckInsForAMonitor200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **208** | Already Reported |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="updateAMonitor"></a>
# **updateAMonitor**
> RetrieveMonitorsForAnOrganization200ResponseInner updateAMonitor(organizationSlug, monitorSlug, createAMonitorRequest)



Update a monitor.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.CronsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    CronsApi apiInstance = new CronsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String monitorSlug = "monitorSlug_example"; // String | The slug of the monitor
    CreateAMonitorRequest createAMonitorRequest = new CreateAMonitorRequest(); // CreateAMonitorRequest | 
    try {
      RetrieveMonitorsForAnOrganization200ResponseInner result = apiInstance.updateAMonitor(organizationSlug, monitorSlug, createAMonitorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CronsApi#updateAMonitor");
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
| **monitorSlug** | **String**| The slug of the monitor | |
| **createAMonitorRequest** | [**CreateAMonitorRequest**](CreateAMonitorRequest.md)|  | |

### Return type

[**RetrieveMonitorsForAnOrganization200ResponseInner**](RetrieveMonitorsForAnOrganization200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

