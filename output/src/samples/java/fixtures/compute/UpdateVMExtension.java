package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class UpdateVMExtension {
    public static void main(String[] args) {
        VirtualMachineExtensionsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineExtensionsClient();
        BinaryData extensionParameters =
                BinaryData.fromString(
                        "{\"properties\":{\"type\":\"extType\",\"autoUpgradeMinorVersion\":true,\"publisher\":\"extPublisher\",\"settings\":{\"UserName\":\"xyz@microsoft.com\"},\"suppressFailures\":true,\"typeHandlerVersion\":\"1.2\"}}");
        Response<BinaryData> response =
                client.updateWithResponse("myResourceGroup", "myVM", "myVMExtension", extensionParameters, null, null);
    }
}
