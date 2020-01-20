
# DocxInsertCommentOnParagraphRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional]
**inputFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**paragraphPath** | **String** | Path to the paragraph to attach the comment to.  You can get the Path by retrieving all of the Paragraphs in document by calling Get Body and taking the Path property of the desired paragraph to add the comment to. |  [optional]
**commentToInsert** | [**DocxComment**](DocxComment.md) | Comment to insert |  [optional]



