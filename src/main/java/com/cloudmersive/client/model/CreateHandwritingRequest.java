/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
 * Request to create a PNG of handwriting
 */
@ApiModel(description = "Request to create a PNG of handwriting")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:26:43.293-07:00")
public class CreateHandwritingRequest {
  @SerializedName("TextInput")
  private String textInput = null;

  @SerializedName("TargetWidth")
  private Integer targetWidth = null;

  @SerializedName("StrokeWidth")
  private Integer strokeWidth = null;

  @SerializedName("Color")
  private String color = null;

  public CreateHandwritingRequest textInput(String textInput) {
    this.textInput = textInput;
    return this;
  }

   /**
   * Text to convert to handwriting
   * @return textInput
  **/
  @ApiModelProperty(value = "Text to convert to handwriting")
  public String getTextInput() {
    return textInput;
  }

  public void setTextInput(String textInput) {
    this.textInput = textInput;
  }

  public CreateHandwritingRequest targetWidth(Integer targetWidth) {
    this.targetWidth = targetWidth;
    return this;
  }

   /**
   * Desired width in pixels of the resulting image
   * @return targetWidth
  **/
  @ApiModelProperty(value = "Desired width in pixels of the resulting image")
  public Integer getTargetWidth() {
    return targetWidth;
  }

  public void setTargetWidth(Integer targetWidth) {
    this.targetWidth = targetWidth;
  }

  public CreateHandwritingRequest strokeWidth(Integer strokeWidth) {
    this.strokeWidth = strokeWidth;
    return this;
  }

   /**
   * Optinoal; Width of the text stroke in pixels; default is 2
   * @return strokeWidth
  **/
  @ApiModelProperty(value = "Optinoal; Width of the text stroke in pixels; default is 2")
  public Integer getStrokeWidth() {
    return strokeWidth;
  }

  public void setStrokeWidth(Integer strokeWidth) {
    this.strokeWidth = strokeWidth;
  }

  public CreateHandwritingRequest color(String color) {
    this.color = color;
    return this;
  }

   /**
   * HTML hexadecimal color, or HTML common color name (e.g. &#39;black&#39;, &#39;red&#39;), for the handwriting
   * @return color
  **/
  @ApiModelProperty(value = "HTML hexadecimal color, or HTML common color name (e.g. 'black', 'red'), for the handwriting")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHandwritingRequest createHandwritingRequest = (CreateHandwritingRequest) o;
    return Objects.equals(this.textInput, createHandwritingRequest.textInput) &&
        Objects.equals(this.targetWidth, createHandwritingRequest.targetWidth) &&
        Objects.equals(this.strokeWidth, createHandwritingRequest.strokeWidth) &&
        Objects.equals(this.color, createHandwritingRequest.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textInput, targetWidth, strokeWidth, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHandwritingRequest {\n");
    
    sb.append("    textInput: ").append(toIndentedString(textInput)).append("\n");
    sb.append("    targetWidth: ").append(toIndentedString(targetWidth)).append("\n");
    sb.append("    strokeWidth: ").append(toIndentedString(strokeWidth)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

