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
import org.threeten.bp.OffsetDateTime;

/**
 * PDF Annotation details
 */
@ApiModel(description = "PDF Annotation details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-28T18:17:14.856-08:00")
public class PdfAnnotation {
  @SerializedName("Title")
  private String title = null;

  @SerializedName("AnnotationType")
  private String annotationType = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("AnnotationIndex")
  private Integer annotationIndex = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("TextContents")
  private String textContents = null;

  @SerializedName("CreationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("ModifiedDate")
  private OffsetDateTime modifiedDate = null;

  @SerializedName("LeftX")
  private Double leftX = null;

  @SerializedName("TopY")
  private Double topY = null;

  @SerializedName("Width")
  private Double width = null;

  @SerializedName("Height")
  private Double height = null;

  public PdfAnnotation title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the annotation; this is often the author of the annotation in Acrobat-created PDF files
   * @return title
  **/
  @ApiModelProperty(value = "Title of the annotation; this is often the author of the annotation in Acrobat-created PDF files")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PdfAnnotation annotationType(String annotationType) {
    this.annotationType = annotationType;
    return this;
  }

   /**
   * Type of the annotation; possible values are Text
   * @return annotationType
  **/
  @ApiModelProperty(value = "Type of the annotation; possible values are Text")
  public String getAnnotationType() {
    return annotationType;
  }

  public void setAnnotationType(String annotationType) {
    this.annotationType = annotationType;
  }

  public PdfAnnotation pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * The 1-based index of the page containing the annotation
   * @return pageNumber
  **/
  @ApiModelProperty(value = "The 1-based index of the page containing the annotation")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PdfAnnotation annotationIndex(Integer annotationIndex) {
    this.annotationIndex = annotationIndex;
    return this;
  }

   /**
   * The 0-based index of the annotation in the document
   * @return annotationIndex
  **/
  @ApiModelProperty(value = "The 0-based index of the annotation in the document")
  public Integer getAnnotationIndex() {
    return annotationIndex;
  }

  public void setAnnotationIndex(Integer annotationIndex) {
    this.annotationIndex = annotationIndex;
  }

  public PdfAnnotation subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the annotation
   * @return subject
  **/
  @ApiModelProperty(value = "Subject of the annotation")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public PdfAnnotation textContents(String textContents) {
    this.textContents = textContents;
    return this;
  }

   /**
   * Text contents of the annotation
   * @return textContents
  **/
  @ApiModelProperty(value = "Text contents of the annotation")
  public String getTextContents() {
    return textContents;
  }

  public void setTextContents(String textContents) {
    this.textContents = textContents;
  }

  public PdfAnnotation creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Date that the annotation was created
   * @return creationDate
  **/
  @ApiModelProperty(value = "Date that the annotation was created")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PdfAnnotation modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Date that the annotation was last modified
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "Date that the annotation was last modified")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public PdfAnnotation leftX(Double leftX) {
    this.leftX = leftX;
    return this;
  }

   /**
   * Left X coordinate for the location of the annotation
   * @return leftX
  **/
  @ApiModelProperty(value = "Left X coordinate for the location of the annotation")
  public Double getLeftX() {
    return leftX;
  }

  public void setLeftX(Double leftX) {
    this.leftX = leftX;
  }

  public PdfAnnotation topY(Double topY) {
    this.topY = topY;
    return this;
  }

   /**
   * Top Y coordination of the location of the annotation
   * @return topY
  **/
  @ApiModelProperty(value = "Top Y coordination of the location of the annotation")
  public Double getTopY() {
    return topY;
  }

  public void setTopY(Double topY) {
    this.topY = topY;
  }

  public PdfAnnotation width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the annotation
   * @return width
  **/
  @ApiModelProperty(value = "Width of the annotation")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public PdfAnnotation height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the annotation
   * @return height
  **/
  @ApiModelProperty(value = "Height of the annotation")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfAnnotation pdfAnnotation = (PdfAnnotation) o;
    return Objects.equals(this.title, pdfAnnotation.title) &&
        Objects.equals(this.annotationType, pdfAnnotation.annotationType) &&
        Objects.equals(this.pageNumber, pdfAnnotation.pageNumber) &&
        Objects.equals(this.annotationIndex, pdfAnnotation.annotationIndex) &&
        Objects.equals(this.subject, pdfAnnotation.subject) &&
        Objects.equals(this.textContents, pdfAnnotation.textContents) &&
        Objects.equals(this.creationDate, pdfAnnotation.creationDate) &&
        Objects.equals(this.modifiedDate, pdfAnnotation.modifiedDate) &&
        Objects.equals(this.leftX, pdfAnnotation.leftX) &&
        Objects.equals(this.topY, pdfAnnotation.topY) &&
        Objects.equals(this.width, pdfAnnotation.width) &&
        Objects.equals(this.height, pdfAnnotation.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, annotationType, pageNumber, annotationIndex, subject, textContents, creationDate, modifiedDate, leftX, topY, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfAnnotation {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    annotationType: ").append(toIndentedString(annotationType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    annotationIndex: ").append(toIndentedString(annotationIndex)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textContents: ").append(toIndentedString(textContents)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
