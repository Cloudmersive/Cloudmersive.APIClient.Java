# BackupConvertApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataintegrationBackupConvertMssqlBakGetTablesPost**](BackupConvertApi.md#dataintegrationBackupConvertMssqlBakGetTablesPost) | **POST** /dataintegration/backup/convert/mssql/bak/get/tables | Lists all tables stored in a SQL Server Backup (.BAK) file
[**dataintegrationBackupConvertMssqlBakToCsvPost**](BackupConvertApi.md#dataintegrationBackupConvertMssqlBakToCsvPost) | **POST** /dataintegration/backup/convert/mssql/bak/to/csv | Converts a SQL Server Backup (.BAK) file into CSV for a specified table


<a name="dataintegrationBackupConvertMssqlBakGetTablesPost"></a>
# **dataintegrationBackupConvertMssqlBakGetTablesPost**
> MssqlBakEnumerateTablesResult dataintegrationBackupConvertMssqlBakGetTablesPost(inputFile)

Lists all tables stored in a SQL Server Backup (.BAK) file

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.BackupConvertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

BackupConvertApi apiInstance = new BackupConvertApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on
try {
    MssqlBakEnumerateTablesResult result = apiInstance.dataintegrationBackupConvertMssqlBakGetTablesPost(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackupConvertApi#dataintegrationBackupConvertMssqlBakGetTablesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on | [optional]

### Return type

[**MssqlBakEnumerateTablesResult**](MssqlBakEnumerateTablesResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json

<a name="dataintegrationBackupConvertMssqlBakToCsvPost"></a>
# **dataintegrationBackupConvertMssqlBakToCsvPost**
> byte[] dataintegrationBackupConvertMssqlBakToCsvPost(tableName, inputFile)

Converts a SQL Server Backup (.BAK) file into CSV for a specified table

Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.BackupConvertApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

BackupConvertApi apiInstance = new BackupConvertApi();
String tableName = "tableName_example"; // String | Name of the table to return
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on
try {
    byte[] result = apiInstance.dataintegrationBackupConvertMssqlBakToCsvPost(tableName, inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BackupConvertApi#dataintegrationBackupConvertMssqlBakToCsvPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tableName** | **String**| Name of the table to return | [optional]
 **inputFile** | **File**| Input file to perform the operation on | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/csv

