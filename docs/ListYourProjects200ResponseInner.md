

# ListYourProjects200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avatar** | [**RetrieveATeam200ResponseAvatar**](RetrieveATeam200ResponseAvatar.md) |  |  |
|**color** | **String** |  |  |
|**dateCreated** | **OffsetDateTime** |  |  |
|**features** | **List&lt;String&gt;** |  |  |
|**firstEvent** | **String** |  |  |
|**hasAccess** | **Boolean** |  |  |
|**id** | **String** |  |  |
|**isBookmarked** | **Boolean** |  |  |
|**isInternal** | **Boolean** |  |  |
|**isMember** | **Boolean** |  |  |
|**isPublic** | **Boolean** |  |  |
|**name** | **String** |  |  |
|**organization** | [**RetrieveATeam200ResponseOrganization**](RetrieveATeam200ResponseOrganization.md) |  |  |
|**platform** | **String** |  |  |
|**slug** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DISABLED | &quot;disabled&quot; |
| PENDING_DELETION | &quot;pending_deletion&quot; |
| DELETION_IN_PROGRESS | &quot;deletion_in_progress&quot; |



