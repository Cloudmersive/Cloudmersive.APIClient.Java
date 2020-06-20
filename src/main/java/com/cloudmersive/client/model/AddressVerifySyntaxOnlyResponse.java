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
 * Syntactic validity of email address
 */
@ApiModel(description = "Syntactic validity of email address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-20T11:43:42.747-07:00")
public class AddressVerifySyntaxOnlyResponse {
  @SerializedName("ValidAddress")
  private Boolean validAddress = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("IsFreeEmailProvider")
  private Boolean isFreeEmailProvider = null;

  @SerializedName("IsDisposable")
  private Boolean isDisposable = null;

  public AddressVerifySyntaxOnlyResponse validAddress(Boolean validAddress) {
    this.validAddress = validAddress;
    return this;
  }

   /**
   * True if the email address is syntactically valid, false if it is not
   * @return validAddress
  **/
  @ApiModelProperty(value = "True if the email address is syntactically valid, false if it is not")
  public Boolean isValidAddress() {
    return validAddress;
  }

  public void setValidAddress(Boolean validAddress) {
    this.validAddress = validAddress;
  }

  public AddressVerifySyntaxOnlyResponse domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain name of the email address
   * @return domain
  **/
  @ApiModelProperty(value = "Domain name of the email address")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public AddressVerifySyntaxOnlyResponse isFreeEmailProvider(Boolean isFreeEmailProvider) {
    this.isFreeEmailProvider = isFreeEmailProvider;
    return this;
  }

   /**
   * True if the email domain name is a free provider (typically a free to sign up web email provider for consumers / personal use), false otherwise.
   * @return isFreeEmailProvider
  **/
  @ApiModelProperty(value = "True if the email domain name is a free provider (typically a free to sign up web email provider for consumers / personal use), false otherwise.")
  public Boolean isIsFreeEmailProvider() {
    return isFreeEmailProvider;
  }

  public void setIsFreeEmailProvider(Boolean isFreeEmailProvider) {
    this.isFreeEmailProvider = isFreeEmailProvider;
  }

  public AddressVerifySyntaxOnlyResponse isDisposable(Boolean isDisposable) {
    this.isDisposable = isDisposable;
    return this;
  }

   /**
   * True if the email address is a disposable email address, false otherwise; these disposable providers are not typically used to receive email and so will have a low likelihood of opening mail sent there.
   * @return isDisposable
  **/
  @ApiModelProperty(value = "True if the email address is a disposable email address, false otherwise; these disposable providers are not typically used to receive email and so will have a low likelihood of opening mail sent there.")
  public Boolean isIsDisposable() {
    return isDisposable;
  }

  public void setIsDisposable(Boolean isDisposable) {
    this.isDisposable = isDisposable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressVerifySyntaxOnlyResponse addressVerifySyntaxOnlyResponse = (AddressVerifySyntaxOnlyResponse) o;
    return Objects.equals(this.validAddress, addressVerifySyntaxOnlyResponse.validAddress) &&
        Objects.equals(this.domain, addressVerifySyntaxOnlyResponse.domain) &&
        Objects.equals(this.isFreeEmailProvider, addressVerifySyntaxOnlyResponse.isFreeEmailProvider) &&
        Objects.equals(this.isDisposable, addressVerifySyntaxOnlyResponse.isDisposable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, domain, isFreeEmailProvider, isDisposable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressVerifySyntaxOnlyResponse {\n");
    
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    isFreeEmailProvider: ").append(toIndentedString(isFreeEmailProvider)).append("\n");
    sb.append("    isDisposable: ").append(toIndentedString(isDisposable)).append("\n");
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

