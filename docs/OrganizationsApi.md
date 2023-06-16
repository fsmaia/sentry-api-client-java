# OrganizationsApi

All URIs are relative to *https://sentry.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAnOrganizationMember**](OrganizationsApi.md#deleteAnOrganizationMember) | **DELETE** /api/0/organizations/{organization_slug}/members/{member_id}/ |  |
| [**listARepositorysCommits**](OrganizationsApi.md#listARepositorysCommits) | **GET** /api/0/organizations/{organization_slug}/repos/{repo_id}/commits/ |  |
| [**listAnOrganizationsProjects**](OrganizationsApi.md#listAnOrganizationsProjects) | **GET** /api/0/organizations/{organization_slug}/projects/ |  |
| [**listAnOrganizationsRepositories**](OrganizationsApi.md#listAnOrganizationsRepositories) | **GET** /api/0/organizations/{organization_slug}/repos/ |  |
| [**listAnOrganizationsUsers**](OrganizationsApi.md#listAnOrganizationsUsers) | **GET** /api/0/organizations/{organization_slug}/users/ |  |
| [**listYourOrganizations**](OrganizationsApi.md#listYourOrganizations) | **GET** /api/0/organizations/ |  |
| [**resolveAShortID**](OrganizationsApi.md#resolveAShortID) | **GET** /api/0/organizations/{organization_slug}/shortids/{short_id}/ |  |
| [**resolveAnEventID**](OrganizationsApi.md#resolveAnEventID) | **GET** /api/0/organizations/{organization_slug}/eventids/{event_id}/ |  |
| [**retrieveAnOrganization**](OrganizationsApi.md#retrieveAnOrganization) | **GET** /api/0/organizations/{organization_slug}/ |  |
| [**retrieveAnOrganizationMember**](OrganizationsApi.md#retrieveAnOrganizationMember) | **GET** /api/0/organizations/{organization_slug}/members/{member_id}/ |  |
| [**retrieveEventCountsForAnOrganization**](OrganizationsApi.md#retrieveEventCountsForAnOrganization) | **GET** /api/0/organizations/{organization_slug}/stats/ |  |
| [**retrieveEventCountsForAnOrganizationV2**](OrganizationsApi.md#retrieveEventCountsForAnOrganizationV2) | **GET** /api/0/organizations/{organization_slug}/stats_v2/ |  |
| [**updateAnOrganization**](OrganizationsApi.md#updateAnOrganization) | **PUT** /api/0/organizations/{organization_slug}/ |  |



## deleteAnOrganizationMember

> deleteAnOrganizationMember(organizationSlug, memberId)



Remove an organization member.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
        String memberId = "memberId_example"; // String | The member ID.
        try {
            apiInstance.deleteAnOrganizationMember(organizationSlug, memberId);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#deleteAnOrganizationMember");
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
| **memberId** | **String**| The member ID. | |

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
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## listARepositorysCommits

> List&lt;ListARepositorySCommits200ResponseInner&gt; listARepositorysCommits(organizationSlug, repoId)



Return a list of commits for a given repository.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The organization short name.
        String repoId = "repoId_example"; // String | The repository ID.
        try {
            List<ListARepositorySCommits200ResponseInner> result = apiInstance.listARepositorysCommits(organizationSlug, repoId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#listARepositorysCommits");
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
| **repoId** | **String**| The repository ID. | |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## listAnOrganizationsProjects

> List&lt;ListAnOrganizationSProjects200ResponseInner&gt; listAnOrganizationsProjects(organizationSlug, cursor)



Return a list of projects bound to a organization.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
        String cursor = "cursor_example"; // String | A pointer to the last object fetched and its sort order; used to retrieve the next or previous results.
        try {
            List<ListAnOrganizationSProjects200ResponseInner> result = apiInstance.listAnOrganizationsProjects(organizationSlug, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#listAnOrganizationsProjects");
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
| **cursor** | **String**| A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. | [optional] |

### Return type

[**List&lt;ListAnOrganizationSProjects200ResponseInner&gt;**](ListAnOrganizationSProjects200ResponseInner.md)

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


## listAnOrganizationsRepositories

> List&lt;ListAnOrganizationSRepositories200ResponseInner&gt; listAnOrganizationsRepositories(organizationSlug)



Return a list of version control repositories for a given organization.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The organization short name.
        try {
            List<ListAnOrganizationSRepositories200ResponseInner> result = apiInstance.listAnOrganizationsRepositories(organizationSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#listAnOrganizationsRepositories");
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

[**List&lt;ListAnOrganizationSRepositories200ResponseInner&gt;**](ListAnOrganizationSRepositories200ResponseInner.md)

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


## listAnOrganizationsUsers

> List&lt;ListAnOrganizationSUsers200ResponseInner&gt; listAnOrganizationsUsers(organizationSlug, project)



Return a list of users that belong to a given organization.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the event ID should be looked up in.
        String project = "project_example"; // String | Restrict results to users who have access to a given project ID
        try {
            List<ListAnOrganizationSUsers200ResponseInner> result = apiInstance.listAnOrganizationsUsers(organizationSlug, project);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#listAnOrganizationsUsers");
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
| **organizationSlug** | **String**| The slug of the organization the event ID should be looked up in. | |
| **project** | **String**| Restrict results to users who have access to a given project ID | [optional] |

### Return type

[**List&lt;ListAnOrganizationSUsers200ResponseInner&gt;**](ListAnOrganizationSUsers200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## listYourOrganizations

> List&lt;RetrieveATeam200ResponseOrganization&gt; listYourOrganizations(owner, cursor)



Return a list of organizations available to the authenticated session.  This is particularly useful for requests with an user bound context.  For API key based requests this will only return the organization that belongs to the key.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        Boolean owner = true; // Boolean | Restrict results to organizations in which you are an organization owner.
        String cursor = "cursor_example"; // String | A pointer to the last object fetched and its sort order; used to retrieve the next or previous results.
        try {
            List<RetrieveATeam200ResponseOrganization> result = apiInstance.listYourOrganizations(owner, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#listYourOrganizations");
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
| **owner** | **Boolean**| Restrict results to organizations in which you are an organization owner. | [optional] |
| **cursor** | **String**| A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. | [optional] |

### Return type

[**List&lt;RetrieveATeam200ResponseOrganization&gt;**](RetrieveATeam200ResponseOrganization.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## resolveAShortID

> ResolveAShortID200Response resolveAShortID(organizationSlug, shortId)



This resolves a short ID to the project slug and internal issue ID.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the short ID should be looked up in.
        String shortId = "shortId_example"; // String | The short ID to look up.
        try {
            ResolveAShortID200Response result = apiInstance.resolveAShortID(organizationSlug, shortId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#resolveAShortID");
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
| **organizationSlug** | **String**| The slug of the organization the short ID should be looked up in. | |
| **shortId** | **String**| The short ID to look up. | |

### Return type

[**ResolveAShortID200Response**](ResolveAShortID200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## resolveAnEventID

> ResolveAnEventID200Response resolveAnEventID(organizationSlug, eventId)



This resolves an event ID to the project slug and internal issue ID and internal event ID.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the event ID should be looked up in.
        String eventId = "eventId_example"; // String | The event ID to look up.
        try {
            ResolveAnEventID200Response result = apiInstance.resolveAnEventID(organizationSlug, eventId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#resolveAnEventID");
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
| **organizationSlug** | **String**| The slug of the organization the event ID should be looked up in. | |
| **eventId** | **String**| The event ID to look up. | |

### Return type

[**ResolveAnEventID200Response**](ResolveAnEventID200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## retrieveAnOrganization

> RetrieveAnOrganization200Response retrieveAnOrganization(organizationSlug)



Return details on an individual organization including various details such as membership access, features, and teams.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization to look up.
        try {
            RetrieveAnOrganization200Response result = apiInstance.retrieveAnOrganization(organizationSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#retrieveAnOrganization");
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
| **organizationSlug** | **String**| The slug of the organization to look up. | |

### Return type

[**RetrieveAnOrganization200Response**](RetrieveAnOrganization200Response.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | The requested resource does not exist |  -  |


## retrieveAnOrganizationMember

> RetrieveAnOrganizationMember200Response retrieveAnOrganizationMember(organizationSlug, memberId)



Retrieve an organization member's details.

Will return a pending invite as long as it's already approved.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
        String memberId = "memberId_example"; // String | The member ID.
        try {
            RetrieveAnOrganizationMember200Response result = apiInstance.retrieveAnOrganizationMember(organizationSlug, memberId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#retrieveAnOrganizationMember");
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
| **memberId** | **String**| The member ID. | |

### Return type

[**RetrieveAnOrganizationMember200Response**](RetrieveAnOrganizationMember200Response.md)

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


## retrieveEventCountsForAnOrganization

> List&lt;List&lt;Integer&gt;&gt; retrieveEventCountsForAnOrganization(organizationSlug, stat, since, until, resolution)



This endpoint is deprecated in favor of [Organization Stats V2](/api/organizations/retrieve-event-counts-for-an-organization-v2/).

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the event ID should be looked up in.
        String stat = "received"; // String | The name of the stat to query `(\"received\", \"rejected\", \"blacklisted\")`.
        OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | A timestamp to set the start of the query in seconds since UNIX epoch.
        OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | A timestamp to set the end of the query in seconds since UNIX epoch.
        String resolution = "10s"; // String | An explicit resolution to search for (one of `10s`, `1h`, and `1d`).
        try {
            List<List<Integer>> result = apiInstance.retrieveEventCountsForAnOrganization(organizationSlug, stat, since, until, resolution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#retrieveEventCountsForAnOrganization");
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
| **organizationSlug** | **String**| The slug of the organization the event ID should be looked up in. | |
| **stat** | **String**| The name of the stat to query &#x60;(\&quot;received\&quot;, \&quot;rejected\&quot;, \&quot;blacklisted\&quot;)&#x60;. | [optional] [enum: received, rejected, blacklisted] |
| **since** | **OffsetDateTime**| A timestamp to set the start of the query in seconds since UNIX epoch. | [optional] |
| **until** | **OffsetDateTime**| A timestamp to set the end of the query in seconds since UNIX epoch. | [optional] |
| **resolution** | **String**| An explicit resolution to search for (one of &#x60;10s&#x60;, &#x60;1h&#x60;, and &#x60;1d&#x60;). | [optional] [enum: 10s, 1h, 1d] |

### Return type

[**List&lt;List&lt;Integer&gt;&gt;**](List.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## retrieveEventCountsForAnOrganizationV2

> RetrieveEventCountsForAnOrganizationV2200Response retrieveEventCountsForAnOrganizationV2(organizationSlug, groupBy, field, statsPeriod, interval, start, end, project, category, outcome, reason)



Query event counts for your Organization.
Select a field, define a date range, and group or filter by columns.

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
        List<String> groupBy = Arrays.asList(); // List<String> | can pass multiple groupBy parameters to group by multiple, e.g. `groupBy=project&groupBy=outcome` to group by multiple dimensions. Note that grouping by project can cause missing rows if the number of projects / interval is large. If you have a large number of projects, we recommend filtering and querying by them individually.Also note that grouping by projects does not currently support timeseries interval responses and will instead be a sum of the projectover the entire period specified.
        String field = "sum(quantity)"; // String | the `sum(quantity)` field is bytes for attachments, and all others the 'event' count for those types of events.  `sum(times_seen)` sums the number of times an event has been seen. For 'normal' event types, this will be equal to `sum(quantity)` for now. For sessions, quantity will sum the total number of events seen in a session, while `times_seen` will be the unique number of sessions. and for attachments, `times_seen` will be the total number of attachments, while quantity will be the total sum of attachment bytes.
        String statsPeriod = "statsPeriod_example"; // String | This defines the range of the time series, relative to now. The range is given in a `<number><unit>` format. For example `1d` for a one day range. Possible units are `m` for minutes, `h` for hours, `d` for days and `w` for weeks.You must either provide a `statsPeriod`, or a `start` and `end`.
        String interval = "interval_example"; // String | This is the resolution of the time series, given in the same format as `statsPeriod`. The default resolution is `1h` and the minimum resolution is currently restricted to `1h` as well. Intervals larger than `1d` are not supported, and the interval has to cleanly divide one day.
        OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | This defines the start of the time series range as an explicit datetime, either in UTC ISO8601 or epoch seconds.Use along with `end` instead of `statsPeriod`.
        OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | This defines the inclusive end of the time series range as an explicit datetime, either in UTC ISO8601 or epoch seconds.Use along with `start` instead of `statsPeriod`.
        List<String> project = Arrays.asList(); // List<String> | The ID of the projects to filter by.  Use `-1` to include all accessible projects.
        String category = "error"; // String | If filtering by attachments, you cannot filter by any other category due to quantity values becoming nonsensical (combining bytes and event counts).  If filtering by `error`, it will automatically add `default` and `security` as we currently roll those two categories into `error` for displaying.
        String outcome = "accepted"; // String | See https://docs.sentry.io/product/stats/ for more information on outcome statuses.
        String reason = "reason_example"; // String | The reason field will contain why an event was filtered/dropped.
        try {
            RetrieveEventCountsForAnOrganizationV2200Response result = apiInstance.retrieveEventCountsForAnOrganizationV2(organizationSlug, groupBy, field, statsPeriod, interval, start, end, project, category, outcome, reason);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#retrieveEventCountsForAnOrganizationV2");
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
| **groupBy** | **List&lt;String&gt;**| can pass multiple groupBy parameters to group by multiple, e.g. &#x60;groupBy&#x3D;project&amp;groupBy&#x3D;outcome&#x60; to group by multiple dimensions. Note that grouping by project can cause missing rows if the number of projects / interval is large. If you have a large number of projects, we recommend filtering and querying by them individually.Also note that grouping by projects does not currently support timeseries interval responses and will instead be a sum of the projectover the entire period specified. | [enum: outcome, category, reason, project] |
| **field** | **String**| the &#x60;sum(quantity)&#x60; field is bytes for attachments, and all others the &#39;event&#39; count for those types of events.  &#x60;sum(times_seen)&#x60; sums the number of times an event has been seen. For &#39;normal&#39; event types, this will be equal to &#x60;sum(quantity)&#x60; for now. For sessions, quantity will sum the total number of events seen in a session, while &#x60;times_seen&#x60; will be the unique number of sessions. and for attachments, &#x60;times_seen&#x60; will be the total number of attachments, while quantity will be the total sum of attachment bytes. | [enum: sum(quantity), sum(times_seen)] |
| **statsPeriod** | **String**| This defines the range of the time series, relative to now. The range is given in a &#x60;&lt;number&gt;&lt;unit&gt;&#x60; format. For example &#x60;1d&#x60; for a one day range. Possible units are &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days and &#x60;w&#x60; for weeks.You must either provide a &#x60;statsPeriod&#x60;, or a &#x60;start&#x60; and &#x60;end&#x60;. | [optional] |
| **interval** | **String**| This is the resolution of the time series, given in the same format as &#x60;statsPeriod&#x60;. The default resolution is &#x60;1h&#x60; and the minimum resolution is currently restricted to &#x60;1h&#x60; as well. Intervals larger than &#x60;1d&#x60; are not supported, and the interval has to cleanly divide one day. | [optional] |
| **start** | **OffsetDateTime**| This defines the start of the time series range as an explicit datetime, either in UTC ISO8601 or epoch seconds.Use along with &#x60;end&#x60; instead of &#x60;statsPeriod&#x60;. | [optional] |
| **end** | **OffsetDateTime**| This defines the inclusive end of the time series range as an explicit datetime, either in UTC ISO8601 or epoch seconds.Use along with &#x60;start&#x60; instead of &#x60;statsPeriod&#x60;. | [optional] |
| **project** | **List&lt;String&gt;**| The ID of the projects to filter by.  Use &#x60;-1&#x60; to include all accessible projects. | [optional] |
| **category** | **String**| If filtering by attachments, you cannot filter by any other category due to quantity values becoming nonsensical (combining bytes and event counts).  If filtering by &#x60;error&#x60;, it will automatically add &#x60;default&#x60; and &#x60;security&#x60; as we currently roll those two categories into &#x60;error&#x60; for displaying. | [optional] [enum: error, transaction, attachment] |
| **outcome** | **String**| See https://docs.sentry.io/product/stats/ for more information on outcome statuses. | [optional] [enum: accepted, filtered, rate_limited, invalid, abuse, client_discard] |
| **reason** | **String**| The reason field will contain why an event was filtered/dropped. | [optional] |

### Return type

[**RetrieveEventCountsForAnOrganizationV2200Response**](RetrieveEventCountsForAnOrganizationV2200Response.md)

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
| **404** | Not Found |  -  |


## updateAnOrganization

> RetrieveAnOrganization200Response updateAnOrganization(organizationSlug, updateAnOrganizationRequest)



Update various attributes and configurable settings for the given organization.

### Example

```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.*;
import com.sentry.api.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sentry.io");
        
        // Configure HTTP bearer authorization: auth_token
        HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
        auth_token.setBearerToken("BEARER TOKEN");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String organizationSlug = "organizationSlug_example"; // String | The slug of the organization to update.
        UpdateAnOrganizationRequest updateAnOrganizationRequest = new UpdateAnOrganizationRequest(); // UpdateAnOrganizationRequest | 
        try {
            RetrieveAnOrganization200Response result = apiInstance.updateAnOrganization(organizationSlug, updateAnOrganizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#updateAnOrganization");
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
| **organizationSlug** | **String**| The slug of the organization to update. | |
| **updateAnOrganizationRequest** | [**UpdateAnOrganizationRequest**](UpdateAnOrganizationRequest.md)|  | [optional] |

### Return type

[**RetrieveAnOrganization200Response**](RetrieveAnOrganization200Response.md)

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

