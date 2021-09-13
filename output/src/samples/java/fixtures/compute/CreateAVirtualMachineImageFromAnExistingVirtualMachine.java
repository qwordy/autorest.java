package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVirtualMachineImageFromAnExistingVirtualMachine {
    public static void main(String[] args) {
        ImagesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildImagesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"West US\",\"properties\":{\"sourceVirtualMachine\":{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM\"}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myImage", parameters, null, null);
    }
}
