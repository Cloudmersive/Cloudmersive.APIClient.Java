# GenerateBarcodeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateBarcodeCode128**](GenerateBarcodeApi.md#generateBarcodeCode128) | **POST** /barcode/generate/code-128 | Generate a EAN-13 code barcode as PNG file
[**generateBarcodeEAN13**](GenerateBarcodeApi.md#generateBarcodeEAN13) | **POST** /barcode/generate/ean-13 | Generate a EAN-13 code barcode as PNG file
[**generateBarcodeEAN8**](GenerateBarcodeApi.md#generateBarcodeEAN8) | **POST** /barcode/generate/ean-8 | Generate a EAN-8 code barcode as PNG file
[**generateBarcodeQRCode**](GenerateBarcodeApi.md#generateBarcodeQRCode) | **POST** /barcode/generate/qrcode | Generate a QR code barcode as PNG file
[**generateBarcodeUPCA**](GenerateBarcodeApi.md#generateBarcodeUPCA) | **POST** /barcode/generate/upc-a | Generate a UPC-A code barcode as PNG file
[**generateBarcodeUPCE**](GenerateBarcodeApi.md#generateBarcodeUPCE) | **POST** /barcode/generate/upc-e | Generate a UPC-E code barcode as PNG file


<a name="generateBarcodeCode128"></a>
# **generateBarcodeCode128**
> byte[] generateBarcodeCode128(value, width, height, includeLabel)

Generate a EAN-13 code barcode as PNG file

Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.GenerateBarcodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | Barcode value to generate from
Integer width = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Integer height = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Boolean includeLabel = true; // Boolean | Optional: show text label on the image of the barcode value, default is true.
try {
    byte[] result = apiInstance.generateBarcodeCode128(value, width, height, includeLabel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeCode128");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Barcode value to generate from |
 **width** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **height** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **includeLabel** | **Boolean**| Optional: show text label on the image of the barcode value, default is true. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="generateBarcodeEAN13"></a>
# **generateBarcodeEAN13**
> byte[] generateBarcodeEAN13(value, width, height, includeLabel)

Generate a EAN-13 code barcode as PNG file

Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.GenerateBarcodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | Barcode value to generate from
Integer width = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Integer height = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Boolean includeLabel = true; // Boolean | Optional: show text label on the image of the barcode value, default is true.
try {
    byte[] result = apiInstance.generateBarcodeEAN13(value, width, height, includeLabel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeEAN13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Barcode value to generate from |
 **width** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **height** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **includeLabel** | **Boolean**| Optional: show text label on the image of the barcode value, default is true. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="generateBarcodeEAN8"></a>
# **generateBarcodeEAN8**
> byte[] generateBarcodeEAN8(value, width, height, includeLabel)

Generate a EAN-8 code barcode as PNG file

Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.GenerateBarcodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | Barcode value to generate from
Integer width = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Integer height = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Boolean includeLabel = true; // Boolean | Optional: show text label on the image of the barcode value, default is true.
try {
    byte[] result = apiInstance.generateBarcodeEAN8(value, width, height, includeLabel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeEAN8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Barcode value to generate from |
 **width** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **height** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **includeLabel** | **Boolean**| Optional: show text label on the image of the barcode value, default is true. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="generateBarcodeQRCode"></a>
# **generateBarcodeQRCode**
> byte[] generateBarcodeQRCode(value, width, height)

Generate a QR code barcode as PNG file

Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.GenerateBarcodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | QR code text to convert into the QR code barcode
Integer width = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Integer height = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
try {
    byte[] result = apiInstance.generateBarcodeQRCode(value, width, height);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeQRCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| QR code text to convert into the QR code barcode |
 **width** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **height** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="generateBarcodeUPCA"></a>
# **generateBarcodeUPCA**
> byte[] generateBarcodeUPCA(value, width, height, includeLabel)

Generate a UPC-A code barcode as PNG file

Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.GenerateBarcodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | UPC-A barcode value to generate from
Integer width = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Integer height = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Boolean includeLabel = true; // Boolean | Optional: show text label on the image of the barcode value, default is true.
try {
    byte[] result = apiInstance.generateBarcodeUPCA(value, width, height, includeLabel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeUPCA");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| UPC-A barcode value to generate from |
 **width** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **height** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **includeLabel** | **Boolean**| Optional: show text label on the image of the barcode value, default is true. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="generateBarcodeUPCE"></a>
# **generateBarcodeUPCE**
> byte[] generateBarcodeUPCE(value, width, height, includeLabel)

Generate a UPC-E code barcode as PNG file

Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.GenerateBarcodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | UPC-E barcode value to generate from
Integer width = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Integer height = 56; // Integer | Optional: width of the barcode in pixels.  Minimum value of 10.
Boolean includeLabel = true; // Boolean | Optional: show text label on the image of the barcode value, default is true.
try {
    byte[] result = apiInstance.generateBarcodeUPCE(value, width, height, includeLabel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeUPCE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| UPC-E barcode value to generate from |
 **width** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **height** | **Integer**| Optional: width of the barcode in pixels.  Minimum value of 10. | [optional]
 **includeLabel** | **Boolean**| Optional: show text label on the image of the barcode value, default is true. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

