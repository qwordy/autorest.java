package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateOrUpdateACapacityReservationGroup {
    public static void main(String[] args) {
        CapacityReservationGroupsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildCapacityReservationGroupsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"tags\":{\"department\":\"finance\"},\"zones\":[\"1\",\"2\"]}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse(
                        "myResourceGroup", "myCapacityReservationGroup", parameters, null, null);
    }
}
