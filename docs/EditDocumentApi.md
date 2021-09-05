# EditDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editDocumentBeginEditing**](EditDocumentApi.md#editDocumentBeginEditing) | **POST** /convert/edit/begin-editing | Begin editing a document
[**editDocumentDocxAcceptAllTrackChanges**](EditDocumentApi.md#editDocumentDocxAcceptAllTrackChanges) | **POST** /convert/edit/docx/track-changes/accept-all | Accept all tracked changes, revisions in a Word DOCX document
[**editDocumentDocxBody**](EditDocumentApi.md#editDocumentDocxBody) | **POST** /convert/edit/docx/get-body | Get body from a Word DOCX document
[**editDocumentDocxCreateBlankDocument**](EditDocumentApi.md#editDocumentDocxCreateBlankDocument) | **POST** /convert/edit/docx/create/blank | Create a blank Word DOCX document
[**editDocumentDocxDeletePages**](EditDocumentApi.md#editDocumentDocxDeletePages) | **POST** /convert/edit/docx/delete-pages | Delete, remove pages from a Word DOCX document
[**editDocumentDocxDeleteTableRow**](EditDocumentApi.md#editDocumentDocxDeleteTableRow) | **POST** /convert/edit/docx/delete-table-row | Deletes a table row in an existing table in a Word DOCX document
[**editDocumentDocxDeleteTableRowRange**](EditDocumentApi.md#editDocumentDocxDeleteTableRowRange) | **POST** /convert/edit/docx/delete-table-row/range | Deletes a range of multiple table rows in an existing table in a Word DOCX document
[**editDocumentDocxDisableTrackChanges**](EditDocumentApi.md#editDocumentDocxDisableTrackChanges) | **POST** /convert/edit/docx/track-changes/disable | Disable track changes, revisions in a Word DOCX document
[**editDocumentDocxEnableTrackChanges**](EditDocumentApi.md#editDocumentDocxEnableTrackChanges) | **POST** /convert/edit/docx/track-changes/enable | Enable track changes, revisions in a Word DOCX document
[**editDocumentDocxFindParagraph**](EditDocumentApi.md#editDocumentDocxFindParagraph) | **POST** /convert/edit/docx/find/paragraph | Find matching paragraphs in a Word DOCX document
[**editDocumentDocxGetComments**](EditDocumentApi.md#editDocumentDocxGetComments) | **POST** /convert/edit/docx/get-comments/flat-list | Get comments from a Word DOCX document as a flat list
[**editDocumentDocxGetCommentsHierarchical**](EditDocumentApi.md#editDocumentDocxGetCommentsHierarchical) | **POST** /convert/edit/docx/get-comments/hierarchical | Get comments from a Word DOCX document hierarchically
[**editDocumentDocxGetContentControls**](EditDocumentApi.md#editDocumentDocxGetContentControls) | **POST** /convert/edit/docx/get-content-controls | Get all content controls (form fields) and values in a Word DOCX document
[**editDocumentDocxGetFormFields**](EditDocumentApi.md#editDocumentDocxGetFormFields) | **POST** /convert/edit/docx/get-form-fields | Get all form fields in a Word DOCX document
[**editDocumentDocxGetHeadersAndFooters**](EditDocumentApi.md#editDocumentDocxGetHeadersAndFooters) | **POST** /convert/edit/docx/get-headers-and-footers | Get content of a footer from a Word DOCX document
[**editDocumentDocxGetImages**](EditDocumentApi.md#editDocumentDocxGetImages) | **POST** /convert/edit/docx/get-images | Get images from a Word DOCX document
[**editDocumentDocxGetMacroInformation**](EditDocumentApi.md#editDocumentDocxGetMacroInformation) | **POST** /convert/edit/docx/get-macros | Get macro information from a Word DOCX/DOCM document
[**editDocumentDocxGetMetadataProperties**](EditDocumentApi.md#editDocumentDocxGetMetadataProperties) | **POST** /convert/edit/docx/get-metadata | Get all metadata properties in Word DOCX document
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
[**editDocumentDocxRemoveAllComments**](EditDocumentApi.md#editDocumentDocxRemoveAllComments) | **POST** /convert/edit/docx/comments/remove-all | Remove all comments from a Word DOCX document
[**editDocumentDocxRemoveHeadersAndFooters**](EditDocumentApi.md#editDocumentDocxRemoveHeadersAndFooters) | **POST** /convert/edit/docx/remove-headers-and-footers | Remove headers and footers from Word DOCX document
[**editDocumentDocxRemoveObject**](EditDocumentApi.md#editDocumentDocxRemoveObject) | **POST** /convert/edit/docx/remove-object | Delete any object in a Word DOCX document
[**editDocumentDocxReplace**](EditDocumentApi.md#editDocumentDocxReplace) | **POST** /convert/edit/docx/replace-all | Replace string in Word DOCX document
[**editDocumentDocxReplaceMulti**](EditDocumentApi.md#editDocumentDocxReplaceMulti) | **POST** /convert/edit/docx/replace-all/multi | Replace multiple strings in Word DOCX document, return result
[**editDocumentDocxReplaceMultiEditSession**](EditDocumentApi.md#editDocumentDocxReplaceMultiEditSession) | **POST** /convert/edit/docx/replace-all/multi/edit-session | Replace multiple strings in Word DOCX document, return edit session
[**editDocumentDocxReplaceParagraph**](EditDocumentApi.md#editDocumentDocxReplaceParagraph) | **POST** /convert/edit/docx/replace/paragraph | Replace matching paragraphs in a Word DOCX document
[**editDocumentDocxSetCustomMetadataProperties**](EditDocumentApi.md#editDocumentDocxSetCustomMetadataProperties) | **POST** /convert/edit/docx/set-metadata/custom-property | Set custom property metadata properties in Word DOCX document
[**editDocumentDocxSetFooter**](EditDocumentApi.md#editDocumentDocxSetFooter) | **POST** /convert/edit/docx/set-footer | Set the footer in a Word DOCX document
[**editDocumentDocxSetFooterAddPageNumber**](EditDocumentApi.md#editDocumentDocxSetFooterAddPageNumber) | **POST** /convert/edit/docx/set-footer/add-page-number | Add page number to footer in a Word DOCX document
[**editDocumentDocxSetFormFields**](EditDocumentApi.md#editDocumentDocxSetFormFields) | **POST** /convert/edit/docx/set-form-fields | Set and fill values for form fields in a Word DOCX document
[**editDocumentDocxSetHeader**](EditDocumentApi.md#editDocumentDocxSetHeader) | **POST** /convert/edit/docx/set-header | Set the header in a Word DOCX document
[**editDocumentDocxUpdateTableCell**](EditDocumentApi.md#editDocumentDocxUpdateTableCell) | **POST** /convert/edit/docx/update-table-cell | Update, set contents of a table cell in an existing table in a Word DOCX document
[**editDocumentDocxUpdateTableRow**](EditDocumentApi.md#editDocumentDocxUpdateTableRow) | **POST** /convert/edit/docx/update-table-row | Update, set contents of a table row in an existing table in a Word DOCX document
[**editDocumentFinishEditing**](EditDocumentApi.md#editDocumentFinishEditing) | **POST** /convert/edit/finish-editing | Finish editing document, and download result from document editing
[**editDocumentPptxDeleteSlides**](EditDocumentApi.md#editDocumentPptxDeleteSlides) | **POST** /convert/edit/pptx/delete-slides | Delete, remove slides from a PowerPoint PPTX presentation document
[**editDocumentPptxGetMacroInformation**](EditDocumentApi.md#editDocumentPptxGetMacroInformation) | **POST** /convert/edit/pptx/get-macros | Get macro information from a PowerPoint PPTX/PPTM presentation document
[**editDocumentPptxReplace**](EditDocumentApi.md#editDocumentPptxReplace) | **POST** /convert/edit/pptx/replace-all | Replace string in PowerPoint PPTX presentation
[**editDocumentXlsxAppendRow**](EditDocumentApi.md#editDocumentXlsxAppendRow) | **POST** /convert/edit/xlsx/append-row | Append row to a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxClearCellByIndex**](EditDocumentApi.md#editDocumentXlsxClearCellByIndex) | **POST** /convert/edit/xlsx/clear-cell/by-index | Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
[**editDocumentXlsxClearRow**](EditDocumentApi.md#editDocumentXlsxClearRow) | **POST** /convert/edit/xlsx/clear-row | Clear row from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxCreateBlankSpreadsheet**](EditDocumentApi.md#editDocumentXlsxCreateBlankSpreadsheet) | **POST** /convert/edit/xlsx/create/blank | Create a blank Excel XLSX spreadsheet
[**editDocumentXlsxCreateSpreadsheetFromData**](EditDocumentApi.md#editDocumentXlsxCreateSpreadsheetFromData) | **POST** /convert/edit/xlsx/create/from/data | Create a new Excel XLSX spreadsheet from column and row data
[**editDocumentXlsxDeleteWorksheet**](EditDocumentApi.md#editDocumentXlsxDeleteWorksheet) | **POST** /convert/edit/xlsx/delete-worksheet | Delete, remove worksheet from an Excel XLSX spreadsheet document
[**editDocumentXlsxDisableSharedWorkbook**](EditDocumentApi.md#editDocumentXlsxDisableSharedWorkbook) | **POST** /convert/edit/xlsx/configuration/disable-shared-workbook | Disable Shared Workbook (legacy) in Excel XLSX spreadsheet
[**editDocumentXlsxEnableSharedWorkbook**](EditDocumentApi.md#editDocumentXlsxEnableSharedWorkbook) | **POST** /convert/edit/xlsx/configuration/enable-shared-workbook | Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
[**editDocumentXlsxGetCellByIdentifier**](EditDocumentApi.md#editDocumentXlsxGetCellByIdentifier) | **POST** /convert/edit/xlsx/get-cell/by-identifier | Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
[**editDocumentXlsxGetCellByIndex**](EditDocumentApi.md#editDocumentXlsxGetCellByIndex) | **POST** /convert/edit/xlsx/get-cell/by-index | Get cell from an Excel XLSX spreadsheet, worksheet by index
[**editDocumentXlsxGetColumns**](EditDocumentApi.md#editDocumentXlsxGetColumns) | **POST** /convert/edit/xlsx/get-columns | Get columns from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetImages**](EditDocumentApi.md#editDocumentXlsxGetImages) | **POST** /convert/edit/xlsx/get-images | Get images from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetMacroInformation**](EditDocumentApi.md#editDocumentXlsxGetMacroInformation) | **POST** /convert/edit/xlsx/get-macros | Get macro information from a Excel XLSX/XLSM spreadsheet, worksheet
[**editDocumentXlsxGetRowsAndCells**](EditDocumentApi.md#editDocumentXlsxGetRowsAndCells) | **POST** /convert/edit/xlsx/get-rows-and-cells | Get rows and cells from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetSpecificRow**](EditDocumentApi.md#editDocumentXlsxGetSpecificRow) | **POST** /convert/edit/xlsx/get-specific-row | Get a specific row from a Excel XLSX spreadsheet, worksheet by path
[**editDocumentXlsxGetStyles**](EditDocumentApi.md#editDocumentXlsxGetStyles) | **POST** /convert/edit/xlsx/get-styles | Get styles from a Excel XLSX spreadsheet, worksheet
[**editDocumentXlsxGetWorksheets**](EditDocumentApi.md#editDocumentXlsxGetWorksheets) | **POST** /convert/edit/xlsx/get-worksheets | Get worksheets from a Excel XLSX spreadsheet
[**editDocumentXlsxInsertWorksheet**](EditDocumentApi.md#editDocumentXlsxInsertWorksheet) | **POST** /convert/edit/xlsx/insert-worksheet | Insert a new worksheet into an Excel XLSX spreadsheet
[**editDocumentXlsxRenameWorksheet**](EditDocumentApi.md#editDocumentXlsxRenameWorksheet) | **POST** /convert/edit/xlsx/rename-worksheet | Rename a specific worksheet in a Excel XLSX spreadsheet
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

<a name="editDocumentDocxAcceptAllTrackChanges"></a>
# **editDocumentDocxAcceptAllTrackChanges**
> byte[] editDocumentDocxAcceptAllTrackChanges(inputFile)

Accept all tracked changes, revisions in a Word DOCX document

Accepts all tracked changes and revisions in a Word DOCX document.  This will accept all pending changes in the document when tracked changes is turned on.  Track changes will remain on (if it is on) after this oepration is completed.

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
    byte[] result = apiInstance.editDocumentDocxAcceptAllTrackChanges(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxAcceptAllTrackChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**byte[]**

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

<a name="editDocumentDocxDisableTrackChanges"></a>
# **editDocumentDocxDisableTrackChanges**
> byte[] editDocumentDocxDisableTrackChanges(inputFile)

Disable track changes, revisions in a Word DOCX document

Diables tracking of changes and revisions in a Word DOCX document, and accepts any pending changes.  Users editing the document will no longer see changes tracked automatically.

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
    byte[] result = apiInstance.editDocumentDocxDisableTrackChanges(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxDisableTrackChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxEnableTrackChanges"></a>
# **editDocumentDocxEnableTrackChanges**
> byte[] editDocumentDocxEnableTrackChanges(inputFile)

Enable track changes, revisions in a Word DOCX document

Enables tracking of changes and revisions in a Word DOCX document.  Users editing the document will see changes tracked automatically, with edits highlighted, and the ability to accept or reject changes made to the document.

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
    byte[] result = apiInstance.editDocumentDocxEnableTrackChanges(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxEnableTrackChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxFindParagraph"></a>
# **editDocumentDocxFindParagraph**
> FindDocxParagraphResponse editDocumentDocxFindParagraph(reqConfig)

Find matching paragraphs in a Word DOCX document

Returns the paragraphs defined in the Word Document (DOCX) format file that match the input criteria

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
FindDocxParagraphRequest reqConfig = new FindDocxParagraphRequest(); // FindDocxParagraphRequest | Document input request
try {
    FindDocxParagraphResponse result = apiInstance.editDocumentDocxFindParagraph(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxFindParagraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**FindDocxParagraphRequest**](FindDocxParagraphRequest.md)| Document input request |

### Return type

[**FindDocxParagraphResponse**](FindDocxParagraphResponse.md)

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

<a name="editDocumentDocxGetContentControls"></a>
# **editDocumentDocxGetContentControls**
> GetDocxContentControlsResponse editDocumentDocxGetContentControls(inputFile)

Get all content controls (form fields) and values in a Word DOCX document

Returns all the content controls, used for creating form fields, in a Office Word Document (docx)

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
    GetDocxContentControlsResponse result = apiInstance.editDocumentDocxGetContentControls(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetContentControls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**GetDocxContentControlsResponse**](GetDocxContentControlsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetFormFields"></a>
# **editDocumentDocxGetFormFields**
> GetDocxGetFormFieldsResponse editDocumentDocxGetFormFields(inputFile)

Get all form fields in a Word DOCX document

Returns all the content controls, used for creating form fields, as well as handlebar style text-based form fields such as \&quot;{{FieldName}}\&quot;, in a Office Word Document (docx)

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
    GetDocxGetFormFieldsResponse result = apiInstance.editDocumentDocxGetFormFields(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetFormFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**GetDocxGetFormFieldsResponse**](GetDocxGetFormFieldsResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a name="editDocumentDocxGetMacroInformation"></a>
# **editDocumentDocxGetMacroInformation**
> GetMacrosResponse editDocumentDocxGetMacroInformation(inputFile)

Get macro information from a Word DOCX/DOCM document

Returns information about the Macros (e.g. VBA) defined in the Word Document

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
    GetMacrosResponse result = apiInstance.editDocumentDocxGetMacroInformation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetMacroInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**GetMacrosResponse**](GetMacrosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxGetMetadataProperties"></a>
# **editDocumentDocxGetMetadataProperties**
> GetDocxMetadataPropertiesResponse editDocumentDocxGetMetadataProperties(inputFile)

Get all metadata properties in Word DOCX document

Returns all the metadata properties in an Office Word Document (docx)

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
    GetDocxMetadataPropertiesResponse result = apiInstance.editDocumentDocxGetMetadataProperties(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxGetMetadataProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**GetDocxMetadataPropertiesResponse**](GetDocxMetadataPropertiesResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a name="editDocumentDocxRemoveAllComments"></a>
# **editDocumentDocxRemoveAllComments**
> byte[] editDocumentDocxRemoveAllComments(inputFile)

Remove all comments from a Word DOCX document

Removes all of the comments from a Word Document.

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
    byte[] result = apiInstance.editDocumentDocxRemoveAllComments(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxRemoveAllComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a name="editDocumentDocxReplaceMulti"></a>
# **editDocumentDocxReplaceMulti**
> byte[] editDocumentDocxReplaceMulti(reqConfig)

Replace multiple strings in Word DOCX document, return result

Replace all instances of multiple strings in an Office Word Document (docx)

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
MultiReplaceStringRequest reqConfig = new MultiReplaceStringRequest(); // MultiReplaceStringRequest | Document string replacement configuration input
try {
    byte[] result = apiInstance.editDocumentDocxReplaceMulti(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxReplaceMulti");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**MultiReplaceStringRequest**](MultiReplaceStringRequest.md)| Document string replacement configuration input |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDocumentDocxReplaceMultiEditSession"></a>
# **editDocumentDocxReplaceMultiEditSession**
> DocumentEditingEditSession editDocumentDocxReplaceMultiEditSession(reqConfig)

Replace multiple strings in Word DOCX document, return edit session

Replace all instances of multiple strings in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.

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
MultiReplaceStringRequest reqConfig = new MultiReplaceStringRequest(); // MultiReplaceStringRequest | Document string replacement configuration input
try {
    DocumentEditingEditSession result = apiInstance.editDocumentDocxReplaceMultiEditSession(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxReplaceMultiEditSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**MultiReplaceStringRequest**](MultiReplaceStringRequest.md)| Document string replacement configuration input |

### Return type

[**DocumentEditingEditSession**](DocumentEditingEditSession.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxReplaceParagraph"></a>
# **editDocumentDocxReplaceParagraph**
> ReplaceDocxParagraphResponse editDocumentDocxReplaceParagraph(reqConfig)

Replace matching paragraphs in a Word DOCX document

Returns the edited Word Document (DOCX) format file with the matching paragraphs replaced as requested.  Replace a paragraph with another object such as an image.  Useful for performing templating operations.

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
ReplaceDocxParagraphRequest reqConfig = new ReplaceDocxParagraphRequest(); // ReplaceDocxParagraphRequest | Document input request
try {
    ReplaceDocxParagraphResponse result = apiInstance.editDocumentDocxReplaceParagraph(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxReplaceParagraph");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**ReplaceDocxParagraphRequest**](ReplaceDocxParagraphRequest.md)| Document input request |

### Return type

[**ReplaceDocxParagraphResponse**](ReplaceDocxParagraphResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editDocumentDocxSetCustomMetadataProperties"></a>
# **editDocumentDocxSetCustomMetadataProperties**
> byte[] editDocumentDocxSetCustomMetadataProperties(input)

Set custom property metadata properties in Word DOCX document

Sets the custom property metadata for the metadata properties in an Office Word Document (docx)

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
DocxSetCustomMetadataPropertiesRequest input = new DocxSetCustomMetadataPropertiesRequest(); // DocxSetCustomMetadataPropertiesRequest | 
try {
    byte[] result = apiInstance.editDocumentDocxSetCustomMetadataProperties(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxSetCustomMetadataProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**DocxSetCustomMetadataPropertiesRequest**](DocxSetCustomMetadataPropertiesRequest.md)|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

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

<a name="editDocumentDocxSetFormFields"></a>
# **editDocumentDocxSetFormFields**
> byte[] editDocumentDocxSetFormFields(reqConfig)

Set and fill values for form fields in a Word DOCX document

Modifies a Office Word Document (docx) by filling in form fields using the provided values.

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
DocxSetFormFieldsRequest reqConfig = new DocxSetFormFieldsRequest(); // DocxSetFormFieldsRequest | 
try {
    byte[] result = apiInstance.editDocumentDocxSetFormFields(reqConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentDocxSetFormFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqConfig** | [**DocxSetFormFieldsRequest**](DocxSetFormFieldsRequest.md)|  |

### Return type

**byte[]**

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

<a name="editDocumentPptxGetMacroInformation"></a>
# **editDocumentPptxGetMacroInformation**
> GetMacrosResponse editDocumentPptxGetMacroInformation(inputFile)

Get macro information from a PowerPoint PPTX/PPTM presentation document

Returns information about the Macros (e.g. VBA) defined in the PowerPoint Document

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
    GetMacrosResponse result = apiInstance.editDocumentPptxGetMacroInformation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentPptxGetMacroInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**GetMacrosResponse**](GetMacrosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

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

<a name="editDocumentXlsxAppendRow"></a>
# **editDocumentXlsxAppendRow**
> AppendXlsxRowResponse editDocumentXlsxAppendRow(input)

Append row to a Excel XLSX spreadsheet, worksheet

Appends a row to the end of an Excel Spreadsheet worksheet.

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
AppendXlsxRowRequest input = new AppendXlsxRowRequest(); // AppendXlsxRowRequest | Document input request
try {
    AppendXlsxRowResponse result = apiInstance.editDocumentXlsxAppendRow(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxAppendRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**AppendXlsxRowRequest**](AppendXlsxRowRequest.md)| Document input request |

### Return type

[**AppendXlsxRowResponse**](AppendXlsxRowResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

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

<a name="editDocumentXlsxClearRow"></a>
# **editDocumentXlsxClearRow**
> ClearXlsxRowResponse editDocumentXlsxClearRow(input)

Clear row from a Excel XLSX spreadsheet, worksheet

Clears data from a specific row in the Excel Spreadsheet worksheet, leaving a blank row. Use the Get Rows And Cells API to enumerate available rows in a spreadsheet.

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
ClearXlsxRowRequest input = new ClearXlsxRowRequest(); // ClearXlsxRowRequest | Document input request
try {
    ClearXlsxRowResponse result = apiInstance.editDocumentXlsxClearRow(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxClearRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ClearXlsxRowRequest**](ClearXlsxRowRequest.md)| Document input request |

### Return type

[**ClearXlsxRowResponse**](ClearXlsxRowResponse.md)

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
> byte[] editDocumentXlsxDeleteWorksheet(reqConfig)

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
    byte[] result = apiInstance.editDocumentXlsxDeleteWorksheet(reqConfig);
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

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDocumentXlsxDisableSharedWorkbook"></a>
# **editDocumentXlsxDisableSharedWorkbook**
> DisableSharedWorkbookResponse editDocumentXlsxDisableSharedWorkbook(input)

Disable Shared Workbook (legacy) in Excel XLSX spreadsheet

Disable the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet

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
DisableSharedWorkbookRequest input = new DisableSharedWorkbookRequest(); // DisableSharedWorkbookRequest | Document input request
try {
    DisableSharedWorkbookResponse result = apiInstance.editDocumentXlsxDisableSharedWorkbook(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxDisableSharedWorkbook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**DisableSharedWorkbookRequest**](DisableSharedWorkbookRequest.md)| Document input request |

### Return type

[**DisableSharedWorkbookResponse**](DisableSharedWorkbookResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

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

<a name="editDocumentXlsxGetMacroInformation"></a>
# **editDocumentXlsxGetMacroInformation**
> GetMacrosResponse editDocumentXlsxGetMacroInformation(inputFile)

Get macro information from a Excel XLSX/XLSM spreadsheet, worksheet

Returns information about the Macros (e.g. VBA) defined in the Excel Spreadsheet

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
    GetMacrosResponse result = apiInstance.editDocumentXlsxGetMacroInformation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetMacroInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**GetMacrosResponse**](GetMacrosResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a name="editDocumentXlsxGetSpecificRow"></a>
# **editDocumentXlsxGetSpecificRow**
> GetXlsxSpecificRowResponse editDocumentXlsxGetSpecificRow(input)

Get a specific row from a Excel XLSX spreadsheet, worksheet by path

Returns the specific row and its cells defined in the Excel Spreadsheet worksheet based on the specified path.

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
GetXlsxSpecificRowRequest input = new GetXlsxSpecificRowRequest(); // GetXlsxSpecificRowRequest | Document input request
try {
    GetXlsxSpecificRowResponse result = apiInstance.editDocumentXlsxGetSpecificRow(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxGetSpecificRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**GetXlsxSpecificRowRequest**](GetXlsxSpecificRowRequest.md)| Document input request |

### Return type

[**GetXlsxSpecificRowResponse**](GetXlsxSpecificRowResponse.md)

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

<a name="editDocumentXlsxRenameWorksheet"></a>
# **editDocumentXlsxRenameWorksheet**
> RenameXlsxWorksheetResponse editDocumentXlsxRenameWorksheet(input)

Rename a specific worksheet in a Excel XLSX spreadsheet

Edits the input Excel XLSX spreadsheet document to rename a specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.

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
RenameXlsxWorksheetRequest input = new RenameXlsxWorksheetRequest(); // RenameXlsxWorksheetRequest | Document input request
try {
    RenameXlsxWorksheetResponse result = apiInstance.editDocumentXlsxRenameWorksheet(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditDocumentApi#editDocumentXlsxRenameWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**RenameXlsxWorksheetRequest**](RenameXlsxWorksheetRequest.md)| Document input request |

### Return type

[**RenameXlsxWorksheetResponse**](RenameXlsxWorksheetResponse.md)

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

