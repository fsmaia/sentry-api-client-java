/*
 * API Reference
 * Sentry Public API
 *
 * The version of the OpenAPI document: v0
 * Contact: partners@sentry.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sentry.api.client.api;

import com.sentry.api.client.*;
import com.sentry.api.client.auth.*;
import com.sentry.api.client.model.CreateANewDeployForAnOrganizationRequest;
import com.sentry.api.client.model.CreateANewReleaseForAnOrganizationRequest;
import java.io.File;
import com.sentry.api.client.model.ListARepositorySCommits200ResponseInner;
import com.sentry.api.client.model.ListAnOrganizationSReleaseFiles200ResponseInner;
import java.time.OffsetDateTime;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseReleaseAllOf;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf;
import com.sentry.api.client.model.RetrieveReleaseHealthSessionStatistics200Response;
import com.sentry.api.client.model.RetrieveReleaseHealthSessionStatistics400Response;
import com.sentry.api.client.model.UpdateAnOrganizationReleaseFileRequest;
import com.sentry.api.client.model.UpdateAnOrganizationSReleaseRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReleasesApi
 */
public class ReleasesApiTest {

    private final ReleasesApi api = new ReleasesApi();

    /**
     * Create a deploy.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createANewDeployForAnOrganizationTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //CreateANewDeployForAnOrganizationRequest createANewDeployForAnOrganizationRequest = null;
        //RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf response = api.createANewDeployForAnOrganization(organizationSlug, version, createANewDeployForAnOrganizationRequest);
        // TODO: test validations
    }

    /**
     * Create a new release for the given organization.  Releases are used by Sentry to improve its error reporting abilities by correlating first seen events with the release that might have introduced the problem. Releases are also necessary for source maps and other debug features that require manual upload for functioning well.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createANewReleaseForAnOrganizationTest() throws ApiException {
        //String organizationSlug = null;
        //CreateANewReleaseForAnOrganizationRequest createANewReleaseForAnOrganizationRequest = null;
        //RetrieveAnEventForAProject200ResponseReleaseAllOf response = api.createANewReleaseForAnOrganization(organizationSlug, createANewReleaseForAnOrganizationRequest);
        // TODO: test validations
    }

    /**
     * Delete a file for a given release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAProjectReleasesFileTest() throws ApiException {
        //String organizationSlug = null;
        //String projectSlug = null;
        //String version = null;
        //String fileId = null;
        //api.deleteAProjectReleasesFile(organizationSlug, projectSlug, version, fileId);
        // TODO: test validations
    }

    /**
     * Delete a file for a given release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAnOrganizationReleasesFileTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //String fileId = null;
        //api.deleteAnOrganizationReleasesFile(organizationSlug, version, fileId);
        // TODO: test validations
    }

    /**
     * Delete a release for a given organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAnOrganizationsReleaseTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //api.deleteAnOrganizationsRelease(organizationSlug, version);
        // TODO: test validations
    }

    /**
     * List a project release&#39;s commits.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAProjectReleasesCommitsTest() throws ApiException {
        //String organizationSlug = null;
        //String projectSlug = null;
        //String version = null;
        //List<ListARepositorySCommits200ResponseInner> response = api.listAProjectReleasesCommits(organizationSlug, projectSlug, version);
        // TODO: test validations
    }

    /**
     * Return a list of files for a given release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAProjectsReleaseFilesTest() throws ApiException {
        //String organizationSlug = null;
        //String projectSlug = null;
        //String version = null;
        //List<ListAnOrganizationSReleaseFiles200ResponseInner> response = api.listAProjectsReleaseFiles(organizationSlug, projectSlug, version);
        // TODO: test validations
    }

    /**
     * Return a list of deploys for a given release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAReleasesDeploysTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //List<RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf> response = api.listAReleasesDeploys(organizationSlug, version);
        // TODO: test validations
    }

    /**
     * List an organization release&#39;s commits.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAnOrganizationReleasesCommitsTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //List<ListARepositorySCommits200ResponseInner> response = api.listAnOrganizationReleasesCommits(organizationSlug, version);
        // TODO: test validations
    }

    /**
     * Return a list of files for a given release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAnOrganizationsReleaseFilesTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //List<ListAnOrganizationSReleaseFiles200ResponseInner> response = api.listAnOrganizationsReleaseFiles(organizationSlug, version);
        // TODO: test validations
    }

    /**
     * Return a list of releases for a given organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAnOrganizationsReleasesTest() throws ApiException {
        //String organizationSlug = null;
        //String query = null;
        //List<RetrieveAnEventForAProject200ResponseReleaseAllOf> response = api.listAnOrganizationsReleases(organizationSlug, query);
        // TODO: test validations
    }

    /**
     * List issues to be resolved in a particular release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIssuesToBeResolvedInAParticularReleaseTest() throws ApiException {
        //String organizationSlug = null;
        //String projectSlug = null;
        //String version = null;
        //api.listIssuesToBeResolvedInAParticularRelease(organizationSlug, projectSlug, version);
        // TODO: test validations
    }

    /**
     * Retrieve a file for a given release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveAProjectReleasesFileTest() throws ApiException {
        //String organizationSlug = null;
        //String projectSlug = null;
        //String version = null;
        //String fileId = null;
        //Boolean download = null;
        //ListAnOrganizationSReleaseFiles200ResponseInner response = api.retrieveAProjectReleasesFile(organizationSlug, projectSlug, version, fileId, download);
        // TODO: test validations
    }

    /**
     * Retrieve a file for a given release.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveAnOrganizationReleasesFileTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //String fileId = null;
        //Boolean download = null;
        //ListAnOrganizationSReleaseFiles200ResponseInner response = api.retrieveAnOrganizationReleasesFile(organizationSlug, version, fileId, download);
        // TODO: test validations
    }

    /**
     * Return a release for a given organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveAnOrganizationsReleasesTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //RetrieveAnEventForAProject200ResponseReleaseAllOf response = api.retrieveAnOrganizationsReleases(organizationSlug, version);
        // TODO: test validations
    }

    /**
     * Retrieve files changed in a release&#39;s commits
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveFilesChangedInAReleasesCommitsTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //api.retrieveFilesChangedInAReleasesCommits(organizationSlug, version);
        // TODO: test validations
    }

    /**
     * Returns a time series of release health session statistics for projects bound to an organization.  The interval and date range are subject to certain restrictions and rounding rules.  The date range is rounded to align with the interval, and is rounded to at least one hour. The interval can at most be one day and at least one hour currently. It has to cleanly divide one day, for rounding reasons.  Apart from the query parameters listed below, this endpoint also supports the usual [pagination parameters](https://docs.sentry.io/api/pagination/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveReleaseHealthSessionStatisticsTest() throws ApiException {
        //String organizationSlug = null;
        //List<Integer> project = null;
        //List<String> field = null;
        //List<String> environment = null;
        //List<String> groupBy = null;
        //String orderBy = null;
        //String query = null;
        //String statsPeriod = null;
        //String interval = null;
        //String statsPeriodStart = null;
        //String statsPeriodEnd = null;
        //OffsetDateTime start = null;
        //OffsetDateTime end = null;
        //RetrieveReleaseHealthSessionStatistics200Response response = api.retrieveReleaseHealthSessionStatistics(organizationSlug, project, field, environment, groupBy, orderBy, query, statsPeriod, interval, statsPeriodStart, statsPeriodEnd, start, end);
        // TODO: test validations
    }

    /**
     * Update a project release file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAProjectReleaseFileTest() throws ApiException {
        //String organizationSlug = null;
        //String projectSlug = null;
        //String version = null;
        //String fileId = null;
        //UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest = null;
        //ListAnOrganizationSReleaseFiles200ResponseInner response = api.updateAProjectReleaseFile(organizationSlug, projectSlug, version, fileId, updateAnOrganizationReleaseFileRequest);
        // TODO: test validations
    }

    /**
     * Update an organization release file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAnOrganizationReleaseFileTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //String fileId = null;
        //UpdateAnOrganizationReleaseFileRequest updateAnOrganizationReleaseFileRequest = null;
        //ListAnOrganizationSReleaseFiles200ResponseInner response = api.updateAnOrganizationReleaseFile(organizationSlug, version, fileId, updateAnOrganizationReleaseFileRequest);
        // TODO: test validations
    }

    /**
     * Update a release for a given organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAnOrganizationsReleaseTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //UpdateAnOrganizationSReleaseRequest updateAnOrganizationSReleaseRequest = null;
        //RetrieveAnEventForAProject200ResponseReleaseAllOf response = api.updateAnOrganizationsRelease(organizationSlug, version, updateAnOrganizationSReleaseRequest);
        // TODO: test validations
    }

    /**
     * Upload a new organization release file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadANewOrganizationReleaseFileTest() throws ApiException {
        //String organizationSlug = null;
        //String version = null;
        //File _file = null;
        //String name = null;
        //String dist = null;
        //String header = null;
        //api.uploadANewOrganizationReleaseFile(organizationSlug, version, _file, name, dist, header);
        // TODO: test validations
    }

    /**
     * Upload a new project release file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadANewProjectReleaseFileTest() throws ApiException {
        //String organizationSlug = null;
        //String projectSlug = null;
        //String version = null;
        //File _file = null;
        //String name = null;
        //String dist = null;
        //String header = null;
        //ListAnOrganizationSReleaseFiles200ResponseInner response = api.uploadANewProjectReleaseFile(organizationSlug, projectSlug, version, _file, name, dist, header);
        // TODO: test validations
    }

}
