

# RetrieveReleaseHealthSessionStatistics200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**start** | **OffsetDateTime** | The start time of the data being returned. |  |
|**end** | **OffsetDateTime** | The exclusive end time of the data being returned. |  |
|**intervals** | **List&lt;OffsetDateTime&gt;** | The time slices of the timeseries data given in the &#x60;groups[].series&#x60; field. |  |
|**groups** | [**List&lt;RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner&gt;**](RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner.md) |  |  |



