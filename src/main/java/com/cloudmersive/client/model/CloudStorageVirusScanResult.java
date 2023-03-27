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
import com.cloudmersive.client.model.CloudStorageVirusFound;
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
 * Result of running a virus scan on cloud storage
 */
@ApiModel(description = "Result of running a virus scan on cloud storage")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-26T22:44:17.038-07:00")
public class CloudStorageVirusScanResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("CleanResult")
  private Boolean cleanResult = null;

  @SerializedName("FoundViruses")
  private List<CloudStorageVirusFound> foundViruses = null;

  @SerializedName("ErrorDetailedDescription")
  private String errorDetailedDescription = null;

  @SerializedName("FileSize")
  private Long fileSize = null;

  @SerializedName("ContainsContentModerationRejection")
  private Boolean containsContentModerationRejection = null;

  public CloudStorageVirusScanResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation of retrieving the file, and scanning it were successfully completed, false if the file could not be downloaded from cloud storage, or if the file could not be scanned.  Note that successful completion does not mean the file is clean; for the output of the virus scanning operation itself, use the CleanResult and FoundViruses parameters.
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation of retrieving the file, and scanning it were successfully completed, false if the file could not be downloaded from cloud storage, or if the file could not be scanned.  Note that successful completion does not mean the file is clean; for the output of the virus scanning operation itself, use the CleanResult and FoundViruses parameters.")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public CloudStorageVirusScanResult cleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
    return this;
  }

   /**
   * True if the scan contained no viruses, false otherwise
   * @return cleanResult
  **/
  @ApiModelProperty(value = "True if the scan contained no viruses, false otherwise")
  public Boolean isCleanResult() {
    return cleanResult;
  }

  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }

  public CloudStorageVirusScanResult foundViruses(List<CloudStorageVirusFound> foundViruses) {
    this.foundViruses = foundViruses;
    return this;
  }

  public CloudStorageVirusScanResult addFoundVirusesItem(CloudStorageVirusFound foundVirusesItem) {
    if (this.foundViruses == null) {
      this.foundViruses = new ArrayList<CloudStorageVirusFound>();
    }
    this.foundViruses.add(foundVirusesItem);
    return this;
  }

   /**
   * Array of viruses found, if any
   * @return foundViruses
  **/
  @ApiModelProperty(value = "Array of viruses found, if any")
  public List<CloudStorageVirusFound> getFoundViruses() {
    return foundViruses;
  }

  public void setFoundViruses(List<CloudStorageVirusFound> foundViruses) {
    this.foundViruses = foundViruses;
  }

  public CloudStorageVirusScanResult errorDetailedDescription(String errorDetailedDescription) {
    this.errorDetailedDescription = errorDetailedDescription;
    return this;
  }

   /**
   * Detailed error message if the operation was not successful
   * @return errorDetailedDescription
  **/
  @ApiModelProperty(value = "Detailed error message if the operation was not successful")
  public String getErrorDetailedDescription() {
    return errorDetailedDescription;
  }

  public void setErrorDetailedDescription(String errorDetailedDescription) {
    this.errorDetailedDescription = errorDetailedDescription;
  }

  public CloudStorageVirusScanResult fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Size in bytes of the file that was retrieved and scanned
   * @return fileSize
  **/
  @ApiModelProperty(value = "Size in bytes of the file that was retrieved and scanned")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public CloudStorageVirusScanResult containsContentModerationRejection(Boolean containsContentModerationRejection) {
    this.containsContentModerationRejection = containsContentModerationRejection;
    return this;
  }

   /**
   * Set to true when using NSFW Content Moderation in the Cloudmersive Storage Protect product (disabled by default)
   * @return containsContentModerationRejection
  **/
  @ApiModelProperty(value = "Set to true when using NSFW Content Moderation in the Cloudmersive Storage Protect product (disabled by default)")
  public Boolean isContainsContentModerationRejection() {
    return containsContentModerationRejection;
  }

  public void setContainsContentModerationRejection(Boolean containsContentModerationRejection) {
    this.containsContentModerationRejection = containsContentModerationRejection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudStorageVirusScanResult cloudStorageVirusScanResult = (CloudStorageVirusScanResult) o;
    return Objects.equals(this.successful, cloudStorageVirusScanResult.successful) &&
        Objects.equals(this.cleanResult, cloudStorageVirusScanResult.cleanResult) &&
        Objects.equals(this.foundViruses, cloudStorageVirusScanResult.foundViruses) &&
        Objects.equals(this.errorDetailedDescription, cloudStorageVirusScanResult.errorDetailedDescription) &&
        Objects.equals(this.fileSize, cloudStorageVirusScanResult.fileSize) &&
        Objects.equals(this.containsContentModerationRejection, cloudStorageVirusScanResult.containsContentModerationRejection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, cleanResult, foundViruses, errorDetailedDescription, fileSize, containsContentModerationRejection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudStorageVirusScanResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    foundViruses: ").append(toIndentedString(foundViruses)).append("\n");
    sb.append("    errorDetailedDescription: ").append(toIndentedString(errorDetailedDescription)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    containsContentModerationRejection: ").append(toIndentedString(containsContentModerationRejection)).append("\n");
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

