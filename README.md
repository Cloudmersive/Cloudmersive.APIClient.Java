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
    <version>1.1.5</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.cloudmersive:cloudmersive-java-api-client:1.1.5"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/cloudmersive-java-api-client-1.1.5.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.cloudmersive.client.invoker.*;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.model.*;
import com.cloudmersive.client.DomainApi;

import java.io.File;
import java.util.*;

public class DomainApiExample {

    public static void main(String[] args) {
        
        DomainApi apiInstance = new DomainApi();
        String domain = "domain_example"; // String | Domain name to check, for example \"cloudmersive.com\"
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
*DomainApi* | [**domainCheck**](docs/DomainApi.md#domainCheck) | **POST** /validate/domain/check | Validate a domain name
*DomainApi* | [**domainPost**](docs/DomainApi.md#domainPost) | **POST** /validate/domain/whois | Get WHOIS information for a domain
*EmailApi* | [**emailAddressGetServers**](docs/EmailApi.md#emailAddressGetServers) | **POST** /validate/email/address/servers | Partially check whether an email address is valid
*EmailApi* | [**emailFullValidation**](docs/EmailApi.md#emailFullValidation) | **POST** /validate/email/address/full | Fully validate an email address
*EmailApi* | [**emailPost**](docs/EmailApi.md#emailPost) | **POST** /validate/email/address/syntaxOnly | Validate email adddress for syntactic correctness only
*IpAddressApi* | [**iPAddressPost**](docs/IpAddressApi.md#iPAddressPost) | **POST** /validate/ip/geolocate | Geolocate an IP address


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



