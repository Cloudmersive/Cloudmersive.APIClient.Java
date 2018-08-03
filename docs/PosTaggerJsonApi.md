# PosTaggerJsonApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**posTaggerJsonPost**](PosTaggerJsonApi.md#posTaggerJsonPost) | **POST** nlp/PosTaggerJson | Part-of-speech tag a string


<a name="posTaggerJsonPost"></a>
# **posTaggerJsonPost**
> PosResponse posTaggerJsonPost(request)

Part-of-speech tag a string

Part-of-speech (POS) tag a string and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PosTaggerJsonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PosTaggerJsonApi apiInstance = new PosTaggerJsonApi();
PosRequest request = new PosRequest(); // PosRequest | Input string
try {
    PosResponse result = apiInstance.posTaggerJsonPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosTaggerJsonApi#posTaggerJsonPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PosRequest**](PosRequest.md)| Input string |

### Return type

[**PosResponse**](PosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

