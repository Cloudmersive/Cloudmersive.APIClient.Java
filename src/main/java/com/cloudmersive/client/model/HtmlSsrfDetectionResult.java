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
 * Result of performing an XXE threat detection operation
 */
@ApiModel(description = "Result of performing an XXE threat detection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:37:14.407-07:00")
public class HtmlSsrfDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContainedThreats")
  private Boolean containedThreats = null;

  public HtmlSsrfDetectionResult successful(Boolean successful) {
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

  public HtmlSsrfDetectionResult containedThreats(Boolean containedThreats) {
    this.containedThreats = containedThreats;
    return this;
  }

   /**
   * True if the input contained SSRF threats, false otherwise
   * @return containedThreats
  **/
  @ApiModelProperty(value = "True if the input contained SSRF threats, false otherwise")
  public Boolean isContainedThreats() {
    return containedThreats;
  }

  public void setContainedThreats(Boolean containedThreats) {
    this.containedThreats = containedThreats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlSsrfDetectionResult htmlSsrfDetectionResult = (HtmlSsrfDetectionResult) o;
    return Objects.equals(this.successful, htmlSsrfDetectionResult.successful) &&
        Objects.equals(this.containedThreats, htmlSsrfDetectionResult.containedThreats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedThreats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlSsrfDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedThreats: ").append(toIndentedString(containedThreats)).append("\n");
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

