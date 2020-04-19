# BarcodeLookupApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**barcodeLookupEanLookup**](BarcodeLookupApi.md#barcodeLookupEanLookup) | **POST** /barcode/lookup/ean | Lookup EAN barcode value, return product data


<a name="barcodeLookupEanLookup"></a>
# **barcodeLookupEanLookup**
> BarcodeLookupResponse barcodeLookupEanLookup(value)

Lookup EAN barcode value, return product data

Lookup an input EAN barcode and return key details about the product

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.BarcodeLookupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

BarcodeLookupApi apiInstance = new BarcodeLookupApi();
String value = "value_example"; // String | Barcode value
try {
    BarcodeLookupResponse result = apiInstance.barcodeLookupEanLookup(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BarcodeLookupApi#barcodeLookupEanLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Barcode value |

### Return type

[**BarcodeLookupResponse**](BarcodeLookupResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

