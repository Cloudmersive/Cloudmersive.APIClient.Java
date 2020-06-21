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
 * Input to a text rephrasing operation
 */
@ApiModel(description = "Input to a text rephrasing operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-20T19:46:48.677-07:00")
public class RephraseRequest {
  @SerializedName("TextToTranslate")
  private String textToTranslate = null;

  @SerializedName("TargetRephrasingCount")
  private Integer targetRephrasingCount = null;

  public RephraseRequest textToTranslate(String textToTranslate) {
    this.textToTranslate = textToTranslate;
    return this;
  }

   /**
   * Text to rephrase
   * @return textToTranslate
  **/
  @ApiModelProperty(value = "Text to rephrase")
  public String getTextToTranslate() {
    return textToTranslate;
  }

  public void setTextToTranslate(String textToTranslate) {
    this.textToTranslate = textToTranslate;
  }

  public RephraseRequest targetRephrasingCount(Integer targetRephrasingCount) {
    this.targetRephrasingCount = targetRephrasingCount;
    return this;
  }

   /**
   * The number of rephrasing output options you would like per sentence; possible values are 1 to 10.  Default is 2.
   * @return targetRephrasingCount
  **/
  @ApiModelProperty(value = "The number of rephrasing output options you would like per sentence; possible values are 1 to 10.  Default is 2.")
  public Integer getTargetRephrasingCount() {
    return targetRephrasingCount;
  }

  public void setTargetRephrasingCount(Integer targetRephrasingCount) {
    this.targetRephrasingCount = targetRephrasingCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RephraseRequest rephraseRequest = (RephraseRequest) o;
    return Objects.equals(this.textToTranslate, rephraseRequest.textToTranslate) &&
        Objects.equals(this.targetRephrasingCount, rephraseRequest.targetRephrasingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textToTranslate, targetRephrasingCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RephraseRequest {\n");
    
    sb.append("    textToTranslate: ").append(toIndentedString(textToTranslate)).append("\n");
    sb.append("    targetRephrasingCount: ").append(toIndentedString(targetRephrasingCount)).append("\n");
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

