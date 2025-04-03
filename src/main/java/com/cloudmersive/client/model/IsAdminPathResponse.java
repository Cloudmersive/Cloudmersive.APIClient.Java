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
 * Result of performing an Admin Path operation
 */
@ApiModel(description = "Result of performing an Admin Path operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T12:57:33.621-07:00")
public class IsAdminPathResponse {
  @SerializedName("IsAdminPathNode")
  private Boolean isAdminPathNode = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  public IsAdminPathResponse isAdminPathNode(Boolean isAdminPathNode) {
    this.isAdminPathNode = isAdminPathNode;
    return this;
  }

   /**
   * True if the input IP address is an Admin Path, and false otherwise
   * @return isAdminPathNode
  **/
  @ApiModelProperty(value = "True if the input IP address is an Admin Path, and false otherwise")
  public Boolean isIsAdminPathNode() {
    return isAdminPathNode;
  }

  public void setIsAdminPathNode(Boolean isAdminPathNode) {
    this.isAdminPathNode = isAdminPathNode;
  }

  public IsAdminPathResponse successful(Boolean successful) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsAdminPathResponse isAdminPathResponse = (IsAdminPathResponse) o;
    return Objects.equals(this.isAdminPathNode, isAdminPathResponse.isAdminPathNode) &&
        Objects.equals(this.successful, isAdminPathResponse.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAdminPathNode, successful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsAdminPathResponse {\n");
    
    sb.append("    isAdminPathNode: ").append(toIndentedString(isAdminPathNode)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

