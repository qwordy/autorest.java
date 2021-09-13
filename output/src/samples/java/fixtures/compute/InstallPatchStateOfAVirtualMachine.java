package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class InstallPatchStateOfAVirtualMachine {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData installPatchesInput =
                BinaryData.fromString(
                        "{\"maximumDuration\":\"PT4H\",\"rebootSetting\":\"IfRequired\",\"windowsParameters\":{\"classificationsToInclude\":[\"Critical\",\"Security\"],\"maxPatchPublishDate\":\"2020-11-19T02:36:43.0539904+00:00\"}}");
        Response<BinaryData> response =
                client.installPatchesWithResponse("myResourceGroupName", "myVMName", installPatchesInput, null, null);
    }
}
