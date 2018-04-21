# EmailApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailAddressGetServers**](EmailApi.md#emailAddressGetServers) | **POST** /validate/email/address/servers | Partially check whether an email address is valid
[**emailFullValidation**](EmailApi.md#emailFullValidation) | **POST** /validate/email/address/full | Fully validate an email address
[**emailPost**](EmailApi.md#emailPost) | **POST** /validate/email/address/syntaxOnly | Validate email adddress for syntactic correctness only


<a name="emailAddressGetServers"></a>
# **emailAddressGetServers**
> AddressGetServersResponse emailAddressGetServers(email)

Partially check whether an email address is valid

Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.EmailApi;


EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\"
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
 **email** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot; |

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

Fully validate an email address

Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.EmailApi;


EmailApi apiInstance = new EmailApi();
String email = "email_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\"
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
 **email** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot; |

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

Validate email adddress for syntactic correctness only

Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.EmailApi;


EmailApi apiInstance = new EmailApi();
String value = "value_example"; // String | Email address to validate, e.g. \"support@cloudmersive.com\"
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
 **value** | **String**| Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot; |

### Return type

[**AddressVerifySyntaxOnlyResponse**](AddressVerifySyntaxOnlyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

