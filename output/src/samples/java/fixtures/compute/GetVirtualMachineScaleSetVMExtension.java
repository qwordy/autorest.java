package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetVirtualMachineScaleSetVMExtension {
    public static void main(String[] args) {
        VirtualMachineScaleSetVMExtensionsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetVMExtensionsClient();
        Response<BinaryData> response =
                client.getWithResponse("myResourceGroup", "myvmScaleSet", "0", "myVMExtension", null, null);
    }
}
