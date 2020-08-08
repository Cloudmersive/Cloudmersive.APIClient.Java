/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * Request to encrypt an existing Zip Archive file and protect it with a password
 */
@ApiModel(description = "Request to encrypt an existing Zip Archive file and protect it with a password")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T14:32:54.100-07:00")
public class ZipEncryptionAdvancedRequest {
  @SerializedName("InputFileContents")
  private byte[] inputFileContents = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("EncryptionAlgorithm")
  private String encryptionAlgorithm = null;

  public ZipEncryptionAdvancedRequest inputFileContents(byte[] inputFileContents) {
    this.inputFileContents = inputFileContents;
    return this;
  }

   /**
   * Input Zip File archive contents in bytes
   * @return inputFileContents
  **/
  @ApiModelProperty(value = "Input Zip File archive contents in bytes")
  public byte[] getInputFileContents() {
    return inputFileContents;
  }

  public void setInputFileContents(byte[] inputFileContents) {
    this.inputFileContents = inputFileContents;
  }

  public ZipEncryptionAdvancedRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password to place on the Zip file; the longer the password, the more secure
   * @return password
  **/
  @ApiModelProperty(value = "Password to place on the Zip file; the longer the password, the more secure")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ZipEncryptionAdvancedRequest encryptionAlgorithm(String encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
    return this;
  }

   /**
   * Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm).  Default is AES-256.
   * @return encryptionAlgorithm
  **/
  @ApiModelProperty(value = "Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm).  Default is AES-256.")
  public String getEncryptionAlgorithm() {
    return encryptionAlgorithm;
  }

  public void setEncryptionAlgorithm(String encryptionAlgorithm) {
    this.encryptionAlgorithm = encryptionAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipEncryptionAdvancedRequest zipEncryptionAdvancedRequest = (ZipEncryptionAdvancedRequest) o;
    return Arrays.equals(this.inputFileContents, zipEncryptionAdvancedRequest.inputFileContents) &&
        Objects.equals(this.password, zipEncryptionAdvancedRequest.password) &&
        Objects.equals(this.encryptionAlgorithm, zipEncryptionAdvancedRequest.encryptionAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileContents), password, encryptionAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipEncryptionAdvancedRequest {\n");
    
    sb.append("    inputFileContents: ").append(toIndentedString(inputFileContents)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
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
