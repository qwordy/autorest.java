package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAProximityPlacementGroup {
    public static void main(String[] args) {
        ProximityPlacementGroupsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildProximityPlacementGroupsClient();
        BinaryData parameters = BinaryData.fromString("{\"tags\":{\"additionalProp1\":\"string\"}}");
        Response<BinaryData> response =
                client.updateWithResponse("myResourceGroup", "myProximityPlacementGroup", parameters, null, null);
    }
}
