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

/** An instance of this class provides access to all the operations defined in Images. */
public final class ImagesImpl {
    /** The proxy service used to perform REST calls. */
    private final ImagesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of ImagesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ImagesImpl(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(ImagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientImages to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface ImagesService {
        @Put(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}")
        Mono<Response<BinaryData>> createOrUpdate(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("imageName") String imageName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Patch(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}")
        Mono<Response<BinaryData>> update(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("imageName") String imageName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Delete(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}")
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("imageName") String imageName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("imageName") String imageName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images")
        Mono<Response<BinaryData>> listByResourceGroup(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/images")
        Mono<Response<BinaryData>> list(
                @HostParam("$host") String host,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> listByResourceGroupNext(
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
     * Create or update an image.
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
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
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Create Image operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName, String imageName, BinaryData parameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.createOrUpdate(
                                this.client.getHost(),
                                resourceGroupName,
                                imageName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Create or update an image.
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
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
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Create Image operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName,
            String imageName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.createOrUpdate(
                this.client.getHost(),
                resourceGroupName,
                imageName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Create or update an image.
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
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
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Create Image operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String resourceGroupName,
            String imageName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, imageName, parameters, requestOptions, context)
                .block();
    }

    /**
     * Update an image.
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
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
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Update Image operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName, String imageName, BinaryData parameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.update(
                                this.client.getHost(),
                                resourceGroupName,
                                imageName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Update an image.
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
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
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Update Image operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String imageName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.update(
                this.client.getHost(),
                resourceGroupName,
                imageName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Update an image.
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
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
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param parameters Parameters supplied to the Update Image operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the source user image virtual hard disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String imageName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return updateWithResponseAsync(resourceGroupName, imageName, parameters, requestOptions, context).block();
    }

    /**
     * Deletes an Image.
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
     * @param imageName The name of the image.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String imageName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.delete(
                                this.client.getHost(),
                                resourceGroupName,
                                imageName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Deletes an Image.
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
     * @param imageName The name of the image.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String imageName, RequestOptions requestOptions, Context context) {
        return service.delete(
                this.client.getHost(),
                resourceGroupName,
                imageName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Deletes an Image.
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
     * @param imageName The name of the image.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String resourceGroupName, String imageName, RequestOptions requestOptions, Context context) {
        return deleteWithResponseAsync(resourceGroupName, imageName, requestOptions, context).block();
    }

    /**
     * Gets an image.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return an image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String imageName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                resourceGroupName,
                                imageName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets an image.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return an image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String imageName, RequestOptions requestOptions, Context context) {
        return service.get(
                this.client.getHost(),
                resourceGroupName,
                imageName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets an image.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
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
     *         sourceVirtualMachine: {
     *             id: String
     *         }
     *         storageProfile: {
     *             osDisk: {
     *                 snapshot: (recursive schema, see snapshot above)
     *                 managedDisk: (recursive schema, see managedDisk above)
     *                 blobUri: String
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 diskSizeGB: Integer
     *                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                 diskEncryptionSet: {
     *                     id: String
     *                 }
     *                 osType: String(Windows/Linux)
     *                 osState: String(Generalized/Specialized)
     *             }
     *             dataDisks: [
     *                 {
     *                     snapshot: (recursive schema, see snapshot above)
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     blobUri: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                     lun: int
     *                 }
     *             ]
     *             zoneResilient: Boolean
     *         }
     *         provisioningState: String
     *         hyperVGeneration: String(V1/V2)
     *     }
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param imageName The name of the image.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return an image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName, String imageName, RequestOptions requestOptions, Context context) {
        return getWithResponseAsync(resourceGroupName, imageName, requestOptions, context).block();
    }

    /**
     * Gets the list of images under a resource group.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listByResourceGroupSinglePageAsync(
            String resourceGroupName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.listByResourceGroup(
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
     * Gets the list of images under a resource group.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listByResourceGroupSinglePageAsync(
            String resourceGroupName, RequestOptions requestOptions, Context context) {
        return service.listByResourceGroup(
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
     * Gets the list of images under a resource group.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByResourceGroupAsync(String resourceGroupName, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listByResourceGroupSinglePageAsync(resourceGroupName, requestOptions),
                nextLink -> listByResourceGroupNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets the list of images under a resource group.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByResourceGroupAsync(
            String resourceGroupName, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listByResourceGroupSinglePageAsync(resourceGroupName, requestOptions, context),
                nextLink -> listByResourceGroupNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets the list of images under a resource group.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByResourceGroup(String resourceGroupName, RequestOptions requestOptions) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName, requestOptions));
    }

    /**
     * Gets the list of images under a resource group.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of images under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByResourceGroup(
            String resourceGroupName, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName, requestOptions, context));
    }

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.list(
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
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSinglePageAsync(RequestOptions requestOptions, Context context) {
        return service.list(
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
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(requestOptions), nextLink -> listNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(requestOptions, context),
                nextLink -> listNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        return new PagedIterable<>(listAsync(requestOptions));
    }

    /**
     * Gets the list of Images in the subscription. Use nextLink property in the response to get the next page of
     * Images. Do this till nextLink is null to fetch all the Images.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the list of Images in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listAsync(requestOptions, context));
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the List Image operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listByResourceGroupNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.listByResourceGroupNext(
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the List Image operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listByResourceGroupNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.listByResourceGroupNext(nextLink, this.client.getHost(), requestOptions, context)
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the List Image operation response.
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
     *                 sourceVirtualMachine: {
     *                     id: String
     *                 }
     *                 storageProfile: {
     *                     osDisk: {
     *                         snapshot: (recursive schema, see snapshot above)
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         blobUri: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                         osType: String(Windows/Linux)
     *                         osState: String(Generalized/Specialized)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             snapshot: (recursive schema, see snapshot above)
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             blobUri: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             diskSizeGB: Integer
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: (recursive schema, see diskEncryptionSet above)
     *                             lun: int
     *                         }
     *                     ]
     *                     zoneResilient: Boolean
     *                 }
     *                 provisioningState: String
     *                 hyperVGeneration: String(V1/V2)
     *             }
     *             extendedLocation: {
     *                 name: String
     *                 type: String(EdgeZone)
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
     * @return the List Image operation response.
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
