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
 * Output of a profanity analysis operation
 */
@ApiModel(description = "Output of a profanity analysis operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-27T22:17:16.791-07:00")
public class ProfanityAnalysisResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ProfanityScoreResult")
  private Double profanityScoreResult = null;

  @SerializedName("SentenceCount")
  private Integer sentenceCount = null;

  public ProfanityAnalysisResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the profanity detection operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the profanity detection operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ProfanityAnalysisResponse profanityScoreResult(Double profanityScoreResult) {
    this.profanityScoreResult = profanityScoreResult;
    return this;
  }

   /**
   * Profanity classification score between 0.0 and 1.0 where scores closer to zero have a low probability of being profane or contain obscene language, while scores close to 1.0 have a high probability of being profane or containing obscene language.  Values above 0.8 have a very high probability of being profane.
   * @return profanityScoreResult
  **/
  @ApiModelProperty(value = "Profanity classification score between 0.0 and 1.0 where scores closer to zero have a low probability of being profane or contain obscene language, while scores close to 1.0 have a high probability of being profane or containing obscene language.  Values above 0.8 have a very high probability of being profane.")
  public Double getProfanityScoreResult() {
    return profanityScoreResult;
  }

  public void setProfanityScoreResult(Double profanityScoreResult) {
    this.profanityScoreResult = profanityScoreResult;
  }

  public ProfanityAnalysisResponse sentenceCount(Integer sentenceCount) {
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
    ProfanityAnalysisResponse profanityAnalysisResponse = (ProfanityAnalysisResponse) o;
    return Objects.equals(this.successful, profanityAnalysisResponse.successful) &&
        Objects.equals(this.profanityScoreResult, profanityAnalysisResponse.profanityScoreResult) &&
        Objects.equals(this.sentenceCount, profanityAnalysisResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, profanityScoreResult, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfanityAnalysisResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    profanityScoreResult: ").append(toIndentedString(profanityScoreResult)).append("\n");
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

