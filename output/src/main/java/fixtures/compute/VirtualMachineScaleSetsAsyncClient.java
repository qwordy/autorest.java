package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.VirtualMachineScaleSetsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class VirtualMachineScaleSetsAsyncClient {
    private final VirtualMachineScaleSetsImpl serviceClient;

    /**
     * Initializes an instance of VirtualMachineScaleSets client.
     *
     * @param serviceClient the service client implementation.
     */
    VirtualMachineScaleSetsAsyncClient(VirtualMachineScaleSetsImpl serviceClient) {
        this.serviceClient = serviceClient;
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
    public PagedFlux<BinaryData> listByLocation(String location, RequestOptions requestOptions) {
        return this.serviceClient.listByLocationAsync(location, requestOptions);
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
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String resourceGroupName, String vmScaleSetName, BinaryData parameters, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(
                resourceGroupName, vmScaleSetName, parameters, requestOptions);
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
    public Mono<Response<BinaryData>> updateWithResponse(
            String resourceGroupName, String vmScaleSetName, BinaryData parameters, RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(
                resourceGroupName, vmScaleSetName, parameters, requestOptions);
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
    public Mono<Response<Void>> deleteWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<BinaryData>> getWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> deallocateWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.deallocateWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> deleteInstancesWithResponse(
            String resourceGroupName, String vmScaleSetName, BinaryData vmInstanceIDs, RequestOptions requestOptions) {
        return this.serviceClient.deleteInstancesWithResponseAsync(
                resourceGroupName, vmScaleSetName, vmInstanceIDs, requestOptions);
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
    public Mono<Response<BinaryData>> getInstanceViewWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.getInstanceViewWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public PagedFlux<BinaryData> list(String resourceGroupName, RequestOptions requestOptions) {
        return this.serviceClient.listAsync(resourceGroupName, requestOptions);
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
    public PagedFlux<BinaryData> listAll(RequestOptions requestOptions) {
        return this.serviceClient.listAllAsync(requestOptions);
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
    public PagedFlux<BinaryData> listSkus(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.listSkusAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public PagedFlux<BinaryData> getOSUpgradeHistory(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.getOSUpgradeHistoryAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> powerOffWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.powerOffWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> restartWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.restartWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> startWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.startWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> redeployWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.redeployWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> performMaintenanceWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.performMaintenanceWithResponseAsync(
                resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> updateInstancesWithResponse(
            String resourceGroupName, String vmScaleSetName, BinaryData vmInstanceIDs, RequestOptions requestOptions) {
        return this.serviceClient.updateInstancesWithResponseAsync(
                resourceGroupName, vmScaleSetName, vmInstanceIDs, requestOptions);
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
    public Mono<Response<Void>> reimageWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.reimageWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> reimageAllWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.reimageAllWithResponseAsync(resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<BinaryData>> forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponse(
            String resourceGroupName, String vmScaleSetName, RequestOptions requestOptions) {
        return this.serviceClient.forceRecoveryServiceFabricPlatformUpdateDomainWalkWithResponseAsync(
                resourceGroupName, vmScaleSetName, requestOptions);
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
    public Mono<Response<Void>> convertToSinglePlacementGroupWithResponse(
            String resourceGroupName, String vmScaleSetName, BinaryData parameters, RequestOptions requestOptions) {
        return this.serviceClient.convertToSinglePlacementGroupWithResponseAsync(
                resourceGroupName, vmScaleSetName, parameters, requestOptions);
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
    public Mono<Response<Void>> setOrchestrationServiceStateWithResponse(
            String resourceGroupName, String vmScaleSetName, BinaryData parameters, RequestOptions requestOptions) {
        return this.serviceClient.setOrchestrationServiceStateWithResponseAsync(
                resourceGroupName, vmScaleSetName, parameters, requestOptions);
    }
}
