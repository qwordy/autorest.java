package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.VirtualMachineScaleSetRollingUpgradesImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class VirtualMachineScaleSetRollingUpgradesAsyncClient {
    private final VirtualMachineScaleSetRollingUpgradesImpl serviceClient;

    /**
     * Initializes an instance of VirtualMachineScaleSetRollingUpgrades client.
     *
     * @param serviceClient the service client implementation.
     */
    VirtualMachineScaleSetRollingUpgradesAsyncClient(VirtualMachineScaleSetRollingUpgradesImpl serviceClient) {
        this.serviceClient = serviceClient;
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
    public Mono<Response<Void>> cancelWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.cancelWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> startOSUpgradeWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.startOSUpgradeWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> startExtensionUpgradeWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.startExtensionUpgradeWithResponseAsync(
                resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<BinaryData>> getLatestWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.getLatestWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
    }
}
