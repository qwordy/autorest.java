/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.RestResponse;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.url.models.ErrorException;
import fixtures.url.models.UriColor;
import java.io.IOException;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * Paths.
 */
public interface Paths {
    /**
     * Get true Boolean value on path.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getBooleanTrue();

    /**
     * Get true Boolean value on path.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getBooleanTrueAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get true Boolean value on path.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getBooleanTrueAsync();

    /**
     * Get true Boolean value on path.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getBooleanTrueWithRestResponseAsync();

    /**
     * Get false Boolean value on path.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getBooleanFalse();

    /**
     * Get false Boolean value on path.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getBooleanFalseAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get false Boolean value on path.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getBooleanFalseAsync();

    /**
     * Get false Boolean value on path.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getBooleanFalseWithRestResponseAsync();

    /**
     * Get '1000000' integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getIntOneMillion();

    /**
     * Get '1000000' integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getIntOneMillionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1000000' integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getIntOneMillionAsync();

    /**
     * Get '1000000' integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getIntOneMillionWithRestResponseAsync();

    /**
     * Get '-1000000' integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getIntNegativeOneMillion();

    /**
     * Get '-1000000' integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getIntNegativeOneMillionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1000000' integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getIntNegativeOneMillionAsync();

    /**
     * Get '-1000000' integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getIntNegativeOneMillionWithRestResponseAsync();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getTenBillion();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getTenBillionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getTenBillionAsync();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getTenBillionWithRestResponseAsync();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getNegativeTenBillion();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getNegativeTenBillionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getNegativeTenBillionAsync();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getNegativeTenBillionWithRestResponseAsync();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void floatScientificPositive();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> floatScientificPositiveAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1.034E+20' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> floatScientificPositiveAsync();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> floatScientificPositiveWithRestResponseAsync();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void floatScientificNegative();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> floatScientificNegativeAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> floatScientificNegativeAsync();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> floatScientificNegativeWithRestResponseAsync();

    /**
     * Get '9999999.999' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void doubleDecimalPositive();

    /**
     * Get '9999999.999' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> doubleDecimalPositiveAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '9999999.999' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> doubleDecimalPositiveAsync();

    /**
     * Get '9999999.999' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> doubleDecimalPositiveWithRestResponseAsync();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void doubleDecimalNegative();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> doubleDecimalNegativeAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-9999999.999' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> doubleDecimalNegativeAsync();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> doubleDecimalNegativeWithRestResponseAsync();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void stringUnicode();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> stringUnicodeAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> stringUnicodeAsync();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> stringUnicodeWithRestResponseAsync();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void stringUrlEncoded();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> stringUrlEncodedAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> stringUrlEncodedAsync();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> stringUrlEncodedWithRestResponseAsync();

    /**
     * Get ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void stringEmpty();

    /**
     * Get ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> stringEmptyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> stringEmptyAsync();

    /**
     * Get ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> stringEmptyWithRestResponseAsync();

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void stringNull(String stringPath);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> stringNullAsync(String stringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> stringNullAsync(String stringPath);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> stringNullWithRestResponseAsync(String stringPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void enumValid(UriColor enumPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> enumValidAsync(UriColor enumPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> enumValidAsync(UriColor enumPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> enumValidWithRestResponseAsync(UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void enumNull(UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> enumNullAsync(UriColor enumPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> enumNullAsync(UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> enumNullWithRestResponseAsync(UriColor enumPath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void byteMultiByte(byte[] bytePath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> byteMultiByteAsync(byte[] bytePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> byteMultiByteAsync(byte[] bytePath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> byteMultiByteWithRestResponseAsync(byte[] bytePath);

    /**
     * Get '' as byte array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void byteEmpty();

    /**
     * Get '' as byte array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> byteEmptyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '' as byte array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> byteEmptyAsync();

    /**
     * Get '' as byte array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> byteEmptyWithRestResponseAsync();

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void byteNull(byte[] bytePath);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> byteNullAsync(byte[] bytePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> byteNullAsync(byte[] bytePath);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> byteNullWithRestResponseAsync(byte[] bytePath);

    /**
     * Get '2012-01-01' as date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void dateValid();

    /**
     * Get '2012-01-01' as date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> dateValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01' as date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> dateValidAsync();

    /**
     * Get '2012-01-01' as date.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> dateValidWithRestResponseAsync();

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void dateNull(LocalDate datePath);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> dateNullAsync(LocalDate datePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> dateNullAsync(LocalDate datePath);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> dateNullWithRestResponseAsync(LocalDate datePath);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void dateTimeValid();

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> dateTimeValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> dateTimeValidAsync();

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> dateTimeValidWithRestResponseAsync();

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void dateTimeNull(DateTime dateTimePath);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> dateTimeNullAsync(DateTime dateTimePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> dateTimeNullAsync(DateTime dateTimePath);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> dateTimeNullWithRestResponseAsync(DateTime dateTimePath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void base64Url(byte[] base64UrlPath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> base64UrlAsync(byte[] base64UrlPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> base64UrlAsync(byte[] base64UrlPath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> base64UrlWithRestResponseAsync(byte[] base64UrlPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void arrayCsvInPath(List<String> arrayPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> arrayCsvInPathAsync(List<String> arrayPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> arrayCsvInPathAsync(List<String> arrayPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> arrayCsvInPathWithRestResponseAsync(List<String> arrayPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void unixTimeUrl(DateTime unixTimeUrlPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> unixTimeUrlAsync(DateTime unixTimeUrlPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> unixTimeUrlAsync(DateTime unixTimeUrlPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> unixTimeUrlWithRestResponseAsync(DateTime unixTimeUrlPath);

}
