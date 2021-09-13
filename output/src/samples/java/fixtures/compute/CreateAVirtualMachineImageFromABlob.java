package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVirtualMachineImageFromABlob {
    public static void main(String[] args) {
        ImagesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildImagesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"West US\",\"properties\":{\"storageProfile\":{\"osDisk\":{\"blobUri\":\"https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd\",\"osState\":\"Generalized\",\"osType\":\"Linux\"},\"zoneResilient\":true}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myImage", parameters, null, null);
    }
}
