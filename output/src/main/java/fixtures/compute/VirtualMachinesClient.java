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
import fixtures.compute.implementation.VirtualMachinesImpl;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class VirtualMachinesClient {
    private final VirtualMachinesImpl serviceClient;

    /**
     * Initializes an instance of VirtualMachines client.
     *
     * @param serviceClient the service client implementation.
     */
    VirtualMachinesClient(VirtualMachinesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets all the virtual machines under the specified subscription for the specified location.
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
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 priority: String(Regular/Low/Spot)
     *                 evictionPolicy: String(Deallocate/Delete)
     *                 billingProfile: {
     *                     maxPrice: Double
     *                 }
     *                 host: (recursive schema, see host above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 provisioningState: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     computerName: String
     *                     osName: String
     *                     osVersion: String
     *                     hyperVGeneration: String(V1/V2)
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     assignedHost: String
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     patchStatus: {
     *                         availablePatchSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             assessmentActivityId: String
     *                             rebootPending: Boolean
     *                             criticalAndSecurityPatchCount: Integer
     *                             otherPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: {
     *                                 details: [
     *                                     {
     *                                         code: String
     *                                         target: String
     *                                         message: String
     *                                     }
     *                                 ]
     *                                 innererror: {
     *                                     exceptiontype: String
     *                                     errordetail: String
     *                                 }
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         }
     *                         lastPatchInstallationSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             installationActivityId: String
     *                             maintenanceWindowExceeded: Boolean
     *                             notSelectedPatchCount: Integer
     *                             excludedPatchCount: Integer
     *                             pendingPatchCount: Integer
     *                             installedPatchCount: Integer
     *                             failedPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: (recursive schema, see error above)
     *                         }
     *                         configurationStatuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 }
     *                 licenseType: String
     *                 vmId: String
     *                 extensionsTimeBudget: String
     *                 platformFaultDomain: Integer
     *                 scheduledEventsProfile: {
     *                     terminateNotificationProfile: {
     *                         notBeforeTimeout: String
     *                         enable: Boolean
     *                     }
     *                 }
     *                 userData: String
     *                 capacityReservation: {
     *                     capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                 }
     *                 applicationProfile: {
     *                     galleryApplications: [
     *                         {
     *                             tags: String
     *                             order: Integer
     *                             packageReferenceId: String
     *                             configurationReference: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
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
     * @param location The location for which virtual machines under the subscription are queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return all the virtual machines under the specified subscription for the specified location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByLocation(String location, RequestOptions requestOptions) {
        return this.serviceClient.listByLocation(location, requestOptions);
    }

    /**
     * Gets all the virtual machines under the specified subscription for the specified location.
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
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 priority: String(Regular/Low/Spot)
     *                 evictionPolicy: String(Deallocate/Delete)
     *                 billingProfile: {
     *                     maxPrice: Double
     *                 }
     *                 host: (recursive schema, see host above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 provisioningState: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     computerName: String
     *                     osName: String
     *                     osVersion: String
     *                     hyperVGeneration: String(V1/V2)
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     assignedHost: String
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     patchStatus: {
     *                         availablePatchSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             assessmentActivityId: String
     *                             rebootPending: Boolean
     *                             criticalAndSecurityPatchCount: Integer
     *                             otherPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: {
     *                                 details: [
     *                                     {
     *                                         code: String
     *                                         target: String
     *                                         message: String
     *                                     }
     *                                 ]
     *                                 innererror: {
     *                                     exceptiontype: String
     *                                     errordetail: String
     *                                 }
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         }
     *                         lastPatchInstallationSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             installationActivityId: String
     *                             maintenanceWindowExceeded: Boolean
     *                             notSelectedPatchCount: Integer
     *                             excludedPatchCount: Integer
     *                             pendingPatchCount: Integer
     *                             installedPatchCount: Integer
     *                             failedPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: (recursive schema, see error above)
     *                         }
     *                         configurationStatuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 }
     *                 licenseType: String
     *                 vmId: String
     *                 extensionsTimeBudget: String
     *                 platformFaultDomain: Integer
     *                 scheduledEventsProfile: {
     *                     terminateNotificationProfile: {
     *                         notBeforeTimeout: String
     *                         enable: Boolean
     *                     }
     *                 }
     *                 userData: String
     *                 capacityReservation: {
     *                     capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                 }
     *                 applicationProfile: {
     *                     galleryApplications: [
     *                         {
     *                             tags: String
     *                             order: Integer
     *                             packageReferenceId: String
     *                             configurationReference: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
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
     * @param location The location for which virtual machines under the subscription are queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return all the virtual machines under the specified subscription for the specified location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listByLocation(String location, RequestOptions requestOptions, Context context) {
        return this.serviceClient.listByLocation(location, requestOptions, context);
    }

    /**
     * Captures the VM by copying virtual hard disks of the VM and outputs a template that can be used to create similar
     * VMs.
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
     *     vhdPrefix: String
     *     destinationContainerName: String
     *     overwriteVhds: boolean
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     schema: String
     *     contentVersion: String
     *     parameters: Object
     *     resources: [
     *         Object
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Capture Virtual Machine operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return output of virtual machine capture operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> captureWithResponse(
            String resourceGroupName,
            String vmName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.captureWithResponse(resourceGroupName, vmName, parameters, requestOptions, context);
    }

    /**
     * The operation to create or update a virtual machine. Please note some properties can be set only during virtual
     * machine creation.
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
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: {
     *                     diskEncryptionKey: {
     *                         secretUrl: String
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                     }
     *                     keyEncryptionKey: {
     *                         keyUrl: String
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                     }
     *                     enabled: Boolean
     *                 }
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         priority: String(Regular/Low/Spot)
     *         evictionPolicy: String(Deallocate/Delete)
     *         billingProfile: {
     *             maxPrice: Double
     *         }
     *         host: (recursive schema, see host above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         provisioningState: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             computerName: String
     *             osName: String
     *             osVersion: String
     *             hyperVGeneration: String(V1/V2)
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             assignedHost: String
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             patchStatus: {
     *                 availablePatchSummary: {
     *                     status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                     assessmentActivityId: String
     *                     rebootPending: Boolean
     *                     criticalAndSecurityPatchCount: Integer
     *                     otherPatchCount: Integer
     *                     startTime: String
     *                     lastModifiedTime: String
     *                     error: {
     *                         details: [
     *                             {
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         ]
     *                         innererror: {
     *                             exceptiontype: String
     *                             errordetail: String
     *                         }
     *                         code: String
     *                         target: String
     *                         message: String
     *                     }
     *                 }
     *                 lastPatchInstallationSummary: {
     *                     status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                     installationActivityId: String
     *                     maintenanceWindowExceeded: Boolean
     *                     notSelectedPatchCount: Integer
     *                     excludedPatchCount: Integer
     *                     pendingPatchCount: Integer
     *                     installedPatchCount: Integer
     *                     failedPatchCount: Integer
     *                     startTime: String
     *                     lastModifiedTime: String
     *                     error: (recursive schema, see error above)
     *                 }
     *                 configurationStatuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *         }
     *         licenseType: String
     *         vmId: String
     *         extensionsTimeBudget: String
     *         platformFaultDomain: Integer
     *         scheduledEventsProfile: {
     *             terminateNotificationProfile: {
     *                 notBeforeTimeout: String
     *                 enable: Boolean
     *             }
     *         }
     *         userData: String
     *         capacityReservation: {
     *             capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *         }
     *         applicationProfile: {
     *             galleryApplications: [
     *                 {
     *                     tags: String
     *                     order: Integer
     *                     packageReferenceId: String
     *                     configurationReference: String
     *                 }
     *             ]
     *         }
     *     }
     *     resources: [
     *         {
     *             id: String
     *             name: String
     *             type: String
     *             location: String
     *             tags: {
     *                 String: String
     *             }
     *             properties: {
     *                 forceUpdateTag: String
     *                 publisher: String
     *                 type: String
     *                 typeHandlerVersion: String
     *                 autoUpgradeMinorVersion: Boolean
     *                 enableAutomaticUpgrade: Boolean
     *                 settings: Object
     *                 protectedSettings: Object
     *                 provisioningState: String
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
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
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Create Virtual Machine operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateWithResponse(
            String resourceGroupName,
            String vmName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.createOrUpdateWithResponse(
                resourceGroupName, vmName, parameters, requestOptions, context);
    }

    /**
     * The operation to update a virtual machine.
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
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: {
     *                     diskEncryptionKey: {
     *                         secretUrl: String
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                     }
     *                     keyEncryptionKey: {
     *                         keyUrl: String
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                     }
     *                     enabled: Boolean
     *                 }
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         priority: String(Regular/Low/Spot)
     *         evictionPolicy: String(Deallocate/Delete)
     *         billingProfile: {
     *             maxPrice: Double
     *         }
     *         host: (recursive schema, see host above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         provisioningState: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             computerName: String
     *             osName: String
     *             osVersion: String
     *             hyperVGeneration: String(V1/V2)
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             assignedHost: String
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             patchStatus: {
     *                 availablePatchSummary: {
     *                     status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                     assessmentActivityId: String
     *                     rebootPending: Boolean
     *                     criticalAndSecurityPatchCount: Integer
     *                     otherPatchCount: Integer
     *                     startTime: String
     *                     lastModifiedTime: String
     *                     error: {
     *                         details: [
     *                             {
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         ]
     *                         innererror: {
     *                             exceptiontype: String
     *                             errordetail: String
     *                         }
     *                         code: String
     *                         target: String
     *                         message: String
     *                     }
     *                 }
     *                 lastPatchInstallationSummary: {
     *                     status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                     installationActivityId: String
     *                     maintenanceWindowExceeded: Boolean
     *                     notSelectedPatchCount: Integer
     *                     excludedPatchCount: Integer
     *                     pendingPatchCount: Integer
     *                     installedPatchCount: Integer
     *                     failedPatchCount: Integer
     *                     startTime: String
     *                     lastModifiedTime: String
     *                     error: (recursive schema, see error above)
     *                 }
     *                 configurationStatuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *         }
     *         licenseType: String
     *         vmId: String
     *         extensionsTimeBudget: String
     *         platformFaultDomain: Integer
     *         scheduledEventsProfile: {
     *             terminateNotificationProfile: {
     *                 notBeforeTimeout: String
     *                 enable: Boolean
     *             }
     *         }
     *         userData: String
     *         capacityReservation: {
     *             capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *         }
     *         applicationProfile: {
     *             galleryApplications: [
     *                 {
     *                     tags: String
     *                     order: Integer
     *                     packageReferenceId: String
     *                     configurationReference: String
     *                 }
     *             ]
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
     *     plan: (recursive schema, see plan above)
     *     properties: (recursive schema, see properties above)
     *     resources: [
     *         {
     *             id: String
     *             name: String
     *             type: String
     *             location: String
     *             tags: {
     *                 String: String
     *             }
     *             properties: {
     *                 forceUpdateTag: String
     *                 publisher: String
     *                 type: String
     *                 typeHandlerVersion: String
     *                 autoUpgradeMinorVersion: Boolean
     *                 enableAutomaticUpgrade: Boolean
     *                 settings: Object
     *                 protectedSettings: Object
     *                 provisioningState: String
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
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
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Update Virtual Machine operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(
            String resourceGroupName,
            String vmName,
            BinaryData parameters,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.updateWithResponse(resourceGroupName, vmName, parameters, requestOptions, context);
    }

    /**
     * The operation to delete a virtual machine.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>forceDeletion</td><td>String</td><td>No</td><td>Optional parameter to force delete virtual machines.(Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.deleteWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Retrieves information about the model view or the instance view of a virtual machine.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>expand</td><td>String</td><td>No</td><td>The expand expression to apply on the operation. 'InstanceView' retrieves a snapshot of the runtime properties of the virtual machine that is managed by the platform and can change outside of control plane operations. 'UserData' retrieves the UserData property as part of the VM model view that was provided by the user during the VM Create/Update operation.</td></tr>
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
     *     plan: {
     *         name: String
     *         publisher: String
     *         product: String
     *         promotionCode: String
     *     }
     *     properties: {
     *         hardwareProfile: {
     *             vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *             vmSizeProperties: {
     *                 vCPUsAvailable: Integer
     *                 vCPUsPerCore: Integer
     *             }
     *         }
     *         storageProfile: {
     *             imageReference: {
     *                 id: String
     *                 publisher: String
     *                 offer: String
     *                 sku: String
     *                 version: String
     *                 exactVersion: String
     *                 sharedGalleryImageId: String
     *             }
     *             osDisk: {
     *                 osType: String(Windows/Linux)
     *                 encryptionSettings: {
     *                     diskEncryptionKey: {
     *                         secretUrl: String
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                     }
     *                     keyEncryptionKey: {
     *                         keyUrl: String
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                     }
     *                     enabled: Boolean
     *                 }
     *                 name: String
     *                 vhd: {
     *                     uri: String
     *                 }
     *                 image: (recursive schema, see image above)
     *                 caching: String(None/ReadOnly/ReadWrite)
     *                 writeAcceleratorEnabled: Boolean
     *                 diffDiskSettings: {
     *                     option: String(Local)
     *                     placement: String(CacheDisk/ResourceDisk)
     *                 }
     *                 createOption: String(FromImage/Empty/Attach)
     *                 diskSizeGB: Integer
     *                 managedDisk: {
     *                     id: String
     *                     storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                     diskEncryptionSet: {
     *                         id: String
     *                     }
     *                 }
     *                 deleteOption: String(Delete/Detach)
     *             }
     *             dataDisks: [
     *                 {
     *                     lun: int
     *                     name: String
     *                     vhd: (recursive schema, see vhd above)
     *                     image: (recursive schema, see image above)
     *                     caching: String(None/ReadOnly/ReadWrite)
     *                     writeAcceleratorEnabled: Boolean
     *                     createOption: String(FromImage/Empty/Attach)
     *                     diskSizeGB: Integer
     *                     managedDisk: (recursive schema, see managedDisk above)
     *                     toBeDetached: Boolean
     *                     diskIopsReadWrite: Long
     *                     diskMBpsReadWrite: Long
     *                     detachOption: String(ForceDetach)
     *                     deleteOption: String(Delete/Detach)
     *                 }
     *             ]
     *         }
     *         additionalCapabilities: {
     *             ultraSSDEnabled: Boolean
     *             hibernationEnabled: Boolean
     *         }
     *         osProfile: {
     *             computerName: String
     *             adminUsername: String
     *             adminPassword: String
     *             customData: String
     *             windowsConfiguration: {
     *                 provisionVMAgent: Boolean
     *                 enableAutomaticUpdates: Boolean
     *                 timeZone: String
     *                 additionalUnattendContent: [
     *                     {
     *                         passName: String
     *                         componentName: String
     *                         settingName: String(AutoLogon/FirstLogonCommands)
     *                         content: String
     *                     }
     *                 ]
     *                 patchSettings: {
     *                     patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                     enableHotpatching: Boolean
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *                 winRM: {
     *                     listeners: [
     *                         {
     *                             protocol: String(Http/Https)
     *                             certificateUrl: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             linuxConfiguration: {
     *                 disablePasswordAuthentication: Boolean
     *                 ssh: {
     *                     publicKeys: [
     *                         {
     *                             path: String
     *                             keyData: String
     *                         }
     *                     ]
     *                 }
     *                 provisionVMAgent: Boolean
     *                 patchSettings: {
     *                     patchMode: String(ImageDefault/AutomaticByPlatform)
     *                     assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                 }
     *             }
     *             secrets: [
     *                 {
     *                     sourceVault: (recursive schema, see sourceVault above)
     *                     vaultCertificates: [
     *                         {
     *                             certificateUrl: String
     *                             certificateStore: String
     *                         }
     *                     ]
     *                 }
     *             ]
     *             allowExtensionOperations: Boolean
     *             requireGuestProvisionSignal: Boolean
     *         }
     *         networkProfile: {
     *             networkInterfaces: [
     *                 {
     *                     id: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                 }
     *             ]
     *             networkApiVersion: String(2020-11-01)
     *             networkInterfaceConfigurations: [
     *                 {
     *                     name: String
     *                     properties: {
     *                         primary: Boolean
     *                         deleteOption: String(Delete/Detach)
     *                         enableAcceleratedNetworking: Boolean
     *                         enableFpga: Boolean
     *                         enableIPForwarding: Boolean
     *                         networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                         dnsSettings: {
     *                             dnsServers: [
     *                                 String
     *                             ]
     *                         }
     *                         ipConfigurations: [
     *                             {
     *                                 name: String
     *                                 properties: {
     *                                     subnet: (recursive schema, see subnet above)
     *                                     primary: Boolean
     *                                     publicIPAddressConfiguration: {
     *                                         name: String
     *                                         properties: {
     *                                             idleTimeoutInMinutes: Integer
     *                                             deleteOption: String(Delete/Detach)
     *                                             dnsSettings: {
     *                                                 domainNameLabel: String
     *                                             }
     *                                             ipTags: [
     *                                                 {
     *                                                     ipTagType: String
     *                                                     tag: String
     *                                                 }
     *                                             ]
     *                                             publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                             publicIPAddressVersion: String(IPv4/IPv6)
     *                                             publicIPAllocationMethod: String(Dynamic/Static)
     *                                         }
     *                                         sku: {
     *                                             name: String(Basic/Standard)
     *                                             tier: String(Regional/Global)
     *                                         }
     *                                     }
     *                                     privateIPAddressVersion: String(IPv4/IPv6)
     *                                     applicationSecurityGroups: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     applicationGatewayBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                     loadBalancerBackendAddressPools: [
     *                                         (recursive schema, see above)
     *                                     ]
     *                                 }
     *                             }
     *                         ]
     *                         dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                     }
     *                 }
     *             ]
     *         }
     *         securityProfile: {
     *             uefiSettings: {
     *                 secureBootEnabled: Boolean
     *                 vTpmEnabled: Boolean
     *             }
     *             encryptionAtHost: Boolean
     *             securityType: String(TrustedLaunch)
     *         }
     *         diagnosticsProfile: {
     *             bootDiagnostics: {
     *                 enabled: Boolean
     *                 storageUri: String
     *             }
     *         }
     *         availabilitySet: (recursive schema, see availabilitySet above)
     *         virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *         proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *         priority: String(Regular/Low/Spot)
     *         evictionPolicy: String(Deallocate/Delete)
     *         billingProfile: {
     *             maxPrice: Double
     *         }
     *         host: (recursive schema, see host above)
     *         hostGroup: (recursive schema, see hostGroup above)
     *         provisioningState: String
     *         instanceView: {
     *             platformUpdateDomain: Integer
     *             platformFaultDomain: Integer
     *             computerName: String
     *             osName: String
     *             osVersion: String
     *             hyperVGeneration: String(V1/V2)
     *             rdpThumbPrint: String
     *             vmAgent: {
     *                 vmAgentVersion: String
     *                 extensionHandlers: [
     *                     {
     *                         type: String
     *                         typeHandlerVersion: String
     *                         status: {
     *                             code: String
     *                             level: String(Info/Warning/Error)
     *                             displayStatus: String
     *                             message: String
     *                             time: String
     *                         }
     *                     }
     *                 ]
     *                 statuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *             maintenanceRedeployStatus: {
     *                 isCustomerInitiatedMaintenanceAllowed: Boolean
     *                 preMaintenanceWindowStartTime: String
     *                 preMaintenanceWindowEndTime: String
     *                 maintenanceWindowStartTime: String
     *                 maintenanceWindowEndTime: String
     *                 lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                 lastOperationMessage: String
     *             }
     *             disks: [
     *                 {
     *                     name: String
     *                     encryptionSettings: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             extensions: [
     *                 {
     *                     name: String
     *                     type: String
     *                     typeHandlerVersion: String
     *                     substatuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                 }
     *             ]
     *             vmHealth: {
     *                 status: (recursive schema, see status above)
     *             }
     *             bootDiagnostics: {
     *                 consoleScreenshotBlobUri: String
     *                 serialConsoleLogBlobUri: String
     *                 status: (recursive schema, see status above)
     *             }
     *             assignedHost: String
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *             patchStatus: {
     *                 availablePatchSummary: {
     *                     status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                     assessmentActivityId: String
     *                     rebootPending: Boolean
     *                     criticalAndSecurityPatchCount: Integer
     *                     otherPatchCount: Integer
     *                     startTime: String
     *                     lastModifiedTime: String
     *                     error: {
     *                         details: [
     *                             {
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         ]
     *                         innererror: {
     *                             exceptiontype: String
     *                             errordetail: String
     *                         }
     *                         code: String
     *                         target: String
     *                         message: String
     *                     }
     *                 }
     *                 lastPatchInstallationSummary: {
     *                     status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                     installationActivityId: String
     *                     maintenanceWindowExceeded: Boolean
     *                     notSelectedPatchCount: Integer
     *                     excludedPatchCount: Integer
     *                     pendingPatchCount: Integer
     *                     installedPatchCount: Integer
     *                     failedPatchCount: Integer
     *                     startTime: String
     *                     lastModifiedTime: String
     *                     error: (recursive schema, see error above)
     *                 }
     *                 configurationStatuses: [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *         }
     *         licenseType: String
     *         vmId: String
     *         extensionsTimeBudget: String
     *         platformFaultDomain: Integer
     *         scheduledEventsProfile: {
     *             terminateNotificationProfile: {
     *                 notBeforeTimeout: String
     *                 enable: Boolean
     *             }
     *         }
     *         userData: String
     *         capacityReservation: {
     *             capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *         }
     *         applicationProfile: {
     *             galleryApplications: [
     *                 {
     *                     tags: String
     *                     order: Integer
     *                     packageReferenceId: String
     *                     configurationReference: String
     *                 }
     *             ]
     *         }
     *     }
     *     resources: [
     *         {
     *             id: String
     *             name: String
     *             type: String
     *             location: String
     *             tags: {
     *                 String: String
     *             }
     *             properties: {
     *                 forceUpdateTag: String
     *                 publisher: String
     *                 type: String
     *                 typeHandlerVersion: String
     *                 autoUpgradeMinorVersion: Boolean
     *                 enableAutomaticUpgrade: Boolean
     *                 settings: Object
     *                 protectedSettings: Object
     *                 provisioningState: String
     *                 instanceView: (recursive schema, see instanceView above)
     *                 suppressFailures: Boolean
     *             }
     *         }
     *     ]
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes a Virtual Machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.getWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Retrieves information about the run-time state of a virtual machine.
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
     *     platformUpdateDomain: Integer
     *     platformFaultDomain: Integer
     *     computerName: String
     *     osName: String
     *     osVersion: String
     *     hyperVGeneration: String(V1/V2)
     *     rdpThumbPrint: String
     *     vmAgent: {
     *         vmAgentVersion: String
     *         extensionHandlers: [
     *             {
     *                 type: String
     *                 typeHandlerVersion: String
     *                 status: {
     *                     code: String
     *                     level: String(Info/Warning/Error)
     *                     displayStatus: String
     *                     message: String
     *                     time: String
     *                 }
     *             }
     *         ]
     *         statuses: [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     maintenanceRedeployStatus: {
     *         isCustomerInitiatedMaintenanceAllowed: Boolean
     *         preMaintenanceWindowStartTime: String
     *         preMaintenanceWindowEndTime: String
     *         maintenanceWindowStartTime: String
     *         maintenanceWindowEndTime: String
     *         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *         lastOperationMessage: String
     *     }
     *     disks: [
     *         {
     *             name: String
     *             encryptionSettings: [
     *                 {
     *                     diskEncryptionKey: {
     *                         secretUrl: String
     *                         sourceVault: {
     *                             id: String
     *                         }
     *                     }
     *                     keyEncryptionKey: {
     *                         keyUrl: String
     *                         sourceVault: (recursive schema, see sourceVault above)
     *                     }
     *                     enabled: Boolean
     *                 }
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     extensions: [
     *         {
     *             name: String
     *             type: String
     *             typeHandlerVersion: String
     *             substatuses: [
     *                 (recursive schema, see above)
     *             ]
     *             statuses: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     vmHealth: {
     *         status: (recursive schema, see status above)
     *     }
     *     bootDiagnostics: {
     *         consoleScreenshotBlobUri: String
     *         serialConsoleLogBlobUri: String
     *         status: (recursive schema, see status above)
     *     }
     *     assignedHost: String
     *     statuses: [
     *         (recursive schema, see above)
     *     ]
     *     patchStatus: {
     *         availablePatchSummary: {
     *             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *             assessmentActivityId: String
     *             rebootPending: Boolean
     *             criticalAndSecurityPatchCount: Integer
     *             otherPatchCount: Integer
     *             startTime: String
     *             lastModifiedTime: String
     *             error: {
     *                 details: [
     *                     {
     *                         code: String
     *                         target: String
     *                         message: String
     *                     }
     *                 ]
     *                 innererror: {
     *                     exceptiontype: String
     *                     errordetail: String
     *                 }
     *                 code: String
     *                 target: String
     *                 message: String
     *             }
     *         }
     *         lastPatchInstallationSummary: {
     *             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *             installationActivityId: String
     *             maintenanceWindowExceeded: Boolean
     *             notSelectedPatchCount: Integer
     *             excludedPatchCount: Integer
     *             pendingPatchCount: Integer
     *             installedPatchCount: Integer
     *             failedPatchCount: Integer
     *             startTime: String
     *             lastModifiedTime: String
     *             error: (recursive schema, see error above)
     *         }
     *         configurationStatuses: [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the instance view of a virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> instanceViewWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.instanceViewWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Converts virtual machine disks from blob-based to managed disks. Virtual machine must be stop-deallocated before
     * invoking this operation.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> convertToManagedDisksWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.convertToManagedDisksWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Shuts down the virtual machine and releases the compute resources. You are not billed for the compute resources
     * that this virtual machine uses.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>hibernate</td><td>String</td><td>No</td><td>Optional parameter to hibernate a virtual machine. (Feature in Preview)</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deallocateWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.deallocateWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Sets the OS state of the virtual machine to generalized. It is recommended to sysprep the virtual machine before
     * performing this operation. &lt;br&gt;For Windows, please refer to [Create a managed image of a generalized VM in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/windows/capture-image-resource).&lt;br&gt;For Linux,
     * please refer to [How to create an image of a virtual machine or
     * VHD](https://docs.microsoft.com/azure/virtual-machines/linux/capture-image).
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> generalizeWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.generalizeWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Lists all of the virtual machines in the specified resource group. Use the nextLink property in the response to
     * get the next page of virtual machines.
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
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 priority: String(Regular/Low/Spot)
     *                 evictionPolicy: String(Deallocate/Delete)
     *                 billingProfile: {
     *                     maxPrice: Double
     *                 }
     *                 host: (recursive schema, see host above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 provisioningState: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     computerName: String
     *                     osName: String
     *                     osVersion: String
     *                     hyperVGeneration: String(V1/V2)
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     assignedHost: String
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     patchStatus: {
     *                         availablePatchSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             assessmentActivityId: String
     *                             rebootPending: Boolean
     *                             criticalAndSecurityPatchCount: Integer
     *                             otherPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: {
     *                                 details: [
     *                                     {
     *                                         code: String
     *                                         target: String
     *                                         message: String
     *                                     }
     *                                 ]
     *                                 innererror: {
     *                                     exceptiontype: String
     *                                     errordetail: String
     *                                 }
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         }
     *                         lastPatchInstallationSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             installationActivityId: String
     *                             maintenanceWindowExceeded: Boolean
     *                             notSelectedPatchCount: Integer
     *                             excludedPatchCount: Integer
     *                             pendingPatchCount: Integer
     *                             installedPatchCount: Integer
     *                             failedPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: (recursive schema, see error above)
     *                         }
     *                         configurationStatuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 }
     *                 licenseType: String
     *                 vmId: String
     *                 extensionsTimeBudget: String
     *                 platformFaultDomain: Integer
     *                 scheduledEventsProfile: {
     *                     terminateNotificationProfile: {
     *                         notBeforeTimeout: String
     *                         enable: Boolean
     *                     }
     *                 }
     *                 userData: String
     *                 capacityReservation: {
     *                     capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                 }
     *                 applicationProfile: {
     *                     galleryApplications: [
     *                         {
     *                             tags: String
     *                             order: Integer
     *                             packageReferenceId: String
     *                             configurationReference: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
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
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String resourceGroupName, RequestOptions requestOptions) {
        return this.serviceClient.list(resourceGroupName, requestOptions);
    }

    /**
     * Lists all of the virtual machines in the specified resource group. Use the nextLink property in the response to
     * get the next page of virtual machines.
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
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 priority: String(Regular/Low/Spot)
     *                 evictionPolicy: String(Deallocate/Delete)
     *                 billingProfile: {
     *                     maxPrice: Double
     *                 }
     *                 host: (recursive schema, see host above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 provisioningState: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     computerName: String
     *                     osName: String
     *                     osVersion: String
     *                     hyperVGeneration: String(V1/V2)
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     assignedHost: String
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     patchStatus: {
     *                         availablePatchSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             assessmentActivityId: String
     *                             rebootPending: Boolean
     *                             criticalAndSecurityPatchCount: Integer
     *                             otherPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: {
     *                                 details: [
     *                                     {
     *                                         code: String
     *                                         target: String
     *                                         message: String
     *                                     }
     *                                 ]
     *                                 innererror: {
     *                                     exceptiontype: String
     *                                     errordetail: String
     *                                 }
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         }
     *                         lastPatchInstallationSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             installationActivityId: String
     *                             maintenanceWindowExceeded: Boolean
     *                             notSelectedPatchCount: Integer
     *                             excludedPatchCount: Integer
     *                             pendingPatchCount: Integer
     *                             installedPatchCount: Integer
     *                             failedPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: (recursive schema, see error above)
     *                         }
     *                         configurationStatuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 }
     *                 licenseType: String
     *                 vmId: String
     *                 extensionsTimeBudget: String
     *                 platformFaultDomain: Integer
     *                 scheduledEventsProfile: {
     *                     terminateNotificationProfile: {
     *                         notBeforeTimeout: String
     *                         enable: Boolean
     *                     }
     *                 }
     *                 userData: String
     *                 capacityReservation: {
     *                     capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                 }
     *                 applicationProfile: {
     *                     galleryApplications: [
     *                         {
     *                             tags: String
     *                             order: Integer
     *                             packageReferenceId: String
     *                             configurationReference: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
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
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String resourceGroupName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.list(resourceGroupName, requestOptions, context);
    }

    /**
     * Lists all of the virtual machines in the specified subscription. Use the nextLink property in the response to get
     * the next page of virtual machines.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>statusOnly</td><td>String</td><td>No</td><td>statusOnly=true enables fetching run time status of all Virtual Machines in the subscription.</td></tr>
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
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 priority: String(Regular/Low/Spot)
     *                 evictionPolicy: String(Deallocate/Delete)
     *                 billingProfile: {
     *                     maxPrice: Double
     *                 }
     *                 host: (recursive schema, see host above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 provisioningState: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     computerName: String
     *                     osName: String
     *                     osVersion: String
     *                     hyperVGeneration: String(V1/V2)
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     assignedHost: String
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     patchStatus: {
     *                         availablePatchSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             assessmentActivityId: String
     *                             rebootPending: Boolean
     *                             criticalAndSecurityPatchCount: Integer
     *                             otherPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: {
     *                                 details: [
     *                                     {
     *                                         code: String
     *                                         target: String
     *                                         message: String
     *                                     }
     *                                 ]
     *                                 innererror: {
     *                                     exceptiontype: String
     *                                     errordetail: String
     *                                 }
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         }
     *                         lastPatchInstallationSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             installationActivityId: String
     *                             maintenanceWindowExceeded: Boolean
     *                             notSelectedPatchCount: Integer
     *                             excludedPatchCount: Integer
     *                             pendingPatchCount: Integer
     *                             installedPatchCount: Integer
     *                             failedPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: (recursive schema, see error above)
     *                         }
     *                         configurationStatuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 }
     *                 licenseType: String
     *                 vmId: String
     *                 extensionsTimeBudget: String
     *                 platformFaultDomain: Integer
     *                 scheduledEventsProfile: {
     *                     terminateNotificationProfile: {
     *                         notBeforeTimeout: String
     *                         enable: Boolean
     *                     }
     *                 }
     *                 userData: String
     *                 capacityReservation: {
     *                     capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                 }
     *                 applicationProfile: {
     *                     galleryApplications: [
     *                         {
     *                             tags: String
     *                             order: Integer
     *                             packageReferenceId: String
     *                             configurationReference: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
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
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAll(RequestOptions requestOptions) {
        return this.serviceClient.listAll(requestOptions);
    }

    /**
     * Lists all of the virtual machines in the specified subscription. Use the nextLink property in the response to get
     * the next page of virtual machines.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>statusOnly</td><td>String</td><td>No</td><td>statusOnly=true enables fetching run time status of all Virtual Machines in the subscription.</td></tr>
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
     *             plan: {
     *                 name: String
     *                 publisher: String
     *                 product: String
     *                 promotionCode: String
     *             }
     *             properties: {
     *                 hardwareProfile: {
     *                     vmSize: String(Basic_A0/Basic_A1/Basic_A2/Basic_A3/Basic_A4/Standard_A0/Standard_A1/Standard_A2/Standard_A3/Standard_A4/Standard_A5/Standard_A6/Standard_A7/Standard_A8/Standard_A9/Standard_A10/Standard_A11/Standard_A1_v2/Standard_A2_v2/Standard_A4_v2/Standard_A8_v2/Standard_A2m_v2/Standard_A4m_v2/Standard_A8m_v2/Standard_B1s/Standard_B1ms/Standard_B2s/Standard_B2ms/Standard_B4ms/Standard_B8ms/Standard_D1/Standard_D2/Standard_D3/Standard_D4/Standard_D11/Standard_D12/Standard_D13/Standard_D14/Standard_D1_v2/Standard_D2_v2/Standard_D3_v2/Standard_D4_v2/Standard_D5_v2/Standard_D2_v3/Standard_D4_v3/Standard_D8_v3/Standard_D16_v3/Standard_D32_v3/Standard_D64_v3/Standard_D2s_v3/Standard_D4s_v3/Standard_D8s_v3/Standard_D16s_v3/Standard_D32s_v3/Standard_D64s_v3/Standard_D11_v2/Standard_D12_v2/Standard_D13_v2/Standard_D14_v2/Standard_D15_v2/Standard_DS1/Standard_DS2/Standard_DS3/Standard_DS4/Standard_DS11/Standard_DS12/Standard_DS13/Standard_DS14/Standard_DS1_v2/Standard_DS2_v2/Standard_DS3_v2/Standard_DS4_v2/Standard_DS5_v2/Standard_DS11_v2/Standard_DS12_v2/Standard_DS13_v2/Standard_DS14_v2/Standard_DS15_v2/Standard_DS13-4_v2/Standard_DS13-2_v2/Standard_DS14-8_v2/Standard_DS14-4_v2/Standard_E2_v3/Standard_E4_v3/Standard_E8_v3/Standard_E16_v3/Standard_E32_v3/Standard_E64_v3/Standard_E2s_v3/Standard_E4s_v3/Standard_E8s_v3/Standard_E16s_v3/Standard_E32s_v3/Standard_E64s_v3/Standard_E32-16_v3/Standard_E32-8s_v3/Standard_E64-32s_v3/Standard_E64-16s_v3/Standard_F1/Standard_F2/Standard_F4/Standard_F8/Standard_F16/Standard_F1s/Standard_F2s/Standard_F4s/Standard_F8s/Standard_F16s/Standard_F2s_v2/Standard_F4s_v2/Standard_F8s_v2/Standard_F16s_v2/Standard_F32s_v2/Standard_F64s_v2/Standard_F72s_v2/Standard_G1/Standard_G2/Standard_G3/Standard_G4/Standard_G5/Standard_GS1/Standard_GS2/Standard_GS3/Standard_GS4/Standard_GS5/Standard_GS4-8/Standard_GS4-4/Standard_GS5-16/Standard_GS5-8/Standard_H8/Standard_H16/Standard_H8m/Standard_H16m/Standard_H16r/Standard_H16mr/Standard_L4s/Standard_L8s/Standard_L16s/Standard_L32s/Standard_M64s/Standard_M64ms/Standard_M128s/Standard_M128ms/Standard_M64-32ms/Standard_M64-16ms/Standard_M128-64ms/Standard_M128-32ms/Standard_NC6/Standard_NC12/Standard_NC24/Standard_NC24r/Standard_NC6s_v2/Standard_NC12s_v2/Standard_NC24s_v2/Standard_NC24rs_v2/Standard_NC6s_v3/Standard_NC12s_v3/Standard_NC24s_v3/Standard_NC24rs_v3/Standard_ND6s/Standard_ND12s/Standard_ND24s/Standard_ND24rs/Standard_NV6/Standard_NV12/Standard_NV24)
     *                     vmSizeProperties: {
     *                         vCPUsAvailable: Integer
     *                         vCPUsPerCore: Integer
     *                     }
     *                 }
     *                 storageProfile: {
     *                     imageReference: {
     *                         id: String
     *                         publisher: String
     *                         offer: String
     *                         sku: String
     *                         version: String
     *                         exactVersion: String
     *                         sharedGalleryImageId: String
     *                     }
     *                     osDisk: {
     *                         osType: String(Windows/Linux)
     *                         encryptionSettings: {
     *                             diskEncryptionKey: {
     *                                 secretUrl: String
     *                                 sourceVault: {
     *                                     id: String
     *                                 }
     *                             }
     *                             keyEncryptionKey: {
     *                                 keyUrl: String
     *                                 sourceVault: (recursive schema, see sourceVault above)
     *                             }
     *                             enabled: Boolean
     *                         }
     *                         name: String
     *                         vhd: {
     *                             uri: String
     *                         }
     *                         image: (recursive schema, see image above)
     *                         caching: String(None/ReadOnly/ReadWrite)
     *                         writeAcceleratorEnabled: Boolean
     *                         diffDiskSettings: {
     *                             option: String(Local)
     *                             placement: String(CacheDisk/ResourceDisk)
     *                         }
     *                         createOption: String(FromImage/Empty/Attach)
     *                         diskSizeGB: Integer
     *                         managedDisk: {
     *                             id: String
     *                             storageAccountType: String(Standard_LRS/Premium_LRS/StandardSSD_LRS/UltraSSD_LRS/Premium_ZRS/StandardSSD_ZRS)
     *                             diskEncryptionSet: {
     *                                 id: String
     *                             }
     *                         }
     *                         deleteOption: String(Delete/Detach)
     *                     }
     *                     dataDisks: [
     *                         {
     *                             lun: int
     *                             name: String
     *                             vhd: (recursive schema, see vhd above)
     *                             image: (recursive schema, see image above)
     *                             caching: String(None/ReadOnly/ReadWrite)
     *                             writeAcceleratorEnabled: Boolean
     *                             createOption: String(FromImage/Empty/Attach)
     *                             diskSizeGB: Integer
     *                             managedDisk: (recursive schema, see managedDisk above)
     *                             toBeDetached: Boolean
     *                             diskIopsReadWrite: Long
     *                             diskMBpsReadWrite: Long
     *                             detachOption: String(ForceDetach)
     *                             deleteOption: String(Delete/Detach)
     *                         }
     *                     ]
     *                 }
     *                 additionalCapabilities: {
     *                     ultraSSDEnabled: Boolean
     *                     hibernationEnabled: Boolean
     *                 }
     *                 osProfile: {
     *                     computerName: String
     *                     adminUsername: String
     *                     adminPassword: String
     *                     customData: String
     *                     windowsConfiguration: {
     *                         provisionVMAgent: Boolean
     *                         enableAutomaticUpdates: Boolean
     *                         timeZone: String
     *                         additionalUnattendContent: [
     *                             {
     *                                 passName: String
     *                                 componentName: String
     *                                 settingName: String(AutoLogon/FirstLogonCommands)
     *                                 content: String
     *                             }
     *                         ]
     *                         patchSettings: {
     *                             patchMode: String(Manual/AutomaticByOS/AutomaticByPlatform)
     *                             enableHotpatching: Boolean
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                         winRM: {
     *                             listeners: [
     *                                 {
     *                                     protocol: String(Http/Https)
     *                                     certificateUrl: String
     *                                 }
     *                             ]
     *                         }
     *                     }
     *                     linuxConfiguration: {
     *                         disablePasswordAuthentication: Boolean
     *                         ssh: {
     *                             publicKeys: [
     *                                 {
     *                                     path: String
     *                                     keyData: String
     *                                 }
     *                             ]
     *                         }
     *                         provisionVMAgent: Boolean
     *                         patchSettings: {
     *                             patchMode: String(ImageDefault/AutomaticByPlatform)
     *                             assessmentMode: String(ImageDefault/AutomaticByPlatform)
     *                         }
     *                     }
     *                     secrets: [
     *                         {
     *                             sourceVault: (recursive schema, see sourceVault above)
     *                             vaultCertificates: [
     *                                 {
     *                                     certificateUrl: String
     *                                     certificateStore: String
     *                                 }
     *                             ]
     *                         }
     *                     ]
     *                     allowExtensionOperations: Boolean
     *                     requireGuestProvisionSignal: Boolean
     *                 }
     *                 networkProfile: {
     *                     networkInterfaces: [
     *                         {
     *                             id: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                             }
     *                         }
     *                     ]
     *                     networkApiVersion: String(2020-11-01)
     *                     networkInterfaceConfigurations: [
     *                         {
     *                             name: String
     *                             properties: {
     *                                 primary: Boolean
     *                                 deleteOption: String(Delete/Detach)
     *                                 enableAcceleratedNetworking: Boolean
     *                                 enableFpga: Boolean
     *                                 enableIPForwarding: Boolean
     *                                 networkSecurityGroup: (recursive schema, see networkSecurityGroup above)
     *                                 dnsSettings: {
     *                                     dnsServers: [
     *                                         String
     *                                     ]
     *                                 }
     *                                 ipConfigurations: [
     *                                     {
     *                                         name: String
     *                                         properties: {
     *                                             subnet: (recursive schema, see subnet above)
     *                                             primary: Boolean
     *                                             publicIPAddressConfiguration: {
     *                                                 name: String
     *                                                 properties: {
     *                                                     idleTimeoutInMinutes: Integer
     *                                                     deleteOption: String(Delete/Detach)
     *                                                     dnsSettings: {
     *                                                         domainNameLabel: String
     *                                                     }
     *                                                     ipTags: [
     *                                                         {
     *                                                             ipTagType: String
     *                                                             tag: String
     *                                                         }
     *                                                     ]
     *                                                     publicIPPrefix: (recursive schema, see publicIPPrefix above)
     *                                                     publicIPAddressVersion: String(IPv4/IPv6)
     *                                                     publicIPAllocationMethod: String(Dynamic/Static)
     *                                                 }
     *                                                 sku: {
     *                                                     name: String(Basic/Standard)
     *                                                     tier: String(Regional/Global)
     *                                                 }
     *                                             }
     *                                             privateIPAddressVersion: String(IPv4/IPv6)
     *                                             applicationSecurityGroups: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             applicationGatewayBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                             loadBalancerBackendAddressPools: [
     *                                                 (recursive schema, see above)
     *                                             ]
     *                                         }
     *                                     }
     *                                 ]
     *                                 dscpConfiguration: (recursive schema, see dscpConfiguration above)
     *                             }
     *                         }
     *                     ]
     *                 }
     *                 securityProfile: {
     *                     uefiSettings: {
     *                         secureBootEnabled: Boolean
     *                         vTpmEnabled: Boolean
     *                     }
     *                     encryptionAtHost: Boolean
     *                     securityType: String(TrustedLaunch)
     *                 }
     *                 diagnosticsProfile: {
     *                     bootDiagnostics: {
     *                         enabled: Boolean
     *                         storageUri: String
     *                     }
     *                 }
     *                 availabilitySet: (recursive schema, see availabilitySet above)
     *                 virtualMachineScaleSet: (recursive schema, see virtualMachineScaleSet above)
     *                 proximityPlacementGroup: (recursive schema, see proximityPlacementGroup above)
     *                 priority: String(Regular/Low/Spot)
     *                 evictionPolicy: String(Deallocate/Delete)
     *                 billingProfile: {
     *                     maxPrice: Double
     *                 }
     *                 host: (recursive schema, see host above)
     *                 hostGroup: (recursive schema, see hostGroup above)
     *                 provisioningState: String
     *                 instanceView: {
     *                     platformUpdateDomain: Integer
     *                     platformFaultDomain: Integer
     *                     computerName: String
     *                     osName: String
     *                     osVersion: String
     *                     hyperVGeneration: String(V1/V2)
     *                     rdpThumbPrint: String
     *                     vmAgent: {
     *                         vmAgentVersion: String
     *                         extensionHandlers: [
     *                             {
     *                                 type: String
     *                                 typeHandlerVersion: String
     *                                 status: {
     *                                     code: String
     *                                     level: String(Info/Warning/Error)
     *                                     displayStatus: String
     *                                     message: String
     *                                     time: String
     *                                 }
     *                             }
     *                         ]
     *                         statuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                     maintenanceRedeployStatus: {
     *                         isCustomerInitiatedMaintenanceAllowed: Boolean
     *                         preMaintenanceWindowStartTime: String
     *                         preMaintenanceWindowEndTime: String
     *                         maintenanceWindowStartTime: String
     *                         maintenanceWindowEndTime: String
     *                         lastOperationResultCode: String(None/RetryLater/MaintenanceAborted/MaintenanceCompleted)
     *                         lastOperationMessage: String
     *                     }
     *                     disks: [
     *                         {
     *                             name: String
     *                             encryptionSettings: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     extensions: [
     *                         {
     *                             name: String
     *                             type: String
     *                             typeHandlerVersion: String
     *                             substatuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                             statuses: [
     *                                 (recursive schema, see above)
     *                             ]
     *                         }
     *                     ]
     *                     vmHealth: {
     *                         status: (recursive schema, see status above)
     *                     }
     *                     bootDiagnostics: {
     *                         consoleScreenshotBlobUri: String
     *                         serialConsoleLogBlobUri: String
     *                         status: (recursive schema, see status above)
     *                     }
     *                     assignedHost: String
     *                     statuses: [
     *                         (recursive schema, see above)
     *                     ]
     *                     patchStatus: {
     *                         availablePatchSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             assessmentActivityId: String
     *                             rebootPending: Boolean
     *                             criticalAndSecurityPatchCount: Integer
     *                             otherPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: {
     *                                 details: [
     *                                     {
     *                                         code: String
     *                                         target: String
     *                                         message: String
     *                                     }
     *                                 ]
     *                                 innererror: {
     *                                     exceptiontype: String
     *                                     errordetail: String
     *                                 }
     *                                 code: String
     *                                 target: String
     *                                 message: String
     *                             }
     *                         }
     *                         lastPatchInstallationSummary: {
     *                             status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *                             installationActivityId: String
     *                             maintenanceWindowExceeded: Boolean
     *                             notSelectedPatchCount: Integer
     *                             excludedPatchCount: Integer
     *                             pendingPatchCount: Integer
     *                             installedPatchCount: Integer
     *                             failedPatchCount: Integer
     *                             startTime: String
     *                             lastModifiedTime: String
     *                             error: (recursive schema, see error above)
     *                         }
     *                         configurationStatuses: [
     *                             (recursive schema, see above)
     *                         ]
     *                     }
     *                 }
     *                 licenseType: String
     *                 vmId: String
     *                 extensionsTimeBudget: String
     *                 platformFaultDomain: Integer
     *                 scheduledEventsProfile: {
     *                     terminateNotificationProfile: {
     *                         notBeforeTimeout: String
     *                         enable: Boolean
     *                     }
     *                 }
     *                 userData: String
     *                 capacityReservation: {
     *                     capacityReservationGroup: (recursive schema, see capacityReservationGroup above)
     *                 }
     *                 applicationProfile: {
     *                     galleryApplications: [
     *                         {
     *                             tags: String
     *                             order: Integer
     *                             packageReferenceId: String
     *                             configurationReference: String
     *                         }
     *                     ]
     *                 }
     *             }
     *             resources: [
     *                 {
     *                     id: String
     *                     name: String
     *                     type: String
     *                     location: String
     *                     tags: {
     *                         String: String
     *                     }
     *                     properties: {
     *                         forceUpdateTag: String
     *                         publisher: String
     *                         type: String
     *                         typeHandlerVersion: String
     *                         autoUpgradeMinorVersion: Boolean
     *                         enableAutomaticUpgrade: Boolean
     *                         settings: Object
     *                         protectedSettings: Object
     *                         provisioningState: String
     *                         instanceView: (recursive schema, see instanceView above)
     *                         suppressFailures: Boolean
     *                     }
     *                 }
     *             ]
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
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAll(RequestOptions requestOptions, Context context) {
        return this.serviceClient.listAll(requestOptions, context);
    }

    /**
     * Lists all available virtual machine sizes to which the specified virtual machine can be resized.
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
     *             name: String
     *             numberOfCores: Integer
     *             osDiskSizeInMB: Integer
     *             resourceDiskSizeInMB: Integer
     *             memoryInMB: Integer
     *             maxDataDiskCount: Integer
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAvailableSizes(
            String resourceGroupName, String vmName, RequestOptions requestOptions) {
        return this.serviceClient.listAvailableSizes(resourceGroupName, vmName, requestOptions);
    }

    /**
     * Lists all available virtual machine sizes to which the specified virtual machine can be resized.
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
     *             name: String
     *             numberOfCores: Integer
     *             osDiskSizeInMB: Integer
     *             resourceDiskSizeInMB: Integer
     *             memoryInMB: Integer
     *             maxDataDiskCount: Integer
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listAvailableSizes(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.listAvailableSizes(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * The operation to power off (stop) a virtual machine. The virtual machine can be restarted with the same
     * provisioned resources. You are still charged for this virtual machine.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> powerOffWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.powerOffWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * The operation to reapply a virtual machine's state.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> reapplyWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.reapplyWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * The operation to restart a virtual machine.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> restartWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.restartWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * The operation to start a virtual machine.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> startWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.startWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Shuts down the virtual machine, moves it to a new node, and powers it back on.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> redeployWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.redeployWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Reimages the virtual machine which has an ephemeral OS disk back to its initial state.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> reimageWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.reimageWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * The operation to retrieve SAS URIs for a virtual machine's boot diagnostic logs.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>sasUriExpirationTimeInMinutes</td><td>String</td><td>No</td><td>Expiration duration in minutes for the SAS URIs with a value between 1 to 1440 minutes. &lt;br&gt;&lt;br&gt;NOTE: If not specified, SAS URIs will be generated with a default expiration duration of 120 minutes.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     consoleScreenshotBlobUri: String
     *     serialConsoleLogBlobUri: String
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the SAS URIs of the console screenshot and serial log blobs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> retrieveBootDiagnosticsDataWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.retrieveBootDiagnosticsDataWithResponse(
                resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * The operation to perform maintenance on a virtual machine.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> performMaintenanceWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.performMaintenanceWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * The operation to simulate the eviction of spot virtual machine.
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
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> simulateEvictionWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.simulateEvictionWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Assess patches on the VM.
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
     *     status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *     assessmentActivityId: String
     *     rebootPending: Boolean
     *     criticalAndSecurityPatchCount: Integer
     *     otherPatchCount: Integer
     *     startDateTime: String
     *     availablePatches: [
     *         {
     *             patchId: String
     *             name: String
     *             version: String
     *             kbId: String
     *             classifications: [
     *                 String
     *             ]
     *             rebootBehavior: String(Unknown/NeverReboots/AlwaysRequiresReboot/CanRequestReboot)
     *             activityId: String
     *             publishedDate: String
     *             lastModifiedDateTime: String
     *             assessmentState: String(Unknown/Available)
     *         }
     *     ]
     *     error: {
     *         details: [
     *             {
     *                 code: String
     *                 target: String
     *                 message: String
     *             }
     *         ]
     *         innererror: {
     *             exceptiontype: String
     *             errordetail: String
     *         }
     *         code: String
     *         target: String
     *         message: String
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return describes the properties of an AssessPatches result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> assessPatchesWithResponse(
            String resourceGroupName, String vmName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.assessPatchesWithResponse(resourceGroupName, vmName, requestOptions, context);
    }

    /**
     * Installs patches on the VM.
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
     *     maximumDuration: String
     *     rebootSetting: String(IfRequired/Never/Always)
     *     windowsParameters: {
     *         classificationsToInclude: [
     *             String(Critical/Security/UpdateRollUp/FeaturePack/ServicePack/Definition/Tools/Updates)
     *         ]
     *         kbNumbersToInclude: [
     *             String
     *         ]
     *         kbNumbersToExclude: [
     *             String
     *         ]
     *         excludeKbsRequiringReboot: Boolean
     *         maxPatchPublishDate: String
     *     }
     *     linuxParameters: {
     *         classificationsToInclude: [
     *             String(Critical/Security/Other)
     *         ]
     *         packageNameMasksToInclude: [
     *             String
     *         ]
     *         packageNameMasksToExclude: [
     *             String
     *         ]
     *         maintenanceRunId: String
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     status: String(Unknown/InProgress/Failed/Succeeded/CompletedWithWarnings)
     *     installationActivityId: String
     *     rebootStatus: String(Unknown/NotNeeded/Required/Started/Failed/Completed)
     *     maintenanceWindowExceeded: Boolean
     *     excludedPatchCount: Integer
     *     notSelectedPatchCount: Integer
     *     pendingPatchCount: Integer
     *     installedPatchCount: Integer
     *     failedPatchCount: Integer
     *     patches: [
     *         {
     *             patchId: String
     *             name: String
     *             version: String
     *             kbId: String
     *             classifications: [
     *                 String
     *             ]
     *             installationState: String(Unknown/Installed/Failed/Excluded/NotSelected/Pending)
     *         }
     *     ]
     *     startDateTime: String
     *     error: {
     *         details: [
     *             {
     *                 code: String
     *                 target: String
     *                 message: String
     *             }
     *         ]
     *         innererror: {
     *             exceptiontype: String
     *             errordetail: String
     *         }
     *         code: String
     *         target: String
     *         message: String
     *     }
     * }
     * }</pre>
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param installPatchesInput Input for InstallPatches as directly received by the API.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the result summary of an installation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> installPatchesWithResponse(
            String resourceGroupName,
            String vmName,
            BinaryData installPatchesInput,
            RequestOptions requestOptions,
            Context context) {
        return this.serviceClient.installPatchesWithResponse(
                resourceGroupName, vmName, installPatchesInput, requestOptions, context);
    }
}
