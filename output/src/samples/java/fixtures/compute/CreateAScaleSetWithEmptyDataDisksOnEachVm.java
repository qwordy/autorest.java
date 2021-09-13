package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAScaleSetWithEmptyDataDisksOnEachVm {
    public static void main(String[] args) {
        VirtualMachineScaleSetsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"overprovision\":true,\"upgradePolicy\":{\"mode\":\"Manual\"},\"virtualMachineProfile\":{\"networkProfile\":{\"networkInterfaceConfigurations\":[{\"name\":\"{vmss-name}\",\"properties\":{\"enableIPForwarding\":true,\"ipConfigurations\":[{\"name\":\"{vmss-name}\",\"properties\":{\"subnet\":{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/{existing-virtual-network-name}/subnets/{existing-subnet-name}\"}}}],\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerNamePrefix\":\"{vmss-name}\"},\"storageProfile\":{\"dataDisks\":[{\"createOption\":\"Empty\",\"diskSizeGB\":1023,\"lun\":0},{\"createOption\":\"Empty\",\"diskSizeGB\":1023,\"lun\":1}],\"imageReference\":{\"offer\":\"WindowsServer\",\"publisher\":\"MicrosoftWindowsServer\",\"sku\":\"2016-Datacenter\",\"version\":\"latest\"},\"osDisk\":{\"caching\":\"ReadWrite\",\"createOption\":\"FromImage\",\"diskSizeGB\":512,\"managedDisk\":{\"storageAccountType\":\"Standard_LRS\"}}}}},\"sku\":{\"name\":\"Standard_D2_v2\",\"capacity\":3,\"tier\":\"Standard\"}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "{vmss-name}", parameters, null, null);
    }
}
