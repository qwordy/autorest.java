package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.compute.implementation.LogAnalyticsImpl;

/** Initializes a new instance of the synchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class)
public final class LogAnalyticsClient {
    private final LogAnalyticsImpl serviceClient;

    /**
     * Initializes an instance of LogAnalytics client.
     *
     * @param serviceClient the service client implementation.
     */
    LogAnalyticsClient(LogAnalyticsImpl serviceClient) {
        this.serviceClient = serviceClient;
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
        return this.serviceClient.exportRequestRateByIntervalWithResponse(
                location, parameters, requestOptions, context);
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
        return this.serviceClient.exportThrottledRequestsWithResponse(location, parameters, requestOptions, context);
    }
}
