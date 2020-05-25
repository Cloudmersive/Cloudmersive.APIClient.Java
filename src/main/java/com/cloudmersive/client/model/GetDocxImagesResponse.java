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
import com.cloudmersive.client.model.DocxImage;
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
 * Result of running a Get-Images command
 */
@ApiModel(description = "Result of running a Get-Images command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-24T22:07:58.019-07:00")
public class GetDocxImagesResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Images")
  private List<DocxImage> images = null;

  public GetDocxImagesResponse successful(Boolean successful) {
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

  public GetDocxImagesResponse images(List<DocxImage> images) {
    this.images = images;
    return this;
  }

  public GetDocxImagesResponse addImagesItem(DocxImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<DocxImage>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Images in the DOCX document
   * @return images
  **/
  @ApiModelProperty(value = "Images in the DOCX document")
  public List<DocxImage> getImages() {
    return images;
  }

  public void setImages(List<DocxImage> images) {
    this.images = images;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxImagesResponse getDocxImagesResponse = (GetDocxImagesResponse) o;
    return Objects.equals(this.successful, getDocxImagesResponse.successful) &&
        Objects.equals(this.images, getDocxImagesResponse.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, images);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxImagesResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

