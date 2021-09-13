package fixtures.compute;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class RetrieveBootDiagnosticsDataOfAVirtualMachine {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("sasUriExpirationTimeInMinutes", "60");
        Response<BinaryData> response =
                client.retrieveBootDiagnosticsDataWithResponse("ResourceGroup", "VMName", requestOptions, null);
    }
}
