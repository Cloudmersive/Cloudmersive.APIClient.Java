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
import com.cloudmersive.client.model.OcrPhotoTextElement;
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
 * The recognition result of one cell in one row in a table of a form
 */
@ApiModel(description = "The recognition result of one cell in one row in a table of a form")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-27T22:17:22.648-07:00")
public class TableCellResult {
  @SerializedName("ColumnID")
  private String columnID = null;

  @SerializedName("CellValues")
  private List<OcrPhotoTextElement> cellValues = null;

  public TableCellResult columnID(String columnID) {
    this.columnID = columnID;
    return this;
  }

   /**
   * The ID of the column
   * @return columnID
  **/
  @ApiModelProperty(value = "The ID of the column")
  public String getColumnID() {
    return columnID;
  }

  public void setColumnID(String columnID) {
    this.columnID = columnID;
  }

  public TableCellResult cellValues(List<OcrPhotoTextElement> cellValues) {
    this.cellValues = cellValues;
    return this;
  }

  public TableCellResult addCellValuesItem(OcrPhotoTextElement cellValuesItem) {
    if (this.cellValues == null) {
      this.cellValues = new ArrayList<OcrPhotoTextElement>();
    }
    this.cellValues.add(cellValuesItem);
    return this;
  }

   /**
   * Result cell value(s) extracted
   * @return cellValues
  **/
  @ApiModelProperty(value = "Result cell value(s) extracted")
  public List<OcrPhotoTextElement> getCellValues() {
    return cellValues;
  }

  public void setCellValues(List<OcrPhotoTextElement> cellValues) {
    this.cellValues = cellValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableCellResult tableCellResult = (TableCellResult) o;
    return Objects.equals(this.columnID, tableCellResult.columnID) &&
        Objects.equals(this.cellValues, tableCellResult.cellValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnID, cellValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCellResult {\n");
    
    sb.append("    columnID: ").append(toIndentedString(columnID)).append("\n");
    sb.append("    cellValues: ").append(toIndentedString(cellValues)).append("\n");
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

