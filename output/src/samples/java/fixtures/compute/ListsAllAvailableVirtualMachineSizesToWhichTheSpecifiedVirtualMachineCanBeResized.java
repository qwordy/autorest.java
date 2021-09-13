package fixtures.compute;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ListsAllAvailableVirtualMachineSizesToWhichTheSpecifiedVirtualMachineCanBeResized {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        PagedIterable<BinaryData> response = client.listAvailableSizes("myResourceGroup", "myVmName", null);
    }
}
