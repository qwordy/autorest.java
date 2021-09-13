package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVirtualMachineImageThatIncludesADataDiskFromASnapshot {
    public static void main(String[] args) {
        ImagesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildImagesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"West US\",\"properties\":{\"storageProfile\":{\"dataDisks\":[{\"lun\":1,\"snapshot\":{\"id\":\"subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot2\"}}],\"osDisk\":{\"osState\":\"Generalized\",\"osType\":\"Linux\",\"snapshot\":{\"id\":\"subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot\"}},\"zoneResilient\":true}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myImage", parameters, null, null);
    }
}
