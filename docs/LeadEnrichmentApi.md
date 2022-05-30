# LeadEnrichmentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadEnrichmentEnrichLead**](LeadEnrichmentApi.md#leadEnrichmentEnrichLead) | **POST** /validate/lead-enrichment/lead/enrich | Enrich an input lead with additional fields of data
[**leadEnrichmentGetCompanyInformation**](LeadEnrichmentApi.md#leadEnrichmentGetCompanyInformation) | **POST** /validate/lead-enrichment/lead/email/company-information | Get company information from email address


<a name="leadEnrichmentEnrichLead"></a>
# **leadEnrichmentEnrichLead**
> LeadEnrichmentResponse leadEnrichmentEnrichLead(request)

Enrich an input lead with additional fields of data

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.LeadEnrichmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

LeadEnrichmentApi apiInstance = new LeadEnrichmentApi();
LeadEnrichmentRequest request = new LeadEnrichmentRequest(); // LeadEnrichmentRequest | Input lead with known fields set, and unknown fields left blank (null)
try {
    LeadEnrichmentResponse result = apiInstance.leadEnrichmentEnrichLead(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadEnrichmentApi#leadEnrichmentEnrichLead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**LeadEnrichmentRequest**](LeadEnrichmentRequest.md)| Input lead with known fields set, and unknown fields left blank (null) |

### Return type

[**LeadEnrichmentResponse**](LeadEnrichmentResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="leadEnrichmentGetCompanyInformation"></a>
# **leadEnrichmentGetCompanyInformation**
> LeadEnrichmentResponse leadEnrichmentGetCompanyInformation(request)

Get company information from email address

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.LeadEnrichmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

LeadEnrichmentApi apiInstance = new LeadEnrichmentApi();
EmailLead request = new EmailLead(); // EmailLead | Input email address lead
try {
    LeadEnrichmentResponse result = apiInstance.leadEnrichmentGetCompanyInformation(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadEnrichmentApi#leadEnrichmentGetCompanyInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**EmailLead**](EmailLead.md)| Input email address lead |

### Return type

[**LeadEnrichmentResponse**](LeadEnrichmentResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json
 - **Accept**: application/json, text/json, application/xml, text/xml

