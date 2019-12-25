# ConvertDataApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertDataCsvToJson**](ConvertDataApi.md#convertDataCsvToJson) | **POST** /convert/csv/to/json | Convert CSV to JSON conversion
[**convertDataJsonToXml**](ConvertDataApi.md#convertDataJsonToXml) | **POST** /convert/json/to/xml | Convert JSON to XML conversion
[**convertDataXlsToJson**](ConvertDataApi.md#convertDataXlsToJson) | **POST** /convert/xls/to/json | Convert Excel (97-2003) XLS to JSON conversion
[**convertDataXlsxToJson**](ConvertDataApi.md#convertDataXlsxToJson) | **POST** /convert/xlsx/to/json | Convert Excel XLSX to JSON conversion
[**convertDataXmlEditAddAttributeWithXPath**](ConvertDataApi.md#convertDataXmlEditAddAttributeWithXPath) | **POST** /convert/xml/edit/xpath/add-attribute | Adds an attribute to all XML nodes matching XPath expression
[**convertDataXmlEditAddChildWithXPath**](ConvertDataApi.md#convertDataXmlEditAddChildWithXPath) | **POST** /convert/xml/edit/xpath/add-child | Adds an XML node as a child to XML nodes matching XPath expression
[**convertDataXmlEditRemoveAllChildNodesWithXPath**](ConvertDataApi.md#convertDataXmlEditRemoveAllChildNodesWithXPath) | **POST** /convert/xml/edit/xpath/remove-all-children | Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes
[**convertDataXmlEditReplaceWithXPath**](ConvertDataApi.md#convertDataXmlEditReplaceWithXPath) | **POST** /convert/xml/edit/xpath/replace | Replaces XML nodes matching XPath expression with new node
[**convertDataXmlEditSetValueWithXPath**](ConvertDataApi.md#convertDataXmlEditSetValueWithXPath) | **POST** /convert/xml/edit/xpath/set-value | Sets the value contents of XML nodes matching XPath expression
[**convertDataXmlFilterWithXPath**](ConvertDataApi.md#convertDataXmlFilterWithXPath) | **POST** /convert/xml/select/xpath | Filter, select XML nodes using XPath expression, get results
[**convertDataXmlRemoveWithXPath**](ConvertDataApi.md#convertDataXmlRemoveWithXPath) | **POST** /convert/xml/edit/xpath/remove | Remove, delete XML nodes and items matching XPath expression
[**convertDataXmlToJson**](ConvertDataApi.md#convertDataXmlToJson) | **POST** /convert/xml/to/json | Convert XML to JSON conversion
[**convertDataXmlTransformWithXsltToXml**](ConvertDataApi.md#convertDataXmlTransformWithXsltToXml) | **POST** /convert/xml/transform/xslt/to/xml | Transform XML document file with XSLT into a new XML document


<a name="convertDataCsvToJson"></a>
# **convertDataCsvToJson**
> Object convertDataCsvToJson(inputFile)

Convert CSV to JSON conversion

Convert a CSV file to a JSON object array

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataCsvToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataCsvToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="convertDataJsonToXml"></a>
# **convertDataJsonToXml**
> byte[] convertDataJsonToXml(jsonObject)

Convert JSON to XML conversion

Convert a JSON object into XML

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
Object jsonObject = null; // Object | 
try {
    byte[] result = apiInstance.convertDataJsonToXml(jsonObject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataJsonToXml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonObject** | **Object**|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="convertDataXlsToJson"></a>
# **convertDataXlsToJson**
> Object convertDataXlsToJson(inputFile)

Convert Excel (97-2003) XLS to JSON conversion

Convert an Excel (97-2003) XLS file to a JSON object array

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataXlsToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXlsToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="convertDataXlsxToJson"></a>
# **convertDataXlsxToJson**
> Object convertDataXlsxToJson(inputFile)

Convert Excel XLSX to JSON conversion

Convert an Excel XLSX file to a JSON object array

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataXlsxToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXlsxToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="convertDataXmlEditAddAttributeWithXPath"></a>
# **convertDataXmlEditAddAttributeWithXPath**
> XmlAddAttributeWithXPathResult convertDataXmlEditAddAttributeWithXPath(inputFile, xpathExpression, xmlAttributeName, xmlAttributeValue)

Adds an attribute to all XML nodes matching XPath expression

Return the reuslts of editing an XML document by adding an attribute to all of the nodes that match an input XPath expression.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input XML file to perform the operation on.
String xpathExpression = "xpathExpression_example"; // String | Valid XML XPath query expression
String xmlAttributeName = "xmlAttributeName_example"; // String | Name of the XML attribute to add
String xmlAttributeValue = "xmlAttributeValue_example"; // String | Value of the XML attribute to add
try {
    XmlAddAttributeWithXPathResult result = apiInstance.convertDataXmlEditAddAttributeWithXPath(inputFile, xpathExpression, xmlAttributeName, xmlAttributeValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlEditAddAttributeWithXPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input XML file to perform the operation on. |
 **xpathExpression** | **String**| Valid XML XPath query expression |
 **xmlAttributeName** | **String**| Name of the XML attribute to add |
 **xmlAttributeValue** | **String**| Value of the XML attribute to add |

### Return type

[**XmlAddAttributeWithXPathResult**](XmlAddAttributeWithXPathResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlEditAddChildWithXPath"></a>
# **convertDataXmlEditAddChildWithXPath**
> XmlAddChildWithXPathResult convertDataXmlEditAddChildWithXPath(inputFile, xpathExpression, xmlNodeToAdd)

Adds an XML node as a child to XML nodes matching XPath expression

Return the reuslts of editing an XML document by adding an XML node as a child to all of the nodes that match an input XPath expression.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input XML file to perform the operation on.
String xpathExpression = "xpathExpression_example"; // String | Valid XML XPath query expression
String xmlNodeToAdd = "xmlNodeToAdd_example"; // String | XML Node to add as a child
try {
    XmlAddChildWithXPathResult result = apiInstance.convertDataXmlEditAddChildWithXPath(inputFile, xpathExpression, xmlNodeToAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlEditAddChildWithXPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input XML file to perform the operation on. |
 **xpathExpression** | **String**| Valid XML XPath query expression |
 **xmlNodeToAdd** | **String**| XML Node to add as a child |

### Return type

[**XmlAddChildWithXPathResult**](XmlAddChildWithXPathResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlEditRemoveAllChildNodesWithXPath"></a>
# **convertDataXmlEditRemoveAllChildNodesWithXPath**
> XmlRemoveAllChildrenWithXPathResult convertDataXmlEditRemoveAllChildNodesWithXPath(inputFile, xpathExpression)

Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes

Return the reuslts of editing an XML document by removing all child nodes of the nodes that match an input XPath expression.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input XML file to perform the operation on.
String xpathExpression = "xpathExpression_example"; // String | Valid XML XPath query expression
try {
    XmlRemoveAllChildrenWithXPathResult result = apiInstance.convertDataXmlEditRemoveAllChildNodesWithXPath(inputFile, xpathExpression);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlEditRemoveAllChildNodesWithXPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input XML file to perform the operation on. |
 **xpathExpression** | **String**| Valid XML XPath query expression |

### Return type

[**XmlRemoveAllChildrenWithXPathResult**](XmlRemoveAllChildrenWithXPathResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlEditReplaceWithXPath"></a>
# **convertDataXmlEditReplaceWithXPath**
> XmlReplaceWithXPathResult convertDataXmlEditReplaceWithXPath(inputFile, xpathExpression, xmlNodeReplacement)

Replaces XML nodes matching XPath expression with new node

Return the reuslts of editing an XML document by replacing all of the nodes that match an input XPath expression with a new XML node expression.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input XML file to perform the operation on.
String xpathExpression = "xpathExpression_example"; // String | Valid XML XPath query expression
String xmlNodeReplacement = "xmlNodeReplacement_example"; // String | XML Node replacement content
try {
    XmlReplaceWithXPathResult result = apiInstance.convertDataXmlEditReplaceWithXPath(inputFile, xpathExpression, xmlNodeReplacement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlEditReplaceWithXPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input XML file to perform the operation on. |
 **xpathExpression** | **String**| Valid XML XPath query expression |
 **xmlNodeReplacement** | **String**| XML Node replacement content |

### Return type

[**XmlReplaceWithXPathResult**](XmlReplaceWithXPathResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlEditSetValueWithXPath"></a>
# **convertDataXmlEditSetValueWithXPath**
> XmlSetValueWithXPathResult convertDataXmlEditSetValueWithXPath(inputFile, xpathExpression, xmlValue)

Sets the value contents of XML nodes matching XPath expression

Return the reuslts of editing an XML document by setting the contents of all of the nodes that match an input XPath expression.  Supports elements and attributes.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input XML file to perform the operation on.
String xpathExpression = "xpathExpression_example"; // String | Valid XML XPath query expression
String xmlValue = "xmlValue_example"; // String | XML Value to set into the matching XML nodes
try {
    XmlSetValueWithXPathResult result = apiInstance.convertDataXmlEditSetValueWithXPath(inputFile, xpathExpression, xmlValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlEditSetValueWithXPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input XML file to perform the operation on. |
 **xpathExpression** | **String**| Valid XML XPath query expression |
 **xmlValue** | **String**| XML Value to set into the matching XML nodes |

### Return type

[**XmlSetValueWithXPathResult**](XmlSetValueWithXPathResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlFilterWithXPath"></a>
# **convertDataXmlFilterWithXPath**
> XmlFIlterWithXPathResult convertDataXmlFilterWithXPath(xpathExpression, inputFile)

Filter, select XML nodes using XPath expression, get results

Return the reuslts of filtering, selecting an XML document with an XPath expression

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
String xpathExpression = "xpathExpression_example"; // String | Valid XML XPath query expression
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    XmlFIlterWithXPathResult result = apiInstance.convertDataXmlFilterWithXPath(xpathExpression, inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlFilterWithXPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xpathExpression** | **String**| Valid XML XPath query expression |
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**XmlFIlterWithXPathResult**](XmlFIlterWithXPathResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlRemoveWithXPath"></a>
# **convertDataXmlRemoveWithXPath**
> XmlRemoveWithXPathResult convertDataXmlRemoveWithXPath(xpathExpression, inputFile)

Remove, delete XML nodes and items matching XPath expression

Return the reuslts of editing an XML document by removing all of the nodes that match an input XPath expression

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
String xpathExpression = "xpathExpression_example"; // String | Valid XML XPath query expression
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    XmlRemoveWithXPathResult result = apiInstance.convertDataXmlRemoveWithXPath(xpathExpression, inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlRemoveWithXPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xpathExpression** | **String**| Valid XML XPath query expression |
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**XmlRemoveWithXPathResult**](XmlRemoveWithXPathResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlToJson"></a>
# **convertDataXmlToJson**
> Object convertDataXmlToJson(inputFile)

Convert XML to JSON conversion

Convert an XML string or file into JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataXmlToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="convertDataXmlTransformWithXsltToXml"></a>
# **convertDataXmlTransformWithXsltToXml**
> byte[] convertDataXmlTransformWithXsltToXml(inputFile, transformFile)

Transform XML document file with XSLT into a new XML document

Convert an XML string or file into JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.ConvertDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input XML file to perform the operation on.
File transformFile = new File("/path/to/file.txt"); // File | Input XSLT file to use to transform the input XML file.
try {
    byte[] result = apiInstance.convertDataXmlTransformWithXsltToXml(inputFile, transformFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlTransformWithXsltToXml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input XML file to perform the operation on. |
 **transformFile** | **File**| Input XSLT file to use to transform the input XML file. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

