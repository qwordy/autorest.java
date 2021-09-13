package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateOrUpdateACapacityReservation {
    public static void main(String[] args) {
        CapacityReservationsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildCapacityReservationsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"sku\":{\"name\":\"Standard_DS1_v2\",\"capacity\":4},\"tags\":{\"department\":\"HR\"},\"zones\":[\"1\"]}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse(
                        "myResourceGroup",
                        "myCapacityReservationGroup",
                        "myCapacityReservation",
                        parameters,
                        null,
                        null);
    }
}
