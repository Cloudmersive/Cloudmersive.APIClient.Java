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
import com.cloudmersive.client.model.DocxTemplateOperation;
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
 * Word DOCX template application request
 */
@ApiModel(description = "Word DOCX template application request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-22T17:07:42.359-08:00")
public class DocxTemplateApplicationRequest {
  @SerializedName("Operations")
  private List<DocxTemplateOperation> operations = null;

  public DocxTemplateApplicationRequest operations(List<DocxTemplateOperation> operations) {
    this.operations = operations;
    return this;
  }

  public DocxTemplateApplicationRequest addOperationsItem(DocxTemplateOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<DocxTemplateOperation>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Operations to apply to this template
   * @return operations
  **/
  @ApiModelProperty(value = "Operations to apply to this template")
  public List<DocxTemplateOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<DocxTemplateOperation> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTemplateApplicationRequest docxTemplateApplicationRequest = (DocxTemplateApplicationRequest) o;
    return Objects.equals(this.operations, docxTemplateApplicationRequest.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTemplateApplicationRequest {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

