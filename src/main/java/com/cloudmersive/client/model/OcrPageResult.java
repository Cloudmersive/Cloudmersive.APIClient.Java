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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OcrPageResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-26T23:07:25.365-08:00")
public class OcrPageResult {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("MeanConfidenceLevel")
  private Float meanConfidenceLevel = null;

  @SerializedName("TextResult")
  private String textResult = null;

  public OcrPageResult pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public OcrPageResult meanConfidenceLevel(Float meanConfidenceLevel) {
    this.meanConfidenceLevel = meanConfidenceLevel;
    return this;
  }

   /**
   * Confidence level rating of the OCR operation; ratings above 80% are strong.
   * @return meanConfidenceLevel
  **/
  @ApiModelProperty(value = "Confidence level rating of the OCR operation; ratings above 80% are strong.")
  public Float getMeanConfidenceLevel() {
    return meanConfidenceLevel;
  }

  public void setMeanConfidenceLevel(Float meanConfidenceLevel) {
    this.meanConfidenceLevel = meanConfidenceLevel;
  }

  public OcrPageResult textResult(String textResult) {
    this.textResult = textResult;
    return this;
  }

   /**
   * Converted text string from the image input.
   * @return textResult
  **/
  @ApiModelProperty(value = "Converted text string from the image input.")
  public String getTextResult() {
    return textResult;
  }

  public void setTextResult(String textResult) {
    this.textResult = textResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrPageResult ocrPageResult = (OcrPageResult) o;
    return Objects.equals(this.pageNumber, ocrPageResult.pageNumber) &&
        Objects.equals(this.meanConfidenceLevel, ocrPageResult.meanConfidenceLevel) &&
        Objects.equals(this.textResult, ocrPageResult.textResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, meanConfidenceLevel, textResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPageResult {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    meanConfidenceLevel: ").append(toIndentedString(meanConfidenceLevel)).append("\n");
    sb.append("    textResult: ").append(toIndentedString(textResult)).append("\n");
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

