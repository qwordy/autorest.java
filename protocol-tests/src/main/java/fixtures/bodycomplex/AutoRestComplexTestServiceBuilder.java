package fixtures.bodycomplex;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import fixtures.bodycomplex.implementation.AutoRestComplexTestServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the AutoRestComplexTestService type. */
@ServiceClientBuilder(
        serviceClients = {
            BasicClient.class,
            PrimitiveClient.class,
            ArrayClient.class,
            DictionaryClient.class,
            InheritanceClient.class,
            PolymorphismClient.class,
            PolymorphicrecursiveClient.class,
            ReadonlypropertyClient.class,
            FlattencomplexClient.class,
            BasicAsyncClient.class,
            PrimitiveAsyncClient.class,
            ArrayAsyncClient.class,
            DictionaryAsyncClient.class,
            InheritanceAsyncClient.class,
            PolymorphismAsyncClient.class,
            PolymorphicrecursiveAsyncClient.class,
            ReadonlypropertyAsyncClient.class,
            FlattencomplexAsyncClient.class
        })
public final class AutoRestComplexTestServiceBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the AutoRestComplexTestServiceBuilder. */
    public AutoRestComplexTestServiceBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
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
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
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
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder httpClient(HttpClient httpClient) {
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
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder configuration(Configuration configuration) {
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
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
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
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the AutoRestComplexTestServiceBuilder.
     */
    public AutoRestComplexTestServiceBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of AutoRestComplexTestServiceImpl with the provided parameters.
     *
     * @return an instance of AutoRestComplexTestServiceImpl.
     */
    private AutoRestComplexTestServiceImpl buildInnerClient() {
        if (host == null) {
            this.host = "http://localhost:3000";
        }
        if (apiVersion == null) {
            this.apiVersion = "2016-02-29";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        AutoRestComplexTestServiceImpl client =
                new AutoRestComplexTestServiceImpl(pipeline, serializerAdapter, host, apiVersion);
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        policies.add(
                new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion, buildConfiguration));
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
     * Builds an instance of BasicAsyncClient async client.
     *
     * @return an instance of BasicAsyncClient.
     */
    public BasicAsyncClient buildBasicAsyncClient() {
        return new BasicAsyncClient(buildInnerClient().getBasics());
    }

    /**
     * Builds an instance of PrimitiveAsyncClient async client.
     *
     * @return an instance of PrimitiveAsyncClient.
     */
    public PrimitiveAsyncClient buildPrimitiveAsyncClient() {
        return new PrimitiveAsyncClient(buildInnerClient().getPrimitives());
    }

    /**
     * Builds an instance of ArrayAsyncClient async client.
     *
     * @return an instance of ArrayAsyncClient.
     */
    public ArrayAsyncClient buildArrayAsyncClient() {
        return new ArrayAsyncClient(buildInnerClient().getArrays());
    }

    /**
     * Builds an instance of DictionaryAsyncClient async client.
     *
     * @return an instance of DictionaryAsyncClient.
     */
    public DictionaryAsyncClient buildDictionaryAsyncClient() {
        return new DictionaryAsyncClient(buildInnerClient().getDictionaries());
    }

    /**
     * Builds an instance of InheritanceAsyncClient async client.
     *
     * @return an instance of InheritanceAsyncClient.
     */
    public InheritanceAsyncClient buildInheritanceAsyncClient() {
        return new InheritanceAsyncClient(buildInnerClient().getInheritances());
    }

    /**
     * Builds an instance of PolymorphismAsyncClient async client.
     *
     * @return an instance of PolymorphismAsyncClient.
     */
    public PolymorphismAsyncClient buildPolymorphismAsyncClient() {
        return new PolymorphismAsyncClient(buildInnerClient().getPolymorphisms());
    }

    /**
     * Builds an instance of PolymorphicrecursiveAsyncClient async client.
     *
     * @return an instance of PolymorphicrecursiveAsyncClient.
     */
    public PolymorphicrecursiveAsyncClient buildPolymorphicrecursiveAsyncClient() {
        return new PolymorphicrecursiveAsyncClient(buildInnerClient().getPolymorphicrecursives());
    }

    /**
     * Builds an instance of ReadonlypropertyAsyncClient async client.
     *
     * @return an instance of ReadonlypropertyAsyncClient.
     */
    public ReadonlypropertyAsyncClient buildReadonlypropertyAsyncClient() {
        return new ReadonlypropertyAsyncClient(buildInnerClient().getReadonlyproperties());
    }

    /**
     * Builds an instance of FlattencomplexAsyncClient async client.
     *
     * @return an instance of FlattencomplexAsyncClient.
     */
    public FlattencomplexAsyncClient buildFlattencomplexAsyncClient() {
        return new FlattencomplexAsyncClient(buildInnerClient().getFlattencomplexes());
    }

    /**
     * Builds an instance of BasicClient sync client.
     *
     * @return an instance of BasicClient.
     */
    public BasicClient buildBasicClient() {
        return new BasicClient(buildInnerClient().getBasics());
    }

    /**
     * Builds an instance of PrimitiveClient sync client.
     *
     * @return an instance of PrimitiveClient.
     */
    public PrimitiveClient buildPrimitiveClient() {
        return new PrimitiveClient(buildInnerClient().getPrimitives());
    }

    /**
     * Builds an instance of ArrayClient sync client.
     *
     * @return an instance of ArrayClient.
     */
    public ArrayClient buildArrayClient() {
        return new ArrayClient(buildInnerClient().getArrays());
    }

    /**
     * Builds an instance of DictionaryClient sync client.
     *
     * @return an instance of DictionaryClient.
     */
    public DictionaryClient buildDictionaryClient() {
        return new DictionaryClient(buildInnerClient().getDictionaries());
    }

    /**
     * Builds an instance of InheritanceClient sync client.
     *
     * @return an instance of InheritanceClient.
     */
    public InheritanceClient buildInheritanceClient() {
        return new InheritanceClient(buildInnerClient().getInheritances());
    }

    /**
     * Builds an instance of PolymorphismClient sync client.
     *
     * @return an instance of PolymorphismClient.
     */
    public PolymorphismClient buildPolymorphismClient() {
        return new PolymorphismClient(buildInnerClient().getPolymorphisms());
    }

    /**
     * Builds an instance of PolymorphicrecursiveClient sync client.
     *
     * @return an instance of PolymorphicrecursiveClient.
     */
    public PolymorphicrecursiveClient buildPolymorphicrecursiveClient() {
        return new PolymorphicrecursiveClient(buildInnerClient().getPolymorphicrecursives());
    }

    /**
     * Builds an instance of ReadonlypropertyClient sync client.
     *
     * @return an instance of ReadonlypropertyClient.
     */
    public ReadonlypropertyClient buildReadonlypropertyClient() {
        return new ReadonlypropertyClient(buildInnerClient().getReadonlyproperties());
    }

    /**
     * Builds an instance of FlattencomplexClient sync client.
     *
     * @return an instance of FlattencomplexClient.
     */
    public FlattencomplexClient buildFlattencomplexClient() {
        return new FlattencomplexClient(buildInnerClient().getFlattencomplexes());
    }
}
