# MergeDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mergeDocumentDocx**](MergeDocumentApi.md#mergeDocumentDocx) | **POST** /convert/merge/docx | Merge Multple Word DOCX Together
[**mergeDocumentPdf**](MergeDocumentApi.md#mergeDocumentPdf) | **POST** /convert/merge/pdf | Merge Multple PDF Files Together
[**mergeDocumentPng**](MergeDocumentApi.md#mergeDocumentPng) | **POST** /convert/merge/png/vertical | Merge Multple PNG Files Together
[**mergeDocumentPptx**](MergeDocumentApi.md#mergeDocumentPptx) | **POST** /convert/merge/pptx | Merge Multple PowerPoint PPTX Together
[**mergeDocumentXlsx**](MergeDocumentApi.md#mergeDocumentXlsx) | **POST** /convert/merge/xlsx | Merge Multple Excel XLSX Together


<a name="mergeDocumentDocx"></a>
# **mergeDocumentDocx**
> byte[] mergeDocumentDocx(inputFile1, inputFile2)

Merge Multple Word DOCX Together

Combine multiple Office Word Documents (docx) into one single Office Word document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.MergeDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

MergeDocumentApi apiInstance = new MergeDocumentApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on (more than 2 can be supplied).
try {
    byte[] result = apiInstance.mergeDocumentDocx(inputFile1, inputFile2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MergeDocumentApi#mergeDocumentDocx");
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

<a name="mergeDocumentPdf"></a>
# **mergeDocumentPdf**
> byte[] mergeDocumentPdf(inputFile1, inputFile2)

Merge Multple PDF Files Together

Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.MergeDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

MergeDocumentApi apiInstance = new MergeDocumentApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on (more than 2 can be supplied).
try {
    byte[] result = apiInstance.mergeDocumentPdf(inputFile1, inputFile2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MergeDocumentApi#mergeDocumentPdf");
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

<a name="mergeDocumentPng"></a>
# **mergeDocumentPng**
> byte[] mergeDocumentPng(inputFile1, inputFile2)

Merge Multple PNG Files Together

Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.MergeDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

MergeDocumentApi apiInstance = new MergeDocumentApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on (more than 2 can be supplied).
try {
    byte[] result = apiInstance.mergeDocumentPng(inputFile1, inputFile2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MergeDocumentApi#mergeDocumentPng");
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

<a name="mergeDocumentPptx"></a>
# **mergeDocumentPptx**
> byte[] mergeDocumentPptx(inputFile1, inputFile2)

Merge Multple PowerPoint PPTX Together

Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.MergeDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

MergeDocumentApi apiInstance = new MergeDocumentApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on (more than 2 can be supplied).
try {
    byte[] result = apiInstance.mergeDocumentPptx(inputFile1, inputFile2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MergeDocumentApi#mergeDocumentPptx");
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

<a name="mergeDocumentXlsx"></a>
# **mergeDocumentXlsx**
> byte[] mergeDocumentXlsx(inputFile1, inputFile2)

Merge Multple Excel XLSX Together

Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.MergeDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

MergeDocumentApi apiInstance = new MergeDocumentApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on (more than 2 can be supplied).
try {
    byte[] result = apiInstance.mergeDocumentXlsx(inputFile1, inputFile2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MergeDocumentApi#mergeDocumentXlsx");
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

