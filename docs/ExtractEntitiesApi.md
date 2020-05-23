# ExtractEntitiesApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractEntitiesPost**](ExtractEntitiesApi.md#extractEntitiesPost) | **POST** /nlp-v2/extract-entities | Extract entities from string


<a name="extractEntitiesPost"></a>
# **extractEntitiesPost**
> ExtractEntitiesResponse extractEntitiesPost(value)

Extract entities from string

Extract the named entitites from an input string.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ExtractEntitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ExtractEntitiesApi apiInstance = new ExtractEntitiesApi();
ExtractEntitiesRequest value = new ExtractEntitiesRequest(); // ExtractEntitiesRequest | Input string
try {
    ExtractEntitiesResponse result = apiInstance.extractEntitiesPost(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractEntitiesApi#extractEntitiesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**ExtractEntitiesRequest**](ExtractEntitiesRequest.md)| Input string |

### Return type

[**ExtractEntitiesResponse**](ExtractEntitiesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

