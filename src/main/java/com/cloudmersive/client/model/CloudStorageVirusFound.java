/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
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
 * Virus positively identified
 */
@ApiModel(description = "Virus positively identified")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-26T20:57:12.260-08:00")
public class CloudStorageVirusFound {
  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("VirusName")
  private String virusName = null;

  public CloudStorageVirusFound fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the file containing the virus
   * @return fileName
  **/
  @ApiModelProperty(value = "Name of the file containing the virus")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public CloudStorageVirusFound virusName(String virusName) {
    this.virusName = virusName;
    return this;
  }

   /**
   * Name of the virus that was found
   * @return virusName
  **/
  @ApiModelProperty(value = "Name of the virus that was found")
  public String getVirusName() {
    return virusName;
  }

  public void setVirusName(String virusName) {
    this.virusName = virusName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudStorageVirusFound cloudStorageVirusFound = (CloudStorageVirusFound) o;
    return Objects.equals(this.fileName, cloudStorageVirusFound.fileName) &&
        Objects.equals(this.virusName, cloudStorageVirusFound.virusName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, virusName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudStorageVirusFound {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    virusName: ").append(toIndentedString(virusName)).append("\n");
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
