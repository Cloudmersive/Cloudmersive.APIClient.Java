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
import com.cloudmersive.client.model.TableCellResult;
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
 * One row of data in the resulting table
 */
@ApiModel(description = "One row of data in the resulting table")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-09T20:37:18.812-08:00")
public class TableRowResult {
  @SerializedName("TableRowCellsResult")
  private List<TableCellResult> tableRowCellsResult = null;

  public TableRowResult tableRowCellsResult(List<TableCellResult> tableRowCellsResult) {
    this.tableRowCellsResult = tableRowCellsResult;
    return this;
  }

  public TableRowResult addTableRowCellsResultItem(TableCellResult tableRowCellsResultItem) {
    if (this.tableRowCellsResult == null) {
      this.tableRowCellsResult = new ArrayList<TableCellResult>();
    }
    this.tableRowCellsResult.add(tableRowCellsResultItem);
    return this;
  }

   /**
   * Table cells in this row result
   * @return tableRowCellsResult
  **/
  @ApiModelProperty(value = "Table cells in this row result")
  public List<TableCellResult> getTableRowCellsResult() {
    return tableRowCellsResult;
  }

  public void setTableRowCellsResult(List<TableCellResult> tableRowCellsResult) {
    this.tableRowCellsResult = tableRowCellsResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRowResult tableRowResult = (TableRowResult) o;
    return Objects.equals(this.tableRowCellsResult, tableRowResult.tableRowCellsResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableRowCellsResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowResult {\n");
    
    sb.append("    tableRowCellsResult: ").append(toIndentedString(tableRowCellsResult)).append("\n");
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

