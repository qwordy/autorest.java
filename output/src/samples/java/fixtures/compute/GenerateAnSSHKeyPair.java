package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GenerateAnSSHKeyPair {
    public static void main(String[] args) {
        SshPublicKeysClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildSshPublicKeysClient();
        Response<BinaryData> response =
                client.generateKeyPairWithResponse("myResourceGroup", "mySshPublicKeyName", null, null);
    }
}
