package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.compute.implementation.ImagesImpl;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class ImagesClient {
    private final ImagesImpl serviceClient;

    /**
     * Initializes an instance of Images client.
     *
     * @param serviceClient the service client implementation.
     */
    ImagesClient(ImagesImpl serviceClient) {
        this.serviceClient = serviceClient;
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
        return this.serviceClient.createOrUpdateWithResponse(
                resourceGroupName, imageName, parameters, requestOptions, context);
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
        return this.serviceClient.updateWithResponse(resourceGroupName, imageName, parameters, requestOptions, context);
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
        return this.serviceClient.deleteWithResponse(resourceGroupName, imageName, requestOptions, context);
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
        return this.serviceClient.getWithResponse(resourceGroupName, imageName, requestOptions, context);
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
        return this.serviceClient.listByResourceGroup(resourceGroupName, requestOptions);
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
        return this.serviceClient.listByResourceGroup(resourceGroupName, requestOptions, context);
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
        return this.serviceClient.list(requestOptions);
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
        return this.serviceClient.list(requestOptions, context);
    }
}
