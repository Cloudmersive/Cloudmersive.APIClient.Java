
# GetImageInfoResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** |  |  [optional]
**colorSpace** | **String** | Color space of the image |  [optional]
**colorType** | **String** | Color type of the image |  [optional]
**width** | **Integer** | Width in pixels of the image |  [optional]
**height** | **Integer** | Height in pixels of the image |  [optional]
**compressionLevel** | **Integer** | Compression level value from 0 (lowest quality) to 100 (highest quality) |  [optional]
**imageHashSignature** | **String** | SHA256 hash signature of the image |  [optional]
**hasTransparency** | **Boolean** | True if the image contains transparency, otherwise false |  [optional]
**mimeType** | **String** | MIME type of the image format |  [optional]
**imageFormat** | **String** | Image format |  [optional]
**dpIUnit** | **String** | Units of the DPI measurement; can be either in Inches or Centimeters |  [optional]
**DPI** | **Double** | DPI (pixels per unit, e.g. pixels per inch) of the image |  [optional]
**colorCount** | **Integer** | Unique colors in the image |  [optional]
**bitDepth** | **Integer** | Bit depth of the image |  [optional]
**comment** | **String** | Comment string in the image |  [optional]
**exifProfileName** | **String** | Name of the EXIF profile used |  [optional]
**exifValues** | [**List&lt;ExifValue&gt;**](ExifValue.md) | EXIF tags and values embedded in the image |  [optional]



