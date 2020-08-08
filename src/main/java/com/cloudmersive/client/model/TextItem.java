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
 * Individual instance of text occuring in an image; one piece of text
 */
@ApiModel(description = "Individual instance of text occuring in an image; one piece of text")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T11:59:19.842-07:00")
public class TextItem {
  @SerializedName("LeftX")
  private Integer leftX = null;

  @SerializedName("TopY")
  private Integer topY = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  public TextItem leftX(Integer leftX) {
    this.leftX = leftX;
    return this;
  }

   /**
   * Left X coordinate of the text location; 0 represents the left edge of the input image
   * @return leftX
  **/
  @ApiModelProperty(value = "Left X coordinate of the text location; 0 represents the left edge of the input image")
  public Integer getLeftX() {
    return leftX;
  }

  public void setLeftX(Integer leftX) {
    this.leftX = leftX;
  }

  public TextItem topY(Integer topY) {
    this.topY = topY;
    return this;
  }

   /**
   * Top Y coordinate of the text location; 0 represents the top edge of the input image
   * @return topY
  **/
  @ApiModelProperty(value = "Top Y coordinate of the text location; 0 represents the top edge of the input image")
  public Integer getTopY() {
    return topY;
  }

  public void setTopY(Integer topY) {
    this.topY = topY;
  }

  public TextItem width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the text item
   * @return width
  **/
  @ApiModelProperty(value = "Width in pixels of the text item")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public TextItem height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the text item
   * @return height
  **/
  @ApiModelProperty(value = "Height in pixels of the text item")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextItem textItem = (TextItem) o;
    return Objects.equals(this.leftX, textItem.leftX) &&
        Objects.equals(this.topY, textItem.topY) &&
        Objects.equals(this.width, textItem.width) &&
        Objects.equals(this.height, textItem.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftX, topY, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextItem {\n");
    
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

