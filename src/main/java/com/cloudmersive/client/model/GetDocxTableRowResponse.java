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
import com.cloudmersive.client.model.DocxTableRow;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of running an Get Table Row command
 */
@ApiModel(description = "Result of running an Get Table Row command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-22T21:42:12.227-07:00")
public class GetDocxTableRowResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("RowResult")
  private DocxTableRow rowResult = null;

  public GetDocxTableRowResponse successful(Boolean successful) {
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

  public GetDocxTableRowResponse rowResult(DocxTableRow rowResult) {
    this.rowResult = rowResult;
    return this;
  }

   /**
   * Contents of the table row that was requested
   * @return rowResult
  **/
  @ApiModelProperty(value = "Contents of the table row that was requested")
  public DocxTableRow getRowResult() {
    return rowResult;
  }

  public void setRowResult(DocxTableRow rowResult) {
    this.rowResult = rowResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxTableRowResponse getDocxTableRowResponse = (GetDocxTableRowResponse) o;
    return Objects.equals(this.successful, getDocxTableRowResponse.successful) &&
        Objects.equals(this.rowResult, getDocxTableRowResponse.rowResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, rowResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxTableRowResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    rowResult: ").append(toIndentedString(rowResult)).append("\n");
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

