package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.VirtualMachineExtensionsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class VirtualMachineExtensionsAsyncClient {
    private final VirtualMachineExtensionsImpl serviceClient;

    /**
     * Initializes an instance of VirtualMachineExtensions client.
     *
     * @param serviceClient the service client implementation.
     */
    VirtualMachineExtensionsAsyncClient(VirtualMachineExtensionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The operation to create or update the extension.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
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
     *         forceUpdateTag: String
     *         publisher: String
     *         type: String
     *         typeHandlerVersion: String
     *         autoUpgradeMinorVersion: Boolean
     *         enableAutomaticUpgrade: Boolean
     *         settings: Object
     *         protectedSettings: Object
     *         provisioningState: String
     *         instanceView: {
     *             name: String
     *             type: String
     *             typeHandlerVersion: String
     *             substatuses: [
     *                 {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *         suppressFailures: Boolean
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be created or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                resourceGroupName, vmName, vmExtensionName, extensionParameters, requestOptions);
    }

    /**
     * The operation to update the extension.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     tags: {
     *         String: String
     *     }
     *     properties: {
     *         forceUpdateTag: String
     *         publisher: String
     *         type: String
     *         typeHandlerVersion: String
     *         autoUpgradeMinorVersion: Boolean
     *         enableAutomaticUpgrade: Boolean
     *         settings: Object
     *         protectedSettings: Object
     *         suppressFailures: Boolean
     *     }
     * }
     * }</pre>
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
     *         forceUpdateTag: String
     *         publisher: String
     *         type: String
     *         typeHandlerVersion: String
     *         autoUpgradeMinorVersion: Boolean
     *         enableAutomaticUpgrade: Boolean
     *         settings: Object
     *         protectedSettings: Object
     *         provisioningState: String
     *         instanceView: {
     *             name: String
     *             type: String
     *             typeHandlerVersion: String
     *             substatuses: [
     *                 {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *         suppressFailures: Boolean
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Update Virtual Machine Extension operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponse(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(
                resourceGroupName, vmName, vmExtensionName, extensionParameters, requestOptions);
    }

    /**
     * The operation to delete the extension.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(
            String resourceGroupName, String vmName, String vmExtensionName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, vmName, vmExtensionName, requestOptions);
    }

    /**
     * The operation to get the extension.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
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
     *         forceUpdateTag: String
     *         publisher: String
     *         type: String
     *         typeHandlerVersion: String
     *         autoUpgradeMinorVersion: Boolean
     *         enableAutomaticUpgrade: Boolean
     *         settings: Object
     *         protectedSettings: Object
     *         provisioningState: String
     *         instanceView: {
     *             name: String
     *             type: String
     *             typeHandlerVersion: String
     *             substatuses: [
     *                 {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *         suppressFailures: Boolean
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String resourceGroupName, String vmName, String vmExtensionName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, vmName, vmExtensionName, requestOptions);
    }

    /**
     * The operation to get all extensions of a Virtual Machine.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             id: String
     *             name: String
     *             type: String
     *             location: String
     *             tags: {
     *                 String: String
     *             }
     *             properties: {
     *                 forceUpdateTag: String
     *                 publisher: String
     *                 type: String
     *                 typeHandlerVersion: String
     *                 autoUpgradeMinorVersion: Boolean
     *                 enableAutomaticUpgrade: Boolean
     *                 settings: Object
     *                 protectedSettings: Object
     *                 provisioningState: String
     *                 instanceView: {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Extension operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions) {
        return this.serviceClient.listWithResponseAsync(resourceGroupName, vmName, requestOptions);
    }
}
