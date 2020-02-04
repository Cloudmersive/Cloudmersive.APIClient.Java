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
import com.cloudmersive.client.model.PosTaggedWord;
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
 * Sentence in a POS tag result
 */
@ApiModel(description = "Sentence in a POS tag result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T20:36:22.684-08:00")
public class PosSentence {
  @SerializedName("Words")
  private List<PosTaggedWord> words = null;

  public PosSentence words(List<PosTaggedWord> words) {
    this.words = words;
    return this;
  }

  public PosSentence addWordsItem(PosTaggedWord wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<PosTaggedWord>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Words in the sentence
   * @return words
  **/
  @ApiModelProperty(value = "Words in the sentence")
  public List<PosTaggedWord> getWords() {
    return words;
  }

  public void setWords(List<PosTaggedWord> words) {
    this.words = words;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosSentence posSentence = (PosSentence) o;
    return Objects.equals(this.words, posSentence.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(words);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosSentence {\n");
    
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

