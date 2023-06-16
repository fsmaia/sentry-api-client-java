

# UpdateAnIssueRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | The new status for the issues. Valid values are &#x60;\&quot;resolved\&quot;&#x60;, &#x60;\&quot;resolvedInNextRelease\&quot;&#x60;, &#x60;\&quot;unresolved\&quot;&#x60;, and &#x60;\&quot;ignored\&quot;&#x60;. |  [optional] |
|**assignedTo** | **String** | The actor id (or username) of the user or team that should be assigned to this issue. |  [optional] |
|**hasSeen** | **Boolean** | In case this API call is invoked with a user context this allows changing of the flag that indicates if the user has seen the event. |  [optional] |
|**isBookmarked** | **Boolean** | In case this API call is invoked with a user context this allows changing of the bookmark flag. |  [optional] |
|**isSubscribed** | **Boolean** |  |  [optional] |
|**isPublic** | **Boolean** | Sets the issue to public or private. |  [optional] |



