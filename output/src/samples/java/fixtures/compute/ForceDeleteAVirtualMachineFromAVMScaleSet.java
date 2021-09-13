package fixtures.compute;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ForceDeleteAVirtualMachineFromAVMScaleSet {
    public static void main(String[] args) {
        VirtualMachineScaleSetVMsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetVMsClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("forceDeletion", "true");
        Response<Void> response =
                client.deleteWithResponse("myResourceGroup", "myvmScaleSet", "0", requestOptions, null);
    }
}
