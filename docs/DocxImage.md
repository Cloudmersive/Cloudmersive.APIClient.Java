
# DocxImage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | The Path of the location of this object; leave blank for new tables |  [optional]
**imageName** | **String** | The Name of the image |  [optional]
**imageId** | **Long** | The Id of the image |  [optional]
**imageDescription** | **String** | The Description of the image |  [optional]
**imageWidth** | **Long** | Width of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height |  [optional]
**imageHeight** | **Long** | Height of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height |  [optional]
**xoffset** | **Long** | X (horizontal) offset of the image |  [optional]
**yoffset** | **Long** | Y (vertical) offset of the image |  [optional]
**imageDataEmbedId** | **String** | Read-only; internal ID for the image contents |  [optional]
**imageDataContentType** | **String** | Read-only; image data MIME content-type |  [optional]
**imageInternalFileName** | **String** | Read-only; internal file name/path for the image |  [optional]
**imageContentsURL** | **String** | URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents. |  [optional]
**inlineWithText** | **Boolean** | True if the image is inline with the text; false if it is floating |  [optional]



