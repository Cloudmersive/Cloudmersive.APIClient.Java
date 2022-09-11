/*
 * securityapi
 * The security APIs help you detect and block security threats.
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
import java.util.ArrayList;
import java.util.List;

/**
 * Request to determine if a URL is an SSRF threat check
 */
@ApiModel(description = "Request to determine if a URL is an SSRF threat check")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:20:48.600-07:00")
public class UrlSsrfThreatDetectionRequestFull {
  @SerializedName("URL")
  private String URL = null;

  @SerializedName("BlockedDomains")
  private List<String> blockedDomains = null;

  public UrlSsrfThreatDetectionRequestFull URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * URL to validate
   * @return URL
  **/
  @ApiModelProperty(value = "URL to validate")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public UrlSsrfThreatDetectionRequestFull blockedDomains(List<String> blockedDomains) {
    this.blockedDomains = blockedDomains;
    return this;
  }

  public UrlSsrfThreatDetectionRequestFull addBlockedDomainsItem(String blockedDomainsItem) {
    if (this.blockedDomains == null) {
      this.blockedDomains = new ArrayList<String>();
    }
    this.blockedDomains.add(blockedDomainsItem);
    return this;
  }

   /**
   * Top level domains that you do not want to allow access to, e.g. mydomain.com - will block all subdomains as well
   * @return blockedDomains
  **/
  @ApiModelProperty(value = "Top level domains that you do not want to allow access to, e.g. mydomain.com - will block all subdomains as well")
  public List<String> getBlockedDomains() {
    return blockedDomains;
  }

  public void setBlockedDomains(List<String> blockedDomains) {
    this.blockedDomains = blockedDomains;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSsrfThreatDetectionRequestFull urlSsrfThreatDetectionRequestFull = (UrlSsrfThreatDetectionRequestFull) o;
    return Objects.equals(this.URL, urlSsrfThreatDetectionRequestFull.URL) &&
        Objects.equals(this.blockedDomains, urlSsrfThreatDetectionRequestFull.blockedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL, blockedDomains);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSsrfThreatDetectionRequestFull {\n");
    
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    blockedDomains: ").append(toIndentedString(blockedDomains)).append("\n");
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

