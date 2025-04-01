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
 * Input to a language translation operation
 */
@ApiModel(description = "Input to a language translation operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-31T23:40:59.287-07:00")
public class LanguageHtmlTranslationRequest {
  @SerializedName("HtmlStringToTranslate")
  private String htmlStringToTranslate = null;

  @SerializedName("HtmlUrlToTranslate")
  private String htmlUrlToTranslate = null;

  @SerializedName("InputLanguageCode")
  private String inputLanguageCode = null;

  @SerializedName("OutputLanguageCode")
  private String outputLanguageCode = null;

  public LanguageHtmlTranslationRequest htmlStringToTranslate(String htmlStringToTranslate) {
    this.htmlStringToTranslate = htmlStringToTranslate;
    return this;
  }

   /**
   * Text to translate
   * @return htmlStringToTranslate
  **/
  @ApiModelProperty(value = "Text to translate")
  public String getHtmlStringToTranslate() {
    return htmlStringToTranslate;
  }

  public void setHtmlStringToTranslate(String htmlStringToTranslate) {
    this.htmlStringToTranslate = htmlStringToTranslate;
  }

  public LanguageHtmlTranslationRequest htmlUrlToTranslate(String htmlUrlToTranslate) {
    this.htmlUrlToTranslate = htmlUrlToTranslate;
    return this;
  }

   /**
   * Get htmlUrlToTranslate
   * @return htmlUrlToTranslate
  **/
  @ApiModelProperty(value = "")
  public String getHtmlUrlToTranslate() {
    return htmlUrlToTranslate;
  }

  public void setHtmlUrlToTranslate(String htmlUrlToTranslate) {
    this.htmlUrlToTranslate = htmlUrlToTranslate;
  }

  public LanguageHtmlTranslationRequest inputLanguageCode(String inputLanguageCode) {
    this.inputLanguageCode = inputLanguageCode;
    return this;
  }

   /**
   * Get inputLanguageCode
   * @return inputLanguageCode
  **/
  @ApiModelProperty(value = "")
  public String getInputLanguageCode() {
    return inputLanguageCode;
  }

  public void setInputLanguageCode(String inputLanguageCode) {
    this.inputLanguageCode = inputLanguageCode;
  }

  public LanguageHtmlTranslationRequest outputLanguageCode(String outputLanguageCode) {
    this.outputLanguageCode = outputLanguageCode;
    return this;
  }

   /**
   * Get outputLanguageCode
   * @return outputLanguageCode
  **/
  @ApiModelProperty(value = "")
  public String getOutputLanguageCode() {
    return outputLanguageCode;
  }

  public void setOutputLanguageCode(String outputLanguageCode) {
    this.outputLanguageCode = outputLanguageCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageHtmlTranslationRequest languageHtmlTranslationRequest = (LanguageHtmlTranslationRequest) o;
    return Objects.equals(this.htmlStringToTranslate, languageHtmlTranslationRequest.htmlStringToTranslate) &&
        Objects.equals(this.htmlUrlToTranslate, languageHtmlTranslationRequest.htmlUrlToTranslate) &&
        Objects.equals(this.inputLanguageCode, languageHtmlTranslationRequest.inputLanguageCode) &&
        Objects.equals(this.outputLanguageCode, languageHtmlTranslationRequest.outputLanguageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlStringToTranslate, htmlUrlToTranslate, inputLanguageCode, outputLanguageCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageHtmlTranslationRequest {\n");
    
    sb.append("    htmlStringToTranslate: ").append(toIndentedString(htmlStringToTranslate)).append("\n");
    sb.append("    htmlUrlToTranslate: ").append(toIndentedString(htmlUrlToTranslate)).append("\n");
    sb.append("    inputLanguageCode: ").append(toIndentedString(inputLanguageCode)).append("\n");
    sb.append("    outputLanguageCode: ").append(toIndentedString(outputLanguageCode)).append("\n");
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

