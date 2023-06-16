package com.sentry.api.client.api;

import com.sentry.api.client.ApiException;
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiResponse;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.sentry.api.client.model.CreateAnExternalIssue200Response;
import com.sentry.api.client.model.CreateAnExternalIssueRequest;
import com.sentry.api.client.model.ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:18:46.808333Z[Etc/UTC]")
public class IntegrationApi {
  private ApiClient apiClient;

  public IntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IntegrationApi(ApiClient apiClient) {
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
   * Create an external issue from an integration platform integration.
   * @param uuid The uuid of the integration platform integration. (required)
   * @param createAnExternalIssueRequest  (required)
   * @return CreateAnExternalIssue200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public CreateAnExternalIssue200Response createAnExternalIssue(String uuid, CreateAnExternalIssueRequest createAnExternalIssueRequest) throws ApiException {
    return createAnExternalIssueWithHttpInfo(uuid, createAnExternalIssueRequest).getData();
  }

  /**
   * 
   * Create an external issue from an integration platform integration.
   * @param uuid The uuid of the integration platform integration. (required)
   * @param createAnExternalIssueRequest  (required)
   * @return ApiResponse&lt;CreateAnExternalIssue200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateAnExternalIssue200Response> createAnExternalIssueWithHttpInfo(String uuid, CreateAnExternalIssueRequest createAnExternalIssueRequest) throws ApiException {
    // Check required parameters
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling createAnExternalIssue");
    }
    if (createAnExternalIssueRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createAnExternalIssueRequest' when calling createAnExternalIssue");
    }

    // Path parameters
    String localVarPath = "/api/0/sentry-app-installations/{uuid}/external-issues/"
            .replaceAll("\\{uuid}", apiClient.escapeString(uuid));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<CreateAnExternalIssue200Response> localVarReturnType = new GenericType<CreateAnExternalIssue200Response>() {};
    return apiClient.invokeAPI("IntegrationApi.createAnExternalIssue", localVarPath, "POST", new ArrayList<>(), createAnExternalIssueRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Delete an external issue.
   * @param uuid The uuid of the integration platform integration. (required)
   * @param externalIssueId The id of the external issue. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> External issue not found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAnExternalIssue(String uuid, String externalIssueId) throws ApiException {
    deleteAnExternalIssueWithHttpInfo(uuid, externalIssueId);
  }

  /**
   * 
   * Delete an external issue.
   * @param uuid The uuid of the integration platform integration. (required)
   * @param externalIssueId The id of the external issue. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> External issue not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAnExternalIssueWithHttpInfo(String uuid, String externalIssueId) throws ApiException {
    // Check required parameters
    if (uuid == null) {
      throw new ApiException(400, "Missing the required parameter 'uuid' when calling deleteAnExternalIssue");
    }
    if (externalIssueId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalIssueId' when calling deleteAnExternalIssue");
    }

    // Path parameters
    String localVarPath = "/api/0/sentry-app-installations/{uuid}/external-issues/{external_issue_id}/"
            .replaceAll("\\{uuid}", apiClient.escapeString(uuid))
            .replaceAll("\\{external_issue_id}", apiClient.escapeString(externalIssueId));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("IntegrationApi.deleteAnExternalIssue", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Return a list of integration platform installations for a given organization.
   * @param organizationSlug The organization short name. (required)
   * @return List&lt;ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner> listAnOrganizationsIntegrationPlatformInstallations(String organizationSlug) throws ApiException {
    return listAnOrganizationsIntegrationPlatformInstallationsWithHttpInfo(organizationSlug).getData();
  }

  /**
   * 
   * Return a list of integration platform installations for a given organization.
   * @param organizationSlug The organization short name. (required)
   * @return ApiResponse&lt;List&lt;ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner>> listAnOrganizationsIntegrationPlatformInstallationsWithHttpInfo(String organizationSlug) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsIntegrationPlatformInstallations");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/sentry-app-installations/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner>> localVarReturnType = new GenericType<List<ListAnOrganizationSIntegrationPlatformInstallations200ResponseInner>>() {};
    return apiClient.invokeAPI("IntegrationApi.listAnOrganizationsIntegrationPlatformInstallations", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
