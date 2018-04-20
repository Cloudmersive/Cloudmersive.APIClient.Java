# ConvertWebApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertWebUrlToPdf**](ConvertWebApi.md#convertWebUrlToPdf) | **POST** /convert/web/url/to/pdf | Convert a URL to PDF
[**convertWebUrlToPdf_0**](ConvertWebApi.md#convertWebUrlToPdf_0) | **POST** /convert/web/html/to/pdf | Convert HTML string to PDF
[**convertWebUrlToScreenshot**](ConvertWebApi.md#convertWebUrlToScreenshot) | **POST** /convert/web/url/to/screenshot | Take screenshot of URL


<a name="convertWebUrlToPdf"></a>
# **convertWebUrlToPdf**
> Object convertWebUrlToPdf(input)

Convert a URL to PDF

Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertWebApi;


ConvertWebApi apiInstance = new ConvertWebApi();
ScreenshotRequest input = new ScreenshotRequest(); // ScreenshotRequest | URL to PDF request parameters
try {
    Object result = apiInstance.convertWebUrlToPdf(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebUrlToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ScreenshotRequest**](ScreenshotRequest.md)| URL to PDF request parameters |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/pdf

<a name="convertWebUrlToPdf_0"></a>
# **convertWebUrlToPdf_0**
> Object convertWebUrlToPdf_0(input)

Convert HTML string to PDF

Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertWebApi;


ConvertWebApi apiInstance = new ConvertWebApi();
HtmlToPdfRequest input = new HtmlToPdfRequest(); // HtmlToPdfRequest | HTML to PDF request parameters
try {
    Object result = apiInstance.convertWebUrlToPdf_0(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebUrlToPdf_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**HtmlToPdfRequest**](HtmlToPdfRequest.md)| HTML to PDF request parameters |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/pdf

<a name="convertWebUrlToScreenshot"></a>
# **convertWebUrlToScreenshot**
> Object convertWebUrlToScreenshot(input)

Take screenshot of URL

Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertWebApi;


ConvertWebApi apiInstance = new ConvertWebApi();
ScreenshotRequest input = new ScreenshotRequest(); // ScreenshotRequest | Screenshot request parameters
try {
    Object result = apiInstance.convertWebUrlToScreenshot(input);
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

