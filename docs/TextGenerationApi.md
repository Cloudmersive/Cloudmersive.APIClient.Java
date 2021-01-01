# TextGenerationApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**textGenerationCreateHandwritingPng**](TextGenerationApi.md#textGenerationCreateHandwritingPng) | **POST** /image/text/create/handwriting/png | Create an image of handwriting in PNG format


<a name="textGenerationCreateHandwritingPng"></a>
# **textGenerationCreateHandwritingPng**
> Object textGenerationCreateHandwritingPng(request)

Create an image of handwriting in PNG format

Uses Deep Learning to generate realistic handwriting and returns the result as a PNG image

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextGenerationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextGenerationApi apiInstance = new TextGenerationApi();
CreateHandwritingRequest request = new CreateHandwritingRequest(); // CreateHandwritingRequest | Draw text parameters
try {
    Object result = apiInstance.textGenerationCreateHandwritingPng(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextGenerationApi#textGenerationCreateHandwritingPng");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateHandwritingRequest**](CreateHandwritingRequest.md)| Draw text parameters |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

