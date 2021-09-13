package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetACapacityReservation {
    public static void main(String[] args) {
        CapacityReservationsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildCapacityReservationsClient();
        Response<BinaryData> response =
                client.getWithResponse(
                        "myResourceGroup", "myCapacityReservationGroup", "myCapacityReservation", null, null);
    }
}
