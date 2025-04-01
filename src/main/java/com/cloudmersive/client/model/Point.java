/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
 * Point location in 2D in an image, where 0, 0 represents the top/left corner of the image
 */
@ApiModel(description = "Point location in 2D in an image, where 0, 0 represents the top/left corner of the image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:43:53.147-07:00")
public class Point {
  @SerializedName("X")
  private Integer X = null;

  @SerializedName("Y")
  private Integer Y = null;

  public Point X(Integer X) {
    this.X = X;
    return this;
  }

   /**
   * X location in 2D in the image, where 0 represents the left edge of the image
   * @return X
  **/
  @ApiModelProperty(value = "X location in 2D in the image, where 0 represents the left edge of the image")
  public Integer getX() {
    return X;
  }

  public void setX(Integer X) {
    this.X = X;
  }

  public Point Y(Integer Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Y location in 2D in the image, where 0 represents the top edge of the image
   * @return Y
  **/
  @ApiModelProperty(value = "Y location in 2D in the image, where 0 represents the top edge of the image")
  public Integer getY() {
    return Y;
  }

  public void setY(Integer Y) {
    this.Y = Y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return Objects.equals(this.X, point.X) &&
        Objects.equals(this.Y, point.Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Point {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
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

