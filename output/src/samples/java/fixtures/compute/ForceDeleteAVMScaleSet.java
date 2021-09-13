package fixtures.compute;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ForceDeleteAVMScaleSet {
    public static void main(String[] args) {
        VirtualMachineScaleSetsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetsClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("forceDeletion", "true");
        Response<Void> response = client.deleteWithResponse("myResourceGroup", "myvmScaleSet", requestOptions, null);
    }
}
