/*
 * videoapi
 * The video APIs help you convert, encode, and transcode videos.
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
import java.util.ArrayList;
import java.util.List;

/**
 * Result of retrieving information about a video or audio file
 */
@ApiModel(description = "Result of retrieving information about a video or audio file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T13:59:06.414-07:00")
public class MediaInformation {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("FileFormat")
  private String fileFormat = null;

  @SerializedName("FileFormatFull")
  private String fileFormatFull = null;

  @SerializedName("ValidFileFormats")
  private List<String> validFileFormats = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("BitRate")
  private Integer bitRate = null;

  @SerializedName("Duration")
  private Double duration = null;

  @SerializedName("StartTime")
  private Double startTime = null;

  public MediaInformation successful(Boolean successful) {
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

  public MediaInformation fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * The file&#39;s short format name
   * @return fileFormat
  **/
  @ApiModelProperty(value = "The file's short format name")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public MediaInformation fileFormatFull(String fileFormatFull) {
    this.fileFormatFull = fileFormatFull;
    return this;
  }

   /**
   * The file&#39;s full format name
   * @return fileFormatFull
  **/
  @ApiModelProperty(value = "The file's full format name")
  public String getFileFormatFull() {
    return fileFormatFull;
  }

  public void setFileFormatFull(String fileFormatFull) {
    this.fileFormatFull = fileFormatFull;
  }

  public MediaInformation validFileFormats(List<String> validFileFormats) {
    this.validFileFormats = validFileFormats;
    return this;
  }

  public MediaInformation addValidFileFormatsItem(String validFileFormatsItem) {
    if (this.validFileFormats == null) {
      this.validFileFormats = new ArrayList<String>();
    }
    this.validFileFormats.add(validFileFormatsItem);
    return this;
  }

   /**
   * A list of the file&#39;s valid formats
   * @return validFileFormats
  **/
  @ApiModelProperty(value = "A list of the file's valid formats")
  public List<String> getValidFileFormats() {
    return validFileFormats;
  }

  public void setValidFileFormats(List<String> validFileFormats) {
    this.validFileFormats = validFileFormats;
  }

  public MediaInformation width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The video&#39;s width, if file is a video
   * @return width
  **/
  @ApiModelProperty(value = "The video's width, if file is a video")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public MediaInformation height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The video&#39;s height, if file is a video
   * @return height
  **/
  @ApiModelProperty(value = "The video's height, if file is a video")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public MediaInformation size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The file&#39;s size in bytes
   * @return size
  **/
  @ApiModelProperty(value = "The file's size in bytes")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public MediaInformation bitRate(Integer bitRate) {
    this.bitRate = bitRate;
    return this;
  }

   /**
   * The file&#39;s bit rate
   * @return bitRate
  **/
  @ApiModelProperty(value = "The file's bit rate")
  public Integer getBitRate() {
    return bitRate;
  }

  public void setBitRate(Integer bitRate) {
    this.bitRate = bitRate;
  }

  public MediaInformation duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The file&#39;s duration in seconds
   * @return duration
  **/
  @ApiModelProperty(value = "The file's duration in seconds")
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public MediaInformation startTime(Double startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The file&#39;s media start time
   * @return startTime
  **/
  @ApiModelProperty(value = "The file's media start time")
  public Double getStartTime() {
    return startTime;
  }

  public void setStartTime(Double startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaInformation mediaInformation = (MediaInformation) o;
    return Objects.equals(this.successful, mediaInformation.successful) &&
        Objects.equals(this.fileFormat, mediaInformation.fileFormat) &&
        Objects.equals(this.fileFormatFull, mediaInformation.fileFormatFull) &&
        Objects.equals(this.validFileFormats, mediaInformation.validFileFormats) &&
        Objects.equals(this.width, mediaInformation.width) &&
        Objects.equals(this.height, mediaInformation.height) &&
        Objects.equals(this.size, mediaInformation.size) &&
        Objects.equals(this.bitRate, mediaInformation.bitRate) &&
        Objects.equals(this.duration, mediaInformation.duration) &&
        Objects.equals(this.startTime, mediaInformation.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, fileFormat, fileFormatFull, validFileFormats, width, height, size, bitRate, duration, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaInformation {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    fileFormatFull: ").append(toIndentedString(fileFormatFull)).append("\n");
    sb.append("    validFileFormats: ").append(toIndentedString(validFileFormats)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

