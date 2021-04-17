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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-16T22:46:53.628-07:00")
public class ValidateAddressResponse {
  @SerializedName("ValidAddress")
  private Boolean validAddress = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public ValidateAddressResponse validAddress(Boolean validAddress) {
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

  public ValidateAddressResponse latitude(Double latitude) {
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

  public ValidateAddressResponse longitude(Double longitude) {
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
    ValidateAddressResponse validateAddressResponse = (ValidateAddressResponse) o;
    return Objects.equals(this.validAddress, validateAddressResponse.validAddress) &&
        Objects.equals(this.latitude, validateAddressResponse.latitude) &&
        Objects.equals(this.longitude, validateAddressResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAddressResponse {\n");
    
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
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

