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
import com.cloudmersive.client.model.CsvFileResult;
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
 * Collection of CSV Files
 */
@ApiModel(description = "Collection of CSV Files")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-18T17:04:54.531-07:00")
public class CsvCollection {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("CsvFiles")
  private List<CsvFileResult> csvFiles = null;

  @SerializedName("FileCount")
  private Integer fileCount = null;

  public CsvCollection successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public CsvCollection csvFiles(List<CsvFileResult> csvFiles) {
    this.csvFiles = csvFiles;
    return this;
  }

  public CsvCollection addCsvFilesItem(CsvFileResult csvFilesItem) {
    if (this.csvFiles == null) {
      this.csvFiles = new ArrayList<CsvFileResult>();
    }
    this.csvFiles.add(csvFilesItem);
    return this;
  }

   /**
   * Array of CSV File results
   * @return csvFiles
  **/
  @ApiModelProperty(value = "Array of CSV File results")
  public List<CsvFileResult> getCsvFiles() {
    return csvFiles;
  }

  public void setCsvFiles(List<CsvFileResult> csvFiles) {
    this.csvFiles = csvFiles;
  }

  public CsvCollection fileCount(Integer fileCount) {
    this.fileCount = fileCount;
    return this;
  }

   /**
   * Count of the number of CSV files produced
   * @return fileCount
  **/
  @ApiModelProperty(value = "Count of the number of CSV files produced")
  public Integer getFileCount() {
    return fileCount;
  }

  public void setFileCount(Integer fileCount) {
    this.fileCount = fileCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvCollection csvCollection = (CsvCollection) o;
    return Objects.equals(this.successful, csvCollection.successful) &&
        Objects.equals(this.csvFiles, csvCollection.csvFiles) &&
        Objects.equals(this.fileCount, csvCollection.fileCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, csvFiles, fileCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvCollection {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    csvFiles: ").append(toIndentedString(csvFiles)).append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
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

