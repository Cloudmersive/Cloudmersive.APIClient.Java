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
 * Input to a language detection operation
 */
@ApiModel(description = "Input to a language detection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-18T17:04:22.714-07:00")
public class LanguageDetectionRequest {
  @SerializedName("textToDetect")
  private String textToDetect = null;

  public LanguageDetectionRequest textToDetect(String textToDetect) {
    this.textToDetect = textToDetect;
    return this;
  }

   /**
   * Text to detect the language of
   * @return textToDetect
  **/
  @ApiModelProperty(value = "Text to detect the language of")
  public String getTextToDetect() {
    return textToDetect;
  }

  public void setTextToDetect(String textToDetect) {
    this.textToDetect = textToDetect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageDetectionRequest languageDetectionRequest = (LanguageDetectionRequest) o;
    return Objects.equals(this.textToDetect, languageDetectionRequest.textToDetect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textToDetect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDetectionRequest {\n");
    
    sb.append("    textToDetect: ").append(toIndentedString(textToDetect)).append("\n");
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

