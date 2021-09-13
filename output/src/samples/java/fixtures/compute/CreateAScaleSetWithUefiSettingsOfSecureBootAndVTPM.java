package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAScaleSetWithUefiSettingsOfSecureBootAndVTPM {
    public static void main(String[] args) {
        VirtualMachineScaleSetsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"overprovision\":true,\"upgradePolicy\":{\"mode\":\"Manual\"},\"virtualMachineProfile\":{\"networkProfile\":{\"networkInterfaceConfigurations\":[{\"name\":\"{vmss-name}\",\"properties\":{\"enableIPForwarding\":true,\"ipConfigurations\":[{\"name\":\"{vmss-name}\",\"properties\":{\"subnet\":{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/{existing-virtual-network-name}/subnets/{existing-subnet-name}\"}}}],\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerNamePrefix\":\"{vmss-name}\"},\"securityProfile\":{\"securityType\":\"TrustedLaunch\",\"uefiSettings\":{\"secureBootEnabled\":true,\"vTpmEnabled\":true}},\"storageProfile\":{\"imageReference\":{\"offer\":\"windowsserver-gen2preview-preview\",\"publisher\":\"MicrosoftWindowsServer\",\"sku\":\"windows10-tvm\",\"version\":\"18363.592.2001092016\"},\"osDisk\":{\"caching\":\"ReadOnly\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"StandardSSD_LRS\"}}}}},\"sku\":{\"name\":\"Standard_D2s_v3\",\"capacity\":3,\"tier\":\"Standard\"}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "{vmss-name}", parameters, null, null);
    }
}
