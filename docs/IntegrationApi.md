# IntegrationApi

All URIs are relative to *https://sentry.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnExternalIssue**](IntegrationApi.md#createAnExternalIssue) | **POST** /api/0/sentry-app-installations/{uuid}/external-issues/ |  |
| [**deleteAnExternalIssue**](IntegrationApi.md#deleteAnExternalIssue) | **DELETE** /api/0/sentry-app-installations/{uuid}/external-issues/{external_issue_id}/ |  |
| [**listAnOrganizationsIntegrationPlatformInstallations**](IntegrationApi.md#listAnOrganizationsIntegrationPlatformInstallations) | **GET** /api/0/organizations/{organization_slug}/sentry-app-installations/ |  |


<a id="createAnExternalIssue"></a>
# **createAnExternalIssue**
> CreateAnExternalIssue200Response createAnExternalIssue(uuid, createAnExternalIssueRequest)



Create an external issue from an integration platform integration.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String uuid = "uuid_example"; // String | The uuid of the integration platform integration.
    CreateAnExternalIssueRequest createAnExternalIssueRequest = new CreateAnExternalIssueRequest(); // CreateAnExternalIssueRequest | 
    try {
      CreateAnExternalIssue200Response result = apiInstance.createAnExternalIssue(uuid, createAnExternalIssueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#createAnExternalIssue");
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
| **uuid** | **String**| The uuid of the integration platform integration. | |
| **createAnExternalIssueRequest** | [**CreateAnExternalIssueRequest**](CreateAnExternalIssueRequest.md)|  | |

### Return type

[**CreateAnExternalIssue200Response**](CreateAnExternalIssue200Response.md)

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
| **404** | Not Found |  -  |

<a id="deleteAnExternalIssue"></a>
# **deleteAnExternalIssue**
> deleteAnExternalIssue(uuid, externalIssueId)



Delete an external issue.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String uuid = "uuid_example"; // String | The uuid of the integration platform integration.
    String externalIssueId = "externalIssueId_example"; // String | The id of the external issue.
    try {
      apiInstance.deleteAnExternalIssue(uuid, externalIssueId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#deleteAnExternalIssue");
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
| **uuid** | **String**| The uuid of the integration platform integration. | |
| **externalIssueId** | **String**| The id of the external issue. | |

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
| **404** | External issue not found |  -  |

<a id="listAnOrganizationsIntegrationPlatformInstallations"></a>
# **listAnOrganizationsIntegrationPlatformInstallations**
> List&lt;ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner&gt; listAnOrganizationsIntegrationPlatformInstallations(organizationSlug)



Return a list of integration platform installations for a given organization.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.IntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    IntegrationApi apiInstance = new IntegrationApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The organization short name.
    try {
      List<ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner> result = apiInstance.listAnOrganizationsIntegrationPlatformInstallations(organizationSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#listAnOrganizationsIntegrationPlatformInstallations");
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
| **organizationSlug** | **String**| The organization short name. | |

### Return type

[**List&lt;ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner&gt;**](ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner.md)

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
| **404** | Not Found |  -  |

