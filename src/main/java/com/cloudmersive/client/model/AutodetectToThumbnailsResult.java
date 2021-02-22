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
import com.cloudmersive.client.model.Thumbnail;
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
 * Result of converting an entire document to an array of PNG thumbnails
 */
@ApiModel(description = "Result of converting an entire document to an array of PNG thumbnails")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-21T16:14:43.897-08:00")
public class AutodetectToThumbnailsResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ThumbnailPages")
  private List<Thumbnail> thumbnailPages = null;

  public AutodetectToThumbnailsResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Index of this thumbnail
   * @return successful
  **/
  @ApiModelProperty(value = "Index of this thumbnail")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public AutodetectToThumbnailsResult thumbnailPages(List<Thumbnail> thumbnailPages) {
    this.thumbnailPages = thumbnailPages;
    return this;
  }

  public AutodetectToThumbnailsResult addThumbnailPagesItem(Thumbnail thumbnailPagesItem) {
    if (this.thumbnailPages == null) {
      this.thumbnailPages = new ArrayList<Thumbnail>();
    }
    this.thumbnailPages.add(thumbnailPagesItem);
    return this;
  }

   /**
   * A PNG thumbnail of the document page
   * @return thumbnailPages
  **/
  @ApiModelProperty(value = "A PNG thumbnail of the document page")
  public List<Thumbnail> getThumbnailPages() {
    return thumbnailPages;
  }

  public void setThumbnailPages(List<Thumbnail> thumbnailPages) {
    this.thumbnailPages = thumbnailPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutodetectToThumbnailsResult autodetectToThumbnailsResult = (AutodetectToThumbnailsResult) o;
    return Objects.equals(this.successful, autodetectToThumbnailsResult.successful) &&
        Objects.equals(this.thumbnailPages, autodetectToThumbnailsResult.thumbnailPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, thumbnailPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutodetectToThumbnailsResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    thumbnailPages: ").append(toIndentedString(thumbnailPages)).append("\n");
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

