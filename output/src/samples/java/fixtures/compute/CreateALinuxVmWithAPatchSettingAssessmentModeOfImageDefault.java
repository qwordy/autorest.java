package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateALinuxVmWithAPatchSettingAssessmentModeOfImageDefault {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"hardwareProfile\":{\"vmSize\":\"Standard_D2s_v3\"},\"networkProfile\":{\"networkInterfaces\":[{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}\",\"properties\":{\"primary\":true}}]},\"osProfile\":{\"adminPassword\":\"{your-password}\",\"adminUsername\":\"{your-username}\",\"computerName\":\"myVM\",\"linuxConfiguration\":{\"patchSettings\":{\"assessmentMode\":\"ImageDefault\"},\"provisionVMAgent\":true}},\"storageProfile\":{\"imageReference\":{\"offer\":\"UbuntuServer\",\"publisher\":\"Canonical\",\"sku\":\"16.04-LTS\",\"version\":\"latest\"},\"osDisk\":{\"name\":\"myVMosdisk\",\"caching\":\"ReadWrite\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"Premium_LRS\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myVM", parameters, null, null);
    }
}
