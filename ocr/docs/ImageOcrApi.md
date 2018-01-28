# ImageOcrApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imageOcrPost**](ImageOcrApi.md#imageOcrPost) | **POST** /ocr/image/toText | Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.


<a name="imageOcrPost"></a>
# **imageOcrPost**
> ImageToTextResponse imageOcrPost(imageFile)

Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.ocr.ImageOcrApi;


ImageOcrApi apiInstance = new ImageOcrApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
try {
    ImageToTextResponse result = apiInstance.imageOcrPost(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageOcrApi#imageOcrPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**ImageToTextResponse**](ImageToTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

