# ParseApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parseParseString**](ParseApi.md#parseParseString) | **POST** /nlp-v2/parse/tree | Parse string to syntax tree


<a name="parseParseString"></a>
# **parseParseString**
> ParseResponse parseParseString(input)

Parse string to syntax tree

Parses the input string into a Penn Treebank syntax tree

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ParseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ParseApi apiInstance = new ParseApi();
ParseRequest input = new ParseRequest(); // ParseRequest | Input string
try {
    ParseResponse result = apiInstance.parseParseString(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParseApi#parseParseString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ParseRequest**](ParseRequest.md)| Input string |

### Return type

[**ParseResponse**](ParseResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

