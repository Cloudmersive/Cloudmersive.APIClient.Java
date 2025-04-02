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
import com.cloudmersive.client.model.DocxTableSingleTableFill;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T18:30:10.331-07:00")
public class DocxTableTableFillMultiRequest {
  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("InputFileData")
  private byte[] inputFileData = null;

  @SerializedName("TablesToFill")
  private List<DocxTableSingleTableFill> tablesToFill = null;

  public DocxTableTableFillMultiRequest inputFileUrl(String inputFileUrl) {
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

  public DocxTableTableFillMultiRequest inputFileData(byte[] inputFileData) {
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

  public DocxTableTableFillMultiRequest tablesToFill(List<DocxTableSingleTableFill> tablesToFill) {
    this.tablesToFill = tablesToFill;
    return this;
  }

  public DocxTableTableFillMultiRequest addTablesToFillItem(DocxTableSingleTableFill tablesToFillItem) {
    if (this.tablesToFill == null) {
      this.tablesToFill = new ArrayList<DocxTableSingleTableFill>();
    }
    this.tablesToFill.add(tablesToFillItem);
    return this;
  }

   /**
   * Tables and datasets to fill into the document
   * @return tablesToFill
  **/
  @ApiModelProperty(value = "Tables and datasets to fill into the document")
  public List<DocxTableSingleTableFill> getTablesToFill() {
    return tablesToFill;
  }

  public void setTablesToFill(List<DocxTableSingleTableFill> tablesToFill) {
    this.tablesToFill = tablesToFill;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableTableFillMultiRequest docxTableTableFillMultiRequest = (DocxTableTableFillMultiRequest) o;
    return Objects.equals(this.inputFileUrl, docxTableTableFillMultiRequest.inputFileUrl) &&
        Arrays.equals(this.inputFileData, docxTableTableFillMultiRequest.inputFileData) &&
        Objects.equals(this.tablesToFill, docxTableTableFillMultiRequest.tablesToFill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFileUrl, Arrays.hashCode(inputFileData), tablesToFill);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableTableFillMultiRequest {\n");
    
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    inputFileData: ").append(toIndentedString(inputFileData)).append("\n");
    sb.append("    tablesToFill: ").append(toIndentedString(tablesToFill)).append("\n");
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

