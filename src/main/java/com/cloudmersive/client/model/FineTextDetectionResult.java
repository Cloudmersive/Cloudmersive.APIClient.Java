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
import com.cloudmersive.client.model.FineTextItem;
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
 * Result of an operation to detect text in a photo
 */
@ApiModel(description = "Result of an operation to detect text in a photo")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-18T17:04:46.181-07:00")
public class FineTextDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("TextItems")
  private List<FineTextItem> textItems = null;

  @SerializedName("TextItemsCount")
  private Integer textItemsCount = null;

  public FineTextDetectionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FineTextDetectionResult textItems(List<FineTextItem> textItems) {
    this.textItems = textItems;
    return this;
  }

  public FineTextDetectionResult addTextItemsItem(FineTextItem textItemsItem) {
    if (this.textItems == null) {
      this.textItems = new ArrayList<FineTextItem>();
    }
    this.textItems.add(textItemsItem);
    return this;
  }

   /**
   * Text items found in the input image
   * @return textItems
  **/
  @ApiModelProperty(value = "Text items found in the input image")
  public List<FineTextItem> getTextItems() {
    return textItems;
  }

  public void setTextItems(List<FineTextItem> textItems) {
    this.textItems = textItems;
  }

  public FineTextDetectionResult textItemsCount(Integer textItemsCount) {
    this.textItemsCount = textItemsCount;
    return this;
  }

   /**
   * Count of text items found in the input image
   * @return textItemsCount
  **/
  @ApiModelProperty(value = "Count of text items found in the input image")
  public Integer getTextItemsCount() {
    return textItemsCount;
  }

  public void setTextItemsCount(Integer textItemsCount) {
    this.textItemsCount = textItemsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTextDetectionResult fineTextDetectionResult = (FineTextDetectionResult) o;
    return Objects.equals(this.successful, fineTextDetectionResult.successful) &&
        Objects.equals(this.textItems, fineTextDetectionResult.textItems) &&
        Objects.equals(this.textItemsCount, fineTextDetectionResult.textItemsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textItems, textItemsCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTextDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textItems: ").append(toIndentedString(textItems)).append("\n");
    sb.append("    textItemsCount: ").append(toIndentedString(textItemsCount)).append("\n");
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

