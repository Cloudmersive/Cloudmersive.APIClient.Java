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
import com.cloudmersive.client.model.OcrPhotoTextElement;
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
 * Result of an photo to words-with-location OCR operation
 */
@ApiModel(description = "Result of an photo to words-with-location OCR operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-24T22:07:41.929-07:00")
public class PhotoToWordsWithLocationResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("TextElements")
  private List<OcrPhotoTextElement> textElements = null;

  @SerializedName("DiagnosticImage")
  private byte[] diagnosticImage = null;

  public PhotoToWordsWithLocationResult successful(Boolean successful) {
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

  public PhotoToWordsWithLocationResult textElements(List<OcrPhotoTextElement> textElements) {
    this.textElements = textElements;
    return this;
  }

  public PhotoToWordsWithLocationResult addTextElementsItem(OcrPhotoTextElement textElementsItem) {
    if (this.textElements == null) {
      this.textElements = new ArrayList<OcrPhotoTextElement>();
    }
    this.textElements.add(textElementsItem);
    return this;
  }

   /**
   * Word elements in the image
   * @return textElements
  **/
  @ApiModelProperty(value = "Word elements in the image")
  public List<OcrPhotoTextElement> getTextElements() {
    return textElements;
  }

  public void setTextElements(List<OcrPhotoTextElement> textElements) {
    this.textElements = textElements;
  }

  public PhotoToWordsWithLocationResult diagnosticImage(byte[] diagnosticImage) {
    this.diagnosticImage = diagnosticImage;
    return this;
  }

   /**
   * Typically null.  To analyze OCR performance, enable diagnostic mode by adding the HTTP header \&quot;DiagnosticMode\&quot; with the value \&quot;true\&quot;.  When this is true, a diagnostic image showing the details of the OCR result will be set in PNG format into DiagnosticImage.
   * @return diagnosticImage
  **/
  @ApiModelProperty(value = "Typically null.  To analyze OCR performance, enable diagnostic mode by adding the HTTP header \"DiagnosticMode\" with the value \"true\".  When this is true, a diagnostic image showing the details of the OCR result will be set in PNG format into DiagnosticImage.")
  public byte[] getDiagnosticImage() {
    return diagnosticImage;
  }

  public void setDiagnosticImage(byte[] diagnosticImage) {
    this.diagnosticImage = diagnosticImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotoToWordsWithLocationResult photoToWordsWithLocationResult = (PhotoToWordsWithLocationResult) o;
    return Objects.equals(this.successful, photoToWordsWithLocationResult.successful) &&
        Objects.equals(this.textElements, photoToWordsWithLocationResult.textElements) &&
        Arrays.equals(this.diagnosticImage, photoToWordsWithLocationResult.diagnosticImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textElements, Arrays.hashCode(diagnosticImage));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotoToWordsWithLocationResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textElements: ").append(toIndentedString(textElements)).append("\n");
    sb.append("    diagnosticImage: ").append(toIndentedString(diagnosticImage)).append("\n");
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

