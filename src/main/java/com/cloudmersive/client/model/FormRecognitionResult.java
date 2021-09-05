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
import java.util.Arrays;
import com.cloudmersive.client.model.FieldResult;
import com.cloudmersive.client.model.TableResult;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-04T20:56:54.178-07:00")
public class FormRecognitionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("FieldValueExtractionResult")
  private List<FieldResult> fieldValueExtractionResult = null;

  @SerializedName("TableValueExtractionResults")
  private List<TableResult> tableValueExtractionResults = null;

  @SerializedName("Diagnostics")
  private List<String> diagnostics = null;

  @SerializedName("BestMatchFormSettingName")
  private String bestMatchFormSettingName = null;

  public FormRecognitionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
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
   * Result of form field OCR data extraction
   * @return fieldValueExtractionResult
  **/
  @ApiModelProperty(value = "Result of form field OCR data extraction")
  public List<FieldResult> getFieldValueExtractionResult() {
    return fieldValueExtractionResult;
  }

  public void setFieldValueExtractionResult(List<FieldResult> fieldValueExtractionResult) {
    this.fieldValueExtractionResult = fieldValueExtractionResult;
  }

  public FormRecognitionResult tableValueExtractionResults(List<TableResult> tableValueExtractionResults) {
    this.tableValueExtractionResults = tableValueExtractionResults;
    return this;
  }

  public FormRecognitionResult addTableValueExtractionResultsItem(TableResult tableValueExtractionResultsItem) {
    if (this.tableValueExtractionResults == null) {
      this.tableValueExtractionResults = new ArrayList<TableResult>();
    }
    this.tableValueExtractionResults.add(tableValueExtractionResultsItem);
    return this;
  }

   /**
   * Result of form table OCR data extraction
   * @return tableValueExtractionResults
  **/
  @ApiModelProperty(value = "Result of form table OCR data extraction")
  public List<TableResult> getTableValueExtractionResults() {
    return tableValueExtractionResults;
  }

  public void setTableValueExtractionResults(List<TableResult> tableValueExtractionResults) {
    this.tableValueExtractionResults = tableValueExtractionResults;
  }

  public FormRecognitionResult diagnostics(List<String> diagnostics) {
    this.diagnostics = diagnostics;
    return this;
  }

  public FormRecognitionResult addDiagnosticsItem(String diagnosticsItem) {
    if (this.diagnostics == null) {
      this.diagnostics = new ArrayList<String>();
    }
    this.diagnostics.add(diagnosticsItem);
    return this;
  }

   /**
   * Diagnostic images - default is null, enable diagnostics&#x3D;true to populate this parameter with one image per field
   * @return diagnostics
  **/
  @ApiModelProperty(value = "Diagnostic images - default is null, enable diagnostics=true to populate this parameter with one image per field")
  public List<String> getDiagnostics() {
    return diagnostics;
  }

  public void setDiagnostics(List<String> diagnostics) {
    this.diagnostics = diagnostics;
  }

  public FormRecognitionResult bestMatchFormSettingName(String bestMatchFormSettingName) {
    this.bestMatchFormSettingName = bestMatchFormSettingName;
    return this;
  }

   /**
   * Optional; populated when using photo/recognize/form/advanced with the Setting Name of the best-matching highest-relevance form
   * @return bestMatchFormSettingName
  **/
  @ApiModelProperty(value = "Optional; populated when using photo/recognize/form/advanced with the Setting Name of the best-matching highest-relevance form")
  public String getBestMatchFormSettingName() {
    return bestMatchFormSettingName;
  }

  public void setBestMatchFormSettingName(String bestMatchFormSettingName) {
    this.bestMatchFormSettingName = bestMatchFormSettingName;
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
        Objects.equals(this.fieldValueExtractionResult, formRecognitionResult.fieldValueExtractionResult) &&
        Objects.equals(this.tableValueExtractionResults, formRecognitionResult.tableValueExtractionResults) &&
        Objects.equals(this.diagnostics, formRecognitionResult.diagnostics) &&
        Objects.equals(this.bestMatchFormSettingName, formRecognitionResult.bestMatchFormSettingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, fieldValueExtractionResult, tableValueExtractionResults, diagnostics, bestMatchFormSettingName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormRecognitionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    fieldValueExtractionResult: ").append(toIndentedString(fieldValueExtractionResult)).append("\n");
    sb.append("    tableValueExtractionResults: ").append(toIndentedString(tableValueExtractionResults)).append("\n");
    sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
    sb.append("    bestMatchFormSettingName: ").append(toIndentedString(bestMatchFormSettingName)).append("\n");
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

