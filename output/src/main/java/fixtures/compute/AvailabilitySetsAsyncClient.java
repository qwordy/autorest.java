package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.AvailabilitySetsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class AvailabilitySetsAsyncClient {
    private final AvailabilitySetsImpl serviceClient;

    /**
     * Initializes an instance of AvailabilitySets client.
     *
     * @param serviceClient the service client implementation.
     */
    AvailabilitySetsAsyncClient(AvailabilitySetsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create or update an availability set.
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
     *         platformUpdateDomainCount: Integer
     *         platformFaultDomainCount: Integer
     *         virtualMachines: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         statuses: [
     *             {
     *                 code: String
     *                 level: String(Info/Warning/Error)
     *                 displayStatus: String
     *                 message: String
     *                 time: String
     *             }
     *         ]
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
     * @param availabilitySetName The name of the availability set.
     * @param parameters Parameters supplied to the Create Availability Set operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String resourceGroupName,
            String availabilitySetName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                resourceGroupName, availabilitySetName, parameters, requestOptions);
    }

    /**
     * Update an availability set.
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
     *         platformUpdateDomainCount: Integer
     *         platformFaultDomainCount: Integer
     *         virtualMachines: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         statuses: [
     *             {
     *                 code: String
     *                 level: String(Info/Warning/Error)
     *                 displayStatus: String
     *                 message: String
     *                 time: String
     *             }
     *         ]
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
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Parameters supplied to the Update Availability Set operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponse(
            String resourceGroupName,
            String availabilitySetName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(
                resourceGroupName, availabilitySetName, parameters, requestOptions);
    }

    /**
     * Delete an availability set.
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
     * @param availabilitySetName The name of the availability set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, availabilitySetName, requestOptions);
    }

    /**
     * Retrieves information about an availability set.
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
     *         platformUpdateDomainCount: Integer
     *         platformFaultDomainCount: Integer
     *         virtualMachines: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         statuses: [
     *             {
     *                 code: String
     *                 level: String(Info/Warning/Error)
     *                 displayStatus: String
     *                 message: String
     *                 time: String
     *             }
     *         ]
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
     * @param availabilitySetName The name of the availability set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, availabilitySetName, requestOptions);
    }

    /**
     * Lists all availability sets in a subscription.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply to the operation. Allowed values are 'instanceView'.</td></tr>
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
     *                 platformUpdateDomainCount: Integer
     *                 platformFaultDomainCount: Integer
     *                 virtualMachines: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 statuses: [
     *                     {
     *                         code: String
     *                         level: String(Info/Warning/Error)
     *                         displayStatus: String
     *                         message: String
     *                         time: String
     *                     }
     *                 ]
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
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listBySubscription(RequestOptions requestOptions) {
        return this.serviceClient.listBySubscriptionAsync(requestOptions);
    }

    /**
     * Lists all availability sets in a resource group.
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
     *                 platformUpdateDomainCount: Integer
     *                 platformFaultDomainCount: Integer
     *                 virtualMachines: [
     *                     {
     *                         id: String
     *                     }
     *                 ]
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 statuses: [
     *                     {
     *                         code: String
     *                         level: String(Info/Warning/Error)
     *                         displayStatus: String
     *                         message: String
     *                         time: String
     *                     }
     *                 ]
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
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(String resourceGroupName, RequestOptions requestOptions) {
        return this.serviceClient.listAsync(resourceGroupName, requestOptions);
    }

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
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
     *             name: String
     *             numberOfCores: Integer
     *             osDiskSizeInMB: Integer
     *             resourceDiskSizeInMB: Integer
     *             memoryInMB: Integer
     *             maxDataDiskCount: Integer
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAvailableSizes(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions) {
        return this.serviceClient.listAvailableSizesAsync(resourceGroupName, availabilitySetName, requestOptions);
    }
}
