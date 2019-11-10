# ValidateDocumentApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateDocumentAutodetectValidation**](ValidateDocumentApi.md#validateDocumentAutodetectValidation) | **POST** /convert/validate/autodetect | Autodetect content type and validate
[**validateDocumentDocxValidation**](ValidateDocumentApi.md#validateDocumentDocxValidation) | **POST** /convert/validate/docx | Validate a Word document (DOCX)
[**validateDocumentExecutableValidation**](ValidateDocumentApi.md#validateDocumentExecutableValidation) | **POST** /convert/validate/executable | Validate if a file is executable
[**validateDocumentJsonValidation**](ValidateDocumentApi.md#validateDocumentJsonValidation) | **POST** /convert/validate/json | Validate a JSON file
[**validateDocumentPdfValidation**](ValidateDocumentApi.md#validateDocumentPdfValidation) | **POST** /convert/validate/pdf | Validate a PDF document file
[**validateDocumentPptxValidation**](ValidateDocumentApi.md#validateDocumentPptxValidation) | **POST** /convert/validate/pptx | Validate a PowerPoint presentation (PPTX)
[**validateDocumentXlsxValidation**](ValidateDocumentApi.md#validateDocumentXlsxValidation) | **POST** /convert/validate/xlsx | Validate a Excel document (XLSX)
[**validateDocumentXmlValidation**](ValidateDocumentApi.md#validateDocumentXmlValidation) | **POST** /convert/validate/xml | Validate an XML file


<a name="validateDocumentAutodetectValidation"></a>
# **validateDocumentAutodetectValidation**
> AutodetectDocumentValidationResult validateDocumentAutodetectValidation(inputFile)

Autodetect content type and validate

Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ValidateDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ValidateDocumentApi apiInstance = new ValidateDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    AutodetectDocumentValidationResult result = apiInstance.validateDocumentAutodetectValidation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateDocumentApi#validateDocumentAutodetectValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**AutodetectDocumentValidationResult**](AutodetectDocumentValidationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="validateDocumentDocxValidation"></a>
# **validateDocumentDocxValidation**
> DocumentValidationResult validateDocumentDocxValidation(inputFile)

Validate a Word document (DOCX)

Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ValidateDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ValidateDocumentApi apiInstance = new ValidateDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    DocumentValidationResult result = apiInstance.validateDocumentDocxValidation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateDocumentApi#validateDocumentDocxValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**DocumentValidationResult**](DocumentValidationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="validateDocumentExecutableValidation"></a>
# **validateDocumentExecutableValidation**
> DocumentValidationResult validateDocumentExecutableValidation(inputFile)

Validate if a file is executable

Validate if an input file is a binary executable file; if the document is not valid

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ValidateDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ValidateDocumentApi apiInstance = new ValidateDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    DocumentValidationResult result = apiInstance.validateDocumentExecutableValidation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateDocumentApi#validateDocumentExecutableValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**DocumentValidationResult**](DocumentValidationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="validateDocumentJsonValidation"></a>
# **validateDocumentJsonValidation**
> DocumentValidationResult validateDocumentJsonValidation(inputFile)

Validate a JSON file

Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ValidateDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ValidateDocumentApi apiInstance = new ValidateDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    DocumentValidationResult result = apiInstance.validateDocumentJsonValidation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateDocumentApi#validateDocumentJsonValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**DocumentValidationResult**](DocumentValidationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="validateDocumentPdfValidation"></a>
# **validateDocumentPdfValidation**
> DocumentValidationResult validateDocumentPdfValidation(inputFile)

Validate a PDF document file

Validate a PDF document; if the document is not valid, identifies the errors in the document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ValidateDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ValidateDocumentApi apiInstance = new ValidateDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    DocumentValidationResult result = apiInstance.validateDocumentPdfValidation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateDocumentApi#validateDocumentPdfValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**DocumentValidationResult**](DocumentValidationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="validateDocumentPptxValidation"></a>
# **validateDocumentPptxValidation**
> DocumentValidationResult validateDocumentPptxValidation(inputFile)

Validate a PowerPoint presentation (PPTX)

Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ValidateDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ValidateDocumentApi apiInstance = new ValidateDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    DocumentValidationResult result = apiInstance.validateDocumentPptxValidation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateDocumentApi#validateDocumentPptxValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**DocumentValidationResult**](DocumentValidationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="validateDocumentXlsxValidation"></a>
# **validateDocumentXlsxValidation**
> DocumentValidationResult validateDocumentXlsxValidation(inputFile)

Validate a Excel document (XLSX)

Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ValidateDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ValidateDocumentApi apiInstance = new ValidateDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    DocumentValidationResult result = apiInstance.validateDocumentXlsxValidation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateDocumentApi#validateDocumentXlsxValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**DocumentValidationResult**](DocumentValidationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="validateDocumentXmlValidation"></a>
# **validateDocumentXmlValidation**
> DocumentValidationResult validateDocumentXmlValidation(inputFile)

Validate an XML file

Validate an XML document file; if the document is not valid, identifies the errors in the document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ValidateDocumentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ValidateDocumentApi apiInstance = new ValidateDocumentApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    DocumentValidationResult result = apiInstance.validateDocumentXmlValidation(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidateDocumentApi#validateDocumentXmlValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**DocumentValidationResult**](DocumentValidationResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

