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
import com.cloudmersive.client.model.SingleReplaceString;
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
 * Input to a multiple string replacement request
 */
@ApiModel(description = "Input to a multiple string replacement request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T13:18:58.216-07:00")
public class MultiReplaceStringRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("ReplaceStrings")
  private List<SingleReplaceString> replaceStrings = null;

  public MultiReplaceStringRequest inputFileBytes(byte[] inputFileBytes) {
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

  public MultiReplaceStringRequest inputFileUrl(String inputFileUrl) {
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

  public MultiReplaceStringRequest replaceStrings(List<SingleReplaceString> replaceStrings) {
    this.replaceStrings = replaceStrings;
    return this;
  }

  public MultiReplaceStringRequest addReplaceStringsItem(SingleReplaceString replaceStringsItem) {
    if (this.replaceStrings == null) {
      this.replaceStrings = new ArrayList<SingleReplaceString>();
    }
    this.replaceStrings.add(replaceStringsItem);
    return this;
  }

   /**
   * An array of individual string replacement requests
   * @return replaceStrings
  **/
  @ApiModelProperty(value = "An array of individual string replacement requests")
  public List<SingleReplaceString> getReplaceStrings() {
    return replaceStrings;
  }

  public void setReplaceStrings(List<SingleReplaceString> replaceStrings) {
    this.replaceStrings = replaceStrings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiReplaceStringRequest multiReplaceStringRequest = (MultiReplaceStringRequest) o;
    return Arrays.equals(this.inputFileBytes, multiReplaceStringRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, multiReplaceStringRequest.inputFileUrl) &&
        Objects.equals(this.replaceStrings, multiReplaceStringRequest.replaceStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, replaceStrings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiReplaceStringRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    replaceStrings: ").append(toIndentedString(replaceStrings)).append("\n");
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

