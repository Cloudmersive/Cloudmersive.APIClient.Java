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
 * Result of performing an identifier validation operation
 */
@ApiModel(description = "Result of performing an identifier validation operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-20T19:46:42.984-07:00")
public class ValidateIdentifierResponse {
  @SerializedName("ValidIdentifier")
  private Boolean validIdentifier = null;

  @SerializedName("Error")
  private String error = null;

  public ValidateIdentifierResponse validIdentifier(Boolean validIdentifier) {
    this.validIdentifier = validIdentifier;
    return this;
  }

   /**
   * True if the input identifier is valid, false otherwise
   * @return validIdentifier
  **/
  @ApiModelProperty(value = "True if the input identifier is valid, false otherwise")
  public Boolean isValidIdentifier() {
    return validIdentifier;
  }

  public void setValidIdentifier(Boolean validIdentifier) {
    this.validIdentifier = validIdentifier;
  }

  public ValidateIdentifierResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Resulting error from the identifier validation; possible errors are: \&quot;InputIsEmpty\&quot;, \&quot;ContainsWhitespace\&quot;, \&quot;ContainsNumbers\&quot;, \&quot;ContainsHyphen\&quot;, \&quot;ContainsUnderscore\&quot;, \&quot;ContainsPeriod\&quot;, \&quot;TooShort\&quot;, \&quot;TooLong\&quot;, \&quot;ContainsSpecialCharacters\&quot;
   * @return error
  **/
  @ApiModelProperty(value = "Resulting error from the identifier validation; possible errors are: \"InputIsEmpty\", \"ContainsWhitespace\", \"ContainsNumbers\", \"ContainsHyphen\", \"ContainsUnderscore\", \"ContainsPeriod\", \"TooShort\", \"TooLong\", \"ContainsSpecialCharacters\"")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateIdentifierResponse validateIdentifierResponse = (ValidateIdentifierResponse) o;
    return Objects.equals(this.validIdentifier, validateIdentifierResponse.validIdentifier) &&
        Objects.equals(this.error, validateIdentifierResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validIdentifier, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateIdentifierResponse {\n");
    
    sb.append("    validIdentifier: ").append(toIndentedString(validIdentifier)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

