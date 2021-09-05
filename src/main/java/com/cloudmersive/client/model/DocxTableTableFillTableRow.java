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
import com.cloudmersive.client.model.DocxTableTableFillTableCell;
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
 * Row data to fill in to the DOCX Table
 */
@ApiModel(description = "Row data to fill in to the DOCX Table")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-04T20:57:16.181-07:00")
public class DocxTableTableFillTableRow {
  @SerializedName("Cells")
  private List<DocxTableTableFillTableCell> cells = null;

  public DocxTableTableFillTableRow cells(List<DocxTableTableFillTableCell> cells) {
    this.cells = cells;
    return this;
  }

  public DocxTableTableFillTableRow addCellsItem(DocxTableTableFillTableCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<DocxTableTableFillTableCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Cells in the row to fill in
   * @return cells
  **/
  @ApiModelProperty(value = "Cells in the row to fill in")
  public List<DocxTableTableFillTableCell> getCells() {
    return cells;
  }

  public void setCells(List<DocxTableTableFillTableCell> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableTableFillTableRow docxTableTableFillTableRow = (DocxTableTableFillTableRow) o;
    return Objects.equals(this.cells, docxTableTableFillTableRow.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableTableFillTableRow {\n");
    
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

