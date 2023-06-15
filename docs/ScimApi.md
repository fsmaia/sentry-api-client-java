# ScimApi

All URIs are relative to *https://sentry.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAnIndividualTeam**](ScimApi.md#deleteAnIndividualTeam) | **DELETE** /api/0/organizations/{organization_slug}/scim/v2/Groups/{team_id} |  |
| [**deleteAnOrganizationMemberViaSCIM**](ScimApi.md#deleteAnOrganizationMemberViaSCIM) | **DELETE** /api/0/organizations/{organization_slug}/scim/v2/Users/{member_id} |  |
| [**listAnOrganizationsMembers**](ScimApi.md#listAnOrganizationsMembers) | **GET** /api/0/organizations/{organization_slug}/scim/v2/Users |  |
| [**listAnOrganizationsPaginatedTeams**](ScimApi.md#listAnOrganizationsPaginatedTeams) | **GET** /api/0/organizations/{organization_slug}/scim/v2/Groups |  |
| [**provisionANewOrganizationMember**](ScimApi.md#provisionANewOrganizationMember) | **POST** /api/0/organizations/{organization_slug}/scim/v2/Users |  |
| [**provisionANewTeam**](ScimApi.md#provisionANewTeam) | **POST** /api/0/organizations/{organization_slug}/scim/v2/Groups |  |
| [**queryAnIndividualOrganizationMember**](ScimApi.md#queryAnIndividualOrganizationMember) | **GET** /api/0/organizations/{organization_slug}/scim/v2/Users/{member_id} |  |
| [**queryAnIndividualTeam**](ScimApi.md#queryAnIndividualTeam) | **GET** /api/0/organizations/{organization_slug}/scim/v2/Groups/{team_id} |  |
| [**updateATeamsAttributes**](ScimApi.md#updateATeamsAttributes) | **PATCH** /api/0/organizations/{organization_slug}/scim/v2/Groups/{team_id} |  |
| [**updateAnOrganizationMembersAttributes**](ScimApi.md#updateAnOrganizationMembersAttributes) | **PATCH** /api/0/organizations/{organization_slug}/scim/v2/Users/{member_id} |  |


<a id="deleteAnIndividualTeam"></a>
# **deleteAnIndividualTeam**
> deleteAnIndividualTeam(organizationSlug, teamId)



Delete a team with a SCIM Group DELETE Request.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    Integer teamId = 56; // Integer | The id of the team you'd like to query / update.
    try {
      apiInstance.deleteAnIndividualTeam(organizationSlug, teamId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#deleteAnIndividualTeam");
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
| **teamId** | **Integer**| The id of the team you&#39;d like to query / update. | |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="deleteAnOrganizationMemberViaSCIM"></a>
# **deleteAnOrganizationMemberViaSCIM**
> deleteAnOrganizationMemberViaSCIM(organizationSlug, memberId)



Delete an organization member with a SCIM User DELETE Request.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    Integer memberId = 56; // Integer | The id of the member you'd like to query.
    try {
      apiInstance.deleteAnOrganizationMemberViaSCIM(organizationSlug, memberId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#deleteAnOrganizationMemberViaSCIM");
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
| **memberId** | **Integer**| The id of the member you&#39;d like to query. | |

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
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="listAnOrganizationsMembers"></a>
# **listAnOrganizationsMembers**
> ListAnOrganizationSMembers200Response listAnOrganizationsMembers(organizationSlug, startIndex, count, filter, excludedAttributes)



Returns a paginated list of members bound to a organization with a SCIM Users GET Request.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    Integer startIndex = 1; // Integer | SCIM 1-offset based index for pagination.
    Integer count = 100; // Integer | The maximum number of results the query should return, maximum of 100.
    String filter = "filter_example"; // String | A SCIM filter expression. The only operator currently supported is `eq`.
    List<String> excludedAttributes = Arrays.asList(); // List<String> | Fields that should be left off of return values. Right now the only supported field for this query is members.
    try {
      ListAnOrganizationSMembers200Response result = apiInstance.listAnOrganizationsMembers(organizationSlug, startIndex, count, filter, excludedAttributes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#listAnOrganizationsMembers");
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
| **startIndex** | **Integer**| SCIM 1-offset based index for pagination. | [optional] [default to 1] |
| **count** | **Integer**| The maximum number of results the query should return, maximum of 100. | [optional] [default to 100] |
| **filter** | **String**| A SCIM filter expression. The only operator currently supported is &#x60;eq&#x60;. | [optional] |
| **excludedAttributes** | [**List&lt;String&gt;**](String.md)| Fields that should be left off of return values. Right now the only supported field for this query is members. | [optional] |

### Return type

[**ListAnOrganizationSMembers200Response**](ListAnOrganizationSMembers200Response.md)

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

<a id="listAnOrganizationsPaginatedTeams"></a>
# **listAnOrganizationsPaginatedTeams**
> ListAnOrganizationSPaginatedTeams200Response listAnOrganizationsPaginatedTeams(organizationSlug, startIndex, filter, count, excludedAttributes)



Returns a paginated list of teams bound to a organization with a SCIM Groups GET Request. - Note that the members field will only contain up to 10000 members.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    Integer startIndex = 56; // Integer | SCIM 1-offset based index for pagination.
    String filter = "filter_example"; // String | A SCIM filter expression. The only operator currently supported is `eq`.
    Integer count = 56; // Integer | The maximum number of results the query should return, maximum of 100.
    String excludedAttributes = "excludedAttributes_example"; // String | Fields that should be left off of return values. Right now the only supported field for this query is `members`.
    try {
      ListAnOrganizationSPaginatedTeams200Response result = apiInstance.listAnOrganizationsPaginatedTeams(organizationSlug, startIndex, filter, count, excludedAttributes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#listAnOrganizationsPaginatedTeams");
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
| **startIndex** | **Integer**| SCIM 1-offset based index for pagination. | [optional] |
| **filter** | **String**| A SCIM filter expression. The only operator currently supported is &#x60;eq&#x60;. | [optional] |
| **count** | **Integer**| The maximum number of results the query should return, maximum of 100. | [optional] |
| **excludedAttributes** | **String**| Fields that should be left off of return values. Right now the only supported field for this query is &#x60;members&#x60;. | [optional] |

### Return type

[**ListAnOrganizationSPaginatedTeams200Response**](ListAnOrganizationSPaginatedTeams200Response.md)

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

<a id="provisionANewOrganizationMember"></a>
# **provisionANewOrganizationMember**
> ListAnOrganizationSMembers200ResponseResourcesInner provisionANewOrganizationMember(organizationSlug, provisionANewOrganizationMemberRequest)



Create a new Organization Member via a SCIM Users POST Request. - &#x60;userName&#x60; should be set to the SAML field used for email, and active should be set to &#x60;true&#x60;. - &#x60;sentryOrgRole&#x60; can only be &#x60;admin&#x60;, &#x60;manager&#x60;, &#x60;billing&#x60;, or &#x60;member&#x60;. - Sentry&#39;s SCIM API doesn&#39;t currently support setting users to inactive, and the member will be deleted if active is set to &#x60;false&#x60;. - The API also does not support setting secondary emails.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    ProvisionANewOrganizationMemberRequest provisionANewOrganizationMemberRequest = new ProvisionANewOrganizationMemberRequest(); // ProvisionANewOrganizationMemberRequest | 
    try {
      ListAnOrganizationSMembers200ResponseResourcesInner result = apiInstance.provisionANewOrganizationMember(organizationSlug, provisionANewOrganizationMemberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#provisionANewOrganizationMember");
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
| **provisionANewOrganizationMemberRequest** | [**ProvisionANewOrganizationMemberRequest**](ProvisionANewOrganizationMemberRequest.md)|  | |

### Return type

[**ListAnOrganizationSMembers200ResponseResourcesInner**](ListAnOrganizationSMembers200ResponseResourcesInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="provisionANewTeam"></a>
# **provisionANewTeam**
> ListAnOrganizationSPaginatedTeams200ResponseResourcesInner provisionANewTeam(organizationSlug, provisionANewTeamRequest)



Create a new team bound to an organization via a SCIM Groups POST Request. Note that teams are always created with an empty member set. The endpoint will also do a normalization of uppercase / spaces to lowercase and dashes.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization.
    ProvisionANewTeamRequest provisionANewTeamRequest = new ProvisionANewTeamRequest(); // ProvisionANewTeamRequest | 
    try {
      ListAnOrganizationSPaginatedTeams200ResponseResourcesInner result = apiInstance.provisionANewTeam(organizationSlug, provisionANewTeamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#provisionANewTeam");
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
| **provisionANewTeamRequest** | [**ProvisionANewTeamRequest**](ProvisionANewTeamRequest.md)|  | |

### Return type

[**ListAnOrganizationSPaginatedTeams200ResponseResourcesInner**](ListAnOrganizationSPaginatedTeams200ResponseResourcesInner.md)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad input |  -  |
| **403** | Forbidden |  -  |
| **409** | Team slug already exists |  -  |

<a id="queryAnIndividualOrganizationMember"></a>
# **queryAnIndividualOrganizationMember**
> ListAnOrganizationSMembers200ResponseResourcesInner queryAnIndividualOrganizationMember(organizationSlug, memberId)



Query an individual organization member with a SCIM User GET Request. - The &#x60;name&#x60; object will contain fields &#x60;firstName&#x60; and &#x60;lastName&#x60; with the values of &#x60;N/A&#x60;. Sentry&#39;s SCIM API does not currently support these fields but returns them for compatibility purposes.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    Integer memberId = 56; // Integer | The id of the member you'd like to query.
    try {
      ListAnOrganizationSMembers200ResponseResourcesInner result = apiInstance.queryAnIndividualOrganizationMember(organizationSlug, memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#queryAnIndividualOrganizationMember");
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
| **memberId** | **Integer**| The id of the member you&#39;d like to query. | |

### Return type

[**ListAnOrganizationSMembers200ResponseResourcesInner**](ListAnOrganizationSMembers200ResponseResourcesInner.md)

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

<a id="queryAnIndividualTeam"></a>
# **queryAnIndividualTeam**
> QueryAnIndividualTeam200Response queryAnIndividualTeam(teamId, organizationSlug)



Query an individual team with a SCIM Group GET Request. - Note that the members field will only contain up to 10000 members.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    Integer teamId = 56; // Integer | The id of the team you'd like to query / update.
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    try {
      QueryAnIndividualTeam200Response result = apiInstance.queryAnIndividualTeam(teamId, organizationSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#queryAnIndividualTeam");
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
| **teamId** | **Integer**| The id of the team you&#39;d like to query / update. | |
| **organizationSlug** | **String**| The slug of the organization the resource belongs to. | |

### Return type

[**QueryAnIndividualTeam200Response**](QueryAnIndividualTeam200Response.md)

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

<a id="updateATeamsAttributes"></a>
# **updateATeamsAttributes**
> updateATeamsAttributes(organizationSlug, teamId, updateATeamSAttributesRequest)



Update a team&#39;s attributes with a SCIM Group PATCH Request. Valid operations are:  * Renaming a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;replace\&quot;,         \&quot;value\&quot;: {             \&quot;id\&quot;: 23,             \&quot;displayName\&quot;: \&quot;newName\&quot;         }     }] } &#x60;&#x60;&#x60; * Adding a member to a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;add\&quot;,         \&quot;path\&quot;: \&quot;members\&quot;,         \&quot;value\&quot;: [             {                 \&quot;value\&quot;: 23,                 \&quot;display\&quot;: \&quot;testexample@example.com\&quot;             }         ]     }] } &#x60;&#x60;&#x60; * Removing a member from a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;remove\&quot;,         \&quot;path\&quot;: \&quot;members[value eq \&quot;23\&quot;]\&quot;     }] } &#x60;&#x60;&#x60; * Replacing an entire member set of a team: &#x60;&#x60;&#x60;json {     \&quot;Operations\&quot;: [{         \&quot;op\&quot;: \&quot;replace\&quot;,         \&quot;path\&quot;: \&quot;members\&quot;,         \&quot;value\&quot;: [             {                 \&quot;value\&quot;: 23,                 \&quot;display\&quot;: \&quot;testexample2@sentry.io\&quot;             },             {                 \&quot;value\&quot;: 24,                 \&quot;display\&quot;: \&quot;testexample3@sentry.io\&quot;             }         ]     }] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    Integer teamId = 56; // Integer | The id of the team you'd like to query / update.
    UpdateATeamSAttributesRequest updateATeamSAttributesRequest = new UpdateATeamSAttributesRequest(); // UpdateATeamSAttributesRequest | 
    try {
      apiInstance.updateATeamsAttributes(organizationSlug, teamId, updateATeamSAttributesRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#updateATeamsAttributes");
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
| **teamId** | **Integer**| The id of the team you&#39;d like to query / update. | |
| **updateATeamSAttributesRequest** | [**UpdateATeamSAttributesRequest**](UpdateATeamSAttributesRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="updateAnOrganizationMembersAttributes"></a>
# **updateAnOrganizationMembersAttributes**
> updateAnOrganizationMembersAttributes(organizationSlug, memberId, updateAnOrganizationMemberSAttributesRequest)



Update an organization member&#39;s attributes with a SCIM PATCH Request. The only supported attribute is &#x60;active&#x60;. After setting &#x60;active&#x60; to false Sentry will permanently delete the Organization Member.

### Example
```java
// Import classes:
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiException;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.models.*;
import com.sentry.api.client.api.ScimApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sentry.io");
    
    // Configure HTTP bearer authorization: auth_token
    HttpBearerAuth auth_token = (HttpBearerAuth) defaultClient.getAuthentication("auth_token");
    auth_token.setBearerToken("BEARER TOKEN");

    ScimApi apiInstance = new ScimApi(defaultClient);
    String organizationSlug = "organizationSlug_example"; // String | The slug of the organization the resource belongs to.
    Integer memberId = 56; // Integer | The id of the member you'd like to query.
    UpdateAnOrganizationMemberSAttributesRequest updateAnOrganizationMemberSAttributesRequest = new UpdateAnOrganizationMemberSAttributesRequest(); // UpdateAnOrganizationMemberSAttributesRequest | 
    try {
      apiInstance.updateAnOrganizationMembersAttributes(organizationSlug, memberId, updateAnOrganizationMemberSAttributesRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimApi#updateAnOrganizationMembersAttributes");
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
| **memberId** | **Integer**| The id of the member you&#39;d like to query. | |
| **updateAnOrganizationMemberSAttributesRequest** | [**UpdateAnOrganizationMemberSAttributesRequest**](UpdateAnOrganizationMemberSAttributesRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[auth_token](../README.md#auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

