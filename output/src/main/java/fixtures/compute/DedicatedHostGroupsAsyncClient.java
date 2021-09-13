package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.DedicatedHostGroupsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class DedicatedHostGroupsAsyncClient {
    private final DedicatedHostGroupsImpl serviceClient;

    /**
     * Initializes an instance of DedicatedHostGroups client.
     *
     * @param serviceClient the service client implementation.
     */
    DedicatedHostGroupsAsyncClient(DedicatedHostGroupsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or update a dedicated host group. For details of Dedicated Host and Dedicated Host Groups please see
     * [Dedicated Host Documentation] (https://go.microsoft.com/fwlink/?linkid=2082596).
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
     *         platformFaultDomainCount: int
     *         hosts: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         instanceView: {
     *             hosts: [
     *                 {
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
     *                     name: String
     *                 }
     *             ]
     *         }
     *         supportAutomaticPlacement: Boolean
     *     }
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
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Parameters supplied to the Create Dedicated Host Group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String resourceGroupName, String hostGroupName, BinaryData parameters, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                resourceGroupName, hostGroupName, parameters, requestOptions);
    }

    /**
     * Update an dedicated host group.
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
     *         platformFaultDomainCount: int
     *         hosts: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         instanceView: {
     *             hosts: [
     *                 {
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
     *                     name: String
     *                 }
     *             ]
     *         }
     *         supportAutomaticPlacement: Boolean
     *     }
     *     zones: [
     *         String
     *     ]
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
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param parameters Parameters supplied to the Update Dedicated Host Group operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponse(
            String resourceGroupName, String hostGroupName, BinaryData parameters, RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(resourceGroupName, hostGroupName, parameters, requestOptions);
    }

    /**
     * Delete a dedicated host group.
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
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(
            String resourceGroupName, String hostGroupName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, hostGroupName, requestOptions);
    }

    /**
     * Retrieves information about a dedicated host group.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance views of the dedicated hosts under the dedicated host group. 'UserData' is not supported for dedicated host group.</td></tr>
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
     *         platformFaultDomainCount: int
     *         hosts: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         instanceView: {
     *             hosts: [
     *                 {
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
     *                     name: String
     *                 }
     *             ]
     *         }
     *         supportAutomaticPlacement: Boolean
     *     }
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the dedicated host group that the dedicated hosts should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String resourceGroupName, String hostGroupName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, hostGroupName, requestOptions);
    }

    /**
     * Lists all of the dedicated host groups in the specified resource group. Use the nextLink property in the response
     * to get the next page of dedicated host groups.
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
     *                 platformFaultDomainCount: int
     *                 hosts: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 instanceView: {
     *                     hosts: [
     *                         {
     *                             assetId: String
     *                             availableCapacity: {
     *                                 allocatableVMs: [
     *                                     {
     *                                         vmSize: String
     *                                         count: Double
     *                                     }
     *                                 ]
     *                             }
     *                             statuses: [
     *                                 {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             ]
     *                             name: String
     *                         }
     *                     ]
     *                 }
     *                 supportAutomaticPlacement: Boolean
     *             }
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
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Dedicated Host Group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByResourceGroup(String resourceGroupName, RequestOptions requestOptions) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, requestOptions);
    }

    /**
     * Lists all of the dedicated host groups in the subscription. Use the nextLink property in the response to get the
     * next page of dedicated host groups.
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
     *                 platformFaultDomainCount: int
     *                 hosts: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 instanceView: {
     *                     hosts: [
     *                         {
     *                             assetId: String
     *                             availableCapacity: {
     *                                 allocatableVMs: [
     *                                     {
     *                                         vmSize: String
     *                                         count: Double
     *                                     }
     *                                 ]
     *                             }
     *                             statuses: [
     *                                 {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             ]
     *                             name: String
     *                         }
     *                     ]
     *                 }
     *                 supportAutomaticPlacement: Boolean
     *             }
     *             zones: [
     *                 String
     *             ]
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Dedicated Host Group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listBySubscription(RequestOptions requestOptions) {
        return this.serviceClient.listBySubscriptionAsync(requestOptions);
    }
}
