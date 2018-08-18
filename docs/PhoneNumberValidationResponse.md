
# PhoneNumberValidationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isValid** | **Boolean** | True if the phone number is valid, false otherwise |  [optional]
**successful** | **Boolean** | True if the operation was successful, false if there was an error during validation.  See IsValid for validation result. |  [optional]
**phoneNumberType** | **String** | Type of phone number; possible values are: FixedLine, Mobile, FixedLineOrMobile, TollFree, PremiumRate,   SharedCost, Voip, PersonalNumber, Pager, Uan, Voicemail, Unknown |  [optional]
**e164Format** | **String** | E.164 format of the phone number |  [optional]
**internationalFormat** | **String** | Internaltional format of the phone number |  [optional]
**nationalFormat** | **String** | National format of the phone number |  [optional]
**countryCode** | **String** | Two digit country code of the phone number |  [optional]
**countryName** | **String** | User-friendly long name of the country for the phone number |  [optional]



