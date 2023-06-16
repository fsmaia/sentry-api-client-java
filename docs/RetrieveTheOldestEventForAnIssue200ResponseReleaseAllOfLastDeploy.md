

# RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy

## oneOf schemas
* [RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf](RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.sentry.api.client.model.RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf;
import com.sentry.api.client.model.String;

public class Example {
    public static void main(String[] args) {
        RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy exampleRetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy = new RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy();

        // create a new RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf
        RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf exampleRetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf = new RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf();
        // set RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy to RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf
        exampleRetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy.setActualInstance(exampleRetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf);
        // to get back the RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf set earlier
        RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf testRetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf = (RetrieveAnEventForAProject200ResponseReleaseAllOfLastDeployOneOf) exampleRetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set RetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy to String
        exampleRetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleRetrieveTheOldestEventForAnIssue200ResponseReleaseAllOfLastDeploy.getActualInstance();
    }
}
```


