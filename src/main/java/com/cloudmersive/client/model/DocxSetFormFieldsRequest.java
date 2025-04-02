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
import com.cloudmersive.client.model.FillHandlebarFormField;
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
 * Request for DocxSetFormFields operation
 */
@ApiModel(description = "Request for DocxSetFormFields operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T18:43:26.726-07:00")
public class DocxSetFormFieldsRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("HandlebarFieldsToFill")
  private List<FillHandlebarFormField> handlebarFieldsToFill = null;

  public DocxSetFormFieldsRequest inputFileBytes(byte[] inputFileBytes) {
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

  public DocxSetFormFieldsRequest inputFileUrl(String inputFileUrl) {
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

  public DocxSetFormFieldsRequest handlebarFieldsToFill(List<FillHandlebarFormField> handlebarFieldsToFill) {
    this.handlebarFieldsToFill = handlebarFieldsToFill;
    return this;
  }

  public DocxSetFormFieldsRequest addHandlebarFieldsToFillItem(FillHandlebarFormField handlebarFieldsToFillItem) {
    if (this.handlebarFieldsToFill == null) {
      this.handlebarFieldsToFill = new ArrayList<FillHandlebarFormField>();
    }
    this.handlebarFieldsToFill.add(handlebarFieldsToFillItem);
    return this;
  }

   /**
   * Handlebar style form fields to fill in; form field that is handlebar style, such as \&quot;{{FieldName}}\&quot;
   * @return handlebarFieldsToFill
  **/
  @ApiModelProperty(value = "Handlebar style form fields to fill in; form field that is handlebar style, such as \"{{FieldName}}\"")
  public List<FillHandlebarFormField> getHandlebarFieldsToFill() {
    return handlebarFieldsToFill;
  }

  public void setHandlebarFieldsToFill(List<FillHandlebarFormField> handlebarFieldsToFill) {
    this.handlebarFieldsToFill = handlebarFieldsToFill;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxSetFormFieldsRequest docxSetFormFieldsRequest = (DocxSetFormFieldsRequest) o;
    return Arrays.equals(this.inputFileBytes, docxSetFormFieldsRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, docxSetFormFieldsRequest.inputFileUrl) &&
        Objects.equals(this.handlebarFieldsToFill, docxSetFormFieldsRequest.handlebarFieldsToFill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, handlebarFieldsToFill);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxSetFormFieldsRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    handlebarFieldsToFill: ").append(toIndentedString(handlebarFieldsToFill)).append("\n");
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

