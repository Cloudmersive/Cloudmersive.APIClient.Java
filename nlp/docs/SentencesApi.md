# SentencesApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sentencesPost**](SentencesApi.md#sentencesPost) | **POST** /nlp/get/sentences/string | Extract sentences from string


<a name="sentencesPost"></a>
# **sentencesPost**
> String sentencesPost(input)

Extract sentences from string

Segment an input string into separate sentences, output result as a string.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SentencesApi;


SentencesApi apiInstance = new SentencesApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.sentencesPost(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SentencesApi#sentencesPost");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

