
# FormTableColumnDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columnID** | **String** | The identifier of the field; use this to identify which field is being referenced |  [optional]
**topAnchor** | **String** | Optional - the top anchor of the column heading |  [optional]
**anchorMode** | **String** | Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match).  Default is Partial. |  [optional]
**dataType** | **String** | The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace) |  [optional]
**minimumCharacterCount** | **Integer** | Optional - the target number of digits in the field; useful for fixed-length fields |  [optional]
**allowNumericDigits** | **Boolean** | Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits |  [optional]



