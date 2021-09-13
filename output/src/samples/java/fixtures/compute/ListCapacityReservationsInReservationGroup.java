package fixtures.compute;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ListCapacityReservationsInReservationGroup {
    public static void main(String[] args) {
        CapacityReservationsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildCapacityReservationsClient();
        PagedIterable<BinaryData> response =
                client.listByCapacityReservationGroup("myResourceGroup", "myCapacityReservationGroup", null);
    }
}
