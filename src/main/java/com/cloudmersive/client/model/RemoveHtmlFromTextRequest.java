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
 * Request to remove HTML from a string
 */
@ApiModel(description = "Request to remove HTML from a string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T12:57:43.426-07:00")
public class RemoveHtmlFromTextRequest {
  @SerializedName("TextContainingHtml")
  private String textContainingHtml = null;

  public RemoveHtmlFromTextRequest textContainingHtml(String textContainingHtml) {
    this.textContainingHtml = textContainingHtml;
    return this;
  }

   /**
   * Input text string to remove the HTML from
   * @return textContainingHtml
  **/
  @ApiModelProperty(value = "Input text string to remove the HTML from")
  public String getTextContainingHtml() {
    return textContainingHtml;
  }

  public void setTextContainingHtml(String textContainingHtml) {
    this.textContainingHtml = textContainingHtml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveHtmlFromTextRequest removeHtmlFromTextRequest = (RemoveHtmlFromTextRequest) o;
    return Objects.equals(this.textContainingHtml, removeHtmlFromTextRequest.textContainingHtml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContainingHtml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveHtmlFromTextRequest {\n");
    
    sb.append("    textContainingHtml: ").append(toIndentedString(textContainingHtml)).append("\n");
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

