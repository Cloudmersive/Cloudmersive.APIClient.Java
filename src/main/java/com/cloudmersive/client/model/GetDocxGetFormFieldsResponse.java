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
import com.cloudmersive.client.model.HandlebarFormField;
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
 * Result of running a DocxGetFormFields command
 */
@ApiModel(description = "Result of running a DocxGetFormFields command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T13:18:58.216-07:00")
public class GetDocxGetFormFieldsResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContentControls")
  private List<DocxContentControl> contentControls = null;

  @SerializedName("HandlebarFormFields")
  private List<HandlebarFormField> handlebarFormFields = null;

  public GetDocxGetFormFieldsResponse successful(Boolean successful) {
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

  public GetDocxGetFormFieldsResponse contentControls(List<DocxContentControl> contentControls) {
    this.contentControls = contentControls;
    return this;
  }

  public GetDocxGetFormFieldsResponse addContentControlsItem(DocxContentControl contentControlsItem) {
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

  public GetDocxGetFormFieldsResponse handlebarFormFields(List<HandlebarFormField> handlebarFormFields) {
    this.handlebarFormFields = handlebarFormFields;
    return this;
  }

  public GetDocxGetFormFieldsResponse addHandlebarFormFieldsItem(HandlebarFormField handlebarFormFieldsItem) {
    if (this.handlebarFormFields == null) {
      this.handlebarFormFields = new ArrayList<HandlebarFormField>();
    }
    this.handlebarFormFields.add(handlebarFormFieldsItem);
    return this;
  }

   /**
   * Form fields that comply with the Handlebar style, that is they are surrounded by two curly braces on either side such as \&quot;{{FieldName}}\&quot;, in the DOCX
   * @return handlebarFormFields
  **/
  @ApiModelProperty(value = "Form fields that comply with the Handlebar style, that is they are surrounded by two curly braces on either side such as \"{{FieldName}}\", in the DOCX")
  public List<HandlebarFormField> getHandlebarFormFields() {
    return handlebarFormFields;
  }

  public void setHandlebarFormFields(List<HandlebarFormField> handlebarFormFields) {
    this.handlebarFormFields = handlebarFormFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxGetFormFieldsResponse getDocxGetFormFieldsResponse = (GetDocxGetFormFieldsResponse) o;
    return Objects.equals(this.successful, getDocxGetFormFieldsResponse.successful) &&
        Objects.equals(this.contentControls, getDocxGetFormFieldsResponse.contentControls) &&
        Objects.equals(this.handlebarFormFields, getDocxGetFormFieldsResponse.handlebarFormFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, contentControls, handlebarFormFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxGetFormFieldsResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    contentControls: ").append(toIndentedString(contentControls)).append("\n");
    sb.append("    handlebarFormFields: ").append(toIndentedString(handlebarFormFields)).append("\n");
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

