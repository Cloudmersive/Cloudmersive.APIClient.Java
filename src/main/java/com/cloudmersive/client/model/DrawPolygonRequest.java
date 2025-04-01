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
import com.cloudmersive.client.model.DrawPolygonInstance;
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
 * Request to draw one or more polygons on a base image
 */
@ApiModel(description = "Request to draw one or more polygons on a base image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:59:50.116-07:00")
public class DrawPolygonRequest {
  @SerializedName("BaseImageBytes")
  private byte[] baseImageBytes = null;

  @SerializedName("BaseImageUrl")
  private String baseImageUrl = null;

  @SerializedName("PolygonsToDraw")
  private List<DrawPolygonInstance> polygonsToDraw = null;

  public DrawPolygonRequest baseImageBytes(byte[] baseImageBytes) {
    this.baseImageBytes = baseImageBytes;
    return this;
  }

   /**
   * Image to draw polygons on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL
   * @return baseImageBytes
  **/
  @ApiModelProperty(value = "Image to draw polygons on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL")
  public byte[] getBaseImageBytes() {
    return baseImageBytes;
  }

  public void setBaseImageBytes(byte[] baseImageBytes) {
    this.baseImageBytes = baseImageBytes;
  }

  public DrawPolygonRequest baseImageUrl(String baseImageUrl) {
    this.baseImageUrl = baseImageUrl;
    return this;
  }

   /**
   * Image to draw polygons on, as an HTTP or HTTPS fully-qualified URL
   * @return baseImageUrl
  **/
  @ApiModelProperty(value = "Image to draw polygons on, as an HTTP or HTTPS fully-qualified URL")
  public String getBaseImageUrl() {
    return baseImageUrl;
  }

  public void setBaseImageUrl(String baseImageUrl) {
    this.baseImageUrl = baseImageUrl;
  }

  public DrawPolygonRequest polygonsToDraw(List<DrawPolygonInstance> polygonsToDraw) {
    this.polygonsToDraw = polygonsToDraw;
    return this;
  }

  public DrawPolygonRequest addPolygonsToDrawItem(DrawPolygonInstance polygonsToDrawItem) {
    if (this.polygonsToDraw == null) {
      this.polygonsToDraw = new ArrayList<DrawPolygonInstance>();
    }
    this.polygonsToDraw.add(polygonsToDrawItem);
    return this;
  }

   /**
   * Polygons to draw on the image.  Polygons are drawn in index order.
   * @return polygonsToDraw
  **/
  @ApiModelProperty(value = "Polygons to draw on the image.  Polygons are drawn in index order.")
  public List<DrawPolygonInstance> getPolygonsToDraw() {
    return polygonsToDraw;
  }

  public void setPolygonsToDraw(List<DrawPolygonInstance> polygonsToDraw) {
    this.polygonsToDraw = polygonsToDraw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawPolygonRequest drawPolygonRequest = (DrawPolygonRequest) o;
    return Arrays.equals(this.baseImageBytes, drawPolygonRequest.baseImageBytes) &&
        Objects.equals(this.baseImageUrl, drawPolygonRequest.baseImageUrl) &&
        Objects.equals(this.polygonsToDraw, drawPolygonRequest.polygonsToDraw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(baseImageBytes), baseImageUrl, polygonsToDraw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawPolygonRequest {\n");
    
    sb.append("    baseImageBytes: ").append(toIndentedString(baseImageBytes)).append("\n");
    sb.append("    baseImageUrl: ").append(toIndentedString(baseImageUrl)).append("\n");
    sb.append("    polygonsToDraw: ").append(toIndentedString(polygonsToDraw)).append("\n");
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

