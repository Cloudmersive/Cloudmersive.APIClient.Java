# BarcodeScanApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**barcodeScanImage**](BarcodeScanApi.md#barcodeScanImage) | **POST** /barcode/scan/image | Scan and recognize an image of a barcode
[**barcodeScanImageAdvancedQR**](BarcodeScanApi.md#barcodeScanImageAdvancedQR) | **POST** /barcode/scan/image/advanced/qr | Advanced AI scan and recognition of an image of one or more QR barcodes


<a name="barcodeScanImage"></a>
# **barcodeScanImage**
> BarcodeScanResult barcodeScanImage(imageFile)

Scan and recognize an image of a barcode

Scan an image or photo of a barcode and return the result.  Supported barcode types include AZTEC, CODABAR, CODE_39, CODE_93, CODE_128, DATA_MATRIX, EAN_8, EAN_13, ITF, MAXICODE, PDF_417, QR_CODE, RSS_14, RSS_EXPANDED, UPC_A, UPC_E, All_1D, UPC_EAN_EXTENSION, MSI, PLESSEY, IMB

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.BarcodeScanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

BarcodeScanApi apiInstance = new BarcodeScanApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    BarcodeScanResult result = apiInstance.barcodeScanImage(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BarcodeScanApi#barcodeScanImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**BarcodeScanResult**](BarcodeScanResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="barcodeScanImageAdvancedQR"></a>
# **barcodeScanImageAdvancedQR**
> BarcodeScanQRAdvancedResult barcodeScanImageAdvancedQR(imageFile, preprocessing)

Advanced AI scan and recognition of an image of one or more QR barcodes

Scan an image or photo of a QR barcode and return the result.  Uses AI deep learning to read blurry or low resultion QR barcodes.  Supports PNG, PDF and JPEG input file formats.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.BarcodeScanApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

BarcodeScanApi apiInstance = new BarcodeScanApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
String preprocessing = "preprocessing_example"; // String | Optional, preprocessing mode, default is 'Auto'.  Possible values are None (no preprocessing of the image), and Auto (automatic image enhancement of the image - including automatic unrotation of the image - before OCR is applied; this is recommended).  Set this to 'None' if you do not want to use automatic image unrotation and enhancement.
try {
    BarcodeScanQRAdvancedResult result = apiInstance.barcodeScanImageAdvancedQR(imageFile, preprocessing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BarcodeScanApi#barcodeScanImageAdvancedQR");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |
 **preprocessing** | **String**| Optional, preprocessing mode, default is &#39;Auto&#39;.  Possible values are None (no preprocessing of the image), and Auto (automatic image enhancement of the image - including automatic unrotation of the image - before OCR is applied; this is recommended).  Set this to &#39;None&#39; if you do not want to use automatic image unrotation and enhancement. | [optional]

### Return type

[**BarcodeScanQRAdvancedResult**](BarcodeScanQRAdvancedResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

