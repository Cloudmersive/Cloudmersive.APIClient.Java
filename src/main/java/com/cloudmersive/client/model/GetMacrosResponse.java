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
 * Result of running a Get Macro Information command
 */
@ApiModel(description = "Result of running a Get Macro Information command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:43:58.249-07:00")
public class GetMacrosResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContainsVbaMacros")
  private Boolean containsVbaMacros = null;

  public GetMacrosResponse successful(Boolean successful) {
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

  public GetMacrosResponse containsVbaMacros(Boolean containsVbaMacros) {
    this.containsVbaMacros = containsVbaMacros;
    return this;
  }

   /**
   * True if the document contains VBA macros, false otherwise
   * @return containsVbaMacros
  **/
  @ApiModelProperty(value = "True if the document contains VBA macros, false otherwise")
  public Boolean isContainsVbaMacros() {
    return containsVbaMacros;
  }

  public void setContainsVbaMacros(Boolean containsVbaMacros) {
    this.containsVbaMacros = containsVbaMacros;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMacrosResponse getMacrosResponse = (GetMacrosResponse) o;
    return Objects.equals(this.successful, getMacrosResponse.successful) &&
        Objects.equals(this.containsVbaMacros, getMacrosResponse.containsVbaMacros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containsVbaMacros);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMacrosResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containsVbaMacros: ").append(toIndentedString(containsVbaMacros)).append("\n");
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

