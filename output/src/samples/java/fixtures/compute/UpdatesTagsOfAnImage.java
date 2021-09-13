package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class UpdatesTagsOfAnImage {
    public static void main(String[] args) {
        ImagesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildImagesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"properties\":{\"hyperVGeneration\":\"V1\",\"sourceVirtualMachine\":{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM\"}},\"tags\":{\"department\":\"HR\"}}");
        Response<BinaryData> response = client.updateWithResponse("myResourceGroup", "myImage", parameters, null, null);
    }
}
