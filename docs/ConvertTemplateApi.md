# ConvertTemplateApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertTemplateApplyHtmlTemplate**](ConvertTemplateApi.md#convertTemplateApplyHtmlTemplate) | **POST** /convert/template/html/apply | Apply HTML template


<a name="convertTemplateApplyHtmlTemplate"></a>
# **convertTemplateApplyHtmlTemplate**
> HtmlTemplateApplicationResponse convertTemplateApplyHtmlTemplate(value)

Apply HTML template

Apply operations to fill in an HTML template, generating a final HTML result

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.ConvertTemplateApi;


ConvertTemplateApi apiInstance = new ConvertTemplateApi();
HtmlTemplateApplicationRequest value = new HtmlTemplateApplicationRequest(); // HtmlTemplateApplicationRequest | Operations to apply to template
try {
    HtmlTemplateApplicationResponse result = apiInstance.convertTemplateApplyHtmlTemplate(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertTemplateApi#convertTemplateApplyHtmlTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**HtmlTemplateApplicationRequest**](HtmlTemplateApplicationRequest.md)| Operations to apply to template |

### Return type

[**HtmlTemplateApplicationResponse**](HtmlTemplateApplicationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

