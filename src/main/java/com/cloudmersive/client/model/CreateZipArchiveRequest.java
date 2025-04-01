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
import com.cloudmersive.client.model.ZipDirectory;
import com.cloudmersive.client.model.ZipFile;
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
 * Request to create a Zip Archive
 */
@ApiModel(description = "Request to create a Zip Archive")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T00:53:54.448-07:00")
public class CreateZipArchiveRequest {
  @SerializedName("FilesInZip")
  private List<ZipFile> filesInZip = null;

  @SerializedName("DirectoriesInZip")
  private List<ZipDirectory> directoriesInZip = null;

  public CreateZipArchiveRequest filesInZip(List<ZipFile> filesInZip) {
    this.filesInZip = filesInZip;
    return this;
  }

  public CreateZipArchiveRequest addFilesInZipItem(ZipFile filesInZipItem) {
    if (this.filesInZip == null) {
      this.filesInZip = new ArrayList<ZipFile>();
    }
    this.filesInZip.add(filesInZipItem);
    return this;
  }

   /**
   * Top-level files in the root directory fo the zip file
   * @return filesInZip
  **/
  @ApiModelProperty(value = "Top-level files in the root directory fo the zip file")
  public List<ZipFile> getFilesInZip() {
    return filesInZip;
  }

  public void setFilesInZip(List<ZipFile> filesInZip) {
    this.filesInZip = filesInZip;
  }

  public CreateZipArchiveRequest directoriesInZip(List<ZipDirectory> directoriesInZip) {
    this.directoriesInZip = directoriesInZip;
    return this;
  }

  public CreateZipArchiveRequest addDirectoriesInZipItem(ZipDirectory directoriesInZipItem) {
    if (this.directoriesInZip == null) {
      this.directoriesInZip = new ArrayList<ZipDirectory>();
    }
    this.directoriesInZip.add(directoriesInZipItem);
    return this;
  }

   /**
   * Top-level directories in the root directory of the zip; directories can contain sub-directories and files
   * @return directoriesInZip
  **/
  @ApiModelProperty(value = "Top-level directories in the root directory of the zip; directories can contain sub-directories and files")
  public List<ZipDirectory> getDirectoriesInZip() {
    return directoriesInZip;
  }

  public void setDirectoriesInZip(List<ZipDirectory> directoriesInZip) {
    this.directoriesInZip = directoriesInZip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateZipArchiveRequest createZipArchiveRequest = (CreateZipArchiveRequest) o;
    return Objects.equals(this.filesInZip, createZipArchiveRequest.filesInZip) &&
        Objects.equals(this.directoriesInZip, createZipArchiveRequest.directoriesInZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesInZip, directoriesInZip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateZipArchiveRequest {\n");
    
    sb.append("    filesInZip: ").append(toIndentedString(filesInZip)).append("\n");
    sb.append("    directoriesInZip: ").append(toIndentedString(directoriesInZip)).append("\n");
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

