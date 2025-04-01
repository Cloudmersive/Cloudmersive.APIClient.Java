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
import com.cloudmersive.client.model.HtmlHyperlink;
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
 * Result of extracting links from an HTML file
 */
@ApiModel(description = "Result of extracting links from an HTML file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:14:46.914-07:00")
public class HtmlGetLinksResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Links")
  private List<HtmlHyperlink> links = null;

  public HtmlGetLinksResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public HtmlGetLinksResponse links(List<HtmlHyperlink> links) {
    this.links = links;
    return this;
  }

  public HtmlGetLinksResponse addLinksItem(HtmlHyperlink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<HtmlHyperlink>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * All hyperlinks in the HTML document
   * @return links
  **/
  @ApiModelProperty(value = "All hyperlinks in the HTML document")
  public List<HtmlHyperlink> getLinks() {
    return links;
  }

  public void setLinks(List<HtmlHyperlink> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlGetLinksResponse htmlGetLinksResponse = (HtmlGetLinksResponse) o;
    return Objects.equals(this.successful, htmlGetLinksResponse.successful) &&
        Objects.equals(this.links, htmlGetLinksResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlGetLinksResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

