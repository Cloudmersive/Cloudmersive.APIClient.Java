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
 * Result of validating a URL with syntax only
 */
@ApiModel(description = "Result of validating a URL with syntax only")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T00:40:05.266-08:00")
public class ValidateUrlResponseSyntaxOnly {
  @SerializedName("ValidURL")
  private Boolean validURL = null;

  @SerializedName("WellFormedURL")
  private String wellFormedURL = null;

  public ValidateUrlResponseSyntaxOnly validURL(Boolean validURL) {
    this.validURL = validURL;
    return this;
  }

   /**
   * True if the URL is valid, false otherwise
   * @return validURL
  **/
  @ApiModelProperty(value = "True if the URL is valid, false otherwise")
  public Boolean isValidURL() {
    return validURL;
  }

  public void setValidURL(Boolean validURL) {
    this.validURL = validURL;
  }

  public ValidateUrlResponseSyntaxOnly wellFormedURL(String wellFormedURL) {
    this.wellFormedURL = wellFormedURL;
    return this;
  }

   /**
   * Well-formed version of the URL
   * @return wellFormedURL
  **/
  @ApiModelProperty(value = "Well-formed version of the URL")
  public String getWellFormedURL() {
    return wellFormedURL;
  }

  public void setWellFormedURL(String wellFormedURL) {
    this.wellFormedURL = wellFormedURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateUrlResponseSyntaxOnly validateUrlResponseSyntaxOnly = (ValidateUrlResponseSyntaxOnly) o;
    return Objects.equals(this.validURL, validateUrlResponseSyntaxOnly.validURL) &&
        Objects.equals(this.wellFormedURL, validateUrlResponseSyntaxOnly.wellFormedURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validURL, wellFormedURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateUrlResponseSyntaxOnly {\n");
    
    sb.append("    validURL: ").append(toIndentedString(validURL)).append("\n");
    sb.append("    wellFormedURL: ").append(toIndentedString(wellFormedURL)).append("\n");
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

