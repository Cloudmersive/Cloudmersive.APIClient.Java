# PosTaggerStringApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**posTaggerStringPost**](PosTaggerStringApi.md#posTaggerStringPost) | **POST** /nlp/PosTaggerString | Part-of-speech tag a string


<a name="posTaggerStringPost"></a>
# **posTaggerStringPost**
> String posTaggerStringPost(input)

Part-of-speech tag a string

Perform a part-of-speech (POS) tagging on the input string.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.nlp.PosTaggerStringApi;


PosTaggerStringApi apiInstance = new PosTaggerStringApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.posTaggerStringPost(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosTaggerStringApi#posTaggerStringPost");
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

