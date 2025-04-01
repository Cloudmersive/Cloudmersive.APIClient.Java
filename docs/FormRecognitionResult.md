
# FormRecognitionResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the operation was successful, false otherwise |  [optional]
**fieldValueExtractionResult** | [**List&lt;FieldResult&gt;**](FieldResult.md) | Result of form field OCR data extraction |  [optional]
**tableValueExtractionResults** | [**List&lt;TableResult&gt;**](TableResult.md) | Result of form table OCR data extraction |  [optional]
**diagnostics** | **List&lt;String&gt;** | Diagnostic images - default is null, enable diagnostics&#x3D;true to populate this parameter with one image per field |  [optional]
**bestMatchFormSettingName** | **String** | Optional; populated when using photo/recognize/form/advanced with the Setting Name of the best-matching highest-relevance form |  [optional]



