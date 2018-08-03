# EditApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editCompositeBasic**](EditApi.md#editCompositeBasic) | **POST** /image/edit/composite/{location} | Composite two images together
[**editDrawRectangle**](EditApi.md#editDrawRectangle) | **POST** /image/edit/draw/rectangle | Draw rectangle onto an image
[**editDrawText**](EditApi.md#editDrawText) | **POST** /image/edit/draw/text | Draw text onto an image


<a name="editCompositeBasic"></a>
# **editCompositeBasic**
> Object editCompositeBasic(location, baseImage, layeredImage)

Composite two images together

Composites two input images together; a layered image onto a base image.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditApi apiInstance = new EditApi();
String location = "location_example"; // String | Location to composite the layered images; possible values are: \"center\", \"top-left\", \"top-center\", \"top-right\", \"center-left\", \"center-right\", \"bottom-left\", \"bottom-center\", \"bottom-right\"
File baseImage = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
File layeredImage = new File("/path/to/file.txt"); // File | Image to layer on top of the base image.
try {
    Object result = apiInstance.editCompositeBasic(location, baseImage, layeredImage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editCompositeBasic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location** | **String**| Location to composite the layered images; possible values are: \&quot;center\&quot;, \&quot;top-left\&quot;, \&quot;top-center\&quot;, \&quot;top-right\&quot;, \&quot;center-left\&quot;, \&quot;center-right\&quot;, \&quot;bottom-left\&quot;, \&quot;bottom-center\&quot;, \&quot;bottom-right\&quot; |
 **baseImage** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |
 **layeredImage** | **File**| Image to layer on top of the base image. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: image/png

<a name="editDrawRectangle"></a>
# **editDrawRectangle**
> Object editDrawRectangle(request)

Draw rectangle onto an image

Draw one or more rectangles, with customized visuals, onto an image

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditApi apiInstance = new EditApi();
DrawRectangleRequest request = new DrawRectangleRequest(); // DrawRectangleRequest | 
try {
    Object result = apiInstance.editDrawRectangle(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editDrawRectangle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DrawRectangleRequest**](DrawRectangleRequest.md)|  |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="editDrawText"></a>
# **editDrawText**
> Object editDrawText(request)

Draw text onto an image

Draw one or more pieces of text, with customized visuals, onto an image

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditApi apiInstance = new EditApi();
DrawTextRequest request = new DrawTextRequest(); // DrawTextRequest | 
try {
    Object result = apiInstance.editDrawText(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editDrawText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DrawTextRequest**](DrawTextRequest.md)|  |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

