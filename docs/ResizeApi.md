# ResizeApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resizePost**](ResizeApi.md#resizePost) | **POST** /image/resize/preserveAspectRatio/{maxWidth}/{maxHeight} | Resize an image while preserving aspect ratio
[**resizeResizeSimple**](ResizeApi.md#resizeResizeSimple) | **POST** /image/resize/target/{width}/{height} | Resize an image


<a name="resizePost"></a>
# **resizePost**
> byte[] resizePost(maxWidth, maxHeight, imageFile)

Resize an image while preserving aspect ratio

Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio.  Resize is EXIF-aware.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ResizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ResizeApi apiInstance = new ResizeApi();
Integer maxWidth = 56; // Integer | Maximum width of the output image - final image will be as large as possible while less than or equial to this width
Integer maxHeight = 56; // Integer | Maximum height of the output image - final image will be as large as possible while less than or equial to this height
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.resizePost(maxWidth, maxHeight, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResizeApi#resizePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxWidth** | **Integer**| Maximum width of the output image - final image will be as large as possible while less than or equial to this width |
 **maxHeight** | **Integer**| Maximum height of the output image - final image will be as large as possible while less than or equial to this height |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="resizeResizeSimple"></a>
# **resizeResizeSimple**
> byte[] resizeResizeSimple(width, height, imageFile)

Resize an image

Resize an image to a specific width and specific height.  Resize is EXIF-aware.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ResizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ResizeApi apiInstance = new ResizeApi();
Integer width = 56; // Integer | Width of the output image - final image will be exactly this width
Integer height = 56; // Integer | Height of the output image - final image will be exactly this height
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.resizeResizeSimple(width, height, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResizeApi#resizeResizeSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **width** | **Integer**| Width of the output image - final image will be exactly this width |
 **height** | **Integer**| Height of the output image - final image will be exactly this height |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

