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
import org.threeten.bp.OffsetDateTime;

/**
 * Result of a WHOIS operation
 */
@ApiModel(description = "Result of a WHOIS operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-02T20:49:38.361-07:00")
public class WhoisResponse {
  @SerializedName("ValidDomain")
  private Boolean validDomain = null;

  @SerializedName("RegistrantName")
  private String registrantName = null;

  @SerializedName("RegistrantOrganization")
  private String registrantOrganization = null;

  @SerializedName("RegistrantEmail")
  private String registrantEmail = null;

  @SerializedName("RegistrantStreetNumber")
  private String registrantStreetNumber = null;

  @SerializedName("RegistrantStreet")
  private String registrantStreet = null;

  @SerializedName("RegistrantCity")
  private String registrantCity = null;

  @SerializedName("RegistrantStateOrProvince")
  private String registrantStateOrProvince = null;

  @SerializedName("RegistrantPostalCode")
  private String registrantPostalCode = null;

  @SerializedName("RegistrantCountry")
  private String registrantCountry = null;

  @SerializedName("RegistrantRawAddress")
  private String registrantRawAddress = null;

  @SerializedName("RegistrantTelephone")
  private String registrantTelephone = null;

  @SerializedName("WhoisServer")
  private String whoisServer = null;

  @SerializedName("RawTextRecord")
  private String rawTextRecord = null;

  @SerializedName("CreatedDt")
  private OffsetDateTime createdDt = null;

  public WhoisResponse validDomain(Boolean validDomain) {
    this.validDomain = validDomain;
    return this;
  }

   /**
   * True if the domain is valid, false if it is not
   * @return validDomain
  **/
  @ApiModelProperty(value = "True if the domain is valid, false if it is not")
  public Boolean isValidDomain() {
    return validDomain;
  }

  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }

  public WhoisResponse registrantName(String registrantName) {
    this.registrantName = registrantName;
    return this;
  }

   /**
   * Name of the domain registrant
   * @return registrantName
  **/
  @ApiModelProperty(value = "Name of the domain registrant")
  public String getRegistrantName() {
    return registrantName;
  }

  public void setRegistrantName(String registrantName) {
    this.registrantName = registrantName;
  }

  public WhoisResponse registrantOrganization(String registrantOrganization) {
    this.registrantOrganization = registrantOrganization;
    return this;
  }

   /**
   * Organization name of the domain registrant
   * @return registrantOrganization
  **/
  @ApiModelProperty(value = "Organization name of the domain registrant")
  public String getRegistrantOrganization() {
    return registrantOrganization;
  }

  public void setRegistrantOrganization(String registrantOrganization) {
    this.registrantOrganization = registrantOrganization;
  }

  public WhoisResponse registrantEmail(String registrantEmail) {
    this.registrantEmail = registrantEmail;
    return this;
  }

   /**
   * Email address of the domain registrant
   * @return registrantEmail
  **/
  @ApiModelProperty(value = "Email address of the domain registrant")
  public String getRegistrantEmail() {
    return registrantEmail;
  }

  public void setRegistrantEmail(String registrantEmail) {
    this.registrantEmail = registrantEmail;
  }

  public WhoisResponse registrantStreetNumber(String registrantStreetNumber) {
    this.registrantStreetNumber = registrantStreetNumber;
    return this;
  }

   /**
   * Street number of the address of the domain registrant, if available
   * @return registrantStreetNumber
  **/
  @ApiModelProperty(value = "Street number of the address of the domain registrant, if available")
  public String getRegistrantStreetNumber() {
    return registrantStreetNumber;
  }

  public void setRegistrantStreetNumber(String registrantStreetNumber) {
    this.registrantStreetNumber = registrantStreetNumber;
  }

  public WhoisResponse registrantStreet(String registrantStreet) {
    this.registrantStreet = registrantStreet;
    return this;
  }

   /**
   * Street name of the address of the domain registrant, if available
   * @return registrantStreet
  **/
  @ApiModelProperty(value = "Street name of the address of the domain registrant, if available")
  public String getRegistrantStreet() {
    return registrantStreet;
  }

  public void setRegistrantStreet(String registrantStreet) {
    this.registrantStreet = registrantStreet;
  }

  public WhoisResponse registrantCity(String registrantCity) {
    this.registrantCity = registrantCity;
    return this;
  }

   /**
   * City of the domain registrant, if available
   * @return registrantCity
  **/
  @ApiModelProperty(value = "City of the domain registrant, if available")
  public String getRegistrantCity() {
    return registrantCity;
  }

  public void setRegistrantCity(String registrantCity) {
    this.registrantCity = registrantCity;
  }

  public WhoisResponse registrantStateOrProvince(String registrantStateOrProvince) {
    this.registrantStateOrProvince = registrantStateOrProvince;
    return this;
  }

   /**
   * State or Province of the address of the domain registrant, if available
   * @return registrantStateOrProvince
  **/
  @ApiModelProperty(value = "State or Province of the address of the domain registrant, if available")
  public String getRegistrantStateOrProvince() {
    return registrantStateOrProvince;
  }

  public void setRegistrantStateOrProvince(String registrantStateOrProvince) {
    this.registrantStateOrProvince = registrantStateOrProvince;
  }

  public WhoisResponse registrantPostalCode(String registrantPostalCode) {
    this.registrantPostalCode = registrantPostalCode;
    return this;
  }

   /**
   * Postal code of the address of the domain registrant, if available
   * @return registrantPostalCode
  **/
  @ApiModelProperty(value = "Postal code of the address of the domain registrant, if available")
  public String getRegistrantPostalCode() {
    return registrantPostalCode;
  }

  public void setRegistrantPostalCode(String registrantPostalCode) {
    this.registrantPostalCode = registrantPostalCode;
  }

  public WhoisResponse registrantCountry(String registrantCountry) {
    this.registrantCountry = registrantCountry;
    return this;
  }

   /**
   * Country of the address of the domain registrant, if available
   * @return registrantCountry
  **/
  @ApiModelProperty(value = "Country of the address of the domain registrant, if available")
  public String getRegistrantCountry() {
    return registrantCountry;
  }

  public void setRegistrantCountry(String registrantCountry) {
    this.registrantCountry = registrantCountry;
  }

  public WhoisResponse registrantRawAddress(String registrantRawAddress) {
    this.registrantRawAddress = registrantRawAddress;
    return this;
  }

   /**
   * Raw address string of the domain registrant, if available
   * @return registrantRawAddress
  **/
  @ApiModelProperty(value = "Raw address string of the domain registrant, if available")
  public String getRegistrantRawAddress() {
    return registrantRawAddress;
  }

  public void setRegistrantRawAddress(String registrantRawAddress) {
    this.registrantRawAddress = registrantRawAddress;
  }

  public WhoisResponse registrantTelephone(String registrantTelephone) {
    this.registrantTelephone = registrantTelephone;
    return this;
  }

   /**
   * Telephone number of the address of the domain registrant
   * @return registrantTelephone
  **/
  @ApiModelProperty(value = "Telephone number of the address of the domain registrant")
  public String getRegistrantTelephone() {
    return registrantTelephone;
  }

  public void setRegistrantTelephone(String registrantTelephone) {
    this.registrantTelephone = registrantTelephone;
  }

  public WhoisResponse whoisServer(String whoisServer) {
    this.whoisServer = whoisServer;
    return this;
  }

   /**
   * Server used to lookup WHOIS information (may change based on lookup).
   * @return whoisServer
  **/
  @ApiModelProperty(value = "Server used to lookup WHOIS information (may change based on lookup).")
  public String getWhoisServer() {
    return whoisServer;
  }

  public void setWhoisServer(String whoisServer) {
    this.whoisServer = whoisServer;
  }

  public WhoisResponse rawTextRecord(String rawTextRecord) {
    this.rawTextRecord = rawTextRecord;
    return this;
  }

   /**
   * WHOIS raw text record
   * @return rawTextRecord
  **/
  @ApiModelProperty(value = "WHOIS raw text record")
  public String getRawTextRecord() {
    return rawTextRecord;
  }

  public void setRawTextRecord(String rawTextRecord) {
    this.rawTextRecord = rawTextRecord;
  }

  public WhoisResponse createdDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
    return this;
  }

   /**
   * Creation date for the record
   * @return createdDt
  **/
  @ApiModelProperty(value = "Creation date for the record")
  public OffsetDateTime getCreatedDt() {
    return createdDt;
  }

  public void setCreatedDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhoisResponse whoisResponse = (WhoisResponse) o;
    return Objects.equals(this.validDomain, whoisResponse.validDomain) &&
        Objects.equals(this.registrantName, whoisResponse.registrantName) &&
        Objects.equals(this.registrantOrganization, whoisResponse.registrantOrganization) &&
        Objects.equals(this.registrantEmail, whoisResponse.registrantEmail) &&
        Objects.equals(this.registrantStreetNumber, whoisResponse.registrantStreetNumber) &&
        Objects.equals(this.registrantStreet, whoisResponse.registrantStreet) &&
        Objects.equals(this.registrantCity, whoisResponse.registrantCity) &&
        Objects.equals(this.registrantStateOrProvince, whoisResponse.registrantStateOrProvince) &&
        Objects.equals(this.registrantPostalCode, whoisResponse.registrantPostalCode) &&
        Objects.equals(this.registrantCountry, whoisResponse.registrantCountry) &&
        Objects.equals(this.registrantRawAddress, whoisResponse.registrantRawAddress) &&
        Objects.equals(this.registrantTelephone, whoisResponse.registrantTelephone) &&
        Objects.equals(this.whoisServer, whoisResponse.whoisServer) &&
        Objects.equals(this.rawTextRecord, whoisResponse.rawTextRecord) &&
        Objects.equals(this.createdDt, whoisResponse.createdDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validDomain, registrantName, registrantOrganization, registrantEmail, registrantStreetNumber, registrantStreet, registrantCity, registrantStateOrProvince, registrantPostalCode, registrantCountry, registrantRawAddress, registrantTelephone, whoisServer, rawTextRecord, createdDt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhoisResponse {\n");
    
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
    sb.append("    registrantName: ").append(toIndentedString(registrantName)).append("\n");
    sb.append("    registrantOrganization: ").append(toIndentedString(registrantOrganization)).append("\n");
    sb.append("    registrantEmail: ").append(toIndentedString(registrantEmail)).append("\n");
    sb.append("    registrantStreetNumber: ").append(toIndentedString(registrantStreetNumber)).append("\n");
    sb.append("    registrantStreet: ").append(toIndentedString(registrantStreet)).append("\n");
    sb.append("    registrantCity: ").append(toIndentedString(registrantCity)).append("\n");
    sb.append("    registrantStateOrProvince: ").append(toIndentedString(registrantStateOrProvince)).append("\n");
    sb.append("    registrantPostalCode: ").append(toIndentedString(registrantPostalCode)).append("\n");
    sb.append("    registrantCountry: ").append(toIndentedString(registrantCountry)).append("\n");
    sb.append("    registrantRawAddress: ").append(toIndentedString(registrantRawAddress)).append("\n");
    sb.append("    registrantTelephone: ").append(toIndentedString(registrantTelephone)).append("\n");
    sb.append("    whoisServer: ").append(toIndentedString(whoisServer)).append("\n");
    sb.append("    rawTextRecord: ").append(toIndentedString(rawTextRecord)).append("\n");
    sb.append("    createdDt: ").append(toIndentedString(createdDt)).append("\n");
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

