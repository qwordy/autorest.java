package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVMWithHibernationEnabled {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"eastus2euap\",\"properties\":{\"additionalCapabilities\":{\"hibernationEnabled\":true},\"diagnosticsProfile\":{\"bootDiagnostics\":{\"enabled\":true,\"storageUri\":\"http://{existing-storage-account-name}.blob.core.windows.net\"}},\"hardwareProfile\":{\"vmSize\":\"Standard_D2s_v3\"},\"networkProfile\":{\"networkInterfaces\":[{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}\",\"properties\":{\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerName\":\"{vm-name}\"},\"storageProfile\":{\"imageReference\":{\"offer\":\"WindowsServer\",\"publisher\":\"MicrosoftWindowsServer\",\"sku\":\"2019-Datacenter\",\"version\":\"latest\"},\"osDisk\":{\"name\":\"vmOSdisk\",\"caching\":\"ReadWrite\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"Standard_LRS\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "{vm-name}", parameters, null, null);
    }
}
