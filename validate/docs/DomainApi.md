# DomainApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**domainCheck**](DomainApi.md#domainCheck) | **POST** /validate/domain/check | 
[**domainPost**](DomainApi.md#domainPost) | **POST** /validate/domain/whois | 


<a name="domainCheck"></a>
# **domainCheck**
> CheckResponse domainCheck(domain)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DomainApi;


DomainApi apiInstance = new DomainApi();
String domain = "domain_example"; // String | 
try {
    CheckResponse result = apiInstance.domainCheck(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainApi#domainCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**|  |

### Return type

[**CheckResponse**](CheckResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="domainPost"></a>
# **domainPost**
> WhoisResponse domainPost(domain)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DomainApi;


DomainApi apiInstance = new DomainApi();
String domain = "domain_example"; // String | 
try {
    WhoisResponse result = apiInstance.domainPost(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainApi#domainPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**|  |

### Return type

[**WhoisResponse**](WhoisResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

