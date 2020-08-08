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
import com.cloudmersive.client.model.PdfDocument;
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
 * Result of performing a PDF file split operation
 */
@ApiModel(description = "Result of performing a PDF file split operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T11:59:25.010-07:00")
public class SplitPdfResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Documents")
  private List<PdfDocument> documents = null;

  public SplitPdfResult successful(Boolean successful) {
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

  public SplitPdfResult documents(List<PdfDocument> documents) {
    this.documents = documents;
    return this;
  }

  public SplitPdfResult addDocumentsItem(PdfDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<PdfDocument>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * PDF documents as output
   * @return documents
  **/
  @ApiModelProperty(value = "PDF documents as output")
  public List<PdfDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<PdfDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitPdfResult splitPdfResult = (SplitPdfResult) o;
    return Objects.equals(this.successful, splitPdfResult.successful) &&
        Objects.equals(this.documents, splitPdfResult.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitPdfResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

