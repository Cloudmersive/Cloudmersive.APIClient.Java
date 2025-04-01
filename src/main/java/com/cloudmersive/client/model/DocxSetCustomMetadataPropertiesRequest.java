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
import com.cloudmersive.client.model.DocxMetadataCustomProperty;
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
 * Request to set Word custom metadata properties
 */
@ApiModel(description = "Request to set Word custom metadata properties")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:59:52.360-07:00")
public class DocxSetCustomMetadataPropertiesRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("PropertiesToSet")
  private List<DocxMetadataCustomProperty> propertiesToSet = null;

  public DocxSetCustomMetadataPropertiesRequest inputFileBytes(byte[] inputFileBytes) {
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

  public DocxSetCustomMetadataPropertiesRequest inputFileUrl(String inputFileUrl) {
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

  public DocxSetCustomMetadataPropertiesRequest propertiesToSet(List<DocxMetadataCustomProperty> propertiesToSet) {
    this.propertiesToSet = propertiesToSet;
    return this;
  }

  public DocxSetCustomMetadataPropertiesRequest addPropertiesToSetItem(DocxMetadataCustomProperty propertiesToSetItem) {
    if (this.propertiesToSet == null) {
      this.propertiesToSet = new ArrayList<DocxMetadataCustomProperty>();
    }
    this.propertiesToSet.add(propertiesToSetItem);
    return this;
  }

   /**
   * Required: properties to set in the Word Document; provide one or more property definitions to set - be sure to specify the data type and value, together with the property name
   * @return propertiesToSet
  **/
  @ApiModelProperty(value = "Required: properties to set in the Word Document; provide one or more property definitions to set - be sure to specify the data type and value, together with the property name")
  public List<DocxMetadataCustomProperty> getPropertiesToSet() {
    return propertiesToSet;
  }

  public void setPropertiesToSet(List<DocxMetadataCustomProperty> propertiesToSet) {
    this.propertiesToSet = propertiesToSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxSetCustomMetadataPropertiesRequest docxSetCustomMetadataPropertiesRequest = (DocxSetCustomMetadataPropertiesRequest) o;
    return Arrays.equals(this.inputFileBytes, docxSetCustomMetadataPropertiesRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, docxSetCustomMetadataPropertiesRequest.inputFileUrl) &&
        Objects.equals(this.propertiesToSet, docxSetCustomMetadataPropertiesRequest.propertiesToSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, propertiesToSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxSetCustomMetadataPropertiesRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    propertiesToSet: ").append(toIndentedString(propertiesToSet)).append("\n");
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

