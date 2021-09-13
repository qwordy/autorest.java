package fixtures.compute.implementation;

import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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

/** An instance of this class provides access to all the operations defined in VirtualMachineScaleSetRollingUpgrades. */
public final class VirtualMachineScaleSetRollingUpgradesImpl {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachineScaleSetRollingUpgradesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineScaleSetRollingUpgradesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineScaleSetRollingUpgradesImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(
                        VirtualMachineScaleSetRollingUpgradesService.class,
                        client.getHttpPipeline(),
                        client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineScaleSetRollingUpgrades to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineScaleSetRollingUpgradesService {
        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        Mono<Response<Void>> cancel(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        Mono<Response<Void>> startOSUpgrade(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensionRollingUpgrade")
        Mono<Response<Void>> startExtensionUpgrade(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/latest")
        Mono<Response<BinaryData>> getLatest(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.cancel(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.cancel(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return cancelWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image
     * OS version. Instances which are already running the latest available OS version are not affected.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startOSUpgradeWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.startOSUpgrade(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image
     * OS version. Instances which are already running the latest available OS version are not affected.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startOSUpgradeWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.startOSUpgrade(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image
     * OS version. Instances which are already running the latest available OS version are not affected.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> startOSUpgradeWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return startOSUpgradeWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest
     * available extension version. Instances which are already running the latest extension versions are not affected.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startExtensionUpgradeWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.startExtensionUpgrade(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest
     * available extension version. Instances which are already running the latest extension versions are not affected.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startExtensionUpgradeWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.startExtensionUpgrade(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest
     * available extension version. Instances which are already running the latest extension versions are not affected.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> startExtensionUpgradeWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return startExtensionUpgradeWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context)
                .block();
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
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
     *         policy: {
     *             maxBatchInstancePercent: Integer
     *             maxUnhealthyInstancePercent: Integer
     *             maxUnhealthyUpgradedInstancePercent: Integer
     *             pauseTimeBetweenBatches: String
     *             enableCrossZoneUpgrade: Boolean
     *             prioritizeUnhealthyInstances: Boolean
     *         }
     *         runningStatus: {
     *             code: String(RollingForward/Cancelled/Completed/Faulted)
     *             startTime: String
     *             lastAction: String(Start/Cancel)
     *             lastActionTime: String
     *         }
     *         progress: {
     *             successfulInstanceCount: Integer
     *             failedInstanceCount: Integer
     *             inProgressInstanceCount: Integer
     *             pendingInstanceCount: Integer
     *         }
     *         error: {
     *             details: [
     *                 {
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *             ]
     *             innererror: {
     *                 exceptiontype: String
     *                 errordetail: String
     *             }
     *             code: String
     *             target: String
     *             message: String
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of the latest virtual machine scale set rolling upgrade.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getLatestWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.getLatest(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
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
     *         policy: {
     *             maxBatchInstancePercent: Integer
     *             maxUnhealthyInstancePercent: Integer
     *             maxUnhealthyUpgradedInstancePercent: Integer
     *             pauseTimeBetweenBatches: String
     *             enableCrossZoneUpgrade: Boolean
     *             prioritizeUnhealthyInstances: Boolean
     *         }
     *         runningStatus: {
     *             code: String(RollingForward/Cancelled/Completed/Faulted)
     *             startTime: String
     *             lastAction: String(Start/Cancel)
     *             lastActionTime: String
     *         }
     *         progress: {
     *             successfulInstanceCount: Integer
     *             failedInstanceCount: Integer
     *             inProgressInstanceCount: Integer
     *             pendingInstanceCount: Integer
     *         }
     *         error: {
     *             details: [
     *                 {
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *             ]
     *             innererror: {
     *                 exceptiontype: String
     *                 errordetail: String
     *             }
     *             code: String
     *             target: String
     *             message: String
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of the latest virtual machine scale set rolling upgrade.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getLatestWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.getLatest(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
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
     *         policy: {
     *             maxBatchInstancePercent: Integer
     *             maxUnhealthyInstancePercent: Integer
     *             maxUnhealthyUpgradedInstancePercent: Integer
     *             pauseTimeBetweenBatches: String
     *             enableCrossZoneUpgrade: Boolean
     *             prioritizeUnhealthyInstances: Boolean
     *         }
     *         runningStatus: {
     *             code: String(RollingForward/Cancelled/Completed/Faulted)
     *             startTime: String
     *             lastAction: String(Start/Cancel)
     *             lastActionTime: String
     *         }
     *         progress: {
     *             successfulInstanceCount: Integer
     *             failedInstanceCount: Integer
     *             inProgressInstanceCount: Integer
     *             pendingInstanceCount: Integer
     *         }
     *         error: {
     *             details: [
     *                 {
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *             ]
     *             innererror: {
     *                 exceptiontype: String
     *                 errordetail: String
     *             }
     *             code: String
     *             target: String
     *             message: String
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of the latest virtual machine scale set rolling upgrade.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getLatestWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return getLatestWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }
}
