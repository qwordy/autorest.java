package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVmWithManagedBootDiagnostics {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"diagnosticsProfile\":{\"bootDiagnostics\":{\"enabled\":true}},\"hardwareProfile\":{\"vmSize\":\"Standard_D1_v2\"},\"networkProfile\":{\"networkInterfaces\":[{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}\",\"properties\":{\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerName\":\"myVM\"},\"storageProfile\":{\"imageReference\":{\"offer\":\"WindowsServer\",\"publisher\":\"MicrosoftWindowsServer\",\"sku\":\"2016-Datacenter\",\"version\":\"latest\"},\"osDisk\":{\"name\":\"myVMosdisk\",\"caching\":\"ReadWrite\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"Standard_LRS\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myVM", parameters, null, null);
    }
}
