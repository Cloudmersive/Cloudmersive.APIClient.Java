
# DocxTableTableFillRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileUrl** | **String** | Optional; Input URL of the document; use BeginEditing to create this |  [optional]
**inputFileData** | **byte[]** | Optional; Input Word Document file content for the operation |  [optional]
**tableStartTag** | **String** | Start tag that delineates the beginning of the table |  [optional]
**tableEndTag** | **String** | End tag that delineates the end of the table |  [optional]
**dataToFillIn** | [**List&lt;DocxTableTableFillTableRow&gt;**](DocxTableTableFillTableRow.md) | Data set to populate the table with |  [optional]



