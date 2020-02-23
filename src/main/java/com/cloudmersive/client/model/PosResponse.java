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
import com.cloudmersive.client.model.PosSentence;
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
 * Part of speech tag result
 */
@ApiModel(description = "Part of speech tag result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-22T17:07:13.629-08:00")
public class PosResponse {
  @SerializedName("TaggedSentences")
  private List<PosSentence> taggedSentences = null;

  public PosResponse taggedSentences(List<PosSentence> taggedSentences) {
    this.taggedSentences = taggedSentences;
    return this;
  }

  public PosResponse addTaggedSentencesItem(PosSentence taggedSentencesItem) {
    if (this.taggedSentences == null) {
      this.taggedSentences = new ArrayList<PosSentence>();
    }
    this.taggedSentences.add(taggedSentencesItem);
    return this;
  }

   /**
   * Sentences in the string
   * @return taggedSentences
  **/
  @ApiModelProperty(value = "Sentences in the string")
  public List<PosSentence> getTaggedSentences() {
    return taggedSentences;
  }

  public void setTaggedSentences(List<PosSentence> taggedSentences) {
    this.taggedSentences = taggedSentences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosResponse posResponse = (PosResponse) o;
    return Objects.equals(this.taggedSentences, posResponse.taggedSentences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taggedSentences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosResponse {\n");
    
    sb.append("    taggedSentences: ").append(toIndentedString(taggedSentences)).append("\n");
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

