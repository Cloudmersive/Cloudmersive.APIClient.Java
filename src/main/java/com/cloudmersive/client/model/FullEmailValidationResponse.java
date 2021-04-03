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
 * Full email addresss validation result
 */
@ApiModel(description = "Full email addresss validation result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-02T20:49:38.361-07:00")
public class FullEmailValidationResponse {
  @SerializedName("ValidAddress")
  private Boolean validAddress = null;

  @SerializedName("MailServerUsedForValidation")
  private String mailServerUsedForValidation = null;

  @SerializedName("Valid_Syntax")
  private Boolean validSyntax = null;

  @SerializedName("Valid_Domain")
  private Boolean validDomain = null;

  @SerializedName("Valid_SMTP")
  private Boolean validSMTP = null;

  @SerializedName("IsCatchallDomain")
  private Boolean isCatchallDomain = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("IsFreeEmailProvider")
  private Boolean isFreeEmailProvider = null;

  @SerializedName("IsDisposable")
  private Boolean isDisposable = null;

  public FullEmailValidationResponse validAddress(Boolean validAddress) {
    this.validAddress = validAddress;
    return this;
  }

   /**
   * True if the email address is valid overall, false otherwise
   * @return validAddress
  **/
  @ApiModelProperty(value = "True if the email address is valid overall, false otherwise")
  public Boolean isValidAddress() {
    return validAddress;
  }

  public void setValidAddress(Boolean validAddress) {
    this.validAddress = validAddress;
  }

  public FullEmailValidationResponse mailServerUsedForValidation(String mailServerUsedForValidation) {
    this.mailServerUsedForValidation = mailServerUsedForValidation;
    return this;
  }

   /**
   * Email server connected to for verification
   * @return mailServerUsedForValidation
  **/
  @ApiModelProperty(value = "Email server connected to for verification")
  public String getMailServerUsedForValidation() {
    return mailServerUsedForValidation;
  }

  public void setMailServerUsedForValidation(String mailServerUsedForValidation) {
    this.mailServerUsedForValidation = mailServerUsedForValidation;
  }

  public FullEmailValidationResponse validSyntax(Boolean validSyntax) {
    this.validSyntax = validSyntax;
    return this;
  }

   /**
   * True if the syntax of the email address is valid, false otherwise.  This is one component of ValidAddress, but not the only one.
   * @return validSyntax
  **/
  @ApiModelProperty(value = "True if the syntax of the email address is valid, false otherwise.  This is one component of ValidAddress, but not the only one.")
  public Boolean isValidSyntax() {
    return validSyntax;
  }

  public void setValidSyntax(Boolean validSyntax) {
    this.validSyntax = validSyntax;
  }

  public FullEmailValidationResponse validDomain(Boolean validDomain) {
    this.validDomain = validDomain;
    return this;
  }

   /**
   * True if the domain name of the email address is valid, false otherwise.  This is one component of ValidAddress, but not the only one.
   * @return validDomain
  **/
  @ApiModelProperty(value = "True if the domain name of the email address is valid, false otherwise.  This is one component of ValidAddress, but not the only one.")
  public Boolean isValidDomain() {
    return validDomain;
  }

  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }

  public FullEmailValidationResponse validSMTP(Boolean validSMTP) {
    this.validSMTP = validSMTP;
    return this;
  }

   /**
   * True if the email address was verified by the remote server, false otherwise.  This is one component of ValidAddress, but not the only one.
   * @return validSMTP
  **/
  @ApiModelProperty(value = "True if the email address was verified by the remote server, false otherwise.  This is one component of ValidAddress, but not the only one.")
  public Boolean isValidSMTP() {
    return validSMTP;
  }

  public void setValidSMTP(Boolean validSMTP) {
    this.validSMTP = validSMTP;
  }

  public FullEmailValidationResponse isCatchallDomain(Boolean isCatchallDomain) {
    this.isCatchallDomain = isCatchallDomain;
    return this;
  }

   /**
   * True if the domain is a catch-all domain name, false otherwise.  Catch-all domain names, while rare, always accept inbound email to ensure they do not lose any potentially useful emails.  Catch-all domain names can occassionally be configured to first accept and store all inbound email, but then later send a bounce email back to the sender after a delayed period of time.
   * @return isCatchallDomain
  **/
  @ApiModelProperty(value = "True if the domain is a catch-all domain name, false otherwise.  Catch-all domain names, while rare, always accept inbound email to ensure they do not lose any potentially useful emails.  Catch-all domain names can occassionally be configured to first accept and store all inbound email, but then later send a bounce email back to the sender after a delayed period of time.")
  public Boolean isIsCatchallDomain() {
    return isCatchallDomain;
  }

  public void setIsCatchallDomain(Boolean isCatchallDomain) {
    this.isCatchallDomain = isCatchallDomain;
  }

  public FullEmailValidationResponse domain(String domain) {
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

  public FullEmailValidationResponse isFreeEmailProvider(Boolean isFreeEmailProvider) {
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

  public FullEmailValidationResponse isDisposable(Boolean isDisposable) {
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
    FullEmailValidationResponse fullEmailValidationResponse = (FullEmailValidationResponse) o;
    return Objects.equals(this.validAddress, fullEmailValidationResponse.validAddress) &&
        Objects.equals(this.mailServerUsedForValidation, fullEmailValidationResponse.mailServerUsedForValidation) &&
        Objects.equals(this.validSyntax, fullEmailValidationResponse.validSyntax) &&
        Objects.equals(this.validDomain, fullEmailValidationResponse.validDomain) &&
        Objects.equals(this.validSMTP, fullEmailValidationResponse.validSMTP) &&
        Objects.equals(this.isCatchallDomain, fullEmailValidationResponse.isCatchallDomain) &&
        Objects.equals(this.domain, fullEmailValidationResponse.domain) &&
        Objects.equals(this.isFreeEmailProvider, fullEmailValidationResponse.isFreeEmailProvider) &&
        Objects.equals(this.isDisposable, fullEmailValidationResponse.isDisposable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, mailServerUsedForValidation, validSyntax, validDomain, validSMTP, isCatchallDomain, domain, isFreeEmailProvider, isDisposable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullEmailValidationResponse {\n");
    
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
    sb.append("    mailServerUsedForValidation: ").append(toIndentedString(mailServerUsedForValidation)).append("\n");
    sb.append("    validSyntax: ").append(toIndentedString(validSyntax)).append("\n");
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
    sb.append("    validSMTP: ").append(toIndentedString(validSMTP)).append("\n");
    sb.append("    isCatchallDomain: ").append(toIndentedString(isCatchallDomain)).append("\n");
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

