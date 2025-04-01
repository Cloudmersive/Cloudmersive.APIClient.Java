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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:59:44.565-07:00")
public class LanguageTranslationRequest {
  @SerializedName("TextToTranslate")
  private String textToTranslate = null;

  public LanguageTranslationRequest textToTranslate(String textToTranslate) {
    this.textToTranslate = textToTranslate;
    return this;
  }

   /**
   * Text to translate
   * @return textToTranslate
  **/
  @ApiModelProperty(value = "Text to translate")
  public String getTextToTranslate() {
    return textToTranslate;
  }

  public void setTextToTranslate(String textToTranslate) {
    this.textToTranslate = textToTranslate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageTranslationRequest languageTranslationRequest = (LanguageTranslationRequest) o;
    return Objects.equals(this.textToTranslate, languageTranslationRequest.textToTranslate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textToTranslate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageTranslationRequest {\n");
    
    sb.append("    textToTranslate: ").append(toIndentedString(textToTranslate)).append("\n");
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

