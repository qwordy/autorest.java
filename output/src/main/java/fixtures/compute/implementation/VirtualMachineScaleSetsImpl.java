package fixtures.compute.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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

/** An instance of this class provides access to all the operations defined in VirtualMachineScaleSets. */
public final class VirtualMachineScaleSetsImpl {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachineScaleSetsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineScaleSetsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineScaleSetsImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(
                        VirtualMachineScaleSetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineScaleSets to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineScaleSetsService {
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/virtualMachineScaleSets")
        Mono<Response<BinaryData>> listByLocation(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Put(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}")
        Mono<Response<BinaryData>> createOrUpdate(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Patch(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}")
        Mono<Response<BinaryData>> update(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Delete(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}")
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}")
        Mono<Response<BinaryData>> get(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/deallocate")
        Mono<Response<Void>> deallocate(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/delete")
        Mono<Response<Void>> deleteInstances(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData vmInstanceIDs,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/instanceView")
        Mono<Response<BinaryData>> getInstanceView(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets")
        Mono<Response<BinaryData>> list(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/virtualMachineScaleSets")
        Mono<Response<BinaryData>> listAll(
                @HostParam("$host") String host,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/skus")
        Mono<Response<BinaryData>> listSkus(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Get(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osUpgradeHistory")
        Mono<Response<BinaryData>> getOSUpgradeHistory(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/poweroff")
        Mono<Response<Void>> powerOff(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/restart")
        Mono<Response<Void>> restart(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/start")
        Mono<Response<Void>> start(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/redeploy")
        Mono<Response<Void>> redeploy(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/performMaintenance")
        Mono<Response<Void>> performMaintenance(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/manualupgrade")
        Mono<Response<Void>> updateInstances(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData vmInstanceIDs,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/reimage")
        Mono<Response<Void>> reimage(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/reimageall")
        Mono<Response<Void>> reimageAll(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/forceRecoveryServiceFabricPlatformUpdateDomainWalk")
        Mono<Response<BinaryData>> forceRecoveryServiceFabricPlatformUpdateDomainWalk(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/convertToSinglePlacementGroup")
        Mono<Response<Void>> convertToSinglePlacementGroup(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/setOrchestrationServiceState")
        Mono<Response<Void>> setOrchestrationServiceState(
                @HostParam("$host") String host,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("vmScaleSetName") String vmScaleSetName,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> listByLocationNext(
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

        @Get("{nextLink}")
        Mono<Response<BinaryData>> listAllNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> listSkusNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getOSUpgradeHistoryNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Gets all the VM scale sets under the specified subscription for the specified location.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @param location The location for which VM scale sets under the subscription are queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return all the VM scale sets under the specified subscription for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listByLocationSinglePageAsync(
            String location, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.listByLocation(
                                        this.client.getHost(),
                                        location,
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
     * Gets all the VM scale sets under the specified subscription for the specified location.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @param location The location for which VM scale sets under the subscription are queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return all the VM scale sets under the specified subscription for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listByLocationSinglePageAsync(
            String location, RequestOptions requestOptions, Context context) {
        return service.listByLocation(
                        this.client.getHost(),
                        location,
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
     * Gets all the VM scale sets under the specified subscription for the specified location.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @param location The location for which VM scale sets under the subscription are queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return all the VM scale sets under the specified subscription for the specified location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByLocationAsync(String location, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listByLocationSinglePageAsync(location, requestOptions),
                nextLink -> listByLocationNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets all the VM scale sets under the specified subscription for the specified location.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @param location The location for which VM scale sets under the subscription are queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return all the VM scale sets under the specified subscription for the specified location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByLocationAsync(String location, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listByLocationSinglePageAsync(location, requestOptions, context),
                nextLink -> listByLocationNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets all the VM scale sets under the specified subscription for the specified location.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @param location The location for which VM scale sets under the subscription are queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return all the VM scale sets under the specified subscription for the specified location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByLocation(String location, RequestOptions requestOptions) {
        return new PagedIterable<>(listByLocationAsync(location, requestOptions));
    }

    /**
     * Gets all the VM scale sets under the specified subscription for the specified location.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @param location The location for which VM scale sets under the subscription are queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return all the VM scale sets under the specified subscription for the specified location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByLocation(String location, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listByLocationAsync(location, requestOptions, context));
    }

    /**
     * Create or update a VM scale set.
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
     *     }
     *     zones: [
     *         String
     *     ]
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
     * @param vmScaleSetName The name of the VM scale set to create or update.
     * @param parameters The scale set object.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, BinaryData parameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.createOrUpdate(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Create or update a VM scale set.
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
     *     }
     *     zones: [
     *         String
     *     ]
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
     * @param vmScaleSetName The name of the VM scale set to create or update.
     * @param parameters The scale set object.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.createOrUpdate(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Create or update a VM scale set.
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
     *     }
     *     zones: [
     *         String
     *     ]
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
     * @param vmScaleSetName The name of the VM scale set to create or update.
     * @param parameters The scale set object.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, vmScaleSetName, parameters, requestOptions, context)
                .block();
    }

    /**
     * Update a VM scale set.
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     diskSizeGB: Integer
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *         }
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         singlePlacementGroup: Boolean
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
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
     *     sku: (recursive schema, see sku above)
     *     plan: (recursive schema, see plan above)
     *     properties: {
     *         upgradePolicy: (recursive schema, see upgradePolicy above)
     *         automaticRepairsPolicy: (recursive schema, see automaticRepairsPolicy above)
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: (recursive schema, see windowsConfiguration above)
     *                 linuxConfiguration: (recursive schema, see linuxConfiguration above)
     *                 secrets: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: (recursive schema, see imageReference above)
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: (recursive schema, see image above)
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                 }
     *                 dataDisks: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: (recursive schema, see healthProbe above)
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: (recursive schema, see dnsSettings above)
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: (recursive schema, see dnsSettings above)
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: (recursive schema, see securityProfile above)
     *             diagnosticsProfile: (recursive schema, see diagnosticsProfile above)
     *             extensionProfile: (recursive schema, see extensionProfile above)
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: (recursive schema, see billingProfile above)
     *             scheduledEventsProfile: (recursive schema, see scheduledEventsProfile above)
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: (recursive schema, see additionalCapabilities above)
     *         scaleInPolicy: (recursive schema, see scaleInPolicy above)
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: (recursive schema, see identity above)
     *     zones: [
     *         String
     *     ]
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set to create or update.
     * @param parameters The scale set object.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, BinaryData parameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.update(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Update a VM scale set.
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     diskSizeGB: Integer
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *         }
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         singlePlacementGroup: Boolean
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
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
     *     sku: (recursive schema, see sku above)
     *     plan: (recursive schema, see plan above)
     *     properties: {
     *         upgradePolicy: (recursive schema, see upgradePolicy above)
     *         automaticRepairsPolicy: (recursive schema, see automaticRepairsPolicy above)
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: (recursive schema, see windowsConfiguration above)
     *                 linuxConfiguration: (recursive schema, see linuxConfiguration above)
     *                 secrets: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: (recursive schema, see imageReference above)
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: (recursive schema, see image above)
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                 }
     *                 dataDisks: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: (recursive schema, see healthProbe above)
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: (recursive schema, see dnsSettings above)
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: (recursive schema, see dnsSettings above)
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: (recursive schema, see securityProfile above)
     *             diagnosticsProfile: (recursive schema, see diagnosticsProfile above)
     *             extensionProfile: (recursive schema, see extensionProfile above)
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: (recursive schema, see billingProfile above)
     *             scheduledEventsProfile: (recursive schema, see scheduledEventsProfile above)
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: (recursive schema, see additionalCapabilities above)
     *         scaleInPolicy: (recursive schema, see scaleInPolicy above)
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: (recursive schema, see identity above)
     *     zones: [
     *         String
     *     ]
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set to create or update.
     * @param parameters The scale set object.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.update(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Update a VM scale set.
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     diskSizeGB: Integer
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *         }
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         singlePlacementGroup: Boolean
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
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
     *     sku: (recursive schema, see sku above)
     *     plan: (recursive schema, see plan above)
     *     properties: {
     *         upgradePolicy: (recursive schema, see upgradePolicy above)
     *         automaticRepairsPolicy: (recursive schema, see automaticRepairsPolicy above)
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
     *                 adminUsername: String
     *                 adminPassword: String
     *                 customData: String
     *                 windowsConfiguration: (recursive schema, see windowsConfiguration above)
     *                 linuxConfiguration: (recursive schema, see linuxConfiguration above)
     *                 secrets: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: (recursive schema, see imageReference above)
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: (recursive schema, see image above)
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                 }
     *                 dataDisks: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: (recursive schema, see healthProbe above)
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: (recursive schema, see dnsSettings above)
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: (recursive schema, see dnsSettings above)
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: (recursive schema, see securityProfile above)
     *             diagnosticsProfile: (recursive schema, see diagnosticsProfile above)
     *             extensionProfile: (recursive schema, see extensionProfile above)
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: (recursive schema, see billingProfile above)
     *             scheduledEventsProfile: (recursive schema, see scheduledEventsProfile above)
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: (recursive schema, see additionalCapabilities above)
     *         scaleInPolicy: (recursive schema, see scaleInPolicy above)
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: (recursive schema, see identity above)
     *     zones: [
     *         String
     *     ]
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set to create or update.
     * @param parameters The scale set object.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return updateWithResponseAsync(resourceGroupName, vmScaleSetName, parameters, requestOptions, context).block();
    }

    /**
     * Deletes a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete a VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.delete(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Deletes a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete a VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.delete(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Deletes a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete a VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return deleteWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Display information about a virtual machine scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'UserData' retrieves the UserData property of the VM scale set that was provided by the user during the VM scale set Create/Update operation</td></tr>
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
     *     }
     *     zones: [
     *         String
     *     ]
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Display information about a virtual machine scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'UserData' retrieves the UserData property of the VM scale set that was provided by the user during the VM scale set Create/Update operation</td></tr>
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
     *     }
     *     zones: [
     *         String
     *     ]
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.get(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Display information about a virtual machine scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'UserData' retrieves the UserData property of the VM scale set that was provided by the user during the VM scale set Create/Update operation</td></tr>
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
     *     sku: {
     *         name: String
     *         tier: String
     *         capacity: Long
     *     }
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         upgradePolicy: {
     *             mode: String(Automatic/Manual/Rolling)
     *             rollingUpgradePolicy: {
     *                 maxBatchInstancePercent: Integer
     *                 maxUnhealthyInstancePercent: Integer
     *                 maxUnhealthyUpgradedInstancePercent: Integer
     *                 pauseTimeBetweenBatches: String
     *                 enableCrossZoneUpgrade: Boolean
     *                 prioritizeUnhealthyInstances: Boolean
     *             }
     *             automaticOSUpgradePolicy: {
     *                 enableAutomaticOSUpgrade: Boolean
     *                 disableAutomaticRollback: Boolean
     *             }
     *         }
     *         automaticRepairsPolicy: {
     *             enabled: Boolean
     *             gracePeriod: String
     *         }
     *         virtualMachineProfile: {
     *             osProfile: {
     *                 computerNamePrefix: String
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
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                         vaultCertificates: [
     *                             {
     *                                 certificateUrl: String
     *                                 certificateStore: String
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *             storageProfile: {
     *                 imageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 osDisk: {
     *                     name: String
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diffDiskSettings: {
     *                         option: String(Local)
     *                         placement: String(CacheDisk/ResourceDisk)
     *                     }
     *                     diskSizeGB: Integer
     *                     osType: String(Windows/Linux)
     *                     image: {
     *                         uri: String
     *                     }
     *                     vhdContainers: [
     *                         String
     *                     ]
     *                     managedDisk: {
     *                         storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                         diskEncryptionSet: {
     *                             id: String
     *                         }
     *                     }
     *                 }
     *                 dataDisks: [
     *                     {
     *                         name: String
     *                         lun: int
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: (recursive schema, see managedDisk above)
     *                         diskIopsReadWrite: Long
     *                         diskMBpsReadWrite: Long
     *                     }
     *                 ]
     *             }
     *             networkProfile: {
     *                 healthProbe: {
     *                     id: String
     *                 }
     *                 networkInterfaceConfigurations: [
     *                     {
     *                         id: String
     *                         name: String
     *                         properties: {
     *                             primary: Boolean
     *                             enableAcceleratedNetworking: Boolean
     *                             enableFpga: Boolean
     *                             networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                             dnsSettings: {
     *                                 dnsServers: [
     *                                     String
     *                                 ]
     *                             }
     *                             ipConfigurations: [
     *                                 {
     *                                     id: String
     *                                     name: String
     *                                     properties: {
     *                                         subnet: (recursive schema, see subnet above)
     *                                         primary: Boolean
     *                                         publicIPAddressConfiguration: {
     *                                             name: String
     *                                             properties: {
     *                                                 idleTimeoutInMinutes: Integer
     *                                                 dnsSettings: {
     *                                                     domainNameLabel: String
     *                                                 }
     *                                                 ipTags: [
     *                                                     {
     *                                                         ipTagType: String
     *                                                         tag: String
     *                                                     }
     *                                                 ]
     *                                                 publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                 publicIPAddressVersion: String(IPv4/IPv6)
     *                                                 deleteOption: String(Delete/Detach)
     *                                             }
     *                                             sku: {
     *                                                 name: String(Basic/Standard)
     *                                                 tier: String(Regional/Global)
     *                                             }
     *                                         }
     *                                         privateIPAddressVersion: String(IPv4/IPv6)
     *                                         applicationGatewayBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         applicationSecurityGroups: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerBackendAddressPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                         loadBalancerInboundNatPools: [
     *                                             (recursive schema, see above)
     *                                         ]
     *                                     }
     *                                 }
     *                             ]
     *                             enableIPForwarding: Boolean
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     }
     *                 ]
     *                 networkApiVersion: String(2020-11-01)
     *             }
     *             securityProfile: {
     *                 uefiSettings: {
     *                     secureBootEnabled: Boolean
     *                     vTpmEnabled: Boolean
     *                 }
     *                 encryptionAtHost: Boolean
     *                 securityType: String(TrustedLaunch)
     *             }
     *             diagnosticsProfile: {
     *                 bootDiagnostics: {
     *                     enabled: Boolean
     *                     storageUri: String
     *                 }
     *             }
     *             extensionProfile: {
     *                 extensions: [
     *                     {
     *                         id: String
     *                         name: String
     *                         type: String
     *                         properties: {
     *                             forceUpdateTag: String
     *                             publisher: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             autoUpgradeMinorVersion: Boolean
     *                             enableAutomaticUpgrade: Boolean
     *                             settings: Object
     *                             protectedSettings: Object
     *                             provisioningState: String
     *                             provisionAfterExtensions: [
     *                                 String
     *                             ]
     *                             suppressFailures: Boolean
     *                         }
     *                     }
     *                 ]
     *                 extensionsTimeBudget: String
     *             }
     *             licenseType: String
     *             priority: String(Regular/Low/Spot)
     *             evictionPolicy: String(Deallocate/Delete)
     *             billingProfile: {
     *                 maxPrice: Double
     *             }
     *             scheduledEventsProfile: {
     *                 terminateNotificationProfile: {
     *                     notBeforeTimeout: String
     *                     enable: Boolean
     *                 }
     *             }
     *             userData: String
     *             capacityReservation: {
     *                 capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *             }
     *             applicationProfile: {
     *                 galleryApplications: [
     *                     {
     *                         tags: String
     *                         order: Integer
     *                         packageReferenceId: String
     *                         configurationReference: String
     *                     }
     *                 ]
     *             }
     *         }
     *         provisioningState: String
     *         overprovision: Boolean
     *         doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *         uniqueId: String
     *         singlePlacementGroup: Boolean
     *         zoneBalance: Boolean
     *         platformFaultDomainCount: Integer
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         scaleInPolicy: {
     *             rules: [
     *                 String(Default/OldestVM/NewestVM)
     *             ]
     *             forceDeletion: Boolean
     *         }
     *         orchestrationMode: String(Uniform/Flexible)
     *         spotRestorePolicy: {
     *             enabled: Boolean
     *             restoreTimeout: String
     *         }
     *     }
     *     identity: {
     *         principalId: String
     *         tenantId: String
     *         type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *         userAssignedIdentities: {
     *             String: {
     *                 principalId: String
     *                 clientId: String
     *             }
     *         }
     *     }
     *     zones: [
     *         String
     *     ]
     *     extendedLocation: {
     *         name: String
     *         type: String(EdgeZone)
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine Scale Set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return getWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Deallocates specific virtual machines in a VM scale set. Shuts down the virtual machines and releases the compute
     * resources. You are not billed for the compute resources that this virtual machine scale set deallocates.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deallocateWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.deallocate(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Deallocates specific virtual machines in a VM scale set. Shuts down the virtual machines and releases the compute
     * resources. You are not billed for the compute resources that this virtual machine scale set deallocates.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deallocateWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.deallocate(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Deallocates specific virtual machines in a VM scale set. Shuts down the virtual machines and releases the compute
     * resources. You are not billed for the compute resources that this virtual machine scale set deallocates.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deallocateWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return deallocateWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Deletes virtual machines in a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete virtual machines from the VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     instanceIds: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param vmInstanceIDs A list of virtual machine instance IDs from the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteInstancesWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, BinaryData vmInstanceIDs, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.deleteInstances(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                vmInstanceIDs,
                                requestOptions,
                                context));
    }

    /**
     * Deletes virtual machines in a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete virtual machines from the VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     instanceIds: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param vmInstanceIDs A list of virtual machine instance IDs from the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteInstancesWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData vmInstanceIDs,
            RequestOptions requestOptions,
            Context context) {
        return service.deleteInstances(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                vmInstanceIDs,
                requestOptions,
                context);
    }

    /**
     * Deletes virtual machines in a VM scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete virtual machines from the VM scale set. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     instanceIds: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param vmInstanceIDs A list of virtual machine instance IDs from the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteInstancesWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData vmInstanceIDs,
            RequestOptions requestOptions,
            Context context) {
        return deleteInstancesWithResponseAsync(
                        resourceGroupName, vmScaleSetName, vmInstanceIDs, requestOptions, context)
                .block();
    }

    /**
     * Gets the status of a VM scale set instance.
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
     *     virtualMachine: {
     *         statusesSummary: [
     *             {
     *                 code: String
     *                 count: Integer
     *             }
     *         ]
     *     }
     *     extensions: [
     *         {
     *             name: String
     *             statusesSummary: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     statuses: [
     *         {
     *             code: String
     *             level: String(Info/Warning/Error)
     *             displayStatus: String
     *             message: String
     *             time: String
     *         }
     *     ]
     *     orchestrationServices: [
     *         {
     *             serviceName: String(AutomaticRepairs)
     *             serviceState: String(NotRunning/Running/Suspended)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getInstanceViewWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.getInstanceView(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Gets the status of a VM scale set instance.
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
     *     virtualMachine: {
     *         statusesSummary: [
     *             {
     *                 code: String
     *                 count: Integer
     *             }
     *         ]
     *     }
     *     extensions: [
     *         {
     *             name: String
     *             statusesSummary: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     statuses: [
     *         {
     *             code: String
     *             level: String(Info/Warning/Error)
     *             displayStatus: String
     *             message: String
     *             time: String
     *         }
     *     ]
     *     orchestrationServices: [
     *         {
     *             serviceName: String(AutomaticRepairs)
     *             serviceState: String(NotRunning/Running/Suspended)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getInstanceViewWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.getInstanceView(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Gets the status of a VM scale set instance.
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
     *     virtualMachine: {
     *         statusesSummary: [
     *             {
     *                 code: String
     *                 count: Integer
     *             }
     *         ]
     *     }
     *     extensions: [
     *         {
     *             name: String
     *             statusesSummary: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     statuses: [
     *         {
     *             code: String
     *             level: String(Info/Warning/Error)
     *             displayStatus: String
     *             message: String
     *             time: String
     *         }
     *     ]
     *     orchestrationServices: [
     *         {
     *             serviceName: String(AutomaticRepairs)
     *             serviceState: String(NotRunning/Running/Suspended)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the status of a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getInstanceViewWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return getInstanceViewWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Gets a list of all VM scale sets under a resource group.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM scale sets under a resource group.
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
     * Gets a list of all VM scale sets under a resource group.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM scale sets under a resource group.
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
     * Gets a list of all VM scale sets under a resource group.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM scale sets under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(String resourceGroupName, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(resourceGroupName, requestOptions),
                nextLink -> listNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets a list of all VM scale sets under a resource group.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM scale sets under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(String resourceGroupName, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listSinglePageAsync(resourceGroupName, requestOptions, context),
                nextLink -> listNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets a list of all VM scale sets under a resource group.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM scale sets under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String resourceGroupName, RequestOptions requestOptions) {
        return new PagedIterable<>(listAsync(resourceGroupName, requestOptions));
    }

    /**
     * Gets a list of all VM scale sets under a resource group.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM scale sets under a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String resourceGroupName, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, requestOptions, context));
    }

    /**
     * Gets a list of all VM Scale Sets in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of VM Scale Sets. Do this till nextLink is null to fetch all the VM
     * Scale Sets.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM Scale Sets in the subscription, regardless of the associated resource group.
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
     * Gets a list of all VM Scale Sets in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of VM Scale Sets. Do this till nextLink is null to fetch all the VM
     * Scale Sets.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM Scale Sets in the subscription, regardless of the associated resource group.
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
     * Gets a list of all VM Scale Sets in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of VM Scale Sets. Do this till nextLink is null to fetch all the VM
     * Scale Sets.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM Scale Sets in the subscription, regardless of the associated resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAllAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listAllSinglePageAsync(requestOptions), nextLink -> listAllNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets a list of all VM Scale Sets in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of VM Scale Sets. Do this till nextLink is null to fetch all the VM
     * Scale Sets.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM Scale Sets in the subscription, regardless of the associated resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAllAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listAllSinglePageAsync(requestOptions, context),
                nextLink -> listAllNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets a list of all VM Scale Sets in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of VM Scale Sets. Do this till nextLink is null to fetch all the VM
     * Scale Sets.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM Scale Sets in the subscription, regardless of the associated resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAll(RequestOptions requestOptions) {
        return new PagedIterable<>(listAllAsync(requestOptions));
    }

    /**
     * Gets a list of all VM Scale Sets in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of VM Scale Sets. Do this till nextLink is null to fetch all the VM
     * Scale Sets.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return a list of all VM Scale Sets in the subscription, regardless of the associated resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAll(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listAllAsync(requestOptions, context));
    }

    /**
     * Gets a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed for
     * each SKU.
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
     *             resourceType: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             capacity: {
     *                 minimum: Long
     *                 maximum: Long
     *                 defaultCapacity: Long
     *                 scaleType: String(Automatic/None)
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed
     *     for each SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSkusSinglePageAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.listSkus(
                                        this.client.getHost(),
                                        resourceGroupName,
                                        vmScaleSetName,
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
     * Gets a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed for
     * each SKU.
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
     *             resourceType: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             capacity: {
     *                 minimum: Long
     *                 maximum: Long
     *                 defaultCapacity: Long
     *                 scaleType: String(Automatic/None)
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed
     *     for each SKU.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSkusSinglePageAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.listSkus(
                        this.client.getHost(),
                        resourceGroupName,
                        vmScaleSetName,
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
     * Gets a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed for
     * each SKU.
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
     *             resourceType: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             capacity: {
     *                 minimum: Long
     *                 maximum: Long
     *                 defaultCapacity: Long
     *                 scaleType: String(Automatic/None)
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed
     *     for each SKU.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listSkusAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> listSkusSinglePageAsync(resourceGroupName, vmScaleSetName, requestOptions),
                nextLink -> listSkusNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed for
     * each SKU.
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
     *             resourceType: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             capacity: {
     *                 minimum: Long
     *                 maximum: Long
     *                 defaultCapacity: Long
     *                 scaleType: String(Automatic/None)
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed
     *     for each SKU.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listSkusAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> listSkusSinglePageAsync(resourceGroupName, vmScaleSetName, requestOptions, context),
                nextLink -> listSkusNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed for
     * each SKU.
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
     *             resourceType: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             capacity: {
     *                 minimum: Long
     *                 maximum: Long
     *                 defaultCapacity: Long
     *                 scaleType: String(Automatic/None)
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed
     *     for each SKU.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listSkus(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return new PagedIterable<>(listSkusAsync(resourceGroupName, vmScaleSetName, requestOptions));
    }

    /**
     * Gets a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed for
     * each SKU.
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
     *             resourceType: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             capacity: {
     *                 minimum: Long
     *                 maximum: Long
     *                 defaultCapacity: Long
     *                 scaleType: String(Automatic/None)
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a list of SKUs available for your VM scale set, including the minimum and maximum VM instances allowed
     *     for each SKU.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listSkus(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(listSkusAsync(resourceGroupName, vmScaleSetName, requestOptions, context));
    }

    /**
     * Gets list of OS upgrades on a VM scale set instance.
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
     *             properties: {
     *                 runningStatus: {
     *                     code: String(RollingForward/Cancelled/Completed/Faulted)
     *                     startTime: String
     *                     endTime: String
     *                 }
     *                 progress: {
     *                     successfulInstanceCount: Integer
     *                     failedInstanceCount: Integer
     *                     inProgressInstanceCount: Integer
     *                     pendingInstanceCount: Integer
     *                 }
     *                 error: {
     *                     details: [
     *                         {
     *                             code: String
     *                             target: String
     *                             message: String
     *                         }
     *                     ]
     *                     innererror: {
     *                         exceptiontype: String
     *                         errordetail: String
     *                     }
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *                 startedBy: String(Unknown/User/Platform)
     *                 targetImageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 rollbackInfo: {
     *                     successfullyRolledbackInstanceCount: Integer
     *                     failedRolledbackInstanceCount: Integer
     *                     rollbackError: (recursive schema, see rollbackError above)
     *                 }
     *             }
     *             type: String
     *             location: String
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return list of OS upgrades on a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getOSUpgradeHistorySinglePageAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getOSUpgradeHistory(
                                        this.client.getHost(),
                                        resourceGroupName,
                                        vmScaleSetName,
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
     * Gets list of OS upgrades on a VM scale set instance.
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
     *             properties: {
     *                 runningStatus: {
     *                     code: String(RollingForward/Cancelled/Completed/Faulted)
     *                     startTime: String
     *                     endTime: String
     *                 }
     *                 progress: {
     *                     successfulInstanceCount: Integer
     *                     failedInstanceCount: Integer
     *                     inProgressInstanceCount: Integer
     *                     pendingInstanceCount: Integer
     *                 }
     *                 error: {
     *                     details: [
     *                         {
     *                             code: String
     *                             target: String
     *                             message: String
     *                         }
     *                     ]
     *                     innererror: {
     *                         exceptiontype: String
     *                         errordetail: String
     *                     }
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *                 startedBy: String(Unknown/User/Platform)
     *                 targetImageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 rollbackInfo: {
     *                     successfullyRolledbackInstanceCount: Integer
     *                     failedRolledbackInstanceCount: Integer
     *                     rollbackError: (recursive schema, see rollbackError above)
     *                 }
     *             }
     *             type: String
     *             location: String
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return list of OS upgrades on a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getOSUpgradeHistorySinglePageAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.getOSUpgradeHistory(
                        this.client.getHost(),
                        resourceGroupName,
                        vmScaleSetName,
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
     * Gets list of OS upgrades on a VM scale set instance.
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
     *             properties: {
     *                 runningStatus: {
     *                     code: String(RollingForward/Cancelled/Completed/Faulted)
     *                     startTime: String
     *                     endTime: String
     *                 }
     *                 progress: {
     *                     successfulInstanceCount: Integer
     *                     failedInstanceCount: Integer
     *                     inProgressInstanceCount: Integer
     *                     pendingInstanceCount: Integer
     *                 }
     *                 error: {
     *                     details: [
     *                         {
     *                             code: String
     *                             target: String
     *                             message: String
     *                         }
     *                     ]
     *                     innererror: {
     *                         exceptiontype: String
     *                         errordetail: String
     *                     }
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *                 startedBy: String(Unknown/User/Platform)
     *                 targetImageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 rollbackInfo: {
     *                     successfullyRolledbackInstanceCount: Integer
     *                     failedRolledbackInstanceCount: Integer
     *                     rollbackError: (recursive schema, see rollbackError above)
     *                 }
     *             }
     *             type: String
     *             location: String
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return list of OS upgrades on a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getOSUpgradeHistoryAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getOSUpgradeHistorySinglePageAsync(resourceGroupName, vmScaleSetName, requestOptions),
                nextLink -> getOSUpgradeHistoryNextSinglePageAsync(nextLink, null));
    }

    /**
     * Gets list of OS upgrades on a VM scale set instance.
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
     *             properties: {
     *                 runningStatus: {
     *                     code: String(RollingForward/Cancelled/Completed/Faulted)
     *                     startTime: String
     *                     endTime: String
     *                 }
     *                 progress: {
     *                     successfulInstanceCount: Integer
     *                     failedInstanceCount: Integer
     *                     inProgressInstanceCount: Integer
     *                     pendingInstanceCount: Integer
     *                 }
     *                 error: {
     *                     details: [
     *                         {
     *                             code: String
     *                             target: String
     *                             message: String
     *                         }
     *                     ]
     *                     innererror: {
     *                         exceptiontype: String
     *                         errordetail: String
     *                     }
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *                 startedBy: String(Unknown/User/Platform)
     *                 targetImageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 rollbackInfo: {
     *                     successfullyRolledbackInstanceCount: Integer
     *                     failedRolledbackInstanceCount: Integer
     *                     rollbackError: (recursive schema, see rollbackError above)
     *                 }
     *             }
     *             type: String
     *             location: String
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return list of OS upgrades on a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getOSUpgradeHistoryAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getOSUpgradeHistorySinglePageAsync(resourceGroupName, vmScaleSetName, requestOptions, context),
                nextLink -> getOSUpgradeHistoryNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * Gets list of OS upgrades on a VM scale set instance.
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
     *             properties: {
     *                 runningStatus: {
     *                     code: String(RollingForward/Cancelled/Completed/Faulted)
     *                     startTime: String
     *                     endTime: String
     *                 }
     *                 progress: {
     *                     successfulInstanceCount: Integer
     *                     failedInstanceCount: Integer
     *                     inProgressInstanceCount: Integer
     *                     pendingInstanceCount: Integer
     *                 }
     *                 error: {
     *                     details: [
     *                         {
     *                             code: String
     *                             target: String
     *                             message: String
     *                         }
     *                     ]
     *                     innererror: {
     *                         exceptiontype: String
     *                         errordetail: String
     *                     }
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *                 startedBy: String(Unknown/User/Platform)
     *                 targetImageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 rollbackInfo: {
     *                     successfullyRolledbackInstanceCount: Integer
     *                     failedRolledbackInstanceCount: Integer
     *                     rollbackError: (recursive schema, see rollbackError above)
     *                 }
     *             }
     *             type: String
     *             location: String
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return list of OS upgrades on a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getOSUpgradeHistory(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return new PagedIterable<>(getOSUpgradeHistoryAsync(resourceGroupName, vmScaleSetName, requestOptions));
    }

    /**
     * Gets list of OS upgrades on a VM scale set instance.
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
     *             properties: {
     *                 runningStatus: {
     *                     code: String(RollingForward/Cancelled/Completed/Faulted)
     *                     startTime: String
     *                     endTime: String
     *                 }
     *                 progress: {
     *                     successfulInstanceCount: Integer
     *                     failedInstanceCount: Integer
     *                     inProgressInstanceCount: Integer
     *                     pendingInstanceCount: Integer
     *                 }
     *                 error: {
     *                     details: [
     *                         {
     *                             code: String
     *                             target: String
     *                             message: String
     *                         }
     *                     ]
     *                     innererror: {
     *                         exceptiontype: String
     *                         errordetail: String
     *                     }
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *                 startedBy: String(Unknown/User/Platform)
     *                 targetImageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 rollbackInfo: {
     *                     successfullyRolledbackInstanceCount: Integer
     *                     failedRolledbackInstanceCount: Integer
     *                     rollbackError: (recursive schema, see rollbackError above)
     *                 }
     *             }
     *             type: String
     *             location: String
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return list of OS upgrades on a VM scale set instance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getOSUpgradeHistory(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(
                getOSUpgradeHistoryAsync(resourceGroupName, vmScaleSetName, requestOptions, context));
    }

    /**
     * Power off (stop) one or more virtual machines in a VM scale set. Note that resources are still attached and you
     * are getting charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>skipShutdown</td><td>String</td><td>No</td><td>The parameter to request non-graceful VM shutdown. True value for this flag indicates non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not specified</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> powerOffWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.powerOff(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Power off (stop) one or more virtual machines in a VM scale set. Note that resources are still attached and you
     * are getting charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>skipShutdown</td><td>String</td><td>No</td><td>The parameter to request non-graceful VM shutdown. True value for this flag indicates non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not specified</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> powerOffWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.powerOff(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Power off (stop) one or more virtual machines in a VM scale set. Note that resources are still attached and you
     * are getting charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>skipShutdown</td><td>String</td><td>No</td><td>The parameter to request non-graceful VM shutdown. True value for this flag indicates non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not specified</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> powerOffWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return powerOffWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Restarts one or more virtual machines in a VM scale set.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> restartWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.restart(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Restarts one or more virtual machines in a VM scale set.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> restartWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.restart(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Restarts one or more virtual machines in a VM scale set.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> restartWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return restartWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Starts one or more virtual machines in a VM scale set.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.start(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Starts one or more virtual machines in a VM scale set.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.start(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Starts one or more virtual machines in a VM scale set.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> startWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return startWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Shuts down all the virtual machines in the virtual machine scale set, moves them to a new node, and powers them
     * back on.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redeployWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.redeploy(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Shuts down all the virtual machines in the virtual machine scale set, moves them to a new node, and powers them
     * back on.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redeployWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.redeploy(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Shuts down all the virtual machines in the virtual machine scale set, moves them to a new node, and powers them
     * back on.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> redeployWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return redeployWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Perform maintenance on one or more virtual machines in a VM scale set. Operation on instances which are not
     * eligible for perform maintenance will be failed. Please refer to best practices for more details:
     * https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-maintenance-notifications.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> performMaintenanceWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.performMaintenance(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Perform maintenance on one or more virtual machines in a VM scale set. Operation on instances which are not
     * eligible for perform maintenance will be failed. Please refer to best practices for more details:
     * https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-maintenance-notifications.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> performMaintenanceWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.performMaintenance(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Perform maintenance on one or more virtual machines in a VM scale set. Operation on instances which are not
     * eligible for perform maintenance will be failed. Please refer to best practices for more details:
     * https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-maintenance-notifications.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> performMaintenanceWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return performMaintenanceWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Upgrades one or more virtual machines to the latest SKU set in the VM scale set model.
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
     *     instanceIds: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param vmInstanceIDs A list of virtual machine instance IDs from the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateInstancesWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, BinaryData vmInstanceIDs, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.updateInstances(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                vmInstanceIDs,
                                requestOptions,
                                context));
    }

    /**
     * Upgrades one or more virtual machines to the latest SKU set in the VM scale set model.
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
     *     instanceIds: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param vmInstanceIDs A list of virtual machine instance IDs from the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateInstancesWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData vmInstanceIDs,
            RequestOptions requestOptions,
            Context context) {
        return service.updateInstances(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                vmInstanceIDs,
                requestOptions,
                context);
    }

    /**
     * Upgrades one or more virtual machines to the latest SKU set in the VM scale set model.
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
     *     instanceIds: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param vmInstanceIDs A list of virtual machine instance IDs from the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> updateInstancesWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData vmInstanceIDs,
            RequestOptions requestOptions,
            Context context) {
        return updateInstancesWithResponseAsync(
                        resourceGroupName, vmScaleSetName, vmInstanceIDs, requestOptions, context)
                .block();
    }

    /**
     * Reimages (upgrade the operating system) one or more virtual machines in a VM scale set which don't have a
     * ephemeral OS disk, for virtual machines who have a ephemeral OS disk the virtual machine is reset to initial
     * state.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reimageWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.reimage(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Reimages (upgrade the operating system) one or more virtual machines in a VM scale set which don't have a
     * ephemeral OS disk, for virtual machines who have a ephemeral OS disk the virtual machine is reset to initial
     * state.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reimageWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.reimage(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Reimages (upgrade the operating system) one or more virtual machines in a VM scale set which don't have a
     * ephemeral OS disk, for virtual machines who have a ephemeral OS disk the virtual machine is reset to initial
     * state.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> reimageWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return reimageWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Reimages all the disks ( including data disks ) in the virtual machines in a VM scale set. This operation is only
     * supported for managed disks.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reimageAllWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.reimageAll(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Reimages all the disks ( including data disks ) in the virtual machines in a VM scale set. This operation is only
     * supported for managed disks.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reimageAllWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.reimageAll(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Reimages all the disks ( including data disks ) in the virtual machines in a VM scale set. This operation is only
     * supported for managed disks.
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
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> reimageAllWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return reimageAllWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions, context).block();
    }

    /**
     * Manual platform update domain walk to update virtual machines in a service fabric virtual machine scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>platformUpdateDomain</td><td>int</td><td>Yes</td><td>The platform update domain for which a manual recovery walk is requested</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     walkPerformed: Boolean
     *     nextPlatformUpdateDomain: Integer
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return response after calling a manual recovery walk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.forceRecoveryServiceFabricPlatformUpdateDomainWalk(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                requestOptions,
                                context));
    }

    /**
     * Manual platform update domain walk to update virtual machines in a service fabric virtual machine scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>platformUpdateDomain</td><td>int</td><td>Yes</td><td>The platform update domain for which a manual recovery walk is requested</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     walkPerformed: Boolean
     *     nextPlatformUpdateDomain: Integer
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return response after calling a manual recovery walk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return service.forceRecoveryServiceFabricPlatformUpdateDomainWalk(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                requestOptions,
                context);
    }

    /**
     * Manual platform update domain walk to update virtual machines in a service fabric virtual machine scale set.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>platformUpdateDomain</td><td>int</td><td>Yes</td><td>The platform update domain for which a manual recovery walk is requested</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     walkPerformed: Boolean
     *     nextPlatformUpdateDomain: Integer
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return response after calling a manual recovery walk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions, Context context) {
        return forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponseAsync(
                        resourceGroupName, vmScaleSetName, requestOptions, context)
                .block();
    }

    /**
     * Converts SinglePlacementGroup property to false for a existing virtual machine scale set.
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
     *     activePlacementGroupId: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set to create or update.
     * @param parameters The input object for ConvertToSinglePlacementGroup API.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> convertToSinglePlacementGroupWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, BinaryData parameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.convertToSinglePlacementGroup(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Converts SinglePlacementGroup property to false for a existing virtual machine scale set.
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
     *     activePlacementGroupId: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set to create or update.
     * @param parameters The input object for ConvertToSinglePlacementGroup API.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> convertToSinglePlacementGroupWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.convertToSinglePlacementGroup(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Converts SinglePlacementGroup property to false for a existing virtual machine scale set.
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
     *     activePlacementGroupId: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set to create or update.
     * @param parameters The input object for ConvertToSinglePlacementGroup API.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> convertToSinglePlacementGroupWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return convertToSinglePlacementGroupWithResponseAsync(
                        resourceGroupName, vmScaleSetName, parameters, requestOptions, context)
                .block();
    }

    /**
     * Changes ServiceState property for a given service.
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
     *     serviceName: String(AutomaticRepairs)
     *     action: String(Resume/Suspend)
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set to create or update.
     * @param parameters The input object for SetOrchestrationServiceState API.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> setOrchestrationServiceStateWithResponseAsync(
            String resourceGroupName, String vmScaleSetName, BinaryData parameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.setOrchestrationServiceState(
                                this.client.getHost(),
                                resourceGroupName,
                                vmScaleSetName,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Changes ServiceState property for a given service.
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
     *     serviceName: String(AutomaticRepairs)
     *     action: String(Resume/Suspend)
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set to create or update.
     * @param parameters The input object for SetOrchestrationServiceState API.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> setOrchestrationServiceStateWithResponseAsync(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return service.setOrchestrationServiceState(
                this.client.getHost(),
                resourceGroupName,
                vmScaleSetName,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Changes ServiceState property for a given service.
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
     *     serviceName: String(AutomaticRepairs)
     *     action: String(Resume/Suspend)
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set to create or update.
     * @param parameters The input object for SetOrchestrationServiceState API.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> setOrchestrationServiceStateWithResponse(
            String resourceGroupName,
            String vmScaleSetName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return setOrchestrationServiceStateWithResponseAsync(
                        resourceGroupName, vmScaleSetName, parameters, requestOptions, context)
                .block();
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listByLocationNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.listByLocationNext(nextLink, this.client.getHost(), requestOptions, context))
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listByLocationNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.listByLocationNext(nextLink, this.client.getHost(), requestOptions, context)
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return the List Virtual Machine operation response.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return the List Virtual Machine operation response.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return the List Virtual Machine operation response.
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
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 upgradePolicy: {
     *                     mode: String(Automatic/Manual/Rolling)
     *                     rollingUpgradePolicy: {
     *                         maxBatchInstancePercent: Integer
     *                         maxUnhealthyInstancePercent: Integer
     *                         maxUnhealthyUpgradedInstancePercent: Integer
     *                         pauseTimeBetweenBatches: String
     *                         enableCrossZoneUpgrade: Boolean
     *                         prioritizeUnhealthyInstances: Boolean
     *                     }
     *                     automaticOSUpgradePolicy: {
     *                         enableAutomaticOSUpgrade: Boolean
     *                         disableAutomaticRollback: Boolean
     *                     }
     *                 }
     *                 automaticRepairsPolicy: {
     *                     enabled: Boolean
     *                     gracePeriod: String
     *                 }
     *                 virtualMachineProfile: {
     *                     osProfile: {
     *                         computerNamePrefix: String
     *                         adminUsername: String
     *                         adminPassword: String
     *                         customData: String
     *                         windowsConfiguration: {
     *                             provisionVMAgent: Boolean
     *                             enableAutomaticUpdates: Boolean
     *                             timeZone: String
     *                             additionalUnattendContent: [
     *                                 {
     *                                     passName: String
     *                                     componentName: String
     *                                     settingName: String(AutoLogon/FirstLogonCommands)
     *                                     content: String
     *                                 }
     *                             ]
     *                             patchSettings: {
     *                                 patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                                 enableHotpatching: Boolean
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                             winRM: {
     *                                 listeners: [
     *                                     {
     *                                         protocol: String(Http/Https)
     *                                         certificateUrl: String
     *                                     }
     *                                 ]
     *                             }
     *                         }
     *                         linuxConfiguration: {
     *                             disablePasswordAuthentication: Boolean
     *                             ssh: {
     *                                 publicKeys: [
     *                                     {
     *                                         path: String
     *                                         keyData: String
     *                                     }
     *                                 ]
     *                             }
     *                             provisionVMAgent: Boolean
     *                             patchSettings: {
     *                                 patchMode: String(ImageDefault/AutomaticByPlatform)
     *                                 assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                             }
     *                         }
     *                         secrets: [
     *                             {
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                                 vaultCertificates: [
     *                                     {
     *                                         certificateUrl: String
     *                                         certificateStore: String
     *                                     }
     *                                 ]
     *                             }
     *                         ]
     *                     }
     *                     storageProfile: {
     *                         imageReference: {
     *                             id: String
     *                             publisher: String
     *                             offer: String
     *                             sku: String
     *                             version: String
     *                             exactVersion: String
     *                             sharedGalleryImageId: String
     *                         }
     *                         osDisk: {
     *                             name: String
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diffDiskSettings: {
     *                                 option: String(Local)
     *                                 placement: String(CacheDisk/ResourceDisk)
     *                             }
     *                             diskSizeGB: Integer
     *                             osType: String(Windows/Linux)
     *                             image: {
     *                                 uri: String
     *                             }
     *                             vhdContainers: [
     *                                 String
     *                             ]
     *                             managedDisk: {
     *                                 storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                                 diskEncryptionSet: {
     *                                     id: String
     *                                 }
     *                             }
     *                         }
     *                         dataDisks: [
     *                             {
     *                                 name: String
     *                                 lun: int
     *                                 caching: String(None/ReadOnly/ReadWrite)
     *                                 writeAcceleratorEnabled: Boolean
     *                                 createOption: String(FromImage/Empty/Attach)
     *                                 diskSizeGB: Integer
     *                                 managedDisk: (recursive schema, see managedDisk above)
     *                                 diskIopsReadWrite: Long
     *                                 diskMBpsReadWrite: Long
     *                             }
     *                         ]
     *                     }
     *                     networkProfile: {
     *                         healthProbe: {
     *                             id: String
     *                         }
     *                         networkInterfaceConfigurations: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 properties: {
     *                                     primary: Boolean
     *                                     enableAcceleratedNetworking: Boolean
     *                                     enableFpga: Boolean
     *                                     networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                     dnsSettings: {
     *                                         dnsServers: [
     *                                             String
     *                                         ]
     *                                     }
     *                                     ipConfigurations: [
     *                                         {
     *                                             id: String
     *                                             name: String
     *                                             properties: {
     *                                                 subnet: (recursive schema, see subnet above)
     *                                                 primary: Boolean
     *                                                 publicIPAddressConfiguration: {
     *                                                     name: String
     *                                                     properties: {
     *                                                         idleTimeoutInMinutes: Integer
     *                                                         dnsSettings: {
     *                                                             domainNameLabel: String
     *                                                         }
     *                                                         ipTags: [
     *                                                             {
     *                                                                 ipTagType: String
     *                                                                 tag: String
     *                                                             }
     *                                                         ]
     *                                                         publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                         publicIPAddressVersion: String(IPv4/IPv6)
     *                                                         deleteOption: String(Delete/Detach)
     *                                                     }
     *                                                     sku: {
     *                                                         name: String(Basic/Standard)
     *                                                         tier: String(Regional/Global)
     *                                                     }
     *                                                 }
     *                                                 privateIPAddressVersion: String(IPv4/IPv6)
     *                                                 applicationGatewayBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 applicationSecurityGroups: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerBackendAddressPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                                 loadBalancerInboundNatPools: [
     *                                                     (recursive schema, see above)
     *                                                 ]
     *                                             }
     *                                         }
     *                                     ]
     *                                     enableIPForwarding: Boolean
     *                                     deleteOption: String(Delete/Detach)
     *                                 }
     *                             }
     *                         ]
     *                         networkApiVersion: String(2020-11-01)
     *                     }
     *                     securityProfile: {
     *                         uefiSettings: {
     *                             secureBootEnabled: Boolean
     *                             vTpmEnabled: Boolean
     *                         }
     *                         encryptionAtHost: Boolean
     *                         securityType: String(TrustedLaunch)
     *                     }
     *                     diagnosticsProfile: {
     *                         bootDiagnostics: {
     *                             enabled: Boolean
     *                             storageUri: String
     *                         }
     *                     }
     *                     extensionProfile: {
     *                         extensions: [
     *                             {
     *                                 id: String
     *                                 name: String
     *                                 type: String
     *                                 properties: {
     *                                     forceUpdateTag: String
     *                                     publisher: String
     *                                     type: String
     *                                     typeHandlerVersion: String
     *                                     autoUpgradeMinorVersion: Boolean
     *                                     enableAutomaticUpgrade: Boolean
     *                                     settings: Object
     *                                     protectedSettings: Object
     *                                     provisioningState: String
     *                                     provisionAfterExtensions: [
     *                                         String
     *                                     ]
     *                                     suppressFailures: Boolean
     *                                 }
     *                             }
     *                         ]
     *                         extensionsTimeBudget: String
     *                     }
     *                     licenseType: String
     *                     priority: String(Regular/Low/Spot)
     *                     evictionPolicy: String(Deallocate/Delete)
     *                     billingProfile: {
     *                         maxPrice: Double
     *                     }
     *                     scheduledEventsProfile: {
     *                         terminateNotificationProfile: {
     *                             notBeforeTimeout: String
     *                             enable: Boolean
     *                         }
     *                     }
     *                     userData: String
     *                     capacityReservation: {
     *                         capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                     }
     *                     applicationProfile: {
     *                         galleryApplications: [
     *                             {
     *                                 tags: String
     *                                 order: Integer
     *                                 packageReferenceId: String
     *                                 configurationReference: String
     *                             }
     *                         ]
     *                     }
     *                 }
     *                 provisioningState: String
     *                 overprovision: Boolean
     *                 doNotRunExtensionsOnOverprovisionedVMs: Boolean
     *                 uniqueId: String
     *                 singlePlacementGroup: Boolean
     *                 zoneBalance: Boolean
     *                 platformFaultDomainCount: Integer
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 scaleInPolicy: {
     *                     rules: [
     *                         String(Default/OldestVM/NewestVM)
     *                     ]
     *                     forceDeletion: Boolean
     *                 }
     *                 orchestrationMode: String(Uniform/Flexible)
     *                 spotRestorePolicy: {
     *                     enabled: Boolean
     *                     restoreTimeout: String
     *                 }
     *             }
     *             identity: {
     *                 principalId: String
     *                 tenantId: String
     *                 type: String(SystemAssigned/UserAssigned/SystemAssigned, UserAssigned/None)
     *                 userAssignedIdentities: {
     *                     String: {
     *                         principalId: String
     *                         clientId: String
     *                     }
     *                 }
     *             }
     *             zones: [
     *                 String
     *             ]
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
     * @return the List Virtual Machine operation response.
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

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             resourceType: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             capacity: {
     *                 minimum: Long
     *                 maximum: Long
     *                 defaultCapacity: Long
     *                 scaleType: String(Automatic/None)
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
     * @return the Virtual Machine Scale Set List Skus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSkusNextSinglePageAsync(String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.listSkusNext(nextLink, this.client.getHost(), requestOptions, context))
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
     *             resourceType: String
     *             sku: {
     *                 name: String
     *                 tier: String
     *                 capacity: Long
     *             }
     *             capacity: {
     *                 minimum: Long
     *                 maximum: Long
     *                 defaultCapacity: Long
     *                 scaleType: String(Automatic/None)
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
     * @return the Virtual Machine Scale Set List Skus operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> listSkusNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.listSkusNext(nextLink, this.client.getHost(), requestOptions, context)
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
     *             properties: {
     *                 runningStatus: {
     *                     code: String(RollingForward/Cancelled/Completed/Faulted)
     *                     startTime: String
     *                     endTime: String
     *                 }
     *                 progress: {
     *                     successfulInstanceCount: Integer
     *                     failedInstanceCount: Integer
     *                     inProgressInstanceCount: Integer
     *                     pendingInstanceCount: Integer
     *                 }
     *                 error: {
     *                     details: [
     *                         {
     *                             code: String
     *                             target: String
     *                             message: String
     *                         }
     *                     ]
     *                     innererror: {
     *                         exceptiontype: String
     *                         errordetail: String
     *                     }
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *                 startedBy: String(Unknown/User/Platform)
     *                 targetImageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 rollbackInfo: {
     *                     successfullyRolledbackInstanceCount: Integer
     *                     failedRolledbackInstanceCount: Integer
     *                     rollbackError: (recursive schema, see rollbackError above)
     *                 }
     *             }
     *             type: String
     *             location: String
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
     * @return list of Virtual Machine Scale Set OS Upgrade History operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getOSUpgradeHistoryNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getOSUpgradeHistoryNext(
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
     *             properties: {
     *                 runningStatus: {
     *                     code: String(RollingForward/Cancelled/Completed/Faulted)
     *                     startTime: String
     *                     endTime: String
     *                 }
     *                 progress: {
     *                     successfulInstanceCount: Integer
     *                     failedInstanceCount: Integer
     *                     inProgressInstanceCount: Integer
     *                     pendingInstanceCount: Integer
     *                 }
     *                 error: {
     *                     details: [
     *                         {
     *                             code: String
     *                             target: String
     *                             message: String
     *                         }
     *                     ]
     *                     innererror: {
     *                         exceptiontype: String
     *                         errordetail: String
     *                     }
     *                     code: String
     *                     target: String
     *                     message: String
     *                 }
     *                 startedBy: String(Unknown/User/Platform)
     *                 targetImageReference: {
     *                     id: String
     *                     publisher: String
     *                     offer: String
     *                     sku: String
     *                     version: String
     *                     exactVersion: String
     *                     sharedGalleryImageId: String
     *                 }
     *                 rollbackInfo: {
     *                     successfullyRolledbackInstanceCount: Integer
     *                     failedRolledbackInstanceCount: Integer
     *                     rollbackError: (recursive schema, see rollbackError above)
     *                 }
     *             }
     *             type: String
     *             location: String
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
     * @return list of Virtual Machine Scale Set OS Upgrade History operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getOSUpgradeHistoryNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getOSUpgradeHistoryNext(nextLink, this.client.getHost(), requestOptions, context)
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
