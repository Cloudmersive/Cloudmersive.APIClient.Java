# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.cloudmersive.client.*;
import com.cloudmersive.client.auth.*;
import com.cloudmersive.client.barcode.model.*;
import com.cloudmersive.client.barcode.BarcodeLookupApi;

import java.io.File;
import java.util.*;

public class BarcodeLookupApiExample {

    public static void main(String[] args) {
        
        BarcodeLookupApi apiInstance = new BarcodeLookupApi();
        String value = "value_example"; // String | Barcode value
        try {
            BarcodeLookupResponse result = apiInstance.barcodeLookupEanLookup(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeLookupApi#barcodeLookupEanLookup");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudmersive.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BarcodeLookupApi* | [**barcodeLookupEanLookup**](docs/BarcodeLookupApi.md#barcodeLookupEanLookup) | **POST** /barcode/lookup/ean | Lookup a barcode value and return product data
*GenerateBarcodeApi* | [**generateBarcodeEAN13**](docs/GenerateBarcodeApi.md#generateBarcodeEAN13) | **POST** /barcode/generate/ean-13 | Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
*GenerateBarcodeApi* | [**generateBarcodeEAN8**](docs/GenerateBarcodeApi.md#generateBarcodeEAN8) | **POST** /barcode/generate/ean-8 | Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
*GenerateBarcodeApi* | [**generateBarcodeQRCode**](docs/GenerateBarcodeApi.md#generateBarcodeQRCode) | **POST** /barcode/generate/qrcode | Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
*GenerateBarcodeApi* | [**generateBarcodeUPCA**](docs/GenerateBarcodeApi.md#generateBarcodeUPCA) | **POST** /barcode/generate/upc-a | Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
*GenerateBarcodeApi* | [**generateBarcodeUPCE**](docs/GenerateBarcodeApi.md#generateBarcodeUPCE) | **POST** /barcode/generate/upc-e | Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode


## Documentation for Models

 - [BarcodeLookupResponse](docs/BarcodeLookupResponse.md)
 - [ProductMatch](docs/ProductMatch.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Apikey

- **Type**: API key
- **API key parameter name**: Apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



