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
import com.cloudmersive.client.model.DocxContentControl;
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
 * Result of running a DocxGetContentControls command
 */
@ApiModel(description = "Result of running a DocxGetContentControls command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:07:45.646-07:00")
public class GetDocxContentControlsResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContentControls")
  private List<DocxContentControl> contentControls = null;

  public GetDocxContentControlsResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public GetDocxContentControlsResponse contentControls(List<DocxContentControl> contentControls) {
    this.contentControls = contentControls;
    return this;
  }

  public GetDocxContentControlsResponse addContentControlsItem(DocxContentControl contentControlsItem) {
    if (this.contentControls == null) {
      this.contentControls = new ArrayList<DocxContentControl>();
    }
    this.contentControls.add(contentControlsItem);
    return this;
  }

   /**
   * Content controls in the DOCX
   * @return contentControls
  **/
  @ApiModelProperty(value = "Content controls in the DOCX")
  public List<DocxContentControl> getContentControls() {
    return contentControls;
  }

  public void setContentControls(List<DocxContentControl> contentControls) {
    this.contentControls = contentControls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxContentControlsResponse getDocxContentControlsResponse = (GetDocxContentControlsResponse) o;
    return Objects.equals(this.successful, getDocxContentControlsResponse.successful) &&
        Objects.equals(this.contentControls, getDocxContentControlsResponse.contentControls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, contentControls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxContentControlsResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    contentControls: ").append(toIndentedString(contentControls)).append("\n");
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

