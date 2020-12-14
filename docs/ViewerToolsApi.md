# ViewerToolsApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**viewerToolsCreateSimple**](ViewerToolsApi.md#viewerToolsCreateSimple) | **POST** /convert/viewer/create/web/simple | Create a web-based viewer


<a name="viewerToolsCreateSimple"></a>
# **viewerToolsCreateSimple**
> ViewerResponse viewerToolsCreateSimple(inputFile, width, height)

Create a web-based viewer

Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ViewerToolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ViewerToolsApi apiInstance = new ViewerToolsApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
Integer width = 56; // Integer | Optional; width of the output viewer in pixels
Integer height = 56; // Integer | Optional; height of the output viewer in pixels
try {
    ViewerResponse result = apiInstance.viewerToolsCreateSimple(inputFile, width, height);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ViewerToolsApi#viewerToolsCreateSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **width** | **Integer**| Optional; width of the output viewer in pixels | [optional]
 **height** | **Integer**| Optional; height of the output viewer in pixels | [optional]

### Return type

[**ViewerResponse**](ViewerResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

