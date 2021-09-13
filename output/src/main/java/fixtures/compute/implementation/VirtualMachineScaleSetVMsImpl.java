package fixtures.compute.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachineScaleSetVMs. */
public final class VirtualMachineScaleSetVMsImpl {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachineScaleSetVMsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineScaleSetVMsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineScaleSetVMsImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(
                        VirtualMachineScaleSetVMsService.class,
                        client.getHttpPipeline(),
                        client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineScaleSetVMs to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineScaleSetVMsService {
        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/reimage")
        Mono<Response<Void>> reimage(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/reimageall")
        Mono<Response<Void>> reimageAll(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/deallocate")
        Mono<Response<Void>> deallocate(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Put(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}")
        Mono<Response<BinaryData>> update(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Delete(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}")
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/instanceView")
        Mono<Response<BinaryData>> getInstanceView(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{virtualMachineScaleSetName}/virtualMachines")
        Mono<Response<BinaryData>> list(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("virtualMachineScaleSetName") String virtualMachineScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/poweroff")
        Mono<Response<Void>> powerOff(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/restart")
        Mono<Response<Void>> restart(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/start")
        Mono<Response<Void>> start(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/redeploy")
        Mono<Response<Void>> redeploy(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/retrieveBootDiagnosticsData")
        Mono<Response<BinaryData>> retrieveBootDiagnosticsData(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/performMaintenance")
        Mono<Response<Void>> performMaintenance(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualMachines/{instanceId}/simulateEviction")
        Mono<Response<Void>> simulateEviction(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @PathParam("instanceId") String instanceId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Reimages (upgrade the operating system) a specific virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reimageWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.reimage(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Reimages (upgrade the operating system) a specific virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reimageWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.reimage(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Reimages (upgrade the operating system) a specific virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> reimageWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return reimageWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context).block();
    }

    /**
     * Allows you to re-image all the disks ( including data disks ) in the a VM scale set instance. This operation is
     * only supported for managed disks.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reimageAllWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.reimageAll(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Allows you to re-image all the disks ( including data disks ) in the a VM scale set instance. This operation is
     * only supported for managed disks.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reimageAllWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.reimageAll(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Allows you to re-image all the disks ( including data disks ) in the a VM scale set instance. This operation is
     * only supported for managed disks.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> reimageAllWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return reimageAllWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context)
                .block();
    }

    /**
     * Deallocates a specific virtual machine in a VM scale set. Shuts down the virtual machine and releases the compute
     * resources it uses. You are not billed for the compute resources of this virtual machine once it is deallocated.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deallocateWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.deallocate(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Deallocates a specific virtual machine in a VM scale set. Shuts down the virtual machine and releases the compute
     * resources it uses. You are not billed for the compute resources of this virtual machine once it is deallocated.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deallocateWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.deallocate(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Deallocates a specific virtual machine in a VM scale set. Shuts down the virtual machine and releases the compute
     * resources it uses. You are not billed for the compute resources of this virtual machine once it is deallocated.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deallocateWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return deallocateWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context)
                .block();
    }

    /**
     * Updates a virtual machine of a VM scale set.
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
     *     instanceId: String
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     properties: {
     *         latestModelApplied: Boolean
     *         vmId: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             assignedHost: String
     *             placementGroupId: String
     *         }
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: (recursive schema, see encryptionSettings above)
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         networkProfileConfiguration: {
     *             networkInterfaceConfigurations: [
     *                 {
     *                     id: String
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     subnet: {
     *                                         id: String
     *                                     }
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             deleteOption: String(Delete/Detach)
     *                                         }
     *                                         sku: (recursive schema, see sku above)
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerInboundNatPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         enableIPForwarding: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         provisioningState: String
     *         licenseType: String
     *         modelDefinitionApplied: String
     *         protectionPolicy: {
     *             protectFromScaleIn: Boolean
     *             protectFromScaleSetActions: Boolean
     *         }
     *         userData: String
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     resources: [
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
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     *     zones: [
     *         String
     *     ]
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
     * @param instanceId The instance ID of the virtual machine.
     * @param parameters Parameters supplied to the Update Virtual Machine Scale Sets VM operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a virtual machine scale set virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.update(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Updates a virtual machine of a VM scale set.
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
     *     instanceId: String
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     properties: {
     *         latestModelApplied: Boolean
     *         vmId: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             assignedHost: String
     *             placementGroupId: String
     *         }
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: (recursive schema, see encryptionSettings above)
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         networkProfileConfiguration: {
     *             networkInterfaceConfigurations: [
     *                 {
     *                     id: String
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     subnet: {
     *                                         id: String
     *                                     }
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             deleteOption: String(Delete/Detach)
     *                                         }
     *                                         sku: (recursive schema, see sku above)
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerInboundNatPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         enableIPForwarding: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         provisioningState: String
     *         licenseType: String
     *         modelDefinitionApplied: String
     *         protectionPolicy: {
     *             protectFromScaleIn: Boolean
     *             protectFromScaleSetActions: Boolean
     *         }
     *         userData: String
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     resources: [
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
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     *     zones: [
     *         String
     *     ]
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
     * @param instanceId The instance ID of the virtual machine.
     * @param parameters Parameters supplied to the Update Virtual Machine Scale Sets VM operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a virtual machine scale set virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.update(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Updates a virtual machine of a VM scale set.
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
     *     instanceId: String
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     properties: {
     *         latestModelApplied: Boolean
     *         vmId: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             assignedHost: String
     *             placementGroupId: String
     *         }
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: (recursive schema, see encryptionSettings above)
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         networkProfileConfiguration: {
     *             networkInterfaceConfigurations: [
     *                 {
     *                     id: String
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     subnet: {
     *                                         id: String
     *                                     }
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             deleteOption: String(Delete/Detach)
     *                                         }
     *                                         sku: (recursive schema, see sku above)
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerInboundNatPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         enableIPForwarding: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         provisioningState: String
     *         licenseType: String
     *         modelDefinitionApplied: String
     *         protectionPolicy: {
     *             protectFromScaleIn: Boolean
     *             protectFromScaleSetActions: Boolean
     *         }
     *         userData: String
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     resources: [
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
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     *     zones: [
     *         String
     *     ]
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
     * @param instanceId The instance ID of the virtual machine.
     * @param parameters Parameters supplied to the Update Virtual Machine Scale Sets VM operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a virtual machine scale set virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return updateWithResponseAsync(
                        resourceGroupName, vmScaleSetName, instanceId, parameters, requestOptions, context)
                .block();
    }

    /**
     * Deletes a virtual machine from a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete a virtual machine from a VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.delete(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Deletes a virtual machine from a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete a virtual machine from a VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.delete(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Deletes a virtual machine from a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete a virtual machine from a VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
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
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return deleteWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context).block();
    }

    /**
     * Gets a virtual machine from a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'InstanceView' will retrieve the instance view of the virtual machine. 'UserData' will retrieve the UserData of the virtual machine.</td></tr>
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
     *     instanceId: String
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     properties: {
     *         latestModelApplied: Boolean
     *         vmId: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             assignedHost: String
     *             placementGroupId: String
     *         }
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: (recursive schema, see encryptionSettings above)
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         networkProfileConfiguration: {
     *             networkInterfaceConfigurations: [
     *                 {
     *                     id: String
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     subnet: {
     *                                         id: String
     *                                     }
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             deleteOption: String(Delete/Detach)
     *                                         }
     *                                         sku: (recursive schema, see sku above)
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerInboundNatPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         enableIPForwarding: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         provisioningState: String
     *         licenseType: String
     *         modelDefinitionApplied: String
     *         protectionPolicy: {
     *             protectFromScaleIn: Boolean
     *             protectFromScaleSetActions: Boolean
     *         }
     *         userData: String
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     resources: [
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
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine from a VM scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a virtual machine from a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'InstanceView' will retrieve the instance view of the virtual machine. 'UserData' will retrieve the UserData of the virtual machine.</td></tr>
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
     *     instanceId: String
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     properties: {
     *         latestModelApplied: Boolean
     *         vmId: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             assignedHost: String
     *             placementGroupId: String
     *         }
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: (recursive schema, see encryptionSettings above)
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         networkProfileConfiguration: {
     *             networkInterfaceConfigurations: [
     *                 {
     *                     id: String
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     subnet: {
     *                                         id: String
     *                                     }
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             deleteOption: String(Delete/Detach)
     *                                         }
     *                                         sku: (recursive schema, see sku above)
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerInboundNatPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         enableIPForwarding: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         provisioningState: String
     *         licenseType: String
     *         modelDefinitionApplied: String
     *         protectionPolicy: {
     *             protectFromScaleIn: Boolean
     *             protectFromScaleSetActions: Boolean
     *         }
     *         userData: String
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     resources: [
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
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine from a VM scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.get(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a virtual machine from a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'InstanceView' will retrieve the instance view of the virtual machine. 'UserData' will retrieve the UserData of the virtual machine.</td></tr>
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
     *     instanceId: String
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     properties: {
     *         latestModelApplied: Boolean
     *         vmId: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             assignedHost: String
     *             placementGroupId: String
     *         }
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: (recursive schema, see encryptionSettings above)
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         networkProfileConfiguration: {
     *             networkInterfaceConfigurations: [
     *                 {
     *                     id: String
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     subnet: {
     *                                         id: String
     *                                     }
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             deleteOption: String(Delete/Detach)
     *                                         }
     *                                         sku: (recursive schema, see sku above)
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerInboundNatPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         enableIPForwarding: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         provisioningState: String
     *         licenseType: String
     *         modelDefinitionApplied: String
     *         protectionPolicy: {
     *             protectFromScaleIn: Boolean
     *             protectFromScaleSetActions: Boolean
     *         }
     *         userData: String
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     resources: [
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
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine from a VM scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return getWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context).block();
    }

    /**
     * Gets the status of a virtual machine from a VM scale set.
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
     *     platformUpdateDomain: Integer
     *     platformFaultDomain: Integer
     *     rdpThumbPrint: String
     *     vmAgent: {
     *         vmAgentVersion: String
     *         extensionHandlers: [
     *             {
     *                 type: String
     *                 typeHandlerVersion: String
     *                 status: {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             }
     *         ]
     *         statuses: [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     maintenanceRedeployStatus: {
     *         isCustomerInitiatedMaintenanceAllowed: Boolean
     *         preMaintenanceWindowStartTime: String
     *         preMaintenanceWindowEndTime: String
     *         maintenanceWindowStartTime: String
     *         maintenanceWindowEndTime: String
     *         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *         lastOperationMessage: String
     *     }
     *     disks: [
     *         {
     *             name: String
     *             encryptionSettings: [
     *                 {
     *                     diskEncryptionKey: {
     *                         secretUrl: String
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                     }
     *                     keyEncryptionKey: {
     *                         keyUrl: String
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                     }
     *                     enabled: Boolean
     *                 }
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     extensions: [
     *         {
     *             name: String
     *             type: String
     *             typeHandlerVersion: String
     *             substatuses: [
     *                 (recursive schema, see above)
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     vmHealth: {
     *         status: (recursive schema, see status above)
     *     }
     *     bootDiagnostics: {
     *         consoleScreenshotBlobUri: String
     *         serialConsoleLogBlobUri: String
     *         status: (recursive schema, see status above)
     *     }
     *     statuses: [
     *         (recursive schema, see above)
     *     ]
     *     assignedHost: String
     *     placementGroupId: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of a virtual machine from a VM scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getInstanceViewWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.getInstanceView(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets the status of a virtual machine from a VM scale set.
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
     *     platformUpdateDomain: Integer
     *     platformFaultDomain: Integer
     *     rdpThumbPrint: String
     *     vmAgent: {
     *         vmAgentVersion: String
     *         extensionHandlers: [
     *             {
     *                 type: String
     *                 typeHandlerVersion: String
     *                 status: {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             }
     *         ]
     *         statuses: [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     maintenanceRedeployStatus: {
     *         isCustomerInitiatedMaintenanceAllowed: Boolean
     *         preMaintenanceWindowStartTime: String
     *         preMaintenanceWindowEndTime: String
     *         maintenanceWindowStartTime: String
     *         maintenanceWindowEndTime: String
     *         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *         lastOperationMessage: String
     *     }
     *     disks: [
     *         {
     *             name: String
     *             encryptionSettings: [
     *                 {
     *                     diskEncryptionKey: {
     *                         secretUrl: String
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                     }
     *                     keyEncryptionKey: {
     *                         keyUrl: String
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                     }
     *                     enabled: Boolean
     *                 }
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     extensions: [
     *         {
     *             name: String
     *             type: String
     *             typeHandlerVersion: String
     *             substatuses: [
     *                 (recursive schema, see above)
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     vmHealth: {
     *         status: (recursive schema, see status above)
     *     }
     *     bootDiagnostics: {
     *         consoleScreenshotBlobUri: String
     *         serialConsoleLogBlobUri: String
     *         status: (recursive schema, see status above)
     *     }
     *     statuses: [
     *         (recursive schema, see above)
     *     ]
     *     assignedHost: String
     *     placementGroupId: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of a virtual machine from a VM scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getInstanceViewWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.getInstanceView(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets the status of a virtual machine from a VM scale set.
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
     *     platformUpdateDomain: Integer
     *     platformFaultDomain: Integer
     *     rdpThumbPrint: String
     *     vmAgent: {
     *         vmAgentVersion: String
     *         extensionHandlers: [
     *             {
     *                 type: String
     *                 typeHandlerVersion: String
     *                 status: {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             }
     *         ]
     *         statuses: [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     maintenanceRedeployStatus: {
     *         isCustomerInitiatedMaintenanceAllowed: Boolean
     *         preMaintenanceWindowStartTime: String
     *         preMaintenanceWindowEndTime: String
     *         maintenanceWindowStartTime: String
     *         maintenanceWindowEndTime: String
     *         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *         lastOperationMessage: String
     *     }
     *     disks: [
     *         {
     *             name: String
     *             encryptionSettings: [
     *                 {
     *                     diskEncryptionKey: {
     *                         secretUrl: String
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                     }
     *                     keyEncryptionKey: {
     *                         keyUrl: String
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                     }
     *                     enabled: Boolean
     *                 }
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     extensions: [
     *         {
     *             name: String
     *             type: String
     *             typeHandlerVersion: String
     *             substatuses: [
     *                 (recursive schema, see above)
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     vmHealth: {
     *         status: (recursive schema, see status above)
     *     }
     *     bootDiagnostics: {
     *         consoleScreenshotBlobUri: String
     *         serialConsoleLogBlobUri: String
     *         status: (recursive schema, see status above)
     *     }
     *     statuses: [
     *         (recursive schema, see above)
     *     ]
     *     assignedHost: String
     *     placementGroupId: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of a virtual machine from a VM scale set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getInstanceViewWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return getInstanceViewWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context)
                .block();
    }

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code, 'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.</td></tr>
     *     <tr><td>select</td><td>String</td><td>No</td><td>The list parameters. Allowed values are 'instanceView', 'instanceView/statuses'.</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply to the operation. Allowed values are 'instanceView'.</td></tr>
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
     *             instanceId: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             properties: {
     *                 latestModelApplied: Boolean
     *                 vmId: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     assignedHost: String
     *                     placementGroupId: String
     *                 }
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: (recursive schema, see encryptionSettings above)
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 networkProfileConfiguration: {
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             id: String
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         id: String
     *                                         name: String
     *                                         properties: {
     *                                             subnet: {
     *                                                 id: String
     *                                             }
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     deleteOption: String(Delete/Detach)
     *                                                 }
     *                                                 sku: (recursive schema, see sku above)
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerInboundNatPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 enableIPForwarding: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 provisioningState: String
     *                 licenseType: String
     *                 modelDefinitionApplied: String
     *                 protectionPolicy: {
     *                     protectFromScaleIn: Boolean
     *                     protectFromScaleSetActions: Boolean
     *                 }
     *                 userData: String
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machines in a VM scale sets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSinglePageAsync(
            String resourceGroupName, String virtualMachineScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.list(
                                        this.client.getHost(),
                                        resourceGroupName,
                                        virtualMachineScaleSetName,
                                        this.client.getServiceVersion().getVersion(),
                                        this.client.getSubscriptionId(),
                                        requestOptions,
                                        context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code, 'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.</td></tr>
     *     <tr><td>select</td><td>String</td><td>No</td><td>The list parameters. Allowed values are 'instanceView', 'instanceView/statuses'.</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply to the operation. Allowed values are 'instanceView'.</td></tr>
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
     *             instanceId: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             properties: {
     *                 latestModelApplied: Boolean
     *                 vmId: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     assignedHost: String
     *                     placementGroupId: String
     *                 }
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: (recursive schema, see encryptionSettings above)
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 networkProfileConfiguration: {
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             id: String
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         id: String
     *                                         name: String
     *                                         properties: {
     *                                             subnet: {
     *                                                 id: String
     *                                             }
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     deleteOption: String(Delete/Detach)
     *                                                 }
     *                                                 sku: (recursive schema, see sku above)
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerInboundNatPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 enableIPForwarding: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 provisioningState: String
     *                 licenseType: String
     *                 modelDefinitionApplied: String
     *                 protectionPolicy: {
     *                     protectFromScaleIn: Boolean
     *                     protectFromScaleSetActions: Boolean
     *                 }
     *                 userData: String
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machines in a VM scale sets.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSinglePageAsync(
            String resourceGroupName,
            String virtualMachineScaleSetName,
            RequestOptions requestOptions,
            Context context) {
        return service.list(
                        this.client.getHost(),
                        resourceGroupName,
                        virtualMachineScaleSetName,
                        this.client.getServiceVersion().getVersion(),
                        this.client.getSubscriptionId(),
                        requestOptions,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code, 'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.</td></tr>
     *     <tr><td>select</td><td>String</td><td>No</td><td>The list parameters. Allowed values are 'instanceView', 'instanceView/statuses'.</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply to the operation. Allowed values are 'instanceView'.</td></tr>
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
     *             instanceId: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             properties: {
     *                 latestModelApplied: Boolean
     *                 vmId: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     assignedHost: String
     *                     placementGroupId: String
     *                 }
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: (recursive schema, see encryptionSettings above)
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 networkProfileConfiguration: {
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             id: String
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         id: String
     *                                         name: String
     *                                         properties: {
     *                                             subnet: {
     *                                                 id: String
     *                                             }
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     deleteOption: String(Delete/Detach)
     *                                                 }
     *                                                 sku: (recursive schema, see sku above)
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerInboundNatPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 enableIPForwarding: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 provisioningState: String
     *                 licenseType: String
     *                 modelDefinitionApplied: String
     *                 protectionPolicy: {
     *                     protectFromScaleIn: Boolean
     *                     protectFromScaleSetActions: Boolean
     *                 }
     *                 userData: String
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machines in a VM scale sets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(
            String resourceGroupName, String virtualMachineScaleSetName, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(resourceGroupName, virtualMachineScaleSetName, requestOptions),
                nextLink -> listNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code, 'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.</td></tr>
     *     <tr><td>select</td><td>String</td><td>No</td><td>The list parameters. Allowed values are 'instanceView', 'instanceView/statuses'.</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply to the operation. Allowed values are 'instanceView'.</td></tr>
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
     *             instanceId: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             properties: {
     *                 latestModelApplied: Boolean
     *                 vmId: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     assignedHost: String
     *                     placementGroupId: String
     *                 }
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: (recursive schema, see encryptionSettings above)
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 networkProfileConfiguration: {
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             id: String
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         id: String
     *                                         name: String
     *                                         properties: {
     *                                             subnet: {
     *                                                 id: String
     *                                             }
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     deleteOption: String(Delete/Detach)
     *                                                 }
     *                                                 sku: (recursive schema, see sku above)
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerInboundNatPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 enableIPForwarding: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 provisioningState: String
     *                 licenseType: String
     *                 modelDefinitionApplied: String
     *                 protectionPolicy: {
     *                     protectFromScaleIn: Boolean
     *                     protectFromScaleSetActions: Boolean
     *                 }
     *                 userData: String
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machines in a VM scale sets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(
            String resourceGroupName,
            String virtualMachineScaleSetName,
            RequestOptions requestOptions,
            Context context) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(resourceGroupName, virtualMachineScaleSetName, requestOptions, context),
                nextLink -> listNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code, 'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.</td></tr>
     *     <tr><td>select</td><td>String</td><td>No</td><td>The list parameters. Allowed values are 'instanceView', 'instanceView/statuses'.</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply to the operation. Allowed values are 'instanceView'.</td></tr>
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
     *             instanceId: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             properties: {
     *                 latestModelApplied: Boolean
     *                 vmId: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     assignedHost: String
     *                     placementGroupId: String
     *                 }
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: (recursive schema, see encryptionSettings above)
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 networkProfileConfiguration: {
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             id: String
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         id: String
     *                                         name: String
     *                                         properties: {
     *                                             subnet: {
     *                                                 id: String
     *                                             }
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     deleteOption: String(Delete/Detach)
     *                                                 }
     *                                                 sku: (recursive schema, see sku above)
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerInboundNatPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 enableIPForwarding: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 provisioningState: String
     *                 licenseType: String
     *                 modelDefinitionApplied: String
     *                 protectionPolicy: {
     *                     protectFromScaleIn: Boolean
     *                     protectFromScaleSetActions: Boolean
     *                 }
     *                 userData: String
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machines in a VM scale sets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(
            String resourceGroupName, String virtualMachineScaleSetName, RequestOptions requestOptions) {
        return new PagedIterable<>(listAsync(resourceGroupName, virtualMachineScaleSetName, requestOptions));
    }

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code, 'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.</td></tr>
     *     <tr><td>select</td><td>String</td><td>No</td><td>The list parameters. Allowed values are 'instanceView', 'instanceView/statuses'.</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply to the operation. Allowed values are 'instanceView'.</td></tr>
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
     *             instanceId: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             properties: {
     *                 latestModelApplied: Boolean
     *                 vmId: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     assignedHost: String
     *                     placementGroupId: String
     *                 }
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: (recursive schema, see encryptionSettings above)
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 networkProfileConfiguration: {
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             id: String
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         id: String
     *                                         name: String
     *                                         properties: {
     *                                             subnet: {
     *                                                 id: String
     *                                             }
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     deleteOption: String(Delete/Detach)
     *                                                 }
     *                                                 sku: (recursive schema, see sku above)
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerInboundNatPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 enableIPForwarding: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 provisioningState: String
     *                 licenseType: String
     *                 modelDefinitionApplied: String
     *                 protectionPolicy: {
     *                     protectFromScaleIn: Boolean
     *                     protectFromScaleSetActions: Boolean
     *                 }
     *                 userData: String
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machines in a VM scale sets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(
            String resourceGroupName,
            String virtualMachineScaleSetName,
            RequestOptions requestOptions,
            Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, virtualMachineScaleSetName, requestOptions, context));
    }

    /**
     * Power off (stop) a virtual machine in a VM scale set. Note that resources are still attached and you are getting
     * charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>skipShutdown</td><td>String</td><td>No</td><td>The parameter to request non-graceful VM shutdown. True value for this flag indicates non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not specified</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> powerOffWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.powerOff(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Power off (stop) a virtual machine in a VM scale set. Note that resources are still attached and you are getting
     * charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>skipShutdown</td><td>String</td><td>No</td><td>The parameter to request non-graceful VM shutdown. True value for this flag indicates non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not specified</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> powerOffWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.powerOff(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Power off (stop) a virtual machine in a VM scale set. Note that resources are still attached and you are getting
     * charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>skipShutdown</td><td>String</td><td>No</td><td>The parameter to request non-graceful VM shutdown. True value for this flag indicates non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not specified</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> powerOffWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return powerOffWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context)
                .block();
    }

    /**
     * Restarts a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> restartWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.restart(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Restarts a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> restartWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.restart(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Restarts a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> restartWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return restartWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context).block();
    }

    /**
     * Starts a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.start(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Starts a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.start(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Starts a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> startWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return startWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context).block();
    }

    /**
     * Shuts down the virtual machine in the virtual machine scale set, moves it to a new node, and powers it back on.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redeployWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.redeploy(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Shuts down the virtual machine in the virtual machine scale set, moves it to a new node, and powers it back on.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redeployWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.redeploy(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Shuts down the virtual machine in the virtual machine scale set, moves it to a new node, and powers it back on.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> redeployWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return redeployWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context)
                .block();
    }

    /**
     * The operation to retrieve SAS URIs of boot diagnostic logs for a virtual machine in a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>sasUriExpirationTimeInMinutes</td><td>String</td><td>No</td><td>Expiration duration in minutes for the SAS URIs with a value between 1 to 1440 minutes. &lt;br&gt;&lt;br&gt;NOTE: If not specified, SAS URIs will be generated with a default expiration duration of 120 minutes.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     consoleScreenshotBlobUri: String
     *     serialConsoleLogBlobUri: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the SAS URIs of the console screenshot and serial log blobs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> retrieveBootDiagnosticsDataWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.retrieveBootDiagnosticsData(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * The operation to retrieve SAS URIs of boot diagnostic logs for a virtual machine in a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>sasUriExpirationTimeInMinutes</td><td>String</td><td>No</td><td>Expiration duration in minutes for the SAS URIs with a value between 1 to 1440 minutes. &lt;br&gt;&lt;br&gt;NOTE: If not specified, SAS URIs will be generated with a default expiration duration of 120 minutes.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     consoleScreenshotBlobUri: String
     *     serialConsoleLogBlobUri: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the SAS URIs of the console screenshot and serial log blobs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> retrieveBootDiagnosticsDataWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.retrieveBootDiagnosticsData(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * The operation to retrieve SAS URIs of boot diagnostic logs for a virtual machine in a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>sasUriExpirationTimeInMinutes</td><td>String</td><td>No</td><td>Expiration duration in minutes for the SAS URIs with a value between 1 to 1440 minutes. &lt;br&gt;&lt;br&gt;NOTE: If not specified, SAS URIs will be generated with a default expiration duration of 120 minutes.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     consoleScreenshotBlobUri: String
     *     serialConsoleLogBlobUri: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the SAS URIs of the console screenshot and serial log blobs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> retrieveBootDiagnosticsDataWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return retrieveBootDiagnosticsDataWithResponseAsync(
                        resourceGroupName, vmScaleSetName, instanceId, requestOptions, context)
                .block();
    }

    /**
     * Performs maintenance on a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> performMaintenanceWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.performMaintenance(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Performs maintenance on a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> performMaintenanceWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.performMaintenance(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Performs maintenance on a virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> performMaintenanceWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return performMaintenanceWithResponseAsync(
                        resourceGroupName, vmScaleSetName, instanceId, requestOptions, context)
                .block();
    }

    /**
     * The operation to simulate the eviction of spot virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> simulateEvictionWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, String instanceId, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.simulateEviction(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                instanceId,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * The operation to simulate the eviction of spot virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> simulateEvictionWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return service.simulateEviction(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                instanceId,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * The operation to simulate the eviction of spot virtual machine in a VM scale set.
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
     * @param instanceId The instance ID of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> simulateEvictionWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            String instanceId,
            RequestOptions requestOptions,
            Context context) {
        return simulateEvictionWithResponseAsync(resourceGroupName, vmScaleSetName, instanceId, requestOptions, context)
                .block();
    }

    /**
     * Get the next page of items.
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
     *             instanceId: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             properties: {
     *                 latestModelApplied: Boolean
     *                 vmId: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     assignedHost: String
     *                     placementGroupId: String
     *                 }
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: (recursive schema, see encryptionSettings above)
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 networkProfileConfiguration: {
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             id: String
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         id: String
     *                                         name: String
     *                                         properties: {
     *                                             subnet: {
     *                                                 id: String
     *                                             }
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     deleteOption: String(Delete/Detach)
     *                                                 }
     *                                                 sku: (recursive schema, see sku above)
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerInboundNatPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 enableIPForwarding: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 provisioningState: String
     *                 licenseType: String
     *                 modelDefinitionApplied: String
     *                 protectionPolicy: {
     *                     protectFromScaleIn: Boolean
     *                     protectFromScaleSetActions: Boolean
     *                 }
     *                 userData: String
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Virtual Machine Scale Set VMs operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listNextSinglePageAsync(String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.listNext(nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
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
     *             instanceId: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             properties: {
     *                 latestModelApplied: Boolean
     *                 vmId: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     assignedHost: String
     *                     placementGroupId: String
     *                 }
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: (recursive schema, see encryptionSettings above)
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 networkProfileConfiguration: {
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             id: String
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         id: String
     *                                         name: String
     *                                         properties: {
     *                                             subnet: {
     *                                                 id: String
     *                                             }
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     deleteOption: String(Delete/Detach)
     *                                                 }
     *                                                 sku: (recursive schema, see sku above)
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerInboundNatPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 enableIPForwarding: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 provisioningState: String
     *                 licenseType: String
     *                 modelDefinitionApplied: String
     *                 protectionPolicy: {
     *                     protectFromScaleIn: Boolean
     *                     protectFromScaleSetActions: Boolean
     *                 }
     *                 userData: String
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Virtual Machine Scale Set VMs operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.listNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    private List<BinaryData> getValues(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            List<?> values = (List<?>) obj.get(path);
            return values.stream().map(BinaryData::fromObject).collect(Collectors.toList());
        } catch (RuntimeException e) {
            return null;
        }
    }

    private String getNextLink(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            return (String) obj.get(path);
        } catch (RuntimeException e) {
            return null;
        }
    }
}
