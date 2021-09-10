# TransformDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transformDocumentDocxReplace**](TransformDocumentApi.md#transformDocumentDocxReplace) | **POST** /convert/transform/docx/replace-all | Replace string in Word DOCX document, return result
[**transformDocumentDocxReplaceEditSession**](TransformDocumentApi.md#transformDocumentDocxReplaceEditSession) | **POST** /convert/transform/docx/replace-all/edit-session | Replace string in Word DOCX document, return edit session
[**transformDocumentDocxTableFillIn**](TransformDocumentApi.md#transformDocumentDocxTableFillIn) | **POST** /convert/transform/docx/table/fill/data | Fill in data in a table in a Word DOCX document, return result
[**transformDocumentDocxTableFillInEditSession**](TransformDocumentApi.md#transformDocumentDocxTableFillInEditSession) | **POST** /convert/transform/docx/table/fill/data/edit-session | Fill in data in a table in a Word DOCX document, return edit session
[**transformDocumentDocxTableFillInMulti**](TransformDocumentApi.md#transformDocumentDocxTableFillInMulti) | **POST** /convert/transform/docx/table/fill/data/multi | Fill in data in multiple tables in a Word DOCX document, return result
[**transformDocumentPptxReplace**](TransformDocumentApi.md#transformDocumentPptxReplace) | **POST** /convert/transform/pptx/replace-all | Replace string in PowerPoint PPTX presentation, return result


<a name="transformDocumentDocxReplace"></a>
# **transformDocumentDocxReplace**
> byte[] transformDocumentDocxReplace(matchString, replaceString, inputFile, inputFileUrl, matchCase)

Replace string in Word DOCX document, return result

Replace all instances of a string in an Office Word Document (docx)

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TransformDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TransformDocumentApi apiInstance = new TransformDocumentApi();
String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
String replaceString = "replaceString_example"; // String | String to replace the matched values with
File inputFile = new File("/path/to/file.txt"); // File | Optional: Input file to perform the operation on.
String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
try {
    byte[] result = apiInstance.transformDocumentDocxReplace(matchString, replaceString, inputFile, inputFileUrl, matchCase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchString** | **String**| String to search for and match against, to be replaced |
 **replaceString** | **String**| String to replace the matched values with |
 **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional]
 **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional]
 **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="transformDocumentDocxReplaceEditSession"></a>
# **transformDocumentDocxReplaceEditSession**
> DocumentTransformEditSession transformDocumentDocxReplaceEditSession(matchString, replaceString, inputFile, inputFileUrl, matchCase)

Replace string in Word DOCX document, return edit session

Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TransformDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TransformDocumentApi apiInstance = new TransformDocumentApi();
String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
String replaceString = "replaceString_example"; // String | String to replace the matched values with
File inputFile = new File("/path/to/file.txt"); // File | Optional: Input file to perform the operation on.
String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
try {
    DocumentTransformEditSession result = apiInstance.transformDocumentDocxReplaceEditSession(matchString, replaceString, inputFile, inputFileUrl, matchCase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxReplaceEditSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchString** | **String**| String to search for and match against, to be replaced |
 **replaceString** | **String**| String to replace the matched values with |
 **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional]
 **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional]
 **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional]

### Return type

[**DocumentTransformEditSession**](DocumentTransformEditSession.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="transformDocumentDocxTableFillIn"></a>
# **transformDocumentDocxTableFillIn**
> byte[] transformDocumentDocxTableFillIn(request)

Fill in data in a table in a Word DOCX document, return result

Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TransformDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TransformDocumentApi apiInstance = new TransformDocumentApi();
DocxTableTableFillRequest request = new DocxTableTableFillRequest(); // DocxTableTableFillRequest | 
try {
    byte[] result = apiInstance.transformDocumentDocxTableFillIn(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillIn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DocxTableTableFillRequest**](DocxTableTableFillRequest.md)|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="transformDocumentDocxTableFillInEditSession"></a>
# **transformDocumentDocxTableFillInEditSession**
> DocumentTransformEditSession transformDocumentDocxTableFillInEditSession(request)

Fill in data in a table in a Word DOCX document, return edit session

Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TransformDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TransformDocumentApi apiInstance = new TransformDocumentApi();
DocxTableTableFillRequest request = new DocxTableTableFillRequest(); // DocxTableTableFillRequest | 
try {
    DocumentTransformEditSession result = apiInstance.transformDocumentDocxTableFillInEditSession(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillInEditSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DocxTableTableFillRequest**](DocxTableTableFillRequest.md)|  |

### Return type

[**DocumentTransformEditSession**](DocumentTransformEditSession.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="transformDocumentDocxTableFillInMulti"></a>
# **transformDocumentDocxTableFillInMulti**
> byte[] transformDocumentDocxTableFillInMulti(request)

Fill in data in multiple tables in a Word DOCX document, return result

Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TransformDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TransformDocumentApi apiInstance = new TransformDocumentApi();
DocxTableTableFillMultiRequest request = new DocxTableTableFillMultiRequest(); // DocxTableTableFillMultiRequest | 
try {
    byte[] result = apiInstance.transformDocumentDocxTableFillInMulti(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformDocumentApi#transformDocumentDocxTableFillInMulti");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DocxTableTableFillMultiRequest**](DocxTableTableFillMultiRequest.md)|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="transformDocumentPptxReplace"></a>
# **transformDocumentPptxReplace**
> byte[] transformDocumentPptxReplace(matchString, replaceString, inputFile, inputFileUrl, matchCase)

Replace string in PowerPoint PPTX presentation, return result

Replace all instances of a string in an Office PowerPoint Document (pptx)

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.TransformDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

TransformDocumentApi apiInstance = new TransformDocumentApi();
String matchString = "matchString_example"; // String | String to search for and match against, to be replaced
String replaceString = "replaceString_example"; // String | String to replace the matched values with
File inputFile = new File("/path/to/file.txt"); // File | Optional: Input file to perform the operation on.
String inputFileUrl = "inputFileUrl_example"; // String | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
Boolean matchCase = true; // Boolean | Optional: True if the case should be matched, false for case insensitive match. Default is false.
try {
    byte[] result = apiInstance.transformDocumentPptxReplace(matchString, replaceString, inputFile, inputFileUrl, matchCase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformDocumentApi#transformDocumentPptxReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchString** | **String**| String to search for and match against, to be replaced |
 **replaceString** | **String**| String to replace the matched values with |
 **inputFile** | **File**| Optional: Input file to perform the operation on. | [optional]
 **inputFileUrl** | **String**| Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). | [optional]
 **matchCase** | **Boolean**| Optional: True if the case should be matched, false for case insensitive match. Default is false. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

