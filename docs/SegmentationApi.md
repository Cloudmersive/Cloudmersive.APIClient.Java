# SegmentationApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**segmentationGetSentences**](SegmentationApi.md#segmentationGetSentences) | **POST** /nlp-v2/segmentation/sentences | Extract sentences from string
[**segmentationGetWords**](SegmentationApi.md#segmentationGetWords) | **POST** /nlp-v2/segmentation/words | Get words in input string


<a name="segmentationGetSentences"></a>
# **segmentationGetSentences**
> SentenceSegmentationResponse segmentationGetSentences(input)

Extract sentences from string

Segment an input string into separate sentences, output result as a string.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SegmentationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SegmentationApi apiInstance = new SegmentationApi();
SentenceSegmentationRequest input = new SentenceSegmentationRequest(); // SentenceSegmentationRequest | Input string
try {
    SentenceSegmentationResponse result = apiInstance.segmentationGetSentences(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentationApi#segmentationGetSentences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**SentenceSegmentationRequest**](SentenceSegmentationRequest.md)| Input string |

### Return type

[**SentenceSegmentationResponse**](SentenceSegmentationResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="segmentationGetWords"></a>
# **segmentationGetWords**
> GetWordsResponse segmentationGetWords(input)

Get words in input string

Get the component words in an input string

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SegmentationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SegmentationApi apiInstance = new SegmentationApi();
GetWordsRequest input = new GetWordsRequest(); // GetWordsRequest | String to process
try {
    GetWordsResponse result = apiInstance.segmentationGetWords(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentationApi#segmentationGetWords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetWordsRequest**](GetWordsRequest.md)| String to process |

### Return type

[**GetWordsResponse**](GetWordsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

