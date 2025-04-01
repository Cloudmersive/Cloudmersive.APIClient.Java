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
 * Unit of text content in a Word Document (DOCX) file
 */
@ApiModel(description = "Unit of text content in a Word Document (DOCX) file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-31T23:41:06.181-07:00")
public class DocxText {
  @SerializedName("TextIndex")
  private Integer textIndex = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("TextContent")
  private String textContent = null;

  public DocxText textIndex(Integer textIndex) {
    this.textIndex = textIndex;
    return this;
  }

   /**
   * Index of the text content in the run; 0-based
   * @return textIndex
  **/
  @ApiModelProperty(value = "Index of the text content in the run; 0-based")
  public Integer getTextIndex() {
    return textIndex;
  }

  public void setTextIndex(Integer textIndex) {
    this.textIndex = textIndex;
  }

  public DocxText path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this Text object; leave blank for creation
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this Text object; leave blank for creation")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxText textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

   /**
   * Text string containing the text content of this text content item
   * @return textContent
  **/
  @ApiModelProperty(value = "Text string containing the text content of this text content item")
  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxText docxText = (DocxText) o;
    return Objects.equals(this.textIndex, docxText.textIndex) &&
        Objects.equals(this.path, docxText.path) &&
        Objects.equals(this.textContent, docxText.textContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textIndex, path, textContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxText {\n");
    
    sb.append("    textIndex: ").append(toIndentedString(textIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
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

