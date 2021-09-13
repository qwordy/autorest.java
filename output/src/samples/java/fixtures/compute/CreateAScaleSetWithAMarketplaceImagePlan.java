package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAScaleSetWithAMarketplaceImagePlan {
    public static void main(String[] args) {
        VirtualMachineScaleSetsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetsClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"plan\":{\"name\":\"windows2016\",\"product\":\"windows-data-science-vm\",\"publisher\":\"microsoft-ads\"},\"properties\":{\"overprovision\":true,\"upgradePolicy\":{\"mode\":\"Manual\"},\"virtualMachineProfile\":{\"networkProfile\":{\"networkInterfaceConfigurations\":[{\"name\":\"{vmss-name}\",\"properties\":{\"enableIPForwarding\":true,\"ipConfigurations\":[{\"name\":\"{vmss-name}\",\"properties\":{\"subnet\":{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/{existing-virtual-network-name}/subnets/{existing-subnet-name}\"}}}],\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerNamePrefix\":\"{vmss-name}\"},\"storageProfile\":{\"imageReference\":{\"offer\":\"windows-data-science-vm\",\"publisher\":\"microsoft-ads\",\"sku\":\"windows2016\",\"version\":\"latest\"},\"osDisk\":{\"caching\":\"ReadWrite\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"Standard_LRS\"}}}}},\"sku\":{\"name\":\"Standard_D1_v2\",\"capacity\":3,\"tier\":\"Standard\"}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "{vmss-name}", parameters, null, null);
    }
}
