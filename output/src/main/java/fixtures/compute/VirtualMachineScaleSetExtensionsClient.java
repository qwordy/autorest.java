package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.compute.implementation.VirtualMachineScaleSetExtensionsImpl;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class VirtualMachineScaleSetExtensionsClient {
    private final VirtualMachineScaleSetExtensionsImpl serviceClient;

    /**
     * Initializes an instance of VirtualMachineScaleSetExtensions client.
     *
     * @param serviceClient the service client implementation.
     */
    VirtualMachineScaleSetExtensionsClient(VirtualMachineScaleSetExtensionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The operation to create or update an extension.
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
     *         provisionAfterExtensions: [
     *             String
     *         ]
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
     * @param vmScaleSetName The name of the VM scale set where the extension should be create or updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Create VM scale set Extension operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String vmssExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.createOrUpdateWithResponse(
                resourceGroupName, vmScaleSetName, vmssExtensionName, extensionParameters, requestOptions, context);
    }

    /**
     * The operation to update an extension.
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
     *         provisionAfterExtensions: [
     *             String
     *         ]
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
     *     properties: (recursive schema, see properties above)
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set where the extension should be updated.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param extensionParameters Parameters supplied to the Update VM scale set Extension operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String vmssExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.updateWithResponse(
                resourceGroupName, vmScaleSetName, vmssExtensionName, extensionParameters, requestOptions, context);
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
     * @param vmScaleSetName The name of the VM scale set where the extension should be deleted.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String vmssExtensionName,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.deleteWithResponse(
                resourceGroupName, vmScaleSetName, vmssExtensionName, requestOptions, context);
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
     *         provisionAfterExtensions: [
     *             String
     *         ]
     *         suppressFailures: Boolean
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @param vmssExtensionName The name of the VM scale set extension.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String vmssExtensionName,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.getWithResponse(
                resourceGroupName, vmScaleSetName, vmssExtensionName, requestOptions, context);
    }

    /**
     * Gets a list of all extensions in a VM scale set.
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
     *     value: [
     *         {
     *             id: String
     *             name: String
     *             type: String
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
     *                 provisionAfterExtensions: [
     *                     String
     *                 ]
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all extensions in a VM scale set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.list(resourceGroupName, vmScaleSetName, requestOptions);
    }

    /**
     * Gets a list of all extensions in a VM scale set.
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
     *     value: [
     *         {
     *             id: String
     *             name: String
     *             type: String
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
     *                 provisionAfterExtensions: [
     *                     String
     *                 ]
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set containing the extension.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all extensions in a VM scale set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.list(resourceGroupName, vmScaleSetName, requestOptions, context);
    }
}
