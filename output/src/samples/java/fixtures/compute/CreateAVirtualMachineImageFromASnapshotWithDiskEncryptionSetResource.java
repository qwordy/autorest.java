package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVirtualMachineImageFromASnapshotWithDiskEncryptionSetResource {
    public static void main(String[] args) {
        ImagesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildImagesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"West US\",\"properties\":{\"storageProfile\":{\"osDisk\":{\"diskEncryptionSet\":{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}\"},\"osState\":\"Generalized\",\"osType\":\"Linux\",\"snapshot\":{\"id\":\"subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myImage", parameters, null, null);
    }
}
