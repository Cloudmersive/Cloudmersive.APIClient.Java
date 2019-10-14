# SplitDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**splitDocumentXlsx**](SplitDocumentApi.md#splitDocumentXlsx) | **POST** /convert/split/xlsx | Split a single Excel XLSX into Separate Worksheets


<a name="splitDocumentXlsx"></a>
# **splitDocumentXlsx**
> SplitXlsxWorksheetResult splitDocumentXlsx(inputFile)

Split a single Excel XLSX into Separate Worksheets

Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.SplitDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

SplitDocumentApi apiInstance = new SplitDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    SplitXlsxWorksheetResult result = apiInstance.splitDocumentXlsx(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SplitDocumentApi#splitDocumentXlsx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**SplitXlsxWorksheetResult**](SplitXlsxWorksheetResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

