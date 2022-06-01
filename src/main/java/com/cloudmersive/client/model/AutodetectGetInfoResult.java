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
import com.cloudmersive.client.model.AlternateFileFormatCandidate;
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
import org.threeten.bp.OffsetDateTime;

/**
 * Result of an autodetect/get-info operation
 */
@ApiModel(description = "Result of an autodetect/get-info operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:38:04.235-07:00")
public class AutodetectGetInfoResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("DetectedFileExtension")
  private String detectedFileExtension = null;

  @SerializedName("DetectedMimeType")
  private String detectedMimeType = null;

  @SerializedName("PageCount")
  private Long pageCount = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("DateModified")
  private OffsetDateTime dateModified = null;

  @SerializedName("AlternateFileTypeCandidates")
  private List<AlternateFileFormatCandidate> alternateFileTypeCandidates = null;

  public AutodetectGetInfoResult successful(Boolean successful) {
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

  public AutodetectGetInfoResult detectedFileExtension(String detectedFileExtension) {
    this.detectedFileExtension = detectedFileExtension;
    return this;
  }

   /**
   * Detected file extension of the file format, with a leading period
   * @return detectedFileExtension
  **/
  @ApiModelProperty(value = "Detected file extension of the file format, with a leading period")
  public String getDetectedFileExtension() {
    return detectedFileExtension;
  }

  public void setDetectedFileExtension(String detectedFileExtension) {
    this.detectedFileExtension = detectedFileExtension;
  }

  public AutodetectGetInfoResult detectedMimeType(String detectedMimeType) {
    this.detectedMimeType = detectedMimeType;
    return this;
  }

   /**
   * MIME type of this file extension
   * @return detectedMimeType
  **/
  @ApiModelProperty(value = "MIME type of this file extension")
  public String getDetectedMimeType() {
    return detectedMimeType;
  }

  public void setDetectedMimeType(String detectedMimeType) {
    this.detectedMimeType = detectedMimeType;
  }

  public AutodetectGetInfoResult pageCount(Long pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Number of pages in a page-based document; for presentations, this is the number of slides and for a spreadsheet this is the number of worksheets.  Contains 0 when the page count cannot be determined, or if the concept of page count does not apply (e.g. for an image)
   * @return pageCount
  **/
  @ApiModelProperty(value = "Number of pages in a page-based document; for presentations, this is the number of slides and for a spreadsheet this is the number of worksheets.  Contains 0 when the page count cannot be determined, or if the concept of page count does not apply (e.g. for an image)")
  public Long getPageCount() {
    return pageCount;
  }

  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
  }

  public AutodetectGetInfoResult author(String author) {
    this.author = author;
    return this;
  }

   /**
   * User name of the creator/author of the document, if available, null if not available
   * @return author
  **/
  @ApiModelProperty(value = "User name of the creator/author of the document, if available, null if not available")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public AutodetectGetInfoResult dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * The timestamp that the document was last modified, if available, null if not available
   * @return dateModified
  **/
  @ApiModelProperty(value = "The timestamp that the document was last modified, if available, null if not available")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public AutodetectGetInfoResult alternateFileTypeCandidates(List<AlternateFileFormatCandidate> alternateFileTypeCandidates) {
    this.alternateFileTypeCandidates = alternateFileTypeCandidates;
    return this;
  }

  public AutodetectGetInfoResult addAlternateFileTypeCandidatesItem(AlternateFileFormatCandidate alternateFileTypeCandidatesItem) {
    if (this.alternateFileTypeCandidates == null) {
      this.alternateFileTypeCandidates = new ArrayList<AlternateFileFormatCandidate>();
    }
    this.alternateFileTypeCandidates.add(alternateFileTypeCandidatesItem);
    return this;
  }

   /**
   * Alternate file type options and their probability
   * @return alternateFileTypeCandidates
  **/
  @ApiModelProperty(value = "Alternate file type options and their probability")
  public List<AlternateFileFormatCandidate> getAlternateFileTypeCandidates() {
    return alternateFileTypeCandidates;
  }

  public void setAlternateFileTypeCandidates(List<AlternateFileFormatCandidate> alternateFileTypeCandidates) {
    this.alternateFileTypeCandidates = alternateFileTypeCandidates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutodetectGetInfoResult autodetectGetInfoResult = (AutodetectGetInfoResult) o;
    return Objects.equals(this.successful, autodetectGetInfoResult.successful) &&
        Objects.equals(this.detectedFileExtension, autodetectGetInfoResult.detectedFileExtension) &&
        Objects.equals(this.detectedMimeType, autodetectGetInfoResult.detectedMimeType) &&
        Objects.equals(this.pageCount, autodetectGetInfoResult.pageCount) &&
        Objects.equals(this.author, autodetectGetInfoResult.author) &&
        Objects.equals(this.dateModified, autodetectGetInfoResult.dateModified) &&
        Objects.equals(this.alternateFileTypeCandidates, autodetectGetInfoResult.alternateFileTypeCandidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, detectedFileExtension, detectedMimeType, pageCount, author, dateModified, alternateFileTypeCandidates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutodetectGetInfoResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    detectedFileExtension: ").append(toIndentedString(detectedFileExtension)).append("\n");
    sb.append("    detectedMimeType: ").append(toIndentedString(detectedMimeType)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    alternateFileTypeCandidates: ").append(toIndentedString(alternateFileTypeCandidates)).append("\n");
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

