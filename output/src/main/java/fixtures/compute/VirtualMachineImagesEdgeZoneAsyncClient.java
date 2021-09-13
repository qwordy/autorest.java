package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.VirtualMachineImagesEdgeZonesImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class VirtualMachineImagesEdgeZoneAsyncClient {
    private final VirtualMachineImagesEdgeZonesImpl serviceClient;

    /**
     * Initializes an instance of VirtualMachineImagesEdgeZones client.
     *
     * @param serviceClient the service client implementation.
     */
    VirtualMachineImagesEdgeZoneAsyncClient(VirtualMachineImagesEdgeZonesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets a virtual machine image in an edge zone.
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
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a virtual machine image in an edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String location,
            String edgeZone,
            String publisherName,
            String offer,
            String skus,
            String version,
            RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(
                location, edgeZone, publisherName, offer, skus, version, requestOptions);
    }

    /**
     * Gets a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     * SKU.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation.</td></tr>
     *     <tr><td>top</td><td>String</td><td>No</td><td>An integer value specifying the number of images to return that matches supplied values.</td></tr>
     *     <tr><td>orderby</td><td>String</td><td>No</td><td>Specifies the order of the results returned. Formatted as an OData query.</td></tr>
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
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of all virtual machine image versions for the specified location, edge zone, publisher, offer, and
     *     SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listWithResponse(
            String location,
            String edgeZone,
            String publisherName,
            String offer,
            String skus,
            RequestOptions requestOptions) {
        return this.serviceClient.listWithResponseAsync(location, edgeZone, publisherName, offer, skus, requestOptions);
    }

    /**
     * Gets a list of virtual machine image offers for the specified location, edge zone and publisher.
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
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image offers for the specified location, edge zone and publisher.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listOffersWithResponse(
            String location, String edgeZone, String publisherName, RequestOptions requestOptions) {
        return this.serviceClient.listOffersWithResponseAsync(location, edgeZone, publisherName, requestOptions);
    }

    /**
     * Gets a list of virtual machine image publishers for the specified Azure location and edge zone.
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
     * @param edgeZone The name of the edge zone.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image publishers for the specified Azure location and edge zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listPublishersWithResponse(
            String location, String edgeZone, RequestOptions requestOptions) {
        return this.serviceClient.listPublishersWithResponseAsync(location, edgeZone, requestOptions);
    }

    /**
     * Gets a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
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
     * @param edgeZone The name of the edge zone.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of virtual machine image SKUs for the specified location, edge zone, publisher, and offer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listSkusWithResponse(
            String location, String edgeZone, String publisherName, String offer, RequestOptions requestOptions) {
        return this.serviceClient.listSkusWithResponseAsync(location, edgeZone, publisherName, offer, requestOptions);
    }
}
