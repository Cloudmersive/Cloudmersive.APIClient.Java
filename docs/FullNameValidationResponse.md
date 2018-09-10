
# FullNameValidationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the validation operation was successful, false otherwise |  [optional]
**validationResultFirstName** | **String** | Possible values are: ValidFirstName, ValidUnknownFirstName, InvalidSpamInput, InvalidCharacters, InvalidEmpty |  [optional]
**validationResultLastName** | **String** | Possible values are: ValidLastName, ValidUnknownLastName, InvalidSpamInput, InvalidCharacters, InvalidEmpty |  [optional]
**title** | **String** | The person&#39;s title (if supplied), e.g. \&quot;Mr.\&quot; or \&quot;Ms.\&quot; |  [optional]
**firstName** | **String** | The first name (given name) |  [optional]
**middleName** | **String** | The middle name(s); if there are multiple names they will be separated by spaces |  [optional]
**lastName** | **String** | The last name (surname) |  [optional]
**nickName** | **String** | Nickname (if supplied) |  [optional]
**suffix** | **String** | Suffix to the name, e.g. \&quot;Jr.\&quot; or \&quot;Sr.\&quot; |  [optional]
**displayName** | **String** | The full display name of the name |  [optional]



