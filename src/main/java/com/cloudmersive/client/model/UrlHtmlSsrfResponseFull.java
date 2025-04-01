/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Result of checking a URL for HTML-embedded SSRF threats
 */
@ApiModel(description = "Result of checking a URL for HTML-embedded SSRF threats")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:21:22.351-07:00")
public class UrlHtmlSsrfResponseFull {
  @SerializedName("CleanURL")
  private Boolean cleanURL = null;

  @SerializedName("HttpResponseCode")
  private Integer httpResponseCode = null;

  public UrlHtmlSsrfResponseFull cleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
    return this;
  }

   /**
   * True if the URL is clean, false if it is at risk of containing an SSRF threat or attack
   * @return cleanURL
  **/
  @ApiModelProperty(value = "True if the URL is clean, false if it is at risk of containing an SSRF threat or attack")
  public Boolean isCleanURL() {
    return cleanURL;
  }

  public void setCleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
  }

  public UrlHtmlSsrfResponseFull httpResponseCode(Integer httpResponseCode) {
    this.httpResponseCode = httpResponseCode;
    return this;
  }

   /**
   * HTTP response code from the URL
   * @return httpResponseCode
  **/
  @ApiModelProperty(value = "HTTP response code from the URL")
  public Integer getHttpResponseCode() {
    return httpResponseCode;
  }

  public void setHttpResponseCode(Integer httpResponseCode) {
    this.httpResponseCode = httpResponseCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlHtmlSsrfResponseFull urlHtmlSsrfResponseFull = (UrlHtmlSsrfResponseFull) o;
    return Objects.equals(this.cleanURL, urlHtmlSsrfResponseFull.cleanURL) &&
        Objects.equals(this.httpResponseCode, urlHtmlSsrfResponseFull.httpResponseCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanURL, httpResponseCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlHtmlSsrfResponseFull {\n");
    
    sb.append("    cleanURL: ").append(toIndentedString(cleanURL)).append("\n");
    sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
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

