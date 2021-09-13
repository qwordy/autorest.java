package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class UpdateVirtualMachineScaleSetVMExtension {
    public static void main(String[] args) {
        VirtualMachineScaleSetVMExtensionsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetVMExtensionsClient();
        BinaryData extensionParameters =
                BinaryData.fromString(
                        "{\"properties\":{\"type\":\"extType\",\"autoUpgradeMinorVersion\":true,\"publisher\":\"extPublisher\",\"settings\":{\"UserName\":\"xyz@microsoft.com\"},\"typeHandlerVersion\":\"1.2\"}}");
        Response<BinaryData> response =
                client.updateWithResponse(
                        "myResourceGroup", "myvmScaleSet", "0", "myVMExtension", extensionParameters, null, null);
    }
}
