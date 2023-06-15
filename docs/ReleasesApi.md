# ReleasesApi

All URIs are relative to *https://sentry.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createANewDeployForAnOrganization**](ReleasesApi.md#createANewDeployForAnOrganization) | **POST** /api/0/organizations/{organization_slug}/releases/{version}/deploys/ |  |
| [**createANewReleaseForAnOrganization**](ReleasesApi.md#createANewReleaseForAnOrganization) | **POST** /api/0/organizations/{organization_slug}/releases/ |  |
| [**deleteAProjectReleasesFile**](ReleasesApi.md#deleteAProjectReleasesFile) | **DELETE** /api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/{file_id}/ |  |
| [**deleteAnOrganizationReleasesFile**](ReleasesApi.md#deleteAnOrganizationReleasesFile) | **DELETE** /api/0/organizations/{organization_slug}/releases/{version}/files/{file_id}/ |  |
| [**deleteAnOrganizationsRelease**](ReleasesApi.md#deleteAnOrganizationsRelease) | **DELETE** /api/0/organizations/{organization_slug}/releases/{version}/ |  |
| [**listAProjectReleasesCommits**](ReleasesApi.md#listAProjectReleasesCommits) | **GET** /api/0/projects/{organization_slug}/{project_slug}/releases/{version}/commits/ |  |
| [**listAProjectsReleaseFiles**](ReleasesApi.md#listAProjectsReleaseFiles) | **GET** /api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/ |  |
| [**listAReleasesDeploys**](ReleasesApi.md#listAReleasesDeploys) | **GET** /api/0/organizations/{organization_slug}/releases/{version}/deploys/ |  |
| [**listAnOrganizationReleasesCommits**](ReleasesApi.md#listAnOrganizationReleasesCommits) | **GET** /api/0/organizations/{organization_slug}/releases/{version}/commits/ |  |
| [**listAnOrganizationsReleaseFiles**](ReleasesApi.md#listAnOrganizationsReleaseFiles) | **GET** /api/0/organizations/{organization_slug}/releases/{version}/files/ |  |
| [**listAnOrganizationsReleases**](ReleasesApi.md#listAnOrganizationsReleases) | **GET** /api/0/organizations/{organization_slug}/releases/ |  |
| [**listIssuesToBeResolvedInAParticularRelease**](ReleasesApi.md#listIssuesToBeResolvedInAParticularRelease) | **GET** /api/0/projects/{organization_slug}/{project_slug}/releases/{version}/resolved/ |  |
| [**retrieveAProjectReleasesFile**](ReleasesApi.md#retrieveAProjectReleasesFile) | **GET** /api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/{file_id}/ |  |
| [**retrieveAnOrganizationReleasesFile**](ReleasesApi.md#retrieveAnOrganizationReleasesFile) | **GET** /api/0/organizations/{organization_slug}/releases/{version}/files/{file_id}/ |  |
| [**retrieveAnOrganizationsReleases**](ReleasesApi.md#retrieveAnOrganizationsReleases) | **GET** /api/0/organizations/{organization_slug}/releases/{version}/ |  |
| [**retrieveFilesChangedInAReleasesCommits**](ReleasesApi.md#retrieveFilesChangedInAReleasesCommits) | **GET** /api/0/organizations/{organization_slug}/releases/{version}/commitfiles/ |  |
| [**retrieveReleaseHealthSessionStatistics**](ReleasesApi.md#retrieveReleaseHealthSessionStatistics) | **GET** /api/0/organizations/{organization_slug}/sessions/ |  |
| [**updateAProjectReleaseFile**](ReleasesApi.md#updateAProjectReleaseFile) | **PUT** /api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/{file_id}/ |  |
| [**updateAnOrganizationReleaseFile**](ReleasesApi.md#updateAnOrganizationReleaseFile) | **PUT** /api/0/organizations/{organization_slug}/releases/{version}/files/{file_id}/ |  |
| [**updateAnOrganizationsRelease**](ReleasesApi.md#updateAnOrganizationsRelease) | **PUT** /api/0/organizations/{organization_slug}/releases/{version}/ |  |
| [**uploadANewOrganizationReleaseFile**](ReleasesApi.md#uploadANewOrganizationReleaseFile) | **POST** /api/0/organizations/{organization_slug}/releases/{version}/files/ |  |
| [**uploadANewProjectReleaseFile**](ReleasesApi.md#uploadANewProjectReleaseFile) | **POST** /api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/ |  |


<a id="createANewDeployForAnOrganization"></a>
# **createANewDeployForAnOrganization**
> RetrieveAnEventForAProject200ResponseReleaseOneOfLastDeployOneOf createANewDeployForAnOrganization(organizationSlug, version, createANewDeployForAnOrganizationRequest)



Create a deploy.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String version = "version_example"; // String | The version identifier of the release.
    CreateANewDeployForAnOrganizationRequest createANewDeployForAnOrganizationRequest = new CreateANewDeployForAnOrganizationRequest(); // CreateANewDeployForAnOrganizationRequest | 
    try {
      RetrieveAnEventForAProject200ResponseReleaseOneOfLastDeployOneOf result = apiInstance.createANewDeployForAnOrganization(organizationSlug, version, createANewDeployForAnOrganizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createANewDeployForAnOrganization");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **version** | **String**| The version identifier of the release. | |
| **createANewDeployForAnOrganizationRequest** | [**CreateANewDeployForAnOrganizationRequest**](CreateANewDeployForAnOrganizationRequest.md)|  | [optional] |

### Return type

[**RetrieveAnEventForAProject200ResponseReleaseOneOfLastDeployOneOf**](RetrieveAnEventForAProject200ResponseReleaseOneOfLastDeployOneOf.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **208** | Already Reported |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="createANewReleaseForAnOrganization"></a>
# **createANewReleaseForAnOrganization**
> RetrieveAnEventForAProject200ResponseReleaseOneOf createANewReleaseForAnOrganization(organizationSlug, createANewReleaseForAnOrganizationRequest)



Create a new release for the given organization.  Releases are used by Sentry to improve its error reporting abilities by correlating first seen events with the release that might have introduced the problem. Releases are also necessary for source maps and other debug features that require manual upload for functioning well.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    CreateANewReleaseForAnOrganizationRequest createANewReleaseForAnOrganizationRequest = new CreateANewReleaseForAnOrganizationRequest(); // CreateANewReleaseForAnOrganizationRequest | 
    try {
      RetrieveAnEventForAProject200ResponseReleaseOneOf result = apiInstance.createANewReleaseForAnOrganization(organizationSlug, createANewReleaseForAnOrganizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createANewReleaseForAnOrganization");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **createANewReleaseForAnOrganizationRequest** | [**CreateANewReleaseForAnOrganizationRequest**](CreateANewReleaseForAnOrganizationRequest.md)|  | [optional] |

### Return type

[**RetrieveAnEventForAProject200ResponseReleaseOneOf**](RetrieveAnEventForAProject200ResponseReleaseOneOf.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Input |  -  |
| **403** | Forbidden |  -  |

<a id="deleteAProjectReleasesFile"></a>
# **deleteAProjectReleasesFile**
> deleteAProjectReleasesFile(organizationSlug, projectSlug, version, fileId)



Delete a file for a given release.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the release belongs to.
    String projectSlug = "projectSlug_example"; // String | The slug of the project.
    String version = "version_example"; // String | The version identifier of the release.
    String fileId = "fileId_example"; // String | The ID of the file to delete.
    try {
      apiInstance.deleteAProjectReleasesFile(organizationSlug, projectSlug, version, fileId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#deleteAProjectReleasesFile");
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
| **organizationSlug** | **String**| The slug of the organization the release belongs to. | |
| **projectSlug** | **String**| The slug of the project. | |
| **version** | **String**| The version identifier of the release. | |
| **fileId** | **String**| The ID of the file to delete. | |

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
| **404** | Not Found |  -  |

<a id="deleteAnOrganizationReleasesFile"></a>
# **deleteAnOrganizationReleasesFile**
> deleteAnOrganizationReleasesFile(organizationSlug, version, fileId)



Delete a file for a given release.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the release belongs to.
    String version = "version_example"; // String | The version identifier of the release.
    String fileId = "fileId_example"; // String | The ID of the file to delete.
    try {
      apiInstance.deleteAnOrganizationReleasesFile(organizationSlug, version, fileId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#deleteAnOrganizationReleasesFile");
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
| **organizationSlug** | **String**| The slug of the organization the release belongs to. | |
| **version** | **String**| The version identifier of the release. | |
| **fileId** | **String**| The ID of the file to delete. | |

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
| **404** | Not Found |  -  |

<a id="deleteAnOrganizationsRelease"></a>
# **deleteAnOrganizationsRelease**
> deleteAnOrganizationsRelease(organizationSlug, version)



Delete a release for a given organization.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the release belongs to.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      apiInstance.deleteAnOrganizationsRelease(organizationSlug, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#deleteAnOrganizationsRelease");
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
| **organizationSlug** | **String**| The slug of the organization the release belongs to. | |
| **version** | **String**| The version identifier of the release. | |

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

<a id="listAProjectReleasesCommits"></a>
# **listAProjectReleasesCommits**
> List&lt;ListARepositorySCommits200ResponseInner&gt; listAProjectReleasesCommits(organizationSlug, projectSlug, version)



List a project release&#39;s commits.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the release belongs to.
    String projectSlug = "projectSlug_example"; // String | The slug of the project the release belongs to.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      List<ListARepositorySCommits200ResponseInner> result = apiInstance.listAProjectReleasesCommits(organizationSlug, projectSlug, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#listAProjectReleasesCommits");
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
| **organizationSlug** | **String**| The slug of the organization the release belongs to. | |
| **projectSlug** | **String**| The slug of the project the release belongs to. | |
| **version** | **String**| The version identifier of the release. | |

### Return type

[**List&lt;ListARepositorySCommits200ResponseInner&gt;**](ListARepositorySCommits200ResponseInner.md)

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

<a id="listAProjectsReleaseFiles"></a>
# **listAProjectsReleaseFiles**
> List&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt; listAProjectsReleaseFiles(organizationSlug, projectSlug, version)



Return a list of files for a given release.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String projectSlug = "projectSlug_example"; // String | The slug of the project.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      List<ListAnOrganizationSReleaseFiles200ResponseInner> result = apiInstance.listAProjectsReleaseFiles(organizationSlug, projectSlug, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#listAProjectsReleaseFiles");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **projectSlug** | **String**| The slug of the project. | |
| **version** | **String**| The version identifier of the release. | |

### Return type

[**List&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;**](ListAnOrganizationSReleaseFiles200ResponseInner.md)

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

<a id="listAReleasesDeploys"></a>
# **listAReleasesDeploys**
> List&lt;RetrieveAnEventForAProject200ResponseReleaseOneOfLastDeployOneOf&gt; listAReleasesDeploys(organizationSlug, version)



Return a list of deploys for a given release.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      List<RetrieveAnEventForAProject200ResponseReleaseOneOfLastDeployOneOf> result = apiInstance.listAReleasesDeploys(organizationSlug, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#listAReleasesDeploys");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **version** | **String**| The version identifier of the release. | |

### Return type

[**List&lt;RetrieveAnEventForAProject200ResponseReleaseOneOfLastDeployOneOf&gt;**](RetrieveAnEventForAProject200ResponseReleaseOneOfLastDeployOneOf.md)

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

<a id="listAnOrganizationReleasesCommits"></a>
# **listAnOrganizationReleasesCommits**
> List&lt;ListARepositorySCommits200ResponseInner&gt; listAnOrganizationReleasesCommits(organizationSlug, version)



List an organization release&#39;s commits.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the release belongs to.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      List<ListARepositorySCommits200ResponseInner> result = apiInstance.listAnOrganizationReleasesCommits(organizationSlug, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#listAnOrganizationReleasesCommits");
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
| **organizationSlug** | **String**| The slug of the organization the release belongs to. | |
| **version** | **String**| The version identifier of the release. | |

### Return type

[**List&lt;ListARepositorySCommits200ResponseInner&gt;**](ListARepositorySCommits200ResponseInner.md)

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

<a id="listAnOrganizationsReleaseFiles"></a>
# **listAnOrganizationsReleaseFiles**
> List&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt; listAnOrganizationsReleaseFiles(organizationSlug, version)



Return a list of files for a given release.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      List<ListAnOrganizationSReleaseFiles200ResponseInner> result = apiInstance.listAnOrganizationsReleaseFiles(organizationSlug, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#listAnOrganizationsReleaseFiles");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **version** | **String**| The version identifier of the release. | |

### Return type

[**List&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;**](ListAnOrganizationSReleaseFiles200ResponseInner.md)

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

<a id="listAnOrganizationsReleases"></a>
# **listAnOrganizationsReleases**
> List&lt;RetrieveAnEventForAProject200ResponseReleaseOneOf&gt; listAnOrganizationsReleases(organizationSlug, query)



Return a list of releases for a given organization.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String query = "query_example"; // String | This parameter can be used to create a \"starts with\" filter for the version.
    try {
      List<RetrieveAnEventForAProject200ResponseReleaseOneOf> result = apiInstance.listAnOrganizationsReleases(organizationSlug, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#listAnOrganizationsReleases");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **query** | **String**| This parameter can be used to create a \&quot;starts with\&quot; filter for the version. | [optional] |

### Return type

[**List&lt;RetrieveAnEventForAProject200ResponseReleaseOneOf&gt;**](RetrieveAnEventForAProject200ResponseReleaseOneOf.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Permission Denied |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="listIssuesToBeResolvedInAParticularRelease"></a>
# **listIssuesToBeResolvedInAParticularRelease**
> listIssuesToBeResolvedInAParticularRelease(organizationSlug, projectSlug, version)



List issues to be resolved in a particular release.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String projectSlug = "projectSlug_example"; // String | The slug of the project.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      apiInstance.listIssuesToBeResolvedInAParticularRelease(organizationSlug, projectSlug, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#listIssuesToBeResolvedInAParticularRelease");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **projectSlug** | **String**| The slug of the project. | |
| **version** | **String**| The version identifier of the release. | |

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
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="retrieveAProjectReleasesFile"></a>
# **retrieveAProjectReleasesFile**
> ListAnOrganizationSReleaseFiles200ResponseInner retrieveAProjectReleasesFile(organizationSlug, projectSlug, version, fileId, download)



Retrieve a file for a given release.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String projectSlug = "projectSlug_example"; // String | The slug of the project.
    String version = "version_example"; // String | The version identifier of the release.
    String fileId = "fileId_example"; // String | The ID of the file to retrieve.
    Boolean download = true; // Boolean | If this is set to true, then the response payload will be the raw file contents. Otherwise, the response will be the file metadata as JSON.
    try {
      ListAnOrganizationSReleaseFiles200ResponseInner result = apiInstance.retrieveAProjectReleasesFile(organizationSlug, projectSlug, version, fileId, download);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#retrieveAProjectReleasesFile");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **projectSlug** | **String**| The slug of the project. | |
| **version** | **String**| The version identifier of the release. | |
| **fileId** | **String**| The ID of the file to retrieve. | |
| **download** | **Boolean**| If this is set to true, then the response payload will be the raw file contents. Otherwise, the response will be the file metadata as JSON. | [optional] |

### Return type

[**ListAnOrganizationSReleaseFiles200ResponseInner**](ListAnOrganizationSReleaseFiles200ResponseInner.md)

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

<a id="retrieveAnOrganizationReleasesFile"></a>
# **retrieveAnOrganizationReleasesFile**
> ListAnOrganizationSReleaseFiles200ResponseInner retrieveAnOrganizationReleasesFile(organizationSlug, version, fileId, download)



Retrieve a file for a given release.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String version = "version_example"; // String | The version identifier of the release.
    String fileId = "fileId_example"; // String | The ID of the file to retrieve.
    Boolean download = true; // Boolean | If this is set to true, then the response payload will be the raw file contents. Otherwise, the response will be the file metadata as JSON.
    try {
      ListAnOrganizationSReleaseFiles200ResponseInner result = apiInstance.retrieveAnOrganizationReleasesFile(organizationSlug, version, fileId, download);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#retrieveAnOrganizationReleasesFile");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **version** | **String**| The version identifier of the release. | |
| **fileId** | **String**| The ID of the file to retrieve. | |
| **download** | **Boolean**| If this is set to true, then the response payload will be the raw file contents. Otherwise, the response will be the file metadata as JSON. | [optional] |

### Return type

[**ListAnOrganizationSReleaseFiles200ResponseInner**](ListAnOrganizationSReleaseFiles200ResponseInner.md)

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

<a id="retrieveAnOrganizationsReleases"></a>
# **retrieveAnOrganizationsReleases**
> RetrieveAnEventForAProject200ResponseReleaseOneOf retrieveAnOrganizationsReleases(organizationSlug, version)



Return a release for a given organization.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the release belongs to.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      RetrieveAnEventForAProject200ResponseReleaseOneOf result = apiInstance.retrieveAnOrganizationsReleases(organizationSlug, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#retrieveAnOrganizationsReleases");
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
| **organizationSlug** | **String**| The slug of the organization the release belongs to. | |
| **version** | **String**| The version identifier of the release. | |

### Return type

[**RetrieveAnEventForAProject200ResponseReleaseOneOf**](RetrieveAnEventForAProject200ResponseReleaseOneOf.md)

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

<a id="retrieveFilesChangedInAReleasesCommits"></a>
# **retrieveFilesChangedInAReleasesCommits**
> retrieveFilesChangedInAReleasesCommits(organizationSlug, version)



Retrieve files changed in a release&#39;s commits

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the release belongs to.
    String version = "version_example"; // String | The version identifier of the release.
    try {
      apiInstance.retrieveFilesChangedInAReleasesCommits(organizationSlug, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#retrieveFilesChangedInAReleasesCommits");
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
| **organizationSlug** | **String**| The slug of the organization the release belongs to. | |
| **version** | **String**| The version identifier of the release. | |

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
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="retrieveReleaseHealthSessionStatistics"></a>
# **retrieveReleaseHealthSessionStatistics**
> RetrieveReleaseHealthSessionStatistics200Response retrieveReleaseHealthSessionStatistics(organizationSlug, project, field, environment, groupBy, orderBy, query, statsPeriod, interval, statsPeriodStart, statsPeriodEnd, start, end)



Returns a time series of release health session statistics for projects bound to an organization.  The interval and date range are subject to certain restrictions and rounding rules.  The date range is rounded to align with the interval, and is rounded to at least one hour. The interval can at most be one day and at least one hour currently. It has to cleanly divide one day, for rounding reasons.  Apart from the query parameters listed below, this endpoint also supports the usual [pagination parameters](https://docs.sentry.io/api/pagination/).

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    List<Integer> project = Arrays.asList(); // List<Integer> | The ID of the projects to filter by.  Use `-1` to include all accessible projects.
    List<String> field = Arrays.asList(); // List<String> | The list of fields to query.  The available fields are   - `sum(session)`   - `count_unique(user)`   - `avg`, `p50`, `p75`, `p90`, `p95`, `p99`, `max` applied to `session.duration`. For example, `p99(session.duration)`. Session duration is [no longer being recorded](https://github.com/getsentry/sentry/discussions/42716) as of on Jan 12, 2023. Returned data may be incomplete.   - `crash_rate`, `crash_free_rate` applied to `user` or `session`. For example, `crash_free_rate(user)`
    List<String> environment = Arrays.asList(); // List<String> | The name of environments to filter by.
    List<String> groupBy = Arrays.asList(); // List<String> | The list of properties to group by.  The available groupBy conditions are `project`, `release`, `environment` and `session.status`.  Grouping by `session.status` does not work when `crash_rate` or `crash_free_rate` are queried.
    String orderBy = "orderBy_example"; // String | An optional field to order by, which must be one of the fields provided in `field`. Use `-` for descending order, for example `-sum(session)`.   This alters the order of the `groups` returned, so it only makes sense in combination with `groupBy`.   Ordering by more than one field is currently not supported.
    String query = "query_example"; // String | A free-form query that is applied as a filter.  An example query could be `release:\"1.1.0\" or release:\"1.2.0\"`.
    String statsPeriod = "statsPeriod_example"; // String | This defines the range of the time series, relative to now.  The range is given in a `\"<number><unit>\"` format.  For example `1d` for a one day range. Possible units are `m` for minutes, `h` for hours, `d` for days and `w` for weeks.  It defaults to `90d`.
    String interval = "interval_example"; // String | This is the resolution of the time series, given in the same format as `statsPeriod`.  The default resolution is `1h` and the minimum resolution is currently restricted to `1h` as well.  Intervals larger than `1d` are not supported, and the interval has to cleanly divide one day.
    String statsPeriodStart = "statsPeriodStart_example"; // String | This defines the start of the time series range, in the same format as the `interval`, relative to now.
    String statsPeriodEnd = "statsPeriodEnd_example"; // String | This defines the end of the time series range, in the same format as the `interval`, relative to now.
    OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | This defines the start of the time series range as an explicit datetime.
    OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | This defines the inclusive end of the time series range as an explicit datetime.
    try {
      RetrieveReleaseHealthSessionStatistics200Response result = apiInstance.retrieveReleaseHealthSessionStatistics(organizationSlug, project, field, environment, groupBy, orderBy, query, statsPeriod, interval, statsPeriodStart, statsPeriodEnd, start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#retrieveReleaseHealthSessionStatistics");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **project** | [**List&lt;Integer&gt;**](Integer.md)| The ID of the projects to filter by.  Use &#x60;-1&#x60; to include all accessible projects. | |
| **field** | [**List&lt;String&gt;**](String.md)| The list of fields to query.  The available fields are   - &#x60;sum(session)&#x60;   - &#x60;count_unique(user)&#x60;   - &#x60;avg&#x60;, &#x60;p50&#x60;, &#x60;p75&#x60;, &#x60;p90&#x60;, &#x60;p95&#x60;, &#x60;p99&#x60;, &#x60;max&#x60; applied to &#x60;session.duration&#x60;. For example, &#x60;p99(session.duration)&#x60;. Session duration is [no longer being recorded](https://github.com/getsentry/sentry/discussions/42716) as of on Jan 12, 2023. Returned data may be incomplete.   - &#x60;crash_rate&#x60;, &#x60;crash_free_rate&#x60; applied to &#x60;user&#x60; or &#x60;session&#x60;. For example, &#x60;crash_free_rate(user)&#x60; | |
| **environment** | [**List&lt;String&gt;**](String.md)| The name of environments to filter by. | [optional] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| The list of properties to group by.  The available groupBy conditions are &#x60;project&#x60;, &#x60;release&#x60;, &#x60;environment&#x60; and &#x60;session.status&#x60;.  Grouping by &#x60;session.status&#x60; does not work when &#x60;crash_rate&#x60; or &#x60;crash_free_rate&#x60; are queried. | [optional] |
| **orderBy** | **String**| An optional field to order by, which must be one of the fields provided in &#x60;field&#x60;. Use &#x60;-&#x60; for descending order, for example &#x60;-sum(session)&#x60;.   This alters the order of the &#x60;groups&#x60; returned, so it only makes sense in combination with &#x60;groupBy&#x60;.   Ordering by more than one field is currently not supported. | [optional] |
| **query** | **String**| A free-form query that is applied as a filter.  An example query could be &#x60;release:\&quot;1.1.0\&quot; or release:\&quot;1.2.0\&quot;&#x60;. | [optional] |
| **statsPeriod** | **String**| This defines the range of the time series, relative to now.  The range is given in a &#x60;\&quot;&lt;number&gt;&lt;unit&gt;\&quot;&#x60; format.  For example &#x60;1d&#x60; for a one day range. Possible units are &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days and &#x60;w&#x60; for weeks.  It defaults to &#x60;90d&#x60;. | [optional] |
| **interval** | **String**| This is the resolution of the time series, given in the same format as &#x60;statsPeriod&#x60;.  The default resolution is &#x60;1h&#x60; and the minimum resolution is currently restricted to &#x60;1h&#x60; as well.  Intervals larger than &#x60;1d&#x60; are not supported, and the interval has to cleanly divide one day. | [optional] |
| **statsPeriodStart** | **String**| This defines the start of the time series range, in the same format as the &#x60;interval&#x60;, relative to now. | [optional] |
| **statsPeriodEnd** | **String**| This defines the end of the time series range, in the same format as the &#x60;interval&#x60;, relative to now. | [optional] |
| **start** | **OffsetDateTime**| This defines the start of the time series range as an explicit datetime. | [optional] |
| **end** | **OffsetDateTime**| This defines the inclusive end of the time series range as an explicit datetime. | [optional] |

### Return type

[**RetrieveReleaseHealthSessionStatistics200Response**](RetrieveReleaseHealthSessionStatistics200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Time-series Session Statistics. |  -  |
| **400** | Wrong Parameters |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="updateAProjectReleaseFile"></a>
# **updateAProjectReleaseFile**
> ListAnOrganizationSReleaseFiles200ResponseInner updateAProjectReleaseFile(organizationSlug, projectSlug, version, fileId, updateAnOrganizationReleaseFileRequest)



Update a project release file.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String projectSlug = "projectSlug_example"; // String | The slug of the project.
    String version = "version_example"; // String | The version identifier of the release.
    String fileId = "fileId_example"; // String | The ID of the file to retrieve.
    UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest = new UpdateAnOrganizationReleaseFileRequest(); // UpdateAnOrganizationReleaseFileRequest | 
    try {
      ListAnOrganizationSReleaseFiles200ResponseInner result = apiInstance.updateAProjectReleaseFile(organizationSlug, projectSlug, version, fileId, updateAnOrganizationReleaseFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#updateAProjectReleaseFile");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **projectSlug** | **String**| The slug of the project. | |
| **version** | **String**| The version identifier of the release. | |
| **fileId** | **String**| The ID of the file to retrieve. | |
| **updateAnOrganizationReleaseFileRequest** | [**UpdateAnOrganizationReleaseFileRequest**](UpdateAnOrganizationReleaseFileRequest.md)|  | [optional] |

### Return type

[**ListAnOrganizationSReleaseFiles200ResponseInner**](ListAnOrganizationSReleaseFiles200ResponseInner.md)

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

<a id="updateAnOrganizationReleaseFile"></a>
# **updateAnOrganizationReleaseFile**
> ListAnOrganizationSReleaseFiles200ResponseInner updateAnOrganizationReleaseFile(organizationSlug, version, fileId, updateAnOrganizationReleaseFileRequest)



Update an organization release file.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String version = "version_example"; // String | The version identifier of the release.
    String fileId = "fileId_example"; // String | The ID of the file to retrieve.
    UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest = new UpdateAnOrganizationReleaseFileRequest(); // UpdateAnOrganizationReleaseFileRequest | 
    try {
      ListAnOrganizationSReleaseFiles200ResponseInner result = apiInstance.updateAnOrganizationReleaseFile(organizationSlug, version, fileId, updateAnOrganizationReleaseFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#updateAnOrganizationReleaseFile");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **version** | **String**| The version identifier of the release. | |
| **fileId** | **String**| The ID of the file to retrieve. | |
| **updateAnOrganizationReleaseFileRequest** | [**UpdateAnOrganizationReleaseFileRequest**](UpdateAnOrganizationReleaseFileRequest.md)|  | [optional] |

### Return type

[**ListAnOrganizationSReleaseFiles200ResponseInner**](ListAnOrganizationSReleaseFiles200ResponseInner.md)

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

<a id="updateAnOrganizationsRelease"></a>
# **updateAnOrganizationsRelease**
> RetrieveAnEventForAProject200ResponseReleaseOneOf updateAnOrganizationsRelease(organizationSlug, version, updateAnOrganizationSReleaseRequest)



Update a release for a given organization.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the release belongs to.
    String version = "version_example"; // String | The version identifier of the release.
    UpdateAnOrganizationSReleaseRequest updateAnOrganizationSReleaseRequest = new UpdateAnOrganizationSReleaseRequest(); // UpdateAnOrganizationSReleaseRequest | 
    try {
      RetrieveAnEventForAProject200ResponseReleaseOneOf result = apiInstance.updateAnOrganizationsRelease(organizationSlug, version, updateAnOrganizationSReleaseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#updateAnOrganizationsRelease");
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
| **organizationSlug** | **String**| The slug of the organization the release belongs to. | |
| **version** | **String**| The version identifier of the release. | |
| **updateAnOrganizationSReleaseRequest** | [**UpdateAnOrganizationSReleaseRequest**](UpdateAnOrganizationSReleaseRequest.md)|  | [optional] |

### Return type

[**RetrieveAnEventForAProject200ResponseReleaseOneOf**](RetrieveAnEventForAProject200ResponseReleaseOneOf.md)

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

<a id="uploadANewOrganizationReleaseFile"></a>
# **uploadANewOrganizationReleaseFile**
> uploadANewOrganizationReleaseFile(organizationSlug, version, _file, name, dist, header)



Upload a new organization release file.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String version = "version_example"; // String | The version identifier of the release.
    File _file = new File("/path/to/file"); // File | The multipart encoded file.
    String name = "name_example"; // String | The name (full path) of the file.
    String dist = "dist_example"; // String | The name of the dist.
    String header = "header_example"; // String | This parameter can be supplied multiple times to attach headers to the file. Each header is a string in the format `key:value`. For instance it can be used to define a content type.
    try {
      apiInstance.uploadANewOrganizationReleaseFile(organizationSlug, version, _file, name, dist, header);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#uploadANewOrganizationReleaseFile");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **version** | **String**| The version identifier of the release. | |
| **_file** | **File**| The multipart encoded file. | |
| **name** | **String**| The name (full path) of the file. | [optional] |
| **dist** | **String**| The name of the dist. | [optional] |
| **header** | **String**| This parameter can be supplied multiple times to attach headers to the file. Each header is a string in the format &#x60;key:value&#x60;. For instance it can be used to define a content type. | [optional] |

### Return type

null (empty response body)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="uploadANewProjectReleaseFile"></a>
# **uploadANewProjectReleaseFile**
> ListAnOrganizationSReleaseFiles200ResponseInner uploadANewProjectReleaseFile(organizationSlug, projectSlug, version, _file, name, dist, header)



Upload a new project release file.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    String projectSlug = "projectSlug_example"; // String | The slug of the project.
    String version = "version_example"; // String | The version identifier of the release.
    File _file = new File("/path/to/file"); // File | The multipart encoded file.
    String name = "name_example"; // String | The name (full path) of the file.
    String dist = "dist_example"; // String | The name of the dist.
    String header = "header_example"; // String | This parameter can be supplied multiple times to attach headers to the file. Each header is a string in the format `key:value`. For instance it can be used to define a content type.
    try {
      ListAnOrganizationSReleaseFiles200ResponseInner result = apiInstance.uploadANewProjectReleaseFile(organizationSlug, projectSlug, version, _file, name, dist, header);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#uploadANewProjectReleaseFile");
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
| **organizationSlug** | **String**| The slug of the organization. | |
| **projectSlug** | **String**| The slug of the project. | |
| **version** | **String**| The version identifier of the release. | |
| **_file** | **File**| The multipart encoded file. | |
| **name** | **String**| The name (full path) of the file. | [optional] |
| **dist** | **String**| The name of the dist. | [optional] |
| **header** | **String**| This parameter can be supplied multiple times to attach headers to the file. Each header is a string in the format &#x60;key:value&#x60;. For instance it can be used to define a content type. | [optional] |

### Return type

[**ListAnOrganizationSReleaseFiles200ResponseInner**](ListAnOrganizationSReleaseFiles200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

