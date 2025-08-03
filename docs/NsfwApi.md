# NsfwApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nsfwClassify**](NsfwApi.md#nsfwClassify) | **POST** /image/nsfw/classify | Not safe for work (NSFW) content classification for Images
[**nsfwClassifyAdvanced**](NsfwApi.md#nsfwClassifyAdvanced) | **POST** /image/nsfw/classify/advanced | Advanced content moderation and not safe for work (NSFW) content classification for Images
[**nsfwClassifyDocument**](NsfwApi.md#nsfwClassifyDocument) | **POST** /image/nsfw/classify/document | Not safe for work (NSFW) content classification for Documents
[**nsfwClassifyVideo**](NsfwApi.md#nsfwClassifyVideo) | **POST** /image/nsfw/classify/video | Not safe for work (NSFW) content classification for Video


<a name="nsfwClassify"></a>
# **nsfwClassify**
> NsfwResult nsfwClassify(imageFile)

Not safe for work (NSFW) content classification for Images

Classify an image into Not Safe For Work (NSFW)/Pornographic/Nudity/Racy content and Safe Content.  Helpful for filtering out unsafe content when processing user images.  Input image should be JPG, PNG or GIF.  Consumes 20 API calls.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NsfwApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NsfwApi apiInstance = new NsfwApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    NsfwResult result = apiInstance.nsfwClassify(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsfwApi#nsfwClassify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**NsfwResult**](NsfwResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="nsfwClassifyAdvanced"></a>
# **nsfwClassifyAdvanced**
> NsfwAdvancedResult nsfwClassifyAdvanced(imageFile)

Advanced content moderation and not safe for work (NSFW) content classification for Images

Uses advanced AI to classify an image into Not Safe For Work (NSFW) or not and determine if it contains nudity, graphic violence, non-graphic violence, self-harm, hate, potential illegal activity, medical imagery, or profanity.  Helpful for filtering out unsafe content when processing user images.  Input image should be JPG, PNG.  Consumes 100 API calls.  Requires Managed Instance or Private Cloud deployment, and a GPU.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NsfwApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NsfwApi apiInstance = new NsfwApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    NsfwAdvancedResult result = apiInstance.nsfwClassifyAdvanced(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsfwApi#nsfwClassifyAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**NsfwAdvancedResult**](NsfwAdvancedResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="nsfwClassifyDocument"></a>
# **nsfwClassifyDocument**
> NsfwResult nsfwClassifyDocument(imageFile)

Not safe for work (NSFW) content classification for Documents

Classify a document (PDF, DOCX, DOC, XLSX, XLS, PPTX, PPT) into Not Safe For Work (NSFW)/Pornographic/Nudity/Racy content and Safe Content.  Helpful for filtering out unsafe content when processing user images.  Consumes 20 API calls per image.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NsfwApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NsfwApi apiInstance = new NsfwApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    NsfwResult result = apiInstance.nsfwClassifyDocument(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsfwApi#nsfwClassifyDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**NsfwResult**](NsfwResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="nsfwClassifyVideo"></a>
# **nsfwClassifyVideo**
> NsfwResult nsfwClassifyVideo(videoFile)

Not safe for work (NSFW) content classification for Video

Classify a video into Not Safe For Work (NSFW)/Pornographic/Nudity/Racy content and Safe Content.  Helpful for filtering out unsafe content when processing user images.  Input image should be MP4, MOV, WEBM, MKV, AVI, FLV, MPG, GIF.  Consumes 20 API calls per frame analyzed.  Requires Cloudmersive Managed Instance or Private Cloud deployment.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.NsfwApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

NsfwApi apiInstance = new NsfwApi();
File videoFile = new File("/path/to/file.txt"); // File | Video file to perform the operation on.  Common file formats such as MP4, MPG are supported.
try {
    NsfwResult result = apiInstance.nsfwClassifyVideo(videoFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsfwApi#nsfwClassifyVideo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoFile** | **File**| Video file to perform the operation on.  Common file formats such as MP4, MPG are supported. |

### Return type

[**NsfwResult**](NsfwResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

