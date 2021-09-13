package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.CapacityReservationGroupsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class CapacityReservationGroupsAsyncClient {
    private final CapacityReservationGroupsImpl serviceClient;

    /**
     * Initializes an instance of CapacityReservationGroups client.
     *
     * @param serviceClient the service client implementation.
     */
    CapacityReservationGroupsAsyncClient(CapacityReservationGroupsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The operation to create or update a capacity reservation group. When updating a capacity reservation group, only
     * tags may be modified. Please refer to https://aka.ms/CapacityReservation for more details.
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
     *         capacityReservations: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         virtualMachinesAssociated: [
     *             (recursive schema, see above)
     *         ]
     *         instanceView: {
     *             capacityReservations: [
     *                 {
     *                     utilizationInfo: {
     *                         virtualMachinesAllocated: [
     *                             (recursive schema, see above)
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
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Create capacity reservation Group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     *     assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String resourceGroupName,
            String capacityReservationGroupName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                resourceGroupName, capacityReservationGroupName, parameters, requestOptions);
    }

    /**
     * The operation to update a capacity reservation group. When updating a capacity reservation group, only tags may
     * be modified.
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
     *         capacityReservations: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         virtualMachinesAssociated: [
     *             (recursive schema, see above)
     *         ]
     *         instanceView: {
     *             capacityReservations: [
     *                 {
     *                     utilizationInfo: {
     *                         virtualMachinesAllocated: [
     *                             (recursive schema, see above)
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
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Update capacity reservation Group operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     *     assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponse(
            String resourceGroupName,
            String capacityReservationGroupName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(
                resourceGroupName, capacityReservationGroupName, parameters, requestOptions);
    }

    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
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
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(
            String resourceGroupName, String capacityReservationGroupName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(
                resourceGroupName, capacityReservationGroupName, requestOptions);
    }

    /**
     * The operation that retrieves information about a capacity reservation group.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime properties of a capacity reservation that is managed by the platform and can change outside of control plane operations.</td></tr>
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
     *         capacityReservations: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         virtualMachinesAssociated: [
     *             (recursive schema, see above)
     *         ]
     *         instanceView: {
     *             capacityReservations: [
     *                 {
     *                     utilizationInfo: {
     *                         virtualMachinesAllocated: [
     *                             (recursive schema, see above)
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
     *     }
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     *     assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String resourceGroupName, String capacityReservationGroupName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, capacityReservationGroupName, requestOptions);
    }

    /**
     * Lists all of the capacity reservation groups in the specified resource group. Use the nextLink property in the
     * response to get the next page of capacity reservation groups.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. Based on the expand param(s) specified we return Virtual Machine or ScaleSet VM Instance or both resource Ids which are associated to capacity reservation group in the response.</td></tr>
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
     *                 capacityReservations: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 virtualMachinesAssociated: [
     *                     (recursive schema, see above)
     *                 ]
     *                 instanceView: {
     *                     capacityReservations: [
     *                         {
     *                             utilizationInfo: {
     *                                 virtualMachinesAllocated: [
     *                                     (recursive schema, see above)
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
     * @return the List capacity reservation group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByResourceGroup(String resourceGroupName, RequestOptions requestOptions) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, requestOptions);
    }

    /**
     * Lists all of the capacity reservation groups in the subscription. Use the nextLink property in the response to
     * get the next page of capacity reservation groups.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. Based on the expand param(s) specified we return Virtual Machine or ScaleSet VM Instance or both resource Ids which are associated to capacity reservation group in the response.</td></tr>
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
     *                 capacityReservations: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 virtualMachinesAssociated: [
     *                     (recursive schema, see above)
     *                 ]
     *                 instanceView: {
     *                     capacityReservations: [
     *                         {
     *                             utilizationInfo: {
     *                                 virtualMachinesAllocated: [
     *                                     (recursive schema, see above)
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
     * @return the List capacity reservation group with resource group response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listBySubscription(RequestOptions requestOptions) {
        return this.serviceClient.listBySubscriptionAsync(requestOptions);
    }
}
