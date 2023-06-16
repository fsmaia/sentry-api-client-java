

# CreateANewCheckInRequestMonitorConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | Currently supports \&quot;crontab\&quot; or \&quot;interval\&quot; |  [optional] |
|**schedule** | **Object** | Varies depending on the schedule_type. Is either a crontab string, or a 2 element tuple for intervals (e.g. [1, &#39;day&#39;]) |  |
|**checkinMargin** | **Integer** | How long (in minutes) after the expected checkin time will we wait until we consider the checkin to have been missed. |  [optional] |
|**maxRuntime** | **Integer** | How long (in minutes) is the checkin allowed to run for in CheckInStatus.IN_PROGRESS before it is considered failed. |  [optional] |
|**timezone** | **String** | tz database style timezone string |  [optional] |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| CRONTAB | &quot;crontab&quot; |
| INTERVAL | &quot;interval&quot; |



