

# CreateANewDeployForAnOrganizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environment** | **String** | The environment you&#39;re deploying to. |  |
|**url** | **String** | The optional URL that points to the deploy. |  [optional] |
|**name** | **String** | The optional name of the deploy. |  [optional] |
|**projects** | **List&lt;String&gt;** | The optional list of projects to deploy. |  [optional] |
|**dateStarted** | **OffsetDateTime** | An optional date that indicates when the deploy started. |  [optional] |
|**dateFinished** | **OffsetDateTime** | An optional date that indicates when the deploy ended. If not provided, the current time is used. |  [optional] |


## Implemented Interfaces

* Serializable


