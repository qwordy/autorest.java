package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetInstanceViewOfAVirtualMachineFromAVMScaleSetPlacedOnADedicatedHostGroupThroughAutomaticPlacement {
    public static void main(String[] args) {
        VirtualMachineScaleSetVMsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetVMsClient();
        Response<BinaryData> response =
                client.getInstanceViewWithResponse("myResourceGroup", "myVirtualMachineScaleSet", "0", null, null);
    }
}
