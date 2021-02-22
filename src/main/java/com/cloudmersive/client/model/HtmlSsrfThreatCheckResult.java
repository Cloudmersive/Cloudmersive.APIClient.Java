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
import com.cloudmersive.client.model.HtmlThreatLink;
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
 * HTML SSRF validation result
 */
@ApiModel(description = "HTML SSRF validation result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-21T16:14:43.897-08:00")
public class HtmlSsrfThreatCheckResult {
  @SerializedName("IsValid")
  private Boolean isValid = null;

  @SerializedName("IsThreat")
  private Boolean isThreat = null;

  @SerializedName("ThreatLinks")
  private List<HtmlThreatLink> threatLinks = null;

  public HtmlSsrfThreatCheckResult isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * True if the document is valid and has no errors, false otherwise
   * @return isValid
  **/
  @ApiModelProperty(value = "True if the document is valid and has no errors, false otherwise")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public HtmlSsrfThreatCheckResult isThreat(Boolean isThreat) {
    this.isThreat = isThreat;
    return this;
  }

   /**
   * True if the document contains an SSRF threat, false otherwise
   * @return isThreat
  **/
  @ApiModelProperty(value = "True if the document contains an SSRF threat, false otherwise")
  public Boolean isIsThreat() {
    return isThreat;
  }

  public void setIsThreat(Boolean isThreat) {
    this.isThreat = isThreat;
  }

  public HtmlSsrfThreatCheckResult threatLinks(List<HtmlThreatLink> threatLinks) {
    this.threatLinks = threatLinks;
    return this;
  }

  public HtmlSsrfThreatCheckResult addThreatLinksItem(HtmlThreatLink threatLinksItem) {
    if (this.threatLinks == null) {
      this.threatLinks = new ArrayList<HtmlThreatLink>();
    }
    this.threatLinks.add(threatLinksItem);
    return this;
  }

   /**
   * Links found in the input HTML that contains threats
   * @return threatLinks
  **/
  @ApiModelProperty(value = "Links found in the input HTML that contains threats")
  public List<HtmlThreatLink> getThreatLinks() {
    return threatLinks;
  }

  public void setThreatLinks(List<HtmlThreatLink> threatLinks) {
    this.threatLinks = threatLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlSsrfThreatCheckResult htmlSsrfThreatCheckResult = (HtmlSsrfThreatCheckResult) o;
    return Objects.equals(this.isValid, htmlSsrfThreatCheckResult.isValid) &&
        Objects.equals(this.isThreat, htmlSsrfThreatCheckResult.isThreat) &&
        Objects.equals(this.threatLinks, htmlSsrfThreatCheckResult.threatLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, isThreat, threatLinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlSsrfThreatCheckResult {\n");
    
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    isThreat: ").append(toIndentedString(isThreat)).append("\n");
    sb.append("    threatLinks: ").append(toIndentedString(threatLinks)).append("\n");
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

