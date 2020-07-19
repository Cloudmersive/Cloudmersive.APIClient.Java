# VideoApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoConvertToGif**](VideoApi.md#videoConvertToGif) | **POST** /video/convert/to/gif | Convert Video to Animated GIF format.
[**videoConvertToMov**](VideoApi.md#videoConvertToMov) | **POST** /video/convert/to/mov | Convert Video to MOV format.
[**videoConvertToMp4**](VideoApi.md#videoConvertToMp4) | **POST** /video/convert/to/mp4 | Convert Video to MP4 format.
[**videoConvertToWebm**](VideoApi.md#videoConvertToWebm) | **POST** /video/convert/to/webm | Convert Video to WEBM format.
[**videoGetInfo**](VideoApi.md#videoGetInfo) | **POST** /video/convert/get-info | Get detailed information about a video or audio file


<a name="videoConvertToGif"></a>
# **videoConvertToGif**
> byte[] videoConvertToGif(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, extendProcessingTime, startTime, timeSpan)

Convert Video to Animated GIF format.

Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.VideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

VideoApi apiInstance = new VideoApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels.
Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels.
Boolean preserveAspectRatio = true; // Boolean | Optional; If false, the original video's aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to 24 frames per second.
Boolean extendProcessingTime = true; // Boolean | Optional; If true, will allow additional processing time for the video file conversion, using one API call per additional minute over the 5 minute default processing time, up to a maximum of 25 total minutes. This is generally necessary for files larger than 500 MB or longer than 30 minutes.
OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Optional; Specify the desired starting time of the GIF video in TimeSpan format.
OffsetDateTime timeSpan = OffsetDateTime.now(); // OffsetDateTime | Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 minutes.
try {
    byte[] result = apiInstance.videoConvertToGif(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, extendProcessingTime, startTime, timeSpan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoApi#videoConvertToGif");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional]
 **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels. | [optional]
 **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels. | [optional]
 **preserveAspectRatio** | **Boolean**| Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. | [optional]
 **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to 24 frames per second. | [optional]
 **extendProcessingTime** | **Boolean**| Optional; If true, will allow additional processing time for the video file conversion, using one API call per additional minute over the 5 minute default processing time, up to a maximum of 25 total minutes. This is generally necessary for files larger than 500 MB or longer than 30 minutes. | [optional]
 **startTime** | **OffsetDateTime**| Optional; Specify the desired starting time of the GIF video in TimeSpan format. | [optional]
 **timeSpan** | **OffsetDateTime**| Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 minutes. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="videoConvertToMov"></a>
# **videoConvertToMov**
> byte[] videoConvertToMov(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime)

Convert Video to MOV format.

Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Maximum output file size is 50GB.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.VideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

VideoApi apiInstance = new VideoApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
Boolean preserveAspectRatio = true; // Boolean | Optional; If false, the original video's aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
Integer quality = 56; // Integer | Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
Boolean extendProcessingTime = true; // Boolean | Optional; If true, will allow additional processing time for the video file conversion, using one API call per additional minute over the 5 minute default processing time, up to a maximum of 25 total minutes. This is generally necessary for files larger than 500 MB or longer than 30 minutes.
try {
    byte[] result = apiInstance.videoConvertToMov(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoApi#videoConvertToMov");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional]
 **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional]
 **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional]
 **preserveAspectRatio** | **Boolean**| Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. | [optional]
 **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to original video frame rate. | [optional]
 **quality** | **Integer**| Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. | [optional]
 **extendProcessingTime** | **Boolean**| Optional; If true, will allow additional processing time for the video file conversion, using one API call per additional minute over the 5 minute default processing time, up to a maximum of 25 total minutes. This is generally necessary for files larger than 500 MB or longer than 30 minutes. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="videoConvertToMp4"></a>
# **videoConvertToMp4**
> byte[] videoConvertToMp4(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime)

Convert Video to MP4 format.

Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Maximum output file size is 50GB.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.VideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

VideoApi apiInstance = new VideoApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
Boolean preserveAspectRatio = true; // Boolean | Optional; If false, the original video's aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
Integer quality = 56; // Integer | Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
Boolean extendProcessingTime = true; // Boolean | Optional; If true, will allow additional processing time for the video file conversion, using one API call per additional minute over the 5 minute default processing time, up to a maximum of 25 total minutes. This is generally necessary for files larger than 500 MB or longer than 30 minutes.
try {
    byte[] result = apiInstance.videoConvertToMp4(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoApi#videoConvertToMp4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional]
 **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional]
 **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional]
 **preserveAspectRatio** | **Boolean**| Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. | [optional]
 **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to original video frame rate. | [optional]
 **quality** | **Integer**| Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. | [optional]
 **extendProcessingTime** | **Boolean**| Optional; If true, will allow additional processing time for the video file conversion, using one API call per additional minute over the 5 minute default processing time, up to a maximum of 25 total minutes. This is generally necessary for files larger than 500 MB or longer than 30 minutes. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="videoConvertToWebm"></a>
# **videoConvertToWebm**
> byte[] videoConvertToWebm(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime)

Convert Video to WEBM format.

Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Maximum output file size is 50GB.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.VideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

VideoApi apiInstance = new VideoApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
Integer maxWidth = 56; // Integer | Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
Integer maxHeight = 56; // Integer | Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
Boolean preserveAspectRatio = true; // Boolean | Optional; If false, the original video's aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
Integer frameRate = 56; // Integer | Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
Integer quality = 56; // Integer | Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
Boolean extendProcessingTime = true; // Boolean | Optional; If true, will allow additional processing time for the video file conversion, using one API call per additional minute over the 5 minute default processing time, up to a maximum of 25 total minutes. This is generally necessary for files larger than 500 MB or longer than 30 minutes.
try {
    byte[] result = apiInstance.videoConvertToWebm(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoApi#videoConvertToWebm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional]
 **maxWidth** | **Integer**| Optional; Maximum width of the output video, up to the original video width. Defaults to original video width. | [optional]
 **maxHeight** | **Integer**| Optional; Maximum height of the output video, up to the original video width. Defaults to original video height. | [optional]
 **preserveAspectRatio** | **Boolean**| Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true. | [optional]
 **frameRate** | **Integer**| Optional; Specify the frame rate of the output video. Defaults to original video frame rate. | [optional]
 **quality** | **Integer**| Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50. | [optional]
 **extendProcessingTime** | **Boolean**| Optional; If true, will allow additional processing time for the video file conversion, using one API call per additional minute over the 5 minute default processing time, up to a maximum of 25 total minutes. This is generally necessary for files larger than 500 MB or longer than 30 minutes. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="videoGetInfo"></a>
# **videoGetInfo**
> byte[] videoGetInfo(inputFile, fileUrl)

Get detailed information about a video or audio file

Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.VideoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

VideoApi apiInstance = new VideoApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String fileUrl = "fileUrl_example"; // String | Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
try {
    byte[] result = apiInstance.videoGetInfo(inputFile, fileUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoApi#videoGetInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **fileUrl** | **String**| Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

