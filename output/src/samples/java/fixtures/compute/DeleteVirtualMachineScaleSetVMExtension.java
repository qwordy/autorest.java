package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DeleteVirtualMachineScaleSetVMExtension {
    public static void main(String[] args) {
        VirtualMachineScaleSetVMExtensionsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetVMExtensionsClient();
        Response<Void> response =
                client.deleteWithResponse("myResourceGroup", "myvmScaleSet", "0", "myVMExtension", null, null);
    }
}
