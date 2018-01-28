# GenerateBarcodeApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateBarcodeEAN13**](GenerateBarcodeApi.md#generateBarcodeEAN13) | **POST** /barcode/generate/ean-13 | Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
[**generateBarcodeEAN8**](GenerateBarcodeApi.md#generateBarcodeEAN8) | **POST** /barcode/generate/ean-8 | Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
[**generateBarcodeQRCode**](GenerateBarcodeApi.md#generateBarcodeQRCode) | **POST** /barcode/generate/qrcode | Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
[**generateBarcodeUPCA**](GenerateBarcodeApi.md#generateBarcodeUPCA) | **POST** /barcode/generate/upc-a | Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
[**generateBarcodeUPCE**](GenerateBarcodeApi.md#generateBarcodeUPCE) | **POST** /barcode/generate/upc-e | Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode


<a name="generateBarcodeEAN13"></a>
# **generateBarcodeEAN13**
> generateBarcodeEAN13(value)

Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.barcode.GenerateBarcodeApi;


GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | Barcode value to generate from
try {
    apiInstance.generateBarcodeEAN13(value);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeEAN13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Barcode value to generate from |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="generateBarcodeEAN8"></a>
# **generateBarcodeEAN8**
> generateBarcodeEAN8(value)

Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.barcode.GenerateBarcodeApi;


GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | Barcode value to generate from
try {
    apiInstance.generateBarcodeEAN8(value);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeEAN8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Barcode value to generate from |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="generateBarcodeQRCode"></a>
# **generateBarcodeQRCode**
> generateBarcodeQRCode(value)

Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.barcode.GenerateBarcodeApi;


GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | QR code text to convert into the QR code barcode
try {
    apiInstance.generateBarcodeQRCode(value);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeQRCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| QR code text to convert into the QR code barcode |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="generateBarcodeUPCA"></a>
# **generateBarcodeUPCA**
> generateBarcodeUPCA(value)

Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.barcode.GenerateBarcodeApi;


GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | UPC-A barcode value to generate from
try {
    apiInstance.generateBarcodeUPCA(value);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeUPCA");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| UPC-A barcode value to generate from |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="generateBarcodeUPCE"></a>
# **generateBarcodeUPCE**
> generateBarcodeUPCE(value)

Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.ApiException;
//import com.cloudmersive.client.barcode.GenerateBarcodeApi;


GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | UPC-E barcode value to generate from
try {
    apiInstance.generateBarcodeUPCE(value);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeUPCE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| UPC-E barcode value to generate from |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

