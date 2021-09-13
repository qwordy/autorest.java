package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVMWithUefiSettingsOfSecureBootAndVTPM {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"hardwareProfile\":{\"vmSize\":\"Standard_D2s_v3\"},\"networkProfile\":{\"networkInterfaces\":[{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}\",\"properties\":{\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerName\":\"myVM\"},\"securityProfile\":{\"securityType\":\"TrustedLaunch\",\"uefiSettings\":{\"secureBootEnabled\":true,\"vTpmEnabled\":true}},\"storageProfile\":{\"imageReference\":{\"offer\":\"windowsserver-gen2preview-preview\",\"publisher\":\"MicrosoftWindowsServer\",\"sku\":\"windows10-tvm\",\"version\":\"18363.592.2001092016\"},\"osDisk\":{\"name\":\"myVMosdisk\",\"caching\":\"ReadOnly\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"StandardSSD_LRS\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myVM", parameters, null, null);
    }
}
