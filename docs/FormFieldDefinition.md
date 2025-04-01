
# FormFieldDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldID** | **String** | The identifier of the field; use this to identify which field is being referenced.  Set to SkipField if you do not wish to return the value of this field in the result. |  [optional]
**leftAnchor** | **String** | Optional - the left-hand anchor of the field |  [optional]
**topAnchor** | **String** | Optional - the top anchor of the field |  [optional]
**bottomAnchor** | **String** | Optional - the bottom anchor of the field |  [optional]
**alternateAnchor** | **String** | Optional - alterate match text for the specified anchor |  [optional]
**anchorMode** | **String** | Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match) and Horizontal (anchor must be laid out horizontally).  Default is Partial. |  [optional]
**dataType** | **String** | The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace) |  [optional]
**targetDigitCount** | **Integer** | Optional - the target number of digits in the field; useful for fixed-length fields |  [optional]
**minimumCharacterCount** | **Integer** | Optional - the target number of digits in the field; useful for fixed-length fields |  [optional]
**allowNumericDigits** | **Boolean** | Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits |  [optional]
**verticalAlignmentType** | **String** | Vertical alignment of target value area relative to the field anchor; Possible values are VCenter, Top, Bottom |  [optional]
**horizontalAlignmentType** | **String** | Horizontal alignment of target value area relative to the field anchor; Possible values are Left, Right |  [optional]
**targetFieldWidthRelative** | **Double** | Optional - scale factor for target field width - relative to width of field title; a value of 1.0 indicates the target value area has the same width as the field value as occurring in the image; a value of 2.0 would indicate that the target value area has 2 times the width of the field value as occurring in the image. |  [optional]
**targetFieldHeightRelative** | **Double** | Optional - scale factor for target field height - relative to height of field title |  [optional]
**targetFieldHorizontalAdjustment** | **Double** | Optional - horizontal adjestment in relative width of the field |  [optional]
**targetFieldVerticalAdjustment** | **Double** | Optional - vertical adjestment in relative height of the field |  [optional]
**ignore** | **List&lt;String&gt;** | Optional - Ignore any result items that contain a partial or complete match with these text strings |  [optional]
**options** | **String** | Optional - additional options that can be set for this field definition, separated by commas.  Possible values are AllowMultiMatch (allow the same anchor to be matched to multiple fields) |  [optional]



