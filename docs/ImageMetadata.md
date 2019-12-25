
# ImageMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the operation was successful, false otherwise |  [optional]
**isValidImage** | **Boolean** | True if the input image is a valid image file, false otherwise |  [optional]
**fileFormat** | **String** | File format of the image |  [optional]
**width** | **Integer** | Width of the image in pixels |  [optional]
**height** | **Integer** | Height of the image in pixels |  [optional]
**bitDepth** | **Integer** | Bits per pixel |  [optional]
**hasTransparency** | **Boolean** | True if the image has transaprency in the form of an alpha channel, false otherwise |  [optional]
**colorSpace** | **String** | Color space of the image |  [optional]
**exifProfileName** | **String** | Name of the EXIF profile used |  [optional]
**exifValues** | [**List&lt;ImageMetadataExifValue&gt;**](ImageMetadataExifValue.md) | EXIF tags and values embedded in the image |  [optional]



