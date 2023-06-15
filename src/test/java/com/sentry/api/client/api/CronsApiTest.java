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

import com.sentry.api.client.ApiException;
import com.sentry.api.client.model.CreateAMonitorRequest;
import com.sentry.api.client.model.CreateANewCheckInRequest;
import com.sentry.api.client.model.RetrieveCheckInsForAMonitor200ResponseInner;
import com.sentry.api.client.model.RetrieveMonitorsForAnOrganization200ResponseInner;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CronsApi
 */
@Disabled
public class CronsApiTest {

    private final CronsApi api = new CronsApi();

    /**
     * Create a new monitor.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAMonitorTest() throws ApiException {
        String organizationSlug = null;
        CreateAMonitorRequest createAMonitorRequest = null;
        RetrieveMonitorsForAnOrganization200ResponseInner response = api.createAMonitor(organizationSlug, createAMonitorRequest);
        // TODO: test validations
    }

    /**
     * Creates a new check-in for a monitor.  If &#x60;status&#x60; is not present, it will be assumed that the check-in is starting, and be marked as &#x60;in_progress&#x60;.  To achieve a ping-like behavior, you can simply define &#x60;status&#x60; and optionally &#x60;duration&#x60; and this check-in will be automatically marked as finished.  Note: If a DSN is utilized for authentication, the response will be limited in details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createANewCheckInTest() throws ApiException {
        String organizationSlug = null;
        String monitorSlug = null;
        CreateANewCheckInRequest createANewCheckInRequest = null;
        RetrieveCheckInsForAMonitor200ResponseInner response = api.createANewCheckIn(organizationSlug, monitorSlug, createANewCheckInRequest);
        // TODO: test validations
    }

    /**
     * Delete a monitor or monitor environments.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAMonitorOrMonitorEnvironmentsTest() throws ApiException {
        String organizationSlug = null;
        String monitorSlug = null;
        List<String> environment = null;
        api.deleteAMonitorOrMonitorEnvironments(organizationSlug, monitorSlug, environment);
        // TODO: test validations
    }

    /**
     * Retrieves details for a monitor.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveAMonitorTest() throws ApiException {
        String organizationSlug = null;
        String monitorSlug = null;
        List<String> environment = null;
        RetrieveMonitorsForAnOrganization200ResponseInner response = api.retrieveAMonitor(organizationSlug, monitorSlug, environment);
        // TODO: test validations
    }

    /**
     * Retrieve a list of check-ins for a monitor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveCheckInsForAMonitorTest() throws ApiException {
        String organizationSlug = null;
        String monitorSlug = null;
        UUID checkinId = null;
        List<RetrieveCheckInsForAMonitor200ResponseInner> response = api.retrieveCheckInsForAMonitor(organizationSlug, monitorSlug, checkinId);
        // TODO: test validations
    }

    /**
     * Lists monitors, including nested monitor enviroments. May be filtered to a project or environment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveMonitorsForAnOrganizationTest() throws ApiException {
        String organizationSlug = null;
        List<Integer> project = null;
        List<String> environment = null;
        List<RetrieveMonitorsForAnOrganization200ResponseInner> response = api.retrieveMonitorsForAnOrganization(organizationSlug, project, environment);
        // TODO: test validations
    }

    /**
     * Updates a check-in.  Once a check-in is finished (indicated via an &#x60;ok&#x60; or &#x60;error&#x60; status) it can no longer be changed.  If you simply wish to update that the task is still running, you can simply send an empty payload.  You may use &#x60;latest&#x60; for the &#x60;checkin_id&#x60; parameter in order to retrieve the most recent (by creation date) check-in which is still mutable (not marked as finished).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateACheckInTest() throws ApiException {
        String organizationSlug = null;
        String monitorSlug = null;
        UUID checkinId = null;
        CreateANewCheckInRequest createANewCheckInRequest = null;
        RetrieveCheckInsForAMonitor200ResponseInner response = api.updateACheckIn(organizationSlug, monitorSlug, checkinId, createANewCheckInRequest);
        // TODO: test validations
    }

    /**
     * Update a monitor.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAMonitorTest() throws ApiException {
        String organizationSlug = null;
        String monitorSlug = null;
        CreateAMonitorRequest createAMonitorRequest = null;
        RetrieveMonitorsForAnOrganization200ResponseInner response = api.updateAMonitor(organizationSlug, monitorSlug, createAMonitorRequest);
        // TODO: test validations
    }

}