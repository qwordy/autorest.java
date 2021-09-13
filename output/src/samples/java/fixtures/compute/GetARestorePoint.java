package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetARestorePoint {
    public static void main(String[] args) {
        RestorePointsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildRestorePointsClient();
        Response<BinaryData> response = client.getWithResponse("myResourceGroup", "rpcName", "rpName", null, null);
    }
}
