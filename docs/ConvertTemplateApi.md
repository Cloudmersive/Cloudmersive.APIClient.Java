# ConvertTemplateApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertTemplateApplyDocxTemplate**](ConvertTemplateApi.md#convertTemplateApplyDocxTemplate) | **POST** /convert/template/docx/apply | Apply Word DOCX template
[**convertTemplateApplyHtmlTemplate**](ConvertTemplateApi.md#convertTemplateApplyHtmlTemplate) | **POST** /convert/template/html/apply | Apply HTML template


<a name="convertTemplateApplyDocxTemplate"></a>
# **convertTemplateApplyDocxTemplate**
> byte[] convertTemplateApplyDocxTemplate(inputFile, templateDefinition)

Apply Word DOCX template

Apply operations to fill in a Word DOCX template by replacing target template/placeholder strings in the DOCX with values, generating a final Word DOCX result.  For example, you could create a Word Document invoice containing strings such as \&quot;{FirstName}\&quot; and \&quot;{LastName}\&quot; and then replace these values with \&quot;John\&quot; and \&quot;Smith\&quot;.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertTemplateApi apiInstance = new ConvertTemplateApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
Object templateDefinition = null; // Object | Template definition for the document, including what values to replace
try {
    byte[] result = apiInstance.convertTemplateApplyDocxTemplate(inputFile, templateDefinition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertTemplateApi#convertTemplateApplyDocxTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **templateDefinition** | [**Object**](.md)| Template definition for the document, including what values to replace | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="convertTemplateApplyHtmlTemplate"></a>
# **convertTemplateApplyHtmlTemplate**
> HtmlTemplateApplicationResponse convertTemplateApplyHtmlTemplate(value)

Apply HTML template

Apply operations to fill in an HTML template, generating a final HTML result

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

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

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

