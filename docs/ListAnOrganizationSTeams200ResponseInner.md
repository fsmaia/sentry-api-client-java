

# ListAnOrganizationSTeams200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalTeams** | [**List&lt;RetrieveAnOrganizationMember200ResponseExternalUsersInner&gt;**](RetrieveAnOrganizationMember200ResponseExternalUsersInner.md) |  |  [optional] |
|**organization** | [**ListAnOrganizationSTeams200ResponseInnerOrganization**](ListAnOrganizationSTeams200ResponseInnerOrganization.md) |  |  [optional] |
|**projects** | [**List&lt;RetrieveMonitorsForAnOrganization200ResponseInnerProject&gt;**](RetrieveMonitorsForAnOrganization200ResponseInnerProject.md) |  |  [optional] |
|**id** | **String** |  |  |
|**slug** | **String** |  |  |
|**name** | **String** |  |  |
|**dateCreated** | **OffsetDateTime** |  |  |
|**isMember** | **Boolean** |  |  |
|**teamRole** | **String** |  |  |
|**flags** | **Map&lt;String, Object&gt;** |  |  |
|**access** | **List&lt;String&gt;** |  |  |
|**hasAccess** | **Boolean** |  |  |
|**isPending** | **Boolean** |  |  |
|**memberCount** | **Integer** |  |  |
|**avatar** | [**RetrieveAnOrganizationMember200ResponseUserAvatar**](RetrieveAnOrganizationMember200ResponseUserAvatar.md) |  |  |
|**orgRole** | **String** |  |  |


## Implemented Interfaces

* Serializable


