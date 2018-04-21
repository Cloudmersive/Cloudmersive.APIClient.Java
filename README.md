# cloudmersive-java-api-client

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
    <groupId>com.cloudmersive</groupId>
    <artifactId>cloudmersive-java-api-client</artifactId>
    <version>1.1.2</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.cloudmersive:cloudmersive-java-api-client:1.1.2"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/cloudmersive-java-api-client-1.1.2.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.cloudmersive.client.invoker.*;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.model.*;
import com.cloudmersive.client.ConvertDataApi;

import java.io.File;
import java.util.*;

public class ConvertDataApiExample {

    public static void main(String[] args) {
        
        ConvertDataApi apiInstance = new ConvertDataApi();
        File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
        try {
            Object result = apiInstance.convertDataCsvToJson(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConvertDataApi#convertDataCsvToJson");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudmersive.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConvertDataApi* | [**convertDataCsvToJson**](docs/ConvertDataApi.md#convertDataCsvToJson) | **POST** /convert/csv/to/json | CSV to JSON conversion
*ConvertDataApi* | [**convertDataXmlToJson**](docs/ConvertDataApi.md#convertDataXmlToJson) | **POST** /convert/xml/to/json | XML to JSON conversion
*ConvertDocumentApi* | [**convertDocumentAutodetectToPdf**](docs/ConvertDocumentApi.md#convertDocumentAutodetectToPdf) | **POST** /convert/autodetect/to/pdf | Convert Document to PDF
*ConvertDocumentApi* | [**convertDocumentDocxToPdf**](docs/ConvertDocumentApi.md#convertDocumentDocxToPdf) | **POST** /convert/docx/to/pdf | Word DOCX to PDF
*ConvertDocumentApi* | [**convertDocumentPptxToPdf**](docs/ConvertDocumentApi.md#convertDocumentPptxToPdf) | **POST** /convert/pptx/to/pdf | PowerPoint PPTX to PDF
*ConvertDocumentApi* | [**convertDocumentXlsxToCsv**](docs/ConvertDocumentApi.md#convertDocumentXlsxToCsv) | **POST** /convert/xlsx/to/csv | Excel XLSX to CSV
*ConvertDocumentApi* | [**convertDocumentXlsxToPdf**](docs/ConvertDocumentApi.md#convertDocumentXlsxToPdf) | **POST** /convert/xlsx/to/pdf | Excel XLSX to PDF
*ConvertImageApi* | [**convertImageImageFormatConvert**](docs/ConvertImageApi.md#convertImageImageFormatConvert) | **POST** /convert/image/{format1}/to/{format2} | Image format conversion
*ConvertTemplateApi* | [**convertTemplateApplyHtmlTemplate**](docs/ConvertTemplateApi.md#convertTemplateApplyHtmlTemplate) | **POST** /convert/template/html/apply | Apply HTML template
*ConvertWebApi* | [**convertWebUrlToPdf**](docs/ConvertWebApi.md#convertWebUrlToPdf) | **POST** /convert/web/url/to/pdf | Convert a URL to PDF
*ConvertWebApi* | [**convertWebUrlToPdf_0**](docs/ConvertWebApi.md#convertWebUrlToPdf_0) | **POST** /convert/web/html/to/pdf | Convert HTML string to PDF
*ConvertWebApi* | [**convertWebUrlToScreenshot**](docs/ConvertWebApi.md#convertWebUrlToScreenshot) | **POST** /convert/web/url/to/screenshot | Take screenshot of URL


## Documentation for Models

 - [HtmlTemplateApplicationRequest](docs/HtmlTemplateApplicationRequest.md)
 - [HtmlTemplateApplicationResponse](docs/HtmlTemplateApplicationResponse.md)
 - [HtmlTemplateOperation](docs/HtmlTemplateOperation.md)
 - [HtmlToPdfRequest](docs/HtmlToPdfRequest.md)
 - [ScreenshotRequest](docs/ScreenshotRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Apikey

- **Type**: API key
- **API key parameter name**: Apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



