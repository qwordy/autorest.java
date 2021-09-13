package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class StartAnExtensionRollingUpgrade {
    public static void main(String[] args) {
        VirtualMachineScaleSetRollingUpgradesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetRollingUpgradesClient();
        Response<Void> response =
                client.startExtensionUpgradeWithResponse("myResourceGroup", "{vmss-name}", null, null);
    }
}
