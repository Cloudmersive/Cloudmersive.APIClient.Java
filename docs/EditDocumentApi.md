# EditDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editDocumentBeginEditing**](EditDocumentApi.md#editDocumentBeginEditing) | **POST** /convert/edit/begin-editing | Begin editing a document
[**editDocumentDocxBody**](EditDocumentApi.md#editDocumentDocxBody) | **POST** /convert/edit/docx/get-body | Get body from a Word DOCX document
[**editDocumentDocxCreateBlankDocument**](EditDocumentApi.md#editDocumentDocxCreateBlankDocument) | **POST** /convert/edit/docx/create/blank | Create a blank Word DOCX document
[**editDocumentDocxDeletePages**](EditDocumentApi.md#editDocumentDocxDeletePages) | **POST** /convert/edit/docx/delete-pages | Delete, remove pages from a Word DOCX document
[**editDocumentDocxDeleteTableRow**](EditDocumentApi.md#editDocumentDocxDeleteTableRow) | **POST** /convert/edit/docx/delete-table-row | Deletes a table row in an existing table in a Word DOCX document
[**editDocumentDocxDeleteTableRowRange**](EditDocumentApi.md#editDocumentDocxDeleteTableRowRange) | **POST** /convert/edit/docx/delete-table-row/range | Deletes a range of multiple table rows in an existing table in a Word DOCX document
[**editDocumentDocxGetComments**](EditDocumentApi.md#editDocumentDocxGetComments) | **POST** /convert/edit/docx/get-comments/flat-list | Get comments from a Word DOCX document as a flat list
[**editDocumentDocxGetCommentsHierarchical**](EditDocumentApi.md#editDocumentDocxGetCommentsHierarchical) | **POST** /convert/edit/docx/get-comments/hierarchical | Get comments from a Word DOCX document hierarchically
[**editDocumentDocxGetHeadersAndFooters**](EditDocumentApi.md#editDocumentDocxGetHeadersAndFooters) | **POST** /convert/edit/docx/get-headers-and-footers | Get content of a footer from a Word DOCX document
[**editDocumentDocxGetImages**](EditDocumentApi.md#editDocumentDocxGetImages) | **POST** /convert/edit/docx/get-images | Get images from a Word DOCX document
[**editDocumentDocxGetSections**](EditDocumentApi.md#editDocumentDocxGetSections) | **POST** /convert/edit/docx/get-sections | Get sections from a Word DOCX document
[**editDocumentDocxGetStyles**](EditDocumentApi.md#editDocumentDocxGetStyles) | **POST** /convert/edit/docx/get-styles | Get styles from a Word DOCX document
[**editDocumentDocxGetTableByIndex**](EditDocumentApi.md#editDocumentDocxGetTableByIndex) | **POST** /convert/edit/docx/get-table/by-index | Get a specific table by index in a Word DOCX document
[**editDocumentDocxGetTableRow**](EditDocumentApi.md#editDocumentDocxGetTableRow) | **POST** /convert/edit/docx/get-table-row | Gets the contents of an existing table row in an existing table in a Word DOCX document
[**editDocumentDocxGetTables**](EditDocumentApi.md#editDocumentDocxGetTables) | **POST** /convert/edit/docx/get-tables | Get all tables in Word DOCX document
[**editDocumentDocxInsertCommentOnParagraph**](EditDocumentApi.md#editDocumentDocxInsertCommentOnParagraph) | **POST** /convert/edit/docx/insert-comment/on/paragraph | Insert a new comment into a Word DOCX document attached to a paragraph
[**editDocumentDocxInsertImage**](EditDocumentApi.md#editDocumentDocxInsertImage) | **POST** /convert/edit/docx/insert-image | Insert image into a Word DOCX document
[**editDocumentDocxInsertParagraph**](EditDocumentApi.md#editDocumentDocxInsertParagraph) | **POST** /convert/edit/docx/insert-paragraph | Insert a new paragraph into a Word DOCX document
[**editDocumentDocxInsertTable**](EditDocumentApi.md#editDocumentDocxInsertTable) | **POST** /convert/edit/docx/insert-table | Insert a new table into a Word DOCX document
[**editDocumentDocxInsertTableRow**](EditDocumentApi.md#editDocumentDocxInsertTableRow) | **POST** /convert/edit/docx/insert-table-row | Insert a new row into an existing table in a Word DOCX document
[**editDocumentDocxPages**](EditDocumentApi.md#editDocumentDocxPages) | **POST** /convert/edit/docx/get-pages | Get pages and content from a Word DOCX document
[**editDocumentDocxRemoveHeadersAndFooters**](EditDocumentApi.md#editDocumentDocxRemoveHeadersAndFooters) | **POST** /convert/edit/docx/remove-headers-and-footers | Remove headers and footers from Word DOCX document
[**editDocumentDocxRemoveObject**](EditDocumentApi.md#editDocumentDocxRemoveObject) | **POST** /convert/edit/docx/remove-object | Delete any object in a Word DOCX document
[**editDocumentDocxReplace**](EditDocumentApi.md#editDocumentDocxReplace) | **POST** /convert/edit/docx/replace-all | Replace string in Word DOCX document
[**editDocumentDocxSetFooter**](EditDocumentApi.md#editDocumentDocxSetFooter) | **POST** /convert/edit/docx/set-footer | Set the footer in a Word DOCX document
[**editDocumentDocxSetFooterAddPageNumber**](EditDocumentApi.md#editDocumentDocxSetFooterAddPageNumber) | **POST** /convert/edit/docx/set-footer/add-page-number | Add page number to footer in a Word DOCX document
[**editDocumentDocxSetHeader**](EditDocumentApi.md#editDocumentDocxSetHeader) | **POST** /convert/edit/docx/set-header | Set the header in a Word DOCX document
[**editDocumentDocxUpdateTableCell**](EditDocumentApi.md#editDocumentDocxUpdateTableCell) | **POST** /convert/edit/docx/update-table-cell | Update, set contents of a table cell in an existing table in a Word DOCX document
[**editDocumentDocxUpdateTableRow**](EditDocumentApi.md#editDocumentDocxUpdateTableRow) | **POST** /convert/edit/docx/update-table-row | Update, set contents of a table row in an existing table in a Word DOCX document
[**editDocumentFinishEditing**](EditDocumentApi.md#editDocumentFinishEditing) | **POST** /convert/edit/finish-editing | Finish editing document, and download result from document editing
[**editDocumentPptxDeleteSlides**](EditDocumentApi.md#editDocumentPptxDeleteSlides) | **POST** /convert/edit/pptx/delete-slides | Delete, remove slides from a PowerPoint PPTX presentation document
[**editDocumentPptxReplace**](EditDocumentApi.md#editDocumentPptxReplace) | **POST** /convert/edit/pptx/replace-all | Replace string in PowerPoint PPTX presentation
[**editDocumentXlsxClearCellByIndex**](EditDocumentApi.md#editDocumentXlsxClearCellByIndex) | **POST** /convert/edit/xlsx/clear-cell/by-index | Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
[**editDocumentXlsxCreateBlankSpreadsheet**](EditDocumentApi.md#editDocumentXlsxCreateBlankSpreadsheet) | **POST** /convert/edit/xlsx/create/blank | Create a blank Excel XLSX spreadsheet
[**editDocumentXlsxCreateSpreadsheetFromData**](EditDocumentApi.md#editDocumentXlsxCreateSpreadsheetFromData) | **POST** /convert/edit/xlsx/create/from/data | Create a new Excel XLSX spreadsheet from column and row data
[**editDocumentXlsxDeleteWorksheet**](EditDocumentApi.md#editDocumentXlsxDeleteWorksheet) | **POST** /convert/edit/xlsx/delete-worksheet | Delete, remove worksheet from an Excel XLSX spreadsheet document
[**editDocumentXlsxEnableSharedWorkbook**](EditDocumentApi.md#editDocumentXlsxEnableSharedWorkbook) | **POST** /convert/edit/xlsx/configuration/enable-shared-workbook | Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
[**editDocumentXlsxGetCellByIdentifier**](EditDocumentApi.md#editDocumentXlsxGetCellByIdentifier) | **POST** /convert/edit/xlsx/get-cell/by-identifier | Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
[**editDocumentXlsxGetCellByIndex**](EditDocumentApi.md#editDocumentXlsxGetCellByIndex) | **POST** /convert/edit/xlsx/get-cell/by-index | Get cell from an Excel XLSX spreadsheet, worksheet by index
[**editDocumentXlsxGetColumns**](EditDocumentApi.md#editDocumentXlsxGetColumns) | **POST** /convert/edit/xlsx/get-columns | Get columns from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetImages**](EditDocumentApi.md#editDocumentXlsxGetImages) | **POST** /convert/edit/xlsx/get-images | Get images from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetRowsAndCells**](EditDocumentApi.md#editDocumentXlsxGetRowsAndCells) | **POST** /convert/edit/xlsx/get-rows-and-cells | Get rows and cells from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetStyles**](EditDocumentApi.md#editDocumentXlsxGetStyles) | **POST** /convert/edit/xlsx/get-styles | Get styles from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetWorksheets**](EditDocumentApi.md#editDocumentXlsxGetWorksheets) | **POST** /convert/edit/xlsx/get-worksheets | Get worksheets from a Excel XLSX spreadsheet
[**editDocumentXlsxInsertWorksheet**](EditDocumentApi.md#editDocumentXlsxInsertWorksheet) | **POST** /convert/edit/xlsx/insert-worksheet | Insert a new worksheet into an Excel XLSX spreadsheet
[**editDocumentXlsxSetCellByIdentifier**](EditDocumentApi.md#editDocumentXlsxSetCellByIdentifier) | **POST** /convert/edit/xlsx/set-cell/by-identifier | Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier
[**editDocumentXlsxSetCellByIndex**](EditDocumentApi.md#editDocumentXlsxSetCellByIndex) | **POST** /convert/edit/xlsx/set-cell/by-index | Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index


<a name="editDocumentBeginEditing"></a>
# **editDocumentBeginEditing**
> String editDocumentBeginEditing(inputFile)

Begin editing a document

Uploads a document to Cloudmersive to begin a series of one or more editing operations.  To edit a document, first call Begin Editing on the document.  Then perform operations on the document using the secure URL returned from BeginEditing, such as Word DOCX Delete Pages and Insert Table.  Finally, perform finish editing on the URL to return the resulting edited document.  The editing URL is temporary and only stored in-memory cache, and will automatically expire from the cache after 30 minutes, and cannot be directly accessed.

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

<a name="editDocumentDocxCreateBlankDocument"></a>
# **editDocumentDocxCreateBlankDocument**
> CreateBlankDocxResponse editDocumentDocxCreateBlankDocument(input)

Create a blank Word DOCX document

Returns a blank Word DOCX Document format file.  The file is blank, with no contents.  Use additional editing commands such as Insert Paragraph or Insert Table or Insert Image to populate the document.

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
CreateBlankDocxRequest input = new CreateBlankDocxRequest(); // CreateBlankDocxRequest | Document input request
try {
    CreateBlankDocxResponse result = apiInstance.editDocumentDocxCreateBlankDocument(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxCreateBlankDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**CreateBlankDocxRequest**](CreateBlankDocxRequest.md)| Document input request |

### Return type

[**CreateBlankDocxResponse**](CreateBlankDocxResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxDeletePages"></a>
# **editDocumentDocxDeletePages**
> byte[] editDocumentDocxDeletePages(reqConfig)

Delete, remove pages from a Word DOCX document

Returns the edited Word Document in the Word Document (DOCX) format file with the specified pages removed

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
RemoveDocxPagesRequest reqConfig = new RemoveDocxPagesRequest(); // RemoveDocxPagesRequest | Document input request
try {
    byte[] result = apiInstance.editDocumentDocxDeletePages(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxDeletePages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**RemoveDocxPagesRequest**](RemoveDocxPagesRequest.md)| Document input request |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDocumentDocxDeleteTableRow"></a>
# **editDocumentDocxDeleteTableRow**
> DeleteDocxTableRowResponse editDocumentDocxDeleteTableRow(reqConfig)

Deletes a table row in an existing table in a Word DOCX document

Deletes an existing table row in a Word DOCX Document and returns the result.

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
DeleteDocxTableRowRequest reqConfig = new DeleteDocxTableRowRequest(); // DeleteDocxTableRowRequest | Document input request
try {
    DeleteDocxTableRowResponse result = apiInstance.editDocumentDocxDeleteTableRow(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxDeleteTableRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DeleteDocxTableRowRequest**](DeleteDocxTableRowRequest.md)| Document input request |

### Return type

[**DeleteDocxTableRowResponse**](DeleteDocxTableRowResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxDeleteTableRowRange"></a>
# **editDocumentDocxDeleteTableRowRange**
> DeleteDocxTableRowRangeResponse editDocumentDocxDeleteTableRowRange(reqConfig)

Deletes a range of multiple table rows in an existing table in a Word DOCX document

Deletes a range of 1 or more existing table rows in a Word DOCX Document and returns the result.

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
DeleteDocxTableRowRangeRequest reqConfig = new DeleteDocxTableRowRangeRequest(); // DeleteDocxTableRowRangeRequest | Document input request
try {
    DeleteDocxTableRowRangeResponse result = apiInstance.editDocumentDocxDeleteTableRowRange(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxDeleteTableRowRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DeleteDocxTableRowRangeRequest**](DeleteDocxTableRowRangeRequest.md)| Document input request |

### Return type

[**DeleteDocxTableRowRangeResponse**](DeleteDocxTableRowRangeResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetComments"></a>
# **editDocumentDocxGetComments**
> GetDocxCommentsResponse editDocumentDocxGetComments(reqConfig)

Get comments from a Word DOCX document as a flat list

Returns the comments and review annotations stored in the Word Document (DOCX) format file as a flattened list (not as a hierarchy of comments and replies).

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
GetDocxGetCommentsRequest reqConfig = new GetDocxGetCommentsRequest(); // GetDocxGetCommentsRequest | Document input request
try {
    GetDocxCommentsResponse result = apiInstance.editDocumentDocxGetComments(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxGetCommentsRequest**](GetDocxGetCommentsRequest.md)| Document input request |

### Return type

[**GetDocxCommentsResponse**](GetDocxCommentsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetCommentsHierarchical"></a>
# **editDocumentDocxGetCommentsHierarchical**
> GetDocxCommentsHierarchicalResponse editDocumentDocxGetCommentsHierarchical(reqConfig)

Get comments from a Word DOCX document hierarchically

Returns the comments and review annotations stored in the Word Document (DOCX) format file hierarchically, where reply comments are nested as children under top-level comments in the results returned.

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
GetDocxGetCommentsHierarchicalRequest reqConfig = new GetDocxGetCommentsHierarchicalRequest(); // GetDocxGetCommentsHierarchicalRequest | Document input request
try {
    GetDocxCommentsHierarchicalResponse result = apiInstance.editDocumentDocxGetCommentsHierarchical(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetCommentsHierarchical");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxGetCommentsHierarchicalRequest**](GetDocxGetCommentsHierarchicalRequest.md)| Document input request |

### Return type

[**GetDocxCommentsHierarchicalResponse**](GetDocxCommentsHierarchicalResponse.md)

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

<a name="editDocumentDocxGetTableByIndex"></a>
# **editDocumentDocxGetTableByIndex**
> GetDocxTableByIndexResponse editDocumentDocxGetTableByIndex(reqConfig)

Get a specific table by index in a Word DOCX document

Returns the specific table object by its 0-based index in an Office Word Document (DOCX)

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
GetDocxTableByIndexRequest reqConfig = new GetDocxTableByIndexRequest(); // GetDocxTableByIndexRequest | Document input request
try {
    GetDocxTableByIndexResponse result = apiInstance.editDocumentDocxGetTableByIndex(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetTableByIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxTableByIndexRequest**](GetDocxTableByIndexRequest.md)| Document input request |

### Return type

[**GetDocxTableByIndexResponse**](GetDocxTableByIndexResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetTableRow"></a>
# **editDocumentDocxGetTableRow**
> GetDocxTableRowResponse editDocumentDocxGetTableRow(reqConfig)

Gets the contents of an existing table row in an existing table in a Word DOCX document

Gets the contents of an existing table row in a Word DOCX Document and returns the result.

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
GetDocxTableRowRequest reqConfig = new GetDocxTableRowRequest(); // GetDocxTableRowRequest | Document input request
try {
    GetDocxTableRowResponse result = apiInstance.editDocumentDocxGetTableRow(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetTableRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxTableRowRequest**](GetDocxTableRowRequest.md)| Document input request |

### Return type

[**GetDocxTableRowResponse**](GetDocxTableRowResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetTables"></a>
# **editDocumentDocxGetTables**
> GetDocxTablesResponse editDocumentDocxGetTables(reqConfig)

Get all tables in Word DOCX document

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

<a name="editDocumentDocxInsertCommentOnParagraph"></a>
# **editDocumentDocxInsertCommentOnParagraph**
> InsertDocxCommentOnParagraphResponse editDocumentDocxInsertCommentOnParagraph(reqConfig)

Insert a new comment into a Word DOCX document attached to a paragraph

Adds a new comment into a Word DOCX document attached to a paragraph and returns the result.  Call Finish Editing on the output URL to complete the operation.

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
DocxInsertCommentOnParagraphRequest reqConfig = new DocxInsertCommentOnParagraphRequest(); // DocxInsertCommentOnParagraphRequest | Document input request
try {
    InsertDocxCommentOnParagraphResponse result = apiInstance.editDocumentDocxInsertCommentOnParagraph(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxInsertCommentOnParagraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DocxInsertCommentOnParagraphRequest**](DocxInsertCommentOnParagraphRequest.md)| Document input request |

### Return type

[**InsertDocxCommentOnParagraphResponse**](InsertDocxCommentOnParagraphResponse.md)

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

<a name="editDocumentDocxInsertTableRow"></a>
# **editDocumentDocxInsertTableRow**
> InsertDocxTableRowResponse editDocumentDocxInsertTableRow(reqConfig)

Insert a new row into an existing table in a Word DOCX document

Adds a new table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.

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
InsertDocxTableRowRequest reqConfig = new InsertDocxTableRowRequest(); // InsertDocxTableRowRequest | Document input request
try {
    InsertDocxTableRowResponse result = apiInstance.editDocumentDocxInsertTableRow(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxInsertTableRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**InsertDocxTableRowRequest**](InsertDocxTableRowRequest.md)| Document input request |

### Return type

[**InsertDocxTableRowResponse**](InsertDocxTableRowResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxPages"></a>
# **editDocumentDocxPages**
> GetDocxPagesResponse editDocumentDocxPages(reqConfig)

Get pages and content from a Word DOCX document

Returns the pages and contents of each page defined in the Word Document (DOCX) format file

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
GetDocxPagesRequest reqConfig = new GetDocxPagesRequest(); // GetDocxPagesRequest | Document input request
try {
    GetDocxPagesResponse result = apiInstance.editDocumentDocxPages(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxPages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**GetDocxPagesRequest**](GetDocxPagesRequest.md)| Document input request |

### Return type

[**GetDocxPagesResponse**](GetDocxPagesResponse.md)

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

<a name="editDocumentDocxUpdateTableCell"></a>
# **editDocumentDocxUpdateTableCell**
> UpdateDocxTableCellResponse editDocumentDocxUpdateTableCell(reqConfig)

Update, set contents of a table cell in an existing table in a Word DOCX document

Sets the contents of a table cell into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.

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
UpdateDocxTableCellRequest reqConfig = new UpdateDocxTableCellRequest(); // UpdateDocxTableCellRequest | Document input request
try {
    UpdateDocxTableCellResponse result = apiInstance.editDocumentDocxUpdateTableCell(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxUpdateTableCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**UpdateDocxTableCellRequest**](UpdateDocxTableCellRequest.md)| Document input request |

### Return type

[**UpdateDocxTableCellResponse**](UpdateDocxTableCellResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxUpdateTableRow"></a>
# **editDocumentDocxUpdateTableRow**
> UpdateDocxTableRowResponse editDocumentDocxUpdateTableRow(reqConfig)

Update, set contents of a table row in an existing table in a Word DOCX document

Sets the contents of a table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.

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
UpdateDocxTableRowRequest reqConfig = new UpdateDocxTableRowRequest(); // UpdateDocxTableRowRequest | Document input request
try {
    UpdateDocxTableRowResponse result = apiInstance.editDocumentDocxUpdateTableRow(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxUpdateTableRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**UpdateDocxTableRowRequest**](UpdateDocxTableRowRequest.md)| Document input request |

### Return type

[**UpdateDocxTableRowResponse**](UpdateDocxTableRowResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentFinishEditing"></a>
# **editDocumentFinishEditing**
> byte[] editDocumentFinishEditing(reqConfig)

Finish editing document, and download result from document editing

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

<a name="editDocumentPptxDeleteSlides"></a>
# **editDocumentPptxDeleteSlides**
> byte[] editDocumentPptxDeleteSlides(reqConfig)

Delete, remove slides from a PowerPoint PPTX presentation document

Edits the input PowerPoint PPTX presentation document to remove the specified slides

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
RemovePptxSlidesRequest reqConfig = new RemovePptxSlidesRequest(); // RemovePptxSlidesRequest | Presentation input request
try {
    byte[] result = apiInstance.editDocumentPptxDeleteSlides(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentPptxDeleteSlides");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**RemovePptxSlidesRequest**](RemovePptxSlidesRequest.md)| Presentation input request |

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

<a name="editDocumentXlsxClearCellByIndex"></a>
# **editDocumentXlsxClearCellByIndex**
> ClearXlsxCellResponse editDocumentXlsxClearCellByIndex(input)

Clear cell contents in an Excel XLSX spreadsheet, worksheet by index

Clears, sets to blank, the contents of a specific cell in an Excel XLSX spreadsheet, worksheet

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
ClearXlsxCellRequest input = new ClearXlsxCellRequest(); // ClearXlsxCellRequest | Document input request
try {
    ClearXlsxCellResponse result = apiInstance.editDocumentXlsxClearCellByIndex(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxClearCellByIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ClearXlsxCellRequest**](ClearXlsxCellRequest.md)| Document input request |

### Return type

[**ClearXlsxCellResponse**](ClearXlsxCellResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxCreateBlankSpreadsheet"></a>
# **editDocumentXlsxCreateBlankSpreadsheet**
> CreateBlankSpreadsheetResponse editDocumentXlsxCreateBlankSpreadsheet(input)

Create a blank Excel XLSX spreadsheet

Returns a blank Excel XLSX Spreadsheet (XLSX) format file

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
CreateBlankSpreadsheetRequest input = new CreateBlankSpreadsheetRequest(); // CreateBlankSpreadsheetRequest | Document input request
try {
    CreateBlankSpreadsheetResponse result = apiInstance.editDocumentXlsxCreateBlankSpreadsheet(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxCreateBlankSpreadsheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**CreateBlankSpreadsheetRequest**](CreateBlankSpreadsheetRequest.md)| Document input request |

### Return type

[**CreateBlankSpreadsheetResponse**](CreateBlankSpreadsheetResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxCreateSpreadsheetFromData"></a>
# **editDocumentXlsxCreateSpreadsheetFromData**
> CreateSpreadsheetFromDataResponse editDocumentXlsxCreateSpreadsheetFromData(input)

Create a new Excel XLSX spreadsheet from column and row data

Returns a new Excel XLSX Spreadsheet (XLSX) format file populated with column and row data specified as input

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
CreateSpreadsheetFromDataRequest input = new CreateSpreadsheetFromDataRequest(); // CreateSpreadsheetFromDataRequest | Document input request
try {
    CreateSpreadsheetFromDataResponse result = apiInstance.editDocumentXlsxCreateSpreadsheetFromData(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxCreateSpreadsheetFromData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**CreateSpreadsheetFromDataRequest**](CreateSpreadsheetFromDataRequest.md)| Document input request |

### Return type

[**CreateSpreadsheetFromDataResponse**](CreateSpreadsheetFromDataResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxDeleteWorksheet"></a>
# **editDocumentXlsxDeleteWorksheet**
> Object editDocumentXlsxDeleteWorksheet(reqConfig)

Delete, remove worksheet from an Excel XLSX spreadsheet document

Edits the input Excel XLSX spreadsheet document to remove the specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.

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
RemoveXlsxWorksheetRequest reqConfig = new RemoveXlsxWorksheetRequest(); // RemoveXlsxWorksheetRequest | Spreadsheet input request
try {
    Object result = apiInstance.editDocumentXlsxDeleteWorksheet(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxDeleteWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**RemoveXlsxWorksheetRequest**](RemoveXlsxWorksheetRequest.md)| Spreadsheet input request |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDocumentXlsxEnableSharedWorkbook"></a>
# **editDocumentXlsxEnableSharedWorkbook**
> EnableSharedWorkbookResponse editDocumentXlsxEnableSharedWorkbook(input)

Enable Shared Workbook (legacy) in Excel XLSX spreadsheet

Enables the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet

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
EnableSharedWorkbookRequest input = new EnableSharedWorkbookRequest(); // EnableSharedWorkbookRequest | Document input request
try {
    EnableSharedWorkbookResponse result = apiInstance.editDocumentXlsxEnableSharedWorkbook(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxEnableSharedWorkbook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**EnableSharedWorkbookRequest**](EnableSharedWorkbookRequest.md)| Document input request |

### Return type

[**EnableSharedWorkbookResponse**](EnableSharedWorkbookResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxGetCellByIdentifier"></a>
# **editDocumentXlsxGetCellByIdentifier**
> GetXlsxCellByIdentifierResponse editDocumentXlsxGetCellByIdentifier(input)

Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier

Returns the value of a specific cell based on its identifier (e.g. A1, B22, C33, etc.) in the Excel Spreadsheet worksheet

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
GetXlsxCellByIdentifierRequest input = new GetXlsxCellByIdentifierRequest(); // GetXlsxCellByIdentifierRequest | Document input request
try {
    GetXlsxCellByIdentifierResponse result = apiInstance.editDocumentXlsxGetCellByIdentifier(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetCellByIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetXlsxCellByIdentifierRequest**](GetXlsxCellByIdentifierRequest.md)| Document input request |

### Return type

[**GetXlsxCellByIdentifierResponse**](GetXlsxCellByIdentifierResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxGetCellByIndex"></a>
# **editDocumentXlsxGetCellByIndex**
> GetXlsxCellResponse editDocumentXlsxGetCellByIndex(input)

Get cell from an Excel XLSX spreadsheet, worksheet by index

Returns the value and definition of a specific cell in a specific row in the Excel Spreadsheet worksheet

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
GetXlsxCellRequest input = new GetXlsxCellRequest(); // GetXlsxCellRequest | Document input request
try {
    GetXlsxCellResponse result = apiInstance.editDocumentXlsxGetCellByIndex(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetCellByIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetXlsxCellRequest**](GetXlsxCellRequest.md)| Document input request |

### Return type

[**GetXlsxCellResponse**](GetXlsxCellResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxGetColumns"></a>
# **editDocumentXlsxGetColumns**
> GetXlsxColumnsResponse editDocumentXlsxGetColumns(input)

Get columns from a Excel XLSX spreadsheet, worksheet

Returns the columns defined in the Excel Spreadsheet worksheet

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

<a name="editDocumentXlsxSetCellByIdentifier"></a>
# **editDocumentXlsxSetCellByIdentifier**
> SetXlsxCellByIdentifierResponse editDocumentXlsxSetCellByIdentifier(input)

Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier

Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet using its cell identifier (e.g. A1, B22, C33) in the worksheet

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
SetXlsxCellByIdentifierRequest input = new SetXlsxCellByIdentifierRequest(); // SetXlsxCellByIdentifierRequest | Document input request
try {
    SetXlsxCellByIdentifierResponse result = apiInstance.editDocumentXlsxSetCellByIdentifier(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxSetCellByIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**SetXlsxCellByIdentifierRequest**](SetXlsxCellByIdentifierRequest.md)| Document input request |

### Return type

[**SetXlsxCellByIdentifierResponse**](SetXlsxCellByIdentifierResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentXlsxSetCellByIndex"></a>
# **editDocumentXlsxSetCellByIndex**
> SetXlsxCellResponse editDocumentXlsxSetCellByIndex(input)

Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index

Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet

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
SetXlsxCellRequest input = new SetXlsxCellRequest(); // SetXlsxCellRequest | Document input request
try {
    SetXlsxCellResponse result = apiInstance.editDocumentXlsxSetCellByIndex(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxSetCellByIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**SetXlsxCellRequest**](SetXlsxCellRequest.md)| Document input request |

### Return type

[**SetXlsxCellResponse**](SetXlsxCellResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

