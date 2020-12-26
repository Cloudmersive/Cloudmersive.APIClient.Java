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
import com.cloudmersive.client.model.XlsxWorksheet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Clear Cell in XLSX Worksheet request
 */
@ApiModel(description = "Input to a Clear Cell in XLSX Worksheet request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-25T20:51:30.126-08:00")
public class ClearXlsxCellRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("WorksheetToUpdate")
  private XlsxWorksheet worksheetToUpdate = null;

  @SerializedName("RowIndex")
  private Integer rowIndex = null;

  @SerializedName("CellIndex")
  private Integer cellIndex = null;

  public ClearXlsxCellRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public ClearXlsxCellRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public ClearXlsxCellRequest worksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    this.worksheetToUpdate = worksheetToUpdate;
    return this;
  }

   /**
   * Optional; Worksheet (tab) within the spreadsheet to update; leave blank to default to the first worksheet
   * @return worksheetToUpdate
  **/
  @ApiModelProperty(value = "Optional; Worksheet (tab) within the spreadsheet to update; leave blank to default to the first worksheet")
  public XlsxWorksheet getWorksheetToUpdate() {
    return worksheetToUpdate;
  }

  public void setWorksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    this.worksheetToUpdate = worksheetToUpdate;
  }

  public ClearXlsxCellRequest rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * 0-based index of the row, 0, 1, 2, ... to clear
   * @return rowIndex
  **/
  @ApiModelProperty(value = "0-based index of the row, 0, 1, 2, ... to clear")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public ClearXlsxCellRequest cellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
    return this;
  }

   /**
   * 0-based index of the cell, 0, 1, 2, ... in the row to clear
   * @return cellIndex
  **/
  @ApiModelProperty(value = "0-based index of the cell, 0, 1, 2, ... in the row to clear")
  public Integer getCellIndex() {
    return cellIndex;
  }

  public void setCellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearXlsxCellRequest clearXlsxCellRequest = (ClearXlsxCellRequest) o;
    return Arrays.equals(this.inputFileBytes, clearXlsxCellRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, clearXlsxCellRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToUpdate, clearXlsxCellRequest.worksheetToUpdate) &&
        Objects.equals(this.rowIndex, clearXlsxCellRequest.rowIndex) &&
        Objects.equals(this.cellIndex, clearXlsxCellRequest.cellIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToUpdate, rowIndex, cellIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearXlsxCellRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToUpdate: ").append(toIndentedString(worksheetToUpdate)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    cellIndex: ").append(toIndentedString(cellIndex)).append("\n");
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

