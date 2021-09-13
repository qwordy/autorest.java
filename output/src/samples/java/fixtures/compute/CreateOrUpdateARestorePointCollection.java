package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateOrUpdateARestorePointCollection {
    public static void main(String[] args) {
        RestorePointCollectionsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildRestorePointCollectionsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"norwayeast\",\"properties\":{\"source\":{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM\"}},\"tags\":{\"myTag1\":\"tagValue1\"}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myRpc", parameters, null, null);
    }
}
