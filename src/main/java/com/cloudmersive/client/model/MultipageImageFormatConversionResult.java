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
import com.cloudmersive.client.model.PageConversionResult;
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
 * Result of converting a multi-page image into individual pages with a different format
 */
@ApiModel(description = "Result of converting a multi-page image into individual pages with a different format")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-26T22:13:44.168-07:00")
public class MultipageImageFormatConversionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("PageCount")
  private Integer pageCount = null;

  @SerializedName("Pages")
  private List<PageConversionResult> pages = null;

  public MultipageImageFormatConversionResult successful(Boolean successful) {
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

  public MultipageImageFormatConversionResult pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of pages in the converted output
   * @return pageCount
  **/
  @ApiModelProperty(value = "The number of pages in the converted output")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public MultipageImageFormatConversionResult pages(List<PageConversionResult> pages) {
    this.pages = pages;
    return this;
  }

  public MultipageImageFormatConversionResult addPagesItem(PageConversionResult pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PageConversionResult>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Converted page results
   * @return pages
  **/
  @ApiModelProperty(value = "Converted page results")
  public List<PageConversionResult> getPages() {
    return pages;
  }

  public void setPages(List<PageConversionResult> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipageImageFormatConversionResult multipageImageFormatConversionResult = (MultipageImageFormatConversionResult) o;
    return Objects.equals(this.successful, multipageImageFormatConversionResult.successful) &&
        Objects.equals(this.pageCount, multipageImageFormatConversionResult.pageCount) &&
        Objects.equals(this.pages, multipageImageFormatConversionResult.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, pageCount, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipageImageFormatConversionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

