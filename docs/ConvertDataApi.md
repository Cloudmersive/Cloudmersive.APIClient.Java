# ConvertDataApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertDataCsvToJson**](ConvertDataApi.md#convertDataCsvToJson) | **POST** /convert/csv/to/json | CSV to JSON conversion
[**convertDataXlsToJson**](ConvertDataApi.md#convertDataXlsToJson) | **POST** /convert/xls/to/json | Excel (97-2003) XLS to JSON conversion
[**convertDataXlsxToJson**](ConvertDataApi.md#convertDataXlsxToJson) | **POST** /convert/xlsx/to/json | Excel XLSX to JSON conversion
[**convertDataXmlToJson**](ConvertDataApi.md#convertDataXmlToJson) | **POST** /convert/xml/to/json | XML to JSON conversion


<a name="convertDataCsvToJson"></a>
# **convertDataCsvToJson**
> Object convertDataCsvToJson(inputFile)

CSV to JSON conversion

Convert a CSV file to a JSON object array

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataCsvToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataCsvToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXlsToJson"></a>
# **convertDataXlsToJson**
> Object convertDataXlsToJson(inputFile)

Excel (97-2003) XLS to JSON conversion

Convert an Excel (97-2003) XLS file to a JSON object array

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataXlsToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXlsToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXlsxToJson"></a>
# **convertDataXlsxToJson**
> Object convertDataXlsxToJson(inputFile)

Excel XLSX to JSON conversion

Convert an Excel XLSX file to a JSON object array

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataXlsxToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXlsxToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlToJson"></a>
# **convertDataXmlToJson**
> Object convertDataXmlToJson(inputFile)

XML to JSON conversion

Convert an XML string or file into JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataXmlToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

