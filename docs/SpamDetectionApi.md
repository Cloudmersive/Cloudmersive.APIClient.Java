# SpamDetectionApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spamDetectTextStringAdvancedPost**](SpamDetectionApi.md#spamDetectTextStringAdvancedPost) | **POST** /spam/detect/text-string/advanced | Perform advanced AI spam detection and classification against input text string.  Analyzes input content as well as embedded URLs with AI deep learnign to detect spam, phishing and other unsafe content.  Uses 25-100 API calls depending on model selected.
[**spamDetectTextStringPost**](SpamDetectionApi.md#spamDetectTextStringPost) | **POST** /spam/detect/text-string | Perform AI spam detection and classification against input text string.  Analyzes input content as well as embedded URLs with AI deep learnign to detect spam, phishing and other unsafe content.  Uses 25-75 API calls depending on model selected.


<a name="spamDetectTextStringAdvancedPost"></a>
# **spamDetectTextStringAdvancedPost**
> SpamDetectionAdvancedResponse spamDetectTextStringAdvancedPost(body)

Perform advanced AI spam detection and classification against input text string.  Analyzes input content as well as embedded URLs with AI deep learnign to detect spam, phishing and other unsafe content.  Uses 25-100 API calls depending on model selected.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpamDetectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpamDetectionApi apiInstance = new SpamDetectionApi();
SpamDetectionAdvancedRequest body = new SpamDetectionAdvancedRequest(); // SpamDetectionAdvancedRequest | Spam detection request
try {
    SpamDetectionAdvancedResponse result = apiInstance.spamDetectTextStringAdvancedPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpamDetectionApi#spamDetectTextStringAdvancedPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpamDetectionAdvancedRequest**](SpamDetectionAdvancedRequest.md)| Spam detection request | [optional]

### Return type

[**SpamDetectionAdvancedResponse**](SpamDetectionAdvancedResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="spamDetectTextStringPost"></a>
# **spamDetectTextStringPost**
> SpamDetectionResponse spamDetectTextStringPost(body)

Perform AI spam detection and classification against input text string.  Analyzes input content as well as embedded URLs with AI deep learnign to detect spam, phishing and other unsafe content.  Uses 25-75 API calls depending on model selected.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpamDetectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpamDetectionApi apiInstance = new SpamDetectionApi();
SpamDetectionRequest body = new SpamDetectionRequest(); // SpamDetectionRequest | Spam detection request
try {
    SpamDetectionResponse result = apiInstance.spamDetectTextStringPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpamDetectionApi#spamDetectTextStringPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpamDetectionRequest**](SpamDetectionRequest.md)| Spam detection request | [optional]

### Return type

[**SpamDetectionResponse**](SpamDetectionResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

