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
import com.cloudmersive.client.model.FormTableColumnDefinition;
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
 * Definition of a form table for OCR data extraction from images
 */
@ApiModel(description = "Definition of a form table for OCR data extraction from images")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:37:36.766-07:00")
public class FormTableDefinition {
  @SerializedName("TableID")
  private String tableID = null;

  @SerializedName("ColumnDefinitions")
  private List<FormTableColumnDefinition> columnDefinitions = null;

  @SerializedName("TargetTableHeight_Relative")
  private Double targetTableHeightRelative = null;

  @SerializedName("TargetRowHeight_Relative")
  private Double targetRowHeightRelative = null;

  public FormTableDefinition tableID(String tableID) {
    this.tableID = tableID;
    return this;
  }

   /**
   * Optional; the ID of the table
   * @return tableID
  **/
  @ApiModelProperty(value = "Optional; the ID of the table")
  public String getTableID() {
    return tableID;
  }

  public void setTableID(String tableID) {
    this.tableID = tableID;
  }

  public FormTableDefinition columnDefinitions(List<FormTableColumnDefinition> columnDefinitions) {
    this.columnDefinitions = columnDefinitions;
    return this;
  }

  public FormTableDefinition addColumnDefinitionsItem(FormTableColumnDefinition columnDefinitionsItem) {
    if (this.columnDefinitions == null) {
      this.columnDefinitions = new ArrayList<FormTableColumnDefinition>();
    }
    this.columnDefinitions.add(columnDefinitionsItem);
    return this;
  }

   /**
   * Definition of the columns in the table
   * @return columnDefinitions
  **/
  @ApiModelProperty(value = "Definition of the columns in the table")
  public List<FormTableColumnDefinition> getColumnDefinitions() {
    return columnDefinitions;
  }

  public void setColumnDefinitions(List<FormTableColumnDefinition> columnDefinitions) {
    this.columnDefinitions = columnDefinitions;
  }

  public FormTableDefinition targetTableHeightRelative(Double targetTableHeightRelative) {
    this.targetTableHeightRelative = targetTableHeightRelative;
    return this;
  }

   /**
   * Optional - scale factor for target table height - relative to maximum height of headers of columns
   * @return targetTableHeightRelative
  **/
  @ApiModelProperty(value = "Optional - scale factor for target table height - relative to maximum height of headers of columns")
  public Double getTargetTableHeightRelative() {
    return targetTableHeightRelative;
  }

  public void setTargetTableHeightRelative(Double targetTableHeightRelative) {
    this.targetTableHeightRelative = targetTableHeightRelative;
  }

  public FormTableDefinition targetRowHeightRelative(Double targetRowHeightRelative) {
    this.targetRowHeightRelative = targetRowHeightRelative;
    return this;
  }

   /**
   * Optional - scale factor for target row height - relative to height of column header
   * @return targetRowHeightRelative
  **/
  @ApiModelProperty(value = "Optional - scale factor for target row height - relative to height of column header")
  public Double getTargetRowHeightRelative() {
    return targetRowHeightRelative;
  }

  public void setTargetRowHeightRelative(Double targetRowHeightRelative) {
    this.targetRowHeightRelative = targetRowHeightRelative;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormTableDefinition formTableDefinition = (FormTableDefinition) o;
    return Objects.equals(this.tableID, formTableDefinition.tableID) &&
        Objects.equals(this.columnDefinitions, formTableDefinition.columnDefinitions) &&
        Objects.equals(this.targetTableHeightRelative, formTableDefinition.targetTableHeightRelative) &&
        Objects.equals(this.targetRowHeightRelative, formTableDefinition.targetRowHeightRelative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableID, columnDefinitions, targetTableHeightRelative, targetRowHeightRelative);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormTableDefinition {\n");
    
    sb.append("    tableID: ").append(toIndentedString(tableID)).append("\n");
    sb.append("    columnDefinitions: ").append(toIndentedString(columnDefinitions)).append("\n");
    sb.append("    targetTableHeightRelative: ").append(toIndentedString(targetTableHeightRelative)).append("\n");
    sb.append("    targetRowHeightRelative: ").append(toIndentedString(targetRowHeightRelative)).append("\n");
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

