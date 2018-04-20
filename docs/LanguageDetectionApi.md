# LanguageDetectionApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageDetectionPost**](LanguageDetectionApi.md#languageDetectionPost) | **POST** /nlp/language/detect | Detect language of text


<a name="languageDetectionPost"></a>
# **languageDetectionPost**
> LanguageDetectionResponse languageDetectionPost(textToDetect)

Detect language of text

Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.LanguageDetectionApi;


LanguageDetectionApi apiInstance = new LanguageDetectionApi();
String textToDetect = "textToDetect_example"; // String | Text to detect language of
try {
    LanguageDetectionResponse result = apiInstance.languageDetectionPost(textToDetect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageDetectionApi#languageDetectionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **textToDetect** | **String**| Text to detect language of |

### Return type

[**LanguageDetectionResponse**](LanguageDetectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

