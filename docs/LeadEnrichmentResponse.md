
# LeadEnrichmentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the operation was successful, false otherwise |  [optional]
**leadType** | **String** | The type of the lead; possible types are Junk (a single individual using a disposable/throwaway email address); Individual (a single individual, typically a consumer, not purchasing on behalf of a business); SmallBusiness (a small business, typically with fewer than 100 employees); MediumBusiness (a medium business, larger than 100 employees but fewer than 1000 employees); Enterprise (a large business with greater than 1000 employees); Business (a business customer of unknown size) |  [optional]
**contactBusinessEmail** | **String** | The person&#39;s business email address for the lead |  [optional]
**contactFirstName** | **String** | The person&#39;s first name for the lead |  [optional]
**contactLastName** | **String** | The person&#39;s last name for the lead |  [optional]
**contactGender** | **String** | Gender for contact name; possible values are Male, Female, and Neutral (can be applied to Male or Female).  Requires ContactFirstName. |  [optional]
**companyName** | **String** | Name of the company for the lead |  [optional]
**companyDomainName** | **String** | Domain name / website for the lead |  [optional]
**companyHouseNumber** | **String** | House number of the address of the company for the lead |  [optional]
**companyStreet** | **String** | Street name of the address of the company for the lead |  [optional]
**companyCity** | **String** | City of the address of the company for the lead |  [optional]
**companyStateOrProvince** | **String** | State or Province of the address of the company for the lead |  [optional]
**companyPostalCode** | **String** | Postal Code of the address of the company for the lead |  [optional]
**companyCountry** | **String** | Country Name of the address of the company for the lead |  [optional]
**companyCountryCode** | **String** | Country Code (2-letter ISO 3166-1) of the address of the company for the lead |  [optional]
**companyTelephone** | **String** | Telephone of the company office for the lead |  [optional]
**companyVATNumber** | **String** | VAT number of the company for the lead |  [optional]
**employeeCount** | **Integer** | Count of employees at the company (estimated), if available |  [optional]



