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
 * Result of validating a street address
 */
@ApiModel(description = "Result of validating a street address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T00:53:45.686-07:00")
public class NormalizeAddressResponse {
  @SerializedName("ValidAddress")
  private Boolean validAddress = null;

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

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public NormalizeAddressResponse validAddress(Boolean validAddress) {
    this.validAddress = validAddress;
    return this;
  }

   /**
   * True if the address is valid, false otherwise
   * @return validAddress
  **/
  @ApiModelProperty(value = "True if the address is valid, false otherwise")
  public Boolean isValidAddress() {
    return validAddress;
  }

  public void setValidAddress(Boolean validAddress) {
    this.validAddress = validAddress;
  }

  public NormalizeAddressResponse building(String building) {
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

  public NormalizeAddressResponse streetNumber(String streetNumber) {
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

  public NormalizeAddressResponse street(String street) {
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

  public NormalizeAddressResponse city(String city) {
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

  public NormalizeAddressResponse stateOrProvince(String stateOrProvince) {
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

  public NormalizeAddressResponse postalCode(String postalCode) {
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

  public NormalizeAddressResponse countryFullName(String countryFullName) {
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

  public NormalizeAddressResponse isOTwoLetterCode(String isOTwoLetterCode) {
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

  public NormalizeAddressResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * If the address is valid, the degrees latitude of the validated address, null otherwise
   * @return latitude
  **/
  @ApiModelProperty(value = "If the address is valid, the degrees latitude of the validated address, null otherwise")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public NormalizeAddressResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * If the address is valid, the degrees longitude of the validated address, null otherwise
   * @return longitude
  **/
  @ApiModelProperty(value = "If the address is valid, the degrees longitude of the validated address, null otherwise")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizeAddressResponse normalizeAddressResponse = (NormalizeAddressResponse) o;
    return Objects.equals(this.validAddress, normalizeAddressResponse.validAddress) &&
        Objects.equals(this.building, normalizeAddressResponse.building) &&
        Objects.equals(this.streetNumber, normalizeAddressResponse.streetNumber) &&
        Objects.equals(this.street, normalizeAddressResponse.street) &&
        Objects.equals(this.city, normalizeAddressResponse.city) &&
        Objects.equals(this.stateOrProvince, normalizeAddressResponse.stateOrProvince) &&
        Objects.equals(this.postalCode, normalizeAddressResponse.postalCode) &&
        Objects.equals(this.countryFullName, normalizeAddressResponse.countryFullName) &&
        Objects.equals(this.isOTwoLetterCode, normalizeAddressResponse.isOTwoLetterCode) &&
        Objects.equals(this.latitude, normalizeAddressResponse.latitude) &&
        Objects.equals(this.longitude, normalizeAddressResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, building, streetNumber, street, city, stateOrProvince, postalCode, countryFullName, isOTwoLetterCode, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizeAddressResponse {\n");
    
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

