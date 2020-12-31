# IpAddressApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**iPAddressGeolocateStreetAddress**](IpAddressApi.md#iPAddressGeolocateStreetAddress) | **POST** /validate/ip/geolocate/street-address | Geolocate an IP address to a street address
[**iPAddressIpIntelligence**](IpAddressApi.md#iPAddressIpIntelligence) | **POST** /validate/ip/intelligence | Get intelligence on an IP address
[**iPAddressIsBot**](IpAddressApi.md#iPAddressIsBot) | **POST** /validate/ip/is-bot | Check if IP address is a Bot client
[**iPAddressIsThreat**](IpAddressApi.md#iPAddressIsThreat) | **POST** /validate/ip/is-threat | Check if IP address is a known threat
[**iPAddressIsTorNode**](IpAddressApi.md#iPAddressIsTorNode) | **POST** /validate/ip/is-tor-node | Check if IP address is a Tor node server
[**iPAddressPost**](IpAddressApi.md#iPAddressPost) | **POST** /validate/ip/geolocate | Geolocate an IP address
[**iPAddressReverseDomainLookup**](IpAddressApi.md#iPAddressReverseDomainLookup) | **POST** /validate/ip/reverse-domain-lookup | Perform a reverse domain name (DNS) lookup on an IP address


<a name="iPAddressGeolocateStreetAddress"></a>
# **iPAddressGeolocateStreetAddress**
> GeolocateStreetAddressResponse iPAddressGeolocateStreetAddress(value)

Geolocate an IP address to a street address

Identify an IP address&#39;s street address.  Useful for security and UX applications.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.IpAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

IpAddressApi apiInstance = new IpAddressApi();
String value = "value_example"; // String | IP address to geolocate, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
try {
    GeolocateStreetAddressResponse result = apiInstance.iPAddressGeolocateStreetAddress(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressApi#iPAddressGeolocateStreetAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**GeolocateStreetAddressResponse**](GeolocateStreetAddressResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="iPAddressIpIntelligence"></a>
# **iPAddressIpIntelligence**
> IPIntelligenceResponse iPAddressIpIntelligence(value)

Get intelligence on an IP address

Identify key intelligence about an IP address, including if it is a known threat IP, known bot, Tor exit node, as well as the location of the IP address.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.IpAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

IpAddressApi apiInstance = new IpAddressApi();
String value = "value_example"; // String | IP address to process, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
try {
    IPIntelligenceResponse result = apiInstance.iPAddressIpIntelligence(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressApi#iPAddressIpIntelligence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| IP address to process, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**IPIntelligenceResponse**](IPIntelligenceResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="iPAddressIsBot"></a>
# **iPAddressIsBot**
> BotCheckResponse iPAddressIsBot(value)

Check if IP address is a Bot client

Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.IpAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

IpAddressApi apiInstance = new IpAddressApi();
String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
try {
    BotCheckResponse result = apiInstance.iPAddressIsBot(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressApi#iPAddressIsBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**BotCheckResponse**](BotCheckResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="iPAddressIsThreat"></a>
# **iPAddressIsThreat**
> IPThreatResponse iPAddressIsThreat(value)

Check if IP address is a known threat

Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.IpAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

IpAddressApi apiInstance = new IpAddressApi();
String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
try {
    IPThreatResponse result = apiInstance.iPAddressIsThreat(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressApi#iPAddressIsThreat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**IPThreatResponse**](IPThreatResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="iPAddressIsTorNode"></a>
# **iPAddressIsTorNode**
> TorNodeResponse iPAddressIsTorNode(value)

Check if IP address is a Tor node server

Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.IpAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

IpAddressApi apiInstance = new IpAddressApi();
String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
try {
    TorNodeResponse result = apiInstance.iPAddressIsTorNode(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressApi#iPAddressIsTorNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**TorNodeResponse**](TorNodeResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="iPAddressPost"></a>
# **iPAddressPost**
> GeolocateResponse iPAddressPost(value)

Geolocate an IP address

Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.IpAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

IpAddressApi apiInstance = new IpAddressApi();
String value = "value_example"; // String | IP address to geolocate, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
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
 **value** | **String**| IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**GeolocateResponse**](GeolocateResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="iPAddressReverseDomainLookup"></a>
# **iPAddressReverseDomainLookup**
> IPReverseDNSLookupResponse iPAddressReverseDomainLookup(value)

Perform a reverse domain name (DNS) lookup on an IP address

Gets the domain name, if any, associated with the IP address.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.IpAddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

IpAddressApi apiInstance = new IpAddressApi();
String value = "value_example"; // String | IP address to check, e.g. \"55.55.55.55\".  The input is a string so be sure to enclose it in double-quotes.
try {
    IPReverseDNSLookupResponse result = apiInstance.iPAddressReverseDomainLookup(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressApi#iPAddressReverseDomainLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. |

### Return type

[**IPReverseDNSLookupResponse**](IPReverseDNSLookupResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

