/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.model.FieldResult;
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
 * The result of extracting form field values
 */
@ApiModel(description = "The result of extracting form field values")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-11T00:02:34.908-07:00")
public class FormRecognitionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("FieldValueExtractionResult")
  private List<FieldResult> fieldValueExtractionResult = null;

  public FormRecognitionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FormRecognitionResult fieldValueExtractionResult(List<FieldResult> fieldValueExtractionResult) {
    this.fieldValueExtractionResult = fieldValueExtractionResult;
    return this;
  }

  public FormRecognitionResult addFieldValueExtractionResultItem(FieldResult fieldValueExtractionResultItem) {
    if (this.fieldValueExtractionResult == null) {
      this.fieldValueExtractionResult = new ArrayList<FieldResult>();
    }
    this.fieldValueExtractionResult.add(fieldValueExtractionResultItem);
    return this;
  }

   /**
   * Get fieldValueExtractionResult
   * @return fieldValueExtractionResult
  **/
  @ApiModelProperty(value = "")
  public List<FieldResult> getFieldValueExtractionResult() {
    return fieldValueExtractionResult;
  }

  public void setFieldValueExtractionResult(List<FieldResult> fieldValueExtractionResult) {
    this.fieldValueExtractionResult = fieldValueExtractionResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormRecognitionResult formRecognitionResult = (FormRecognitionResult) o;
    return Objects.equals(this.successful, formRecognitionResult.successful) &&
        Objects.equals(this.fieldValueExtractionResult, formRecognitionResult.fieldValueExtractionResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, fieldValueExtractionResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormRecognitionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    fieldValueExtractionResult: ").append(toIndentedString(fieldValueExtractionResult)).append("\n");
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

