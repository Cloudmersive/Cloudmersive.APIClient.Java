# SplitDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**splitDocumentDocx**](SplitDocumentApi.md#splitDocumentDocx) | **POST** /convert/split/docx | Split a single Word Document DOCX into Separate Documents by Page
[**splitDocumentPdfByPage**](SplitDocumentApi.md#splitDocumentPdfByPage) | **POST** /convert/split/pdf | Split a PDF file into separate PDF files, one per page
[**splitDocumentPptx**](SplitDocumentApi.md#splitDocumentPptx) | **POST** /convert/split/pptx | Split a single PowerPoint Presentation PPTX into Separate Slides
[**splitDocumentTxtByLine**](SplitDocumentApi.md#splitDocumentTxtByLine) | **POST** /convert/split/txt/by-line | Split a single Text file (txt) into lines
[**splitDocumentTxtByString**](SplitDocumentApi.md#splitDocumentTxtByString) | **POST** /convert/split/txt/by-string | Split a single Text file (txt) by a string delimiter
[**splitDocumentXlsx**](SplitDocumentApi.md#splitDocumentXlsx) | **POST** /convert/split/xlsx | Split a single Excel XLSX into Separate Worksheets


<a name="splitDocumentDocx"></a>
# **splitDocumentDocx**
> SplitDocxDocumentResult splitDocumentDocx(inputFile, returnDocumentContents)

Split a single Word Document DOCX into Separate Documents by Page

Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.

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
Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true.
try {
    SplitDocxDocumentResult result = apiInstance.splitDocumentDocx(inputFile, returnDocumentContents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SplitDocumentApi#splitDocumentDocx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **returnDocumentContents** | **Boolean**| Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true. | [optional]

### Return type

[**SplitDocxDocumentResult**](SplitDocxDocumentResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="splitDocumentPdfByPage"></a>
# **splitDocumentPdfByPage**
> SplitPdfResult splitDocumentPdfByPage(inputFile, returnDocumentContents)

Split a PDF file into separate PDF files, one per page

Split an input PDF file into separate pages, comprised of one PDF file per page.

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
Boolean returnDocumentContents = true; // Boolean | Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false.
try {
    SplitPdfResult result = apiInstance.splitDocumentPdfByPage(inputFile, returnDocumentContents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SplitDocumentApi#splitDocumentPdfByPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **returnDocumentContents** | **Boolean**| Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false. | [optional]

### Return type

[**SplitPdfResult**](SplitPdfResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="splitDocumentPptx"></a>
# **splitDocumentPptx**
> SplitPptxPresentationResult splitDocumentPptx(inputFile, returnDocumentContents)

Split a single PowerPoint Presentation PPTX into Separate Slides

Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.

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
Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true.
try {
    SplitPptxPresentationResult result = apiInstance.splitDocumentPptx(inputFile, returnDocumentContents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SplitDocumentApi#splitDocumentPptx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **returnDocumentContents** | **Boolean**| Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. | [optional]

### Return type

[**SplitPptxPresentationResult**](SplitPptxPresentationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="splitDocumentTxtByLine"></a>
# **splitDocumentTxtByLine**
> SplitTextDocumentByLinesResult splitDocumentTxtByLine(inputFile)

Split a single Text file (txt) into lines

Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.

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
    SplitTextDocumentByLinesResult result = apiInstance.splitDocumentTxtByLine(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SplitDocumentApi#splitDocumentTxtByLine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**SplitTextDocumentByLinesResult**](SplitTextDocumentByLinesResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="splitDocumentTxtByString"></a>
# **splitDocumentTxtByString**
> SplitTextDocumentByStringResult splitDocumentTxtByString(inputFile, splitDelimiter, skipEmptyElements)

Split a single Text file (txt) by a string delimiter

Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.

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
String splitDelimiter = "splitDelimiter_example"; // String | Required; String to split up the input file on
Boolean skipEmptyElements = true; // Boolean | Optional; If true, empty elements will be skipped in the output
try {
    SplitTextDocumentByStringResult result = apiInstance.splitDocumentTxtByString(inputFile, splitDelimiter, skipEmptyElements);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SplitDocumentApi#splitDocumentTxtByString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **splitDelimiter** | **String**| Required; String to split up the input file on |
 **skipEmptyElements** | **Boolean**| Optional; If true, empty elements will be skipped in the output | [optional]

### Return type

[**SplitTextDocumentByStringResult**](SplitTextDocumentByStringResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="splitDocumentXlsx"></a>
# **splitDocumentXlsx**
> SplitXlsxWorksheetResult splitDocumentXlsx(inputFile, returnDocumentContents)

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
Boolean returnDocumentContents = true; // Boolean | Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true.
try {
    SplitXlsxWorksheetResult result = apiInstance.splitDocumentXlsx(inputFile, returnDocumentContents);
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
 **returnDocumentContents** | **Boolean**| Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true. | [optional]

### Return type

[**SplitXlsxWorksheetResult**](SplitXlsxWorksheetResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

