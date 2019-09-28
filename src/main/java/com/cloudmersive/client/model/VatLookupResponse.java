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
 * VatLookupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-28T11:38:03.939-07:00")
public class VatLookupResponse {
  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("VatNumber")
  private String vatNumber = null;

  @SerializedName("IsValid")
  private Boolean isValid = null;

  @SerializedName("BusinessName")
  private String businessName = null;

  @SerializedName("BusinessAddress")
  private String businessAddress = null;

  public VatLookupResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Two-letter country code
   * @return countryCode
  **/
  @ApiModelProperty(value = "Two-letter country code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public VatLookupResponse vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * VAT number
   * @return vatNumber
  **/
  @ApiModelProperty(value = "VAT number")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public VatLookupResponse isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * True if the VAT code is valid, false otherwise
   * @return isValid
  **/
  @ApiModelProperty(value = "True if the VAT code is valid, false otherwise")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public VatLookupResponse businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Name of the business
   * @return businessName
  **/
  @ApiModelProperty(value = "Name of the business")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public VatLookupResponse businessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Business address
   * @return businessAddress
  **/
  @ApiModelProperty(value = "Business address")
  public String getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VatLookupResponse vatLookupResponse = (VatLookupResponse) o;
    return Objects.equals(this.countryCode, vatLookupResponse.countryCode) &&
        Objects.equals(this.vatNumber, vatLookupResponse.vatNumber) &&
        Objects.equals(this.isValid, vatLookupResponse.isValid) &&
        Objects.equals(this.businessName, vatLookupResponse.businessName) &&
        Objects.equals(this.businessAddress, vatLookupResponse.businessAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, vatNumber, isValid, businessName, businessAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VatLookupResponse {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
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

