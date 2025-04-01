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
 * One point in a polygon
 */
@ApiModel(description = "One point in a polygon")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:07:43.028-07:00")
public class PolygonPoint {
  @SerializedName("X")
  private Double X = null;

  @SerializedName("Y")
  private Double Y = null;

  public PolygonPoint X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * X location in pixels of this point in the polygon
   * @return X
  **/
  @ApiModelProperty(value = "X location in pixels of this point in the polygon")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public PolygonPoint Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Y location in pixels of this point in the polygon
   * @return Y
  **/
  @ApiModelProperty(value = "Y location in pixels of this point in the polygon")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
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
    PolygonPoint polygonPoint = (PolygonPoint) o;
    return Objects.equals(this.X, polygonPoint.X) &&
        Objects.equals(this.Y, polygonPoint.Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolygonPoint {\n");
    
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

