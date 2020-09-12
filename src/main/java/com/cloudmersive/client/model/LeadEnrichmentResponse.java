/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of the lead enrichment process
 */
@ApiModel(description = "Result of the lead enrichment process")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-12T15:35:24.792-07:00")
public class LeadEnrichmentResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("LeadType")
  private String leadType = null;

  @SerializedName("ContactBusinessEmail")
  private String contactBusinessEmail = null;

  @SerializedName("ContactFirstName")
  private String contactFirstName = null;

  @SerializedName("ContactLastName")
  private String contactLastName = null;

  @SerializedName("ContactGender")
  private String contactGender = null;

  @SerializedName("CompanyName")
  private String companyName = null;

  @SerializedName("CompanyDomainName")
  private String companyDomainName = null;

  @SerializedName("CompanyHouseNumber")
  private String companyHouseNumber = null;

  @SerializedName("CompanyStreet")
  private String companyStreet = null;

  @SerializedName("CompanyCity")
  private String companyCity = null;

  @SerializedName("CompanyStateOrProvince")
  private String companyStateOrProvince = null;

  @SerializedName("CompanyPostalCode")
  private String companyPostalCode = null;

  @SerializedName("CompanyCountry")
  private String companyCountry = null;

  @SerializedName("CompanyCountryCode")
  private String companyCountryCode = null;

  @SerializedName("CompanyTelephone")
  private String companyTelephone = null;

  @SerializedName("CompanyVATNumber")
  private String companyVATNumber = null;

  @SerializedName("EmployeeCount")
  private Integer employeeCount = null;

  public LeadEnrichmentResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public LeadEnrichmentResponse leadType(String leadType) {
    this.leadType = leadType;
    return this;
  }

   /**
   * The type of the lead; possible types are Junk (a single individual using a disposable/throwaway email address); Individual (a single individual, typically a consumer, not purchasing on behalf of a business); SmallBusiness (a small business, typically with fewer than 100 employees); MediumBusiness (a medium business, larger than 100 employees but fewer than 1000 employees); Enterprise (a large business with greater than 1000 employees); Business (a business customer of unknown size)
   * @return leadType
  **/
  @ApiModelProperty(value = "The type of the lead; possible types are Junk (a single individual using a disposable/throwaway email address); Individual (a single individual, typically a consumer, not purchasing on behalf of a business); SmallBusiness (a small business, typically with fewer than 100 employees); MediumBusiness (a medium business, larger than 100 employees but fewer than 1000 employees); Enterprise (a large business with greater than 1000 employees); Business (a business customer of unknown size)")
  public String getLeadType() {
    return leadType;
  }

  public void setLeadType(String leadType) {
    this.leadType = leadType;
  }

  public LeadEnrichmentResponse contactBusinessEmail(String contactBusinessEmail) {
    this.contactBusinessEmail = contactBusinessEmail;
    return this;
  }

   /**
   * The person&#39;s business email address for the lead
   * @return contactBusinessEmail
  **/
  @ApiModelProperty(value = "The person's business email address for the lead")
  public String getContactBusinessEmail() {
    return contactBusinessEmail;
  }

  public void setContactBusinessEmail(String contactBusinessEmail) {
    this.contactBusinessEmail = contactBusinessEmail;
  }

  public LeadEnrichmentResponse contactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
    return this;
  }

   /**
   * The person&#39;s first name for the lead
   * @return contactFirstName
  **/
  @ApiModelProperty(value = "The person's first name for the lead")
  public String getContactFirstName() {
    return contactFirstName;
  }

  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }

  public LeadEnrichmentResponse contactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
    return this;
  }

   /**
   * The person&#39;s last name for the lead
   * @return contactLastName
  **/
  @ApiModelProperty(value = "The person's last name for the lead")
  public String getContactLastName() {
    return contactLastName;
  }

  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }

  public LeadEnrichmentResponse contactGender(String contactGender) {
    this.contactGender = contactGender;
    return this;
  }

   /**
   * Gender for contact name; possible values are Male, Female, and Neutral (can be applied to Male or Female).  Requires ContactFirstName.
   * @return contactGender
  **/
  @ApiModelProperty(value = "Gender for contact name; possible values are Male, Female, and Neutral (can be applied to Male or Female).  Requires ContactFirstName.")
  public String getContactGender() {
    return contactGender;
  }

  public void setContactGender(String contactGender) {
    this.contactGender = contactGender;
  }

  public LeadEnrichmentResponse companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the company for the lead
   * @return companyName
  **/
  @ApiModelProperty(value = "Name of the company for the lead")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public LeadEnrichmentResponse companyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
    return this;
  }

   /**
   * Domain name / website for the lead
   * @return companyDomainName
  **/
  @ApiModelProperty(value = "Domain name / website for the lead")
  public String getCompanyDomainName() {
    return companyDomainName;
  }

  public void setCompanyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
  }

  public LeadEnrichmentResponse companyHouseNumber(String companyHouseNumber) {
    this.companyHouseNumber = companyHouseNumber;
    return this;
  }

   /**
   * House number of the address of the company for the lead
   * @return companyHouseNumber
  **/
  @ApiModelProperty(value = "House number of the address of the company for the lead")
  public String getCompanyHouseNumber() {
    return companyHouseNumber;
  }

  public void setCompanyHouseNumber(String companyHouseNumber) {
    this.companyHouseNumber = companyHouseNumber;
  }

  public LeadEnrichmentResponse companyStreet(String companyStreet) {
    this.companyStreet = companyStreet;
    return this;
  }

   /**
   * Street name of the address of the company for the lead
   * @return companyStreet
  **/
  @ApiModelProperty(value = "Street name of the address of the company for the lead")
  public String getCompanyStreet() {
    return companyStreet;
  }

  public void setCompanyStreet(String companyStreet) {
    this.companyStreet = companyStreet;
  }

  public LeadEnrichmentResponse companyCity(String companyCity) {
    this.companyCity = companyCity;
    return this;
  }

   /**
   * City of the address of the company for the lead
   * @return companyCity
  **/
  @ApiModelProperty(value = "City of the address of the company for the lead")
  public String getCompanyCity() {
    return companyCity;
  }

  public void setCompanyCity(String companyCity) {
    this.companyCity = companyCity;
  }

  public LeadEnrichmentResponse companyStateOrProvince(String companyStateOrProvince) {
    this.companyStateOrProvince = companyStateOrProvince;
    return this;
  }

   /**
   * State or Province of the address of the company for the lead
   * @return companyStateOrProvince
  **/
  @ApiModelProperty(value = "State or Province of the address of the company for the lead")
  public String getCompanyStateOrProvince() {
    return companyStateOrProvince;
  }

  public void setCompanyStateOrProvince(String companyStateOrProvince) {
    this.companyStateOrProvince = companyStateOrProvince;
  }

  public LeadEnrichmentResponse companyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
    return this;
  }

   /**
   * Postal Code of the address of the company for the lead
   * @return companyPostalCode
  **/
  @ApiModelProperty(value = "Postal Code of the address of the company for the lead")
  public String getCompanyPostalCode() {
    return companyPostalCode;
  }

  public void setCompanyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
  }

  public LeadEnrichmentResponse companyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
    return this;
  }

   /**
   * Country Name of the address of the company for the lead
   * @return companyCountry
  **/
  @ApiModelProperty(value = "Country Name of the address of the company for the lead")
  public String getCompanyCountry() {
    return companyCountry;
  }

  public void setCompanyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
  }

  public LeadEnrichmentResponse companyCountryCode(String companyCountryCode) {
    this.companyCountryCode = companyCountryCode;
    return this;
  }

   /**
   * Country Code (2-letter ISO 3166-1) of the address of the company for the lead
   * @return companyCountryCode
  **/
  @ApiModelProperty(value = "Country Code (2-letter ISO 3166-1) of the address of the company for the lead")
  public String getCompanyCountryCode() {
    return companyCountryCode;
  }

  public void setCompanyCountryCode(String companyCountryCode) {
    this.companyCountryCode = companyCountryCode;
  }

  public LeadEnrichmentResponse companyTelephone(String companyTelephone) {
    this.companyTelephone = companyTelephone;
    return this;
  }

   /**
   * Telephone of the company office for the lead
   * @return companyTelephone
  **/
  @ApiModelProperty(value = "Telephone of the company office for the lead")
  public String getCompanyTelephone() {
    return companyTelephone;
  }

  public void setCompanyTelephone(String companyTelephone) {
    this.companyTelephone = companyTelephone;
  }

  public LeadEnrichmentResponse companyVATNumber(String companyVATNumber) {
    this.companyVATNumber = companyVATNumber;
    return this;
  }

   /**
   * VAT number of the company for the lead
   * @return companyVATNumber
  **/
  @ApiModelProperty(value = "VAT number of the company for the lead")
  public String getCompanyVATNumber() {
    return companyVATNumber;
  }

  public void setCompanyVATNumber(String companyVATNumber) {
    this.companyVATNumber = companyVATNumber;
  }

  public LeadEnrichmentResponse employeeCount(Integer employeeCount) {
    this.employeeCount = employeeCount;
    return this;
  }

   /**
   * Count of employees at the company (estimated), if available
   * @return employeeCount
  **/
  @ApiModelProperty(value = "Count of employees at the company (estimated), if available")
  public Integer getEmployeeCount() {
    return employeeCount;
  }

  public void setEmployeeCount(Integer employeeCount) {
    this.employeeCount = employeeCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadEnrichmentResponse leadEnrichmentResponse = (LeadEnrichmentResponse) o;
    return Objects.equals(this.successful, leadEnrichmentResponse.successful) &&
        Objects.equals(this.leadType, leadEnrichmentResponse.leadType) &&
        Objects.equals(this.contactBusinessEmail, leadEnrichmentResponse.contactBusinessEmail) &&
        Objects.equals(this.contactFirstName, leadEnrichmentResponse.contactFirstName) &&
        Objects.equals(this.contactLastName, leadEnrichmentResponse.contactLastName) &&
        Objects.equals(this.contactGender, leadEnrichmentResponse.contactGender) &&
        Objects.equals(this.companyName, leadEnrichmentResponse.companyName) &&
        Objects.equals(this.companyDomainName, leadEnrichmentResponse.companyDomainName) &&
        Objects.equals(this.companyHouseNumber, leadEnrichmentResponse.companyHouseNumber) &&
        Objects.equals(this.companyStreet, leadEnrichmentResponse.companyStreet) &&
        Objects.equals(this.companyCity, leadEnrichmentResponse.companyCity) &&
        Objects.equals(this.companyStateOrProvince, leadEnrichmentResponse.companyStateOrProvince) &&
        Objects.equals(this.companyPostalCode, leadEnrichmentResponse.companyPostalCode) &&
        Objects.equals(this.companyCountry, leadEnrichmentResponse.companyCountry) &&
        Objects.equals(this.companyCountryCode, leadEnrichmentResponse.companyCountryCode) &&
        Objects.equals(this.companyTelephone, leadEnrichmentResponse.companyTelephone) &&
        Objects.equals(this.companyVATNumber, leadEnrichmentResponse.companyVATNumber) &&
        Objects.equals(this.employeeCount, leadEnrichmentResponse.employeeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, leadType, contactBusinessEmail, contactFirstName, contactLastName, contactGender, companyName, companyDomainName, companyHouseNumber, companyStreet, companyCity, companyStateOrProvince, companyPostalCode, companyCountry, companyCountryCode, companyTelephone, companyVATNumber, employeeCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadEnrichmentResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    leadType: ").append(toIndentedString(leadType)).append("\n");
    sb.append("    contactBusinessEmail: ").append(toIndentedString(contactBusinessEmail)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    contactGender: ").append(toIndentedString(contactGender)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyDomainName: ").append(toIndentedString(companyDomainName)).append("\n");
    sb.append("    companyHouseNumber: ").append(toIndentedString(companyHouseNumber)).append("\n");
    sb.append("    companyStreet: ").append(toIndentedString(companyStreet)).append("\n");
    sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
    sb.append("    companyStateOrProvince: ").append(toIndentedString(companyStateOrProvince)).append("\n");
    sb.append("    companyPostalCode: ").append(toIndentedString(companyPostalCode)).append("\n");
    sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
    sb.append("    companyCountryCode: ").append(toIndentedString(companyCountryCode)).append("\n");
    sb.append("    companyTelephone: ").append(toIndentedString(companyTelephone)).append("\n");
    sb.append("    companyVATNumber: ").append(toIndentedString(companyVATNumber)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

