package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.ProximityPlacementGroupsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class ProximityPlacementGroupsAsyncClient {
    private final ProximityPlacementGroupsImpl serviceClient;

    /**
     * Initializes an instance of ProximityPlacementGroups client.
     *
     * @param serviceClient the service client implementation.
     */
    ProximityPlacementGroupsAsyncClient(ProximityPlacementGroupsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or update a proximity placement group.
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
     *         proximityPlacementGroupType: String(Standard/Ultra)
     *         virtualMachines: [
     *             {
     *                 id: String
     *                 colocationStatus: {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             }
     *         ]
     *         virtualMachineScaleSets: [
     *             (recursive schema, see above)
     *         ]
     *         availabilitySets: [
     *             (recursive schema, see above)
     *         ]
     *         colocationStatus: (recursive schema, see colocationStatus above)
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
     * @param proximityPlacementGroupName The name of the proximity placement group.
     * @param parameters Parameters supplied to the Create Proximity Placement Group operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the proximity placement group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String resourceGroupName,
            String proximityPlacementGroupName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                resourceGroupName, proximityPlacementGroupName, parameters, requestOptions);
    }

    /**
     * Update a proximity placement group.
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
     *         proximityPlacementGroupType: String(Standard/Ultra)
     *         virtualMachines: [
     *             {
     *                 id: String
     *                 colocationStatus: {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             }
     *         ]
     *         virtualMachineScaleSets: [
     *             (recursive schema, see above)
     *         ]
     *         availabilitySets: [
     *             (recursive schema, see above)
     *         ]
     *         colocationStatus: (recursive schema, see colocationStatus above)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param proximityPlacementGroupName The name of the proximity placement group.
     * @param parameters Parameters supplied to the Update Proximity Placement Group operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the proximity placement group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponse(
            String resourceGroupName,
            String proximityPlacementGroupName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(
                resourceGroupName, proximityPlacementGroupName, parameters, requestOptions);
    }

    /**
     * Delete a proximity placement group.
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
     * @param proximityPlacementGroupName The name of the proximity placement group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(
            String resourceGroupName, String proximityPlacementGroupName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(
                resourceGroupName, proximityPlacementGroupName, requestOptions);
    }

    /**
     * Retrieves information about a proximity placement group .
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>includeColocationStatus</td><td>String</td><td>No</td><td>includeColocationStatus=true enables fetching the colocation status of all the resources in the proximity placement group.</td></tr>
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
     *         proximityPlacementGroupType: String(Standard/Ultra)
     *         virtualMachines: [
     *             {
     *                 id: String
     *                 colocationStatus: {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             }
     *         ]
     *         virtualMachineScaleSets: [
     *             (recursive schema, see above)
     *         ]
     *         availabilitySets: [
     *             (recursive schema, see above)
     *         ]
     *         colocationStatus: (recursive schema, see colocationStatus above)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param proximityPlacementGroupName The name of the proximity placement group.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the proximity placement group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String resourceGroupName, String proximityPlacementGroupName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, proximityPlacementGroupName, requestOptions);
    }

    /**
     * Lists all proximity placement groups in a subscription.
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
     *                 proximityPlacementGroupType: String(Standard/Ultra)
     *                 virtualMachines: [
     *                     {
     *                         id: String
     *                         colocationStatus: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 virtualMachineScaleSets: [
     *                     (recursive schema, see above)
     *                 ]
     *                 availabilitySets: [
     *                     (recursive schema, see above)
     *                 ]
     *                 colocationStatus: (recursive schema, see colocationStatus above)
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Proximity Placement Group operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listBySubscription(RequestOptions requestOptions) {
        return this.serviceClient.listBySubscriptionAsync(requestOptions);
    }

    /**
     * Lists all proximity placement groups in a resource group.
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
     *                 proximityPlacementGroupType: String(Standard/Ultra)
     *                 virtualMachines: [
     *                     {
     *                         id: String
     *                         colocationStatus: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 virtualMachineScaleSets: [
     *                     (recursive schema, see above)
     *                 ]
     *                 availabilitySets: [
     *                     (recursive schema, see above)
     *                 ]
     *                 colocationStatus: (recursive schema, see colocationStatus above)
     *             }
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
     * @return the List Proximity Placement Group operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByResourceGroup(String resourceGroupName, RequestOptions requestOptions) {
        return this.serviceClient.listByResourceGroupAsync(resourceGroupName, requestOptions);
    }
}
