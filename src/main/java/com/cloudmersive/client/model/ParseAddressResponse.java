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
 * Result of parsing an address into its component parts
 */
@ApiModel(description = "Result of parsing an address into its component parts")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-02T15:18:48.980-07:00")
public class ParseAddressResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Building")
  private String building = null;

  @SerializedName("StreetNumber")
  private String streetNumber = null;

  @SerializedName("Street")
  private String street = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("StateOrProvince")
  private String stateOrProvince = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("CountryFullName")
  private String countryFullName = null;

  @SerializedName("ISOTwoLetterCode")
  private String isOTwoLetterCode = null;

  public ParseAddressResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the parsing operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the parsing operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ParseAddressResponse building(String building) {
    this.building = building;
    return this;
  }

   /**
   * The name of the building, house or structure if applicable, such as \&quot;Cloudmersive Building 2\&quot;.  This will often by null.
   * @return building
  **/
  @ApiModelProperty(value = "The name of the building, house or structure if applicable, such as \"Cloudmersive Building 2\".  This will often by null.")
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public ParseAddressResponse streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * The street number or house number of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;1600\&quot;.  This value will typically be populated for most addresses.
   * @return streetNumber
  **/
  @ApiModelProperty(value = "The street number or house number of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"1600\".  This value will typically be populated for most addresses.")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public ParseAddressResponse street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The name of the street or road of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;Pennsylvania Avenue NW\&quot;.
   * @return street
  **/
  @ApiModelProperty(value = "The name of the street or road of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"Pennsylvania Avenue NW\".")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public ParseAddressResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the address.
   * @return city
  **/
  @ApiModelProperty(value = "The city of the address.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ParseAddressResponse stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The state or province of the address.
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "The state or province of the address.")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public ParseAddressResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code or zip code of the address.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code or zip code of the address.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ParseAddressResponse countryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
    return this;
  }

   /**
   * Country of the address, if present in the address.  If not included in the address it will be null.
   * @return countryFullName
  **/
  @ApiModelProperty(value = "Country of the address, if present in the address.  If not included in the address it will be null.")
  public String getCountryFullName() {
    return countryFullName;
  }

  public void setCountryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
  }

  public ParseAddressResponse isOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
    return this;
  }

   /**
   * Two-letter ISO 3166-1 country code
   * @return isOTwoLetterCode
  **/
  @ApiModelProperty(value = "Two-letter ISO 3166-1 country code")
  public String getIsOTwoLetterCode() {
    return isOTwoLetterCode;
  }

  public void setIsOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseAddressResponse parseAddressResponse = (ParseAddressResponse) o;
    return Objects.equals(this.successful, parseAddressResponse.successful) &&
        Objects.equals(this.building, parseAddressResponse.building) &&
        Objects.equals(this.streetNumber, parseAddressResponse.streetNumber) &&
        Objects.equals(this.street, parseAddressResponse.street) &&
        Objects.equals(this.city, parseAddressResponse.city) &&
        Objects.equals(this.stateOrProvince, parseAddressResponse.stateOrProvince) &&
        Objects.equals(this.postalCode, parseAddressResponse.postalCode) &&
        Objects.equals(this.countryFullName, parseAddressResponse.countryFullName) &&
        Objects.equals(this.isOTwoLetterCode, parseAddressResponse.isOTwoLetterCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, building, streetNumber, street, city, stateOrProvince, postalCode, countryFullName, isOTwoLetterCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseAddressResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
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

