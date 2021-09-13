package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.compute.implementation.VirtualMachineImagesImpl;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class VirtualMachineImagesClient {
    private final VirtualMachineImagesImpl serviceClient;

    /**
     * Initializes an instance of VirtualMachineImages client.
     *
     * @param serviceClient the service client implementation.
     */
    VirtualMachineImagesClient(VirtualMachineImagesImpl serviceClient) {
        this.serviceClient = serviceClient;
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
        return this.serviceClient.getWithResponse(
                location, publisherName, offer, skus, version, requestOptions, context);
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
        return this.serviceClient.listWithResponse(location, publisherName, offer, skus, requestOptions, context);
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
        return this.serviceClient.listOffersWithResponse(location, publisherName, requestOptions, context);
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
        return this.serviceClient.listPublishersWithResponse(location, requestOptions, context);
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
        return this.serviceClient.listSkusWithResponse(location, publisherName, offer, requestOptions, context);
    }
}
