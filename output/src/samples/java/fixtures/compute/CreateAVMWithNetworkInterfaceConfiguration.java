package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVMWithNetworkInterfaceConfiguration {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"hardwareProfile\":{\"vmSize\":\"Standard_D1_v2\"},\"networkProfile\":{\"networkApiVersion\":\"2020-11-01\",\"networkInterfaceConfigurations\":[{\"name\":\"{nic-config-name}\",\"properties\":{\"deleteOption\":\"Delete\",\"ipConfigurations\":[{\"name\":\"{ip-config-name}\",\"properties\":{\"primary\":true,\"publicIPAddressConfiguration\":{\"name\":\"{publicIP-config-name}\",\"properties\":{\"deleteOption\":\"Detach\",\"publicIPAllocationMethod\":\"Static\"},\"sku\":{\"name\":\"Basic\",\"tier\":\"Global\"}}}}],\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerName\":\"myVM\"},\"storageProfile\":{\"imageReference\":{\"offer\":\"WindowsServer\",\"publisher\":\"MicrosoftWindowsServer\",\"sku\":\"2016-Datacenter\",\"version\":\"latest\"},\"osDisk\":{\"name\":\"myVMosdisk\",\"caching\":\"ReadWrite\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"Standard_LRS\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myVM", parameters, null, null);
    }
}
