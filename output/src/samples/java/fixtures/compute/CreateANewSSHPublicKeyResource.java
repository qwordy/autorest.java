package fixtures.compute;

import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateANewSSHPublicKeyResource {
    public static void main(String[] args) {
        SshPublicKeysClient client =
                new ComputeManagementClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildSshPublicKeysClient();
        BinaryData parameters =
                BinaryData.fromString(
                        "{\"location\":\"westus\",\"properties\":{\"publicKey\":\"{ssh-rsa public key}\"}}");
        Response<BinaryData> response =
                client.createWithResponse("myResourceGroup", "mySshPublicKeyName", parameters, null, null);
    }
}
