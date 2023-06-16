

# RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner

A grouped result, as requested by the `groupBy` request parameter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**by** | [**RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy**](RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerBy.md) |  |  |
|**totals** | [**RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals**](RetrieveReleaseHealthSessionStatistics200ResponseGroupsInnerTotals.md) |  |  |
|**series** | **Map&lt;String, List&lt;Integer&gt;&gt;** | These are key/value pairs, the key being the requested &#x60;field&#x60;, and the value is an array of aggregated values. The array corresponds to the times given in the &#x60;intervals&#x60; array. |  |



