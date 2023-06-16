

# ListAProjectSIssues200ResponseInnerMetadata

## oneOf schemas
* [ListAProjectSIssues200ResponseInnerMetadataOneOf](ListAProjectSIssues200ResponseInnerMetadataOneOf.md)
* [RetrieveAnEventForAProject200ResponseMetadataOneOf1](RetrieveAnEventForAProject200ResponseMetadataOneOf1.md)

## Example
```java
// Import classes:
import com.sentry.api.client.model.ListAProjectSIssues200ResponseInnerMetadata;
import com.sentry.api.client.model.ListAProjectSIssues200ResponseInnerMetadataOneOf;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseMetadataOneOf1;

public class Example {
    public static void main(String[] args) {
        ListAProjectSIssues200ResponseInnerMetadata exampleListAProjectSIssues200ResponseInnerMetadata = new ListAProjectSIssues200ResponseInnerMetadata();

        // create a new ListAProjectSIssues200ResponseInnerMetadataOneOf
        ListAProjectSIssues200ResponseInnerMetadataOneOf exampleListAProjectSIssues200ResponseInnerMetadataOneOf = new ListAProjectSIssues200ResponseInnerMetadataOneOf();
        // set ListAProjectSIssues200ResponseInnerMetadata to ListAProjectSIssues200ResponseInnerMetadataOneOf
        exampleListAProjectSIssues200ResponseInnerMetadata.setActualInstance(exampleListAProjectSIssues200ResponseInnerMetadataOneOf);
        // to get back the ListAProjectSIssues200ResponseInnerMetadataOneOf set earlier
        ListAProjectSIssues200ResponseInnerMetadataOneOf testListAProjectSIssues200ResponseInnerMetadataOneOf = (ListAProjectSIssues200ResponseInnerMetadataOneOf) exampleListAProjectSIssues200ResponseInnerMetadata.getActualInstance();

        // create a new RetrieveAnEventForAProject200ResponseMetadataOneOf1
        RetrieveAnEventForAProject200ResponseMetadataOneOf1 exampleRetrieveAnEventForAProject200ResponseMetadataOneOf1 = new RetrieveAnEventForAProject200ResponseMetadataOneOf1();
        // set ListAProjectSIssues200ResponseInnerMetadata to RetrieveAnEventForAProject200ResponseMetadataOneOf1
        exampleListAProjectSIssues200ResponseInnerMetadata.setActualInstance(exampleRetrieveAnEventForAProject200ResponseMetadataOneOf1);
        // to get back the RetrieveAnEventForAProject200ResponseMetadataOneOf1 set earlier
        RetrieveAnEventForAProject200ResponseMetadataOneOf1 testRetrieveAnEventForAProject200ResponseMetadataOneOf1 = (RetrieveAnEventForAProject200ResponseMetadataOneOf1) exampleListAProjectSIssues200ResponseInnerMetadata.getActualInstance();
    }
}
```


