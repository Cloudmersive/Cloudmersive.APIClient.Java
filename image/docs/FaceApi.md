# FaceApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**faceCropFirst**](FaceApi.md#faceCropFirst) | **POST** /image/face/crop/first | Crop image to face (square)
[**faceCropFirstRound**](FaceApi.md#faceCropFirstRound) | **POST** /image/face/crop/first/round | Crop image to face (round)
[**faceLocate**](FaceApi.md#faceLocate) | **POST** /image/face/locate | Find faces in an image


<a name="faceCropFirst"></a>
# **faceCropFirst**
> Object faceCropFirst(imageFile)

Crop image to face (square)

Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.image.FaceApi;


FaceApi apiInstance = new FaceApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    Object result = apiInstance.faceCropFirst(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceApi#faceCropFirst");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: image/png

<a name="faceCropFirstRound"></a>
# **faceCropFirstRound**
> Object faceCropFirstRound(imageFile)

Crop image to face (round)

Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.image.FaceApi;


FaceApi apiInstance = new FaceApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    Object result = apiInstance.faceCropFirstRound(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceApi#faceCropFirstRound");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: image/png

<a name="faceLocate"></a>
# **faceLocate**
> FaceLocateResponse faceLocate(imageFile)

Find faces in an image

Locate the positions of all faces in an image

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.image.FaceApi;


FaceApi apiInstance = new FaceApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    FaceLocateResponse result = apiInstance.faceLocate(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceApi#faceLocate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**FaceLocateResponse**](FaceLocateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

