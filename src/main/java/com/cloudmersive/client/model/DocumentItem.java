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
 * Object representing one document
 */
@ApiModel(description = "Object representing one document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:09:49.757-07:00")
public class DocumentItem {
  @SerializedName("DocumentFileName")
  private String documentFileName = null;

  @SerializedName("DocumentContent")
  private byte[] documentContent = null;

  public DocumentItem documentFileName(String documentFileName) {
    this.documentFileName = documentFileName;
    return this;
  }

   /**
   * File name of the document
   * @return documentFileName
  **/
  @ApiModelProperty(value = "File name of the document")
  public String getDocumentFileName() {
    return documentFileName;
  }

  public void setDocumentFileName(String documentFileName) {
    this.documentFileName = documentFileName;
  }

  public DocumentItem documentContent(byte[] documentContent) {
    this.documentContent = documentContent;
    return this;
  }

   /**
   * Contents of the document as a binary byte array
   * @return documentContent
  **/
  @ApiModelProperty(value = "Contents of the document as a binary byte array")
  public byte[] getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(byte[] documentContent) {
    this.documentContent = documentContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentItem documentItem = (DocumentItem) o;
    return Objects.equals(this.documentFileName, documentItem.documentFileName) &&
        Arrays.equals(this.documentContent, documentItem.documentContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentFileName, Arrays.hashCode(documentContent));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentItem {\n");
    
    sb.append("    documentFileName: ").append(toIndentedString(documentFileName)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
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

