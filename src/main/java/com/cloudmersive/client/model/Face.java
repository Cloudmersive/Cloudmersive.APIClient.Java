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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Location of one face in an image
 */
@ApiModel(description = "Location of one face in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-21T10:25:15.078-07:00")
public class Face {
  @SerializedName("LeftX")
  private Integer leftX = null;

  @SerializedName("TopY")
  private Integer topY = null;

  @SerializedName("RightX")
  private Integer rightX = null;

  @SerializedName("BottomY")
  private Integer bottomY = null;

  public Face leftX(Integer leftX) {
    this.leftX = leftX;
    return this;
  }

   /**
   * X coordinate of the left side of the face
   * @return leftX
  **/
  @ApiModelProperty(value = "X coordinate of the left side of the face")
  public Integer getLeftX() {
    return leftX;
  }

  public void setLeftX(Integer leftX) {
    this.leftX = leftX;
  }

  public Face topY(Integer topY) {
    this.topY = topY;
    return this;
  }

   /**
   * Y coordinate of the top side of the face
   * @return topY
  **/
  @ApiModelProperty(value = "Y coordinate of the top side of the face")
  public Integer getTopY() {
    return topY;
  }

  public void setTopY(Integer topY) {
    this.topY = topY;
  }

  public Face rightX(Integer rightX) {
    this.rightX = rightX;
    return this;
  }

   /**
   * X coordinate of the right side of the face
   * @return rightX
  **/
  @ApiModelProperty(value = "X coordinate of the right side of the face")
  public Integer getRightX() {
    return rightX;
  }

  public void setRightX(Integer rightX) {
    this.rightX = rightX;
  }

  public Face bottomY(Integer bottomY) {
    this.bottomY = bottomY;
    return this;
  }

   /**
   * Y coordinate of the bottom side of the face
   * @return bottomY
  **/
  @ApiModelProperty(value = "Y coordinate of the bottom side of the face")
  public Integer getBottomY() {
    return bottomY;
  }

  public void setBottomY(Integer bottomY) {
    this.bottomY = bottomY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Face face = (Face) o;
    return Objects.equals(this.leftX, face.leftX) &&
        Objects.equals(this.topY, face.topY) &&
        Objects.equals(this.rightX, face.rightX) &&
        Objects.equals(this.bottomY, face.bottomY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftX, topY, rightX, bottomY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Face {\n");
    
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    rightX: ").append(toIndentedString(rightX)).append("\n");
    sb.append("    bottomY: ").append(toIndentedString(bottomY)).append("\n");
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

