/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.model.FormTableDefinition;
import com.cloudmersive.client.model.TableRowResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The result of reading a table via OCR from a form
 */
@ApiModel(description = "The result of reading a table via OCR from a form")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:37:36.766-07:00")
public class TableResult {
  @SerializedName("TableDefinition")
  private FormTableDefinition tableDefinition = null;

  @SerializedName("TableRowsResult")
  private List<TableRowResult> tableRowsResult = null;

  public TableResult tableDefinition(FormTableDefinition tableDefinition) {
    this.tableDefinition = tableDefinition;
    return this;
  }

   /**
   * The input table definition for reference
   * @return tableDefinition
  **/
  @ApiModelProperty(value = "The input table definition for reference")
  public FormTableDefinition getTableDefinition() {
    return tableDefinition;
  }

  public void setTableDefinition(FormTableDefinition tableDefinition) {
    this.tableDefinition = tableDefinition;
  }

  public TableResult tableRowsResult(List<TableRowResult> tableRowsResult) {
    this.tableRowsResult = tableRowsResult;
    return this;
  }

  public TableResult addTableRowsResultItem(TableRowResult tableRowsResultItem) {
    if (this.tableRowsResult == null) {
      this.tableRowsResult = new ArrayList<TableRowResult>();
    }
    this.tableRowsResult.add(tableRowsResultItem);
    return this;
  }

   /**
   * Rows of data in the table
   * @return tableRowsResult
  **/
  @ApiModelProperty(value = "Rows of data in the table")
  public List<TableRowResult> getTableRowsResult() {
    return tableRowsResult;
  }

  public void setTableRowsResult(List<TableRowResult> tableRowsResult) {
    this.tableRowsResult = tableRowsResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableResult tableResult = (TableResult) o;
    return Objects.equals(this.tableDefinition, tableResult.tableDefinition) &&
        Objects.equals(this.tableRowsResult, tableResult.tableRowsResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableDefinition, tableRowsResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableResult {\n");
    
    sb.append("    tableDefinition: ").append(toIndentedString(tableDefinition)).append("\n");
    sb.append("    tableRowsResult: ").append(toIndentedString(tableRowsResult)).append("\n");
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

