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
import fixtures.compute.implementation.DedicatedHostsImpl;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class DedicatedHostsClient {
    private final DedicatedHostsImpl serviceClient;

    /**
     * Initializes an instance of DedicatedHosts client.
     *
     * @param serviceClient the service client implementation.
     */
    DedicatedHostsClient(DedicatedHostsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or update a dedicated host .
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
     *         platformFaultDomain: Integer
     *         autoReplaceOnFailure: Boolean
     *         hostId: String
     *         virtualMachines: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         licenseType: String(None/Windows_Server_Hybrid/Windows_Server_Perpetual)
     *         provisioningTime: String
     *         provisioningState: String
     *         instanceView: {
     *             assetId: String
     *             availableCapacity: {
     *                 allocatableVMs: [
     *                     {
     *                         vmSize: String
     *                         count: Double
     *                     }
     *                 ]
     *             }
     *             statuses: [
     *                 {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             ]
     *         }
     *     }
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
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
     * @param hostGroupName The name of the dedicated host group.
     * @param hostName The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String resourceGroupName,
            String hostGroupName,
            String hostName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.createOrUpdateWithResponse(
                resourceGroupName, hostGroupName, hostName, parameters, requestOptions, context);
    }

    /**
     * Update an dedicated host .
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
     *         platformFaultDomain: Integer
     *         autoReplaceOnFailure: Boolean
     *         hostId: String
     *         virtualMachines: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         licenseType: String(None/Windows_Server_Hybrid/Windows_Server_Perpetual)
     *         provisioningTime: String
     *         provisioningState: String
     *         instanceView: {
     *             assetId: String
     *             availableCapacity: {
     *                 allocatableVMs: [
     *                     {
     *                         vmSize: String
     *                         count: Double
     *                     }
     *                 ]
     *             }
     *             statuses: [
     *                 {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             ]
     *         }
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
     *     properties: (recursive schema, see properties above)
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostName The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String hostGroupName,
            String hostName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.updateWithResponse(
                resourceGroupName, hostGroupName, hostName, parameters, requestOptions, context);
    }

    /**
     * Delete a dedicated host.
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
     * @param hostGroupName The name of the dedicated host group.
     * @param hostName The name of the dedicated host.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String resourceGroupName,
            String hostGroupName,
            String hostName,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.deleteWithResponse(
                resourceGroupName, hostGroupName, hostName, requestOptions, context);
    }

    /**
     * Retrieves information about a dedicated host.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance views of the dedicated host. 'UserData' is not supported for dedicated host.</td></tr>
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
     *         platformFaultDomain: Integer
     *         autoReplaceOnFailure: Boolean
     *         hostId: String
     *         virtualMachines: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         licenseType: String(None/Windows_Server_Hybrid/Windows_Server_Perpetual)
     *         provisioningTime: String
     *         provisioningState: String
     *         instanceView: {
     *             assetId: String
     *             availableCapacity: {
     *                 allocatableVMs: [
     *                     {
     *                         vmSize: String
     *                         count: Double
     *                     }
     *                 ]
     *             }
     *             statuses: [
     *                 {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             ]
     *         }
     *     }
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostName The name of the dedicated host.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName,
            String hostGroupName,
            String hostName,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.getWithResponse(resourceGroupName, hostGroupName, hostName, requestOptions, context);
    }

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
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
     *             location: String
     *             tags: {
     *                 String: String
     *             }
     *             properties: {
     *                 platformFaultDomain: Integer
     *                 autoReplaceOnFailure: Boolean
     *                 hostId: String
     *                 virtualMachines: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 licenseType: String(None/Windows_Server_Hybrid/Windows_Server_Perpetual)
     *                 provisioningTime: String
     *                 provisioningState: String
     *                 instanceView: {
     *                     assetId: String
     *                     availableCapacity: {
     *                         allocatableVMs: [
     *                             {
     *                                 vmSize: String
     *                                 count: Double
     *                             }
     *                         ]
     *                     }
     *                     statuses: [
     *                         {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the list dedicated host operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByHostGroup(
            String resourceGroupName, String hostGroupName, RequestOptions requestOptions) {
        return this.serviceClient.listByHostGroup(resourceGroupName, hostGroupName, requestOptions);
    }

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
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
     *             location: String
     *             tags: {
     *                 String: String
     *             }
     *             properties: {
     *                 platformFaultDomain: Integer
     *                 autoReplaceOnFailure: Boolean
     *                 hostId: String
     *                 virtualMachines: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 licenseType: String(None/Windows_Server_Hybrid/Windows_Server_Perpetual)
     *                 provisioningTime: String
     *                 provisioningState: String
     *                 instanceView: {
     *                     assetId: String
     *                     availableCapacity: {
     *                         allocatableVMs: [
     *                             {
     *                                 vmSize: String
     *                                 count: Double
     *                             }
     *                         ]
     *                     }
     *                     statuses: [
     *                         {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the list dedicated host operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByHostGroup(
            String resourceGroupName, String hostGroupName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.listByHostGroup(resourceGroupName, hostGroupName, requestOptions, context);
    }
}
