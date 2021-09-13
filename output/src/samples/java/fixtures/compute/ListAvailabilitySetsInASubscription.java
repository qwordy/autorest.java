package fixtures.compute;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ListAvailabilitySetsInASubscription {
    public static void main(String[] args) {
        AvailabilitySetsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildAvailabilitySetsClient();
        PagedIterable<BinaryData> response = client.listBySubscription(null);
    }
}
