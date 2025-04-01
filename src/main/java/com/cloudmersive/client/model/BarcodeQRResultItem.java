/*
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
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
 * BarcodeQRResultItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:59:48.313-07:00")
public class BarcodeQRResultItem {
  @SerializedName("RawText")
  private String rawText = null;

  public BarcodeQRResultItem rawText(String rawText) {
    this.rawText = rawText;
    return this;
  }

   /**
   * The barcode text
   * @return rawText
  **/
  @ApiModelProperty(value = "The barcode text")
  public String getRawText() {
    return rawText;
  }

  public void setRawText(String rawText) {
    this.rawText = rawText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeQRResultItem barcodeQRResultItem = (BarcodeQRResultItem) o;
    return Objects.equals(this.rawText, barcodeQRResultItem.rawText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeQRResultItem {\n");
    
    sb.append("    rawText: ").append(toIndentedString(rawText)).append("\n");
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

