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
 * Output of a language translation operation
 */
@ApiModel(description = "Output of a language translation operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-04T20:56:46.021-07:00")
public class LanguageTranslationResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("TranslatedTextResult")
  private String translatedTextResult = null;

  @SerializedName("SentenceCount")
  private Integer sentenceCount = null;

  public LanguageTranslationResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the language detection operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the language detection operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public LanguageTranslationResponse translatedTextResult(String translatedTextResult) {
    this.translatedTextResult = translatedTextResult;
    return this;
  }

   /**
   * Translated text in target language
   * @return translatedTextResult
  **/
  @ApiModelProperty(value = "Translated text in target language")
  public String getTranslatedTextResult() {
    return translatedTextResult;
  }

  public void setTranslatedTextResult(String translatedTextResult) {
    this.translatedTextResult = translatedTextResult;
  }

  public LanguageTranslationResponse sentenceCount(Integer sentenceCount) {
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
    LanguageTranslationResponse languageTranslationResponse = (LanguageTranslationResponse) o;
    return Objects.equals(this.successful, languageTranslationResponse.successful) &&
        Objects.equals(this.translatedTextResult, languageTranslationResponse.translatedTextResult) &&
        Objects.equals(this.sentenceCount, languageTranslationResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, translatedTextResult, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageTranslationResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    translatedTextResult: ").append(toIndentedString(translatedTextResult)).append("\n");
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

