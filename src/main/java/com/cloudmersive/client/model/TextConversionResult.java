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
 * Text conversion result from converting a document to Plain Text (TXT) format
 */
@ApiModel(description = "Text conversion result from converting a document to Plain Text (TXT) format")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:26:45.391-07:00")
public class TextConversionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("TextResult")
  private String textResult = null;

  public TextConversionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public TextConversionResult textResult(String textResult) {
    this.textResult = textResult;
    return this;
  }

   /**
   * Plain Text (TXT) format conversion result of the input document.  The text result is returned as a string.
   * @return textResult
  **/
  @ApiModelProperty(value = "Plain Text (TXT) format conversion result of the input document.  The text result is returned as a string.")
  public String getTextResult() {
    return textResult;
  }

  public void setTextResult(String textResult) {
    this.textResult = textResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextConversionResult textConversionResult = (TextConversionResult) o;
    return Objects.equals(this.successful, textConversionResult.successful) &&
        Objects.equals(this.textResult, textConversionResult.textResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextConversionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textResult: ").append(toIndentedString(textResult)).append("\n");
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

