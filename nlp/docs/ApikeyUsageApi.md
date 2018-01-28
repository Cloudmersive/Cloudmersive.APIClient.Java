# ApikeyUsageApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apikeyUsageGet**](ApikeyUsageApi.md#apikeyUsageGet) | **GET** /nlp/apikeyUsage/{id} | Get API Key usage


<a name="apikeyUsageGet"></a>
# **apikeyUsageGet**
> Long apikeyUsageGet(id)

Get API Key usage

Use this API to determine how many API calls you have made during this month.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApikeyUsageApi;


ApikeyUsageApi apiInstance = new ApikeyUsageApi();
String id = "id_example"; // String | API key to check
try {
    Long result = apiInstance.apikeyUsageGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApikeyUsageApi#apikeyUsageGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| API key to check |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

