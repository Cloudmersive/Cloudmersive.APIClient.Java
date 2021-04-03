# RecognizeApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recognizeDescribe**](RecognizeApi.md#recognizeDescribe) | **POST** /image/recognize/describe | Describe an image in natural language
[**recognizeDetectAndUnskewDocument**](RecognizeApi.md#recognizeDetectAndUnskewDocument) | **POST** /image/recognize/detect-document/unskew | Detect and unskew a photo of a document
[**recognizeDetectObjects**](RecognizeApi.md#recognizeDetectObjects) | **POST** /image/recognize/detect-objects | Detect objects including types and locations in an image
[**recognizeDetectPeople**](RecognizeApi.md#recognizeDetectPeople) | **POST** /image/recognize/detect-people | Detect people including locations in an image
[**recognizeDetectTextFine**](RecognizeApi.md#recognizeDetectTextFine) | **POST** /image/recognize/detect-text/fine | Detect fine text in a photo of a document
[**recognizeDetectTextLarge**](RecognizeApi.md#recognizeDetectTextLarge) | **POST** /image/recognize/detect-text/large | Detect large text in a photo
[**recognizeDetectVehicleLicensePlates**](RecognizeApi.md#recognizeDetectVehicleLicensePlates) | **POST** /image/recognize/detect-vehicle-license-plates | Detect vehicle license plates in an image
[**recognizeFindSymbol**](RecognizeApi.md#recognizeFindSymbol) | **POST** /image/recognize/find/symbol | Find the location of a symbol in an image
[**recognizeSimilarityCompare**](RecognizeApi.md#recognizeSimilarityCompare) | **POST** /image/recognize/similarity/compare | Compare two images for similarity
[**recognizeSimilarityHash**](RecognizeApi.md#recognizeSimilarityHash) | **POST** /image/recognize/similarity/hash | Generate a perceptual image hash
[**recognizeSimilarityHashDistance**](RecognizeApi.md#recognizeSimilarityHashDistance) | **POST** /image/recognize/similarity/hash/distance | Calculates the similarity between two perceptual image hashes


<a name="recognizeDescribe"></a>
# **recognizeDescribe**
> ImageDescriptionResponse recognizeDescribe(imageFile)

Describe an image in natural language

Generate an English language text description of the image as a sentence.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    ImageDescriptionResponse result = apiInstance.recognizeDescribe(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeDescribe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**ImageDescriptionResponse**](ImageDescriptionResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeDetectAndUnskewDocument"></a>
# **recognizeDetectAndUnskewDocument**
> byte[] recognizeDetectAndUnskewDocument(imageFile, postProcessingEffect)

Detect and unskew a photo of a document

Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
String postProcessingEffect = "postProcessingEffect_example"; // String | Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations).
try {
    byte[] result = apiInstance.recognizeDetectAndUnskewDocument(imageFile, postProcessingEffect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeDetectAndUnskewDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |
 **postProcessingEffect** | **String**| Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations). | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeDetectObjects"></a>
# **recognizeDetectObjects**
> ObjectDetectionResult recognizeDetectObjects(imageFile)

Detect objects including types and locations in an image

Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    ObjectDetectionResult result = apiInstance.recognizeDetectObjects(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeDetectObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**ObjectDetectionResult**](ObjectDetectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeDetectPeople"></a>
# **recognizeDetectPeople**
> ObjectDetectionResult recognizeDetectPeople(imageFile)

Detect people including locations in an image

Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    ObjectDetectionResult result = apiInstance.recognizeDetectPeople(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeDetectPeople");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**ObjectDetectionResult**](ObjectDetectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeDetectTextFine"></a>
# **recognizeDetectTextFine**
> FineTextDetectionResult recognizeDetectTextFine(imageFile)

Detect fine text in a photo of a document

Identify the position, and size of small/fine text within a photograph of a document.  Identify the location of small text in a photo - such as words and other forms of high density text.  Can be used on a scan of a document or a photograph (e.g. smartphone camera) of a document, page or receipt.  For OCR purposes - please see our Deep Learning OCR APIs.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    FineTextDetectionResult result = apiInstance.recognizeDetectTextFine(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeDetectTextFine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**FineTextDetectionResult**](FineTextDetectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeDetectTextLarge"></a>
# **recognizeDetectTextLarge**
> TextDetectionResult recognizeDetectTextLarge(imageFile)

Detect large text in a photo

Identify the position, and size of large text within a photograph.  Identify the location of large text in a photo - such as signs, titles, etc. and other forms of large, low-density text.  Not suitable for high-density text (e.g. scans of documents, receipts, etc.) for OCR purposes - for OCR, please see our Deep Learning OCR APIs.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    TextDetectionResult result = apiInstance.recognizeDetectTextLarge(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeDetectTextLarge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**TextDetectionResult**](TextDetectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeDetectVehicleLicensePlates"></a>
# **recognizeDetectVehicleLicensePlates**
> VehicleLicensePlateDetectionResult recognizeDetectVehicleLicensePlates(imageFile)

Detect vehicle license plates in an image

Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.  Supported image formats are JPG, PNG and BMP.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    VehicleLicensePlateDetectionResult result = apiInstance.recognizeDetectVehicleLicensePlates(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeDetectVehicleLicensePlates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**VehicleLicensePlateDetectionResult**](VehicleLicensePlateDetectionResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeFindSymbol"></a>
# **recognizeFindSymbol**
> FindSymbolResult recognizeFindSymbol(inputImage, targetImage)

Find the location of a symbol in an image

Determine if an image contains a symbol, and if so, the location of that symbol in the image.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File inputImage = new File("/path/to/file.txt"); // File | Image file to search through for the target image.
File targetImage = new File("/path/to/file.txt"); // File | Image to find in the input image.
try {
    FindSymbolResult result = apiInstance.recognizeFindSymbol(inputImage, targetImage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeFindSymbol");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputImage** | **File**| Image file to search through for the target image. |
 **targetImage** | **File**| Image to find in the input image. |

### Return type

[**FindSymbolResult**](FindSymbolResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeSimilarityCompare"></a>
# **recognizeSimilarityCompare**
> byte[] recognizeSimilarityCompare(baseImage, comparisonImage, recognitionMode)

Compare two images for similarity

Generates an image similarity score using Deep Learning between 0.0 and 1.0, values closer to 1.0 indicate greater similarity

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File baseImage = new File("/path/to/file.txt"); // File | Image file to compare against.  Common file formats such as PNG, JPEG are supported.
File comparisonImage = new File("/path/to/file.txt"); // File | Image to compare to the base image.
String recognitionMode = "recognitionMode_example"; // String | Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal.
try {
    byte[] result = apiInstance.recognizeSimilarityCompare(baseImage, comparisonImage, recognitionMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeSimilarityCompare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseImage** | **File**| Image file to compare against.  Common file formats such as PNG, JPEG are supported. |
 **comparisonImage** | **File**| Image to compare to the base image. |
 **recognitionMode** | **String**| Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeSimilarityHash"></a>
# **recognizeSimilarityHash**
> ImageSimilarityHashResponse recognizeSimilarityHash(imageFile, recognitionMode)

Generate a perceptual image hash

Generates a hash value for the image; hash values that are closer together in terms of Hamming Distance are more similar.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
String recognitionMode = "recognitionMode_example"; // String | Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal.
try {
    ImageSimilarityHashResponse result = apiInstance.recognizeSimilarityHash(imageFile, recognitionMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeSimilarityHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |
 **recognitionMode** | **String**| Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal. | [optional]

### Return type

[**ImageSimilarityHashResponse**](ImageSimilarityHashResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recognizeSimilarityHashDistance"></a>
# **recognizeSimilarityHashDistance**
> ImageSimilarityHashDistanceResponse recognizeSimilarityHashDistance(request)

Calculates the similarity between two perceptual image hashes

Calculates the similarity between two perceptual image hashes by computing the Hamming Distance between them.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.RecognizeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

RecognizeApi apiInstance = new RecognizeApi();
ImageSimilarityHashDistanceRequest request = new ImageSimilarityHashDistanceRequest(); // ImageSimilarityHashDistanceRequest | 
try {
    ImageSimilarityHashDistanceResponse result = apiInstance.recognizeSimilarityHashDistance(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognizeApi#recognizeSimilarityHashDistance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ImageSimilarityHashDistanceRequest**](ImageSimilarityHashDistanceRequest.md)|  |

### Return type

[**ImageSimilarityHashDistanceResponse**](ImageSimilarityHashDistanceResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

