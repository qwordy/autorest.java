package fixtures.compute.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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

/** An instance of this class provides access to all the operations defined in LogAnalytics. */
public final class LogAnalyticsImpl {
    /** The proxy service used to perform REST calls. */
    private final LogAnalyticsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of LogAnalyticsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LogAnalyticsImpl(ComputeManagementClientImpl client) {
        this.service =
                RestProxy.create(LogAnalyticsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientLogAnalytics to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface LogAnalyticsService {
        @Post(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getRequestRateByInterval")
        Mono<Response<BinaryData>> exportRequestRateByInterval(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);

        @Post(
                "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getThrottledRequests")
        Mono<Response<BinaryData>> exportThrottledRequests(
                @HostParam("$host") String host,
                @PathParam("location") String location,
                @QueryParam("api-version") String apiVersion,
                @PathParam("subscriptionId") String subscriptionId,
                @BodyParam("application/json") BinaryData parameters,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
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
     *     blobContainerSasUri: String
     *     fromTime: String
     *     toTime: String
     *     groupByThrottlePolicy: Boolean
     *     groupByOperationName: Boolean
     *     groupByResourceName: Boolean
     *     groupByClientApplicationId: Boolean
     *     groupByUserAgent: Boolean
     *     intervalLength: String(ThreeMins/FiveMins/ThirtyMins/SixtyMins)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties: {
     *         output: String
     *     }
     * }
     * }</pre>
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> exportRequestRateByIntervalWithResponseAsync(
            String location, BinaryData parameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.exportRequestRateByInterval(
                                this.client.getHost(),
                                location,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
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
     *     blobContainerSasUri: String
     *     fromTime: String
     *     toTime: String
     *     groupByThrottlePolicy: Boolean
     *     groupByOperationName: Boolean
     *     groupByResourceName: Boolean
     *     groupByClientApplicationId: Boolean
     *     groupByUserAgent: Boolean
     *     intervalLength: String(ThreeMins/FiveMins/ThirtyMins/SixtyMins)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties: {
     *         output: String
     *     }
     * }
     * }</pre>
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> exportRequestRateByIntervalWithResponseAsync(
            String location, BinaryData parameters, RequestOptions requestOptions, Context context) {
        return service.exportRequestRateByInterval(
                this.client.getHost(),
                location,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling
     * activities.
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
     *     blobContainerSasUri: String
     *     fromTime: String
     *     toTime: String
     *     groupByThrottlePolicy: Boolean
     *     groupByOperationName: Boolean
     *     groupByResourceName: Boolean
     *     groupByClientApplicationId: Boolean
     *     groupByUserAgent: Boolean
     *     intervalLength: String(ThreeMins/FiveMins/ThirtyMins/SixtyMins)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties: {
     *         output: String
     *     }
     * }
     * }</pre>
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> exportRequestRateByIntervalWithResponse(
            String location, BinaryData parameters, RequestOptions requestOptions, Context context) {
        return exportRequestRateByIntervalWithResponseAsync(location, parameters, requestOptions, context).block();
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
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
     *     blobContainerSasUri: String
     *     fromTime: String
     *     toTime: String
     *     groupByThrottlePolicy: Boolean
     *     groupByOperationName: Boolean
     *     groupByResourceName: Boolean
     *     groupByClientApplicationId: Boolean
     *     groupByUserAgent: Boolean
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties: {
     *         output: String
     *     }
     * }
     * }</pre>
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> exportThrottledRequestsWithResponseAsync(
            String location, BinaryData parameters, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.exportThrottledRequests(
                                this.client.getHost(),
                                location,
                                this.client.getServiceVersion().getVersion(),
                                this.client.getSubscriptionId(),
                                parameters,
                                requestOptions,
                                context));
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
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
     *     blobContainerSasUri: String
     *     fromTime: String
     *     toTime: String
     *     groupByThrottlePolicy: Boolean
     *     groupByOperationName: Boolean
     *     groupByResourceName: Boolean
     *     groupByClientApplicationId: Boolean
     *     groupByUserAgent: Boolean
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties: {
     *         output: String
     *     }
     * }
     * }</pre>
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> exportThrottledRequestsWithResponseAsync(
            String location, BinaryData parameters, RequestOptions requestOptions, Context context) {
        return service.exportThrottledRequests(
                this.client.getHost(),
                location,
                this.client.getServiceVersion().getVersion(),
                this.client.getSubscriptionId(),
                parameters,
                requestOptions,
                context);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
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
     *     blobContainerSasUri: String
     *     fromTime: String
     *     toTime: String
     *     groupByThrottlePolicy: Boolean
     *     groupByOperationName: Boolean
     *     groupByResourceName: Boolean
     *     groupByClientApplicationId: Boolean
     *     groupByUserAgent: Boolean
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties: {
     *         output: String
     *     }
     * }
     * }</pre>
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return logAnalytics operation status response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> exportThrottledRequestsWithResponse(
            String location, BinaryData parameters, RequestOptions requestOptions, Context context) {
        return exportThrottledRequestsWithResponseAsync(location, parameters, requestOptions, context).block();
    }
}
