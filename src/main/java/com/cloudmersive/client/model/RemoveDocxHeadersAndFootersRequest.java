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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Remove Headers and Footers request
 */
@ApiModel(description = "Input to a Remove Headers and Footers request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-26T22:43:16.441-07:00")
public class RemoveDocxHeadersAndFootersRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("RemoveHeaders")
  private Boolean removeHeaders = null;

  @SerializedName("RemoveFooters")
  private Boolean removeFooters = null;

  public RemoveDocxHeadersAndFootersRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public RemoveDocxHeadersAndFootersRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public RemoveDocxHeadersAndFootersRequest removeHeaders(Boolean removeHeaders) {
    this.removeHeaders = removeHeaders;
    return this;
  }

   /**
   * True if you would like to remove all headers from the input document, false otherwise
   * @return removeHeaders
  **/
  @ApiModelProperty(value = "True if you would like to remove all headers from the input document, false otherwise")
  public Boolean isRemoveHeaders() {
    return removeHeaders;
  }

  public void setRemoveHeaders(Boolean removeHeaders) {
    this.removeHeaders = removeHeaders;
  }

  public RemoveDocxHeadersAndFootersRequest removeFooters(Boolean removeFooters) {
    this.removeFooters = removeFooters;
    return this;
  }

   /**
   * True if you would like to remove all footers from the input document, false otherwise
   * @return removeFooters
  **/
  @ApiModelProperty(value = "True if you would like to remove all footers from the input document, false otherwise")
  public Boolean isRemoveFooters() {
    return removeFooters;
  }

  public void setRemoveFooters(Boolean removeFooters) {
    this.removeFooters = removeFooters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveDocxHeadersAndFootersRequest removeDocxHeadersAndFootersRequest = (RemoveDocxHeadersAndFootersRequest) o;
    return Arrays.equals(this.inputFileBytes, removeDocxHeadersAndFootersRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, removeDocxHeadersAndFootersRequest.inputFileUrl) &&
        Objects.equals(this.removeHeaders, removeDocxHeadersAndFootersRequest.removeHeaders) &&
        Objects.equals(this.removeFooters, removeDocxHeadersAndFootersRequest.removeFooters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, removeHeaders, removeFooters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveDocxHeadersAndFootersRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    removeHeaders: ").append(toIndentedString(removeHeaders)).append("\n");
    sb.append("    removeFooters: ").append(toIndentedString(removeFooters)).append("\n");
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

