package fixtures.compute.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import fixtures.compute.ComputeServiceVersion;

/** Initializes a new instance of the ComputeManagementClient type. */
public final class ComputeManagementClientImpl {
    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** Service version. */
    private final ComputeServiceVersion serviceVersion;

    /**
     * Gets Service version.
     *
     * @return the serviceVersion value.
     */
    public ComputeServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The OperationsImpl object to access its operations. */
    private final OperationsImpl operations;

    /**
     * Gets the OperationsImpl object to access its operations.
     *
     * @return the OperationsImpl object.
     */
    public OperationsImpl getOperations() {
        return this.operations;
    }

    /** The AvailabilitySetsImpl object to access its operations. */
    private final AvailabilitySetsImpl availabilitySets;

    /**
     * Gets the AvailabilitySetsImpl object to access its operations.
     *
     * @return the AvailabilitySetsImpl object.
     */
    public AvailabilitySetsImpl getAvailabilitySets() {
        return this.availabilitySets;
    }

    /** The ProximityPlacementGroupsImpl object to access its operations. */
    private final ProximityPlacementGroupsImpl proximityPlacementGroups;

    /**
     * Gets the ProximityPlacementGroupsImpl object to access its operations.
     *
     * @return the ProximityPlacementGroupsImpl object.
     */
    public ProximityPlacementGroupsImpl getProximityPlacementGroups() {
        return this.proximityPlacementGroups;
    }

    /** The DedicatedHostGroupsImpl object to access its operations. */
    private final DedicatedHostGroupsImpl dedicatedHostGroups;

    /**
     * Gets the DedicatedHostGroupsImpl object to access its operations.
     *
     * @return the DedicatedHostGroupsImpl object.
     */
    public DedicatedHostGroupsImpl getDedicatedHostGroups() {
        return this.dedicatedHostGroups;
    }

    /** The DedicatedHostsImpl object to access its operations. */
    private final DedicatedHostsImpl dedicatedHosts;

    /**
     * Gets the DedicatedHostsImpl object to access its operations.
     *
     * @return the DedicatedHostsImpl object.
     */
    public DedicatedHostsImpl getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    /** The SshPublicKeysImpl object to access its operations. */
    private final SshPublicKeysImpl sshPublicKeys;

    /**
     * Gets the SshPublicKeysImpl object to access its operations.
     *
     * @return the SshPublicKeysImpl object.
     */
    public SshPublicKeysImpl getSshPublicKeys() {
        return this.sshPublicKeys;
    }

    /** The VirtualMachineExtensionImagesImpl object to access its operations. */
    private final VirtualMachineExtensionImagesImpl virtualMachineExtensionImages;

    /**
     * Gets the VirtualMachineExtensionImagesImpl object to access its operations.
     *
     * @return the VirtualMachineExtensionImagesImpl object.
     */
    public VirtualMachineExtensionImagesImpl getVirtualMachineExtensionImages() {
        return this.virtualMachineExtensionImages;
    }

    /** The VirtualMachineExtensionsImpl object to access its operations. */
    private final VirtualMachineExtensionsImpl virtualMachineExtensions;

    /**
     * Gets the VirtualMachineExtensionsImpl object to access its operations.
     *
     * @return the VirtualMachineExtensionsImpl object.
     */
    public VirtualMachineExtensionsImpl getVirtualMachineExtensions() {
        return this.virtualMachineExtensions;
    }

    /** The VirtualMachineImagesImpl object to access its operations. */
    private final VirtualMachineImagesImpl virtualMachineImages;

    /**
     * Gets the VirtualMachineImagesImpl object to access its operations.
     *
     * @return the VirtualMachineImagesImpl object.
     */
    public VirtualMachineImagesImpl getVirtualMachineImages() {
        return this.virtualMachineImages;
    }

    /** The VirtualMachineImagesEdgeZonesImpl object to access its operations. */
    private final VirtualMachineImagesEdgeZonesImpl virtualMachineImagesEdgeZones;

    /**
     * Gets the VirtualMachineImagesEdgeZonesImpl object to access its operations.
     *
     * @return the VirtualMachineImagesEdgeZonesImpl object.
     */
    public VirtualMachineImagesEdgeZonesImpl getVirtualMachineImagesEdgeZones() {
        return this.virtualMachineImagesEdgeZones;
    }

    /** The UsagesImpl object to access its operations. */
    private final UsagesImpl usages;

    /**
     * Gets the UsagesImpl object to access its operations.
     *
     * @return the UsagesImpl object.
     */
    public UsagesImpl getUsages() {
        return this.usages;
    }

    /** The VirtualMachinesImpl object to access its operations. */
    private final VirtualMachinesImpl virtualMachines;

    /**
     * Gets the VirtualMachinesImpl object to access its operations.
     *
     * @return the VirtualMachinesImpl object.
     */
    public VirtualMachinesImpl getVirtualMachines() {
        return this.virtualMachines;
    }

    /** The VirtualMachineScaleSetsImpl object to access its operations. */
    private final VirtualMachineScaleSetsImpl virtualMachineScaleSets;

    /**
     * Gets the VirtualMachineScaleSetsImpl object to access its operations.
     *
     * @return the VirtualMachineScaleSetsImpl object.
     */
    public VirtualMachineScaleSetsImpl getVirtualMachineScaleSets() {
        return this.virtualMachineScaleSets;
    }

    /** The VirtualMachineSizesImpl object to access its operations. */
    private final VirtualMachineSizesImpl virtualMachineSizes;

    /**
     * Gets the VirtualMachineSizesImpl object to access its operations.
     *
     * @return the VirtualMachineSizesImpl object.
     */
    public VirtualMachineSizesImpl getVirtualMachineSizes() {
        return this.virtualMachineSizes;
    }

    /** The ImagesImpl object to access its operations. */
    private final ImagesImpl images;

    /**
     * Gets the ImagesImpl object to access its operations.
     *
     * @return the ImagesImpl object.
     */
    public ImagesImpl getImages() {
        return this.images;
    }

    /** The RestorePointCollectionsImpl object to access its operations. */
    private final RestorePointCollectionsImpl restorePointCollections;

    /**
     * Gets the RestorePointCollectionsImpl object to access its operations.
     *
     * @return the RestorePointCollectionsImpl object.
     */
    public RestorePointCollectionsImpl getRestorePointCollections() {
        return this.restorePointCollections;
    }

    /** The RestorePointsImpl object to access its operations. */
    private final RestorePointsImpl restorePoints;

    /**
     * Gets the RestorePointsImpl object to access its operations.
     *
     * @return the RestorePointsImpl object.
     */
    public RestorePointsImpl getRestorePoints() {
        return this.restorePoints;
    }

    /** The CapacityReservationGroupsImpl object to access its operations. */
    private final CapacityReservationGroupsImpl capacityReservationGroups;

    /**
     * Gets the CapacityReservationGroupsImpl object to access its operations.
     *
     * @return the CapacityReservationGroupsImpl object.
     */
    public CapacityReservationGroupsImpl getCapacityReservationGroups() {
        return this.capacityReservationGroups;
    }

    /** The CapacityReservationsImpl object to access its operations. */
    private final CapacityReservationsImpl capacityReservations;

    /**
     * Gets the CapacityReservationsImpl object to access its operations.
     *
     * @return the CapacityReservationsImpl object.
     */
    public CapacityReservationsImpl getCapacityReservations() {
        return this.capacityReservations;
    }

    /** The VirtualMachineScaleSetExtensionsImpl object to access its operations. */
    private final VirtualMachineScaleSetExtensionsImpl virtualMachineScaleSetExtensions;

    /**
     * Gets the VirtualMachineScaleSetExtensionsImpl object to access its operations.
     *
     * @return the VirtualMachineScaleSetExtensionsImpl object.
     */
    public VirtualMachineScaleSetExtensionsImpl getVirtualMachineScaleSetExtensions() {
        return this.virtualMachineScaleSetExtensions;
    }

    /** The VirtualMachineScaleSetRollingUpgradesImpl object to access its operations. */
    private final VirtualMachineScaleSetRollingUpgradesImpl virtualMachineScaleSetRollingUpgrades;

    /**
     * Gets the VirtualMachineScaleSetRollingUpgradesImpl object to access its operations.
     *
     * @return the VirtualMachineScaleSetRollingUpgradesImpl object.
     */
    public VirtualMachineScaleSetRollingUpgradesImpl getVirtualMachineScaleSetRollingUpgrades() {
        return this.virtualMachineScaleSetRollingUpgrades;
    }

    /** The VirtualMachineScaleSetVMExtensionsImpl object to access its operations. */
    private final VirtualMachineScaleSetVMExtensionsImpl virtualMachineScaleSetVMExtensions;

    /**
     * Gets the VirtualMachineScaleSetVMExtensionsImpl object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMExtensionsImpl object.
     */
    public VirtualMachineScaleSetVMExtensionsImpl getVirtualMachineScaleSetVMExtensions() {
        return this.virtualMachineScaleSetVMExtensions;
    }

    /** The VirtualMachineScaleSetVMsImpl object to access its operations. */
    private final VirtualMachineScaleSetVMsImpl virtualMachineScaleSetVMs;

    /**
     * Gets the VirtualMachineScaleSetVMsImpl object to access its operations.
     *
     * @return the VirtualMachineScaleSetVMsImpl object.
     */
    public VirtualMachineScaleSetVMsImpl getVirtualMachineScaleSetVMs() {
        return this.virtualMachineScaleSetVMs;
    }

    /** The LogAnalyticsImpl object to access its operations. */
    private final LogAnalyticsImpl logAnalytics;

    /**
     * Gets the LogAnalyticsImpl object to access its operations.
     *
     * @return the LogAnalyticsImpl object.
     */
    public LogAnalyticsImpl getLogAnalytics() {
        return this.logAnalytics;
    }

    /**
     * Initializes an instance of ComputeManagementClient client.
     *
     * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public ComputeManagementClientImpl(String subscriptionId, String host, ComputeServiceVersion serviceVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                subscriptionId,
                host,
                serviceVersion);
    }

    /**
     * Initializes an instance of ComputeManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public ComputeManagementClientImpl(
            HttpPipeline httpPipeline, String subscriptionId, String host, ComputeServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), subscriptionId, host, serviceVersion);
    }

    /**
     * Initializes an instance of ComputeManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param subscriptionId Subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public ComputeManagementClientImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String subscriptionId,
            String host,
            ComputeServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.subscriptionId = subscriptionId;
        this.host = host;
        this.serviceVersion = serviceVersion;
        this.operations = new OperationsImpl(this);
        this.availabilitySets = new AvailabilitySetsImpl(this);
        this.proximityPlacementGroups = new ProximityPlacementGroupsImpl(this);
        this.dedicatedHostGroups = new DedicatedHostGroupsImpl(this);
        this.dedicatedHosts = new DedicatedHostsImpl(this);
        this.sshPublicKeys = new SshPublicKeysImpl(this);
        this.virtualMachineExtensionImages = new VirtualMachineExtensionImagesImpl(this);
        this.virtualMachineExtensions = new VirtualMachineExtensionsImpl(this);
        this.virtualMachineImages = new VirtualMachineImagesImpl(this);
        this.virtualMachineImagesEdgeZones = new VirtualMachineImagesEdgeZonesImpl(this);
        this.usages = new UsagesImpl(this);
        this.virtualMachines = new VirtualMachinesImpl(this);
        this.virtualMachineScaleSets = new VirtualMachineScaleSetsImpl(this);
        this.virtualMachineSizes = new VirtualMachineSizesImpl(this);
        this.images = new ImagesImpl(this);
        this.restorePointCollections = new RestorePointCollectionsImpl(this);
        this.restorePoints = new RestorePointsImpl(this);
        this.capacityReservationGroups = new CapacityReservationGroupsImpl(this);
        this.capacityReservations = new CapacityReservationsImpl(this);
        this.virtualMachineScaleSetExtensions = new VirtualMachineScaleSetExtensionsImpl(this);
        this.virtualMachineScaleSetRollingUpgrades = new VirtualMachineScaleSetRollingUpgradesImpl(this);
        this.virtualMachineScaleSetVMExtensions = new VirtualMachineScaleSetVMExtensionsImpl(this);
        this.virtualMachineScaleSetVMs = new VirtualMachineScaleSetVMsImpl(this);
        this.logAnalytics = new LogAnalyticsImpl(this);
    }
}
