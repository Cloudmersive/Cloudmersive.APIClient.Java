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
 * Result of validating a postal code
 */
@ApiModel(description = "Result of validating a postal code")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-25T20:51:01.128-08:00")
public class ValidatePostalCodeResponse {
  @SerializedName("ValidPostalCode")
  private Boolean validPostalCode = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("StateOrProvince")
  private String stateOrProvince = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public ValidatePostalCodeResponse validPostalCode(Boolean validPostalCode) {
    this.validPostalCode = validPostalCode;
    return this;
  }

   /**
   * True if the Postal Code is valid, false otherwise
   * @return validPostalCode
  **/
  @ApiModelProperty(value = "True if the Postal Code is valid, false otherwise")
  public Boolean isValidPostalCode() {
    return validPostalCode;
  }

  public void setValidPostalCode(Boolean validPostalCode) {
    this.validPostalCode = validPostalCode;
  }

  public ValidatePostalCodeResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * If valid, City corresponding to the input postal code, such as &#39;Walnut Creek&#39;
   * @return city
  **/
  @ApiModelProperty(value = "If valid, City corresponding to the input postal code, such as 'Walnut Creek'")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ValidatePostalCodeResponse stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * If valid; State or province corresponding to the input postal code, such as &#39;CA&#39; or &#39;California&#39;
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "If valid; State or province corresponding to the input postal code, such as 'CA' or 'California'")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public ValidatePostalCodeResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * If the postal code is valid, the degrees latitude of the centroid of the postal code, null otherwise
   * @return latitude
  **/
  @ApiModelProperty(value = "If the postal code is valid, the degrees latitude of the centroid of the postal code, null otherwise")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public ValidatePostalCodeResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * If the postal code is valid, the degrees longitude of the centroid of the postal code, null otherwise
   * @return longitude
  **/
  @ApiModelProperty(value = "If the postal code is valid, the degrees longitude of the centroid of the postal code, null otherwise")
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
    ValidatePostalCodeResponse validatePostalCodeResponse = (ValidatePostalCodeResponse) o;
    return Objects.equals(this.validPostalCode, validatePostalCodeResponse.validPostalCode) &&
        Objects.equals(this.city, validatePostalCodeResponse.city) &&
        Objects.equals(this.stateOrProvince, validatePostalCodeResponse.stateOrProvince) &&
        Objects.equals(this.latitude, validatePostalCodeResponse.latitude) &&
        Objects.equals(this.longitude, validatePostalCodeResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validPostalCode, city, stateOrProvince, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatePostalCodeResponse {\n");
    
    sb.append("    validPostalCode: ").append(toIndentedString(validPostalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
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

