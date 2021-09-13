package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetARestorePointCollectionButNotTheRestorePointsContainedInTheRestorePointCollection {
    public static void main(String[] args) {
        RestorePointCollectionsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildRestorePointCollectionsClient();
        Response<BinaryData> response = client.getWithResponse("myResourceGroup", "myRpc", null, null);
    }
}
