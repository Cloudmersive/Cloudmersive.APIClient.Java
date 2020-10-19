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
 * Result of detecting text encoding
 */
@ApiModel(description = "Result of detecting text encoding")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-18T17:04:54.531-07:00")
public class TextEncodingDetectResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("TextEncoding")
  private String textEncoding = null;

  public TextEncodingDetectResponse successful(Boolean successful) {
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

  public TextEncodingDetectResponse textEncoding(String textEncoding) {
    this.textEncoding = textEncoding;
    return this;
  }

   /**
   * Text encoding used in file; possible values are ASCII, UTF7, UTF8, UTF16, BigEndianUnicode and UTF32
   * @return textEncoding
  **/
  @ApiModelProperty(value = "Text encoding used in file; possible values are ASCII, UTF7, UTF8, UTF16, BigEndianUnicode and UTF32")
  public String getTextEncoding() {
    return textEncoding;
  }

  public void setTextEncoding(String textEncoding) {
    this.textEncoding = textEncoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextEncodingDetectResponse textEncodingDetectResponse = (TextEncodingDetectResponse) o;
    return Objects.equals(this.successful, textEncodingDetectResponse.successful) &&
        Objects.equals(this.textEncoding, textEncodingDetectResponse.textEncoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textEncoding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextEncodingDetectResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textEncoding: ").append(toIndentedString(textEncoding)).append("\n");
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

