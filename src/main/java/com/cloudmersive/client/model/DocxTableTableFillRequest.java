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
import com.cloudmersive.client.model.DocxTableTableFillTableRow;
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
 * Request to update data in a table in a Word DOCX Document
 */
@ApiModel(description = "Request to update data in a table in a Word DOCX Document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-16T23:15:58.406-07:00")
public class DocxTableTableFillRequest {
  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("InputFileData")
  private byte[] inputFileData = null;

  @SerializedName("TableStartTag")
  private String tableStartTag = null;

  @SerializedName("TableEndTag")
  private String tableEndTag = null;

  @SerializedName("DataToFillIn")
  private List<DocxTableTableFillTableRow> dataToFillIn = null;

  public DocxTableTableFillRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional; Input URL of the document; use BeginEditing to create this
   * @return inputFileUrl
  **/
  @ApiModelProperty(value = "Optional; Input URL of the document; use BeginEditing to create this")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public DocxTableTableFillRequest inputFileData(byte[] inputFileData) {
    this.inputFileData = inputFileData;
    return this;
  }

   /**
   * Optional; Input Word Document file content for the operation
   * @return inputFileData
  **/
  @ApiModelProperty(value = "Optional; Input Word Document file content for the operation")
  public byte[] getInputFileData() {
    return inputFileData;
  }

  public void setInputFileData(byte[] inputFileData) {
    this.inputFileData = inputFileData;
  }

  public DocxTableTableFillRequest tableStartTag(String tableStartTag) {
    this.tableStartTag = tableStartTag;
    return this;
  }

   /**
   * Start tag that delineates the beginning of the table
   * @return tableStartTag
  **/
  @ApiModelProperty(value = "Start tag that delineates the beginning of the table")
  public String getTableStartTag() {
    return tableStartTag;
  }

  public void setTableStartTag(String tableStartTag) {
    this.tableStartTag = tableStartTag;
  }

  public DocxTableTableFillRequest tableEndTag(String tableEndTag) {
    this.tableEndTag = tableEndTag;
    return this;
  }

   /**
   * End tag that delineates the end of the table
   * @return tableEndTag
  **/
  @ApiModelProperty(value = "End tag that delineates the end of the table")
  public String getTableEndTag() {
    return tableEndTag;
  }

  public void setTableEndTag(String tableEndTag) {
    this.tableEndTag = tableEndTag;
  }

  public DocxTableTableFillRequest dataToFillIn(List<DocxTableTableFillTableRow> dataToFillIn) {
    this.dataToFillIn = dataToFillIn;
    return this;
  }

  public DocxTableTableFillRequest addDataToFillInItem(DocxTableTableFillTableRow dataToFillInItem) {
    if (this.dataToFillIn == null) {
      this.dataToFillIn = new ArrayList<DocxTableTableFillTableRow>();
    }
    this.dataToFillIn.add(dataToFillInItem);
    return this;
  }

   /**
   * Data set to populate the table with
   * @return dataToFillIn
  **/
  @ApiModelProperty(value = "Data set to populate the table with")
  public List<DocxTableTableFillTableRow> getDataToFillIn() {
    return dataToFillIn;
  }

  public void setDataToFillIn(List<DocxTableTableFillTableRow> dataToFillIn) {
    this.dataToFillIn = dataToFillIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableTableFillRequest docxTableTableFillRequest = (DocxTableTableFillRequest) o;
    return Objects.equals(this.inputFileUrl, docxTableTableFillRequest.inputFileUrl) &&
        Arrays.equals(this.inputFileData, docxTableTableFillRequest.inputFileData) &&
        Objects.equals(this.tableStartTag, docxTableTableFillRequest.tableStartTag) &&
        Objects.equals(this.tableEndTag, docxTableTableFillRequest.tableEndTag) &&
        Objects.equals(this.dataToFillIn, docxTableTableFillRequest.dataToFillIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFileUrl, Arrays.hashCode(inputFileData), tableStartTag, tableEndTag, dataToFillIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableTableFillRequest {\n");
    
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    inputFileData: ").append(toIndentedString(inputFileData)).append("\n");
    sb.append("    tableStartTag: ").append(toIndentedString(tableStartTag)).append("\n");
    sb.append("    tableEndTag: ").append(toIndentedString(tableEndTag)).append("\n");
    sb.append("    dataToFillIn: ").append(toIndentedString(dataToFillIn)).append("\n");
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

