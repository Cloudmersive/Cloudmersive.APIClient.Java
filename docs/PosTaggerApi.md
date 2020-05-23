# PosTaggerApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**posTaggerTagAdjectives**](PosTaggerApi.md#posTaggerTagAdjectives) | **POST** /nlp-v2/pos/tag/adjectives | Part-of-speech tag a string, filter to adjectives
[**posTaggerTagAdverbs**](PosTaggerApi.md#posTaggerTagAdverbs) | **POST** /nlp-v2/pos/tag/adverbs | Part-of-speech tag a string, filter to adverbs
[**posTaggerTagNouns**](PosTaggerApi.md#posTaggerTagNouns) | **POST** /nlp-v2/pos/tag/nouns | Part-of-speech tag a string, filter to nouns
[**posTaggerTagPronouns**](PosTaggerApi.md#posTaggerTagPronouns) | **POST** /nlp-v2/pos/tag/pronouns | Part-of-speech tag a string, filter to pronouns
[**posTaggerTagSentence**](PosTaggerApi.md#posTaggerTagSentence) | **POST** /nlp-v2/pos/tag/sentence | Part-of-speech tag a string
[**posTaggerTagVerbs**](PosTaggerApi.md#posTaggerTagVerbs) | **POST** /nlp-v2/pos/tag/verbs | Part-of-speech tag a string, filter to verbs


<a name="posTaggerTagAdjectives"></a>
# **posTaggerTagAdjectives**
> PosResponse posTaggerTagAdjectives(request)

Part-of-speech tag a string, filter to adjectives

Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PosTaggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PosTaggerApi apiInstance = new PosTaggerApi();
PosRequest request = new PosRequest(); // PosRequest | Input string
try {
    PosResponse result = apiInstance.posTaggerTagAdjectives(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosTaggerApi#posTaggerTagAdjectives");
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
 - **Accept**: application/json

<a name="posTaggerTagAdverbs"></a>
# **posTaggerTagAdverbs**
> PosResponse posTaggerTagAdverbs(request)

Part-of-speech tag a string, filter to adverbs

Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PosTaggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PosTaggerApi apiInstance = new PosTaggerApi();
PosRequest request = new PosRequest(); // PosRequest | Input string
try {
    PosResponse result = apiInstance.posTaggerTagAdverbs(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosTaggerApi#posTaggerTagAdverbs");
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
 - **Accept**: application/json

<a name="posTaggerTagNouns"></a>
# **posTaggerTagNouns**
> PosResponse posTaggerTagNouns(request)

Part-of-speech tag a string, filter to nouns

Part-of-speech (POS) tag a string, find the nouns, and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PosTaggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PosTaggerApi apiInstance = new PosTaggerApi();
PosRequest request = new PosRequest(); // PosRequest | Input string
try {
    PosResponse result = apiInstance.posTaggerTagNouns(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosTaggerApi#posTaggerTagNouns");
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
 - **Accept**: application/json

<a name="posTaggerTagPronouns"></a>
# **posTaggerTagPronouns**
> PosResponse posTaggerTagPronouns(request)

Part-of-speech tag a string, filter to pronouns

Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PosTaggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PosTaggerApi apiInstance = new PosTaggerApi();
PosRequest request = new PosRequest(); // PosRequest | Input string
try {
    PosResponse result = apiInstance.posTaggerTagPronouns(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosTaggerApi#posTaggerTagPronouns");
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
 - **Accept**: application/json

<a name="posTaggerTagSentence"></a>
# **posTaggerTagSentence**
> PosResponse posTaggerTagSentence(request)

Part-of-speech tag a string

Part-of-speech (POS) tag a string and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PosTaggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PosTaggerApi apiInstance = new PosTaggerApi();
PosRequest request = new PosRequest(); // PosRequest | Input string
try {
    PosResponse result = apiInstance.posTaggerTagSentence(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosTaggerApi#posTaggerTagSentence");
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
 - **Accept**: application/json

<a name="posTaggerTagVerbs"></a>
# **posTaggerTagVerbs**
> PosResponse posTaggerTagVerbs(request)

Part-of-speech tag a string, filter to verbs

Part-of-speech (POS) tag a string, find the verbs, and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PosTaggerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PosTaggerApi apiInstance = new PosTaggerApi();
PosRequest request = new PosRequest(); // PosRequest | Input string
try {
    PosResponse result = apiInstance.posTaggerTagVerbs(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosTaggerApi#posTaggerTagVerbs");
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
 - **Accept**: application/json

