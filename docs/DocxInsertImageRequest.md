
# DocxInsertImageRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputDocumentFileBytes** | **byte[]** | Optional: Bytes of the input file to operate on |  [optional]
**inputDocumentFileUrl** | **String** | Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**inputImageFileBytes** | **byte[]** | Optional: Bytes of the input image file to operate on |  [optional]
**inputImageFileUrl** | **String** | Optional: URL of an image file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public). |  [optional]
**imageWidth** | **Long** | Width in points of the image, set to 0 for default |  [optional]
**imageHeight** | **Long** | Height in point of the image, set to 0 for default |  [optional]



