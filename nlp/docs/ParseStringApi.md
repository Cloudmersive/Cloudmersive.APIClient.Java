# ParseStringApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parseStringPost**](ParseStringApi.md#parseStringPost) | **POST** /nlp/ParseString | Parse string to syntax tree


<a name="parseStringPost"></a>
# **parseStringPost**
> String parseStringPost(input)

Parse string to syntax tree

Parses the input string into a Penn Treebank syntax tree

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.nlp.ParseStringApi;


ParseStringApi apiInstance = new ParseStringApi();
String input = "input_example"; // String | Input string
try {
    String result = apiInstance.parseStringPost(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParseStringApi#parseStringPost");
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

