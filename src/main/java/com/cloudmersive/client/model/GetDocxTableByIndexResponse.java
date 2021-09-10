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
import com.cloudmersive.client.model.DocxTable;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of running a Get-Tables by Index command
 */
@ApiModel(description = "Result of running a Get-Tables by Index command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-09T19:28:42.852-07:00")
public class GetDocxTableByIndexResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Table")
  private DocxTable table = null;

  public GetDocxTableByIndexResponse successful(Boolean successful) {
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

  public GetDocxTableByIndexResponse table(DocxTable table) {
    this.table = table;
    return this;
  }

   /**
   * Requested Table in the DOCX file
   * @return table
  **/
  @ApiModelProperty(value = "Requested Table in the DOCX file")
  public DocxTable getTable() {
    return table;
  }

  public void setTable(DocxTable table) {
    this.table = table;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxTableByIndexResponse getDocxTableByIndexResponse = (GetDocxTableByIndexResponse) o;
    return Objects.equals(this.successful, getDocxTableByIndexResponse.successful) &&
        Objects.equals(this.table, getDocxTableByIndexResponse.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, table);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxTableByIndexResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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

