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
 * Request to validate a phone number
 */
@ApiModel(description = "Request to validate a phone number")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:59:40.808-07:00")
public class PhoneNumberValidateRequest {
  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("DefaultCountryCode")
  private String defaultCountryCode = null;

  public PhoneNumberValidateRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Raw phone number string to parse as input for validation
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Raw phone number string to parse as input for validation")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PhoneNumberValidateRequest defaultCountryCode(String defaultCountryCode) {
    this.defaultCountryCode = defaultCountryCode;
    return this;
  }

   /**
   * Optional, default country code.  If left blank, will default to \&quot;US\&quot;.
   * @return defaultCountryCode
  **/
  @ApiModelProperty(value = "Optional, default country code.  If left blank, will default to \"US\".")
  public String getDefaultCountryCode() {
    return defaultCountryCode;
  }

  public void setDefaultCountryCode(String defaultCountryCode) {
    this.defaultCountryCode = defaultCountryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberValidateRequest phoneNumberValidateRequest = (PhoneNumberValidateRequest) o;
    return Objects.equals(this.phoneNumber, phoneNumberValidateRequest.phoneNumber) &&
        Objects.equals(this.defaultCountryCode, phoneNumberValidateRequest.defaultCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, defaultCountryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberValidateRequest {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    defaultCountryCode: ").append(toIndentedString(defaultCountryCode)).append("\n");
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

