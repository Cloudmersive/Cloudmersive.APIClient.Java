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
 * Request to compute the similarity between two image hashes
 */
@ApiModel(description = "Request to compute the similarity between two image hashes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:43:56.141-07:00")
public class ImageSimilarityHashDistanceRequest {
  @SerializedName("ImageHash1")
  private String imageHash1 = null;

  @SerializedName("ImageHash2")
  private String imageHash2 = null;

  public ImageSimilarityHashDistanceRequest imageHash1(String imageHash1) {
    this.imageHash1 = imageHash1;
    return this;
  }

   /**
   * Image hash computed using Cloudmersive Image Hashing API
   * @return imageHash1
  **/
  @ApiModelProperty(value = "Image hash computed using Cloudmersive Image Hashing API")
  public String getImageHash1() {
    return imageHash1;
  }

  public void setImageHash1(String imageHash1) {
    this.imageHash1 = imageHash1;
  }

  public ImageSimilarityHashDistanceRequest imageHash2(String imageHash2) {
    this.imageHash2 = imageHash2;
    return this;
  }

   /**
   * Image hash computed using Cloudmersive Image Hashing API
   * @return imageHash2
  **/
  @ApiModelProperty(value = "Image hash computed using Cloudmersive Image Hashing API")
  public String getImageHash2() {
    return imageHash2;
  }

  public void setImageHash2(String imageHash2) {
    this.imageHash2 = imageHash2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSimilarityHashDistanceRequest imageSimilarityHashDistanceRequest = (ImageSimilarityHashDistanceRequest) o;
    return Objects.equals(this.imageHash1, imageSimilarityHashDistanceRequest.imageHash1) &&
        Objects.equals(this.imageHash2, imageSimilarityHashDistanceRequest.imageHash2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageHash1, imageHash2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSimilarityHashDistanceRequest {\n");
    
    sb.append("    imageHash1: ").append(toIndentedString(imageHash1)).append("\n");
    sb.append("    imageHash2: ").append(toIndentedString(imageHash2)).append("\n");
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

