
# VatLookupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryCode** | **String** | Two-letter country code |  [optional]
**vatNumber** | **String** | VAT number |  [optional]
**isValid** | **Boolean** | True if the VAT code is valid, false otherwise |  [optional]
**businessName** | **String** | Name of the business |  [optional]
**businessAddress** | **String** | Business address as a single string |  [optional]
**businessBuilding** | **String** | For the business address, the name of the building, house or structure if applicable, such as \&quot;Cloudmersive Building 2\&quot;.  This will often by null. |  [optional]
**businessStreetNumber** | **String** | For the business address, the street number or house number of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;1600\&quot;.  This value will typically be populated for most addresses. |  [optional]
**businessStreet** | **String** | For the business address, the name of the street or road of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;Pennsylvania Avenue NW\&quot;. |  [optional]
**businessCity** | **String** | For the business address, the city of the address. |  [optional]
**businessStateOrProvince** | **String** | For the business address, the state or province of the address. |  [optional]
**businessPostalCode** | **String** | For the business address, the postal code or zip code of the address. |  [optional]
**businessCountry** | **String** | For the business address, country of the address, if present in the address.  If not included in the address it will be null. |  [optional]



