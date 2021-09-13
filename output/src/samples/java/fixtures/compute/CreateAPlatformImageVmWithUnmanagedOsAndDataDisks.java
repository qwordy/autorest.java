package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAPlatformImageVmWithUnmanagedOsAndDataDisks {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"hardwareProfile\":{\"vmSize\":\"Standard_D2_v2\"},\"networkProfile\":{\"networkInterfaces\":[{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}\",\"properties\":{\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerName\":\"myVM\"},\"storageProfile\":{\"dataDisks\":[{\"createOption\":\"Empty\",\"diskSizeGB\":1023,\"lun\":0,\"vhd\":{\"uri\":\"http://{existing-storage-account-name}.blob.core.windows.net/{existing-container-name}/myDisk0.vhd\"}},{\"createOption\":\"Empty\",\"diskSizeGB\":1023,\"lun\":1,\"vhd\":{\"uri\":\"http://{existing-storage-account-name}.blob.core.windows.net/{existing-container-name}/myDisk1.vhd\"}}],\"imageReference\":{\"offer\":\"WindowsServer\",\"publisher\":\"MicrosoftWindowsServer\",\"sku\":\"2016-Datacenter\",\"version\":\"latest\"},\"osDisk\":{\"name\":\"myVMosdisk\",\"caching\":\"ReadWrite\",\"createOption\":\"FromImage\",\"vhd\":{\"uri\":\"http://{existing-storage-account-name}.blob.core.windows.net/{existing-container-name}/myDisk.vhd\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "{vm-name}", parameters, null, null);
    }
}
