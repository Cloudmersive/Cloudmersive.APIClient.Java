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
 * Result of linguistic parse operation
 */
@ApiModel(description = "Result of linguistic parse operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-05T18:20:10.408-07:00")
public class ParseResponse {
  @SerializedName("ParseTree")
  private String parseTree = null;

  public ParseResponse parseTree(String parseTree) {
    this.parseTree = parseTree;
    return this;
  }

   /**
   * Parse tree in Penn Treebank syntax tree format
   * @return parseTree
  **/
  @ApiModelProperty(value = "Parse tree in Penn Treebank syntax tree format")
  public String getParseTree() {
    return parseTree;
  }

  public void setParseTree(String parseTree) {
    this.parseTree = parseTree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseResponse parseResponse = (ParseResponse) o;
    return Objects.equals(this.parseTree, parseResponse.parseTree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parseTree);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseResponse {\n");
    
    sb.append("    parseTree: ").append(toIndentedString(parseTree)).append("\n");
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

