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
 * Identifier validation request, including the input identifier as well as various identifier rules
 */
@ApiModel(description = "Identifier validation request, including the input identifier as well as various identifier rules")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-26T22:41:32.056-07:00")
public class ValidateIdentifierRequest {
  @SerializedName("Input")
  private String input = null;

  @SerializedName("AllowWhitespace")
  private Boolean allowWhitespace = null;

  @SerializedName("AllowHyphens")
  private Boolean allowHyphens = null;

  @SerializedName("AllowUnderscore")
  private Boolean allowUnderscore = null;

  @SerializedName("AllowNumbers")
  private Boolean allowNumbers = null;

  @SerializedName("AllowPeriods")
  private Boolean allowPeriods = null;

  @SerializedName("MaxLength")
  private Integer maxLength = null;

  @SerializedName("MinLength")
  private Integer minLength = null;

  public ValidateIdentifierRequest input(String input) {
    this.input = input;
    return this;
  }

   /**
   * Text string identifier input
   * @return input
  **/
  @ApiModelProperty(value = "Text string identifier input")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public ValidateIdentifierRequest allowWhitespace(Boolean allowWhitespace) {
    this.allowWhitespace = allowWhitespace;
    return this;
  }

   /**
   * True if whitespace is allowed in the identifier, false otherwise
   * @return allowWhitespace
  **/
  @ApiModelProperty(value = "True if whitespace is allowed in the identifier, false otherwise")
  public Boolean isAllowWhitespace() {
    return allowWhitespace;
  }

  public void setAllowWhitespace(Boolean allowWhitespace) {
    this.allowWhitespace = allowWhitespace;
  }

  public ValidateIdentifierRequest allowHyphens(Boolean allowHyphens) {
    this.allowHyphens = allowHyphens;
    return this;
  }

   /**
   * True if hyphens are allowd in the identifier, false otherwise
   * @return allowHyphens
  **/
  @ApiModelProperty(value = "True if hyphens are allowd in the identifier, false otherwise")
  public Boolean isAllowHyphens() {
    return allowHyphens;
  }

  public void setAllowHyphens(Boolean allowHyphens) {
    this.allowHyphens = allowHyphens;
  }

  public ValidateIdentifierRequest allowUnderscore(Boolean allowUnderscore) {
    this.allowUnderscore = allowUnderscore;
    return this;
  }

   /**
   * True if underscores are allowed in the identifier, false otherwise
   * @return allowUnderscore
  **/
  @ApiModelProperty(value = "True if underscores are allowed in the identifier, false otherwise")
  public Boolean isAllowUnderscore() {
    return allowUnderscore;
  }

  public void setAllowUnderscore(Boolean allowUnderscore) {
    this.allowUnderscore = allowUnderscore;
  }

  public ValidateIdentifierRequest allowNumbers(Boolean allowNumbers) {
    this.allowNumbers = allowNumbers;
    return this;
  }

   /**
   * True if numbers are allowed in the identifier, false otherwise
   * @return allowNumbers
  **/
  @ApiModelProperty(value = "True if numbers are allowed in the identifier, false otherwise")
  public Boolean isAllowNumbers() {
    return allowNumbers;
  }

  public void setAllowNumbers(Boolean allowNumbers) {
    this.allowNumbers = allowNumbers;
  }

  public ValidateIdentifierRequest allowPeriods(Boolean allowPeriods) {
    this.allowPeriods = allowPeriods;
    return this;
  }

   /**
   * True if periods are allowed in the identifier, false otherwise
   * @return allowPeriods
  **/
  @ApiModelProperty(value = "True if periods are allowed in the identifier, false otherwise")
  public Boolean isAllowPeriods() {
    return allowPeriods;
  }

  public void setAllowPeriods(Boolean allowPeriods) {
    this.allowPeriods = allowPeriods;
  }

  public ValidateIdentifierRequest maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Optional; maximum length, if any, of the identifier
   * @return maxLength
  **/
  @ApiModelProperty(value = "Optional; maximum length, if any, of the identifier")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public ValidateIdentifierRequest minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Optional; minimum length, if any, of the identifier
   * @return minLength
  **/
  @ApiModelProperty(value = "Optional; minimum length, if any, of the identifier")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateIdentifierRequest validateIdentifierRequest = (ValidateIdentifierRequest) o;
    return Objects.equals(this.input, validateIdentifierRequest.input) &&
        Objects.equals(this.allowWhitespace, validateIdentifierRequest.allowWhitespace) &&
        Objects.equals(this.allowHyphens, validateIdentifierRequest.allowHyphens) &&
        Objects.equals(this.allowUnderscore, validateIdentifierRequest.allowUnderscore) &&
        Objects.equals(this.allowNumbers, validateIdentifierRequest.allowNumbers) &&
        Objects.equals(this.allowPeriods, validateIdentifierRequest.allowPeriods) &&
        Objects.equals(this.maxLength, validateIdentifierRequest.maxLength) &&
        Objects.equals(this.minLength, validateIdentifierRequest.minLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, allowWhitespace, allowHyphens, allowUnderscore, allowNumbers, allowPeriods, maxLength, minLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateIdentifierRequest {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    allowWhitespace: ").append(toIndentedString(allowWhitespace)).append("\n");
    sb.append("    allowHyphens: ").append(toIndentedString(allowHyphens)).append("\n");
    sb.append("    allowUnderscore: ").append(toIndentedString(allowUnderscore)).append("\n");
    sb.append("    allowNumbers: ").append(toIndentedString(allowNumbers)).append("\n");
    sb.append("    allowPeriods: ").append(toIndentedString(allowPeriods)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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

