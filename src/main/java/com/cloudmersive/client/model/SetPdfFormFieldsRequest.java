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
import com.cloudmersive.client.model.SetFormFieldValue;
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
 * Request to set the fields in a PDF form
 */
@ApiModel(description = "Request to set the fields in a PDF form")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T18:30:10.331-07:00")
public class SetPdfFormFieldsRequest {
  @SerializedName("FieldValues")
  private List<SetFormFieldValue> fieldValues = null;

  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  public SetPdfFormFieldsRequest fieldValues(List<SetFormFieldValue> fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

  public SetPdfFormFieldsRequest addFieldValuesItem(SetFormFieldValue fieldValuesItem) {
    if (this.fieldValues == null) {
      this.fieldValues = new ArrayList<SetFormFieldValue>();
    }
    this.fieldValues.add(fieldValuesItem);
    return this;
  }

   /**
   * Field values to set
   * @return fieldValues
  **/
  @ApiModelProperty(value = "Field values to set")
  public List<SetFormFieldValue> getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(List<SetFormFieldValue> fieldValues) {
    this.fieldValues = fieldValues;
  }

  public SetPdfFormFieldsRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Contents of the input file to set the fields on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Contents of the input file to set the fields on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPdfFormFieldsRequest setPdfFormFieldsRequest = (SetPdfFormFieldsRequest) o;
    return Objects.equals(this.fieldValues, setPdfFormFieldsRequest.fieldValues) &&
        Arrays.equals(this.inputFileBytes, setPdfFormFieldsRequest.inputFileBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldValues, Arrays.hashCode(inputFileBytes));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPdfFormFieldsRequest {\n");
    
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
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

