# ExtractEntitiesStringApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractEntitiesStringPost**](ExtractEntitiesStringApi.md#extractEntitiesStringPost) | **POST** /nlp/ExtractEntitiesString | Extract entities from string


<a name="extractEntitiesStringPost"></a>
# **extractEntitiesStringPost**
> String extractEntitiesStringPost(value)

Extract entities from string

Extract the named entitites from an input string.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ExtractEntitiesStringApi;


ExtractEntitiesStringApi apiInstance = new ExtractEntitiesStringApi();
String value = "value_example"; // String | Input string
try {
    String result = apiInstance.extractEntitiesStringPost(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtractEntitiesStringApi#extractEntitiesStringPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Input string |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

