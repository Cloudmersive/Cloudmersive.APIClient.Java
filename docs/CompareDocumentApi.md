# CompareDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**compareDocumentDocx**](CompareDocumentApi.md#compareDocumentDocx) | **POST** /convert/compare/docx | Compare Two Word DOCX


<a name="compareDocumentDocx"></a>
# **compareDocumentDocx**
> byte[] compareDocumentDocx(inputFile1, inputFile2)

Compare Two Word DOCX

Compare two Office Word Documents (docx) files and highlight the differences

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.CompareDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

CompareDocumentApi apiInstance = new CompareDocumentApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on (more than 2 can be supplied).
try {
    byte[] result = apiInstance.compareDocumentDocx(inputFile1, inputFile2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompareDocumentApi#compareDocumentDocx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile1** | **File**| First input file to perform the operation on. |
 **inputFile2** | **File**| Second input file to perform the operation on (more than 2 can be supplied). |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

