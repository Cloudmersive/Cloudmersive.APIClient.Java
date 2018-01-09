# IPaddressControllerApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**iPaddressControllerPost**](IPaddressControllerApi.md#iPaddressControllerPost) | **POST** /validate/ip/geolocate | 


<a name="iPaddressControllerPost"></a>
# **iPaddressControllerPost**
> GeolocateResponse iPaddressControllerPost(value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IPaddressControllerApi;


IPaddressControllerApi apiInstance = new IPaddressControllerApi();
String value = "value_example"; // String | 
try {
    GeolocateResponse result = apiInstance.iPaddressControllerPost(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IPaddressControllerApi#iPaddressControllerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**|  |

### Return type

[**GeolocateResponse**](GeolocateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

