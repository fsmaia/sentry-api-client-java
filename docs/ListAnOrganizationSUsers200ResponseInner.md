

# ListAnOrganizationSUsers200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateCreated** | **String** |  |  |
|**user** | [**ListAnOrganizationSUsers200ResponseInnerUser**](ListAnOrganizationSUsers200ResponseInnerUser.md) |  |  |
|**roleName** | **String** |  |  |
|**expired** | **Boolean** |  |  |
|**id** | **String** |  |  |
|**projects** | **List&lt;String&gt;** |  |  |
|**name** | **String** |  |  |
|**role** | [**RoleEnum**](#RoleEnum) |  |  |
|**flags** | [**ListAnOrganizationSUsers200ResponseInnerFlags**](ListAnOrganizationSUsers200ResponseInnerFlags.md) |  |  |
|**email** | **String** |  |  |
|**pending** | **Boolean** |  |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;owner&quot; |
| MANAGER | &quot;manager&quot; |
| ADMIN | &quot;admin&quot; |
| MEMBER | &quot;member&quot; |
| BILLING | &quot;billing&quot; |


## Implemented Interfaces

* Serializable


