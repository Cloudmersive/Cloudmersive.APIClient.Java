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
 * Input to a Create Blank Spreadsheet request
 */
@ApiModel(description = "Input to a Create Blank Spreadsheet request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T20:36:41.760-08:00")
public class CreateBlankSpreadsheetRequest {
  @SerializedName("WorksheetName")
  private String worksheetName = null;

  public CreateBlankSpreadsheetRequest worksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
    return this;
  }

   /**
   * The blank Spreadsheet will have a default Worksheet in it; supply a name, or if left empty, will default to Worksheet1
   * @return worksheetName
  **/
  @ApiModelProperty(value = "The blank Spreadsheet will have a default Worksheet in it; supply a name, or if left empty, will default to Worksheet1")
  public String getWorksheetName() {
    return worksheetName;
  }

  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBlankSpreadsheetRequest createBlankSpreadsheetRequest = (CreateBlankSpreadsheetRequest) o;
    return Objects.equals(this.worksheetName, createBlankSpreadsheetRequest.worksheetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worksheetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBlankSpreadsheetRequest {\n");
    
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
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

