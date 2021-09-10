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
 * Request to convert a URL to a PDF file
 */
@ApiModel(description = "Request to convert a URL to a PDF file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-09T19:28:42.852-07:00")
public class UrlToPdfRequest {
  @SerializedName("Url")
  private String url = null;

  @SerializedName("ExtraLoadingWait")
  private Integer extraLoadingWait = null;

  @SerializedName("IncludeBackgroundGraphics")
  private Boolean includeBackgroundGraphics = null;

  @SerializedName("ScaleFactor")
  private Integer scaleFactor = null;

  public UrlToPdfRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL address of the website to screenshot.  HTTP and HTTPS are both supported, as are custom ports.
   * @return url
  **/
  @ApiModelProperty(value = "URL address of the website to screenshot.  HTTP and HTTPS are both supported, as are custom ports.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public UrlToPdfRequest extraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
    return this;
  }

   /**
   * Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites.  Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 20000 milliseconds (20 seconds).
   * @return extraLoadingWait
  **/
  @ApiModelProperty(value = "Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites.  Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 20000 milliseconds (20 seconds).")
  public Integer getExtraLoadingWait() {
    return extraLoadingWait;
  }

  public void setExtraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
  }

  public UrlToPdfRequest includeBackgroundGraphics(Boolean includeBackgroundGraphics) {
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

  public UrlToPdfRequest scaleFactor(Integer scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

   /**
   * Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%
   * @return scaleFactor
  **/
  @ApiModelProperty(value = "Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%")
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
    UrlToPdfRequest urlToPdfRequest = (UrlToPdfRequest) o;
    return Objects.equals(this.url, urlToPdfRequest.url) &&
        Objects.equals(this.extraLoadingWait, urlToPdfRequest.extraLoadingWait) &&
        Objects.equals(this.includeBackgroundGraphics, urlToPdfRequest.includeBackgroundGraphics) &&
        Objects.equals(this.scaleFactor, urlToPdfRequest.scaleFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, extraLoadingWait, includeBackgroundGraphics, scaleFactor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlToPdfRequest {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

