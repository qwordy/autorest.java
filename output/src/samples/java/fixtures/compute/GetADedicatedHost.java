package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetADedicatedHost {
    public static void main(String[] args) {
        DedicatedHostsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildDedicatedHostsClient();
        Response<BinaryData> response =
                client.getWithResponse("myResourceGroup", "myDedicatedHostGroup", "myHost", null, null);
    }
}
