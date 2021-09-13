package fixtures.compute;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GetAVirtualMachineScaleSetWithUserData {
    public static void main(String[] args) {
        VirtualMachineScaleSetsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachineScaleSetsClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("expand", "userData");
        Response<BinaryData> response =
                client.getWithResponse("myResourceGroup", "myVirtualMachineScaleSet", requestOptions, null);
    }
}
