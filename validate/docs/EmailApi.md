# EmailApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailAddressGetServers**](EmailApi.md#emailAddressGetServers) | **POST** /validate/email/address/servers | 
[**emailFullValidation**](EmailApi.md#emailFullValidation) | **POST** /validate/email/address/full | 
[**emailPost**](EmailApi.md#emailPost) | **POST** /validate/email/address/syntaxOnly | 


<a name="emailAddressGetServers"></a>
# **emailAddressGetServers**
> AddressGetServersResponse emailAddressGetServers(email)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmailApi;


EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | 
try {
    AddressGetServersResponse result = apiInstance.emailAddressGetServers(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailAddressGetServers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

[**AddressGetServersResponse**](AddressGetServersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="emailFullValidation"></a>
# **emailFullValidation**
> FullEmailValidationResponse emailFullValidation(email)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmailApi;


EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | 
try {
    FullEmailValidationResponse result = apiInstance.emailFullValidation(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailFullValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

[**FullEmailValidationResponse**](FullEmailValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="emailPost"></a>
# **emailPost**
> AddressVerifySyntaxOnlyResponse emailPost(value)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmailApi;


EmailApi apiInstance = new EmailApi();
String value = "value_example"; // String | 
try {
    AddressVerifySyntaxOnlyResponse result = apiInstance.emailPost(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#emailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**|  |

### Return type

[**AddressVerifySyntaxOnlyResponse**](AddressVerifySyntaxOnlyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

