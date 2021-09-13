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

/** An instance of this class provides access to all the operations defined in VirtualMachineExtensionImages. */
public final class VirtualMachineExtensionImagesImpl {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachineExtensionImagesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineExtensionImagesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineExtensionImagesImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(
                        VirtualMachineExtensionImagesService.class,
                        client.getHttpPipeline(),
                        client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineExtensionImages to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineExtensionImagesService {
        @Get(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types/{type}/versions/{version}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @PathParam("publisherName") String publisherName,
                @PathParam("type") String type,
                @PathParam("version") String version,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types")
        Mono<Response<BinaryData>> listTypes(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @PathParam("publisherName") String publisherName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types/{type}/versions")
        Mono<Response<BinaryData>> listVersions(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @PathParam("publisherName") String publisherName,
                @PathParam("type") String type,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Gets a virtual machine extension image.
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
     *         operatingSystem: String
     *         computeRole: String
     *         handlerSchema: String
     *         vmScaleSetEnabled: Boolean
     *         supportsMultipleExtensions: Boolean
     *     }
     * }
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String location, String publisherName, String type, String version, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                location,
                                publisherName,
                                type,
                                version,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a virtual machine extension image.
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
     *         operatingSystem: String
     *         computeRole: String
     *         handlerSchema: String
     *         vmScaleSetEnabled: Boolean
     *         supportsMultipleExtensions: Boolean
     *     }
     * }
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String location,
            String publisherName,
            String type,
            String version,
            RequestOptions requestOptions,
            Context context) {
        return service.get(
                this.client.getHost(),
                location,
                publisherName,
                type,
                version,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a virtual machine extension image.
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
     *         operatingSystem: String
     *         computeRole: String
     *         handlerSchema: String
     *         vmScaleSetEnabled: Boolean
     *         supportsMultipleExtensions: Boolean
     *     }
     * }
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String location,
            String publisherName,
            String type,
            String version,
            RequestOptions requestOptions,
            Context context) {
        return getWithResponseAsync(location, publisherName, type, version, requestOptions, context).block();
    }

    /**
     * Gets a list of virtual machine extension image types.
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
     *         type: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         properties: {
     *             operatingSystem: String
     *             computeRole: String
     *             handlerSchema: String
     *             vmScaleSetEnabled: Boolean
     *             supportsMultipleExtensions: Boolean
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listTypesWithResponseAsync(
            String location, String publisherName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.listTypes(
                                this.client.getHost(),
                                location,
                                publisherName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a list of virtual machine extension image types.
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
     *         type: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         properties: {
     *             operatingSystem: String
     *             computeRole: String
     *             handlerSchema: String
     *             vmScaleSetEnabled: Boolean
     *             supportsMultipleExtensions: Boolean
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listTypesWithResponseAsync(
            String location, String publisherName, RequestOptions requestOptions, Context context) {
        return service.listTypes(
                this.client.getHost(),
                location,
                publisherName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a list of virtual machine extension image types.
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
     *         type: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         properties: {
     *             operatingSystem: String
     *             computeRole: String
     *             handlerSchema: String
     *             vmScaleSetEnabled: Boolean
     *             supportsMultipleExtensions: Boolean
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listTypesWithResponse(
            String location, String publisherName, RequestOptions requestOptions, Context context) {
        return listTypesWithResponseAsync(location, publisherName, requestOptions, context).block();
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply on the operation.</td></tr>
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
     *         type: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         properties: {
     *             operatingSystem: String
     *             computeRole: String
     *             handlerSchema: String
     *             vmScaleSetEnabled: Boolean
     *             supportsMultipleExtensions: Boolean
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listVersionsWithResponseAsync(
            String location, String publisherName, String type, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.listVersions(
                                this.client.getHost(),
                                location,
                                publisherName,
                                type,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply on the operation.</td></tr>
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
     *         type: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         properties: {
     *             operatingSystem: String
     *             computeRole: String
     *             handlerSchema: String
     *             vmScaleSetEnabled: Boolean
     *             supportsMultipleExtensions: Boolean
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listVersionsWithResponseAsync(
            String location, String publisherName, String type, RequestOptions requestOptions, Context context) {
        return service.listVersions(
                this.client.getHost(),
                location,
                publisherName,
                type,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>The filter to apply on the operation.</td></tr>
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
     *         type: String
     *         location: String
     *         tags: {
     *             String: String
     *         }
     *         properties: {
     *             operatingSystem: String
     *             computeRole: String
     *             handlerSchema: String
     *             vmScaleSetEnabled: Boolean
     *             supportsMultipleExtensions: Boolean
     *         }
     *     }
     * ]
     * }</pre>
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> listVersionsWithResponse(
            String location, String publisherName, String type, RequestOptions requestOptions, Context context) {
        return listVersionsWithResponseAsync(location, publisherName, type, requestOptions, context).block();
    }
}
