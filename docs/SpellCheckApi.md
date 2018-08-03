# SpellCheckApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spellCheckCheckJson**](SpellCheckApi.md#spellCheckCheckJson) | **POST** nlp/spellcheck/check/word/json | Spell check word
[**spellCheckCheckSentenceJson**](SpellCheckApi.md#spellCheckCheckSentenceJson) | **POST** nlp/spellcheck/check/sentence/json | Check if sentence is spelled correctly
[**spellCheckCheckSentenceString**](SpellCheckApi.md#spellCheckCheckSentenceString) | **POST** nlp/spellcheck/check/sentence/string | Spell check a sentence
[**spellCheckCorrect**](SpellCheckApi.md#spellCheckCorrect) | **POST** nlp/spellcheck/correct/word/string | Find spelling corrections
[**spellCheckCorrectJson**](SpellCheckApi.md#spellCheckCorrectJson) | **POST** nlp/spellcheck/correct/word/json | Find spelling corrections
[**spellCheckPost**](SpellCheckApi.md#spellCheckPost) | **POST** nlp/spellcheck/check/word/string | Spell check a word


<a name="spellCheckCheckJson"></a>
# **spellCheckCheckJson**
> CheckJsonResponse spellCheckCheckJson(value)

Spell check word

Spell check a word as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpellCheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpellCheckApi apiInstance = new SpellCheckApi();
String value = "value_example"; // String | Input sentence
try {
    CheckJsonResponse result = apiInstance.spellCheckCheckJson(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpellCheckApi#spellCheckCheckJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Input sentence |

### Return type

[**CheckJsonResponse**](CheckJsonResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="spellCheckCheckSentenceJson"></a>
# **spellCheckCheckSentenceJson**
> CheckSentenceJsonResponse spellCheckCheckSentenceJson(value)

Check if sentence is spelled correctly

Checks whether the sentence is spelled correctly and returns the result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpellCheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpellCheckApi apiInstance = new SpellCheckApi();
String value = "value_example"; // String | Input sentence
try {
    CheckSentenceJsonResponse result = apiInstance.spellCheckCheckSentenceJson(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpellCheckApi#spellCheckCheckSentenceJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Input sentence |

### Return type

[**CheckSentenceJsonResponse**](CheckSentenceJsonResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="spellCheckCheckSentenceString"></a>
# **spellCheckCheckSentenceString**
> Boolean spellCheckCheckSentenceString(value)

Spell check a sentence

Check if a sentence is spelled correctly

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpellCheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpellCheckApi apiInstance = new SpellCheckApi();
String value = "value_example"; // String | Input sentence word
try {
    Boolean result = apiInstance.spellCheckCheckSentenceString(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpellCheckApi#spellCheckCheckSentenceString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Input sentence word |

### Return type

**Boolean**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="spellCheckCorrect"></a>
# **spellCheckCorrect**
> String spellCheckCorrect(value)

Find spelling corrections

Find the spelling corrections for a word

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpellCheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpellCheckApi apiInstance = new SpellCheckApi();
String value = "value_example"; // String | Input word
try {
    String result = apiInstance.spellCheckCorrect(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpellCheckApi#spellCheckCorrect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Input word |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="spellCheckCorrectJson"></a>
# **spellCheckCorrectJson**
> CorrectJsonResponse spellCheckCorrectJson(value)

Find spelling corrections

Find spelling correction suggestions and return result as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpellCheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpellCheckApi apiInstance = new SpellCheckApi();
String value = "value_example"; // String | Input string
try {
    CorrectJsonResponse result = apiInstance.spellCheckCorrectJson(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpellCheckApi#spellCheckCorrectJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Input string |

### Return type

[**CorrectJsonResponse**](CorrectJsonResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="spellCheckPost"></a>
# **spellCheckPost**
> Boolean spellCheckPost(value)

Spell check a word

Check if a word is spelled correctly

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SpellCheckApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SpellCheckApi apiInstance = new SpellCheckApi();
String value = "value_example"; // String | Input string word
try {
    Boolean result = apiInstance.spellCheckPost(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpellCheckApi#spellCheckPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Input string word |

### Return type

**Boolean**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

