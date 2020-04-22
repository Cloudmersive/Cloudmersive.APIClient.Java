/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * Request to replace a string in a string
 */
@ApiModel(description = "Request to replace a string in a string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-21T19:53:10.898-07:00")
public class ReplaceStringSimpleRequest {
  @SerializedName("TextContent")
  private String textContent = null;

  @SerializedName("TargetString")
  private String targetString = null;

  @SerializedName("ReplaceWithString")
  private String replaceWithString = null;

  public ReplaceStringSimpleRequest textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

   /**
   * Input text content
   * @return textContent
  **/
  @ApiModelProperty(value = "Input text content")
  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  public ReplaceStringSimpleRequest targetString(String targetString) {
    this.targetString = targetString;
    return this;
  }

   /**
   * Target input string to match and be replaced
   * @return targetString
  **/
  @ApiModelProperty(value = "Target input string to match and be replaced")
  public String getTargetString() {
    return targetString;
  }

  public void setTargetString(String targetString) {
    this.targetString = targetString;
  }

  public ReplaceStringSimpleRequest replaceWithString(String replaceWithString) {
    this.replaceWithString = replaceWithString;
    return this;
  }

   /**
   * Replacement for target string
   * @return replaceWithString
  **/
  @ApiModelProperty(value = "Replacement for target string")
  public String getReplaceWithString() {
    return replaceWithString;
  }

  public void setReplaceWithString(String replaceWithString) {
    this.replaceWithString = replaceWithString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceStringSimpleRequest replaceStringSimpleRequest = (ReplaceStringSimpleRequest) o;
    return Objects.equals(this.textContent, replaceStringSimpleRequest.textContent) &&
        Objects.equals(this.targetString, replaceStringSimpleRequest.targetString) &&
        Objects.equals(this.replaceWithString, replaceStringSimpleRequest.replaceWithString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContent, targetString, replaceWithString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceStringSimpleRequest {\n");
    
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    targetString: ").append(toIndentedString(targetString)).append("\n");
    sb.append("    replaceWithString: ").append(toIndentedString(replaceWithString)).append("\n");
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

