package fixtures.compute;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JacksonAdapter;
import fixtures.compute.implementation.ComputeManagementClientImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the ComputeManagementClient type. */
@ServiceClientBuilder(
        serviceClients = {
            OperationsClient.class,
            AvailabilitySetsClient.class,
            ProximityPlacementGroupsClient.class,
            DedicatedHostGroupsClient.class,
            DedicatedHostsClient.class,
            SshPublicKeysClient.class,
            VirtualMachineExtensionImagesClient.class,
            VirtualMachineExtensionsClient.class,
            VirtualMachineImagesClient.class,
            VirtualMachineImagesEdgeZoneClient.class,
            UsageClient.class,
            VirtualMachinesClient.class,
            VirtualMachineScaleSetsClient.class,
            VirtualMachineSizesClient.class,
            ImagesClient.class,
            RestorePointCollectionsClient.class,
            RestorePointsClient.class,
            CapacityReservationGroupsClient.class,
            CapacityReservationsClient.class,
            VirtualMachineScaleSetExtensionsClient.class,
            VirtualMachineScaleSetRollingUpgradesClient.class,
            VirtualMachineScaleSetVMExtensionsClient.class,
            VirtualMachineScaleSetVMsClient.class,
            LogAnalyticsClient.class,
            OperationsAsyncClient.class,
            AvailabilitySetsAsyncClient.class,
            ProximityPlacementGroupsAsyncClient.class,
            DedicatedHostGroupsAsyncClient.class,
            DedicatedHostsAsyncClient.class,
            SshPublicKeysAsyncClient.class,
            VirtualMachineExtensionImagesAsyncClient.class,
            VirtualMachineExtensionsAsyncClient.class,
            VirtualMachineImagesAsyncClient.class,
            VirtualMachineImagesEdgeZoneAsyncClient.class,
            UsageAsyncClient.class,
            VirtualMachinesAsyncClient.class,
            VirtualMachineScaleSetsAsyncClient.class,
            VirtualMachineSizesAsyncClient.class,
            ImagesAsyncClient.class,
            RestorePointCollectionsAsyncClient.class,
            RestorePointsAsyncClient.class,
            CapacityReservationGroupsAsyncClient.class,
            CapacityReservationsAsyncClient.class,
            VirtualMachineScaleSetExtensionsAsyncClient.class,
            VirtualMachineScaleSetRollingUpgradesAsyncClient.class,
            VirtualMachineScaleSetVMExtensionsAsyncClient.class,
            VirtualMachineScaleSetVMsAsyncClient.class,
            LogAnalyticsAsyncClient.class
        })
public final class ComputeManagementClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the ComputeManagementClientBuilder. */
    public ComputeManagementClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * Subscription credentials which uniquely identify Microsoft Azure
     * subscription. The subscription ID forms part of the URI for every
     * service call.
     */
    private String subscriptionId;

    /**
     * Sets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * Service version
     */
    private ComputeServiceVersion serviceVersion;

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder serviceVersion(ComputeServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /*
     * The client options such as application ID and custom headers to set on a
     * request.
     */
    private ClientOptions clientOptions;

    /**
     * Sets The client options such as application ID and custom headers to set on a request.
     *
     * @param clientOptions the clientOptions value.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the ComputeManagementClientBuilder.
     */
    public ComputeManagementClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of ComputeManagementClientImpl with the provided parameters.
     *
     * @return an instance of ComputeManagementClientImpl.
     */
    private ComputeManagementClientImpl buildInnerClient() {
        if (host == null) {
            this.host = "https://management.azure.com";
        }
        if (serviceVersion == null) {
            this.serviceVersion = ComputeServiceVersion.getLatest();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        ComputeManagementClientImpl client =
                new ComputeManagementClientImpl(
                        pipeline,
                        JacksonAdapter.createDefaultSerializerAdapter(),
                        subscriptionId,
                        host,
                        serviceVersion);
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        if (clientOptions == null) {
            clientOptions = new ClientOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(clientOptions, httpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        HttpHeaders headers = new HttpHeaders();
        clientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of OperationsAsyncClient async client.
     *
     * @return an instance of OperationsAsyncClient.
     */
    public OperationsAsyncClient buildOperationsAsyncClient() {
        return new OperationsAsyncClient(buildInnerClient().getOperations());
    }

    /**
     * Builds an instance of AvailabilitySetsAsyncClient async client.
     *
     * @return an instance of AvailabilitySetsAsyncClient.
     */
    public AvailabilitySetsAsyncClient buildAvailabilitySetsAsyncClient() {
        return new AvailabilitySetsAsyncClient(buildInnerClient().getAvailabilitySets());
    }

    /**
     * Builds an instance of ProximityPlacementGroupsAsyncClient async client.
     *
     * @return an instance of ProximityPlacementGroupsAsyncClient.
     */
    public ProximityPlacementGroupsAsyncClient buildProximityPlacementGroupsAsyncClient() {
        return new ProximityPlacementGroupsAsyncClient(buildInnerClient().getProximityPlacementGroups());
    }

    /**
     * Builds an instance of DedicatedHostGroupsAsyncClient async client.
     *
     * @return an instance of DedicatedHostGroupsAsyncClient.
     */
    public DedicatedHostGroupsAsyncClient buildDedicatedHostGroupsAsyncClient() {
        return new DedicatedHostGroupsAsyncClient(buildInnerClient().getDedicatedHostGroups());
    }

    /**
     * Builds an instance of DedicatedHostsAsyncClient async client.
     *
     * @return an instance of DedicatedHostsAsyncClient.
     */
    public DedicatedHostsAsyncClient buildDedicatedHostsAsyncClient() {
        return new DedicatedHostsAsyncClient(buildInnerClient().getDedicatedHosts());
    }

    /**
     * Builds an instance of SshPublicKeysAsyncClient async client.
     *
     * @return an instance of SshPublicKeysAsyncClient.
     */
    public SshPublicKeysAsyncClient buildSshPublicKeysAsyncClient() {
        return new SshPublicKeysAsyncClient(buildInnerClient().getSshPublicKeys());
    }

    /**
     * Builds an instance of VirtualMachineExtensionImagesAsyncClient async client.
     *
     * @return an instance of VirtualMachineExtensionImagesAsyncClient.
     */
    public VirtualMachineExtensionImagesAsyncClient buildVirtualMachineExtensionImagesAsyncClient() {
        return new VirtualMachineExtensionImagesAsyncClient(buildInnerClient().getVirtualMachineExtensionImages());
    }

    /**
     * Builds an instance of VirtualMachineExtensionsAsyncClient async client.
     *
     * @return an instance of VirtualMachineExtensionsAsyncClient.
     */
    public VirtualMachineExtensionsAsyncClient buildVirtualMachineExtensionsAsyncClient() {
        return new VirtualMachineExtensionsAsyncClient(buildInnerClient().getVirtualMachineExtensions());
    }

    /**
     * Builds an instance of VirtualMachineImagesAsyncClient async client.
     *
     * @return an instance of VirtualMachineImagesAsyncClient.
     */
    public VirtualMachineImagesAsyncClient buildVirtualMachineImagesAsyncClient() {
        return new VirtualMachineImagesAsyncClient(buildInnerClient().getVirtualMachineImages());
    }

    /**
     * Builds an instance of VirtualMachineImagesEdgeZoneAsyncClient async client.
     *
     * @return an instance of VirtualMachineImagesEdgeZoneAsyncClient.
     */
    public VirtualMachineImagesEdgeZoneAsyncClient buildVirtualMachineImagesEdgeZoneAsyncClient() {
        return new VirtualMachineImagesEdgeZoneAsyncClient(buildInnerClient().getVirtualMachineImagesEdgeZones());
    }

    /**
     * Builds an instance of UsageAsyncClient async client.
     *
     * @return an instance of UsageAsyncClient.
     */
    public UsageAsyncClient buildUsageAsyncClient() {
        return new UsageAsyncClient(buildInnerClient().getUsages());
    }

    /**
     * Builds an instance of VirtualMachinesAsyncClient async client.
     *
     * @return an instance of VirtualMachinesAsyncClient.
     */
    public VirtualMachinesAsyncClient buildVirtualMachinesAsyncClient() {
        return new VirtualMachinesAsyncClient(buildInnerClient().getVirtualMachines());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetsAsyncClient async client.
     *
     * @return an instance of VirtualMachineScaleSetsAsyncClient.
     */
    public VirtualMachineScaleSetsAsyncClient buildVirtualMachineScaleSetsAsyncClient() {
        return new VirtualMachineScaleSetsAsyncClient(buildInnerClient().getVirtualMachineScaleSets());
    }

    /**
     * Builds an instance of VirtualMachineSizesAsyncClient async client.
     *
     * @return an instance of VirtualMachineSizesAsyncClient.
     */
    public VirtualMachineSizesAsyncClient buildVirtualMachineSizesAsyncClient() {
        return new VirtualMachineSizesAsyncClient(buildInnerClient().getVirtualMachineSizes());
    }

    /**
     * Builds an instance of ImagesAsyncClient async client.
     *
     * @return an instance of ImagesAsyncClient.
     */
    public ImagesAsyncClient buildImagesAsyncClient() {
        return new ImagesAsyncClient(buildInnerClient().getImages());
    }

    /**
     * Builds an instance of RestorePointCollectionsAsyncClient async client.
     *
     * @return an instance of RestorePointCollectionsAsyncClient.
     */
    public RestorePointCollectionsAsyncClient buildRestorePointCollectionsAsyncClient() {
        return new RestorePointCollectionsAsyncClient(buildInnerClient().getRestorePointCollections());
    }

    /**
     * Builds an instance of RestorePointsAsyncClient async client.
     *
     * @return an instance of RestorePointsAsyncClient.
     */
    public RestorePointsAsyncClient buildRestorePointsAsyncClient() {
        return new RestorePointsAsyncClient(buildInnerClient().getRestorePoints());
    }

    /**
     * Builds an instance of CapacityReservationGroupsAsyncClient async client.
     *
     * @return an instance of CapacityReservationGroupsAsyncClient.
     */
    public CapacityReservationGroupsAsyncClient buildCapacityReservationGroupsAsyncClient() {
        return new CapacityReservationGroupsAsyncClient(buildInnerClient().getCapacityReservationGroups());
    }

    /**
     * Builds an instance of CapacityReservationsAsyncClient async client.
     *
     * @return an instance of CapacityReservationsAsyncClient.
     */
    public CapacityReservationsAsyncClient buildCapacityReservationsAsyncClient() {
        return new CapacityReservationsAsyncClient(buildInnerClient().getCapacityReservations());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetExtensionsAsyncClient async client.
     *
     * @return an instance of VirtualMachineScaleSetExtensionsAsyncClient.
     */
    public VirtualMachineScaleSetExtensionsAsyncClient buildVirtualMachineScaleSetExtensionsAsyncClient() {
        return new VirtualMachineScaleSetExtensionsAsyncClient(
                buildInnerClient().getVirtualMachineScaleSetExtensions());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetRollingUpgradesAsyncClient async client.
     *
     * @return an instance of VirtualMachineScaleSetRollingUpgradesAsyncClient.
     */
    public VirtualMachineScaleSetRollingUpgradesAsyncClient buildVirtualMachineScaleSetRollingUpgradesAsyncClient() {
        return new VirtualMachineScaleSetRollingUpgradesAsyncClient(
                buildInnerClient().getVirtualMachineScaleSetRollingUpgrades());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetVMExtensionsAsyncClient async client.
     *
     * @return an instance of VirtualMachineScaleSetVMExtensionsAsyncClient.
     */
    public VirtualMachineScaleSetVMExtensionsAsyncClient buildVirtualMachineScaleSetVMExtensionsAsyncClient() {
        return new VirtualMachineScaleSetVMExtensionsAsyncClient(
                buildInnerClient().getVirtualMachineScaleSetVMExtensions());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetVMsAsyncClient async client.
     *
     * @return an instance of VirtualMachineScaleSetVMsAsyncClient.
     */
    public VirtualMachineScaleSetVMsAsyncClient buildVirtualMachineScaleSetVMsAsyncClient() {
        return new VirtualMachineScaleSetVMsAsyncClient(buildInnerClient().getVirtualMachineScaleSetVMs());
    }

    /**
     * Builds an instance of LogAnalyticsAsyncClient async client.
     *
     * @return an instance of LogAnalyticsAsyncClient.
     */
    public LogAnalyticsAsyncClient buildLogAnalyticsAsyncClient() {
        return new LogAnalyticsAsyncClient(buildInnerClient().getLogAnalytics());
    }

    /**
     * Builds an instance of OperationsClient sync client.
     *
     * @return an instance of OperationsClient.
     */
    public OperationsClient buildOperationsClient() {
        return new OperationsClient(buildInnerClient().getOperations());
    }

    /**
     * Builds an instance of AvailabilitySetsClient sync client.
     *
     * @return an instance of AvailabilitySetsClient.
     */
    public AvailabilitySetsClient buildAvailabilitySetsClient() {
        return new AvailabilitySetsClient(buildInnerClient().getAvailabilitySets());
    }

    /**
     * Builds an instance of ProximityPlacementGroupsClient sync client.
     *
     * @return an instance of ProximityPlacementGroupsClient.
     */
    public ProximityPlacementGroupsClient buildProximityPlacementGroupsClient() {
        return new ProximityPlacementGroupsClient(buildInnerClient().getProximityPlacementGroups());
    }

    /**
     * Builds an instance of DedicatedHostGroupsClient sync client.
     *
     * @return an instance of DedicatedHostGroupsClient.
     */
    public DedicatedHostGroupsClient buildDedicatedHostGroupsClient() {
        return new DedicatedHostGroupsClient(buildInnerClient().getDedicatedHostGroups());
    }

    /**
     * Builds an instance of DedicatedHostsClient sync client.
     *
     * @return an instance of DedicatedHostsClient.
     */
    public DedicatedHostsClient buildDedicatedHostsClient() {
        return new DedicatedHostsClient(buildInnerClient().getDedicatedHosts());
    }

    /**
     * Builds an instance of SshPublicKeysClient sync client.
     *
     * @return an instance of SshPublicKeysClient.
     */
    public SshPublicKeysClient buildSshPublicKeysClient() {
        return new SshPublicKeysClient(buildInnerClient().getSshPublicKeys());
    }

    /**
     * Builds an instance of VirtualMachineExtensionImagesClient sync client.
     *
     * @return an instance of VirtualMachineExtensionImagesClient.
     */
    public VirtualMachineExtensionImagesClient buildVirtualMachineExtensionImagesClient() {
        return new VirtualMachineExtensionImagesClient(buildInnerClient().getVirtualMachineExtensionImages());
    }

    /**
     * Builds an instance of VirtualMachineExtensionsClient sync client.
     *
     * @return an instance of VirtualMachineExtensionsClient.
     */
    public VirtualMachineExtensionsClient buildVirtualMachineExtensionsClient() {
        return new VirtualMachineExtensionsClient(buildInnerClient().getVirtualMachineExtensions());
    }

    /**
     * Builds an instance of VirtualMachineImagesClient sync client.
     *
     * @return an instance of VirtualMachineImagesClient.
     */
    public VirtualMachineImagesClient buildVirtualMachineImagesClient() {
        return new VirtualMachineImagesClient(buildInnerClient().getVirtualMachineImages());
    }

    /**
     * Builds an instance of VirtualMachineImagesEdgeZoneClient sync client.
     *
     * @return an instance of VirtualMachineImagesEdgeZoneClient.
     */
    public VirtualMachineImagesEdgeZoneClient buildVirtualMachineImagesEdgeZoneClient() {
        return new VirtualMachineImagesEdgeZoneClient(buildInnerClient().getVirtualMachineImagesEdgeZones());
    }

    /**
     * Builds an instance of UsageClient sync client.
     *
     * @return an instance of UsageClient.
     */
    public UsageClient buildUsageClient() {
        return new UsageClient(buildInnerClient().getUsages());
    }

    /**
     * Builds an instance of VirtualMachinesClient sync client.
     *
     * @return an instance of VirtualMachinesClient.
     */
    public VirtualMachinesClient buildVirtualMachinesClient() {
        return new VirtualMachinesClient(buildInnerClient().getVirtualMachines());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetsClient sync client.
     *
     * @return an instance of VirtualMachineScaleSetsClient.
     */
    public VirtualMachineScaleSetsClient buildVirtualMachineScaleSetsClient() {
        return new VirtualMachineScaleSetsClient(buildInnerClient().getVirtualMachineScaleSets());
    }

    /**
     * Builds an instance of VirtualMachineSizesClient sync client.
     *
     * @return an instance of VirtualMachineSizesClient.
     */
    public VirtualMachineSizesClient buildVirtualMachineSizesClient() {
        return new VirtualMachineSizesClient(buildInnerClient().getVirtualMachineSizes());
    }

    /**
     * Builds an instance of ImagesClient sync client.
     *
     * @return an instance of ImagesClient.
     */
    public ImagesClient buildImagesClient() {
        return new ImagesClient(buildInnerClient().getImages());
    }

    /**
     * Builds an instance of RestorePointCollectionsClient sync client.
     *
     * @return an instance of RestorePointCollectionsClient.
     */
    public RestorePointCollectionsClient buildRestorePointCollectionsClient() {
        return new RestorePointCollectionsClient(buildInnerClient().getRestorePointCollections());
    }

    /**
     * Builds an instance of RestorePointsClient sync client.
     *
     * @return an instance of RestorePointsClient.
     */
    public RestorePointsClient buildRestorePointsClient() {
        return new RestorePointsClient(buildInnerClient().getRestorePoints());
    }

    /**
     * Builds an instance of CapacityReservationGroupsClient sync client.
     *
     * @return an instance of CapacityReservationGroupsClient.
     */
    public CapacityReservationGroupsClient buildCapacityReservationGroupsClient() {
        return new CapacityReservationGroupsClient(buildInnerClient().getCapacityReservationGroups());
    }

    /**
     * Builds an instance of CapacityReservationsClient sync client.
     *
     * @return an instance of CapacityReservationsClient.
     */
    public CapacityReservationsClient buildCapacityReservationsClient() {
        return new CapacityReservationsClient(buildInnerClient().getCapacityReservations());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetExtensionsClient sync client.
     *
     * @return an instance of VirtualMachineScaleSetExtensionsClient.
     */
    public VirtualMachineScaleSetExtensionsClient buildVirtualMachineScaleSetExtensionsClient() {
        return new VirtualMachineScaleSetExtensionsClient(buildInnerClient().getVirtualMachineScaleSetExtensions());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetRollingUpgradesClient sync client.
     *
     * @return an instance of VirtualMachineScaleSetRollingUpgradesClient.
     */
    public VirtualMachineScaleSetRollingUpgradesClient buildVirtualMachineScaleSetRollingUpgradesClient() {
        return new VirtualMachineScaleSetRollingUpgradesClient(
                buildInnerClient().getVirtualMachineScaleSetRollingUpgrades());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetVMExtensionsClient sync client.
     *
     * @return an instance of VirtualMachineScaleSetVMExtensionsClient.
     */
    public VirtualMachineScaleSetVMExtensionsClient buildVirtualMachineScaleSetVMExtensionsClient() {
        return new VirtualMachineScaleSetVMExtensionsClient(buildInnerClient().getVirtualMachineScaleSetVMExtensions());
    }

    /**
     * Builds an instance of VirtualMachineScaleSetVMsClient sync client.
     *
     * @return an instance of VirtualMachineScaleSetVMsClient.
     */
    public VirtualMachineScaleSetVMsClient buildVirtualMachineScaleSetVMsClient() {
        return new VirtualMachineScaleSetVMsClient(buildInnerClient().getVirtualMachineScaleSetVMs());
    }

    /**
     * Builds an instance of LogAnalyticsClient sync client.
     *
     * @return an instance of LogAnalyticsClient.
     */
    public LogAnalyticsClient buildLogAnalyticsClient() {
        return new LogAnalyticsClient(buildInnerClient().getLogAnalytics());
    }
}
