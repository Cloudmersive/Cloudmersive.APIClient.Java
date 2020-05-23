# SpellcheckApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spellcheckCheckSentence**](SpellcheckApi.md#spellcheckCheckSentence) | **POST** /nlp-v2/spellcheck/check/sentence | Check if sentence is spelled correctly
[**spellcheckCorrectJson**](SpellcheckApi.md#spellcheckCorrectJson) | **POST** /nlp-v2/spellcheck/check/word | Find spelling corrections


<a name="spellcheckCheckSentence"></a>
# **spellcheckCheckSentence**
> CheckSentenceResponse spellcheckCheckSentence(value)

Check if sentence is spelled correctly

Checks whether the sentence is spelled correctly and returns the result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpellcheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpellcheckApi apiInstance = new SpellcheckApi();
CheckSentenceRequest value = new CheckSentenceRequest(); // CheckSentenceRequest | Input sentence
try {
    CheckSentenceResponse result = apiInstance.spellcheckCheckSentence(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpellcheckApi#spellcheckCheckSentence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**CheckSentenceRequest**](CheckSentenceRequest.md)| Input sentence |

### Return type

[**CheckSentenceResponse**](CheckSentenceResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="spellcheckCorrectJson"></a>
# **spellcheckCorrectJson**
> CheckWordResponse spellcheckCorrectJson(value)

Find spelling corrections

Find spelling correction suggestions and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpellcheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpellcheckApi apiInstance = new SpellcheckApi();
CheckWordRequest value = new CheckWordRequest(); // CheckWordRequest | Input string
try {
    CheckWordResponse result = apiInstance.spellcheckCorrectJson(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpellcheckApi#spellcheckCorrectJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**CheckWordRequest**](CheckWordRequest.md)| Input string |

### Return type

[**CheckWordResponse**](CheckWordResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

