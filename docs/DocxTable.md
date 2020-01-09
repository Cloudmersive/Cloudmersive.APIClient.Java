
# DocxTable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tableID** | **String** | The ID of the table; leave blank for new tables |  [optional]
**path** | **String** | The Path of the location of this table object; leave blank for new tables |  [optional]
**width** | **String** | The Width of the table, or 0 if not specified |  [optional]
**widthType** | **String** | The Width configuration type of the table |  [optional]
**tableRows** | [**List&lt;DocxTableRow&gt;**](DocxTableRow.md) | Rows in the table; this is where the contents is located |  [optional]
**topBorderType** | **String** | Type for the top border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave |  [optional]
**topBorderSize** | **Integer** | Width of the border in points (1/72nd of an inch) |  [optional]
**topBorderSpace** | **Integer** | Spacing around the border in points (1/72nd of an inch) |  [optional]
**topBorderColor** | **String** | HTML-style color hex value (do not include a #) |  [optional]
**bottomBorderType** | **String** | Type for the bottom border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave |  [optional]
**bottomBorderSize** | **Integer** | Width of the border in points (1/72nd of an inch) |  [optional]
**bottomBorderSpace** | **Integer** | Spacing around the border in points (1/72nd of an inch) |  [optional]
**bottomBorderColor** | **String** | HTML-style color hex value (do not include a #) |  [optional]
**leftBorderType** | **String** | Type for the left border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave |  [optional]
**leftBorderSize** | **Integer** | Width of the border in points (1/72nd of an inch) |  [optional]
**leftBorderSpace** | **Integer** | Spacing around the border in points (1/72nd of an inch) |  [optional]
**leftBorderColor** | **String** | HTML-style color hex value (do not include a #) |  [optional]
**rightBorderType** | **String** | Type for the right border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave |  [optional]
**rightBorderSize** | **Integer** | Width of the border in points (1/72nd of an inch) |  [optional]
**rightBorderSpace** | **Integer** | Spacing around the border in points (1/72nd of an inch) |  [optional]
**rightBorderColor** | **String** | HTML-style color hex value (do not include a #) |  [optional]
**cellHorizontalBorderType** | **String** | Type for the cell horizontal border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave |  [optional]
**cellHorizontalBorderSize** | **Integer** | Width of the border in points (1/72nd of an inch) |  [optional]
**cellHorizontalBorderSpace** | **Integer** | Spacing around the border in points (1/72nd of an inch) |  [optional]
**cellHorizontalBorderColor** | **String** | HTML-style color hex value (do not include a #) |  [optional]
**cellVerticalBorderType** | **String** | Type for the cell vertical border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave |  [optional]
**cellVerticalBorderSize** | **Integer** | Width of the border in points (1/72nd of an inch) |  [optional]
**cellVerticalBorderSpace** | **Integer** | Spacing around the border in points (1/72nd of an inch) |  [optional]
**cellVerticalBorderColor** | **String** | HTML-style color hex value (do not include a #) |  [optional]
**startBorderType** | **String** | Type for the start border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave |  [optional]
**startBorderSize** | **Integer** | Width of the border in points (1/72nd of an inch) |  [optional]
**startBorderSpace** | **Integer** | Spacing around the border in points (1/72nd of an inch) |  [optional]
**startBorderColor** | **String** | HTML-style color hex value (do not include a #) |  [optional]
**endBorderType** | **String** | Type for the end border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave |  [optional]
**endBorderSize** | **Integer** | Width of the border in points (1/72nd of an inch) |  [optional]
**endBorderSpace** | **Integer** | Spacing around the border in points (1/72nd of an inch) |  [optional]
**endBorderColor** | **String** | HTML-style color hex value (do not include a #) |  [optional]
**tableIndentationMode** | **String** | Table indentation type |  [optional]
**tableIndentationWidth** | **Integer** | Table indentation width |  [optional]



