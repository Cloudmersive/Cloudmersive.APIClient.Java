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
import com.cloudmersive.client.model.AdditionalAdvancedScanInformation;
import com.cloudmersive.client.model.VirusFound;
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
 * Result of running an advanced virus scan
 */
@ApiModel(description = "Result of running an advanced virus scan")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:14:49.519-07:00")
public class VirusScanAdvancedResult {
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

  @SerializedName("ContainsXmlExternalEntities")
  private Boolean containsXmlExternalEntities = null;

  @SerializedName("ContainsInsecureDeserialization")
  private Boolean containsInsecureDeserialization = null;

  @SerializedName("ContainsHtml")
  private Boolean containsHtml = null;

  @SerializedName("ContainsUnsafeArchive")
  private Boolean containsUnsafeArchive = null;

  @SerializedName("ContainsOleEmbeddedObject")
  private Boolean containsOleEmbeddedObject = null;

  @SerializedName("VerifiedFileFormat")
  private String verifiedFileFormat = null;

  @SerializedName("FoundViruses")
  private List<VirusFound> foundViruses = null;

  @SerializedName("ContentInformation")
  private AdditionalAdvancedScanInformation contentInformation = null;

  public VirusScanAdvancedResult cleanResult(Boolean cleanResult) {
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

  public VirusScanAdvancedResult containsExecutable(Boolean containsExecutable) {
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

  public VirusScanAdvancedResult containsInvalidFile(Boolean containsInvalidFile) {
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

  public VirusScanAdvancedResult containsScript(Boolean containsScript) {
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

  public VirusScanAdvancedResult containsPasswordProtectedFile(Boolean containsPasswordProtectedFile) {
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

  public VirusScanAdvancedResult containsRestrictedFileFormat(Boolean containsRestrictedFileFormat) {
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

  public VirusScanAdvancedResult containsMacros(Boolean containsMacros) {
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

  public VirusScanAdvancedResult containsXmlExternalEntities(Boolean containsXmlExternalEntities) {
    this.containsXmlExternalEntities = containsXmlExternalEntities;
    return this;
  }

   /**
   * True if the uploaded file contains embedded XML External Entity threats of other embedded threats within the document, which can be a significant risk factor
   * @return containsXmlExternalEntities
  **/
  @ApiModelProperty(value = "True if the uploaded file contains embedded XML External Entity threats of other embedded threats within the document, which can be a significant risk factor")
  public Boolean isContainsXmlExternalEntities() {
    return containsXmlExternalEntities;
  }

  public void setContainsXmlExternalEntities(Boolean containsXmlExternalEntities) {
    this.containsXmlExternalEntities = containsXmlExternalEntities;
  }

  public VirusScanAdvancedResult containsInsecureDeserialization(Boolean containsInsecureDeserialization) {
    this.containsInsecureDeserialization = containsInsecureDeserialization;
    return this;
  }

   /**
   * True if the uploaded file contains embedded Insecure Deserialization threats of other embedded threats within the document, which can be a significant risk factor
   * @return containsInsecureDeserialization
  **/
  @ApiModelProperty(value = "True if the uploaded file contains embedded Insecure Deserialization threats of other embedded threats within the document, which can be a significant risk factor")
  public Boolean isContainsInsecureDeserialization() {
    return containsInsecureDeserialization;
  }

  public void setContainsInsecureDeserialization(Boolean containsInsecureDeserialization) {
    this.containsInsecureDeserialization = containsInsecureDeserialization;
  }

  public VirusScanAdvancedResult containsHtml(Boolean containsHtml) {
    this.containsHtml = containsHtml;
    return this;
  }

   /**
   * True if the uploaded file contains HTML, which can be a significant risk factor
   * @return containsHtml
  **/
  @ApiModelProperty(value = "True if the uploaded file contains HTML, which can be a significant risk factor")
  public Boolean isContainsHtml() {
    return containsHtml;
  }

  public void setContainsHtml(Boolean containsHtml) {
    this.containsHtml = containsHtml;
  }

  public VirusScanAdvancedResult containsUnsafeArchive(Boolean containsUnsafeArchive) {
    this.containsUnsafeArchive = containsUnsafeArchive;
    return this;
  }

   /**
   * True if the uploaded file contains unsafe archive (e.g. zip) content, such as a Zip Bomb, or other configurations of a zip file that could lead to an unsafe extraction
   * @return containsUnsafeArchive
  **/
  @ApiModelProperty(value = "True if the uploaded file contains unsafe archive (e.g. zip) content, such as a Zip Bomb, or other configurations of a zip file that could lead to an unsafe extraction")
  public Boolean isContainsUnsafeArchive() {
    return containsUnsafeArchive;
  }

  public void setContainsUnsafeArchive(Boolean containsUnsafeArchive) {
    this.containsUnsafeArchive = containsUnsafeArchive;
  }

  public VirusScanAdvancedResult containsOleEmbeddedObject(Boolean containsOleEmbeddedObject) {
    this.containsOleEmbeddedObject = containsOleEmbeddedObject;
    return this;
  }

   /**
   * True if the uploaded file contains an OLE embedded object, which can be a significant risk factor
   * @return containsOleEmbeddedObject
  **/
  @ApiModelProperty(value = "True if the uploaded file contains an OLE embedded object, which can be a significant risk factor")
  public Boolean isContainsOleEmbeddedObject() {
    return containsOleEmbeddedObject;
  }

  public void setContainsOleEmbeddedObject(Boolean containsOleEmbeddedObject) {
    this.containsOleEmbeddedObject = containsOleEmbeddedObject;
  }

  public VirusScanAdvancedResult verifiedFileFormat(String verifiedFileFormat) {
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

  public VirusScanAdvancedResult foundViruses(List<VirusFound> foundViruses) {
    this.foundViruses = foundViruses;
    return this;
  }

  public VirusScanAdvancedResult addFoundVirusesItem(VirusFound foundVirusesItem) {
    if (this.foundViruses == null) {
      this.foundViruses = new ArrayList<VirusFound>();
    }
    this.foundViruses.add(foundVirusesItem);
    return this;
  }

   /**
   * Array of viruses found, if any
   * @return foundViruses
  **/
  @ApiModelProperty(value = "Array of viruses found, if any")
  public List<VirusFound> getFoundViruses() {
    return foundViruses;
  }

  public void setFoundViruses(List<VirusFound> foundViruses) {
    this.foundViruses = foundViruses;
  }

  public VirusScanAdvancedResult contentInformation(AdditionalAdvancedScanInformation contentInformation) {
    this.contentInformation = contentInformation;
    return this;
  }

   /**
   * Contains additional non-threat content verification information
   * @return contentInformation
  **/
  @ApiModelProperty(value = "Contains additional non-threat content verification information")
  public AdditionalAdvancedScanInformation getContentInformation() {
    return contentInformation;
  }

  public void setContentInformation(AdditionalAdvancedScanInformation contentInformation) {
    this.contentInformation = contentInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirusScanAdvancedResult virusScanAdvancedResult = (VirusScanAdvancedResult) o;
    return Objects.equals(this.cleanResult, virusScanAdvancedResult.cleanResult) &&
        Objects.equals(this.containsExecutable, virusScanAdvancedResult.containsExecutable) &&
        Objects.equals(this.containsInvalidFile, virusScanAdvancedResult.containsInvalidFile) &&
        Objects.equals(this.containsScript, virusScanAdvancedResult.containsScript) &&
        Objects.equals(this.containsPasswordProtectedFile, virusScanAdvancedResult.containsPasswordProtectedFile) &&
        Objects.equals(this.containsRestrictedFileFormat, virusScanAdvancedResult.containsRestrictedFileFormat) &&
        Objects.equals(this.containsMacros, virusScanAdvancedResult.containsMacros) &&
        Objects.equals(this.containsXmlExternalEntities, virusScanAdvancedResult.containsXmlExternalEntities) &&
        Objects.equals(this.containsInsecureDeserialization, virusScanAdvancedResult.containsInsecureDeserialization) &&
        Objects.equals(this.containsHtml, virusScanAdvancedResult.containsHtml) &&
        Objects.equals(this.containsUnsafeArchive, virusScanAdvancedResult.containsUnsafeArchive) &&
        Objects.equals(this.containsOleEmbeddedObject, virusScanAdvancedResult.containsOleEmbeddedObject) &&
        Objects.equals(this.verifiedFileFormat, virusScanAdvancedResult.verifiedFileFormat) &&
        Objects.equals(this.foundViruses, virusScanAdvancedResult.foundViruses) &&
        Objects.equals(this.contentInformation, virusScanAdvancedResult.contentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanResult, containsExecutable, containsInvalidFile, containsScript, containsPasswordProtectedFile, containsRestrictedFileFormat, containsMacros, containsXmlExternalEntities, containsInsecureDeserialization, containsHtml, containsUnsafeArchive, containsOleEmbeddedObject, verifiedFileFormat, foundViruses, contentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirusScanAdvancedResult {\n");
    
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    containsExecutable: ").append(toIndentedString(containsExecutable)).append("\n");
    sb.append("    containsInvalidFile: ").append(toIndentedString(containsInvalidFile)).append("\n");
    sb.append("    containsScript: ").append(toIndentedString(containsScript)).append("\n");
    sb.append("    containsPasswordProtectedFile: ").append(toIndentedString(containsPasswordProtectedFile)).append("\n");
    sb.append("    containsRestrictedFileFormat: ").append(toIndentedString(containsRestrictedFileFormat)).append("\n");
    sb.append("    containsMacros: ").append(toIndentedString(containsMacros)).append("\n");
    sb.append("    containsXmlExternalEntities: ").append(toIndentedString(containsXmlExternalEntities)).append("\n");
    sb.append("    containsInsecureDeserialization: ").append(toIndentedString(containsInsecureDeserialization)).append("\n");
    sb.append("    containsHtml: ").append(toIndentedString(containsHtml)).append("\n");
    sb.append("    containsUnsafeArchive: ").append(toIndentedString(containsUnsafeArchive)).append("\n");
    sb.append("    containsOleEmbeddedObject: ").append(toIndentedString(containsOleEmbeddedObject)).append("\n");
    sb.append("    verifiedFileFormat: ").append(toIndentedString(verifiedFileFormat)).append("\n");
    sb.append("    foundViruses: ").append(toIndentedString(foundViruses)).append("\n");
    sb.append("    contentInformation: ").append(toIndentedString(contentInformation)).append("\n");
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

