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
 * Details of the HTML to PDF request
 */
@ApiModel(description = "Details of the HTML to PDF request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-09T19:28:42.852-07:00")
public class HtmlToPdfRequest {
  @SerializedName("Html")
  private String html = null;

  @SerializedName("ExtraLoadingWait")
  private Integer extraLoadingWait = null;

  @SerializedName("IncludeBackgroundGraphics")
  private Boolean includeBackgroundGraphics = null;

  @SerializedName("ScaleFactor")
  private Integer scaleFactor = null;

  public HtmlToPdfRequest html(String html) {
    this.html = html;
    return this;
  }

   /**
   * HTML to render to PDF
   * @return html
  **/
  @ApiModelProperty(value = "HTML to render to PDF")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public HtmlToPdfRequest extraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
    return this;
  }

   /**
   * Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites. Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 30000 milliseconds (30 seconds).
   * @return extraLoadingWait
  **/
  @ApiModelProperty(value = "Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites. Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 30000 milliseconds (30 seconds).")
  public Integer getExtraLoadingWait() {
    return extraLoadingWait;
  }

  public void setExtraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
  }

  public HtmlToPdfRequest includeBackgroundGraphics(Boolean includeBackgroundGraphics) {
    this.includeBackgroundGraphics = includeBackgroundGraphics;
    return this;
  }

   /**
   * Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true.
   * @return includeBackgroundGraphics
  **/
  @ApiModelProperty(value = "Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true.")
  public Boolean isIncludeBackgroundGraphics() {
    return includeBackgroundGraphics;
  }

  public void setIncludeBackgroundGraphics(Boolean includeBackgroundGraphics) {
    this.includeBackgroundGraphics = includeBackgroundGraphics;
  }

  public HtmlToPdfRequest scaleFactor(Integer scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

   /**
   * Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%.
   * @return scaleFactor
  **/
  @ApiModelProperty(value = "Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%.")
  public Integer getScaleFactor() {
    return scaleFactor;
  }

  public void setScaleFactor(Integer scaleFactor) {
    this.scaleFactor = scaleFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlToPdfRequest htmlToPdfRequest = (HtmlToPdfRequest) o;
    return Objects.equals(this.html, htmlToPdfRequest.html) &&
        Objects.equals(this.extraLoadingWait, htmlToPdfRequest.extraLoadingWait) &&
        Objects.equals(this.includeBackgroundGraphics, htmlToPdfRequest.includeBackgroundGraphics) &&
        Objects.equals(this.scaleFactor, htmlToPdfRequest.scaleFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, extraLoadingWait, includeBackgroundGraphics, scaleFactor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlToPdfRequest {\n");
    
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    extraLoadingWait: ").append(toIndentedString(extraLoadingWait)).append("\n");
    sb.append("    includeBackgroundGraphics: ").append(toIndentedString(includeBackgroundGraphics)).append("\n");
    sb.append("    scaleFactor: ").append(toIndentedString(scaleFactor)).append("\n");
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

