
# SqlInjectionCheckBatchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestItems** | [**List&lt;SqlInjectionCheckRequestItem&gt;**](SqlInjectionCheckRequestItem.md) | Multiple items to detect for SQL Injection |  [optional]
**detectionLevel** | **String** | Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended). |  [optional]



