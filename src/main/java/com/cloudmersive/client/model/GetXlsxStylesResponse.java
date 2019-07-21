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
import com.cloudmersive.client.model.DocxCellStyle;
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
 * Result of running a Get-Worksheets command
 */
@ApiModel(description = "Result of running a Get-Worksheets command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-21T10:25:19.173-07:00")
public class GetXlsxStylesResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("CellStyles")
  private List<DocxCellStyle> cellStyles = null;

  public GetXlsxStylesResponse successful(Boolean successful) {
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

  public GetXlsxStylesResponse cellStyles(List<DocxCellStyle> cellStyles) {
    this.cellStyles = cellStyles;
    return this;
  }

  public GetXlsxStylesResponse addCellStylesItem(DocxCellStyle cellStylesItem) {
    if (this.cellStyles == null) {
      this.cellStyles = new ArrayList<DocxCellStyle>();
    }
    this.cellStyles.add(cellStylesItem);
    return this;
  }

   /**
   * Cell styles
   * @return cellStyles
  **/
  @ApiModelProperty(value = "Cell styles")
  public List<DocxCellStyle> getCellStyles() {
    return cellStyles;
  }

  public void setCellStyles(List<DocxCellStyle> cellStyles) {
    this.cellStyles = cellStyles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxStylesResponse getXlsxStylesResponse = (GetXlsxStylesResponse) o;
    return Objects.equals(this.successful, getXlsxStylesResponse.successful) &&
        Objects.equals(this.cellStyles, getXlsxStylesResponse.cellStyles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, cellStyles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxStylesResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    cellStyles: ").append(toIndentedString(cellStyles)).append("\n");
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

