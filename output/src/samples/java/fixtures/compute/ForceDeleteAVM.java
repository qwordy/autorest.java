package fixtures.compute;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ForceDeleteAVM {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("forceDeletion", "true");
        Response<Void> response = client.deleteWithResponse("myResourceGroup", "myVM", requestOptions, null);
    }
}
