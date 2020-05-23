# RephraseApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rephraseEnglishRephraseSentenceBySentence**](RephraseApi.md#rephraseEnglishRephraseSentenceBySentence) | **POST** /nlp-v2/rephrase/rephrase/eng/by-sentence | Rephrase, paraphrase English text sentence-by-sentence using Deep Learning AI


<a name="rephraseEnglishRephraseSentenceBySentence"></a>
# **rephraseEnglishRephraseSentenceBySentence**
> RephraseResponse rephraseEnglishRephraseSentenceBySentence(input)

Rephrase, paraphrase English text sentence-by-sentence using Deep Learning AI

Automatically rephrases or paraphrases input text in English sentence by sentence using advanced Deep Learning and Neural NLP.  Creates multiple reprhasing candidates per input sentence, from 1 to 10 possible rephrasings of the original sentence.  Seeks to preserve original semantic meaning in rephrased output candidates.  Consumes 1-2 API calls per output rephrasing option generated, per sentence.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RephraseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RephraseApi apiInstance = new RephraseApi();
RephraseRequest input = new RephraseRequest(); // RephraseRequest | Input rephrase request
try {
    RephraseResponse result = apiInstance.rephraseEnglishRephraseSentenceBySentence(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RephraseApi#rephraseEnglishRephraseSentenceBySentence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**RephraseRequest**](RephraseRequest.md)| Input rephrase request |

### Return type

[**RephraseResponse**](RephraseResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

