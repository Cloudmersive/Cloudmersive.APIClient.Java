
# IPIntelligenceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isBot** | **Boolean** | True if the IP address is a known bot, otherwise false |  [optional]
**isTorNode** | **Boolean** | True if the IP address is a known Tor exit node, otherwise false |  [optional]
**isThreat** | **Boolean** | True if the IP address is a known threat IP, otherwise false |  [optional]
**isEU** | **Boolean** | True if the IP address is in the European Union, otherwise false |  [optional]
**location** | [**GeolocateResponse**](GeolocateResponse.md) | Returns the location of the IP address |  [optional]
**currencyCode** | **String** | ISO 4217 currency code for the IP address location |  [optional]
**currencyName** | **String** | Name of the currency in English |  [optional]
**regionArea** | **String** | Region (continent) in which the country is located; possible values are None, Europe, Americas, Asia, Africa, Oceania |  [optional]
**subregionArea** | **String** | Subregion in which the country is located; possible values are None, NorthernEurope, WesternEurope, SouthernEurope, EasternEurope, CentralAmerica, NorthernAmerica, SouthAmerica, EasternAfrica, MiddleAfrica, NorthernAfrica , SouthernAfrica , WesternAfrica , CentralAsia , EasternAsia , SouthernAsia , SouthEasternAsia , WesternAsia , Southern , Middle , AustraliaandNewZealand , Melanesia , Polynesia , Micronesia , Caribbean, |  [optional]



