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
import com.cloudmersive.client.model.OcrPageResultWithWordsWithLocation;
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
 * Response from an OCR to words with location operation.  Includes the confience rating and converted text result, along with the locations of the words in the pages.
 */
@ApiModel(description = "Response from an OCR to words with location operation.  Includes the confience rating and converted text result, along with the locations of the words in the pages.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T20:36:27.762-08:00")
public class PdfToWordsWithLocationResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("OcrPages")
  private List<OcrPageResultWithWordsWithLocation> ocrPages = null;

  public PdfToWordsWithLocationResult successful(Boolean successful) {
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

  public PdfToWordsWithLocationResult ocrPages(List<OcrPageResultWithWordsWithLocation> ocrPages) {
    this.ocrPages = ocrPages;
    return this;
  }

  public PdfToWordsWithLocationResult addOcrPagesItem(OcrPageResultWithWordsWithLocation ocrPagesItem) {
    if (this.ocrPages == null) {
      this.ocrPages = new ArrayList<OcrPageResultWithWordsWithLocation>();
    }
    this.ocrPages.add(ocrPagesItem);
    return this;
  }

   /**
   * OCR page results
   * @return ocrPages
  **/
  @ApiModelProperty(value = "OCR page results")
  public List<OcrPageResultWithWordsWithLocation> getOcrPages() {
    return ocrPages;
  }

  public void setOcrPages(List<OcrPageResultWithWordsWithLocation> ocrPages) {
    this.ocrPages = ocrPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfToWordsWithLocationResult pdfToWordsWithLocationResult = (PdfToWordsWithLocationResult) o;
    return Objects.equals(this.successful, pdfToWordsWithLocationResult.successful) &&
        Objects.equals(this.ocrPages, pdfToWordsWithLocationResult.ocrPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, ocrPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfToWordsWithLocationResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    ocrPages: ").append(toIndentedString(ocrPages)).append("\n");
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

