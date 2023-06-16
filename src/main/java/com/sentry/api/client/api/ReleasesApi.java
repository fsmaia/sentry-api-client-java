package com.sentry.api.client.api;

import com.sentry.api.client.ApiException;
import com.sentry.api.client.ApiClient;
import com.sentry.api.client.ApiResponse;
import com.sentry.api.client.Configuration;
import com.sentry.api.client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.sentry.api.client.model.CreateANewDeployForAnOrganizationRequest;
import com.sentry.api.client.model.CreateANewReleaseForAnOrganizationRequest;
import java.io.File;
import com.sentry.api.client.model.ListARepositorySCommits200ResponseInner;
import com.sentry.api.client.model.ListAnOrganizationSReleaseFiles200ResponseInner;
import java.time.OffsetDateTime;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf;
import com.sentry.api.client.model.RetrieveReleaseHealthSessionStatistics200Response;
import com.sentry.api.client.model.RetrieveReleaseHealthSessionStatistics400Response;
import com.sentry.api.client.model.RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf;
import com.sentry.api.client.model.UpdateAnOrganizationReleaseFileRequest;
import com.sentry.api.client.model.UpdateAnOrganizationSReleaseRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class ReleasesApi {
  private ApiClient apiClient;

  public ReleasesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReleasesApi(ApiClient apiClient) {
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
   * Create a deploy.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @param createANewDeployForAnOrganizationRequest  (optional)
   * @return RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 208 </td><td> Already Reported </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf createANewDeployForAnOrganization(String organizationSlug, String version, CreateANewDeployForAnOrganizationRequest createANewDeployForAnOrganizationRequest) throws ApiException {
    return createANewDeployForAnOrganizationWithHttpInfo(organizationSlug, version, createANewDeployForAnOrganizationRequest).getData();
  }

  /**
   * 
   * Create a deploy.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @param createANewDeployForAnOrganizationRequest  (optional)
   * @return ApiResponse&lt;RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 208 </td><td> Already Reported </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf> createANewDeployForAnOrganizationWithHttpInfo(String organizationSlug, String version, CreateANewDeployForAnOrganizationRequest createANewDeployForAnOrganizationRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling createANewDeployForAnOrganization");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling createANewDeployForAnOrganization");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/deploys/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf> localVarReturnType = new GenericType<RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf>() {};
    return apiClient.invokeAPI("ReleasesApi.createANewDeployForAnOrganization", localVarPath, "POST", new ArrayList<>(), createANewDeployForAnOrganizationRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Create a new release for the given organization.  Releases are used by Sentry to improve its error reporting abilities by correlating first seen events with the release that might have introduced the problem. Releases are also necessary for source maps and other debug features that require manual upload for functioning well.
   * @param organizationSlug The slug of the organization. (required)
   * @param createANewReleaseForAnOrganizationRequest  (optional)
   * @return RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf createANewReleaseForAnOrganization(String organizationSlug, CreateANewReleaseForAnOrganizationRequest createANewReleaseForAnOrganizationRequest) throws ApiException {
    return createANewReleaseForAnOrganizationWithHttpInfo(organizationSlug, createANewReleaseForAnOrganizationRequest).getData();
  }

  /**
   * 
   * Create a new release for the given organization.  Releases are used by Sentry to improve its error reporting abilities by correlating first seen events with the release that might have introduced the problem. Releases are also necessary for source maps and other debug features that require manual upload for functioning well.
   * @param organizationSlug The slug of the organization. (required)
   * @param createANewReleaseForAnOrganizationRequest  (optional)
   * @return ApiResponse&lt;RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Input </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf> createANewReleaseForAnOrganizationWithHttpInfo(String organizationSlug, CreateANewReleaseForAnOrganizationRequest createANewReleaseForAnOrganizationRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling createANewReleaseForAnOrganization");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf> localVarReturnType = new GenericType<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf>() {};
    return apiClient.invokeAPI("ReleasesApi.createANewReleaseForAnOrganization", localVarPath, "POST", new ArrayList<>(), createANewReleaseForAnOrganizationRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Delete a file for a given release.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to delete. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAProjectReleasesFile(String organizationSlug, String projectSlug, String version, String fileId) throws ApiException {
    deleteAProjectReleasesFileWithHttpInfo(organizationSlug, projectSlug, version, fileId);
  }

  /**
   * 
   * Delete a file for a given release.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAProjectReleasesFileWithHttpInfo(String organizationSlug, String projectSlug, String version, String fileId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling deleteAProjectReleasesFile");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling deleteAProjectReleasesFile");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling deleteAProjectReleasesFile");
    }
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling deleteAProjectReleasesFile");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/{file_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version))
            .replaceAll("\\{file_id}", apiClient.escapeString(fileId));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ReleasesApi.deleteAProjectReleasesFile", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Delete a file for a given release.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to delete. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAnOrganizationReleasesFile(String organizationSlug, String version, String fileId) throws ApiException {
    deleteAnOrganizationReleasesFileWithHttpInfo(organizationSlug, version, fileId);
  }

  /**
   * 
   * Delete a file for a given release.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAnOrganizationReleasesFileWithHttpInfo(String organizationSlug, String version, String fileId) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling deleteAnOrganizationReleasesFile");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling deleteAnOrganizationReleasesFile");
    }
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling deleteAnOrganizationReleasesFile");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/files/{file_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version))
            .replaceAll("\\{file_id}", apiClient.escapeString(fileId));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ReleasesApi.deleteAnOrganizationReleasesFile", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Delete a release for a given organization.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAnOrganizationsRelease(String organizationSlug, String version) throws ApiException {
    deleteAnOrganizationsReleaseWithHttpInfo(organizationSlug, version);
  }

  /**
   * 
   * Delete a release for a given organization.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAnOrganizationsReleaseWithHttpInfo(String organizationSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling deleteAnOrganizationsRelease");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling deleteAnOrganizationsRelease");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ReleasesApi.deleteAnOrganizationsRelease", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * List a project release&#39;s commits.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param projectSlug The slug of the project the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @return List&lt;ListARepositorySCommits200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListARepositorySCommits200ResponseInner> listAProjectReleasesCommits(String organizationSlug, String projectSlug, String version) throws ApiException {
    return listAProjectReleasesCommitsWithHttpInfo(organizationSlug, projectSlug, version).getData();
  }

  /**
   * 
   * List a project release&#39;s commits.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param projectSlug The slug of the project the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;List&lt;ListARepositorySCommits200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListARepositorySCommits200ResponseInner>> listAProjectReleasesCommitsWithHttpInfo(String organizationSlug, String projectSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAProjectReleasesCommits");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listAProjectReleasesCommits");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling listAProjectReleasesCommits");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/releases/{version}/commits/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListARepositorySCommits200ResponseInner>> localVarReturnType = new GenericType<List<ListARepositorySCommits200ResponseInner>>() {};
    return apiClient.invokeAPI("ReleasesApi.listAProjectReleasesCommits", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of files for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @return List&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnOrganizationSReleaseFiles200ResponseInner> listAProjectsReleaseFiles(String organizationSlug, String projectSlug, String version) throws ApiException {
    return listAProjectsReleaseFilesWithHttpInfo(organizationSlug, projectSlug, version).getData();
  }

  /**
   * 
   * Return a list of files for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;List&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnOrganizationSReleaseFiles200ResponseInner>> listAProjectsReleaseFilesWithHttpInfo(String organizationSlug, String projectSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAProjectsReleaseFiles");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listAProjectsReleaseFiles");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling listAProjectsReleaseFiles");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnOrganizationSReleaseFiles200ResponseInner>> localVarReturnType = new GenericType<List<ListAnOrganizationSReleaseFiles200ResponseInner>>() {};
    return apiClient.invokeAPI("ReleasesApi.listAProjectsReleaseFiles", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of deploys for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @return List&lt;RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf> listAReleasesDeploys(String organizationSlug, String version) throws ApiException {
    return listAReleasesDeploysWithHttpInfo(organizationSlug, version).getData();
  }

  /**
   * 
   * Return a list of deploys for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;List&lt;RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf>> listAReleasesDeploysWithHttpInfo(String organizationSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAReleasesDeploys");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling listAReleasesDeploys");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/deploys/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf>> localVarReturnType = new GenericType<List<RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf>>() {};
    return apiClient.invokeAPI("ReleasesApi.listAReleasesDeploys", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * List an organization release&#39;s commits.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @return List&lt;ListARepositorySCommits200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListARepositorySCommits200ResponseInner> listAnOrganizationReleasesCommits(String organizationSlug, String version) throws ApiException {
    return listAnOrganizationReleasesCommitsWithHttpInfo(organizationSlug, version).getData();
  }

  /**
   * 
   * List an organization release&#39;s commits.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;List&lt;ListARepositorySCommits200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListARepositorySCommits200ResponseInner>> listAnOrganizationReleasesCommitsWithHttpInfo(String organizationSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationReleasesCommits");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling listAnOrganizationReleasesCommits");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/commits/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListARepositorySCommits200ResponseInner>> localVarReturnType = new GenericType<List<ListARepositorySCommits200ResponseInner>>() {};
    return apiClient.invokeAPI("ReleasesApi.listAnOrganizationReleasesCommits", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of files for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @return List&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<ListAnOrganizationSReleaseFiles200ResponseInner> listAnOrganizationsReleaseFiles(String organizationSlug, String version) throws ApiException {
    return listAnOrganizationsReleaseFilesWithHttpInfo(organizationSlug, version).getData();
  }

  /**
   * 
   * Return a list of files for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;List&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ListAnOrganizationSReleaseFiles200ResponseInner>> listAnOrganizationsReleaseFilesWithHttpInfo(String organizationSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsReleaseFiles");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling listAnOrganizationsReleaseFiles");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/files/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<ListAnOrganizationSReleaseFiles200ResponseInner>> localVarReturnType = new GenericType<List<ListAnOrganizationSReleaseFiles200ResponseInner>>() {};
    return apiClient.invokeAPI("ReleasesApi.listAnOrganizationsReleaseFiles", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a list of releases for a given organization.
   * @param organizationSlug The slug of the organization. (required)
   * @param query This parameter can be used to create a \&quot;starts with\&quot; filter for the version. (optional)
   * @return List&lt;RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Permission Denied </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf> listAnOrganizationsReleases(String organizationSlug, String query) throws ApiException {
    return listAnOrganizationsReleasesWithHttpInfo(organizationSlug, query).getData();
  }

  /**
   * 
   * Return a list of releases for a given organization.
   * @param organizationSlug The slug of the organization. (required)
   * @param query This parameter can be used to create a \&quot;starts with\&quot; filter for the version. (optional)
   * @return ApiResponse&lt;List&lt;RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Permission Denied </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf>> listAnOrganizationsReleasesWithHttpInfo(String organizationSlug, String query) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listAnOrganizationsReleases");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "query", query)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<List<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf>> localVarReturnType = new GenericType<List<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf>>() {};
    return apiClient.invokeAPI("ReleasesApi.listAnOrganizationsReleases", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * List issues to be resolved in a particular release.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void listIssuesToBeResolvedInAParticularRelease(String organizationSlug, String projectSlug, String version) throws ApiException {
    listIssuesToBeResolvedInAParticularReleaseWithHttpInfo(organizationSlug, projectSlug, version);
  }

  /**
   * 
   * List issues to be resolved in a particular release.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> listIssuesToBeResolvedInAParticularReleaseWithHttpInfo(String organizationSlug, String projectSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling listIssuesToBeResolvedInAParticularRelease");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listIssuesToBeResolvedInAParticularRelease");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling listIssuesToBeResolvedInAParticularRelease");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/releases/{version}/resolved/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ReleasesApi.listIssuesToBeResolvedInAParticularRelease", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Retrieve a file for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to retrieve. (required)
   * @param download If this is set to true, then the response payload will be the raw file contents. Otherwise, the response will be the file metadata as JSON. (optional)
   * @return ListAnOrganizationSReleaseFiles200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSReleaseFiles200ResponseInner retrieveAProjectReleasesFile(String organizationSlug, String projectSlug, String version, String fileId, Boolean download) throws ApiException {
    return retrieveAProjectReleasesFileWithHttpInfo(organizationSlug, projectSlug, version, fileId, download).getData();
  }

  /**
   * 
   * Retrieve a file for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to retrieve. (required)
   * @param download If this is set to true, then the response payload will be the raw file contents. Otherwise, the response will be the file metadata as JSON. (optional)
   * @return ApiResponse&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSReleaseFiles200ResponseInner> retrieveAProjectReleasesFileWithHttpInfo(String organizationSlug, String projectSlug, String version, String fileId, Boolean download) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveAProjectReleasesFile");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling retrieveAProjectReleasesFile");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling retrieveAProjectReleasesFile");
    }
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling retrieveAProjectReleasesFile");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/{file_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version))
            .replaceAll("\\{file_id}", apiClient.escapeString(fileId));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "download", download)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSReleaseFiles200ResponseInner> localVarReturnType = new GenericType<ListAnOrganizationSReleaseFiles200ResponseInner>() {};
    return apiClient.invokeAPI("ReleasesApi.retrieveAProjectReleasesFile", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Retrieve a file for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to retrieve. (required)
   * @param download If this is set to true, then the response payload will be the raw file contents. Otherwise, the response will be the file metadata as JSON. (optional)
   * @return ListAnOrganizationSReleaseFiles200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSReleaseFiles200ResponseInner retrieveAnOrganizationReleasesFile(String organizationSlug, String version, String fileId, Boolean download) throws ApiException {
    return retrieveAnOrganizationReleasesFileWithHttpInfo(organizationSlug, version, fileId, download).getData();
  }

  /**
   * 
   * Retrieve a file for a given release.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to retrieve. (required)
   * @param download If this is set to true, then the response payload will be the raw file contents. Otherwise, the response will be the file metadata as JSON. (optional)
   * @return ApiResponse&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSReleaseFiles200ResponseInner> retrieveAnOrganizationReleasesFileWithHttpInfo(String organizationSlug, String version, String fileId, Boolean download) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveAnOrganizationReleasesFile");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling retrieveAnOrganizationReleasesFile");
    }
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling retrieveAnOrganizationReleasesFile");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/files/{file_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version))
            .replaceAll("\\{file_id}", apiClient.escapeString(fileId));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "download", download)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSReleaseFiles200ResponseInner> localVarReturnType = new GenericType<ListAnOrganizationSReleaseFiles200ResponseInner>() {};
    return apiClient.invokeAPI("ReleasesApi.retrieveAnOrganizationReleasesFile", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Return a release for a given organization.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @return RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf retrieveAnOrganizationsReleases(String organizationSlug, String version) throws ApiException {
    return retrieveAnOrganizationsReleasesWithHttpInfo(organizationSlug, version).getData();
  }

  /**
   * 
   * Return a release for a given organization.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf> retrieveAnOrganizationsReleasesWithHttpInfo(String organizationSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveAnOrganizationsReleases");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling retrieveAnOrganizationsReleases");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf> localVarReturnType = new GenericType<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf>() {};
    return apiClient.invokeAPI("ReleasesApi.retrieveAnOrganizationsReleases", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Retrieve files changed in a release&#39;s commits
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void retrieveFilesChangedInAReleasesCommits(String organizationSlug, String version) throws ApiException {
    retrieveFilesChangedInAReleasesCommitsWithHttpInfo(organizationSlug, version);
  }

  /**
   * 
   * Retrieve files changed in a release&#39;s commits
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> retrieveFilesChangedInAReleasesCommitsWithHttpInfo(String organizationSlug, String version) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveFilesChangedInAReleasesCommits");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling retrieveFilesChangedInAReleasesCommits");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/commitfiles/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ReleasesApi.retrieveFilesChangedInAReleasesCommits", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Returns a time series of release health session statistics for projects bound to an organization.  The interval and date range are subject to certain restrictions and rounding rules.  The date range is rounded to align with the interval, and is rounded to at least one hour. The interval can at most be one day and at least one hour currently. It has to cleanly divide one day, for rounding reasons.  Apart from the query parameters listed below, this endpoint also supports the usual [pagination parameters](https://docs.sentry.io/api/pagination/).
   * @param organizationSlug The slug of the organization. (required)
   * @param project The ID of the projects to filter by.  Use &#x60;-1&#x60; to include all accessible projects. (required)
   * @param field The list of fields to query.  The available fields are   - &#x60;sum(session)&#x60;   - &#x60;count_unique(user)&#x60;   - &#x60;avg&#x60;, &#x60;p50&#x60;, &#x60;p75&#x60;, &#x60;p90&#x60;, &#x60;p95&#x60;, &#x60;p99&#x60;, &#x60;max&#x60; applied to &#x60;session.duration&#x60;. For example, &#x60;p99(session.duration)&#x60;. Session duration is [no longer being recorded](https://github.com/getsentry/sentry/discussions/42716) as of on Jan 12, 2023. Returned data may be incomplete.   - &#x60;crash_rate&#x60;, &#x60;crash_free_rate&#x60; applied to &#x60;user&#x60; or &#x60;session&#x60;. For example, &#x60;crash_free_rate(user)&#x60; (required)
   * @param environment The name of environments to filter by. (optional)
   * @param groupBy The list of properties to group by.  The available groupBy conditions are &#x60;project&#x60;, &#x60;release&#x60;, &#x60;environment&#x60; and &#x60;session.status&#x60;.  Grouping by &#x60;session.status&#x60; does not work when &#x60;crash_rate&#x60; or &#x60;crash_free_rate&#x60; are queried. (optional)
   * @param orderBy An optional field to order by, which must be one of the fields provided in &#x60;field&#x60;. Use &#x60;-&#x60; for descending order, for example &#x60;-sum(session)&#x60;.   This alters the order of the &#x60;groups&#x60; returned, so it only makes sense in combination with &#x60;groupBy&#x60;.   Ordering by more than one field is currently not supported. (optional)
   * @param query A free-form query that is applied as a filter.  An example query could be &#x60;release:\&quot;1.1.0\&quot; or release:\&quot;1.2.0\&quot;&#x60;. (optional)
   * @param statsPeriod This defines the range of the time series, relative to now.  The range is given in a &#x60;\&quot;&lt;number&gt;&lt;unit&gt;\&quot;&#x60; format.  For example &#x60;1d&#x60; for a one day range. Possible units are &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days and &#x60;w&#x60; for weeks.  It defaults to &#x60;90d&#x60;. (optional)
   * @param interval This is the resolution of the time series, given in the same format as &#x60;statsPeriod&#x60;.  The default resolution is &#x60;1h&#x60; and the minimum resolution is currently restricted to &#x60;1h&#x60; as well.  Intervals larger than &#x60;1d&#x60; are not supported, and the interval has to cleanly divide one day. (optional)
   * @param statsPeriodStart This defines the start of the time series range, in the same format as the &#x60;interval&#x60;, relative to now. (optional)
   * @param statsPeriodEnd This defines the end of the time series range, in the same format as the &#x60;interval&#x60;, relative to now. (optional)
   * @param start This defines the start of the time series range as an explicit datetime. (optional)
   * @param end This defines the inclusive end of the time series range as an explicit datetime. (optional)
   * @return RetrieveReleaseHealthSessionStatistics200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Time-series Session Statistics. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Wrong Parameters </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveReleaseHealthSessionStatistics200Response retrieveReleaseHealthSessionStatistics(String organizationSlug, List<Integer> project, List<String> field, List<String> environment, List<String> groupBy, String orderBy, String query, String statsPeriod, String interval, String statsPeriodStart, String statsPeriodEnd, OffsetDateTime start, OffsetDateTime end) throws ApiException {
    return retrieveReleaseHealthSessionStatisticsWithHttpInfo(organizationSlug, project, field, environment, groupBy, orderBy, query, statsPeriod, interval, statsPeriodStart, statsPeriodEnd, start, end).getData();
  }

  /**
   * 
   * Returns a time series of release health session statistics for projects bound to an organization.  The interval and date range are subject to certain restrictions and rounding rules.  The date range is rounded to align with the interval, and is rounded to at least one hour. The interval can at most be one day and at least one hour currently. It has to cleanly divide one day, for rounding reasons.  Apart from the query parameters listed below, this endpoint also supports the usual [pagination parameters](https://docs.sentry.io/api/pagination/).
   * @param organizationSlug The slug of the organization. (required)
   * @param project The ID of the projects to filter by.  Use &#x60;-1&#x60; to include all accessible projects. (required)
   * @param field The list of fields to query.  The available fields are   - &#x60;sum(session)&#x60;   - &#x60;count_unique(user)&#x60;   - &#x60;avg&#x60;, &#x60;p50&#x60;, &#x60;p75&#x60;, &#x60;p90&#x60;, &#x60;p95&#x60;, &#x60;p99&#x60;, &#x60;max&#x60; applied to &#x60;session.duration&#x60;. For example, &#x60;p99(session.duration)&#x60;. Session duration is [no longer being recorded](https://github.com/getsentry/sentry/discussions/42716) as of on Jan 12, 2023. Returned data may be incomplete.   - &#x60;crash_rate&#x60;, &#x60;crash_free_rate&#x60; applied to &#x60;user&#x60; or &#x60;session&#x60;. For example, &#x60;crash_free_rate(user)&#x60; (required)
   * @param environment The name of environments to filter by. (optional)
   * @param groupBy The list of properties to group by.  The available groupBy conditions are &#x60;project&#x60;, &#x60;release&#x60;, &#x60;environment&#x60; and &#x60;session.status&#x60;.  Grouping by &#x60;session.status&#x60; does not work when &#x60;crash_rate&#x60; or &#x60;crash_free_rate&#x60; are queried. (optional)
   * @param orderBy An optional field to order by, which must be one of the fields provided in &#x60;field&#x60;. Use &#x60;-&#x60; for descending order, for example &#x60;-sum(session)&#x60;.   This alters the order of the &#x60;groups&#x60; returned, so it only makes sense in combination with &#x60;groupBy&#x60;.   Ordering by more than one field is currently not supported. (optional)
   * @param query A free-form query that is applied as a filter.  An example query could be &#x60;release:\&quot;1.1.0\&quot; or release:\&quot;1.2.0\&quot;&#x60;. (optional)
   * @param statsPeriod This defines the range of the time series, relative to now.  The range is given in a &#x60;\&quot;&lt;number&gt;&lt;unit&gt;\&quot;&#x60; format.  For example &#x60;1d&#x60; for a one day range. Possible units are &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days and &#x60;w&#x60; for weeks.  It defaults to &#x60;90d&#x60;. (optional)
   * @param interval This is the resolution of the time series, given in the same format as &#x60;statsPeriod&#x60;.  The default resolution is &#x60;1h&#x60; and the minimum resolution is currently restricted to &#x60;1h&#x60; as well.  Intervals larger than &#x60;1d&#x60; are not supported, and the interval has to cleanly divide one day. (optional)
   * @param statsPeriodStart This defines the start of the time series range, in the same format as the &#x60;interval&#x60;, relative to now. (optional)
   * @param statsPeriodEnd This defines the end of the time series range, in the same format as the &#x60;interval&#x60;, relative to now. (optional)
   * @param start This defines the start of the time series range as an explicit datetime. (optional)
   * @param end This defines the inclusive end of the time series range as an explicit datetime. (optional)
   * @return ApiResponse&lt;RetrieveReleaseHealthSessionStatistics200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Time-series Session Statistics. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Wrong Parameters </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveReleaseHealthSessionStatistics200Response> retrieveReleaseHealthSessionStatisticsWithHttpInfo(String organizationSlug, List<Integer> project, List<String> field, List<String> environment, List<String> groupBy, String orderBy, String query, String statsPeriod, String interval, String statsPeriodStart, String statsPeriodEnd, OffsetDateTime start, OffsetDateTime end) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling retrieveReleaseHealthSessionStatistics");
    }
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling retrieveReleaseHealthSessionStatistics");
    }
    if (field == null) {
      throw new ApiException(400, "Missing the required parameter 'field' when calling retrieveReleaseHealthSessionStatistics");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/sessions/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "project", project)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "field", field));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "environment", environment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statsPeriod", statsPeriod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statsPeriodStart", statsPeriodStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "statsPeriodEnd", statsPeriodEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveReleaseHealthSessionStatistics200Response> localVarReturnType = new GenericType<RetrieveReleaseHealthSessionStatistics200Response>() {};
    return apiClient.invokeAPI("ReleasesApi.retrieveReleaseHealthSessionStatistics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Update a project release file.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to retrieve. (required)
   * @param updateAnOrganizationReleaseFileRequest  (optional)
   * @return ListAnOrganizationSReleaseFiles200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSReleaseFiles200ResponseInner updateAProjectReleaseFile(String organizationSlug, String projectSlug, String version, String fileId, UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest) throws ApiException {
    return updateAProjectReleaseFileWithHttpInfo(organizationSlug, projectSlug, version, fileId, updateAnOrganizationReleaseFileRequest).getData();
  }

  /**
   * 
   * Update a project release file.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to retrieve. (required)
   * @param updateAnOrganizationReleaseFileRequest  (optional)
   * @return ApiResponse&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSReleaseFiles200ResponseInner> updateAProjectReleaseFileWithHttpInfo(String organizationSlug, String projectSlug, String version, String fileId, UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateAProjectReleaseFile");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling updateAProjectReleaseFile");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling updateAProjectReleaseFile");
    }
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling updateAProjectReleaseFile");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/{file_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version))
            .replaceAll("\\{file_id}", apiClient.escapeString(fileId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSReleaseFiles200ResponseInner> localVarReturnType = new GenericType<ListAnOrganizationSReleaseFiles200ResponseInner>() {};
    return apiClient.invokeAPI("ReleasesApi.updateAProjectReleaseFile", localVarPath, "PUT", new ArrayList<>(), updateAnOrganizationReleaseFileRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Update an organization release file.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to retrieve. (required)
   * @param updateAnOrganizationReleaseFileRequest  (optional)
   * @return ListAnOrganizationSReleaseFiles200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSReleaseFiles200ResponseInner updateAnOrganizationReleaseFile(String organizationSlug, String version, String fileId, UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest) throws ApiException {
    return updateAnOrganizationReleaseFileWithHttpInfo(organizationSlug, version, fileId, updateAnOrganizationReleaseFileRequest).getData();
  }

  /**
   * 
   * Update an organization release file.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @param fileId The ID of the file to retrieve. (required)
   * @param updateAnOrganizationReleaseFileRequest  (optional)
   * @return ApiResponse&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSReleaseFiles200ResponseInner> updateAnOrganizationReleaseFileWithHttpInfo(String organizationSlug, String version, String fileId, UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateAnOrganizationReleaseFile");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling updateAnOrganizationReleaseFile");
    }
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling updateAnOrganizationReleaseFile");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/files/{file_id}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version))
            .replaceAll("\\{file_id}", apiClient.escapeString(fileId));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSReleaseFiles200ResponseInner> localVarReturnType = new GenericType<ListAnOrganizationSReleaseFiles200ResponseInner>() {};
    return apiClient.invokeAPI("ReleasesApi.updateAnOrganizationReleaseFile", localVarPath, "PUT", new ArrayList<>(), updateAnOrganizationReleaseFileRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Update a release for a given organization.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @param updateAnOrganizationSReleaseRequest  (optional)
   * @return RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf updateAnOrganizationsRelease(String organizationSlug, String version, UpdateAnOrganizationSReleaseRequest updateAnOrganizationSReleaseRequest) throws ApiException {
    return updateAnOrganizationsReleaseWithHttpInfo(organizationSlug, version, updateAnOrganizationSReleaseRequest).getData();
  }

  /**
   * 
   * Update a release for a given organization.
   * @param organizationSlug The slug of the organization the release belongs to. (required)
   * @param version The version identifier of the release. (required)
   * @param updateAnOrganizationSReleaseRequest  (optional)
   * @return ApiResponse&lt;RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf> updateAnOrganizationsReleaseWithHttpInfo(String organizationSlug, String version, UpdateAnOrganizationSReleaseRequest updateAnOrganizationSReleaseRequest) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling updateAnOrganizationsRelease");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling updateAnOrganizationsRelease");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf> localVarReturnType = new GenericType<RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOf>() {};
    return apiClient.invokeAPI("ReleasesApi.updateAnOrganizationsRelease", localVarPath, "PUT", new ArrayList<>(), updateAnOrganizationSReleaseRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Upload a new organization release file.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @param _file The multipart encoded file. (required)
   * @param name The name (full path) of the file. (optional)
   * @param dist The name of the dist. (optional)
   * @param header This parameter can be supplied multiple times to attach headers to the file. Each header is a string in the format &#x60;key:value&#x60;. For instance it can be used to define a content type. (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void uploadANewOrganizationReleaseFile(String organizationSlug, String version, File _file, String name, String dist, String header) throws ApiException {
    uploadANewOrganizationReleaseFileWithHttpInfo(organizationSlug, version, _file, name, dist, header);
  }

  /**
   * 
   * Upload a new organization release file.
   * @param organizationSlug The slug of the organization. (required)
   * @param version The version identifier of the release. (required)
   * @param _file The multipart encoded file. (required)
   * @param name The name (full path) of the file. (optional)
   * @param dist The name of the dist. (optional)
   * @param header This parameter can be supplied multiple times to attach headers to the file. Each header is a string in the format &#x60;key:value&#x60;. For instance it can be used to define a content type. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> uploadANewOrganizationReleaseFileWithHttpInfo(String organizationSlug, String version, File _file, String name, String dist, String header) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling uploadANewOrganizationReleaseFile");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling uploadANewOrganizationReleaseFile");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling uploadANewOrganizationReleaseFile");
    }

    // Path parameters
    String localVarPath = "/api/0/organizations/{organization_slug}/releases/{version}/files/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (name != null) {
      localVarFormParams.put("name", name);
    }
    localVarFormParams.put("file", _file);
    if (dist != null) {
      localVarFormParams.put("dist", dist);
    }
    if (header != null) {
      localVarFormParams.put("header", header);
    }

    String localVarAccept = apiClient.selectHeaderAccept();
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"auth_token"};
    return apiClient.invokeAPI("ReleasesApi.uploadANewOrganizationReleaseFile", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * Upload a new project release file.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @param _file The multipart encoded file. (required)
   * @param name The name (full path) of the file. (optional)
   * @param dist The name of the dist. (optional)
   * @param header This parameter can be supplied multiple times to attach headers to the file. Each header is a string in the format &#x60;key:value&#x60;. For instance it can be used to define a content type. (optional)
   * @return ListAnOrganizationSReleaseFiles200ResponseInner
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ListAnOrganizationSReleaseFiles200ResponseInner uploadANewProjectReleaseFile(String organizationSlug, String projectSlug, String version, File _file, String name, String dist, String header) throws ApiException {
    return uploadANewProjectReleaseFileWithHttpInfo(organizationSlug, projectSlug, version, _file, name, dist, header).getData();
  }

  /**
   * 
   * Upload a new project release file.
   * @param organizationSlug The slug of the organization. (required)
   * @param projectSlug The slug of the project. (required)
   * @param version The version identifier of the release. (required)
   * @param _file The multipart encoded file. (required)
   * @param name The name (full path) of the file. (optional)
   * @param dist The name of the dist. (optional)
   * @param header This parameter can be supplied multiple times to attach headers to the file. Each header is a string in the format &#x60;key:value&#x60;. For instance it can be used to define a content type. (optional)
   * @return ApiResponse&lt;ListAnOrganizationSReleaseFiles200ResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnOrganizationSReleaseFiles200ResponseInner> uploadANewProjectReleaseFileWithHttpInfo(String organizationSlug, String projectSlug, String version, File _file, String name, String dist, String header) throws ApiException {
    // Check required parameters
    if (organizationSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationSlug' when calling uploadANewProjectReleaseFile");
    }
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling uploadANewProjectReleaseFile");
    }
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling uploadANewProjectReleaseFile");
    }
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling uploadANewProjectReleaseFile");
    }

    // Path parameters
    String localVarPath = "/api/0/projects/{organization_slug}/{project_slug}/releases/{version}/files/"
            .replaceAll("\\{organization_slug}", apiClient.escapeString(organizationSlug))
            .replaceAll("\\{project_slug}", apiClient.escapeString(projectSlug))
            .replaceAll("\\{version}", apiClient.escapeString(version));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (name != null) {
      localVarFormParams.put("name", name);
    }
    localVarFormParams.put("file", _file);
    if (dist != null) {
      localVarFormParams.put("dist", dist);
    }
    if (header != null) {
      localVarFormParams.put("header", header);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"auth_token"};
    GenericType<ListAnOrganizationSReleaseFiles200ResponseInner> localVarReturnType = new GenericType<ListAnOrganizationSReleaseFiles200ResponseInner>() {};
    return apiClient.invokeAPI("ReleasesApi.uploadANewProjectReleaseFile", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
