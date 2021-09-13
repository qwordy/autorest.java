package fixtures.compute.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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

/** An instance of this class provides access to all the operations defined in RestorePoints. */
public final class RestorePointsImpl {
    /** The proxy service used to perform REST calls. */
    private final RestorePointsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of RestorePointsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RestorePointsImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(RestorePointsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientRestorePoints to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface RestorePointsService {
        @Put(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/restorePointCollections/{restorePointCollectionName}/restorePoints/{restorePointName}")
        Mono<Response<BinaryData>> create(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("restorePointCollectionName") String restorePointCollectionName,
                @PathParam("restorePointName") String restorePointName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Delete(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/restorePointCollections/{restorePointCollectionName}/restorePoints/{restorePointName}")
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("restorePointCollectionName") String restorePointCollectionName,
                @PathParam("restorePointName") String restorePointName,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/restorePointCollections/{restorePointCollectionName}/restorePoints/{restorePointName}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("restorePointCollectionName") String restorePointCollectionName,
                @PathParam("restorePointName") String restorePointName,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
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
     *     properties: {
     *         excludeDisks: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         sourceMetadata: {
     *             hardwareProfile: {
     *                 vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                 vmSizeProperties: {
     *                     vCPUsAvailable: Integer
     *                     vCPUsPerCore: Integer
     *                 }
     *             }
     *             storageProfile: {
     *                 osDisk: {
     *                     osType: String(Windows/Linux)
     *                     encryptionSettings: {
     *                         diskEncryptionKey: {
     *                             secretUrl: String
     *                             sourceVault: {
     *                                 id: String
     *                             }
     *                         }
     *                         keyEncryptionKey: {
     *                             keyUrl: String
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                         }
     *                         enabled: Boolean
     *                     }
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     managedDisk: {
     *                         id: String
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                 }
     *                 dataDisks: [
     *                     {
     *                         lun: Integer
     *                         name: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                     }
     *                 ]
     *             }
     *             osProfile: {
     *                 computerName: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: {
     *                     provisionVMAgent: Boolean
     *                     enableAutomaticUpdates: Boolean
     *                     timeZone: String
     *                     additionalUnattendContent: [
     *                         {
     *                             passName: String
     *                             componentName: String
     *                             settingName: String(AutoLogon/FirstLogonCommands)
     *                             content: String
     *                         }
     *                     ]
     *                     patchSettings: {
     *                         patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                         enableHotpatching: Boolean
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                     winRM: {
     *                         listeners: [
     *                             {
     *                                 protocol: String(Http/Https)
     *                                 certificateUrl: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 linuxConfiguration: {
     *                     disablePasswordAuthentication: Boolean
     *                     ssh: {
     *                         publicKeys: [
     *                             {
     *                                 path: String
     *                                 keyData: String
     *                             }
     *                         ]
     *                     }
     *                     provisionVMAgent: Boolean
     *                     patchSettings: {
     *                         patchMode: String(ImageDefault/AutomaticByPlatform)
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                 }
     *                 secrets: [
     *                     {
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *                 allowExtensionOperations: Boolean
     *                 requireGuestProvisionSignal: Boolean
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             licenseType: String
     *             vmId: String
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             location: String
     *         }
     *         provisioningState: String
     *         consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *         provisioningDetails: {
     *             creationTime: String
     *             totalUsedSizeInBytes: Long
     *             statusCode: Integer
     *             statusMessage: String
     *         }
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
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.create(
                                this.client.getHost(),
                                this.client.getSubscriptionId(),
                                resourceGroupName,
                                restorePointCollectionName,
                                restorePointName,
                                this.client.getServiceVersion().getVersion(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
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
     *     properties: {
     *         excludeDisks: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         sourceMetadata: {
     *             hardwareProfile: {
     *                 vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                 vmSizeProperties: {
     *                     vCPUsAvailable: Integer
     *                     vCPUsPerCore: Integer
     *                 }
     *             }
     *             storageProfile: {
     *                 osDisk: {
     *                     osType: String(Windows/Linux)
     *                     encryptionSettings: {
     *                         diskEncryptionKey: {
     *                             secretUrl: String
     *                             sourceVault: {
     *                                 id: String
     *                             }
     *                         }
     *                         keyEncryptionKey: {
     *                             keyUrl: String
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                         }
     *                         enabled: Boolean
     *                     }
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     managedDisk: {
     *                         id: String
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                 }
     *                 dataDisks: [
     *                     {
     *                         lun: Integer
     *                         name: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                     }
     *                 ]
     *             }
     *             osProfile: {
     *                 computerName: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: {
     *                     provisionVMAgent: Boolean
     *                     enableAutomaticUpdates: Boolean
     *                     timeZone: String
     *                     additionalUnattendContent: [
     *                         {
     *                             passName: String
     *                             componentName: String
     *                             settingName: String(AutoLogon/FirstLogonCommands)
     *                             content: String
     *                         }
     *                     ]
     *                     patchSettings: {
     *                         patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                         enableHotpatching: Boolean
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                     winRM: {
     *                         listeners: [
     *                             {
     *                                 protocol: String(Http/Https)
     *                                 certificateUrl: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 linuxConfiguration: {
     *                     disablePasswordAuthentication: Boolean
     *                     ssh: {
     *                         publicKeys: [
     *                             {
     *                                 path: String
     *                                 keyData: String
     *                             }
     *                         ]
     *                     }
     *                     provisionVMAgent: Boolean
     *                     patchSettings: {
     *                         patchMode: String(ImageDefault/AutomaticByPlatform)
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                 }
     *                 secrets: [
     *                     {
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *                 allowExtensionOperations: Boolean
     *                 requireGuestProvisionSignal: Boolean
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             licenseType: String
     *             vmId: String
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             location: String
     *         }
     *         provisioningState: String
     *         consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *         provisioningDetails: {
     *             creationTime: String
     *             totalUsedSizeInBytes: Long
     *             statusCode: Integer
     *             statusMessage: String
     *         }
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
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.create(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                restorePointCollectionName,
                restorePointName,
                this.client.getServiceVersion().getVersion(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * The operation to create the restore point. Updating properties of an existing restore point is not allowed.
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
     *     properties: {
     *         excludeDisks: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         sourceMetadata: {
     *             hardwareProfile: {
     *                 vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                 vmSizeProperties: {
     *                     vCPUsAvailable: Integer
     *                     vCPUsPerCore: Integer
     *                 }
     *             }
     *             storageProfile: {
     *                 osDisk: {
     *                     osType: String(Windows/Linux)
     *                     encryptionSettings: {
     *                         diskEncryptionKey: {
     *                             secretUrl: String
     *                             sourceVault: {
     *                                 id: String
     *                             }
     *                         }
     *                         keyEncryptionKey: {
     *                             keyUrl: String
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                         }
     *                         enabled: Boolean
     *                     }
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     managedDisk: {
     *                         id: String
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                 }
     *                 dataDisks: [
     *                     {
     *                         lun: Integer
     *                         name: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                     }
     *                 ]
     *             }
     *             osProfile: {
     *                 computerName: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: {
     *                     provisionVMAgent: Boolean
     *                     enableAutomaticUpdates: Boolean
     *                     timeZone: String
     *                     additionalUnattendContent: [
     *                         {
     *                             passName: String
     *                             componentName: String
     *                             settingName: String(AutoLogon/FirstLogonCommands)
     *                             content: String
     *                         }
     *                     ]
     *                     patchSettings: {
     *                         patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                         enableHotpatching: Boolean
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                     winRM: {
     *                         listeners: [
     *                             {
     *                                 protocol: String(Http/Https)
     *                                 certificateUrl: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 linuxConfiguration: {
     *                     disablePasswordAuthentication: Boolean
     *                     ssh: {
     *                         publicKeys: [
     *                             {
     *                                 path: String
     *                                 keyData: String
     *                             }
     *                         ]
     *                     }
     *                     provisionVMAgent: Boolean
     *                     patchSettings: {
     *                         patchMode: String(ImageDefault/AutomaticByPlatform)
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                 }
     *                 secrets: [
     *                     {
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *                 allowExtensionOperations: Boolean
     *                 requireGuestProvisionSignal: Boolean
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             licenseType: String
     *             vmId: String
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             location: String
     *         }
     *         provisioningState: String
     *         consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *         provisioningDetails: {
     *             creationTime: String
     *             totalUsedSizeInBytes: Long
     *             statusCode: Integer
     *             statusMessage: String
     *         }
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
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param parameters Parameters supplied to the Create restore point operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createWithResponse(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return createWithResponseAsync(
                        resourceGroupName,
                        restorePointCollectionName,
                        restorePointName,
                        parameters,
                        requestOptions,
                        context)
                .block();
    }

    /**
     * The operation to delete the restore point.
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
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.delete(
                                this.client.getHost(),
                                this.client.getSubscriptionId(),
                                resourceGroupName,
                                restorePointCollectionName,
                                restorePointName,
                                this.client.getServiceVersion().getVersion(),
                                requestOptions,
                                context));
    }

    /**
     * The operation to delete the restore point.
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
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            RequestOptions requestOptions,
            Context context) {
        return service.delete(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                restorePointCollectionName,
                restorePointName,
                this.client.getServiceVersion().getVersion(),
                requestOptions,
                context);
    }

    /**
     * The operation to delete the restore point.
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
     * @param restorePointCollectionName The name of the Restore Point Collection.
     * @param restorePointName The name of the restore point.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            RequestOptions requestOptions,
            Context context) {
        return deleteWithResponseAsync(
                        resourceGroupName, restorePointCollectionName, restorePointName, requestOptions, context)
                .block();
    }

    /**
     * The operation to get the restore point.
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
     *     properties: {
     *         excludeDisks: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         sourceMetadata: {
     *             hardwareProfile: {
     *                 vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                 vmSizeProperties: {
     *                     vCPUsAvailable: Integer
     *                     vCPUsPerCore: Integer
     *                 }
     *             }
     *             storageProfile: {
     *                 osDisk: {
     *                     osType: String(Windows/Linux)
     *                     encryptionSettings: {
     *                         diskEncryptionKey: {
     *                             secretUrl: String
     *                             sourceVault: {
     *                                 id: String
     *                             }
     *                         }
     *                         keyEncryptionKey: {
     *                             keyUrl: String
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                         }
     *                         enabled: Boolean
     *                     }
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     managedDisk: {
     *                         id: String
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                 }
     *                 dataDisks: [
     *                     {
     *                         lun: Integer
     *                         name: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                     }
     *                 ]
     *             }
     *             osProfile: {
     *                 computerName: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: {
     *                     provisionVMAgent: Boolean
     *                     enableAutomaticUpdates: Boolean
     *                     timeZone: String
     *                     additionalUnattendContent: [
     *                         {
     *                             passName: String
     *                             componentName: String
     *                             settingName: String(AutoLogon/FirstLogonCommands)
     *                             content: String
     *                         }
     *                     ]
     *                     patchSettings: {
     *                         patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                         enableHotpatching: Boolean
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                     winRM: {
     *                         listeners: [
     *                             {
     *                                 protocol: String(Http/Https)
     *                                 certificateUrl: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 linuxConfiguration: {
     *                     disablePasswordAuthentication: Boolean
     *                     ssh: {
     *                         publicKeys: [
     *                             {
     *                                 path: String
     *                                 keyData: String
     *                             }
     *                         ]
     *                     }
     *                     provisionVMAgent: Boolean
     *                     patchSettings: {
     *                         patchMode: String(ImageDefault/AutomaticByPlatform)
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                 }
     *                 secrets: [
     *                     {
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *                 allowExtensionOperations: Boolean
     *                 requireGuestProvisionSignal: Boolean
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             licenseType: String
     *             vmId: String
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             location: String
     *         }
     *         provisioningState: String
     *         consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *         provisioningDetails: {
     *             creationTime: String
     *             totalUsedSizeInBytes: Long
     *             statusCode: Integer
     *             statusMessage: String
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                this.client.getSubscriptionId(),
                                resourceGroupName,
                                restorePointCollectionName,
                                restorePointName,
                                this.client.getServiceVersion().getVersion(),
                                requestOptions,
                                context));
    }

    /**
     * The operation to get the restore point.
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
     *     properties: {
     *         excludeDisks: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         sourceMetadata: {
     *             hardwareProfile: {
     *                 vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                 vmSizeProperties: {
     *                     vCPUsAvailable: Integer
     *                     vCPUsPerCore: Integer
     *                 }
     *             }
     *             storageProfile: {
     *                 osDisk: {
     *                     osType: String(Windows/Linux)
     *                     encryptionSettings: {
     *                         diskEncryptionKey: {
     *                             secretUrl: String
     *                             sourceVault: {
     *                                 id: String
     *                             }
     *                         }
     *                         keyEncryptionKey: {
     *                             keyUrl: String
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                         }
     *                         enabled: Boolean
     *                     }
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     managedDisk: {
     *                         id: String
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                 }
     *                 dataDisks: [
     *                     {
     *                         lun: Integer
     *                         name: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                     }
     *                 ]
     *             }
     *             osProfile: {
     *                 computerName: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: {
     *                     provisionVMAgent: Boolean
     *                     enableAutomaticUpdates: Boolean
     *                     timeZone: String
     *                     additionalUnattendContent: [
     *                         {
     *                             passName: String
     *                             componentName: String
     *                             settingName: String(AutoLogon/FirstLogonCommands)
     *                             content: String
     *                         }
     *                     ]
     *                     patchSettings: {
     *                         patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                         enableHotpatching: Boolean
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                     winRM: {
     *                         listeners: [
     *                             {
     *                                 protocol: String(Http/Https)
     *                                 certificateUrl: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 linuxConfiguration: {
     *                     disablePasswordAuthentication: Boolean
     *                     ssh: {
     *                         publicKeys: [
     *                             {
     *                                 path: String
     *                                 keyData: String
     *                             }
     *                         ]
     *                     }
     *                     provisionVMAgent: Boolean
     *                     patchSettings: {
     *                         patchMode: String(ImageDefault/AutomaticByPlatform)
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                 }
     *                 secrets: [
     *                     {
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *                 allowExtensionOperations: Boolean
     *                 requireGuestProvisionSignal: Boolean
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             licenseType: String
     *             vmId: String
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             location: String
     *         }
     *         provisioningState: String
     *         consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *         provisioningDetails: {
     *             creationTime: String
     *             totalUsedSizeInBytes: Long
     *             statusCode: Integer
     *             statusMessage: String
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            RequestOptions requestOptions,
            Context context) {
        return service.get(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                restorePointCollectionName,
                restorePointName,
                this.client.getServiceVersion().getVersion(),
                requestOptions,
                context);
    }

    /**
     * The operation to get the restore point.
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
     *     properties: {
     *         excludeDisks: [
     *             {
     *                 id: String
     *             }
     *         ]
     *         sourceMetadata: {
     *             hardwareProfile: {
     *                 vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                 vmSizeProperties: {
     *                     vCPUsAvailable: Integer
     *                     vCPUsPerCore: Integer
     *                 }
     *             }
     *             storageProfile: {
     *                 osDisk: {
     *                     osType: String(Windows/Linux)
     *                     encryptionSettings: {
     *                         diskEncryptionKey: {
     *                             secretUrl: String
     *                             sourceVault: {
     *                                 id: String
     *                             }
     *                         }
     *                         keyEncryptionKey: {
     *                             keyUrl: String
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                         }
     *                         enabled: Boolean
     *                     }
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     diskSizeGB: Integer
     *                     managedDisk: {
     *                         id: String
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                 }
     *                 dataDisks: [
     *                     {
     *                         lun: Integer
     *                         name: String
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                     }
     *                 ]
     *             }
     *             osProfile: {
     *                 computerName: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: {
     *                     provisionVMAgent: Boolean
     *                     enableAutomaticUpdates: Boolean
     *                     timeZone: String
     *                     additionalUnattendContent: [
     *                         {
     *                             passName: String
     *                             componentName: String
     *                             settingName: String(AutoLogon/FirstLogonCommands)
     *                             content: String
     *                         }
     *                     ]
     *                     patchSettings: {
     *                         patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                         enableHotpatching: Boolean
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                     winRM: {
     *                         listeners: [
     *                             {
     *                                 protocol: String(Http/Https)
     *                                 certificateUrl: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 linuxConfiguration: {
     *                     disablePasswordAuthentication: Boolean
     *                     ssh: {
     *                         publicKeys: [
     *                             {
     *                                 path: String
     *                                 keyData: String
     *                             }
     *                         ]
     *                     }
     *                     provisionVMAgent: Boolean
     *                     patchSettings: {
     *                         patchMode: String(ImageDefault/AutomaticByPlatform)
     *                         assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                     }
     *                 }
     *                 secrets: [
     *                     {
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *                 allowExtensionOperations: Boolean
     *                 requireGuestProvisionSignal: Boolean
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             licenseType: String
     *             vmId: String
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             location: String
     *         }
     *         provisioningState: String
     *         consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *         provisioningDetails: {
     *             creationTime: String
     *             totalUsedSizeInBytes: Long
     *             statusCode: Integer
     *             statusMessage: String
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param restorePointName The name of the restore point.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return restore Point details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName,
            String restorePointCollectionName,
            String restorePointName,
            RequestOptions requestOptions,
            Context context) {
        return getWithResponseAsync(
                        resourceGroupName, restorePointCollectionName, restorePointName, requestOptions, context)
                .block();
    }
}
