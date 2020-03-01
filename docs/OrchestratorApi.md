# OrchestratorApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orchestratorHttpSimple**](OrchestratorApi.md#orchestratorHttpSimple) | **POST** /config/orchestrator/http/simple | Orchestrate multiple HTTP API calls with a single API call in the order specified.  Call other Cloudmersive APIs or third party APIs.  For Cloudmersive APIs, the API Key will automatically propogate to the child calls without needing to be set explicitly.  Name each task and reference the output of a previous task in the inputs to a given task.


<a name="orchestratorHttpSimple"></a>
# **orchestratorHttpSimple**
> HttpOrchestrationResponse orchestratorHttpSimple(request)

Orchestrate multiple HTTP API calls with a single API call in the order specified.  Call other Cloudmersive APIs or third party APIs.  For Cloudmersive APIs, the API Key will automatically propogate to the child calls without needing to be set explicitly.  Name each task and reference the output of a previous task in the inputs to a given task.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.OrchestratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

OrchestratorApi apiInstance = new OrchestratorApi();
HttpOrchestrationRequest request = new HttpOrchestrationRequest(); // HttpOrchestrationRequest | 
try {
    HttpOrchestrationResponse result = apiInstance.orchestratorHttpSimple(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrchestratorApi#orchestratorHttpSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**HttpOrchestrationRequest**](HttpOrchestrationRequest.md)|  |

### Return type

[**HttpOrchestrationResponse**](HttpOrchestrationResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

