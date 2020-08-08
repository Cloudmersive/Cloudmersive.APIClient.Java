# EditApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editAutoOrient**](EditApi.md#editAutoOrient) | **POST** /image/edit/auto-orient/remove-exif | Normalizes image rotation and removes EXIF rotation data
[**editCompositeBasic**](EditApi.md#editCompositeBasic) | **POST** /image/edit/composite/{location} | Composite two images together
[**editCompositePrecise**](EditApi.md#editCompositePrecise) | **POST** /image/edit/composite/precise | Composite two images together precisely
[**editContrastAdaptive**](EditApi.md#editContrastAdaptive) | **POST** /image/edit/contrast/{gamma}/adaptive | Adaptively adjust the contrast of the image to be more appealing and easy to see
[**editCropCircle**](EditApi.md#editCropCircle) | **POST** /image/edit/crop/circle/{left}/{top}/{radius} | Crop an image to an circular area
[**editCropRectangle**](EditApi.md#editCropRectangle) | **POST** /image/edit/crop/rectangle/{left}/{top}/{width}/{height} | Crop an image to a rectangular area
[**editDrawPolygon**](EditApi.md#editDrawPolygon) | **POST** /image/edit/draw/polygon | Draw a polygon onto an image
[**editDrawRectangle**](EditApi.md#editDrawRectangle) | **POST** /image/edit/draw/rectangle | Draw a rectangle onto an image
[**editDrawText**](EditApi.md#editDrawText) | **POST** /image/edit/draw/text | Draw text onto an image
[**editDropShadow**](EditApi.md#editDropShadow) | **POST** /image/edit/drop-shadow/{X}/{Y}/{sigma}/{opacity} | Add a customizeable drop shadow to an image
[**editInvert**](EditApi.md#editInvert) | **POST** /image/edit/invert | Invert, negate the colors in the image
[**editRemoveExifData**](EditApi.md#editRemoveExifData) | **POST** /image/edit/remove-exif | Remove EXIF data from the image
[**editRemoveTransparency**](EditApi.md#editRemoveTransparency) | **POST** /image/edit/remove-transparency | Remove transparency from the image
[**editRotate**](EditApi.md#editRotate) | **POST** /image/edit/rotate/{degrees}/angle | Rotate an image any number of degrees


<a name="editAutoOrient"></a>
# **editAutoOrient**
> byte[] editAutoOrient(imageFile)

Normalizes image rotation and removes EXIF rotation data

Automatically orients the input image based on EXIF information and then removes the EXIF information.  EXIF is an additional set of information stored in some images taken with cell phone cameras based on the orientation of the camera.  By normalizing rotation and removing EXIF data these images become much easier to process.

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
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editAutoOrient(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editAutoOrient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editCompositeBasic"></a>
# **editCompositeBasic**
> byte[] editCompositeBasic(location, baseImage, layeredImage)

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
    byte[] result = apiInstance.editCompositeBasic(location, baseImage, layeredImage);
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

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editCompositePrecise"></a>
# **editCompositePrecise**
> byte[] editCompositePrecise(baseImage, layeredImage, top, bottom, left, right, width, height)

Composite two images together precisely

Composites two input images together; a layered image onto a base image. Position is based on distance in pixels from each side.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.  Providing multiple parameters in a single axis (for example top and bottom) is not recommended, since only one of the parameters will be used per axis.

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
File baseImage = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
File layeredImage = new File("/path/to/file.txt"); // File | Image to layer on top of the base image.
Integer top = 56; // Integer | Optional; Desired distance in pixels from the top of the base image to the top of the layered image.
Integer bottom = 56; // Integer | Optional; Desired distance in pixels from the bottom of the base image to the bottom of the layered image.
Integer left = 56; // Integer | Optional; Desired distance in pixels from the left side of the base image to the left side of the layered image.
Integer right = 56; // Integer | Optional; Desired distance in pixels from the right side of the base image to the right side of the layered image.
Integer width = 56; // Integer | Optional; Desired width of the layered image in pixels. Leave height empty or 0 to automatically scale the image proportionally.
Integer height = 56; // Integer | Optional; Desired height of the layered image in pixels. Leave width empty or 0 to automatically scale the image proportionally.
try {
    byte[] result = apiInstance.editCompositePrecise(baseImage, layeredImage, top, bottom, left, right, width, height);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editCompositePrecise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseImage** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |
 **layeredImage** | **File**| Image to layer on top of the base image. |
 **top** | **Integer**| Optional; Desired distance in pixels from the top of the base image to the top of the layered image. | [optional]
 **bottom** | **Integer**| Optional; Desired distance in pixels from the bottom of the base image to the bottom of the layered image. | [optional]
 **left** | **Integer**| Optional; Desired distance in pixels from the left side of the base image to the left side of the layered image. | [optional]
 **right** | **Integer**| Optional; Desired distance in pixels from the right side of the base image to the right side of the layered image. | [optional]
 **width** | **Integer**| Optional; Desired width of the layered image in pixels. Leave height empty or 0 to automatically scale the image proportionally. | [optional]
 **height** | **Integer**| Optional; Desired height of the layered image in pixels. Leave width empty or 0 to automatically scale the image proportionally. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editContrastAdaptive"></a>
# **editContrastAdaptive**
> byte[] editContrastAdaptive(gamma, imageFile)

Adaptively adjust the contrast of the image to be more appealing and easy to see

Uses Gamma to adjust the contrast adaptively the way the human eye sees the world.  Results significantly improve the viewability and visual appeal of the image.

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
Double gamma = 3.4D; // Double | Gamma value to adjust the contrast in the image.  Recommended value is 2.0.  Values between 0.0 and 1.0 will reduce contrast, while values above 1.0 will increase contrast.
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editContrastAdaptive(gamma, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editContrastAdaptive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gamma** | **Double**| Gamma value to adjust the contrast in the image.  Recommended value is 2.0.  Values between 0.0 and 1.0 will reduce contrast, while values above 1.0 will increase contrast. |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editCropCircle"></a>
# **editCropCircle**
> byte[] editCropCircle(left, top, radius, imageFile)

Crop an image to an circular area

Crop an image to a target circular area

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
Integer left = 56; // Integer | The left edge of the circular crop area in pixels (X).
Integer top = 56; // Integer | The top edge of the circular crop area in pixels (Y).
Integer radius = 56; // Integer | The radius of the circular crop area in pixels.
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editCropCircle(left, top, radius, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editCropCircle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **left** | **Integer**| The left edge of the circular crop area in pixels (X). |
 **top** | **Integer**| The top edge of the circular crop area in pixels (Y). |
 **radius** | **Integer**| The radius of the circular crop area in pixels. |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editCropRectangle"></a>
# **editCropRectangle**
> byte[] editCropRectangle(left, top, width, height, imageFile)

Crop an image to a rectangular area

Crop an image to a target rectangular area

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
Integer left = 56; // Integer | The left edge of the rectangular crop area in pixels (X).
Integer top = 56; // Integer | The top edge of the rectangular crop area in pixels (Y).
Integer width = 56; // Integer | The width of the rectangular crop area in pixels.
Integer height = 56; // Integer | The height of the rectangular crop area in pixels.
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editCropRectangle(left, top, width, height, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editCropRectangle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **left** | **Integer**| The left edge of the rectangular crop area in pixels (X). |
 **top** | **Integer**| The top edge of the rectangular crop area in pixels (Y). |
 **width** | **Integer**| The width of the rectangular crop area in pixels. |
 **height** | **Integer**| The height of the rectangular crop area in pixels. |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editDrawPolygon"></a>
# **editDrawPolygon**
> byte[] editDrawPolygon(request)

Draw a polygon onto an image

Draw one or more polygons, with customized visuals, onto an image

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
DrawPolygonRequest request = new DrawPolygonRequest(); // DrawPolygonRequest | Polygon drawing request parameters
try {
    byte[] result = apiInstance.editDrawPolygon(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editDrawPolygon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DrawPolygonRequest**](DrawPolygonRequest.md)| Polygon drawing request parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDrawRectangle"></a>
# **editDrawRectangle**
> byte[] editDrawRectangle(request)

Draw a rectangle onto an image

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
DrawRectangleRequest request = new DrawRectangleRequest(); // DrawRectangleRequest | Draw rectangle parameters
try {
    byte[] result = apiInstance.editDrawRectangle(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editDrawRectangle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DrawRectangleRequest**](DrawRectangleRequest.md)| Draw rectangle parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDrawText"></a>
# **editDrawText**
> byte[] editDrawText(request)

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
DrawTextRequest request = new DrawTextRequest(); // DrawTextRequest | Draw text parameters
try {
    byte[] result = apiInstance.editDrawText(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editDrawText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DrawTextRequest**](DrawTextRequest.md)| Draw text parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editDropShadow"></a>
# **editDropShadow**
> byte[] editDropShadow(X, Y, sigma, opacity, imageFile)

Add a customizeable drop shadow to an image

Add a customizeable drop shadow to the image

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
Integer X = 56; // Integer | Horizontal (X) offset of the drop shadow
Integer Y = 56; // Integer | Vertical (Y) offset of the drop shadow
Integer sigma = 56; // Integer | Sigma (blur distance) of the drop shadow
Integer opacity = 56; // Integer | Opacity of the drop shadow; 0 is 0% and 100 is 100%
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editDropShadow(X, Y, sigma, opacity, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editDropShadow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X** | **Integer**| Horizontal (X) offset of the drop shadow |
 **Y** | **Integer**| Vertical (Y) offset of the drop shadow |
 **sigma** | **Integer**| Sigma (blur distance) of the drop shadow |
 **opacity** | **Integer**| Opacity of the drop shadow; 0 is 0% and 100 is 100% |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editInvert"></a>
# **editInvert**
> byte[] editInvert(imageFile)

Invert, negate the colors in the image

Inverts (negates) all of the colors in the image.  If the image contains transparency, the transparency will first be removed prior to inverting the image.

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
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editInvert(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editInvert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editRemoveExifData"></a>
# **editRemoveExifData**
> byte[] editRemoveExifData(imageFile)

Remove EXIF data from the image

Removes any EXIF data and profiles .

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
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editRemoveExifData(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editRemoveExifData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editRemoveTransparency"></a>
# **editRemoveTransparency**
> byte[] editRemoveTransparency(imageFile)

Remove transparency from the image

Removes any active transparency in the image.  Effectively renders the image at the same resolution, in the same file format, over a white background, thus removing transparency.

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
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editRemoveTransparency(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editRemoveTransparency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editRotate"></a>
# **editRotate**
> byte[] editRotate(degrees, imageFile)

Rotate an image any number of degrees

Rotates an image by an arbitrary number of degrees

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
Double degrees = 3.4D; // Double | Degrees to rotate the image; values range from 0.0 to 360.0.
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.editRotate(degrees, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditApi#editRotate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **degrees** | **Double**| Degrees to rotate the image; values range from 0.0 to 360.0. |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

