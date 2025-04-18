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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about a SQL Server Table
 */
@ApiModel(description = "Details about a SQL Server Table")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-16T23:16:05.809-07:00")
public class MssqlTable {
  @SerializedName("schemaName")
  private String schemaName = null;

  @SerializedName("tableName")
  private String tableName = null;

  public MssqlTable schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

   /**
   * Name of the schema containing the table
   * @return schemaName
  **/
  @ApiModelProperty(value = "Name of the schema containing the table")
  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public MssqlTable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Name of the table
   * @return tableName
  **/
  @ApiModelProperty(value = "Name of the table")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MssqlTable mssqlTable = (MssqlTable) o;
    return Objects.equals(this.schemaName, mssqlTable.schemaName) &&
        Objects.equals(this.tableName, mssqlTable.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaName, tableName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MssqlTable {\n");
    
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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

