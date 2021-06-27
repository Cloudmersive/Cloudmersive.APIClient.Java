# ScanCloudStorageApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scanCloudStorageScanAwsS3File**](ScanCloudStorageApi.md#scanCloudStorageScanAwsS3File) | **POST** /virus/scan/cloud-storage/aws-s3/single | Scan an AWS S3 file for viruses
[**scanCloudStorageScanAwsS3FileAdvanced**](ScanCloudStorageApi.md#scanCloudStorageScanAwsS3FileAdvanced) | **POST** /virus/scan/cloud-storage/aws-s3/single/advanced | Advanced Scan an AWS S3 file for viruses
[**scanCloudStorageScanAzureBlob**](ScanCloudStorageApi.md#scanCloudStorageScanAzureBlob) | **POST** /virus/scan/cloud-storage/azure-blob/single | Scan an Azure Blob for viruses
[**scanCloudStorageScanAzureBlobAdvanced**](ScanCloudStorageApi.md#scanCloudStorageScanAzureBlobAdvanced) | **POST** /virus/scan/cloud-storage/azure-blob/single/advanced | Advanced Scan an Azure Blob for viruses
[**scanCloudStorageScanGcpStorageFile**](ScanCloudStorageApi.md#scanCloudStorageScanGcpStorageFile) | **POST** /virus/scan/cloud-storage/gcp-storage/single | Scan an Google Cloud Platform (GCP) Storage file for viruses
[**scanCloudStorageScanGcpStorageFileAdvanced**](ScanCloudStorageApi.md#scanCloudStorageScanGcpStorageFileAdvanced) | **POST** /virus/scan/cloud-storage/gcp-storage/single/advanced | Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses


<a name="scanCloudStorageScanAwsS3File"></a>
# **scanCloudStorageScanAwsS3File**
> CloudStorageVirusScanResult scanCloudStorageScanAwsS3File(accessKey, secretKey, bucketRegion, bucketName, keyName)

Scan an AWS S3 file for viruses

Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ScanCloudStorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ScanCloudStorageApi apiInstance = new ScanCloudStorageApi();
String accessKey = "accessKey_example"; // String | AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
String secretKey = "secretKey_example"; // String | AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
String bucketRegion = "bucketRegion_example"; // String | Name of the region of the S3 bucket, such as 'US-East-1'
String bucketName = "bucketName_example"; // String | Name of the S3 bucket
String keyName = "keyName_example"; // String | Key name (also called file name) of the file in S3 that you wish to scan for viruses
try {
    CloudStorageVirusScanResult result = apiInstance.scanCloudStorageScanAwsS3File(accessKey, secretKey, bucketRegion, bucketName, keyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanCloudStorageApi#scanCloudStorageScanAwsS3File");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **String**| AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console |
 **secretKey** | **String**| AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console |
 **bucketRegion** | **String**| Name of the region of the S3 bucket, such as &#39;US-East-1&#39; |
 **bucketName** | **String**| Name of the S3 bucket |
 **keyName** | **String**| Key name (also called file name) of the file in S3 that you wish to scan for viruses |

### Return type

[**CloudStorageVirusScanResult**](CloudStorageVirusScanResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="scanCloudStorageScanAwsS3FileAdvanced"></a>
# **scanCloudStorageScanAwsS3FileAdvanced**
> CloudStorageAdvancedVirusScanResult scanCloudStorageScanAwsS3FileAdvanced(accessKey, secretKey, bucketRegion, bucketName, keyName, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, restrictFileTypes)

Advanced Scan an AWS S3 file for viruses

Advanced Scan the contents of a single AWS S3 file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ScanCloudStorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ScanCloudStorageApi apiInstance = new ScanCloudStorageApi();
String accessKey = "accessKey_example"; // String | AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
String secretKey = "secretKey_example"; // String | AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
String bucketRegion = "bucketRegion_example"; // String | Name of the region of the S3 bucket, such as 'US-East-1'
String bucketName = "bucketName_example"; // String | Name of the S3 bucket
String keyName = "keyName_example"; // String | Key name (also called file name) of the file in S3 that you wish to scan for viruses
Boolean allowExecutables = true; // Boolean | Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
Boolean allowInvalidFiles = true; // Boolean | Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
Boolean allowScripts = true; // Boolean | Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
Boolean allowPasswordProtectedFiles = true; // Boolean | Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
Boolean allowMacros = true; // Boolean | Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
String restrictFileTypes = "restrictFileTypes_example"; // String | Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult=false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
try {
    CloudStorageAdvancedVirusScanResult result = apiInstance.scanCloudStorageScanAwsS3FileAdvanced(accessKey, secretKey, bucketRegion, bucketName, keyName, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, restrictFileTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanCloudStorageApi#scanCloudStorageScanAwsS3FileAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **String**| AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console |
 **secretKey** | **String**| AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console |
 **bucketRegion** | **String**| Name of the region of the S3 bucket, such as &#39;US-East-1&#39; |
 **bucketName** | **String**| Name of the S3 bucket |
 **keyName** | **String**| Key name (also called file name) of the file in S3 that you wish to scan for viruses |
 **allowExecutables** | **Boolean**| Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). | [optional]
 **allowInvalidFiles** | **Boolean**| Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). | [optional]
 **allowScripts** | **Boolean**| Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **allowPasswordProtectedFiles** | **Boolean**| Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **allowMacros** | **Boolean**| Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **restrictFileTypes** | **String**| Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. | [optional]

### Return type

[**CloudStorageAdvancedVirusScanResult**](CloudStorageAdvancedVirusScanResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="scanCloudStorageScanAzureBlob"></a>
# **scanCloudStorageScanAzureBlob**
> CloudStorageVirusScanResult scanCloudStorageScanAzureBlob(connectionString, containerName, blobPath)

Scan an Azure Blob for viruses

Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ScanCloudStorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ScanCloudStorageApi apiInstance = new ScanCloudStorageApi();
String connectionString = "connectionString_example"; // String | Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
String containerName = "containerName_example"; // String | Name of the Blob container within the Azure Blob Storage account
String blobPath = "blobPath_example"; // String | Path to the blob within the container, such as 'hello.pdf' or '/folder/subfolder/world.pdf'
try {
    CloudStorageVirusScanResult result = apiInstance.scanCloudStorageScanAzureBlob(connectionString, containerName, blobPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanCloudStorageApi#scanCloudStorageScanAzureBlob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionString** | **String**| Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal. |
 **containerName** | **String**| Name of the Blob container within the Azure Blob Storage account |
 **blobPath** | **String**| Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39; |

### Return type

[**CloudStorageVirusScanResult**](CloudStorageVirusScanResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="scanCloudStorageScanAzureBlobAdvanced"></a>
# **scanCloudStorageScanAzureBlobAdvanced**
> CloudStorageAdvancedVirusScanResult scanCloudStorageScanAzureBlobAdvanced(connectionString, containerName, blobPath, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, restrictFileTypes)

Advanced Scan an Azure Blob for viruses

Advanced Scan the contents of a single Azure Blob and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ScanCloudStorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ScanCloudStorageApi apiInstance = new ScanCloudStorageApi();
String connectionString = "connectionString_example"; // String | Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
String containerName = "containerName_example"; // String | Name of the Blob container within the Azure Blob Storage account
String blobPath = "blobPath_example"; // String | Path to the blob within the container, such as 'hello.pdf' or '/folder/subfolder/world.pdf'
Boolean allowExecutables = true; // Boolean | Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
Boolean allowInvalidFiles = true; // Boolean | Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
Boolean allowScripts = true; // Boolean | Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
Boolean allowPasswordProtectedFiles = true; // Boolean | Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
Boolean allowMacros = true; // Boolean | Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
String restrictFileTypes = "restrictFileTypes_example"; // String | Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult=false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
try {
    CloudStorageAdvancedVirusScanResult result = apiInstance.scanCloudStorageScanAzureBlobAdvanced(connectionString, containerName, blobPath, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, restrictFileTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanCloudStorageApi#scanCloudStorageScanAzureBlobAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionString** | **String**| Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal. |
 **containerName** | **String**| Name of the Blob container within the Azure Blob Storage account |
 **blobPath** | **String**| Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39; |
 **allowExecutables** | **Boolean**| Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). | [optional]
 **allowInvalidFiles** | **Boolean**| Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). | [optional]
 **allowScripts** | **Boolean**| Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **allowPasswordProtectedFiles** | **Boolean**| Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **allowMacros** | **Boolean**| Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **restrictFileTypes** | **String**| Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. | [optional]

### Return type

[**CloudStorageAdvancedVirusScanResult**](CloudStorageAdvancedVirusScanResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="scanCloudStorageScanGcpStorageFile"></a>
# **scanCloudStorageScanGcpStorageFile**
> CloudStorageVirusScanResult scanCloudStorageScanGcpStorageFile(bucketName, objectName, jsonCredentialFile)

Scan an Google Cloud Platform (GCP) Storage file for viruses

Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ScanCloudStorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ScanCloudStorageApi apiInstance = new ScanCloudStorageApi();
String bucketName = "bucketName_example"; // String | Name of the bucket in Google Cloud Storage
String objectName = "objectName_example"; // String | Name of the object or file in Google Cloud Storage
File jsonCredentialFile = new File("/path/to/file.txt"); // File | Service Account credential for Google Cloud stored in a JSON file.
try {
    CloudStorageVirusScanResult result = apiInstance.scanCloudStorageScanGcpStorageFile(bucketName, objectName, jsonCredentialFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanCloudStorageApi#scanCloudStorageScanGcpStorageFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| Name of the bucket in Google Cloud Storage |
 **objectName** | **String**| Name of the object or file in Google Cloud Storage |
 **jsonCredentialFile** | **File**| Service Account credential for Google Cloud stored in a JSON file. |

### Return type

[**CloudStorageVirusScanResult**](CloudStorageVirusScanResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="scanCloudStorageScanGcpStorageFileAdvanced"></a>
# **scanCloudStorageScanGcpStorageFileAdvanced**
> CloudStorageAdvancedVirusScanResult scanCloudStorageScanGcpStorageFileAdvanced(bucketName, objectName, jsonCredentialFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, restrictFileTypes)

Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses

Advanced Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ScanCloudStorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ScanCloudStorageApi apiInstance = new ScanCloudStorageApi();
String bucketName = "bucketName_example"; // String | Name of the bucket in Google Cloud Storage
String objectName = "objectName_example"; // String | Name of the object or file in Google Cloud Storage
File jsonCredentialFile = new File("/path/to/file.txt"); // File | Service Account credential for Google Cloud stored in a JSON file.
Boolean allowExecutables = true; // Boolean | Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
Boolean allowInvalidFiles = true; // Boolean | Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
Boolean allowScripts = true; // Boolean | Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
Boolean allowPasswordProtectedFiles = true; // Boolean | Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
Boolean allowMacros = true; // Boolean | Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
String restrictFileTypes = "restrictFileTypes_example"; // String | Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult=false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
try {
    CloudStorageAdvancedVirusScanResult result = apiInstance.scanCloudStorageScanGcpStorageFileAdvanced(bucketName, objectName, jsonCredentialFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, restrictFileTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanCloudStorageApi#scanCloudStorageScanGcpStorageFileAdvanced");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**| Name of the bucket in Google Cloud Storage |
 **objectName** | **String**| Name of the object or file in Google Cloud Storage |
 **jsonCredentialFile** | **File**| Service Account credential for Google Cloud stored in a JSON file. |
 **allowExecutables** | **Boolean**| Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). | [optional]
 **allowInvalidFiles** | **Boolean**| Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). | [optional]
 **allowScripts** | **Boolean**| Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **allowPasswordProtectedFiles** | **Boolean**| Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **allowMacros** | **Boolean**| Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). | [optional]
 **restrictFileTypes** | **String**| Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. | [optional]

### Return type

[**CloudStorageAdvancedVirusScanResult**](CloudStorageAdvancedVirusScanResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

