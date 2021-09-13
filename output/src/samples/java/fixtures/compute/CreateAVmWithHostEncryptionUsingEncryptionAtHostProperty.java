package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVmWithHostEncryptionUsingEncryptionAtHostProperty {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"plan\":{\"name\":\"windows2016\",\"product\":\"windows-data-science-vm\",\"publisher\":\"microsoft-ads\"},\"properties\":{\"hardwareProfile\":{\"vmSize\":\"Standard_DS1_v2\"},\"networkProfile\":{\"networkInterfaces\":[{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}\",\"properties\":{\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerName\":\"myVM\"},\"securityProfile\":{\"encryptionAtHost\":true},\"storageProfile\":{\"imageReference\":{\"offer\":\"windows-data-science-vm\",\"publisher\":\"microsoft-ads\",\"sku\":\"windows2016\",\"version\":\"latest\"},\"osDisk\":{\"name\":\"myVMosdisk\",\"caching\":\"ReadOnly\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"Standard_LRS\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myVM", parameters, null, null);
    }
}
