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

/** An instance of this class provides access to all the operations defined in AvailabilitySets. */
public final class AvailabilitySetsImpl {
    /** The proxy service used to perform REST calls. */
    private final AvailabilitySetsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of AvailabilitySetsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AvailabilitySetsImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(
                        AvailabilitySetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientAvailabilitySets to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface AvailabilitySetsService {
        @Put(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")
        Mono<Response<BinaryData>> createOrUpdate(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("availabilitySetName") String availabilitySetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Patch(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")
        Mono<Response<BinaryData>> update(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("availabilitySetName") String availabilitySetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Delete(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("availabilitySetName") String availabilitySetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("availabilitySetName") String availabilitySetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/availabilitySets")
        Mono<Response<BinaryData>> listBySubscription(
                @HostParam("$host") String host,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets")
        Mono<Response<BinaryData>> list(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}/vmSizes")
        Mono<Response<BinaryData>> listAvailableSizes(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("availabilitySetName") String availabilitySetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> listBySubscriptionNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
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
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName,
            String availabilitySetName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.createOrUpdate(
                                this.client.getHost(),
                                resourceGroupName,
                                availabilitySetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName,
            String availabilitySetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.createOrUpdate(
                this.client.getHost(),
                resourceGroupName,
                availabilitySetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String resourceGroupName,
            String availabilitySetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return createOrUpdateWithResponseAsync(
                        resourceGroupName, availabilitySetName, parameters, requestOptions, context)
                .block();
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
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String availabilitySetName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.update(
                                this.client.getHost(),
                                resourceGroupName,
                                availabilitySetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String availabilitySetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.update(
                this.client.getHost(),
                resourceGroupName,
                availabilitySetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String availabilitySetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return updateWithResponseAsync(resourceGroupName, availabilitySetName, parameters, requestOptions, context)
                .block();
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
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.delete(
                                this.client.getHost(),
                                resourceGroupName,
                                availabilitySetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions, Context context) {
        return service.delete(
                this.client.getHost(),
                resourceGroupName,
                availabilitySetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions, Context context) {
        return deleteWithResponseAsync(resourceGroupName, availabilitySetName, requestOptions, context).block();
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
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                resourceGroupName,
                                availabilitySetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions, Context context) {
        return service.get(
                this.client.getHost(),
                resourceGroupName,
                availabilitySetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions, Context context) {
        return getWithResponseAsync(resourceGroupName, availabilitySetName, requestOptions, context).block();
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listBySubscriptionSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.listBySubscription(
                                        this.client.getHost(),
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listBySubscriptionSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.listBySubscription(
                        this.client.getHost(),
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
    public PagedFlux<BinaryData> listBySubscriptionAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listBySubscriptionSinglePageAsync(requestOptions),
                nextLink -> listBySubscriptionNextSinglePageAsync(nextLink, null));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listBySubscriptionAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listBySubscriptionSinglePageAsync(requestOptions, context),
                nextLink -> listBySubscriptionNextSinglePageAsync(nextLink, null, context));
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
    public PagedIterable<BinaryData> listBySubscription(RequestOptions requestOptions) {
        return new PagedIterable<>(listBySubscriptionAsync(requestOptions));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listBySubscription(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listBySubscriptionAsync(requestOptions, context));
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSinglePageAsync(
            String resourceGroupName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.list(
                                        this.client.getHost(),
                                        resourceGroupName,
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSinglePageAsync(
            String resourceGroupName, RequestOptions requestOptions, Context context) {
        return service.list(
                        this.client.getHost(),
                        resourceGroupName,
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
    public PagedFlux<BinaryData> listAsync(String resourceGroupName, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(resourceGroupName, requestOptions),
                nextLink -> listNextSinglePageAsync(nextLink, null));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(String resourceGroupName, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(resourceGroupName, requestOptions, context),
                nextLink -> listNextSinglePageAsync(nextLink, null, context));
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
    public PagedIterable<BinaryData> list(String resourceGroupName, RequestOptions requestOptions) {
        return new PagedIterable<>(listAsync(resourceGroupName, requestOptions));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String resourceGroupName, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, requestOptions, context));
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listAvailableSizesSinglePageAsync(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.listAvailableSizes(
                                        this.client.getHost(),
                                        resourceGroupName,
                                        availabilitySetName,
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
                                        null,
                                        null));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listAvailableSizesSinglePageAsync(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions, Context context) {
        return service.listAvailableSizes(
                        this.client.getHost(),
                        resourceGroupName,
                        availabilitySetName,
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
                                        null,
                                        null));
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
    public PagedFlux<BinaryData> listAvailableSizesAsync(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listAvailableSizesSinglePageAsync(resourceGroupName, availabilitySetName, requestOptions));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAvailableSizesAsync(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () ->
                        listAvailableSizesSinglePageAsync(
                                resourceGroupName, availabilitySetName, requestOptions, context));
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
    public PagedIterable<BinaryData> listAvailableSizes(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions) {
        return new PagedIterable<>(listAvailableSizesAsync(resourceGroupName, availabilitySetName, requestOptions));
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
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAvailableSizes(
            String resourceGroupName, String availabilitySetName, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(
                listAvailableSizesAsync(resourceGroupName, availabilitySetName, requestOptions, context));
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
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listBySubscriptionNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.listBySubscriptionNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
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
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listBySubscriptionNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.listBySubscriptionNext(nextLink, this.client.getHost(), requestOptions, context)
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
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
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
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Availability Set operation response.
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
