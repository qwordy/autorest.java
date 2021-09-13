package fixtures.compute;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import fixtures.compute.implementation.UsagesImpl;

/** Initializes a new instance of the asynchronous ComputeManagementClient type. */
@ServiceClient(builder = ComputeManagementClientBuilder.class, isAsync = true)
public final class UsageAsyncClient {
    private final UsagesImpl serviceClient;

    /**
     * Initializes an instance of Usages client.
     *
     * @param serviceClient the service client implementation.
     */
    UsageAsyncClient(UsagesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets, for the specified location, the current compute resource usage information as well as the limits for
     * compute resources under the subscription.
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
     *             unit: String
     *             currentValue: int
     *             limit: long
     *             name: {
     *                 value: String
     *                 localizedValue: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param location The location for which resource usage is queried.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the List Usages operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(String location, RequestOptions requestOptions) {
        return this.serviceClient.listAsync(location, requestOptions);
    }
}
