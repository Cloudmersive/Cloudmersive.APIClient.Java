# ConvertDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertDocumentAutodetectToPdf**](ConvertDocumentApi.md#convertDocumentAutodetectToPdf) | **POST** /convert/autodetect/to/pdf | Convert Document to PDF
[**convertDocumentDocxToPdf**](ConvertDocumentApi.md#convertDocumentDocxToPdf) | **POST** /convert/docx/to/pdf | Word DOCX to PDF
[**convertDocumentPptxToPdf**](ConvertDocumentApi.md#convertDocumentPptxToPdf) | **POST** /convert/pptx/to/pdf | PowerPoint PPTX to PDF
[**convertDocumentXlsxToCsv**](ConvertDocumentApi.md#convertDocumentXlsxToCsv) | **POST** /convert/xlsx/to/csv | Excel XLSX to CSV
[**convertDocumentXlsxToPdf**](ConvertDocumentApi.md#convertDocumentXlsxToPdf) | **POST** /convert/xlsx/to/pdf | Excel XLSX to PDF


<a name="convertDocumentAutodetectToPdf"></a>
# **convertDocumentAutodetectToPdf**
> File convertDocumentAutodetectToPdf(inputFile)

Convert Document to PDF

Automatically detect file type and convert it to PDF.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertDocumentApi;


ConvertDocumentApi apiInstance = new ConvertDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    File result = apiInstance.convertDocumentAutodetectToPdf(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDocumentApi#convertDocumentAutodetectToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/pdf

<a name="convertDocumentDocxToPdf"></a>
# **convertDocumentDocxToPdf**
> File convertDocumentDocxToPdf(inputFile)

Word DOCX to PDF

Convert Office Word Documents (docx) to standard PDF

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertDocumentApi;


ConvertDocumentApi apiInstance = new ConvertDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    File result = apiInstance.convertDocumentDocxToPdf(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDocumentApi#convertDocumentDocxToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/pdf

<a name="convertDocumentPptxToPdf"></a>
# **convertDocumentPptxToPdf**
> File convertDocumentPptxToPdf(inputFile)

PowerPoint PPTX to PDF

Convert Office PowerPoint Documents (pptx) to standard PDF

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertDocumentApi;


ConvertDocumentApi apiInstance = new ConvertDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    File result = apiInstance.convertDocumentPptxToPdf(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDocumentApi#convertDocumentPptxToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/pdf

<a name="convertDocumentXlsxToCsv"></a>
# **convertDocumentXlsxToCsv**
> File convertDocumentXlsxToCsv(inputFile)

Excel XLSX to CSV

Convert Office Excel Workbooks (xlsx) to standard Comma-Separated Values (CSV) format.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertDocumentApi;


ConvertDocumentApi apiInstance = new ConvertDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    File result = apiInstance.convertDocumentXlsxToCsv(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDocumentApi#convertDocumentXlsxToCsv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/csv

<a name="convertDocumentXlsxToPdf"></a>
# **convertDocumentXlsxToPdf**
> File convertDocumentXlsxToPdf(inputFile)

Excel XLSX to PDF

Convert Office Excel Workbooks (xlsx) to standard PDF.  Converts all worksheets in the workbook to PDF.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertDocumentApi;


ConvertDocumentApi apiInstance = new ConvertDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    File result = apiInstance.convertDocumentXlsxToPdf(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDocumentApi#convertDocumentXlsxToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/pdf
