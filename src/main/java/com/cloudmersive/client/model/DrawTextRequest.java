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
import com.cloudmersive.client.model.DrawTextInstance;
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
 * Request to draw one or more pieces of text onto an image
 */
@ApiModel(description = "Request to draw one or more pieces of text onto an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T11:59:19.842-07:00")
public class DrawTextRequest {
  @SerializedName("BaseImageBytes")
  private byte[] baseImageBytes = null;

  @SerializedName("BaseImageUrl")
  private String baseImageUrl = null;

  @SerializedName("TextToDraw")
  private List<DrawTextInstance> textToDraw = null;

  public DrawTextRequest baseImageBytes(byte[] baseImageBytes) {
    this.baseImageBytes = baseImageBytes;
    return this;
  }

   /**
   * Image to draw text on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL
   * @return baseImageBytes
  **/
  @ApiModelProperty(value = "Image to draw text on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL")
  public byte[] getBaseImageBytes() {
    return baseImageBytes;
  }

  public void setBaseImageBytes(byte[] baseImageBytes) {
    this.baseImageBytes = baseImageBytes;
  }

  public DrawTextRequest baseImageUrl(String baseImageUrl) {
    this.baseImageUrl = baseImageUrl;
    return this;
  }

   /**
   * Image to draw text on, as an HTTP or HTTPS fully-qualified URL
   * @return baseImageUrl
  **/
  @ApiModelProperty(value = "Image to draw text on, as an HTTP or HTTPS fully-qualified URL")
  public String getBaseImageUrl() {
    return baseImageUrl;
  }

  public void setBaseImageUrl(String baseImageUrl) {
    this.baseImageUrl = baseImageUrl;
  }

  public DrawTextRequest textToDraw(List<DrawTextInstance> textToDraw) {
    this.textToDraw = textToDraw;
    return this;
  }

  public DrawTextRequest addTextToDrawItem(DrawTextInstance textToDrawItem) {
    if (this.textToDraw == null) {
      this.textToDraw = new ArrayList<DrawTextInstance>();
    }
    this.textToDraw.add(textToDrawItem);
    return this;
  }

   /**
   * One or more pieces of text to draw onto the image
   * @return textToDraw
  **/
  @ApiModelProperty(value = "One or more pieces of text to draw onto the image")
  public List<DrawTextInstance> getTextToDraw() {
    return textToDraw;
  }

  public void setTextToDraw(List<DrawTextInstance> textToDraw) {
    this.textToDraw = textToDraw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawTextRequest drawTextRequest = (DrawTextRequest) o;
    return Arrays.equals(this.baseImageBytes, drawTextRequest.baseImageBytes) &&
        Objects.equals(this.baseImageUrl, drawTextRequest.baseImageUrl) &&
        Objects.equals(this.textToDraw, drawTextRequest.textToDraw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(baseImageBytes), baseImageUrl, textToDraw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawTextRequest {\n");
    
    sb.append("    baseImageBytes: ").append(toIndentedString(baseImageBytes)).append("\n");
    sb.append("    baseImageUrl: ").append(toIndentedString(baseImageUrl)).append("\n");
    sb.append("    textToDraw: ").append(toIndentedString(textToDraw)).append("\n");
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

