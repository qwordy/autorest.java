package fixtures.compute.implementation;

import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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

/** An instance of this class provides access to all the operations defined in VirtualMachineImages. */
public final class VirtualMachineImagesImpl {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachineImagesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineImagesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineImagesImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(
                        VirtualMachineImagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineImages to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineImagesService {
        @Get(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus/{skus}/versions/{version}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @PathParam("publisherName") String publisherName,
                @PathParam("offer") String offer,
                @PathParam("skus") String skus,
                @PathParam("version") String version,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus/{skus}/versions")
        Mono<Response<BinaryData>> list(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @PathParam("publisherName") String publisherName,
                @PathParam("offer") String offer,
                @PathParam("skus") String skus,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers")
        Mono<Response<BinaryData>> listOffers(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @PathParam("publisherName") String publisherName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers")
        Mono<Response<BinaryData>> listPublishers(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus")
        Mono<Response<BinaryData>> listSkus(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @PathParam("publisherName") String publisherName,
                @PathParam("offer") String offer,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Gets a virtual machine image.
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
     *     location: String
     *     tags: {
     *         String: String
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     *     properties: {
     *         plan: {
     *             publisher: String
     *             name: String
     *             product: String
     *         }
     *         osDiskImage: {
     *             operatingSystem: String(Windows/Linux)
     *         }
     *         dataDiskImages: [
     *             {
     *                 lun: Integer
     *             }
     *         ]
     *         automaticOSUpgradeProperties: {
     *             automaticOSUpgradeSupported: boolean
     *         }
     *         hyperVGeneration: String(V1/V2)
     *         disallowed: {
     *             vmDiskType: String(None/Unmanaged)
     *         }
     *         features: [
     *             {
     *                 name: String
     *                 value: String
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String location,
            String publisherName,
            String offer,
            String skus,
            String version,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                location,
                                publisherName,
                                offer,
                                skus,
                                version,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a virtual machine image.
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
     *     location: String
     *     tags: {
     *         String: String
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     *     properties: {
     *         plan: {
     *             publisher: String
     *             name: String
     *             product: String
     *         }
     *         osDiskImage: {
     *             operatingSystem: String(Windows/Linux)
     *         }
     *         dataDiskImages: [
     *             {
     *                 lun: Integer
     *             }
     *         ]
     *         automaticOSUpgradeProperties: {
     *             automaticOSUpgradeSupported: boolean
     *         }
     *         hyperVGeneration: String(V1/V2)
     *         disallowed: {
     *             vmDiskType: String(None/Unmanaged)
     *         }
     *         features: [
     *             {
     *                 name: String
     *                 value: String
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String location,
            String publisherName,
            String offer,
            String skus,
            String version,
            RequestOptions requestOptions,
            Context context) {
        return service.get(
                this.client.getHost(),
                location,
                publisherName,
                offer,
                skus,
                version,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a virtual machine image.
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
     *     location: String
     *     tags: {
     *         String: String
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     *     properties: {
     *         plan: {
     *             publisher: String
     *             name: String
     *             product: String
     *         }
     *         osDiskImage: {
     *             operatingSystem: String(Windows/Linux)
     *         }
     *         dataDiskImages: [
     *             {
     *                 lun: Integer
     *             }
     *         ]
     *         automaticOSUpgradeProperties: {
     *             automaticOSUpgradeSupported: boolean
     *         }
     *         hyperVGeneration: String(V1/V2)
     *         disallowed: {
     *             vmDiskType: String(None/Unmanaged)
     *         }
     *         features: [
     *             {
     *                 name: String
     *                 value: String
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String location,
            String publisherName,
            String offer,
            String skus,
            String version,
            RequestOptions requestOptions,
            Context context) {
        return getWithResponseAsync(location, publisherName, offer, skus, version, requestOptions, context).block();
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
     *     <tr><td>top</td><td>String</td><td>No</td><td>The top parameter</td></tr>
     *     <tr><td>orderby</td><td>String</td><td>No</td><td>The orderby parameter</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listWithResponseAsync(
            String location, String publisherName, String offer, String skus, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.list(
                                this.client.getHost(),
                                location,
                                publisherName,
                                offer,
                                skus,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
     *     <tr><td>top</td><td>String</td><td>No</td><td>The top parameter</td></tr>
     *     <tr><td>orderby</td><td>String</td><td>No</td><td>The orderby parameter</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listWithResponseAsync(
            String location,
            String publisherName,
            String offer,
            String skus,
            RequestOptions requestOptions,
            Context context) {
        return service.list(
                this.client.getHost(),
                location,
                publisherName,
                offer,
                skus,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
     *     <tr><td>top</td><td>String</td><td>No</td><td>The top parameter</td></tr>
     *     <tr><td>orderby</td><td>String</td><td>No</td><td>The orderby parameter</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listWithResponse(
            String location,
            String publisherName,
            String offer,
            String skus,
            RequestOptions requestOptions,
            Context context) {
        return listWithResponseAsync(location, publisherName, offer, skus, requestOptions, context).block();
    }

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image offers for the specified location and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listOffersWithResponseAsync(
            String location, String publisherName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.listOffers(
                                this.client.getHost(),
                                location,
                                publisherName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image offers for the specified location and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listOffersWithResponseAsync(
            String location, String publisherName, RequestOptions requestOptions, Context context) {
        return service.listOffers(
                this.client.getHost(),
                location,
                publisherName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image offers for the specified location and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listOffersWithResponse(
            String location, String publisherName, RequestOptions requestOptions, Context context) {
        return listOffersWithResponseAsync(location, publisherName, requestOptions, context).block();
    }

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image publishers for the specified Azure location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listPublishersWithResponseAsync(String location, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.listPublishers(
                                this.client.getHost(),
                                location,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image publishers for the specified Azure location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listPublishersWithResponseAsync(
            String location, RequestOptions requestOptions, Context context) {
        return service.listPublishers(
                this.client.getHost(),
                location,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image publishers for the specified Azure location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listPublishersWithResponse(
            String location, RequestOptions requestOptions, Context context) {
        return listPublishersWithResponseAsync(location, requestOptions, context).block();
    }

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image SKUs for the specified location, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listSkusWithResponseAsync(
            String location, String publisherName, String offer, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.listSkus(
                                this.client.getHost(),
                                location,
                                publisherName,
                                offer,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image SKUs for the specified location, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listSkusWithResponseAsync(
            String location, String publisherName, String offer, RequestOptions requestOptions, Context context) {
        return service.listSkus(
                this.client.getHost(),
                location,
                publisherName,
                offer,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
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
     * [
     *     {
     *         id: String
     *         name: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         extendedLocation: {
     *             name: String
     *             type: String(EdgeZone)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image SKUs for the specified location, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listSkusWithResponse(
            String location, String publisherName, String offer, RequestOptions requestOptions, Context context) {
        return listSkusWithResponseAsync(location, publisherName, offer, requestOptions, context).block();
    }
}
