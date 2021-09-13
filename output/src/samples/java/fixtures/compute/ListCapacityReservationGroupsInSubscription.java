package fixtures.compute;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ListCapacityReservationGroupsInSubscription {
    public static void main(String[] args) {
        CapacityReservationGroupsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildCapacityReservationGroupsClient();
        PagedIterable<BinaryData> response = client.listBySubscription(null);
    }
}
