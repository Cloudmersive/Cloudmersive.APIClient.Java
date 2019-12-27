
# PdfAnnotation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title of the annotation; this is often the author of the annotation in Acrobat-created PDF files |  [optional]
**annotationType** | **String** | Type of the annotation; possible values are Text |  [optional]
**pageNumber** | **Integer** | The 1-based index of the page containing the annotation |  [optional]
**annotationIndex** | **Integer** | The 0-based index of the annotation in the document |  [optional]
**subject** | **String** | Subject of the annotation |  [optional]
**textContents** | **String** | Text contents of the annotation |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the annotation was created |  [optional]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date that the annotation was last modified |  [optional]
**leftX** | **Double** | Left X coordinate for the location of the annotation |  [optional]
**topY** | **Double** | Top Y coordination of the location of the annotation |  [optional]
**width** | **Double** | Width of the annotation |  [optional]
**height** | **Double** | Height of the annotation |  [optional]



