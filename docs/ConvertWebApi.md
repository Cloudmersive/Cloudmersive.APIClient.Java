# ConvertWebApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertWebHtmlToDocx**](ConvertWebApi.md#convertWebHtmlToDocx) | **POST** /convert/html/to/docx | Convert HTML to Word DOCX Document
[**convertWebHtmlToPdf**](ConvertWebApi.md#convertWebHtmlToPdf) | **POST** /convert/web/html/to/pdf | Convert HTML string to PDF
[**convertWebHtmlToPng**](ConvertWebApi.md#convertWebHtmlToPng) | **POST** /convert/web/html/to/png | Convert HTML string to PNG screenshot
[**convertWebHtmlToTxt**](ConvertWebApi.md#convertWebHtmlToTxt) | **POST** /convert/web/html/to/txt | Convert HTML string to text (txt)
[**convertWebMdToHtml**](ConvertWebApi.md#convertWebMdToHtml) | **POST** /convert/web/md/to/html | Convert Markdown to HTML
[**convertWebUrlToPdf**](ConvertWebApi.md#convertWebUrlToPdf) | **POST** /convert/web/url/to/pdf | Convert a URL to PDF
[**convertWebUrlToScreenshot**](ConvertWebApi.md#convertWebUrlToScreenshot) | **POST** /convert/web/url/to/screenshot | Take screenshot of URL
[**convertWebUrlToTxt**](ConvertWebApi.md#convertWebUrlToTxt) | **POST** /convert/web/url/to/txt | Convert website URL page to text (txt)


<a name="convertWebHtmlToDocx"></a>
# **convertWebHtmlToDocx**
> byte[] convertWebHtmlToDocx(inputRequest)

Convert HTML to Word DOCX Document

Convert HTML to Office Word Document (DOCX) format

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertWebApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertWebApi apiInstance = new ConvertWebApi();
HtmlToOfficeRequest inputRequest = new HtmlToOfficeRequest(); // HtmlToOfficeRequest | HTML input to convert to DOCX
try {
    byte[] result = apiInstance.convertWebHtmlToDocx(inputRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToDocx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputRequest** | [**HtmlToOfficeRequest**](HtmlToOfficeRequest.md)| HTML input to convert to DOCX |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebHtmlToPdf"></a>
# **convertWebHtmlToPdf**
> byte[] convertWebHtmlToPdf(input)

Convert HTML string to PDF

Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertWebApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertWebApi apiInstance = new ConvertWebApi();
HtmlToPdfRequest input = new HtmlToPdfRequest(); // HtmlToPdfRequest | HTML to PDF request parameters
try {
    byte[] result = apiInstance.convertWebHtmlToPdf(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**HtmlToPdfRequest**](HtmlToPdfRequest.md)| HTML to PDF request parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebHtmlToPng"></a>
# **convertWebHtmlToPng**
> byte[] convertWebHtmlToPng(input)

Convert HTML string to PNG screenshot

Fully renders a website and returns a PNG (screenshot) of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertWebApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertWebApi apiInstance = new ConvertWebApi();
HtmlToPngRequest input = new HtmlToPngRequest(); // HtmlToPngRequest | HTML to PNG request parameters
try {
    byte[] result = apiInstance.convertWebHtmlToPng(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToPng");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**HtmlToPngRequest**](HtmlToPngRequest.md)| HTML to PNG request parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebHtmlToTxt"></a>
# **convertWebHtmlToTxt**
> HtmlToTextResponse convertWebHtmlToTxt(input)

Convert HTML string to text (txt)

Converts an HTML string input into text (txt); extracts text from HTML

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertWebApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertWebApi apiInstance = new ConvertWebApi();
HtmlToTextRequest input = new HtmlToTextRequest(); // HtmlToTextRequest | HTML to Text request parameters
try {
    HtmlToTextResponse result = apiInstance.convertWebHtmlToTxt(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToTxt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**HtmlToTextRequest**](HtmlToTextRequest.md)| HTML to Text request parameters |

### Return type

[**HtmlToTextResponse**](HtmlToTextResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebMdToHtml"></a>
# **convertWebMdToHtml**
> HtmlMdResult convertWebMdToHtml(inputFile)

Convert Markdown to HTML

Convert a markdown file (.md) to HTML

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertWebApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertWebApi apiInstance = new ConvertWebApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    HtmlMdResult result = apiInstance.convertWebMdToHtml(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebMdToHtml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**HtmlMdResult**](HtmlMdResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebUrlToPdf"></a>
# **convertWebUrlToPdf**
> byte[] convertWebUrlToPdf(input)

Convert a URL to PDF

Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertWebApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertWebApi apiInstance = new ConvertWebApi();
UrlToPdfRequest input = new UrlToPdfRequest(); // UrlToPdfRequest | URL to PDF request parameters
try {
    byte[] result = apiInstance.convertWebUrlToPdf(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebUrlToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UrlToPdfRequest**](UrlToPdfRequest.md)| URL to PDF request parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebUrlToScreenshot"></a>
# **convertWebUrlToScreenshot**
> byte[] convertWebUrlToScreenshot(input)

Take screenshot of URL

Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertWebApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertWebApi apiInstance = new ConvertWebApi();
ScreenshotRequest input = new ScreenshotRequest(); // ScreenshotRequest | Screenshot request parameters
try {
    byte[] result = apiInstance.convertWebUrlToScreenshot(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebUrlToScreenshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ScreenshotRequest**](ScreenshotRequest.md)| Screenshot request parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebUrlToTxt"></a>
# **convertWebUrlToTxt**
> UrlToTextResponse convertWebUrlToTxt(input)

Convert website URL page to text (txt)

Converts a website URL page into text (txt); extracts text from HTML

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertWebApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertWebApi apiInstance = new ConvertWebApi();
UrlToTextRequest input = new UrlToTextRequest(); // UrlToTextRequest | HTML to Text request parameters
try {
    UrlToTextResponse result = apiInstance.convertWebUrlToTxt(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebUrlToTxt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**UrlToTextRequest**](UrlToTextRequest.md)| HTML to Text request parameters |

### Return type

[**UrlToTextResponse**](UrlToTextResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

