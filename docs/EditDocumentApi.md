# EditDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editDocumentBeginEditing**](EditDocumentApi.md#editDocumentBeginEditing) | **POST** /convert/edit/begin-editing | Begin editing a document
[**editDocumentDocxBody**](EditDocumentApi.md#editDocumentDocxBody) | **POST** /convert/edit/docx/get-body | Get body from a Word DOCX document
[**editDocumentDocxGetHeadersAndFooters**](EditDocumentApi.md#editDocumentDocxGetHeadersAndFooters) | **POST** /convert/edit/docx/get-headers-and-footers | Get content of a footer from a Word DOCX document
[**editDocumentDocxGetImages**](EditDocumentApi.md#editDocumentDocxGetImages) | **POST** /convert/edit/docx/get-images | Get images from a Word DOCX document
[**editDocumentDocxGetSections**](EditDocumentApi.md#editDocumentDocxGetSections) | **POST** /convert/edit/docx/get-sections | Get sections from a Word DOCX document
[**editDocumentDocxGetStyles**](EditDocumentApi.md#editDocumentDocxGetStyles) | **POST** /convert/edit/docx/get-styles | Get styles from a Word DOCX document
[**editDocumentDocxGetTables**](EditDocumentApi.md#editDocumentDocxGetTables) | **POST** /convert/edit/docx/get-tables | Get tables in Word DOCX document
[**editDocumentDocxInsertImage**](EditDocumentApi.md#editDocumentDocxInsertImage) | **POST** /convert/edit/docx/insert-image | Insert image into a Word DOCX document
[**editDocumentDocxInsertParagraph**](EditDocumentApi.md#editDocumentDocxInsertParagraph) | **POST** /convert/edit/docx/insert-paragraph | Insert a new paragraph into a Word DOCX document
[**editDocumentDocxInsertTable**](EditDocumentApi.md#editDocumentDocxInsertTable) | **POST** /convert/edit/docx/insert-table | Insert a new table into a Word DOCX document
[**editDocumentDocxRemoveHeadersAndFooters**](EditDocumentApi.md#editDocumentDocxRemoveHeadersAndFooters) | **POST** /convert/edit/docx/remove-headers-and-footers | Remove headers and footers from Word DOCX document
[**editDocumentDocxRemoveObject**](EditDocumentApi.md#editDocumentDocxRemoveObject) | **POST** /convert/edit/docx/remove-object | Delete any object in a Word DOCX document
[**editDocumentDocxReplace**](EditDocumentApi.md#editDocumentDocxReplace) | **POST** /convert/edit/docx/replace-all | Replace string in Word DOCX document
[**editDocumentDocxSetFooter**](EditDocumentApi.md#editDocumentDocxSetFooter) | **POST** /convert/edit/docx/set-footer | Set the footer in a Word DOCX document
[**editDocumentDocxSetFooterAddPageNumber**](EditDocumentApi.md#editDocumentDocxSetFooterAddPageNumber) | **POST** /convert/edit/docx/set-footer/add-page-number | Add page number to footer in a Word DOCX document
[**editDocumentDocxSetHeader**](EditDocumentApi.md#editDocumentDocxSetHeader) | **POST** /convert/edit/docx/set-header | Set the header in a Word DOCX document
[**editDocumentFinishEditing**](EditDocumentApi.md#editDocumentFinishEditing) | **POST** /convert/edit/finish-editing | Download result from document editing
[**editDocumentPptxReplace**](EditDocumentApi.md#editDocumentPptxReplace) | **POST** /convert/edit/pptx/replace-all | Replace string in PowerPoint PPTX presentation
[**editDocumentXlsxGetColumns**](EditDocumentApi.md#editDocumentXlsxGetColumns) | **POST** /convert/edit/xlsx/get-columns | Get rows and cells from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetImages**](EditDocumentApi.md#editDocumentXlsxGetImages) | **POST** /convert/edit/xlsx/get-images | Get images from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetRowsAndCells**](EditDocumentApi.md#editDocumentXlsxGetRowsAndCells) | **POST** /convert/edit/xlsx/get-rows-and-cells | Get rows and cells from a Word XLSX spreadsheet, worksheet
[**editDocumentXlsxGetStyles**](EditDocumentApi.md#editDocumentXlsxGetStyles) | **POST** /convert/edit/xlsx/get-styles | Get styles from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetWorksheets**](EditDocumentApi.md#editDocumentXlsxGetWorksheets) | **POST** /convert/edit/xlsx/get-worksheets | Get worksheets from a Excel XLSX spreadsheet
[**editDocumentXlsxInsertWorksheet**](EditDocumentApi.md#editDocumentXlsxInsertWorksheet) | **POST** /convert/edit/xlsx/insert-worksheet | Insert a new worksheet into an Excel XLSX spreadsheet


<a name="editDocumentBeginEditing"></a>
# **editDocumentBeginEditing**
> String editDocumentBeginEditing(inputFile)

Begin editing a document

Uploads a document to Cloudmersive to begin a series of one or more editing operations

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    String result = apiInstance.editDocumentBeginEditing(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentBeginEditing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**String**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxBody"></a>
# **editDocumentDocxBody**
> GetDocxBodyResponse editDocumentDocxBody(reqConfig)

Get body from a Word DOCX document

Returns the body defined in the Word Document (DOCX) format file; this is the main content part of a DOCX document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetDocxBodyRequest reqConfig = new GetDocxBodyRequest(); // GetDocxBodyRequest | Document input request
try {
    GetDocxBodyResponse result = apiInstance.editDocumentDocxBody(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxBody");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxBodyRequest**](GetDocxBodyRequest.md)| Document input request |

### Return type

[**GetDocxBodyResponse**](GetDocxBodyResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetHeadersAndFooters"></a>
# **editDocumentDocxGetHeadersAndFooters**
> GetDocxHeadersAndFootersResponse editDocumentDocxGetHeadersAndFooters(reqConfig)

Get content of a footer from a Word DOCX document

Returns the footer content from a Word Document (DOCX) format file

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetDocxHeadersAndFootersRequest reqConfig = new GetDocxHeadersAndFootersRequest(); // GetDocxHeadersAndFootersRequest | Document input request
try {
    GetDocxHeadersAndFootersResponse result = apiInstance.editDocumentDocxGetHeadersAndFooters(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetHeadersAndFooters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxHeadersAndFootersRequest**](GetDocxHeadersAndFootersRequest.md)| Document input request |

### Return type

[**GetDocxHeadersAndFootersResponse**](GetDocxHeadersAndFootersResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetImages"></a>
# **editDocumentDocxGetImages**
> GetDocxImagesResponse editDocumentDocxGetImages(reqConfig)

Get images from a Word DOCX document

Returns the images defined in the Word Document (DOCX) format file

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetDocxImagesRequest reqConfig = new GetDocxImagesRequest(); // GetDocxImagesRequest | Document input request
try {
    GetDocxImagesResponse result = apiInstance.editDocumentDocxGetImages(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxImagesRequest**](GetDocxImagesRequest.md)| Document input request |

### Return type

[**GetDocxImagesResponse**](GetDocxImagesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetSections"></a>
# **editDocumentDocxGetSections**
> GetDocxSectionsResponse editDocumentDocxGetSections(reqConfig)

Get sections from a Word DOCX document

Returns the sections defined in the Word Document (DOCX) format file

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetDocxSectionsRequest reqConfig = new GetDocxSectionsRequest(); // GetDocxSectionsRequest | Document input request
try {
    GetDocxSectionsResponse result = apiInstance.editDocumentDocxGetSections(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxSectionsRequest**](GetDocxSectionsRequest.md)| Document input request |

### Return type

[**GetDocxSectionsResponse**](GetDocxSectionsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetStyles"></a>
# **editDocumentDocxGetStyles**
> GetDocxStylesResponse editDocumentDocxGetStyles(reqConfig)

Get styles from a Word DOCX document

Returns the styles defined in the Word Document (DOCX) format file

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetDocxStylesRequest reqConfig = new GetDocxStylesRequest(); // GetDocxStylesRequest | Document input request
try {
    GetDocxStylesResponse result = apiInstance.editDocumentDocxGetStyles(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetStyles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxStylesRequest**](GetDocxStylesRequest.md)| Document input request |

### Return type

[**GetDocxStylesResponse**](GetDocxStylesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetTables"></a>
# **editDocumentDocxGetTables**
> GetDocxTablesResponse editDocumentDocxGetTables(reqConfig)

Get tables in Word DOCX document

Returns all the table objects in an Office Word Document (docx)

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetDocxTablesRequest reqConfig = new GetDocxTablesRequest(); // GetDocxTablesRequest | Document input request
try {
    GetDocxTablesResponse result = apiInstance.editDocumentDocxGetTables(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetTables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxTablesRequest**](GetDocxTablesRequest.md)| Document input request |

### Return type

[**GetDocxTablesResponse**](GetDocxTablesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxInsertImage"></a>
# **editDocumentDocxInsertImage**
> DocxInsertImageResponse editDocumentDocxInsertImage(reqConfig)

Insert image into a Word DOCX document

Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
DocxInsertImageRequest reqConfig = new DocxInsertImageRequest(); // DocxInsertImageRequest | Document input request
try {
    DocxInsertImageResponse result = apiInstance.editDocumentDocxInsertImage(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxInsertImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DocxInsertImageRequest**](DocxInsertImageRequest.md)| Document input request |

### Return type

[**DocxInsertImageResponse**](DocxInsertImageResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxInsertParagraph"></a>
# **editDocumentDocxInsertParagraph**
> InsertDocxInsertParagraphResponse editDocumentDocxInsertParagraph(reqConfig)

Insert a new paragraph into a Word DOCX document

Adds a new paragraph into a DOCX and returns the result.  You can insert at the beginning/end of a document, or before/after an existing object using its Path (location within the document).  Call Finish Editing on the output URL to complete the operation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
InsertDocxInsertParagraphRequest reqConfig = new InsertDocxInsertParagraphRequest(); // InsertDocxInsertParagraphRequest | Document input request
try {
    InsertDocxInsertParagraphResponse result = apiInstance.editDocumentDocxInsertParagraph(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxInsertParagraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**InsertDocxInsertParagraphRequest**](InsertDocxInsertParagraphRequest.md)| Document input request |

### Return type

[**InsertDocxInsertParagraphResponse**](InsertDocxInsertParagraphResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxInsertTable"></a>
# **editDocumentDocxInsertTable**
> InsertDocxTablesResponse editDocumentDocxInsertTable(reqConfig)

Insert a new table into a Word DOCX document

Adds a new table into a DOCX and returns the result.  Call Finish Editing on the output URL to complete the operation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
InsertDocxTablesRequest reqConfig = new InsertDocxTablesRequest(); // InsertDocxTablesRequest | Document input request
try {
    InsertDocxTablesResponse result = apiInstance.editDocumentDocxInsertTable(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxInsertTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**InsertDocxTablesRequest**](InsertDocxTablesRequest.md)| Document input request |

### Return type

[**InsertDocxTablesResponse**](InsertDocxTablesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxRemoveHeadersAndFooters"></a>
# **editDocumentDocxRemoveHeadersAndFooters**
> RemoveDocxHeadersAndFootersResponse editDocumentDocxRemoveHeadersAndFooters(reqConfig)

Remove headers and footers from Word DOCX document

Remove all headers, or footers, or both from a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
RemoveDocxHeadersAndFootersRequest reqConfig = new RemoveDocxHeadersAndFootersRequest(); // RemoveDocxHeadersAndFootersRequest | Document input request
try {
    RemoveDocxHeadersAndFootersResponse result = apiInstance.editDocumentDocxRemoveHeadersAndFooters(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxRemoveHeadersAndFooters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**RemoveDocxHeadersAndFootersRequest**](RemoveDocxHeadersAndFootersRequest.md)| Document input request |

### Return type

[**RemoveDocxHeadersAndFootersResponse**](RemoveDocxHeadersAndFootersResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxRemoveObject"></a>
# **editDocumentDocxRemoveObject**
> DocxRemoveObjectResponse editDocumentDocxRemoveObject(reqConfig)

Delete any object in a Word DOCX document

Delete any object, such as a paragraph, table, image, etc. from a Word Document (DOCX).  Pass in the Path of the object you would like to delete.  You can call other functions such as Get-Tables, Get-Images, Get-Body, etc. to get the paths of the objects in the document.  Call Finish Editing on the output URL to complete the operation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
DocxRemoveObjectRequest reqConfig = new DocxRemoveObjectRequest(); // DocxRemoveObjectRequest | Document input request
try {
    DocxRemoveObjectResponse result = apiInstance.editDocumentDocxRemoveObject(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxRemoveObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DocxRemoveObjectRequest**](DocxRemoveObjectRequest.md)| Document input request |

### Return type

[**DocxRemoveObjectResponse**](DocxRemoveObjectResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxReplace"></a>
# **editDocumentDocxReplace**
> byte[] editDocumentDocxReplace(reqConfig)

Replace string in Word DOCX document

Replace all instances of a string in an Office Word Document (docx)

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
ReplaceStringRequest reqConfig = new ReplaceStringRequest(); // ReplaceStringRequest | Document string replacement configuration input
try {
    byte[] result = apiInstance.editDocumentDocxReplace(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**ReplaceStringRequest**](ReplaceStringRequest.md)| Document string replacement configuration input |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDocumentDocxSetFooter"></a>
# **editDocumentDocxSetFooter**
> DocxSetFooterResponse editDocumentDocxSetFooter(reqConfig)

Set the footer in a Word DOCX document

Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
DocxSetFooterRequest reqConfig = new DocxSetFooterRequest(); // DocxSetFooterRequest | Document input request
try {
    DocxSetFooterResponse result = apiInstance.editDocumentDocxSetFooter(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxSetFooter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DocxSetFooterRequest**](DocxSetFooterRequest.md)| Document input request |

### Return type

[**DocxSetFooterResponse**](DocxSetFooterResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxSetFooterAddPageNumber"></a>
# **editDocumentDocxSetFooterAddPageNumber**
> DocxSetFooterResponse editDocumentDocxSetFooterAddPageNumber(reqConfig)

Add page number to footer in a Word DOCX document

Set the footer in a Word Document (DOCX) to contain a page number.  Call Finish Editing on the output URL to complete the operation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
DocxSetFooterAddPageNumberRequest reqConfig = new DocxSetFooterAddPageNumberRequest(); // DocxSetFooterAddPageNumberRequest | Document input request
try {
    DocxSetFooterResponse result = apiInstance.editDocumentDocxSetFooterAddPageNumber(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxSetFooterAddPageNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DocxSetFooterAddPageNumberRequest**](DocxSetFooterAddPageNumberRequest.md)| Document input request |

### Return type

[**DocxSetFooterResponse**](DocxSetFooterResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxSetHeader"></a>
# **editDocumentDocxSetHeader**
> DocxSetHeaderResponse editDocumentDocxSetHeader(reqConfig)

Set the header in a Word DOCX document

Set the header in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
DocxSetHeaderRequest reqConfig = new DocxSetHeaderRequest(); // DocxSetHeaderRequest | Document input request
try {
    DocxSetHeaderResponse result = apiInstance.editDocumentDocxSetHeader(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxSetHeader");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DocxSetHeaderRequest**](DocxSetHeaderRequest.md)| Document input request |

### Return type

[**DocxSetHeaderResponse**](DocxSetHeaderResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentFinishEditing"></a>
# **editDocumentFinishEditing**
> byte[] editDocumentFinishEditing(reqConfig)

Download result from document editing

Once done editing a document, download the result.  Begin editing a document by calling begin-editing, then perform operations, then call finish-editing to get the result.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
FinishEditingRequest reqConfig = new FinishEditingRequest(); // FinishEditingRequest | Cloudmersive Document URL to complete editing on
try {
    byte[] result = apiInstance.editDocumentFinishEditing(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentFinishEditing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**FinishEditingRequest**](FinishEditingRequest.md)| Cloudmersive Document URL to complete editing on |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDocumentPptxReplace"></a>
# **editDocumentPptxReplace**
> byte[] editDocumentPptxReplace(reqConfig)

Replace string in PowerPoint PPTX presentation

Replace all instances of a string in an Office PowerPoint Document (pptx)

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
ReplaceStringRequest reqConfig = new ReplaceStringRequest(); // ReplaceStringRequest | Replacement document configuration input
try {
    byte[] result = apiInstance.editDocumentPptxReplace(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentPptxReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**ReplaceStringRequest**](ReplaceStringRequest.md)| Replacement document configuration input |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDocumentXlsxGetColumns"></a>
# **editDocumentXlsxGetColumns**
> GetXlsxColumnsResponse editDocumentXlsxGetColumns(input)

Get rows and cells from a Excel XLSX spreadsheet, worksheet

Returns the rows and cells defined in the Excel Spreadsheet worksheet

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetXlsxColumnsRequest input = new GetXlsxColumnsRequest(); // GetXlsxColumnsRequest | Document input request
try {
    GetXlsxColumnsResponse result = apiInstance.editDocumentXlsxGetColumns(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetXlsxColumnsRequest**](GetXlsxColumnsRequest.md)| Document input request |

### Return type

[**GetXlsxColumnsResponse**](GetXlsxColumnsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxGetImages"></a>
# **editDocumentXlsxGetImages**
> GetXlsxImagesResponse editDocumentXlsxGetImages(input)

Get images from a Excel XLSX spreadsheet, worksheet

Returns the images defined in the Excel Spreadsheet worksheet

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetXlsxImagesRequest input = new GetXlsxImagesRequest(); // GetXlsxImagesRequest | Document input request
try {
    GetXlsxImagesResponse result = apiInstance.editDocumentXlsxGetImages(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetXlsxImagesRequest**](GetXlsxImagesRequest.md)| Document input request |

### Return type

[**GetXlsxImagesResponse**](GetXlsxImagesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxGetRowsAndCells"></a>
# **editDocumentXlsxGetRowsAndCells**
> GetXlsxRowsAndCellsResponse editDocumentXlsxGetRowsAndCells(input)

Get rows and cells from a Word XLSX spreadsheet, worksheet

Returns the rows and cells defined in the Excel Spreadsheet worksheet

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetXlsxRowsAndCellsRequest input = new GetXlsxRowsAndCellsRequest(); // GetXlsxRowsAndCellsRequest | Document input request
try {
    GetXlsxRowsAndCellsResponse result = apiInstance.editDocumentXlsxGetRowsAndCells(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetRowsAndCells");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetXlsxRowsAndCellsRequest**](GetXlsxRowsAndCellsRequest.md)| Document input request |

### Return type

[**GetXlsxRowsAndCellsResponse**](GetXlsxRowsAndCellsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxGetStyles"></a>
# **editDocumentXlsxGetStyles**
> GetXlsxStylesResponse editDocumentXlsxGetStyles(input)

Get styles from a Excel XLSX spreadsheet, worksheet

Returns the style defined in the Excel Spreadsheet

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetXlsxStylesRequest input = new GetXlsxStylesRequest(); // GetXlsxStylesRequest | Document input request
try {
    GetXlsxStylesResponse result = apiInstance.editDocumentXlsxGetStyles(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetStyles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetXlsxStylesRequest**](GetXlsxStylesRequest.md)| Document input request |

### Return type

[**GetXlsxStylesResponse**](GetXlsxStylesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxGetWorksheets"></a>
# **editDocumentXlsxGetWorksheets**
> GetXlsxWorksheetsResponse editDocumentXlsxGetWorksheets(input)

Get worksheets from a Excel XLSX spreadsheet

Returns the worksheets (tabs) defined in the Excel Spreadsheet (XLSX) format file

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
GetXlsxWorksheetsRequest input = new GetXlsxWorksheetsRequest(); // GetXlsxWorksheetsRequest | Document input request
try {
    GetXlsxWorksheetsResponse result = apiInstance.editDocumentXlsxGetWorksheets(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetWorksheets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetXlsxWorksheetsRequest**](GetXlsxWorksheetsRequest.md)| Document input request |

### Return type

[**GetXlsxWorksheetsResponse**](GetXlsxWorksheetsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxInsertWorksheet"></a>
# **editDocumentXlsxInsertWorksheet**
> InsertXlsxWorksheetResponse editDocumentXlsxInsertWorksheet(input)

Insert a new worksheet into an Excel XLSX spreadsheet

Inserts a new worksheet into an Excel Spreadsheet

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditDocumentApi apiInstance = new EditDocumentApi();
InsertXlsxWorksheetRequest input = new InsertXlsxWorksheetRequest(); // InsertXlsxWorksheetRequest | Document input request
try {
    InsertXlsxWorksheetResponse result = apiInstance.editDocumentXlsxInsertWorksheet(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxInsertWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**InsertXlsxWorksheetRequest**](InsertXlsxWorksheetRequest.md)| Document input request |

### Return type

[**InsertXlsxWorksheetResponse**](InsertXlsxWorksheetResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

