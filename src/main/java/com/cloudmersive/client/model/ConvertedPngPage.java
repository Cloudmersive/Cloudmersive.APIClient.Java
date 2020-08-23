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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A single converted page
 */
@ApiModel(description = "A single converted page")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-22T21:42:12.227-07:00")
public class ConvertedPngPage {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("URL")
  private String URL = null;

  public ConvertedPngPage pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the converted page, starting with 1
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number of the converted page, starting with 1")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ConvertedPngPage URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * URL to the PNG file of this page; file is stored in an in-memory cache and will be deleted
   * @return URL
  **/
  @ApiModelProperty(value = "URL to the PNG file of this page; file is stored in an in-memory cache and will be deleted")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedPngPage convertedPngPage = (ConvertedPngPage) o;
    return Objects.equals(this.pageNumber, convertedPngPage.pageNumber) &&
        Objects.equals(this.URL, convertedPngPage.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, URL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedPngPage {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

