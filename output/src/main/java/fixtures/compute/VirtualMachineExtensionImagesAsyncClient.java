package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.VirtualMachineExtensionImagesImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class VirtualMachineExtensionImagesAsyncClient {
    private final VirtualMachineExtensionImagesImpl serviceClient;

    /**
     * Initializes an instance of VirtualMachineExtensionImages client.
     *
     * @param serviceClient the service client implementation.
     */
    VirtualMachineExtensionImagesAsyncClient(VirtualMachineExtensionImagesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets a virtual machine extension image.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     name: String
     *     type: String
     *     location: String
     *     tags: {
     *         String: String
     *     }
     *     properties: {
     *         operatingSystem: String
     *         computeRole: String
     *         handlerSchema: String
     *         vmScaleSetEnabled: Boolean
     *         supportsMultipleExtensions: Boolean
     *     }
     * }
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String location, String publisherName, String type, String version, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(location, publisherName, type, version, requestOptions);
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     {
     *         id: String
     *         name: String
     *         type: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         properties: {
     *             operatingSystem: String
     *             computeRole: String
     *             handlerSchema: String
     *             vmScaleSetEnabled: Boolean
     *             supportsMultipleExtensions: Boolean
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listTypesWithResponse(
            String location, String publisherName, RequestOptions requestOptions) {
        return this.serviceClient.listTypesWithResponseAsync(location, publisherName, requestOptions);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply on the operation.</td></tr>
     *     <tr><td>top</td><td>String</td><td>No</td><td>The top parameter</td></tr>
     *     <tr><td>orderby</td><td>String</td><td>No</td><td>The orderby parameter</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     {
     *         id: String
     *         name: String
     *         type: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         properties: {
     *             operatingSystem: String
     *             computeRole: String
     *             handlerSchema: String
     *             vmScaleSetEnabled: Boolean
     *             supportsMultipleExtensions: Boolean
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listVersionsWithResponse(
            String location, String publisherName, String type, RequestOptions requestOptions) {
        return this.serviceClient.listVersionsWithResponseAsync(location, publisherName, type, requestOptions);
    }
}
