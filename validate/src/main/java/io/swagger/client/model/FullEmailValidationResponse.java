/*
 * validateapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-28T11:35:42.315-08:00")
public class FullEmailValidationResponse {
  @SerializedName("ValidAddress")
  private Boolean validAddress = null;

  @SerializedName("MailServerUsedForValidation")
  private String mailServerUsedForValidation = null;

  public FullEmailValidationResponse validAddress(Boolean validAddress) {
    this.validAddress = validAddress;
    return this;
  }

   /**
   * True if the email address is valid, false otherwise
   * @return validAddress
  **/
  @ApiModelProperty(value = "True if the email address is valid, false otherwise")
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
        Objects.equals(this.mailServerUsedForValidation, fullEmailValidationResponse.mailServerUsedForValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, mailServerUsedForValidation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullEmailValidationResponse {\n");
    
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
    sb.append("    mailServerUsedForValidation: ").append(toIndentedString(mailServerUsedForValidation)).append("\n");
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

