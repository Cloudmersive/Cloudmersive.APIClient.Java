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
 * Cell data to fill in to the DOCX Table
 */
@ApiModel(description = "Cell data to fill in to the DOCX Table")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-19T07:33:36.330Z")
public class DocxTableTableFillTableCell {
  @SerializedName("TargetTag")
  private String targetTag = null;

  @SerializedName("ReplacementValue")
  private String replacementValue = null;

  public DocxTableTableFillTableCell targetTag(String targetTag) {
    this.targetTag = targetTag;
    return this;
  }

   /**
   * Target tag to replace
   * @return targetTag
  **/
  @ApiModelProperty(value = "Target tag to replace")
  public String getTargetTag() {
    return targetTag;
  }

  public void setTargetTag(String targetTag) {
    this.targetTag = targetTag;
  }

  public DocxTableTableFillTableCell replacementValue(String replacementValue) {
    this.replacementValue = replacementValue;
    return this;
  }

   /**
   * Replacement value for the target tag
   * @return replacementValue
  **/
  @ApiModelProperty(value = "Replacement value for the target tag")
  public String getReplacementValue() {
    return replacementValue;
  }

  public void setReplacementValue(String replacementValue) {
    this.replacementValue = replacementValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableTableFillTableCell docxTableTableFillTableCell = (DocxTableTableFillTableCell) o;
    return Objects.equals(this.targetTag, docxTableTableFillTableCell.targetTag) &&
        Objects.equals(this.replacementValue, docxTableTableFillTableCell.replacementValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetTag, replacementValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableTableFillTableCell {\n");
    
    sb.append("    targetTag: ").append(toIndentedString(targetTag)).append("\n");
    sb.append("    replacementValue: ").append(toIndentedString(replacementValue)).append("\n");
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

