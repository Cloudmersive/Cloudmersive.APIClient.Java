/*
 * securityapi
 * The security APIs help you detect and block security threats.
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
 * Result of performing an XXE threat detection operation
 */
@ApiModel(description = "Result of performing an XXE threat detection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:39:07.487-07:00")
public class StringXxeDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContainedXxe")
  private Boolean containedXxe = null;

  public StringXxeDetectionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public StringXxeDetectionResult containedXxe(Boolean containedXxe) {
    this.containedXxe = containedXxe;
    return this;
  }

   /**
   * True if the input contained XXE threats, false otherwise
   * @return containedXxe
  **/
  @ApiModelProperty(value = "True if the input contained XXE threats, false otherwise")
  public Boolean isContainedXxe() {
    return containedXxe;
  }

  public void setContainedXxe(Boolean containedXxe) {
    this.containedXxe = containedXxe;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringXxeDetectionResult stringXxeDetectionResult = (StringXxeDetectionResult) o;
    return Objects.equals(this.successful, stringXxeDetectionResult.successful) &&
        Objects.equals(this.containedXxe, stringXxeDetectionResult.containedXxe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedXxe);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringXxeDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedXxe: ").append(toIndentedString(containedXxe)).append("\n");
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

