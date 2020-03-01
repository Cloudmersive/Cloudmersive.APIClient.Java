
# HttpOrchestrationTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskName** | **String** | An identifier for this task name, e.g. CreateCustomer or ScanForVirus; allows you to refer to this task from other tasks; if not supplied, it will default to a 0-based integer index of the task |  [optional]
**httpMethod** | **String** | HTTP Method, e.g. GET, PUT, POST, etc. |  [optional]
**URL** | **String** | HTTP URL to orchestrate |  [optional]
**httpHeaders** | [**List&lt;HttpOrchestrationHeader&gt;**](HttpOrchestrationHeader.md) | Optional; HTTP headers to apply to the request |  [optional]
**queryParameters** | [**List&lt;HttpGetParameter&gt;**](HttpGetParameter.md) | Optional; query parameters, these query parameters will be incorporated into the URL |  [optional]
**formDataParameters** | [**List&lt;HttpFormDataParameter&gt;**](HttpFormDataParameter.md) | Optional; FormData parameters, these parameters will be stored in the body in a multi-part encoding |  [optional]
**wwwFormUrlEncodedParameters** | [**List&lt;HttpWwwFormUrlEncodedParameter&gt;**](HttpWwwFormUrlEncodedParameter.md) | Optional; x-www-form-urlencoded paramereters, these parameters will be stored in the body as an application/x-www-form-urlencoded encoding |  [optional]
**rawTextBody** | [**HttpRawTextParameter**](HttpRawTextParameter.md) | Optional; sets the body of the request as raw text, cannot be used with other parameter types in the same request |  [optional]
**rawBinaryBody** | [**HttpRawBinaryParameter**](HttpRawBinaryParameter.md) | Optional; set the body of the request as binary, cannot be used with other parameter types in the same request |  [optional]



