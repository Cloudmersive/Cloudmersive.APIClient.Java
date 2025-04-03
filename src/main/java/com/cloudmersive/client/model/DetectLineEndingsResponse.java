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
 * Result of base 64 decoding
 */
@ApiModel(description = "Result of base 64 decoding")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T12:57:43.426-07:00")
public class DetectLineEndingsResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("PrimaryNewlineType")
  private String primaryNewlineType = null;

  @SerializedName("PrimaryNewlineTerminator")
  private String primaryNewlineTerminator = null;

  @SerializedName("InputLength")
  private Integer inputLength = null;

  public DetectLineEndingsResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public DetectLineEndingsResponse primaryNewlineType(String primaryNewlineType) {
    this.primaryNewlineType = primaryNewlineType;
    return this;
  }

   /**
   * Type of newline in the file; possible vlaues are \&quot;Mac\&quot; (legacy Mac OS uses carriage return only); \&quot;Unix\&quot; (Unix and Linux OSes, and modern Mac OS); \&quot;Windows\&quot; (Windows operating systems)
   * @return primaryNewlineType
  **/
  @ApiModelProperty(value = "Type of newline in the file; possible vlaues are \"Mac\" (legacy Mac OS uses carriage return only); \"Unix\" (Unix and Linux OSes, and modern Mac OS); \"Windows\" (Windows operating systems)")
  public String getPrimaryNewlineType() {
    return primaryNewlineType;
  }

  public void setPrimaryNewlineType(String primaryNewlineType) {
    this.primaryNewlineType = primaryNewlineType;
  }

  public DetectLineEndingsResponse primaryNewlineTerminator(String primaryNewlineTerminator) {
    this.primaryNewlineTerminator = primaryNewlineTerminator;
    return this;
  }

   /**
   * Characters used to terminate a newline; can be carriage return, linefeed, or carriage return + linefeed
   * @return primaryNewlineTerminator
  **/
  @ApiModelProperty(value = "Characters used to terminate a newline; can be carriage return, linefeed, or carriage return + linefeed")
  public String getPrimaryNewlineTerminator() {
    return primaryNewlineTerminator;
  }

  public void setPrimaryNewlineTerminator(String primaryNewlineTerminator) {
    this.primaryNewlineTerminator = primaryNewlineTerminator;
  }

  public DetectLineEndingsResponse inputLength(Integer inputLength) {
    this.inputLength = inputLength;
    return this;
  }

   /**
   * Length of the input string in characters
   * @return inputLength
  **/
  @ApiModelProperty(value = "Length of the input string in characters")
  public Integer getInputLength() {
    return inputLength;
  }

  public void setInputLength(Integer inputLength) {
    this.inputLength = inputLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectLineEndingsResponse detectLineEndingsResponse = (DetectLineEndingsResponse) o;
    return Objects.equals(this.successful, detectLineEndingsResponse.successful) &&
        Objects.equals(this.primaryNewlineType, detectLineEndingsResponse.primaryNewlineType) &&
        Objects.equals(this.primaryNewlineTerminator, detectLineEndingsResponse.primaryNewlineTerminator) &&
        Objects.equals(this.inputLength, detectLineEndingsResponse.inputLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, primaryNewlineType, primaryNewlineTerminator, inputLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectLineEndingsResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    primaryNewlineType: ").append(toIndentedString(primaryNewlineType)).append("\n");
    sb.append("    primaryNewlineTerminator: ").append(toIndentedString(primaryNewlineTerminator)).append("\n");
    sb.append("    inputLength: ").append(toIndentedString(inputLength)).append("\n");
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

