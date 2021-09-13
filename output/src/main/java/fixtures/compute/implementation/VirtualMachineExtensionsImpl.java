package fixtures.compute.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachineExtensions. */
public final class VirtualMachineExtensionsImpl {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachineExtensionsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineExtensionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineExtensionsImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(
                        VirtualMachineExtensionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineExtensions to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineExtensionsService {
        @Put(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Mono<Response<BinaryData>> createOrUpdate(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmName") String vmName,
                @PathParam("vmExtensionName") String vmExtensionName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData extensionParameters,
                RequestOptions requestOptions,
                Context context);

        @Patch(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Mono<Response<BinaryData>> update(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmName") String vmName,
                @PathParam("vmExtensionName") String vmExtensionName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData extensionParameters,
                RequestOptions requestOptions,
                Context context);

        @Delete(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmName") String vmName,
                @PathParam("vmExtensionName") String vmExtensionName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmName") String vmName,
                @PathParam("vmExtensionName") String vmExtensionName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions")
        Mono<Response<BinaryData>> list(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmName") String vmName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);
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
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.createOrUpdate(
                                this.client.getHost(),
                                resourceGroupName,
                                vmName,
                                vmExtensionName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                extensionParameters,
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions,
            Context context) {
        return service.createOrUpdate(
                this.client.getHost(),
                resourceGroupName,
                vmName,
                vmExtensionName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                extensionParameters,
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions,
            Context context) {
        return createOrUpdateWithResponseAsync(
                        resourceGroupName, vmName, vmExtensionName, extensionParameters, requestOptions, context)
                .block();
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
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.update(
                                this.client.getHost(),
                                resourceGroupName,
                                vmName,
                                vmExtensionName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                extensionParameters,
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions,
            Context context) {
        return service.update(
                this.client.getHost(),
                resourceGroupName,
                vmName,
                vmExtensionName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                extensionParameters,
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            BinaryData extensionParameters,
            RequestOptions requestOptions,
            Context context) {
        return updateWithResponseAsync(
                        resourceGroupName, vmName, vmExtensionName, extensionParameters, requestOptions, context)
                .block();
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
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String vmName, String vmExtensionName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.delete(
                                this.client.getHost(),
                                resourceGroupName,
                                vmName,
                                vmExtensionName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            RequestOptions requestOptions,
            Context context) {
        return service.delete(
                this.client.getHost(),
                resourceGroupName,
                vmName,
                vmExtensionName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            RequestOptions requestOptions,
            Context context) {
        return deleteWithResponseAsync(resourceGroupName, vmName, vmExtensionName, requestOptions, context).block();
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
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String vmName, String vmExtensionName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                resourceGroupName,
                                vmName,
                                vmExtensionName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            RequestOptions requestOptions,
            Context context) {
        return service.get(
                this.client.getHost(),
                resourceGroupName,
                vmName,
                vmExtensionName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName,
            String vmName,
            String vmExtensionName,
            RequestOptions requestOptions,
            Context context) {
        return getWithResponseAsync(resourceGroupName, vmName, vmExtensionName, requestOptions, context).block();
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
    public Mono<Response<BinaryData>> listWithResponseAsync(
            String resourceGroupName, String vmName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.list(
                                this.client.getHost(),
                                resourceGroupName,
                                vmName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Extension operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listWithResponseAsync(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return service.list(
                this.client.getHost(),
                resourceGroupName,
                vmName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Extension operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return listWithResponseAsync(resourceGroupName, vmName, requestOptions, context).block();
    }
}
