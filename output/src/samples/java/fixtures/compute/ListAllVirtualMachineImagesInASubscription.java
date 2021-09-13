package fixtures.compute;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ListAllVirtualMachineImagesInASubscription {
    public static void main(String[] args) {
        ImagesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildImagesClient();
        PagedIterable<BinaryData> response = client.list(null);
    }
}
