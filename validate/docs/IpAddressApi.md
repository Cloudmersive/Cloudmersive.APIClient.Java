# IpAddressApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**iPAddressPost**](IpAddressApi.md#iPAddressPost) | **POST** /validate/ip/geolocate | Geolocate an IP address


<a name="iPAddressPost"></a>
# **iPAddressPost**
> GeolocateResponse iPAddressPost(value)

Geolocate an IP address

Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.validate.IpAddressApi;


IpAddressApi apiInstance = new IpAddressApi();
String value = "value_example"; // String | IP address to geolocate, e.g. \"55.55.55.55\"
try {
    GeolocateResponse result = apiInstance.iPAddressPost(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressApi#iPAddressPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| IP address to geolocate, e.g. \&quot;55.55.55.55\&quot; |

### Return type

[**GeolocateResponse**](GeolocateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

