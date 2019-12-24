
# ParseAddressResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the parsing operation was successful, false otherwise |  [optional]
**building** | **String** | The name of the building, house or structure if applicable, such as \&quot;Cloudmersive Building 2\&quot;.  This will often by null. |  [optional]
**streetNumber** | **String** | The street number or house number of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;1600\&quot;.  This value will typically be populated for most addresses. |  [optional]
**street** | **String** | The name of the street or road of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;Pennsylvania Avenue NW\&quot;. |  [optional]
**city** | **String** | The city of the address. |  [optional]
**stateOrProvince** | **String** | The state or province of the address. |  [optional]
**postalCode** | **String** | The postal code or zip code of the address. |  [optional]
**countryFullName** | **String** | Country of the address, if present in the address.  If not included in the address it will be null. |  [optional]
**isOTwoLetterCode** | **String** | Two-letter ISO 3166-1 country code |  [optional]



