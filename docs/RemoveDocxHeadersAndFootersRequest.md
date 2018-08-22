
# RemoveDocxHeadersAndFootersRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional]
**inputFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**removeHeaders** | **Boolean** | True if you would like to remove all headers from the input document, false otherwise |  [optional]
**removeFooters** | **Boolean** | True if you would like to remove all footers from the input document, false otherwise |  [optional]



