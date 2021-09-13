package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateAVmWithSshAuthentication {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"hardwareProfile\":{\"vmSize\":\"Standard_D1_v2\"},\"networkProfile\":{\"networkInterfaces\":[{\"id\":\"/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Network/networkInterfaces/{existing-nic-name}\",\"properties\":{\"primary\":true}}]},\"osProfile\":{\"adminUsername\":\"{your-username}\",\"computerName\":\"myVM\",\"linuxConfiguration\":{\"disablePasswordAuthentication\":true,\"ssh\":{\"publicKeys\":[{\"path\":\"/home/{your-username}/.ssh/authorized_keys\",\"keyData\":\"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCeClRAk2ipUs/l5voIsDC5q9RI+YSRd1Bvd/O+axgY4WiBzG+4FwJWZm/mLLe5DoOdHQwmU2FrKXZSW4w2sYE70KeWnrFViCOX5MTVvJgPE8ClugNl8RWth/tU849DvM9sT7vFgfVSHcAS2yDRyDlueii+8nF2ym8XWAPltFVCyLHRsyBp5YPqK8JFYIa1eybKsY3hEAxRCA+/7bq8et+Gj3coOsuRmrehav7rE6N12Pb80I6ofa6SM5XNYq4Xk0iYNx7R3kdz0Jj9XgZYWjAHjJmT0gTRoOnt6upOuxK7xI/ykWrllgpXrCPu3Ymz+c+ujaqcxDopnAl2lmf69/J1\"}]}}},\"storageProfile\":{\"imageReference\":{\"offer\":\"{image_offer}\",\"publisher\":\"{image_publisher}\",\"sku\":\"{image_sku}\",\"version\":\"latest\"},\"osDisk\":{\"name\":\"myVMosdisk\",\"caching\":\"ReadWrite\",\"createOption\":\"FromImage\",\"managedDisk\":{\"storageAccountType\":\"Standard_LRS\"}}}}}");
        Response<BinaryData> response =
                client.createOrUpdateWithResponse("myResourceGroup", "myVM", parameters, null, null);
    }
}
