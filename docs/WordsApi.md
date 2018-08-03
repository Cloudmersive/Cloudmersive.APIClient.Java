# WordsApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wordsAdjectives**](WordsApi.md#wordsAdjectives) | **POST** nlp/get/words/adjectives/string | Get adjectives in string
[**wordsAdverbs**](WordsApi.md#wordsAdverbs) | **POST** nlp/get/words/adverbs/string | Get adverbs in input string
[**wordsGetWordsJson**](WordsApi.md#wordsGetWordsJson) | **POST** nlp/get/words/json | Get words in input string (JSON)
[**wordsGetWordsString**](WordsApi.md#wordsGetWordsString) | **POST** nlp/get/words/string | Get words from string
[**wordsNouns**](WordsApi.md#wordsNouns) | **POST** nlp/get/words/nouns/string | Get nouns in string
[**wordsPost**](WordsApi.md#wordsPost) | **POST** nlp/get/words/verbs/string | Get the verbs in a string
[**wordsPronouns**](WordsApi.md#wordsPronouns) | **POST** nlp/get/words/pronouns/string | Returns all pronounts in string
[**wordsProperNouns**](WordsApi.md#wordsProperNouns) | **POST** nlp/get/words/properNouns/string | Get proper nouns in a string


<a name="wordsAdjectives"></a>
# **wordsAdjectives**
> String wordsAdjectives(input)

Get adjectives in string

Retrieves all adjectives in input string

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.WordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

WordsApi apiInstance = new WordsApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.wordsAdjectives(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#wordsAdjectives");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| Input string |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="wordsAdverbs"></a>
# **wordsAdverbs**
> String wordsAdverbs(input)

Get adverbs in input string

Returns all adverb words in the input string

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.WordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

WordsApi apiInstance = new WordsApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.wordsAdverbs(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#wordsAdverbs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| Input string |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="wordsGetWordsJson"></a>
# **wordsGetWordsJson**
> GetWordsJsonResponse wordsGetWordsJson(input)

Get words in input string (JSON)

Get the component words in an input string, formatted as JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.WordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

WordsApi apiInstance = new WordsApi();
String input = "input_example"; // String | String to process
try {
    GetWordsJsonResponse result = apiInstance.wordsGetWordsJson(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#wordsGetWordsJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| String to process |

### Return type

[**GetWordsJsonResponse**](GetWordsJsonResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="wordsGetWordsString"></a>
# **wordsGetWordsString**
> String wordsGetWordsString(input)

Get words from string

Segment an input string into its component words

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.WordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

WordsApi apiInstance = new WordsApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.wordsGetWordsString(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#wordsGetWordsString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| Input string |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="wordsNouns"></a>
# **wordsNouns**
> String wordsNouns(input)

Get nouns in string

Returns all of the nouns in the input string

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.WordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

WordsApi apiInstance = new WordsApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.wordsNouns(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#wordsNouns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| Input string |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="wordsPost"></a>
# **wordsPost**
> String wordsPost(input)

Get the verbs in a string

Get all of the verbs in the input string.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.WordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

WordsApi apiInstance = new WordsApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.wordsPost(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#wordsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| Input string |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="wordsPronouns"></a>
# **wordsPronouns**
> String wordsPronouns(input)

Returns all pronounts in string

Returns all pronouns in the input string

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.WordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

WordsApi apiInstance = new WordsApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.wordsPronouns(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#wordsPronouns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| Input string |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="wordsProperNouns"></a>
# **wordsProperNouns**
> String wordsProperNouns(input)

Get proper nouns in a string

Returns all of the proper nouns in a string.  Proper nouns are named entities such as \&quot;Hilton\&quot;.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.WordsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

WordsApi apiInstance = new WordsApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.wordsProperNouns(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordsApi#wordsProperNouns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| Input string |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

