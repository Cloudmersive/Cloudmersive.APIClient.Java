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
 * Result of performing an XXE threat detection operation
 */
@ApiModel(description = "Result of performing an XXE threat detection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-16T22:47:16.844-07:00")
public class XxeThreatDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContainsXxeThreat")
  private Boolean containsXxeThreat = null;

  public XxeThreatDetectionResult successful(Boolean successful) {
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

  public XxeThreatDetectionResult containsXxeThreat(Boolean containsXxeThreat) {
    this.containsXxeThreat = containsXxeThreat;
    return this;
  }

   /**
   * True if the XML input contains XXE threats, false otherwise
   * @return containsXxeThreat
  **/
  @ApiModelProperty(value = "True if the XML input contains XXE threats, false otherwise")
  public Boolean isContainsXxeThreat() {
    return containsXxeThreat;
  }

  public void setContainsXxeThreat(Boolean containsXxeThreat) {
    this.containsXxeThreat = containsXxeThreat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XxeThreatDetectionResult xxeThreatDetectionResult = (XxeThreatDetectionResult) o;
    return Objects.equals(this.successful, xxeThreatDetectionResult.successful) &&
        Objects.equals(this.containsXxeThreat, xxeThreatDetectionResult.containsXxeThreat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containsXxeThreat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XxeThreatDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containsXxeThreat: ").append(toIndentedString(containsXxeThreat)).append("\n");
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

