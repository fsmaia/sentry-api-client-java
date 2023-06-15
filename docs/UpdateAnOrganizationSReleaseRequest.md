

# UpdateAnOrganizationSReleaseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ref** | **String** | An optional commit reference. This is useful if a tagged version has been provided. |  [optional] |
|**url** | **String** | A URL that points to the release. This can be the path to an online interface to the source code for instance. |  [optional] |
|**dateReleased** | **OffsetDateTime** | An optional date that indicates when the release went live. If not provided the current time is assumed. |  [optional] |
|**commits** | **List&lt;Object&gt;** | An optional list of commit data to be associated with the release. Commits must include parameters &#x60;id&#x60; (the sha of the commit), and can optionally include &#x60;repository&#x60;, &#x60;message&#x60;, &#x60;author_name&#x60;, &#x60;author_email&#x60;, and &#x60;timestamp&#x60;. |  [optional] |
|**refs** | **List&lt;Object&gt;** | An optional way to indicate the start and end commits for each repository included in a release. Head commits must include parameters &#x60;repository&#x60; and &#x60;commit&#x60; (the HEAD sha). They can optionally include &#x60;previousCommit&#x60; (the sha of the HEAD of the previous release), which should be specified if this is the first time you&#39;ve sent commit data. |  [optional] |


## Implemented Interfaces

* Serializable


