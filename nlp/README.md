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
import com.cloudmersive.client.validate.nlp.*;
import com.cloudmersive.client.nlp.ApikeyUsageApi;

import java.io.File;
import java.util.*;

public class ApikeyUsageApiExample {

    public static void main(String[] args) {
        
        ApikeyUsageApi apiInstance = new ApikeyUsageApi();
        String id = "id_example"; // String | API key to check
        try {
            Long result = apiInstance.apikeyUsageGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApikeyUsageApi#apikeyUsageGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudmersive.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApikeyUsageApi* | [**apikeyUsageGet**](docs/ApikeyUsageApi.md#apikeyUsageGet) | **GET** /nlp/apikeyUsage/{id} | Get API Key usage
*ExtractEntitiesStringApi* | [**extractEntitiesStringPost**](docs/ExtractEntitiesStringApi.md#extractEntitiesStringPost) | **POST** /nlp/ExtractEntitiesString | Extract entities from string
*LanguageDetectionApi* | [**languageDetectionPost**](docs/LanguageDetectionApi.md#languageDetectionPost) | **POST** /nlp/language/detect | Detect language of text
*ParseStringApi* | [**parseStringPost**](docs/ParseStringApi.md#parseStringPost) | **POST** /nlp/ParseString | Parse string to syntax tree
*PosTaggerJsonApi* | [**posTaggerJsonPost**](docs/PosTaggerJsonApi.md#posTaggerJsonPost) | **POST** /nlp/PosTaggerJson | Part-of-speech tag a string
*PosTaggerStringApi* | [**posTaggerStringPost**](docs/PosTaggerStringApi.md#posTaggerStringPost) | **POST** /nlp/PosTaggerString | Part-of-speech tag a string
*SentencesApi* | [**sentencesPost**](docs/SentencesApi.md#sentencesPost) | **POST** /nlp/get/sentences/string | Extract sentences from string
*SpellCheckApi* | [**spellCheckCheckJson**](docs/SpellCheckApi.md#spellCheckCheckJson) | **POST** /nlp/spellcheck/check/word/json | Spell check word
*SpellCheckApi* | [**spellCheckCheckSentenceJson**](docs/SpellCheckApi.md#spellCheckCheckSentenceJson) | **POST** /nlp/spellcheck/check/sentence/json | Check if sentence is spelled correctly
*SpellCheckApi* | [**spellCheckCheckSentenceString**](docs/SpellCheckApi.md#spellCheckCheckSentenceString) | **POST** /nlp/spellcheck/check/sentence/string | Spell check a sentence
*SpellCheckApi* | [**spellCheckCorrect**](docs/SpellCheckApi.md#spellCheckCorrect) | **POST** /nlp/spellcheck/correct/word/string | Find spelling corrections
*SpellCheckApi* | [**spellCheckCorrectJson**](docs/SpellCheckApi.md#spellCheckCorrectJson) | **POST** /nlp/spellcheck/correct/word/json | Find spelling corrections
*SpellCheckApi* | [**spellCheckPost**](docs/SpellCheckApi.md#spellCheckPost) | **POST** /nlp/spellcheck/check/word/string | Spell check a word
*WordsApi* | [**wordsAdjectives**](docs/WordsApi.md#wordsAdjectives) | **POST** /nlp/get/words/adjectives/string | Get adjectives in string
*WordsApi* | [**wordsAdverbs**](docs/WordsApi.md#wordsAdverbs) | **POST** /nlp/get/words/adverbs/string | Get adverbs in input string
*WordsApi* | [**wordsGetWordsJson**](docs/WordsApi.md#wordsGetWordsJson) | **POST** /nlp/get/words/json | Get words in input string (JSON)
*WordsApi* | [**wordsGetWordsString**](docs/WordsApi.md#wordsGetWordsString) | **POST** /nlp/get/words/string | Get words from string
*WordsApi* | [**wordsNouns**](docs/WordsApi.md#wordsNouns) | **POST** /nlp/get/words/nouns/string | Get nouns in string
*WordsApi* | [**wordsPost**](docs/WordsApi.md#wordsPost) | **POST** /nlp/get/words/verbs/string | Get the verbs in a string
*WordsApi* | [**wordsPronouns**](docs/WordsApi.md#wordsPronouns) | **POST** /nlp/get/words/pronouns/string | Returns all pronounts in string
*WordsApi* | [**wordsProperNouns**](docs/WordsApi.md#wordsProperNouns) | **POST** /nlp/get/words/properNouns/string | Get proper nouns in a string


## Documentation for Models

 - [CheckJsonResponse](docs/CheckJsonResponse.md)
 - [CheckSentenceJsonResponse](docs/CheckSentenceJsonResponse.md)
 - [CorrectJsonResponse](docs/CorrectJsonResponse.md)
 - [CorrectWordInSentenceJsonResponse](docs/CorrectWordInSentenceJsonResponse.md)
 - [GetWordsJsonResponse](docs/GetWordsJsonResponse.md)
 - [LanguageDetectionResponse](docs/LanguageDetectionResponse.md)
 - [PosRequest](docs/PosRequest.md)
 - [PosResponse](docs/PosResponse.md)
 - [PosSentence](docs/PosSentence.md)
 - [PosTaggedWord](docs/PosTaggedWord.md)
 - [WordPosition](docs/WordPosition.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Apikey

- **Type**: API key
- **API key parameter name**: Apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



