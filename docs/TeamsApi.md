# TeamsApi

All URIs are relative to *https://sentry.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createANewTeam**](TeamsApi.md#createANewTeam) | **POST** /api/0/organizations/{organization_slug}/teams/ |  |
| [**deleteATeam**](TeamsApi.md#deleteATeam) | **DELETE** /api/0/teams/{organization_slug}/{team_slug}/ |  |
| [**listATeamsProjects**](TeamsApi.md#listATeamsProjects) | **GET** /api/0/teams/{organization_slug}/{team_slug}/projects/ |  |
| [**listAnOrganizationsTeams**](TeamsApi.md#listAnOrganizationsTeams) | **GET** /api/0/organizations/{organization_slug}/teams/ |  |
| [**retrieveATeam**](TeamsApi.md#retrieveATeam) | **GET** /api/0/teams/{organization_slug}/{team_slug}/ |  |
| [**retrieveEventCountsForATeam**](TeamsApi.md#retrieveEventCountsForATeam) | **GET** /api/0/teams/{organization_slug}/{team_slug}/stats/ | Caution: this endpoint may change in the future without notice. |
| [**updateATeam**](TeamsApi.md#updateATeam) | **PUT** /api/0/teams/{organization_slug}/{team_slug}/ |  |


<a id="createANewTeam"></a>
# **createANewTeam**
> ListAnOrganizationSTeams200ResponseInner createANewTeam(organizationSlug, name, slug, createANewTeamRequest)



Create a new team bound to an organization.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String name = "name_example"; // String | The name of the team.
    String slug = "slug_example"; // String | Optional slug for the team. If not provided a slug is generated from the name.
    CreateANewTeamRequest createANewTeamRequest = new CreateANewTeamRequest(); // CreateANewTeamRequest | 
    try {
      ListAnOrganizationSTeams200ResponseInner result = apiInstance.createANewTeam(organizationSlug, name, slug, createANewTeamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createANewTeam");
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
| **name** | **String**| The name of the team. | |
| **slug** | **String**| Optional slug for the team. If not provided a slug is generated from the name. | [optional] |
| **createANewTeamRequest** | [**CreateANewTeamRequest**](CreateANewTeamRequest.md)|  | [optional] |

### Return type

[**ListAnOrganizationSTeams200ResponseInner**](ListAnOrganizationSTeams200ResponseInner.md)

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
| **403** | Forbidden |  -  |
| **404** | A team with this slug already exists. |  -  |

<a id="deleteATeam"></a>
# **deleteATeam**
> deleteATeam(organizationSlug, teamSlug)



Schedules a team for deletion.  Note: Deletion happens asynchronously and therefore is not immediate. However once deletion has begun the state of a project changes and will be hidden from most public views.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the team belongs to.
    String teamSlug = "teamSlug_example"; // String | The slug of the team to get.
    try {
      apiInstance.deleteATeam(organizationSlug, teamSlug);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#deleteATeam");
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
| **organizationSlug** | **String**| The slug of the organization the team belongs to. | |
| **teamSlug** | **String**| The slug of the team to get. | |

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
| **404** | Team not found |  -  |

<a id="listATeamsProjects"></a>
# **listATeamsProjects**
> List&lt;ListAnOrganizationSProjects200ResponseInner&gt; listATeamsProjects(organizationSlug, teamSlug, cursor)



Return a list of projects bound to a team.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String teamSlug = "teamSlug_example"; // String | The slug of the team the resource belongs to.
    String cursor = "cursor_example"; // String | A pointer to the last object fetched and its sort order; used to retrieve the next or previous results.
    try {
      List<ListAnOrganizationSProjects200ResponseInner> result = apiInstance.listATeamsProjects(organizationSlug, teamSlug, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listATeamsProjects");
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
| **teamSlug** | **String**| The slug of the team the resource belongs to. | |
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
| **403** | Forbidden |  -  |
| **404** | Team not found. |  -  |

<a id="listAnOrganizationsTeams"></a>
# **listAnOrganizationsTeams**
> List&lt;ListAnOrganizationSTeams200ResponseInner&gt; listAnOrganizationsTeams(organizationSlug, detailed, cursor)



Returns a list of teams bound to a organization.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    String detailed = "detailed_example"; // String | Specify \"0\" to return team details that do not include projects
    String cursor = "cursor_example"; // String | A pointer to the last object fetched and its sort order; used to retrieve the next or previous results.
    try {
      List<ListAnOrganizationSTeams200ResponseInner> result = apiInstance.listAnOrganizationsTeams(organizationSlug, detailed, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listAnOrganizationsTeams");
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
| **detailed** | **String**| Specify \&quot;0\&quot; to return team details that do not include projects | [optional] |
| **cursor** | **String**| A pointer to the last object fetched and its sort order; used to retrieve the next or previous results. | [optional] |

### Return type

[**List&lt;ListAnOrganizationSTeams200ResponseInner&gt;**](ListAnOrganizationSTeams200ResponseInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="retrieveATeam"></a>
# **retrieveATeam**
> RetrieveATeam200Response retrieveATeam(organizationSlug, teamSlug)



Return details on an individual team.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the team belongs to.
    String teamSlug = "teamSlug_example"; // String | The slug of the team to get.
    try {
      RetrieveATeam200Response result = apiInstance.retrieveATeam(organizationSlug, teamSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#retrieveATeam");
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
| **organizationSlug** | **String**| The slug of the organization the team belongs to. | |
| **teamSlug** | **String**| The slug of the team to get. | |

### Return type

[**RetrieveATeam200Response**](RetrieveATeam200Response.md)

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
| **404** | Team not found |  -  |

<a id="retrieveEventCountsForATeam"></a>
# **retrieveEventCountsForATeam**
> List&lt;List&lt;Integer&gt;&gt; retrieveEventCountsForATeam(organizationSlug, teamSlug, stat, since, until, resolution)

Caution: this endpoint may change in the future without notice.

Return a set of points representing a normalized timestamp and the number of events seen in the period.  Query ranges are limited to Sentry’s configured time-series resolutions.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the team belongs to.
    String teamSlug = "teamSlug_example"; // String | The slug of the team to get.
    String stat = "received"; // String | The name of the stat to query `(\"received\", \"rejected\")`.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | A timestamp to set the start of the query in seconds since UNIX epoch.
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | A timestamp to set the end of the query in seconds since UNIX epoch.
    String resolution = "10s"; // String | An explicit resolution to search for (one of `10s`, `1h`, and `1d`).
    try {
      List<List<Integer>> result = apiInstance.retrieveEventCountsForATeam(organizationSlug, teamSlug, stat, since, until, resolution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#retrieveEventCountsForATeam");
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
| **organizationSlug** | **String**| The slug of the organization the team belongs to. | |
| **teamSlug** | **String**| The slug of the team to get. | |
| **stat** | **String**| The name of the stat to query &#x60;(\&quot;received\&quot;, \&quot;rejected\&quot;)&#x60;. | [optional] [enum: received, rejected] |
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
| **403** | Forbidden |  -  |
| **404** | Team not found |  -  |

<a id="updateATeam"></a>
# **updateATeam**
> UpdateATeam200Response updateATeam(organizationSlug, teamSlug, updateATeamRequest)



Update various attributes and configurable settings for the given team.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.java.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the team belongs to.
    String teamSlug = "teamSlug_example"; // String | The slug of the team to get.
    UpdateATeamRequest updateATeamRequest = new UpdateATeamRequest(); // UpdateATeamRequest | 
    try {
      UpdateATeam200Response result = apiInstance.updateATeam(organizationSlug, teamSlug, updateATeamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateATeam");
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
| **organizationSlug** | **String**| The slug of the organization the team belongs to. | |
| **teamSlug** | **String**| The slug of the team to get. | |
| **updateATeamRequest** | [**UpdateATeamRequest**](UpdateATeamRequest.md)|  | |

### Return type

[**UpdateATeam200Response**](UpdateATeam200Response.md)

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
| **404** | Team not found |  -  |

