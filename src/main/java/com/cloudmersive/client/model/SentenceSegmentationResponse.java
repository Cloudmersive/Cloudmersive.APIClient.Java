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
import java.util.ArrayList;
import java.util.List;

/**
 * SentenceSegmentationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-20T19:46:48.677-07:00")
public class SentenceSegmentationResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Sentences")
  private List<String> sentences = null;

  @SerializedName("SentenceCount")
  private Integer sentenceCount = null;

  public SentenceSegmentationResponse successful(Boolean successful) {
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

  public SentenceSegmentationResponse sentences(List<String> sentences) {
    this.sentences = sentences;
    return this;
  }

  public SentenceSegmentationResponse addSentencesItem(String sentencesItem) {
    if (this.sentences == null) {
      this.sentences = new ArrayList<String>();
    }
    this.sentences.add(sentencesItem);
    return this;
  }

   /**
   * Get sentences
   * @return sentences
  **/
  @ApiModelProperty(value = "")
  public List<String> getSentences() {
    return sentences;
  }

  public void setSentences(List<String> sentences) {
    this.sentences = sentences;
  }

  public SentenceSegmentationResponse sentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
    return this;
  }

   /**
   * Get sentenceCount
   * @return sentenceCount
  **/
  @ApiModelProperty(value = "")
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
    SentenceSegmentationResponse sentenceSegmentationResponse = (SentenceSegmentationResponse) o;
    return Objects.equals(this.successful, sentenceSegmentationResponse.successful) &&
        Objects.equals(this.sentences, sentenceSegmentationResponse.sentences) &&
        Objects.equals(this.sentenceCount, sentenceSegmentationResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, sentences, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentenceSegmentationResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
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

