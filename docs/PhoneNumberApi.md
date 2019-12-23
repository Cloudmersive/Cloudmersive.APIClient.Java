# PhoneNumberApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**phoneNumberSyntaxOnly**](PhoneNumberApi.md#phoneNumberSyntaxOnly) | **POST** /validate/phonenumber/basic | Validate phone number (basic)


<a name="phoneNumberSyntaxOnly"></a>
# **phoneNumberSyntaxOnly**
> PhoneNumberValidationResponse phoneNumberSyntaxOnly(value)

Validate phone number (basic)

Validate a phone number by analyzing the syntax

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PhoneNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PhoneNumberApi apiInstance = new PhoneNumberApi();
PhoneNumberValidateRequest value = new PhoneNumberValidateRequest(); // PhoneNumberValidateRequest | Phone number to validate in a PhoneNumberValidateRequest object.  Try a phone number such as \"1.800.463.3339\", and either leave DefaultCountryCode blank or use \"US\".
try {
    PhoneNumberValidationResponse result = apiInstance.phoneNumberSyntaxOnly(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#phoneNumberSyntaxOnly");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**PhoneNumberValidateRequest**](PhoneNumberValidateRequest.md)| Phone number to validate in a PhoneNumberValidateRequest object.  Try a phone number such as \&quot;1.800.463.3339\&quot;, and either leave DefaultCountryCode blank or use \&quot;US\&quot;. |

### Return type

[**PhoneNumberValidationResponse**](PhoneNumberValidationResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

