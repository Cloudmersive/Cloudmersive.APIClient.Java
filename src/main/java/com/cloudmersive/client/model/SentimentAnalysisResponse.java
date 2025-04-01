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
 * Output of a sentiment analysis operation
 */
@ApiModel(description = "Output of a sentiment analysis operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T00:53:47.801-07:00")
public class SentimentAnalysisResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("SentimentClassificationResult")
  private String sentimentClassificationResult = null;

  @SerializedName("SentimentScoreResult")
  private Double sentimentScoreResult = null;

  @SerializedName("SentenceCount")
  private Integer sentenceCount = null;

  public SentimentAnalysisResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the sentiment analysis operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the sentiment analysis operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public SentimentAnalysisResponse sentimentClassificationResult(String sentimentClassificationResult) {
    this.sentimentClassificationResult = sentimentClassificationResult;
    return this;
  }

   /**
   * Classification of input text into a sentiment classification; possible values are \&quot;Positive\&quot;, \&quot;Negative\&quot; or \&quot;Neutral\&quot;
   * @return sentimentClassificationResult
  **/
  @ApiModelProperty(value = "Classification of input text into a sentiment classification; possible values are \"Positive\", \"Negative\" or \"Neutral\"")
  public String getSentimentClassificationResult() {
    return sentimentClassificationResult;
  }

  public void setSentimentClassificationResult(String sentimentClassificationResult) {
    this.sentimentClassificationResult = sentimentClassificationResult;
  }

  public SentimentAnalysisResponse sentimentScoreResult(Double sentimentScoreResult) {
    this.sentimentScoreResult = sentimentScoreResult;
    return this;
  }

   /**
   * Sentiment classification score between -1.0 and +1.0 where scores less than 0 are negative sentiment, scores greater than 0 are positive sentiment and scores close to 0 are neutral.  The greater the value deviates from 0.0 the stronger the sentiment, with +1.0 and -1.0 being maximum positive and negative sentiment, respectively.
   * @return sentimentScoreResult
  **/
  @ApiModelProperty(value = "Sentiment classification score between -1.0 and +1.0 where scores less than 0 are negative sentiment, scores greater than 0 are positive sentiment and scores close to 0 are neutral.  The greater the value deviates from 0.0 the stronger the sentiment, with +1.0 and -1.0 being maximum positive and negative sentiment, respectively.")
  public Double getSentimentScoreResult() {
    return sentimentScoreResult;
  }

  public void setSentimentScoreResult(Double sentimentScoreResult) {
    this.sentimentScoreResult = sentimentScoreResult;
  }

  public SentimentAnalysisResponse sentenceCount(Integer sentenceCount) {
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
    SentimentAnalysisResponse sentimentAnalysisResponse = (SentimentAnalysisResponse) o;
    return Objects.equals(this.successful, sentimentAnalysisResponse.successful) &&
        Objects.equals(this.sentimentClassificationResult, sentimentAnalysisResponse.sentimentClassificationResult) &&
        Objects.equals(this.sentimentScoreResult, sentimentAnalysisResponse.sentimentScoreResult) &&
        Objects.equals(this.sentenceCount, sentimentAnalysisResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, sentimentClassificationResult, sentimentScoreResult, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentAnalysisResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    sentimentClassificationResult: ").append(toIndentedString(sentimentClassificationResult)).append("\n");
    sb.append("    sentimentScoreResult: ").append(toIndentedString(sentimentScoreResult)).append("\n");
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

