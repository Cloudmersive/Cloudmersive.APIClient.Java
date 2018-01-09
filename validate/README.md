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

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DomainApi;

import java.io.File;
import java.util.*;

public class DomainApiExample {

    public static void main(String[] args) {
        
        DomainApi apiInstance = new DomainApi();
        String domain = "domain_example"; // String | 
        try {
            CheckResponse result = apiInstance.domainCheck(domain);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DomainApi#domainCheck");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudmersive.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DomainApi* | [**domainCheck**](docs/DomainApi.md#domainCheck) | **POST** /validate/domain/check | 
*DomainApi* | [**domainPost**](docs/DomainApi.md#domainPost) | **POST** /validate/domain/whois | 
*EmailApi* | [**emailAddressGetServers**](docs/EmailApi.md#emailAddressGetServers) | **POST** /validate/email/address/servers | 
*EmailApi* | [**emailFullValidation**](docs/EmailApi.md#emailFullValidation) | **POST** /validate/email/address/full | 
*EmailApi* | [**emailPost**](docs/EmailApi.md#emailPost) | **POST** /validate/email/address/syntaxOnly | 
*IPaddressControllerApi* | [**iPaddressControllerPost**](docs/IPaddressControllerApi.md#iPaddressControllerPost) | **POST** /validate/ip/geolocate | 


## Documentation for Models

 - [AddressGetServersResponse](docs/AddressGetServersResponse.md)
 - [AddressVerifySyntaxOnlyResponse](docs/AddressVerifySyntaxOnlyResponse.md)
 - [CheckResponse](docs/CheckResponse.md)
 - [FullEmailValidationResponse](docs/FullEmailValidationResponse.md)
 - [GeolocateResponse](docs/GeolocateResponse.md)
 - [WhoisResponse](docs/WhoisResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Apikey

- **Type**: API key
- **API key parameter name**: Apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



