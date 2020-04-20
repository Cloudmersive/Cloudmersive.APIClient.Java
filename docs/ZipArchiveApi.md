# ZipArchiveApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zipArchiveZipCreate**](ZipArchiveApi.md#zipArchiveZipCreate) | **POST** /convert/archive/zip/create | Compress files to create a new zip archive
[**zipArchiveZipCreateAdvanced**](ZipArchiveApi.md#zipArchiveZipCreateAdvanced) | **POST** /convert/archive/zip/create/advanced | Compress files and folders to create a new zip archive with advanced options
[**zipArchiveZipDecrypt**](ZipArchiveApi.md#zipArchiveZipDecrypt) | **POST** /convert/archive/zip/decrypt | Decrypt and remove password protection on a zip file
[**zipArchiveZipEncryptAdvanced**](ZipArchiveApi.md#zipArchiveZipEncryptAdvanced) | **POST** /convert/archive/zip/encrypt/advanced | Encrypt and password protect a zip file
[**zipArchiveZipExtract**](ZipArchiveApi.md#zipArchiveZipExtract) | **POST** /convert/archive/zip/extract | Extract, decompress files and folders from a zip archive


<a name="zipArchiveZipCreate"></a>
# **zipArchiveZipCreate**
> byte[] zipArchiveZipCreate(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10)

Compress files to create a new zip archive

Create a new zip archive by compressing input files.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ZipArchiveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ZipArchiveApi apiInstance = new ZipArchiveApi();
File inputFile1 = new File("/path/to/file.txt"); // File | First input file to perform the operation on.
File inputFile2 = new File("/path/to/file.txt"); // File | Second input file to perform the operation on.
File inputFile3 = new File("/path/to/file.txt"); // File | Third input file to perform the operation on.
File inputFile4 = new File("/path/to/file.txt"); // File | Fourth input file to perform the operation on.
File inputFile5 = new File("/path/to/file.txt"); // File | Fifth input file to perform the operation on.
File inputFile6 = new File("/path/to/file.txt"); // File | Sixth input file to perform the operation on.
File inputFile7 = new File("/path/to/file.txt"); // File | Seventh input file to perform the operation on.
File inputFile8 = new File("/path/to/file.txt"); // File | Eighth input file to perform the operation on.
File inputFile9 = new File("/path/to/file.txt"); // File | Ninth input file to perform the operation on.
File inputFile10 = new File("/path/to/file.txt"); // File | Tenth input file to perform the operation on.
try {
    byte[] result = apiInstance.zipArchiveZipCreate(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile1** | **File**| First input file to perform the operation on. |
 **inputFile2** | **File**| Second input file to perform the operation on. | [optional]
 **inputFile3** | **File**| Third input file to perform the operation on. | [optional]
 **inputFile4** | **File**| Fourth input file to perform the operation on. | [optional]
 **inputFile5** | **File**| Fifth input file to perform the operation on. | [optional]
 **inputFile6** | **File**| Sixth input file to perform the operation on. | [optional]
 **inputFile7** | **File**| Seventh input file to perform the operation on. | [optional]
 **inputFile8** | **File**| Eighth input file to perform the operation on. | [optional]
 **inputFile9** | **File**| Ninth input file to perform the operation on. | [optional]
 **inputFile10** | **File**| Tenth input file to perform the operation on. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="zipArchiveZipCreateAdvanced"></a>
# **zipArchiveZipCreateAdvanced**
> Object zipArchiveZipCreateAdvanced(request)

Compress files and folders to create a new zip archive with advanced options

Create a new zip archive by compressing input files, folders and leverage advanced options to control the structure of the resulting zip archive.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ZipArchiveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ZipArchiveApi apiInstance = new ZipArchiveApi();
CreateZipArchiveRequest request = new CreateZipArchiveRequest(); // CreateZipArchiveRequest | Input request
try {
    Object result = apiInstance.zipArchiveZipCreateAdvanced(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipCreateAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateZipArchiveRequest**](CreateZipArchiveRequest.md)| Input request |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="zipArchiveZipDecrypt"></a>
# **zipArchiveZipDecrypt**
> Object zipArchiveZipDecrypt(inputFile, zipPassword)

Decrypt and remove password protection on a zip file

Decrypts and removes password protection from an encrypted zip file with the specified password

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ZipArchiveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ZipArchiveApi apiInstance = new ZipArchiveApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String zipPassword = "zipPassword_example"; // String | Required; Password for the input archive
try {
    Object result = apiInstance.zipArchiveZipDecrypt(inputFile, zipPassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipDecrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **zipPassword** | **String**| Required; Password for the input archive |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="zipArchiveZipEncryptAdvanced"></a>
# **zipArchiveZipEncryptAdvanced**
> Object zipArchiveZipEncryptAdvanced(encryptionRequest)

Encrypt and password protect a zip file

Encrypts and password protects an existing zip file with the specified password and encryption algorithm

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ZipArchiveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ZipArchiveApi apiInstance = new ZipArchiveApi();
ZipEncryptionAdvancedRequest encryptionRequest = new ZipEncryptionAdvancedRequest(); // ZipEncryptionAdvancedRequest | Encryption request
try {
    Object result = apiInstance.zipArchiveZipEncryptAdvanced(encryptionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipEncryptAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptionRequest** | [**ZipEncryptionAdvancedRequest**](ZipEncryptionAdvancedRequest.md)| Encryption request |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="zipArchiveZipExtract"></a>
# **zipArchiveZipExtract**
> ZipExtractResponse zipArchiveZipExtract(inputFile)

Extract, decompress files and folders from a zip archive

Extracts a zip archive by decompressing files, and folders.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ZipArchiveApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ZipArchiveApi apiInstance = new ZipArchiveApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    ZipExtractResponse result = apiInstance.zipArchiveZipExtract(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipArchiveApi#zipArchiveZipExtract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**ZipExtractResponse**](ZipExtractResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

