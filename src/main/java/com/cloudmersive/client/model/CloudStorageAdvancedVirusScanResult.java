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
 * Result of running an advanced virus scan on cloud storage
 */
@ApiModel(description = "Result of running an advanced virus scan on cloud storage")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-04T20:57:22.809-07:00")
public class CloudStorageAdvancedVirusScanResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("CleanResult")
  private Boolean cleanResult = null;

  @SerializedName("ContainsExecutable")
  private Boolean containsExecutable = null;

  @SerializedName("ContainsInvalidFile")
  private Boolean containsInvalidFile = null;

  @SerializedName("ContainsScript")
  private Boolean containsScript = null;

  @SerializedName("ContainsPasswordProtectedFile")
  private Boolean containsPasswordProtectedFile = null;

  @SerializedName("ContainsRestrictedFileFormat")
  private Boolean containsRestrictedFileFormat = null;

  @SerializedName("ContainsMacros")
  private Boolean containsMacros = null;

  @SerializedName("VerifiedFileFormat")
  private String verifiedFileFormat = null;

  @SerializedName("FoundViruses")
  private List<CloudStorageVirusFound> foundViruses = null;

  @SerializedName("ErrorDetailedDescription")
  private String errorDetailedDescription = null;

  @SerializedName("FileSize")
  private Long fileSize = null;

  public CloudStorageAdvancedVirusScanResult successful(Boolean successful) {
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

  public CloudStorageAdvancedVirusScanResult cleanResult(Boolean cleanResult) {
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

  public CloudStorageAdvancedVirusScanResult containsExecutable(Boolean containsExecutable) {
    this.containsExecutable = containsExecutable;
    return this;
  }

   /**
   * True if the scan contained an executable (application code), which can be a significant risk factor
   * @return containsExecutable
  **/
  @ApiModelProperty(value = "True if the scan contained an executable (application code), which can be a significant risk factor")
  public Boolean isContainsExecutable() {
    return containsExecutable;
  }

  public void setContainsExecutable(Boolean containsExecutable) {
    this.containsExecutable = containsExecutable;
  }

  public CloudStorageAdvancedVirusScanResult containsInvalidFile(Boolean containsInvalidFile) {
    this.containsInvalidFile = containsInvalidFile;
    return this;
  }

   /**
   * True if the scan contained an invalid file (such as a PDF that is not a valid PDF, Word Document that is not a valid Word Document, etc.), which can be a significant risk factor
   * @return containsInvalidFile
  **/
  @ApiModelProperty(value = "True if the scan contained an invalid file (such as a PDF that is not a valid PDF, Word Document that is not a valid Word Document, etc.), which can be a significant risk factor")
  public Boolean isContainsInvalidFile() {
    return containsInvalidFile;
  }

  public void setContainsInvalidFile(Boolean containsInvalidFile) {
    this.containsInvalidFile = containsInvalidFile;
  }

  public CloudStorageAdvancedVirusScanResult containsScript(Boolean containsScript) {
    this.containsScript = containsScript;
    return this;
  }

   /**
   * True if the scan contained a script (such as a PHP script, Python script, etc.) which can be a significant risk factor
   * @return containsScript
  **/
  @ApiModelProperty(value = "True if the scan contained a script (such as a PHP script, Python script, etc.) which can be a significant risk factor")
  public Boolean isContainsScript() {
    return containsScript;
  }

  public void setContainsScript(Boolean containsScript) {
    this.containsScript = containsScript;
  }

  public CloudStorageAdvancedVirusScanResult containsPasswordProtectedFile(Boolean containsPasswordProtectedFile) {
    this.containsPasswordProtectedFile = containsPasswordProtectedFile;
    return this;
  }

   /**
   * True if the scan contained a password protected or encrypted file, which can be a significant risk factor
   * @return containsPasswordProtectedFile
  **/
  @ApiModelProperty(value = "True if the scan contained a password protected or encrypted file, which can be a significant risk factor")
  public Boolean isContainsPasswordProtectedFile() {
    return containsPasswordProtectedFile;
  }

  public void setContainsPasswordProtectedFile(Boolean containsPasswordProtectedFile) {
    this.containsPasswordProtectedFile = containsPasswordProtectedFile;
  }

  public CloudStorageAdvancedVirusScanResult containsRestrictedFileFormat(Boolean containsRestrictedFileFormat) {
    this.containsRestrictedFileFormat = containsRestrictedFileFormat;
    return this;
  }

   /**
   * True if the uploaded file is of a type that is not allowed based on the optional restrictFileTypes parameter, false otherwise; if restrictFileTypes is not set, this will always be false
   * @return containsRestrictedFileFormat
  **/
  @ApiModelProperty(value = "True if the uploaded file is of a type that is not allowed based on the optional restrictFileTypes parameter, false otherwise; if restrictFileTypes is not set, this will always be false")
  public Boolean isContainsRestrictedFileFormat() {
    return containsRestrictedFileFormat;
  }

  public void setContainsRestrictedFileFormat(Boolean containsRestrictedFileFormat) {
    this.containsRestrictedFileFormat = containsRestrictedFileFormat;
  }

  public CloudStorageAdvancedVirusScanResult containsMacros(Boolean containsMacros) {
    this.containsMacros = containsMacros;
    return this;
  }

   /**
   * True if the uploaded file contains embedded Macros of other embedded threats within the document, which can be a significant risk factor
   * @return containsMacros
  **/
  @ApiModelProperty(value = "True if the uploaded file contains embedded Macros of other embedded threats within the document, which can be a significant risk factor")
  public Boolean isContainsMacros() {
    return containsMacros;
  }

  public void setContainsMacros(Boolean containsMacros) {
    this.containsMacros = containsMacros;
  }

  public CloudStorageAdvancedVirusScanResult verifiedFileFormat(String verifiedFileFormat) {
    this.verifiedFileFormat = verifiedFileFormat;
    return this;
  }

   /**
   * For file format verification-supported file formats, the contents-verified file format of the file.  Null indicates that the file format is not supported for contents verification.  If a Virus or Malware is found, this field will always be set to Null.
   * @return verifiedFileFormat
  **/
  @ApiModelProperty(value = "For file format verification-supported file formats, the contents-verified file format of the file.  Null indicates that the file format is not supported for contents verification.  If a Virus or Malware is found, this field will always be set to Null.")
  public String getVerifiedFileFormat() {
    return verifiedFileFormat;
  }

  public void setVerifiedFileFormat(String verifiedFileFormat) {
    this.verifiedFileFormat = verifiedFileFormat;
  }

  public CloudStorageAdvancedVirusScanResult foundViruses(List<CloudStorageVirusFound> foundViruses) {
    this.foundViruses = foundViruses;
    return this;
  }

  public CloudStorageAdvancedVirusScanResult addFoundVirusesItem(CloudStorageVirusFound foundVirusesItem) {
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

  public CloudStorageAdvancedVirusScanResult errorDetailedDescription(String errorDetailedDescription) {
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

  public CloudStorageAdvancedVirusScanResult fileSize(Long fileSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudStorageAdvancedVirusScanResult cloudStorageAdvancedVirusScanResult = (CloudStorageAdvancedVirusScanResult) o;
    return Objects.equals(this.successful, cloudStorageAdvancedVirusScanResult.successful) &&
        Objects.equals(this.cleanResult, cloudStorageAdvancedVirusScanResult.cleanResult) &&
        Objects.equals(this.containsExecutable, cloudStorageAdvancedVirusScanResult.containsExecutable) &&
        Objects.equals(this.containsInvalidFile, cloudStorageAdvancedVirusScanResult.containsInvalidFile) &&
        Objects.equals(this.containsScript, cloudStorageAdvancedVirusScanResult.containsScript) &&
        Objects.equals(this.containsPasswordProtectedFile, cloudStorageAdvancedVirusScanResult.containsPasswordProtectedFile) &&
        Objects.equals(this.containsRestrictedFileFormat, cloudStorageAdvancedVirusScanResult.containsRestrictedFileFormat) &&
        Objects.equals(this.containsMacros, cloudStorageAdvancedVirusScanResult.containsMacros) &&
        Objects.equals(this.verifiedFileFormat, cloudStorageAdvancedVirusScanResult.verifiedFileFormat) &&
        Objects.equals(this.foundViruses, cloudStorageAdvancedVirusScanResult.foundViruses) &&
        Objects.equals(this.errorDetailedDescription, cloudStorageAdvancedVirusScanResult.errorDetailedDescription) &&
        Objects.equals(this.fileSize, cloudStorageAdvancedVirusScanResult.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, cleanResult, containsExecutable, containsInvalidFile, containsScript, containsPasswordProtectedFile, containsRestrictedFileFormat, containsMacros, verifiedFileFormat, foundViruses, errorDetailedDescription, fileSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudStorageAdvancedVirusScanResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    containsExecutable: ").append(toIndentedString(containsExecutable)).append("\n");
    sb.append("    containsInvalidFile: ").append(toIndentedString(containsInvalidFile)).append("\n");
    sb.append("    containsScript: ").append(toIndentedString(containsScript)).append("\n");
    sb.append("    containsPasswordProtectedFile: ").append(toIndentedString(containsPasswordProtectedFile)).append("\n");
    sb.append("    containsRestrictedFileFormat: ").append(toIndentedString(containsRestrictedFileFormat)).append("\n");
    sb.append("    containsMacros: ").append(toIndentedString(containsMacros)).append("\n");
    sb.append("    verifiedFileFormat: ").append(toIndentedString(verifiedFileFormat)).append("\n");
    sb.append("    foundViruses: ").append(toIndentedString(foundViruses)).append("\n");
    sb.append("    errorDetailedDescription: ").append(toIndentedString(errorDetailedDescription)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

