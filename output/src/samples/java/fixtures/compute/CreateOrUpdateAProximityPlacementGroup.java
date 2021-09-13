package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateOrUpdateAProximityPlacementGroup {
    public static void main(String[] args) {
        ProximityPlacementGroupsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildProximityPlacementGroupsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"proximityPlacementGroupType\":\"Standard\"}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse(
                        "myResourceGroup", "myProximityPlacementGroup", parameters, null, null);
    }
}
