
# DocxRemoveObjectRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional]
**inputFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**pathToObjectToRemove** | **String** | Path within the document of the object to delete; fill in the PathToObjectToRemove field using the Path value from an existing object. |  [optional]



