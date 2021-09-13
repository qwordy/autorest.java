package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateARestorePoint {
    public static void main(String[] args) {
        RestorePointsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildRestorePointsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"properties\":{\"excludeDisks\":[{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/disk123\"}]}}");
        Response<BinaryData> response =
                client.createWithResponse("myResourceGroup", "rpcName", "rpName", parameters, null, null);
    }
}
