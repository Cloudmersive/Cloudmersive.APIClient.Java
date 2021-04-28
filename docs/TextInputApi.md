# TextInputApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**textInputCheckHtmlSsrf**](TextInputApi.md#textInputCheckHtmlSsrf) | **POST** /validate/text-input/html/check/ssrf | Protect html input from Server-side Request Forgery (SSRF) attacks
[**textInputCheckSqlInjection**](TextInputApi.md#textInputCheckSqlInjection) | **POST** /validate/text-input/check/sql-injection | Check text input for SQL Injection (SQLI) attacks
[**textInputCheckSqlInjectionBatch**](TextInputApi.md#textInputCheckSqlInjectionBatch) | **POST** /validate/text-input/check/sql-injection/batch | Check and protect multiple text inputs for SQL Injection (SQLI) attacks in batch
[**textInputCheckXss**](TextInputApi.md#textInputCheckXss) | **POST** /validate/text-input/check/xss | Check text input for Cross-Site-Scripting (XSS) attacks
[**textInputCheckXssBatch**](TextInputApi.md#textInputCheckXssBatch) | **POST** /validate/text-input/check-and-protect/xss/batch | Check and protect multiple text inputs for Cross-Site-Scripting (XSS) attacks in batch
[**textInputCheckXxe**](TextInputApi.md#textInputCheckXxe) | **POST** /validate/text-input/check/xxe | Protect text input from XML External Entity (XXE) attacks
[**textInputCheckXxeBatch**](TextInputApi.md#textInputCheckXxeBatch) | **POST** /validate/text-input/check/xxe/batch | Protect text input from XML External Entity (XXE) attacks
[**textInputProtectXss**](TextInputApi.md#textInputProtectXss) | **POST** /validate/text-input/protect/xss | Protect text input from Cross-Site-Scripting (XSS) attacks through normalization


<a name="textInputCheckHtmlSsrf"></a>
# **textInputCheckHtmlSsrf**
> HtmlSsrfDetectionResult textInputCheckHtmlSsrf(value)

Protect html input from Server-side Request Forgery (SSRF) attacks

Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextInputApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextInputApi apiInstance = new TextInputApi();
String value = "value_example"; // String | User-facing HTML input.
try {
    HtmlSsrfDetectionResult result = apiInstance.textInputCheckHtmlSsrf(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextInputApi#textInputCheckHtmlSsrf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| User-facing HTML input. |

### Return type

[**HtmlSsrfDetectionResult**](HtmlSsrfDetectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="textInputCheckSqlInjection"></a>
# **textInputCheckSqlInjection**
> SqlInjectionDetectionResult textInputCheckSqlInjection(value, detectionLevel)

Check text input for SQL Injection (SQLI) attacks

Detects SQL Injection (SQLI) attacks from text input.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextInputApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextInputApi apiInstance = new TextInputApi();
String value = "value_example"; // String | User-facing text input.
String detectionLevel = "detectionLevel_example"; // String | Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended).
try {
    SqlInjectionDetectionResult result = apiInstance.textInputCheckSqlInjection(value, detectionLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextInputApi#textInputCheckSqlInjection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| User-facing text input. |
 **detectionLevel** | **String**| Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended). | [optional]

### Return type

[**SqlInjectionDetectionResult**](SqlInjectionDetectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="textInputCheckSqlInjectionBatch"></a>
# **textInputCheckSqlInjectionBatch**
> SqlInjectionCheckBatchResponse textInputCheckSqlInjectionBatch(value)

Check and protect multiple text inputs for SQL Injection (SQLI) attacks in batch

Detects SQL Injection (SQLI) attacks from multiple text inputs.  Output preverses order of input items.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextInputApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextInputApi apiInstance = new TextInputApi();
SqlInjectionCheckBatchRequest value = new SqlInjectionCheckBatchRequest(); // SqlInjectionCheckBatchRequest | User-facing text input.
try {
    SqlInjectionCheckBatchResponse result = apiInstance.textInputCheckSqlInjectionBatch(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextInputApi#textInputCheckSqlInjectionBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**SqlInjectionCheckBatchRequest**](SqlInjectionCheckBatchRequest.md)| User-facing text input. |

### Return type

[**SqlInjectionCheckBatchResponse**](SqlInjectionCheckBatchResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="textInputCheckXss"></a>
# **textInputCheckXss**
> XssProtectionResult textInputCheckXss(value)

Check text input for Cross-Site-Scripting (XSS) attacks

Detects XSS (Cross-Site-Scripting) attacks from text input.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextInputApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextInputApi apiInstance = new TextInputApi();
String value = "value_example"; // String | User-facing text input.
try {
    XssProtectionResult result = apiInstance.textInputCheckXss(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextInputApi#textInputCheckXss");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| User-facing text input. |

### Return type

[**XssProtectionResult**](XssProtectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="textInputCheckXssBatch"></a>
# **textInputCheckXssBatch**
> XssProtectionBatchResponse textInputCheckXssBatch(value)

Check and protect multiple text inputs for Cross-Site-Scripting (XSS) attacks in batch

Detects XSS (Cross-Site-Scripting) attacks from multiple text inputs.  Output preverses order of input items.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextInputApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextInputApi apiInstance = new TextInputApi();
XssProtectionBatchRequest value = new XssProtectionBatchRequest(); // XssProtectionBatchRequest | User-facing text input.
try {
    XssProtectionBatchResponse result = apiInstance.textInputCheckXssBatch(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextInputApi#textInputCheckXssBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**XssProtectionBatchRequest**](XssProtectionBatchRequest.md)| User-facing text input. |

### Return type

[**XssProtectionBatchResponse**](XssProtectionBatchResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="textInputCheckXxe"></a>
# **textInputCheckXxe**
> XxeDetectionResult textInputCheckXxe(value, allowInternetUrls, knownSafeUrls, knownUnsafeUrls)

Protect text input from XML External Entity (XXE) attacks

Detects XXE (XML External Entity) attacks from text input.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextInputApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextInputApi apiInstance = new TextInputApi();
String value = "value_example"; // String | User-facing text input.
Boolean allowInternetUrls = true; // Boolean | Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false.
String knownSafeUrls = "knownSafeUrls_example"; // String | Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe.
String knownUnsafeUrls = "knownUnsafeUrls_example"; // String | Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe.
try {
    XxeDetectionResult result = apiInstance.textInputCheckXxe(value, allowInternetUrls, knownSafeUrls, knownUnsafeUrls);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextInputApi#textInputCheckXxe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| User-facing text input. |
 **allowInternetUrls** | **Boolean**| Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false. | [optional]
 **knownSafeUrls** | **String**| Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe. | [optional]
 **knownUnsafeUrls** | **String**| Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe. | [optional]

### Return type

[**XxeDetectionResult**](XxeDetectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="textInputCheckXxeBatch"></a>
# **textInputCheckXxeBatch**
> XxeDetectionBatchResponse textInputCheckXxeBatch(request)

Protect text input from XML External Entity (XXE) attacks

Detects XXE (XML External Entity) attacks from text input.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextInputApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextInputApi apiInstance = new TextInputApi();
XxeDetectionBatchRequest request = new XxeDetectionBatchRequest(); // XxeDetectionBatchRequest | 
try {
    XxeDetectionBatchResponse result = apiInstance.textInputCheckXxeBatch(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextInputApi#textInputCheckXxeBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**XxeDetectionBatchRequest**](XxeDetectionBatchRequest.md)|  |

### Return type

[**XxeDetectionBatchResponse**](XxeDetectionBatchResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="textInputProtectXss"></a>
# **textInputProtectXss**
> XssProtectionResult textInputProtectXss(value)

Protect text input from Cross-Site-Scripting (XSS) attacks through normalization

Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TextInputApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TextInputApi apiInstance = new TextInputApi();
String value = "value_example"; // String | User-facing text input.
try {
    XssProtectionResult result = apiInstance.textInputProtectXss(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextInputApi#textInputProtectXss");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| User-facing text input. |

### Return type

[**XssProtectionResult**](XssProtectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

