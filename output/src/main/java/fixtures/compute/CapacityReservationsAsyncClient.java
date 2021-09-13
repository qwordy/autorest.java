package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.CapacityReservationsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class CapacityReservationsAsyncClient {
    private final CapacityReservationsImpl serviceClient;

    /**
     * Initializes an instance of CapacityReservations client.
     *
     * @param serviceClient the service client implementation.
     */
    CapacityReservationsAsyncClient(CapacityReservationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The operation to create or update a capacity reservation. Please note some properties can be set only during
     * capacity reservation creation. Please refer to https://aka.ms/CapacityReservation for more details.
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
     *         reservationId: String
     *         virtualMachinesAssociated: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         provisioningTime: String
     *         provisioningState: String
     *         instanceView: {
     *             utilizationInfo: {
     *                 virtualMachinesAllocated: [
     *                     (recursive schema, see above)
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
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Create capacity reservation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String resourceGroupName,
            String capacityReservationGroupName,
            String capacityReservationName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                resourceGroupName, capacityReservationGroupName, capacityReservationName, parameters, requestOptions);
    }

    /**
     * The operation to update a capacity reservation.
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
     *         reservationId: String
     *         virtualMachinesAssociated: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         provisioningTime: String
     *         provisioningState: String
     *         instanceView: {
     *             utilizationInfo: {
     *                 virtualMachinesAllocated: [
     *                     (recursive schema, see above)
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
     * {
     *     id: String
     *     name: String
     *     type: String
     *     location: String
     *     tags: {
     *         String: String
     *     }
     *     properties: (recursive schema, see properties above)
     *     sku: (recursive schema, see sku above)
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Update capacity reservation operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponse(
            String resourceGroupName,
            String capacityReservationGroupName,
            String capacityReservationName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(
                resourceGroupName, capacityReservationGroupName, capacityReservationName, parameters, requestOptions);
    }

    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
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
     * @param capacityReservationName The name of the capacity reservation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(
            String resourceGroupName,
            String capacityReservationGroupName,
            String capacityReservationName,
            RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(
                resourceGroupName, capacityReservationGroupName, capacityReservationName, requestOptions);
    }

    /**
     * The operation that retrieves information about the capacity reservation.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'InstanceView' retrieves a snapshot of the runtime properties of the capacity reservation that is managed by the platform and can change outside of control plane operations.</td></tr>
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
     *         reservationId: String
     *         virtualMachinesAssociated: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         provisioningTime: String
     *         provisioningState: String
     *         instanceView: {
     *             utilizationInfo: {
     *                 virtualMachinesAllocated: [
     *                     (recursive schema, see above)
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
     *     zones: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String resourceGroupName,
            String capacityReservationGroupName,
            String capacityReservationName,
            RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(
                resourceGroupName, capacityReservationGroupName, capacityReservationName, requestOptions);
    }

    /**
     * Lists all of the capacity reservations in the specified capacity reservation group. Use the nextLink property in
     * the response to get the next page of capacity reservations.
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
     *                 reservationId: String
     *                 virtualMachinesAssociated: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 provisioningTime: String
     *                 provisioningState: String
     *                 instanceView: {
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
     *                 }
     *             }
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
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
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the list capacity reservation operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByCapacityReservationGroup(
            String resourceGroupName, String capacityReservationGroupName, RequestOptions requestOptions) {
        return this.serviceClient.listByCapacityReservationGroupAsync(
                resourceGroupName, capacityReservationGroupName, requestOptions);
    }
}
