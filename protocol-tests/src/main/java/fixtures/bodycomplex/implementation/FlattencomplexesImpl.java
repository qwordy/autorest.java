package fixtures.bodycomplex.implementation;

import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Flattencomplexes. */
public final class FlattencomplexesImpl {
    /** The proxy service used to perform REST calls. */
    private final FlattencomplexesService service;

    /** The service client containing this operation class. */
    private final AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of FlattencomplexesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FlattencomplexesImpl(AutoRestComplexTestServiceImpl client) {
        this.service =
                RestProxy.create(
                        FlattencomplexesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestComplexTestServiceFlattencomplexes to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestComplexTestS")
    private interface FlattencomplexesService {
        @Get("/complex/flatten/valid")
        Mono<Response<BinaryData>> getValid(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     propB1: String
     *     helper: {
     *         propBH1: String
     *     }
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getValid(this.client.getHost(), requestOptions, context));
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     propB1: String
     *     helper: {
     *         propBH1: String
     *     }
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getValid(this.client.getHost(), requestOptions, context);
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     propB1: String
     *     helper: {
     *         propBH1: String
     *     }
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BinaryData> getValidAsync(RequestOptions requestOptions) {
        return getValidWithResponseAsync(requestOptions)
                .flatMap(
                        (Response<BinaryData> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     propB1: String
     *     helper: {
     *         propBH1: String
     *     }
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BinaryData> getValidAsync(RequestOptions requestOptions, Context context) {
        return getValidWithResponseAsync(requestOptions, context)
                .flatMap(
                        (Response<BinaryData> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     propB1: String
     *     helper: {
     *         propBH1: String
     *     }
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData getValid(RequestOptions requestOptions) {
        return getValidAsync(requestOptions).block();
    }

    /**
     * <strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     propB1: String
     *     helper: {
     *         propBH1: String
     *     }
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getValidWithResponse(RequestOptions requestOptions, Context context) {
        return getValidWithResponseAsync(requestOptions, context).block();
    }
}
