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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-02T23:47:23.662-07:00")
public class HtmlToPdfRequest {
  @SerializedName("Html")
  private String html = null;

  @SerializedName("ExtraLoadingWait")
  private Integer extraLoadingWait = null;

  public HtmlToPdfRequest html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @ApiModelProperty(value = "")
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
   * Get extraLoadingWait
   * @return extraLoadingWait
  **/
  @ApiModelProperty(value = "")
  public Integer getExtraLoadingWait() {
    return extraLoadingWait;
  }

  public void setExtraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
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
        Objects.equals(this.extraLoadingWait, htmlToPdfRequest.extraLoadingWait);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, extraLoadingWait);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlToPdfRequest {\n");
    
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    extraLoadingWait: ").append(toIndentedString(extraLoadingWait)).append("\n");
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

