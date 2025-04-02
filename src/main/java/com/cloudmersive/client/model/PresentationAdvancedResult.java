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
 * A single PowerPoint PPTX file corresponding to one worksheet (tab) in the original spreadsheet
 */
@ApiModel(description = "A single PowerPoint PPTX file corresponding to one worksheet (tab) in the original spreadsheet")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T18:43:26.726-07:00")
public class PresentationAdvancedResult {
  @SerializedName("SlideNumber")
  private Integer slideNumber = null;

  @SerializedName("PresentationContents")
  private byte[] presentationContents = null;

  public PresentationAdvancedResult slideNumber(Integer slideNumber) {
    this.slideNumber = slideNumber;
    return this;
  }

   /**
   * Presentation number of the converted page, starting with 1 for the left-most worksheet
   * @return slideNumber
  **/
  @ApiModelProperty(value = "Presentation number of the converted page, starting with 1 for the left-most worksheet")
  public Integer getSlideNumber() {
    return slideNumber;
  }

  public void setSlideNumber(Integer slideNumber) {
    this.slideNumber = slideNumber;
  }

  public PresentationAdvancedResult presentationContents(byte[] presentationContents) {
    this.presentationContents = presentationContents;
    return this;
  }

   /**
   * Contents of the presentation in bytes
   * @return presentationContents
  **/
  @ApiModelProperty(value = "Contents of the presentation in bytes")
  public byte[] getPresentationContents() {
    return presentationContents;
  }

  public void setPresentationContents(byte[] presentationContents) {
    this.presentationContents = presentationContents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationAdvancedResult presentationAdvancedResult = (PresentationAdvancedResult) o;
    return Objects.equals(this.slideNumber, presentationAdvancedResult.slideNumber) &&
        Arrays.equals(this.presentationContents, presentationAdvancedResult.presentationContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slideNumber, Arrays.hashCode(presentationContents));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationAdvancedResult {\n");
    
    sb.append("    slideNumber: ").append(toIndentedString(slideNumber)).append("\n");
    sb.append("    presentationContents: ").append(toIndentedString(presentationContents)).append("\n");
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

