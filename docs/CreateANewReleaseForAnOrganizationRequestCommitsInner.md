

# CreateANewReleaseForAnOrganizationRequestCommitsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patchSet** | [**List&lt;CreateANewReleaseForAnOrganizationRequestCommitsInnerPatchSetInner&gt;**](CreateANewReleaseForAnOrganizationRequestCommitsInnerPatchSetInner.md) | A list of the files that have been changed in the commit. Specifying the patch_set is necessary to power suspect commits and suggested assignees. |  [optional] |
|**repository** | **String** | The full name of the repository the commit belongs to. If this field is not given Sentry will generate a name in the form: u&#39;organization-&lt;organization_id&gt;&#39; (i.e. if the organization id is 123, then the generated repository name will be u&#39;organization-123). |  [optional] |
|**authorName** | **String** | The name of the commit author. |  [optional] |
|**authorEmail** | **String** | The email of the commit author. The commit author&#39;s email is required to enable the suggested assignee feature. |  [optional] |
|**timestamp** | **OffsetDateTime** | The commit timestamp is used to sort the commits given. If a timestamp is not included, the commits will remain sorted in the order given. |  [optional] |
|**message** | **String** | The commit message. |  [optional] |
|**id** | **String** | The commit ID (the commit SHA). |  [optional] |


## Implemented Interfaces

* Serializable


