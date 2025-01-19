/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * Output of a subjectivity analysis operation
 */
@ApiModel(description = "Output of a subjectivity analysis operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-19T07:33:15.733Z")
public class SubjectivityAnalysisResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("SubjectivityScoreResult")
  private Double subjectivityScoreResult = null;

  @SerializedName("SentenceCount")
  private Integer sentenceCount = null;

  public SubjectivityAnalysisResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the subjectivity analysis operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the subjectivity analysis operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public SubjectivityAnalysisResponse subjectivityScoreResult(Double subjectivityScoreResult) {
    this.subjectivityScoreResult = subjectivityScoreResult;
    return this;
  }

   /**
   * Subjectivity vs. objectivity classification score between 0.0 and 1.0 where scores closer to zero have a high probability of objectivity, while scores close to 1.0 have a high probability of subjectivity.
   * @return subjectivityScoreResult
  **/
  @ApiModelProperty(value = "Subjectivity vs. objectivity classification score between 0.0 and 1.0 where scores closer to zero have a high probability of objectivity, while scores close to 1.0 have a high probability of subjectivity.")
  public Double getSubjectivityScoreResult() {
    return subjectivityScoreResult;
  }

  public void setSubjectivityScoreResult(Double subjectivityScoreResult) {
    this.subjectivityScoreResult = subjectivityScoreResult;
  }

  public SubjectivityAnalysisResponse sentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
    return this;
  }

   /**
   * Number of sentences in input text
   * @return sentenceCount
  **/
  @ApiModelProperty(value = "Number of sentences in input text")
  public Integer getSentenceCount() {
    return sentenceCount;
  }

  public void setSentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectivityAnalysisResponse subjectivityAnalysisResponse = (SubjectivityAnalysisResponse) o;
    return Objects.equals(this.successful, subjectivityAnalysisResponse.successful) &&
        Objects.equals(this.subjectivityScoreResult, subjectivityAnalysisResponse.subjectivityScoreResult) &&
        Objects.equals(this.sentenceCount, subjectivityAnalysisResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, subjectivityScoreResult, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectivityAnalysisResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    subjectivityScoreResult: ").append(toIndentedString(subjectivityScoreResult)).append("\n");
    sb.append("    sentenceCount: ").append(toIndentedString(sentenceCount)).append("\n");
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

