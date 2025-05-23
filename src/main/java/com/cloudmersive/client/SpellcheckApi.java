/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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


import com.cloudmersive.client.model.CheckSentenceRequest;
import com.cloudmersive.client.model.CheckSentenceResponse;
import com.cloudmersive.client.model.CheckWordRequest;
import com.cloudmersive.client.model.CheckWordResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpellcheckApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public SpellcheckApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SpellcheckApi(ApiClient apiClient) {
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
     * Build call for spellcheckCheckSentence
     * @param value Input sentence (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call spellcheckCheckSentenceCall(CheckSentenceRequest value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = value;

        // create path and map variables
        String localVarPath = "/nlp-v2/spellcheck/check/sentence";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
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
    private com.squareup.okhttp.Call spellcheckCheckSentenceValidateBeforeCall(CheckSentenceRequest value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling spellcheckCheckSentence(Async)");
        }
        

        com.squareup.okhttp.Call call = spellcheckCheckSentenceCall(value, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Check if sentence is spelled correctly
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     * @param value Input sentence (required)
     * @return CheckSentenceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CheckSentenceResponse spellcheckCheckSentence(CheckSentenceRequest value) throws ApiException {
        ApiResponse<CheckSentenceResponse> resp = spellcheckCheckSentenceWithHttpInfo(value);
        return resp.getData();
    }

    /**
     * Check if sentence is spelled correctly
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     * @param value Input sentence (required)
     * @return ApiResponse&lt;CheckSentenceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CheckSentenceResponse> spellcheckCheckSentenceWithHttpInfo(CheckSentenceRequest value) throws ApiException {
        com.squareup.okhttp.Call call = spellcheckCheckSentenceValidateBeforeCall(value, null, null);
        Type localVarReturnType = new TypeToken<CheckSentenceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check if sentence is spelled correctly (asynchronously)
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     * @param value Input sentence (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call spellcheckCheckSentenceAsync(CheckSentenceRequest value, final ApiCallback<CheckSentenceResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = spellcheckCheckSentenceValidateBeforeCall(value, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CheckSentenceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for spellcheckCorrectJson
     * @param value Input string (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call spellcheckCorrectJsonCall(CheckWordRequest value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = value;

        // create path and map variables
        String localVarPath = "/nlp-v2/spellcheck/check/word";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
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
    private com.squareup.okhttp.Call spellcheckCorrectJsonValidateBeforeCall(CheckWordRequest value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new ApiException("Missing the required parameter 'value' when calling spellcheckCorrectJson(Async)");
        }
        

        com.squareup.okhttp.Call call = spellcheckCorrectJsonCall(value, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Find spelling corrections
     * Find spelling correction suggestions and return result as JSON
     * @param value Input string (required)
     * @return CheckWordResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CheckWordResponse spellcheckCorrectJson(CheckWordRequest value) throws ApiException {
        ApiResponse<CheckWordResponse> resp = spellcheckCorrectJsonWithHttpInfo(value);
        return resp.getData();
    }

    /**
     * Find spelling corrections
     * Find spelling correction suggestions and return result as JSON
     * @param value Input string (required)
     * @return ApiResponse&lt;CheckWordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CheckWordResponse> spellcheckCorrectJsonWithHttpInfo(CheckWordRequest value) throws ApiException {
        com.squareup.okhttp.Call call = spellcheckCorrectJsonValidateBeforeCall(value, null, null);
        Type localVarReturnType = new TypeToken<CheckWordResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find spelling corrections (asynchronously)
     * Find spelling correction suggestions and return result as JSON
     * @param value Input string (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call spellcheckCorrectJsonAsync(CheckWordRequest value, final ApiCallback<CheckWordResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = spellcheckCorrectJsonValidateBeforeCall(value, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CheckWordResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
