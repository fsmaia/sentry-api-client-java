

# CreateAMonitorRequest

Allows parameters to be defined in snake case, but passed as camel case.  Errors are output in camel case.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**project** | **String** |  |  |
|**name** | **String** |  |  |
|**slug** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**config** | [**CreateANewCheckInRequestMonitorConfig**](CreateANewCheckInRequestMonitorConfig.md) |  |  |
|**alertRule** | [**CreateAMonitorRequestAlertRule**](CreateAMonitorRequestAlertRule.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DISABLED | &quot;disabled&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CRON_JOB | &quot;cron_job&quot; |


## Implemented Interfaces

* Serializable


