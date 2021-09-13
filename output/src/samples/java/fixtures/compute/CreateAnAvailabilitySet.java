package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAnAvailabilitySet {
    public static void main(String[] args) {
        AvailabilitySetsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildAvailabilitySetsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"platformFaultDomainCount\":2,\"platformUpdateDomainCount\":20}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myAvailabilitySet", parameters, null, null);
    }
}
