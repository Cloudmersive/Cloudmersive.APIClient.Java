/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiCallback;
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.ApiResponse;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.Pair;
import com.cloudmersive.client.invoker.ProgressRequestBody;
import com.cloudmersive.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cloudmersive.client.model.DateTimeNaturalLanguageParseRequest;
import com.cloudmersive.client.model.DateTimeNowResult;
import com.cloudmersive.client.model.DateTimeStandardizedParseRequest;
import com.cloudmersive.client.model.DateTimeStandardizedParseResponse;
import com.cloudmersive.client.model.GetPublicHolidaysRequest;
import com.cloudmersive.client.model.PublicHolidaysResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateTimeApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public DateTimeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DateTimeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for dateTimeGetNowSimple
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dateTimeGetNowSimpleCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/validate/date-time/get/now";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call dateTimeGetNowSimpleValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = dateTimeGetNowSimpleCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get current date and time as of now
     * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
     * @return DateTimeNowResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DateTimeNowResult dateTimeGetNowSimple() throws ApiException {
        ApiResponse<DateTimeNowResult> resp = dateTimeGetNowSimpleWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get current date and time as of now
     * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
     * @return ApiResponse&lt;DateTimeNowResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DateTimeNowResult> dateTimeGetNowSimpleWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = dateTimeGetNowSimpleValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<DateTimeNowResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get current date and time as of now (asynchronously)
     * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dateTimeGetNowSimpleAsync(final ApiCallback<DateTimeNowResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = dateTimeGetNowSimpleValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DateTimeNowResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dateTimeGetPublicHolidays
     * @param input Input request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dateTimeGetPublicHolidaysCall(GetPublicHolidaysRequest input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = input;

        // create path and map variables
        String localVarPath = "/validate/date-time/get/holidays";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call dateTimeGetPublicHolidaysValidateBeforeCall(GetPublicHolidaysRequest input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new ApiException("Missing the required parameter 'input' when calling dateTimeGetPublicHolidays(Async)");
        }
        

        com.squareup.okhttp.Call call = dateTimeGetPublicHolidaysCall(input, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get public holidays in the specified country and year
     * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
     * @param input Input request (required)
     * @return PublicHolidaysResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PublicHolidaysResponse dateTimeGetPublicHolidays(GetPublicHolidaysRequest input) throws ApiException {
        ApiResponse<PublicHolidaysResponse> resp = dateTimeGetPublicHolidaysWithHttpInfo(input);
        return resp.getData();
    }

    /**
     * Get public holidays in the specified country and year
     * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
     * @param input Input request (required)
     * @return ApiResponse&lt;PublicHolidaysResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PublicHolidaysResponse> dateTimeGetPublicHolidaysWithHttpInfo(GetPublicHolidaysRequest input) throws ApiException {
        com.squareup.okhttp.Call call = dateTimeGetPublicHolidaysValidateBeforeCall(input, null, null);
        Type localVarReturnType = new TypeToken<PublicHolidaysResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get public holidays in the specified country and year (asynchronously)
     * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
     * @param input Input request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dateTimeGetPublicHolidaysAsync(GetPublicHolidaysRequest input, final ApiCallback<PublicHolidaysResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = dateTimeGetPublicHolidaysValidateBeforeCall(input, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PublicHolidaysResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dateTimeParseNaturalLanguageDateTime
     * @param input Input request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dateTimeParseNaturalLanguageDateTimeCall(DateTimeNaturalLanguageParseRequest input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = input;

        // create path and map variables
        String localVarPath = "/validate/date-time/parse/date-time/natural-language";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call dateTimeParseNaturalLanguageDateTimeValidateBeforeCall(DateTimeNaturalLanguageParseRequest input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new ApiException("Missing the required parameter 'input' when calling dateTimeParseNaturalLanguageDateTime(Async)");
        }
        

        com.squareup.okhttp.Call call = dateTimeParseNaturalLanguageDateTimeCall(input, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Parses a free-form natural language date and time string into a date and time
     * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
     * @param input Input request (required)
     * @return DateTimeStandardizedParseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DateTimeStandardizedParseResponse dateTimeParseNaturalLanguageDateTime(DateTimeNaturalLanguageParseRequest input) throws ApiException {
        ApiResponse<DateTimeStandardizedParseResponse> resp = dateTimeParseNaturalLanguageDateTimeWithHttpInfo(input);
        return resp.getData();
    }

    /**
     * Parses a free-form natural language date and time string into a date and time
     * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
     * @param input Input request (required)
     * @return ApiResponse&lt;DateTimeStandardizedParseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DateTimeStandardizedParseResponse> dateTimeParseNaturalLanguageDateTimeWithHttpInfo(DateTimeNaturalLanguageParseRequest input) throws ApiException {
        com.squareup.okhttp.Call call = dateTimeParseNaturalLanguageDateTimeValidateBeforeCall(input, null, null);
        Type localVarReturnType = new TypeToken<DateTimeStandardizedParseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Parses a free-form natural language date and time string into a date and time (asynchronously)
     * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
     * @param input Input request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dateTimeParseNaturalLanguageDateTimeAsync(DateTimeNaturalLanguageParseRequest input, final ApiCallback<DateTimeStandardizedParseResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = dateTimeParseNaturalLanguageDateTimeValidateBeforeCall(input, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DateTimeStandardizedParseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dateTimeParseStandardDateTime
     * @param input Input request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dateTimeParseStandardDateTimeCall(DateTimeStandardizedParseRequest input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = input;

        // create path and map variables
        String localVarPath = "/validate/date-time/parse/date-time/structured";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call dateTimeParseStandardDateTimeValidateBeforeCall(DateTimeStandardizedParseRequest input, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new ApiException("Missing the required parameter 'input' when calling dateTimeParseStandardDateTime(Async)");
        }
        

        com.squareup.okhttp.Call call = dateTimeParseStandardDateTimeCall(input, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Parses a standardized date and time string into a date and time
     * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
     * @param input Input request (required)
     * @return DateTimeStandardizedParseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DateTimeStandardizedParseResponse dateTimeParseStandardDateTime(DateTimeStandardizedParseRequest input) throws ApiException {
        ApiResponse<DateTimeStandardizedParseResponse> resp = dateTimeParseStandardDateTimeWithHttpInfo(input);
        return resp.getData();
    }

    /**
     * Parses a standardized date and time string into a date and time
     * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
     * @param input Input request (required)
     * @return ApiResponse&lt;DateTimeStandardizedParseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DateTimeStandardizedParseResponse> dateTimeParseStandardDateTimeWithHttpInfo(DateTimeStandardizedParseRequest input) throws ApiException {
        com.squareup.okhttp.Call call = dateTimeParseStandardDateTimeValidateBeforeCall(input, null, null);
        Type localVarReturnType = new TypeToken<DateTimeStandardizedParseResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Parses a standardized date and time string into a date and time (asynchronously)
     * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
     * @param input Input request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dateTimeParseStandardDateTimeAsync(DateTimeStandardizedParseRequest input, final ApiCallback<DateTimeStandardizedParseResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = dateTimeParseStandardDateTimeValidateBeforeCall(input, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DateTimeStandardizedParseResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
