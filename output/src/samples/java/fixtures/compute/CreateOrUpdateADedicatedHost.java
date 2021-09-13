package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateOrUpdateADedicatedHost {
    public static void main(String[] args) {
        DedicatedHostsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildDedicatedHostsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"platformFaultDomain\":1},\"sku\":{\"name\":\"DSv3-Type1\"},\"tags\":{\"department\":\"HR\"}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse(
                        "myResourceGroup", "myDedicatedHostGroup", "myDedicatedHost", parameters, null, null);
    }
}
