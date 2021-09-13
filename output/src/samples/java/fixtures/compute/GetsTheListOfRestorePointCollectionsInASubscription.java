package fixtures.compute;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetsTheListOfRestorePointCollectionsInASubscription {
    public static void main(String[] args) {
        RestorePointCollectionsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildRestorePointCollectionsClient();
        PagedIterable<BinaryData> response = client.listAll(null);
    }
}
