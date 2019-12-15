
# UpdateDocxTableCellRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional]
**inputFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**cellToUpdate** | [**DocxTableCell**](DocxTableCell.md) | Table cell contents you would like to update the cell with |  [optional]
**tableRowIndex** | **Integer** | 0-based index of the Table Row to update |  [optional]
**tableCellIndex** | **Integer** | 0-based index of the Table Cell (within the row) to update |  [optional]
**existingTablePath** | **String** | Required; the path to the existing table to modify |  [optional]



