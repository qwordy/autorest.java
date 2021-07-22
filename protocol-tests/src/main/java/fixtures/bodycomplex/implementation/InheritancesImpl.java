package fixtures.bodycomplex.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
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

/** An instance of this class provides access to all the operations defined in Inheritances. */
public final class InheritancesImpl {
    /** The proxy service used to perform REST calls. */
    private final InheritancesService service;

    /** The service client containing this operation class. */
    private final AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of InheritancesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    InheritancesImpl(AutoRestComplexTestServiceImpl client) {
        this.service =
                RestProxy.create(InheritancesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestComplexTestServiceInheritances to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestComplexTestS")
    private interface InheritancesService {
        @Get("/complex/inheritance/valid")
        Mono<Response<BinaryData>> getValid(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/inheritance/valid")
        Mono<Response<Void>> putValid(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Get complex types that extend others.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getValid(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types that extend others.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getValid(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types that extend others.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
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
     * Get complex types that extend others.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
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
     * Get complex types that extend others.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData getValid(RequestOptions requestOptions) {
        return getValidAsync(requestOptions).block();
    }

    /**
     * Get complex types that extend others.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getValidWithResponse(RequestOptions requestOptions, Context context) {
        return getValidWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types that extend others.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putValid(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types that extend others.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putValid(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types that extend others.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putValidAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return putValidWithResponseAsync(complexBody, requestOptions).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Put complex types that extend others.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> putValidAsync(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putValidWithResponseAsync(complexBody, requestOptions, context)
                .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Put complex types that extend others.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putValid(BinaryData complexBody, RequestOptions requestOptions) {
        putValidAsync(complexBody, requestOptions).block();
    }

    /**
     * Put complex types that extend others.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String
     *     hates: [
     *         {
     *             id: Integer
     *             name: String
     *             food: String
     *         }
     *     ]
     *     breed: String
     * }
     * }</pre>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putValidWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putValidWithResponseAsync(complexBody, requestOptions, context).block();
    }
}
