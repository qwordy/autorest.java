package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ReapplyTheStateOfAVirtualMachine {
    public static void main(String[] args) {
        VirtualMachinesClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildVirtualMachinesClient();
        Response<Void> response = client.reapplyWithResponse("ResourceGroup", "VMName", null, null);
    }
}
