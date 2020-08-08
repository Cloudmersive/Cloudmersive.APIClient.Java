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
 * EXIF tag and value
 */
@ApiModel(description = "EXIF tag and value")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T11:59:25.010-07:00")
public class ExifValue {
  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("DataType")
  private String dataType = null;

  @SerializedName("DataValue")
  private String dataValue = null;

  public ExifValue tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag name for the EXIF value
   * @return tag
  **/
  @ApiModelProperty(value = "Tag name for the EXIF value")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ExifValue dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Date type of the EXIF value
   * @return dataType
  **/
  @ApiModelProperty(value = "Date type of the EXIF value")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public ExifValue dataValue(String dataValue) {
    this.dataValue = dataValue;
    return this;
  }

   /**
   * Value, formatted as a string of the EXIF value
   * @return dataValue
  **/
  @ApiModelProperty(value = "Value, formatted as a string of the EXIF value")
  public String getDataValue() {
    return dataValue;
  }

  public void setDataValue(String dataValue) {
    this.dataValue = dataValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExifValue exifValue = (ExifValue) o;
    return Objects.equals(this.tag, exifValue.tag) &&
        Objects.equals(this.dataType, exifValue.dataType) &&
        Objects.equals(this.dataValue, exifValue.dataValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, dataType, dataValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExifValue {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    dataValue: ").append(toIndentedString(dataValue)).append("\n");
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

