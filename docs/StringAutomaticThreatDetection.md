
# StringAutomaticThreatDetection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the operation was successful, false otherwise |  [optional]
**cleanResult** | **Boolean** |  |  [optional]
**containedJsonInsecureDeserializationAttack** | **Boolean** | True if the input contained Insecure Deserialization JSON, false otherwise |  [optional]
**containedXssThreat** | **Boolean** | True if the input contained XSS attack, false otherwise |  [optional]
**containedXxeThreat** | **Boolean** | True if the input contained XXE attack, false otherwise |  [optional]
**containedSqlInjectionThreat** | **Boolean** | True if the input contained SQL Injection attack, false otherwise |  [optional]
**containedSsrfThreat** | **Boolean** | True if the input contained an Server-Side Request Forgery (SSRF) URL attack, false otherwise |  [optional]
**isXML** | **Boolean** | True if the input string is XML, false otherwise |  [optional]
**isJSON** | **Boolean** | True if the input string is JSON, false otherwise |  [optional]
**isURL** | **Boolean** | True if the input string is a URL, false otherwise |  [optional]
**originalInput** | **String** | Original input string |  [optional]



