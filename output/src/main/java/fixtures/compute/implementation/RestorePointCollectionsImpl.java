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

/** An instance of this class provides access to all the operations defined in RestorePointCollections. */
public final class RestorePointCollectionsImpl {
    /** The proxy service used to perform REST calls. */
    private final RestorePointCollectionsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of RestorePointCollectionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RestorePointCollectionsImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(
                        RestorePointCollectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientRestorePointCollections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface RestorePointCollectionsService {
        @Put(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/restorePointCollections/{restorePointCollectionName}")
        Mono<Response<BinaryData>> createOrUpdate(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("restorePointCollectionName") String restorePointCollectionName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Patch(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/restorePointCollections/{restorePointCollectionName}")
        Mono<Response<BinaryData>> update(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("restorePointCollectionName") String restorePointCollectionName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Delete(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/restorePointCollections/{restorePointCollectionName}")
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("restorePointCollectionName") String restorePointCollectionName,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/restorePointCollections/{restorePointCollectionName}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("restorePointCollectionName") String restorePointCollectionName,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/restorePointCollections")
        Mono<Response<BinaryData>> list(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @QueryParam("api-version") String apiVersion,
                RequestOptions requestOptions,
                Context context);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/restorePointCollections")
        Mono<Response<BinaryData>> listAll(
                @HostParam("$host") String host,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> listAllNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * The operation to create or update the restore point collection. Please refer to https://aka.ms/RestorePoints for
     * more details. When updating a restore point collection, only tags may be modified.
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
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
     * @param parameters Parameters supplied to the Create or Update restore point collection operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.createOrUpdate(
                                this.client.getHost(),
                                this.client.getSubscriptionId(),
                                resourceGroupName,
                                restorePointCollectionName,
                                this.client.getServiceVersion().getVersion(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * The operation to create or update the restore point collection. Please refer to https://aka.ms/RestorePoints for
     * more details. When updating a restore point collection, only tags may be modified.
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
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
     * @param parameters Parameters supplied to the Create or Update restore point collection operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.createOrUpdate(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                restorePointCollectionName,
                this.client.getServiceVersion().getVersion(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * The operation to create or update the restore point collection. Please refer to https://aka.ms/RestorePoints for
     * more details. When updating a restore point collection, only tags may be modified.
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
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
     * @param parameters Parameters supplied to the Create or Update restore point collection operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String resourceGroupName,
            String restorePointCollectionName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return createOrUpdateWithResponseAsync(
                        resourceGroupName, restorePointCollectionName, parameters, requestOptions, context)
                .block();
    }

    /**
     * The operation to update the restore point collection.
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
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
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param parameters Parameters supplied to the Update restore point collection operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            BinaryData parameters,
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.update(
                                this.client.getHost(),
                                this.client.getSubscriptionId(),
                                resourceGroupName,
                                restorePointCollectionName,
                                this.client.getServiceVersion().getVersion(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * The operation to update the restore point collection.
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
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
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param parameters Parameters supplied to the Update restore point collection operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.update(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                restorePointCollectionName,
                this.client.getServiceVersion().getVersion(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * The operation to update the restore point collection.
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
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
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param parameters Parameters supplied to the Update restore point collection operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String restorePointCollectionName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return updateWithResponseAsync(
                        resourceGroupName, restorePointCollectionName, parameters, requestOptions, context)
                .block();
    }

    /**
     * The operation to delete the restore point collection. This operation will also delete all the contained restore
     * points.
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
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String restorePointCollectionName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.delete(
                                this.client.getHost(),
                                this.client.getSubscriptionId(),
                                resourceGroupName,
                                restorePointCollectionName,
                                this.client.getServiceVersion().getVersion(),
                                requestOptions,
                                context));
    }

    /**
     * The operation to delete the restore point collection. This operation will also delete all the contained restore
     * points.
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
            RequestOptions requestOptions,
            Context context) {
        return service.delete(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                restorePointCollectionName,
                this.client.getServiceVersion().getVersion(),
                requestOptions,
                context);
    }

    /**
     * The operation to delete the restore point collection. This operation will also delete all the contained restore
     * points.
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
            RequestOptions requestOptions,
            Context context) {
        return deleteWithResponseAsync(resourceGroupName, restorePointCollectionName, requestOptions, context).block();
    }

    /**
     * The operation to get the restore point collection.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. If expand=restorePoints, server will return all contained restore points in the restorePointCollection.</td></tr>
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String restorePointCollectionName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                this.client.getSubscriptionId(),
                                resourceGroupName,
                                restorePointCollectionName,
                                this.client.getServiceVersion().getVersion(),
                                requestOptions,
                                context));
    }

    /**
     * The operation to get the restore point collection.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. If expand=restorePoints, server will return all contained restore points in the restorePointCollection.</td></tr>
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName,
            String restorePointCollectionName,
            RequestOptions requestOptions,
            Context context) {
        return service.get(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                restorePointCollectionName,
                this.client.getServiceVersion().getVersion(),
                requestOptions,
                context);
    }

    /**
     * The operation to get the restore point collection.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. If expand=restorePoints, server will return all contained restore points in the restorePointCollection.</td></tr>
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
     *         source: {
     *             location: String
     *             id: String
     *         }
     *         provisioningState: String
     *         restorePointCollectionId: String
     *         restorePoints: [
     *             {
     *                 id: String
     *                 name: String
     *                 type: String
     *                 properties: {
     *                     excludeDisks: [
     *                         {
     *                             id: String
     *                         }
     *                     ]
     *                     sourceMetadata: {
     *                         hardwareProfile: {
     *                             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                             vmSizeProperties: {
     *                                 vCPUsAvailable: Integer
     *                                 vCPUsPerCore: Integer
     *                             }
     *                         }
     *                         storageProfile: {
     *                             osDisk: {
     *                                 osType: String(Windows/Linux)
     *                                 encryptionSettings: {
     *                                     diskEncryptionKey: {
     *                                         secretUrl: String
     *                                         sourceVault: {
     *                                             id: String
     *                                         }
     *                                     }
     *                                     keyEncryptionKey: {
     *                                         keyUrl: String
     *                                         sourceVault: (recursive schema, see sourceVault above)
     *                                     }
     *                                     enabled: Boolean
     *                                 }
     *                                 name: String
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: {
     *                                     id: String
     *                                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                     diskEncryptionSet: {
     *                                         id: String
     *                                     }
     *                                 }
     *                                 diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                             }
     *                             dataDisks: [
     *                                 {
     *                                     lun: Integer
     *                                     name: String
     *                                     caching: String(None/ReadOnly/ReadWrite)
     *                                     diskSizeGB: Integer
     *                                     managedDisk: (recursive schema, see managedDisk above)
     *                                     diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                 }
     *                             ]
     *                         }
     *                         osProfile: {
     *                             computerName: String
     *                             adminUsername: String
     *                             adminPassword: String
     *                             customData: String
     *                             windowsConfiguration: {
     *                                 provisionVMAgent: Boolean
     *                                 enableAutomaticUpdates: Boolean
     *                                 timeZone: String
     *                                 additionalUnattendContent: [
     *                                     {
     *                                         passName: String
     *                                         componentName: String
     *                                         settingName: String(AutoLogon/FirstLogonCommands)
     *                                         content: String
     *                                     }
     *                                 ]
     *                                 patchSettings: {
     *                                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                     enableHotpatching: Boolean
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                                 winRM: {
     *                                     listeners: [
     *                                         {
     *                                             protocol: String(Http/Https)
     *                                             certificateUrl: String
     *                                         }
     *                                     ]
     *                                 }
     *                             }
     *                             linuxConfiguration: {
     *                                 disablePasswordAuthentication: Boolean
     *                                 ssh: {
     *                                     publicKeys: [
     *                                         {
     *                                             path: String
     *                                             keyData: String
     *                                         }
     *                                     ]
     *                                 }
     *                                 provisionVMAgent: Boolean
     *                                 patchSettings: {
     *                                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                 }
     *                             }
     *                             secrets: [
     *                                 {
     *                                     sourceVault: (recursive schema, see sourceVault above)
     *                                     vaultCertificates: [
     *                                         {
     *                                             certificateUrl: String
     *                                             certificateStore: String
     *                                         }
     *                                     ]
     *                                 }
     *                             ]
     *                             allowExtensionOperations: Boolean
     *                             requireGuestProvisionSignal: Boolean
     *                         }
     *                         diagnosticsProfile: {
     *                             bootDiagnostics: {
     *                                 enabled: Boolean
     *                                 storageUri: String
     *                             }
     *                         }
     *                         licenseType: String
     *                         vmId: String
     *                         securityProfile: {
     *                             uefiSettings: {
     *                                 secureBootEnabled: Boolean
     *                                 vTpmEnabled: Boolean
     *                             }
     *                             encryptionAtHost: Boolean
     *                             securityType: String(TrustedLaunch)
     *                         }
     *                         location: String
     *                     }
     *                     provisioningState: String
     *                     consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                     provisioningDetails: {
     *                         creationTime: String
     *                         totalUsedSizeInBytes: Long
     *                         statusCode: Integer
     *                         statusMessage: String
     *                     }
     *                 }
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param restorePointCollectionName The name of the restore point collection.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return create or update Restore Point collection parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName,
            String restorePointCollectionName,
            RequestOptions requestOptions,
            Context context) {
        return getWithResponseAsync(resourceGroupName, restorePointCollectionName, requestOptions, context).block();
    }

    /**
     * Gets the list of restore point collections in a resource group.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSinglePageAsync(
            String resourceGroupName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.list(
                                        this.client.getHost(),
                                        this.client.getSubscriptionId(),
                                        resourceGroupName,
                                        this.client.getServiceVersion().getVersion(),
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
     * Gets the list of restore point collections in a resource group.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSinglePageAsync(
            String resourceGroupName, RequestOptions requestOptions, Context context) {
        return service.list(
                        this.client.getHost(),
                        this.client.getSubscriptionId(),
                        resourceGroupName,
                        this.client.getServiceVersion().getVersion(),
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
     * Gets the list of restore point collections in a resource group.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(String resourceGroupName, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(resourceGroupName, requestOptions),
                nextLink -> listNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets the list of restore point collections in a resource group.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(String resourceGroupName, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(resourceGroupName, requestOptions, context),
                nextLink -> listNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets the list of restore point collections in a resource group.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String resourceGroupName, RequestOptions requestOptions) {
        return new PagedIterable<>(listAsync(resourceGroupName, requestOptions));
    }

    /**
     * Gets the list of restore point collections in a resource group.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String resourceGroupName, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, requestOptions, context));
    }

    /**
     * Gets the list of restore point collections in the subscription. Use nextLink property in the response to get the
     * next page of restore point collections. Do this till nextLink is not null to fetch all the restore point
     * collections.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listAllSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.listAll(
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
     * Gets the list of restore point collections in the subscription. Use nextLink property in the response to get the
     * next page of restore point collections. Do this till nextLink is not null to fetch all the restore point
     * collections.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listAllSinglePageAsync(RequestOptions requestOptions, Context context) {
        return service.listAll(
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
     * Gets the list of restore point collections in the subscription. Use nextLink property in the response to get the
     * next page of restore point collections. Do this till nextLink is not null to fetch all the restore point
     * collections.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAllAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listAllSinglePageAsync(requestOptions), nextLink -> listAllNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets the list of restore point collections in the subscription. Use nextLink property in the response to get the
     * next page of restore point collections. Do this till nextLink is not null to fetch all the restore point
     * collections.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAllAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listAllSinglePageAsync(requestOptions, context),
                nextLink -> listAllNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets the list of restore point collections in the subscription. Use nextLink property in the response to get the
     * next page of restore point collections. Do this till nextLink is not null to fetch all the restore point
     * collections.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAll(RequestOptions requestOptions) {
        return new PagedIterable<>(listAllAsync(requestOptions));
    }

    /**
     * Gets the list of restore point collections in the subscription. Use nextLink property in the response to get the
     * next page of restore point collections. Do this till nextLink is not null to fetch all the restore point
     * collections.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the list of restore point collections in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAll(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listAllAsync(requestOptions, context));
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the List restore point collection operation response.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the List restore point collection operation response.
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the List restore point collection operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listAllNextSinglePageAsync(String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.listAllNext(nextLink, this.client.getHost(), requestOptions, context))
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
     *                 source: {
     *                     location: String
     *                     id: String
     *                 }
     *                 provisioningState: String
     *                 restorePointCollectionId: String
     *                 restorePoints: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             excludeDisks: [
     *                                 {
     *                                     id: String
     *                                 }
     *                             ]
     *                             sourceMetadata: {
     *                                 hardwareProfile: {
     *                                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                                     vmSizeProperties: {
     *                                         vCPUsAvailable: Integer
     *                                         vCPUsPerCore: Integer
     *                                     }
     *                                 }
     *                                 storageProfile: {
     *                                     osDisk: {
     *                                         osType: String(Windows/Linux)
     *                                         encryptionSettings: {
     *                                             diskEncryptionKey: {
     *                                                 secretUrl: String
     *                                                 sourceVault: {
     *                                                     id: String
     *                                                 }
     *                                             }
     *                                             keyEncryptionKey: {
     *                                                 keyUrl: String
     *                                                 sourceVault: (recursive schema, see sourceVault above)
     *                                             }
     *                                             enabled: Boolean
     *                                         }
     *                                         name: String
     *                                         caching: String(None/ReadOnly/ReadWrite)
     *                                         diskSizeGB: Integer
     *                                         managedDisk: {
     *                                             id: String
     *                                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                             diskEncryptionSet: {
     *                                                 id: String
     *                                             }
     *                                         }
     *                                         diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                     }
     *                                     dataDisks: [
     *                                         {
     *                                             lun: Integer
     *                                             name: String
     *                                             caching: String(None/ReadOnly/ReadWrite)
     *                                             diskSizeGB: Integer
     *                                             managedDisk: (recursive schema, see managedDisk above)
     *                                             diskRestorePoint: (recursive schema, see diskRestorePoint above)
     *                                         }
     *                                     ]
     *                                 }
     *                                 osProfile: {
     *                                     computerName: String
     *                                     adminUsername: String
     *                                     adminPassword: String
     *                                     customData: String
     *                                     windowsConfiguration: {
     *                                         provisionVMAgent: Boolean
     *                                         enableAutomaticUpdates: Boolean
     *                                         timeZone: String
     *                                         additionalUnattendContent: [
     *                                             {
     *                                                 passName: String
     *                                                 componentName: String
     *                                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                                 content: String
     *                                             }
     *                                         ]
     *                                         patchSettings: {
     *                                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                             enableHotpatching: Boolean
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                         winRM: {
     *                                             listeners: [
     *                                                 {
     *                                                     protocol: String(Http/Https)
     *                                                     certificateUrl: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     }
     *                                     linuxConfiguration: {
     *                                         disablePasswordAuthentication: Boolean
     *                                         ssh: {
     *                                             publicKeys: [
     *                                                 {
     *                                                     path: String
     *                                                     keyData: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                         provisionVMAgent: Boolean
     *                                         patchSettings: {
     *                                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                                         }
     *                                     }
     *                                     secrets: [
     *                                         {
     *                                             sourceVault: (recursive schema, see sourceVault above)
     *                                             vaultCertificates: [
     *                                                 {
     *                                                     certificateUrl: String
     *                                                     certificateStore: String
     *                                                 }
     *                                             ]
     *                                         }
     *                                     ]
     *                                     allowExtensionOperations: Boolean
     *                                     requireGuestProvisionSignal: Boolean
     *                                 }
     *                                 diagnosticsProfile: {
     *                                     bootDiagnostics: {
     *                                         enabled: Boolean
     *                                         storageUri: String
     *                                     }
     *                                 }
     *                                 licenseType: String
     *                                 vmId: String
     *                                 securityProfile: {
     *                                     uefiSettings: {
     *                                         secureBootEnabled: Boolean
     *                                         vTpmEnabled: Boolean
     *                                     }
     *                                     encryptionAtHost: Boolean
     *                                     securityType: String(TrustedLaunch)
     *                                 }
     *                                 location: String
     *                             }
     *                             provisioningState: String
     *                             consistencyMode: String(CrashConsistent/FileSystemConsistent/ApplicationConsistent)
     *                             provisioningDetails: {
     *                                 creationTime: String
     *                                 totalUsedSizeInBytes: Long
     *                                 statusCode: Integer
     *                                 statusMessage: String
     *                             }
     *                         }
     *                     }
     *                 ]
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
     * @return the List restore point collection operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listAllNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.listAllNext(nextLink, this.client.getHost(), requestOptions, context)
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
