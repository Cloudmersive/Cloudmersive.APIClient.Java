/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
 * Definition of a column within a table for OCR data extraction from images
 */
@ApiModel(description = "Definition of a column within a table for OCR data extraction from images")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T12:57:37.318-07:00")
public class FormTableColumnDefinition {
  @SerializedName("ColumnID")
  private String columnID = null;

  @SerializedName("TopAnchor")
  private String topAnchor = null;

  @SerializedName("AnchorMode")
  private String anchorMode = null;

  @SerializedName("DataType")
  private String dataType = null;

  @SerializedName("MinimumCharacterCount")
  private Integer minimumCharacterCount = null;

  @SerializedName("AllowNumericDigits")
  private Boolean allowNumericDigits = null;

  public FormTableColumnDefinition columnID(String columnID) {
    this.columnID = columnID;
    return this;
  }

   /**
   * The identifier of the field; use this to identify which field is being referenced
   * @return columnID
  **/
  @ApiModelProperty(value = "The identifier of the field; use this to identify which field is being referenced")
  public String getColumnID() {
    return columnID;
  }

  public void setColumnID(String columnID) {
    this.columnID = columnID;
  }

  public FormTableColumnDefinition topAnchor(String topAnchor) {
    this.topAnchor = topAnchor;
    return this;
  }

   /**
   * Optional - the top anchor of the column heading
   * @return topAnchor
  **/
  @ApiModelProperty(value = "Optional - the top anchor of the column heading")
  public String getTopAnchor() {
    return topAnchor;
  }

  public void setTopAnchor(String topAnchor) {
    this.topAnchor = topAnchor;
  }

  public FormTableColumnDefinition anchorMode(String anchorMode) {
    this.anchorMode = anchorMode;
    return this;
  }

   /**
   * Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match).  Default is Partial.
   * @return anchorMode
  **/
  @ApiModelProperty(value = "Optional - the matching mode for the anchor.  Possible values are Complete (requires the entire anchor to match) and Partial (allows only part of the anchor to match).  Default is Partial.")
  public String getAnchorMode() {
    return anchorMode;
  }

  public void setAnchorMode(String anchorMode) {
    this.anchorMode = anchorMode;
  }

  public FormTableColumnDefinition dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace)
   * @return dataType
  **/
  @ApiModelProperty(value = "The data type of the field; possible values are INTEGER (Integer value), STRING (Arbitrary string value, spaces are permitted), DATE (Date in a structured format), DECIMAL (Decimal number), ALPHANUMERIC (Continuous alphanumeric string with no spaces), STRINGNOWHITESPACE (A string that contains no whitespace characters), SERIALNUMBER (A serial-number style string that contains letters and numbers, and certain symbols; must contain at least one number), ALPHAONLY (Alphabet characters only, no numbers or symbols or whitespace)")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public FormTableColumnDefinition minimumCharacterCount(Integer minimumCharacterCount) {
    this.minimumCharacterCount = minimumCharacterCount;
    return this;
  }

   /**
   * Optional - the target number of digits in the field; useful for fixed-length fields
   * @return minimumCharacterCount
  **/
  @ApiModelProperty(value = "Optional - the target number of digits in the field; useful for fixed-length fields")
  public Integer getMinimumCharacterCount() {
    return minimumCharacterCount;
  }

  public void setMinimumCharacterCount(Integer minimumCharacterCount) {
    this.minimumCharacterCount = minimumCharacterCount;
  }

  public FormTableColumnDefinition allowNumericDigits(Boolean allowNumericDigits) {
    this.allowNumericDigits = allowNumericDigits;
    return this;
  }

   /**
   * Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits
   * @return allowNumericDigits
  **/
  @ApiModelProperty(value = "Optional - set to false to block values that contain numeric digits, set to true to allow numeric digits")
  public Boolean isAllowNumericDigits() {
    return allowNumericDigits;
  }

  public void setAllowNumericDigits(Boolean allowNumericDigits) {
    this.allowNumericDigits = allowNumericDigits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormTableColumnDefinition formTableColumnDefinition = (FormTableColumnDefinition) o;
    return Objects.equals(this.columnID, formTableColumnDefinition.columnID) &&
        Objects.equals(this.topAnchor, formTableColumnDefinition.topAnchor) &&
        Objects.equals(this.anchorMode, formTableColumnDefinition.anchorMode) &&
        Objects.equals(this.dataType, formTableColumnDefinition.dataType) &&
        Objects.equals(this.minimumCharacterCount, formTableColumnDefinition.minimumCharacterCount) &&
        Objects.equals(this.allowNumericDigits, formTableColumnDefinition.allowNumericDigits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnID, topAnchor, anchorMode, dataType, minimumCharacterCount, allowNumericDigits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormTableColumnDefinition {\n");
    
    sb.append("    columnID: ").append(toIndentedString(columnID)).append("\n");
    sb.append("    topAnchor: ").append(toIndentedString(topAnchor)).append("\n");
    sb.append("    anchorMode: ").append(toIndentedString(anchorMode)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    minimumCharacterCount: ").append(toIndentedString(minimumCharacterCount)).append("\n");
    sb.append("    allowNumericDigits: ").append(toIndentedString(allowNumericDigits)).append("\n");
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

