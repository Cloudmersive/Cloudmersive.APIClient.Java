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
 * Details of the screenshot request
 */
@ApiModel(description = "Details of the screenshot request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-16T23:15:58.406-07:00")
public class ScreenshotRequest {
  @SerializedName("Url")
  private String url = null;

  @SerializedName("ExtraLoadingWait")
  private Integer extraLoadingWait = null;

  @SerializedName("ScreenshotWidth")
  private Integer screenshotWidth = null;

  @SerializedName("ScreenshotHeight")
  private Integer screenshotHeight = null;

  public ScreenshotRequest url(String url) {
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

  public ScreenshotRequest extraLoadingWait(Integer extraLoadingWait) {
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

  public ScreenshotRequest screenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
    return this;
  }

   /**
   * Optional: Width of the screenshot in pixels; supply 0 to default to 1280 x 1024
   * @return screenshotWidth
  **/
  @ApiModelProperty(value = "Optional: Width of the screenshot in pixels; supply 0 to default to 1280 x 1024")
  public Integer getScreenshotWidth() {
    return screenshotWidth;
  }

  public void setScreenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
  }

  public ScreenshotRequest screenshotHeight(Integer screenshotHeight) {
    this.screenshotHeight = screenshotHeight;
    return this;
  }

   /**
   * Optional: Height of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot
   * @return screenshotHeight
  **/
  @ApiModelProperty(value = "Optional: Height of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot")
  public Integer getScreenshotHeight() {
    return screenshotHeight;
  }

  public void setScreenshotHeight(Integer screenshotHeight) {
    this.screenshotHeight = screenshotHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenshotRequest screenshotRequest = (ScreenshotRequest) o;
    return Objects.equals(this.url, screenshotRequest.url) &&
        Objects.equals(this.extraLoadingWait, screenshotRequest.extraLoadingWait) &&
        Objects.equals(this.screenshotWidth, screenshotRequest.screenshotWidth) &&
        Objects.equals(this.screenshotHeight, screenshotRequest.screenshotHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, extraLoadingWait, screenshotWidth, screenshotHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenshotRequest {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    extraLoadingWait: ").append(toIndentedString(extraLoadingWait)).append("\n");
    sb.append("    screenshotWidth: ").append(toIndentedString(screenshotWidth)).append("\n");
    sb.append("    screenshotHeight: ").append(toIndentedString(screenshotHeight)).append("\n");
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

