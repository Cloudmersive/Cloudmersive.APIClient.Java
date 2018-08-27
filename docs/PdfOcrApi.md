# PdfOcrApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pdfOcrPost**](PdfOcrApi.md#pdfOcrPost) | **POST** /ocr/pdf/toText | Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.


<a name="pdfOcrPost"></a>
# **pdfOcrPost**
> PdfToTextResponse pdfOcrPost(imageFile)

Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PdfOcrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PdfOcrApi apiInstance = new PdfOcrApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
try {
    PdfToTextResponse result = apiInstance.pdfOcrPost(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PdfOcrApi#pdfOcrPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**PdfToTextResponse**](PdfToTextResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

