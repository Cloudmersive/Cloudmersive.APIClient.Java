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
 * Result of performing an image hash operation
 */
@ApiModel(description = "Result of performing an image hash operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T12:57:40.311-07:00")
public class ImageSimilarityHashResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ImageHash")
  private String imageHash = null;

  public ImageSimilarityHashResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ImageSimilarityHashResponse imageHash(String imageHash) {
    this.imageHash = imageHash;
    return this;
  }

   /**
   * String representing image perceptual hash value; values with smaller Hamming Distances are more similar than ones with large Hamming Distances
   * @return imageHash
  **/
  @ApiModelProperty(value = "String representing image perceptual hash value; values with smaller Hamming Distances are more similar than ones with large Hamming Distances")
  public String getImageHash() {
    return imageHash;
  }

  public void setImageHash(String imageHash) {
    this.imageHash = imageHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSimilarityHashResponse imageSimilarityHashResponse = (ImageSimilarityHashResponse) o;
    return Objects.equals(this.successful, imageSimilarityHashResponse.successful) &&
        Objects.equals(this.imageHash, imageSimilarityHashResponse.imageHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, imageHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSimilarityHashResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    imageHash: ").append(toIndentedString(imageHash)).append("\n");
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

