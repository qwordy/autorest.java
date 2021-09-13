package fixtures.compute;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetARestorePointCollectionIncludingTheRestorePointsContainedInTheRestorePointCollection {
    public static void main(String[] args) {
        RestorePointCollectionsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildRestorePointCollectionsClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("expand", "restorePoints");
        Response<BinaryData> response = client.getWithResponse("myResourceGroup", "rpcName", requestOptions, null);
    }
}
