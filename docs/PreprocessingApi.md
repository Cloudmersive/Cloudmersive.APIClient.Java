# PreprocessingApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preprocessingBinarize**](PreprocessingApi.md#preprocessingBinarize) | **POST** /ocr/preprocessing/image/binarize | Convert an image of text into a binarized (light and dark) view
[**preprocessingBinarizeAdvanced**](PreprocessingApi.md#preprocessingBinarizeAdvanced) | **POST** /ocr/preprocessing/image/binarize/advanced | Convert an image of text into a binary (light and dark) view with ML
[**preprocessingGetPageAngle**](PreprocessingApi.md#preprocessingGetPageAngle) | **POST** /ocr/preprocessing/image/get-page-angle | Get the angle of the page / document / receipt
[**preprocessingUnrotate**](PreprocessingApi.md#preprocessingUnrotate) | **POST** /ocr/preprocessing/image/unrotate | Detect and unrotate a document image
[**preprocessingUnrotateAdvanced**](PreprocessingApi.md#preprocessingUnrotateAdvanced) | **POST** /ocr/preprocessing/image/unrotate/advanced | Detect and unrotate a document image (advanced)
[**preprocessingUnskew**](PreprocessingApi.md#preprocessingUnskew) | **POST** /ocr/preprocessing/image/unskew | Detect and unskew a photo of a document


<a name="preprocessingBinarize"></a>
# **preprocessingBinarize**
> byte[] preprocessingBinarize(imageFile)

Convert an image of text into a binarized (light and dark) view

Perform an adaptive binarization algorithm on the input image to prepare it for further OCR operations.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PreprocessingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PreprocessingApi apiInstance = new PreprocessingApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.preprocessingBinarize(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreprocessingApi#preprocessingBinarize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="preprocessingBinarizeAdvanced"></a>
# **preprocessingBinarizeAdvanced**
> byte[] preprocessingBinarizeAdvanced(imageFile)

Convert an image of text into a binary (light and dark) view with ML

Perform an advanced adaptive, Deep Learning-based binarization algorithm on the input image to prepare it for further OCR operations.  Provides enhanced accuracy than adaptive binarization.  Image will be upsampled to 300 DPI if it has a DPI below 300.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PreprocessingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PreprocessingApi apiInstance = new PreprocessingApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.preprocessingBinarizeAdvanced(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreprocessingApi#preprocessingBinarizeAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="preprocessingGetPageAngle"></a>
# **preprocessingGetPageAngle**
> GetPageAngleResult preprocessingGetPageAngle(imageFile)

Get the angle of the page / document / receipt

Analyzes a photo or image of a document and identifies the rotation angle of the page.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PreprocessingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PreprocessingApi apiInstance = new PreprocessingApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
try {
    GetPageAngleResult result = apiInstance.preprocessingGetPageAngle(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreprocessingApi#preprocessingGetPageAngle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**GetPageAngleResult**](GetPageAngleResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="preprocessingUnrotate"></a>
# **preprocessingUnrotate**
> byte[] preprocessingUnrotate(imageFile)

Detect and unrotate a document image

Detect and unrotate an image of a document (e.g. that was scanned at an angle).  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PreprocessingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PreprocessingApi apiInstance = new PreprocessingApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.preprocessingUnrotate(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreprocessingApi#preprocessingUnrotate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="preprocessingUnrotateAdvanced"></a>
# **preprocessingUnrotateAdvanced**
> byte[] preprocessingUnrotateAdvanced(imageFile)

Detect and unrotate a document image (advanced)

Detect and unrotate an image of a document (e.g. that was scanned at an angle) using deep learning.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PreprocessingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PreprocessingApi apiInstance = new PreprocessingApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.preprocessingUnrotateAdvanced(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreprocessingApi#preprocessingUnrotateAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="preprocessingUnskew"></a>
# **preprocessingUnskew**
> byte[] preprocessingUnskew(imageFile)

Detect and unskew a photo of a document

Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.PreprocessingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

PreprocessingApi apiInstance = new PreprocessingApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
try {
    byte[] result = apiInstance.preprocessingUnskew(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreprocessingApi#preprocessingUnskew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

