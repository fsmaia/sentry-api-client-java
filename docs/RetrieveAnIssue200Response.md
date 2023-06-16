

# RetrieveAnIssue200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activity** | [**List&lt;RetrieveAnIssue200ResponseActivityInner&gt;**](RetrieveAnIssue200ResponseActivityInner.md) |  |  |
|**annotations** | **List&lt;String&gt;** |  |  |
|**assignedTo** | **Object** |  |  |
|**count** | **String** |  |  |
|**culprit** | **String** |  |  |
|**firstRelease** | [**RetrieveAnIssue200ResponseFirstRelease**](RetrieveAnIssue200ResponseFirstRelease.md) |  |  |
|**firstSeen** | **String** |  |  |
|**hasSeen** | **Boolean** |  |  |
|**id** | **String** |  |  |
|**isBookmarked** | **Boolean** |  |  |
|**isPublic** | **Boolean** |  |  |
|**isSubscribed** | **Boolean** |  |  |
|**lastRelease** | **Object** |  |  |
|**lastSeen** | **String** |  |  |
|**level** | **String** |  |  |
|**logger** | **String** |  |  |
|**metadata** | [**ListAProjectSIssues200ResponseInnerMetadata**](ListAProjectSIssues200ResponseInnerMetadata.md) |  |  |
|**numComments** | **Integer** |  |  |
|**participants** | **List&lt;Object&gt;** |  |  |
|**permalink** | **String** |  |  |
|**pluginActions** | **List&lt;List&lt;String&gt;&gt;** |  |  |
|**pluginContexts** | **List&lt;String&gt;** |  |  |
|**pluginIssues** | **List&lt;Object&gt;** |  |  |
|**project** | [**ListAProjectSIssues200ResponseInnerProject**](ListAProjectSIssues200ResponseInnerProject.md) |  |  |
|**seenBy** | **List&lt;Object&gt;** |  |  |
|**shareId** | **String** |  |  |
|**shortId** | **String** |  |  |
|**stats** | [**RetrieveAnIssue200ResponseStats**](RetrieveAnIssue200ResponseStats.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**statusDetails** | **Object** |  |  |
|**subscriptionDetails** | **Object** |  |  |
|**tags** | **List&lt;Object&gt;** |  |  |
|**title** | **String** |  |  |
|**type** | **String** |  |  |
|**userCount** | **Integer** |  |  |
|**userReportCount** | **Integer** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RESOLVED | &quot;resolved&quot; |
| UNRESOLVED | &quot;unresolved&quot; |
| IGNORED | &quot;ignored&quot; |



