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
import com.cloudmersive.client.image.model.*;
import com.cloudmersive.client.image.FaceApi;

import java.io.File;
import java.util.*;

public class FaceApiExample {

    public static void main(String[] args) {
        
        FaceApi apiInstance = new FaceApi();
        File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
        try {
            Object result = apiInstance.faceCropFirst(imageFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FaceApi#faceCropFirst");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudmersive.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FaceApi* | [**faceCropFirst**](docs/FaceApi.md#faceCropFirst) | **POST** /image/face/crop/first | Crop image to face (square)
*FaceApi* | [**faceCropFirstRound**](docs/FaceApi.md#faceCropFirstRound) | **POST** /image/face/crop/first/round | Crop image to face (round)
*FaceApi* | [**faceLocate**](docs/FaceApi.md#faceLocate) | **POST** /image/face/locate | Find faces in an image
*RecognizeApi* | [**recognizeDescribe**](docs/RecognizeApi.md#recognizeDescribe) | **POST** /image/recognize/describe | Describe an image in natural language
*ResizeApi* | [**resizePost**](docs/ResizeApi.md#resizePost) | **POST** /image/resize/preserveAspectRatio/{maxWidth}/{maxHeight} | Resize an image with parameters


## Documentation for Models

 - [Face](docs/Face.md)
 - [FaceLocateResponse](docs/FaceLocateResponse.md)
 - [ImageDescriptionResponse](docs/ImageDescriptionResponse.md)
 - [RecognitionOutcome](docs/RecognitionOutcome.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Apikey

- **Type**: API key
- **API key parameter name**: Apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



