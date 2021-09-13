package fixtures.compute;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateADedicatedHostGroup {
    public static void main(String[] args) {
        DedicatedHostGroupsClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildDedicatedHostGroupsClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("expand", "instanceView");
        Response<BinaryData> response =
                client.getWithResponse("myResourceGroup", "myDedicatedHostGroup", requestOptions, null);
    }
}
