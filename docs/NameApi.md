# NameApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nameGetGender**](NameApi.md#nameGetGender) | **POST** /validate/name/get-gender | Get the gender of a first name
[**nameIdentifier**](NameApi.md#nameIdentifier) | **POST** /validate/name/identifier | Validate a code identifier
[**nameValidateFirstName**](NameApi.md#nameValidateFirstName) | **POST** /validate/name/first | Validate a first name
[**nameValidateFullName**](NameApi.md#nameValidateFullName) | **POST** /validate/name/full-name | Parse and validate a full name
[**nameValidateLastName**](NameApi.md#nameValidateLastName) | **POST** /validate/name/last | Validate a last name


<a name="nameGetGender"></a>
# **nameGetGender**
> GetGenderResponse nameGetGender(input)

Get the gender of a first name

Determines the gender of a first name (given name)

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NameApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NameApi apiInstance = new NameApi();
GetGenderRequest input = new GetGenderRequest(); // GetGenderRequest | Gender request information
try {
    GetGenderResponse result = apiInstance.nameGetGender(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NameApi#nameGetGender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetGenderRequest**](GetGenderRequest.md)| Gender request information |

### Return type

[**GetGenderResponse**](GetGenderResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="nameIdentifier"></a>
# **nameIdentifier**
> ValidateIdentifierResponse nameIdentifier(input)

Validate a code identifier

Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NameApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NameApi apiInstance = new NameApi();
ValidateIdentifierRequest input = new ValidateIdentifierRequest(); // ValidateIdentifierRequest | Identifier validation request information
try {
    ValidateIdentifierResponse result = apiInstance.nameIdentifier(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NameApi#nameIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ValidateIdentifierRequest**](ValidateIdentifierRequest.md)| Identifier validation request information |

### Return type

[**ValidateIdentifierResponse**](ValidateIdentifierResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="nameValidateFirstName"></a>
# **nameValidateFirstName**
> FirstNameValidationResponse nameValidateFirstName(input)

Validate a first name

Determines if a string is a valid first name (given name)

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NameApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NameApi apiInstance = new NameApi();
FirstNameValidationRequest input = new FirstNameValidationRequest(); // FirstNameValidationRequest | Validation request information
try {
    FirstNameValidationResponse result = apiInstance.nameValidateFirstName(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NameApi#nameValidateFirstName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**FirstNameValidationRequest**](FirstNameValidationRequest.md)| Validation request information |

### Return type

[**FirstNameValidationResponse**](FirstNameValidationResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="nameValidateFullName"></a>
# **nameValidateFullName**
> FullNameValidationResponse nameValidateFullName(input)

Parse and validate a full name

Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NameApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NameApi apiInstance = new NameApi();
FullNameValidationRequest input = new FullNameValidationRequest(); // FullNameValidationRequest | Validation request information
try {
    FullNameValidationResponse result = apiInstance.nameValidateFullName(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NameApi#nameValidateFullName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**FullNameValidationRequest**](FullNameValidationRequest.md)| Validation request information |

### Return type

[**FullNameValidationResponse**](FullNameValidationResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="nameValidateLastName"></a>
# **nameValidateLastName**
> LastNameValidationResponse nameValidateLastName(input)

Validate a last name

Determines if a string is a valid last name (surname)

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NameApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NameApi apiInstance = new NameApi();
LastNameValidationRequest input = new LastNameValidationRequest(); // LastNameValidationRequest | Validation request information
try {
    LastNameValidationResponse result = apiInstance.nameValidateLastName(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NameApi#nameValidateLastName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**LastNameValidationRequest**](LastNameValidationRequest.md)| Validation request information |

### Return type

[**LastNameValidationResponse**](LastNameValidationResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

