# RecognizeApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recognizeDescribe**](RecognizeApi.md#recognizeDescribe) | **POST** image/recognize/describe | Describe an image in natural language
[**recognizeDetectObjects**](RecognizeApi.md#recognizeDetectObjects) | **POST** image/recognize/detect-objects | Detect objects, including types and locations, in an image
[**recognizeDetectPeople**](RecognizeApi.md#recognizeDetectPeople) | **POST** image/recognize/detect-people | Detect people, including locations, in an image


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

<a name="recognizeDetectObjects"></a>
# **recognizeDetectObjects**
> ObjectDetectionResult recognizeDetectObjects(imageFile)

Detect objects, including types and locations, in an image

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

Detect people, including locations, in an image

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

