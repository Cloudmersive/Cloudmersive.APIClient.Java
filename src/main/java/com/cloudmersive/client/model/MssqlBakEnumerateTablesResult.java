/*
 * dataintegrationapi
 * Easily and directly query database backup files, convert into other file formats.
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
import com.cloudmersive.client.model.MssqlTable;
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
 * Result of enumeerating Tables in a SQL Server Backup (.BAK) file
 */
@ApiModel(description = "Result of enumeerating Tables in a SQL Server Backup (.BAK) file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-17T20:36:37.483-07:00")
public class MssqlBakEnumerateTablesResult {
  @SerializedName("successful")
  private Boolean successful = null;

  @SerializedName("tables")
  private List<MssqlTable> tables = null;

  public MssqlBakEnumerateTablesResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, False otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, False otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public MssqlBakEnumerateTablesResult tables(List<MssqlTable> tables) {
    this.tables = tables;
    return this;
  }

  public MssqlBakEnumerateTablesResult addTablesItem(MssqlTable tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<MssqlTable>();
    }
    this.tables.add(tablesItem);
    return this;
  }

   /**
   * SQL Server Tables in the backup file
   * @return tables
  **/
  @ApiModelProperty(value = "SQL Server Tables in the backup file")
  public List<MssqlTable> getTables() {
    return tables;
  }

  public void setTables(List<MssqlTable> tables) {
    this.tables = tables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MssqlBakEnumerateTablesResult mssqlBakEnumerateTablesResult = (MssqlBakEnumerateTablesResult) o;
    return Objects.equals(this.successful, mssqlBakEnumerateTablesResult.successful) &&
        Objects.equals(this.tables, mssqlBakEnumerateTablesResult.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, tables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MssqlBakEnumerateTablesResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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

