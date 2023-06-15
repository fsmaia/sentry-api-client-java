

# RetrieveReleaseHealthSessionStatistics200ResponseGroupsInner

A grouped result, as requested by the `groupBy` request parameter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**by** | **Object** | These are key/value pairs, the key being the requested &#x60;groupBy&#x60; property with its corresponding value. |  |
|**totals** | **Object** | These are key/value pairs, the key being the requested &#x60;field&#x60;, and the value the corresponding total over the requested time frame. |  |
|**series** | **Map&lt;String, List&lt;Integer&gt;&gt;** | These are key/value pairs, the key being the requested &#x60;field&#x60;, and the value is an array of aggregated values. The array corresponds to the times given in the &#x60;intervals&#x60; array. |  |


## Implemented Interfaces

* Serializable


