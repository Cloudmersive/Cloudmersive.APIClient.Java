# UserAgentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAgentParse**](UserAgentApi.md#userAgentParse) | **POST** /validate/useragent/parse | Parse an HTTP User-Agent string, identify robots


<a name="userAgentParse"></a>
# **userAgentParse**
> UserAgentValidateResponse userAgentParse(request)

Parse an HTTP User-Agent string, identify robots

Uses a parsing system and database to parse the User-Agent into its structured component parts, such as Browser, Browser Version, Browser Engine, Operating System, and importantly, Robot identification.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.UserAgentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

UserAgentApi apiInstance = new UserAgentApi();
UserAgentValidateRequest request = new UserAgentValidateRequest(); // UserAgentValidateRequest | Input parse request
try {
    UserAgentValidateResponse result = apiInstance.userAgentParse(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAgentApi#userAgentParse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UserAgentValidateRequest**](UserAgentValidateRequest.md)| Input parse request |

### Return type

[**UserAgentValidateResponse**](UserAgentValidateResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

