package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateOrUpdateADedicatedHostGroup {
    public static void main(String[] args) {
        DedicatedHostGroupsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildDedicatedHostGroupsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"platformFaultDomainCount\":3,\"supportAutomaticPlacement\":true},\"tags\":{\"department\":\"finance\"},\"zones\":[\"1\"]}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myDedicatedHostGroup", parameters, null, null);
    }
}
