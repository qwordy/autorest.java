package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ExportLogsWhichContainAllThrottledApiRequestsMadeToComputeResourceProviderWithinTheGivenTimePeriod {
    public static void main(String[] args) {
        LogAnalyticsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildLogAnalyticsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"blobContainerSasUri\":\"https://somesasuri\",\"fromTime\":\"2018-01-21T01:54:06.862601Z\",\"groupByClientApplicationId\":false,\"groupByOperationName\":true,\"groupByResourceName\":false,\"groupByUserAgent\":false,\"toTime\":\"2018-01-23T01:54:06.862601Z\"}");
        Response<BinaryData> response = client.exportThrottledRequestsWithResponse("westus", parameters, null, null);
    }
}
