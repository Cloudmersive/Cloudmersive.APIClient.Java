/*
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
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
import com.cloudmersive.client.model.ProductMatch;
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
 * Result of performing a barcode lookup
 */
@ApiModel(description = "Result of performing a barcode lookup")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-20T11:44:02.220-07:00")
public class BarcodeLookupResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Matches")
  private List<ProductMatch> matches = null;

  public BarcodeLookupResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public BarcodeLookupResponse matches(List<ProductMatch> matches) {
    this.matches = matches;
    return this;
  }

  public BarcodeLookupResponse addMatchesItem(ProductMatch matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<ProductMatch>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Resulting product matches for the input barcode
   * @return matches
  **/
  @ApiModelProperty(value = "Resulting product matches for the input barcode")
  public List<ProductMatch> getMatches() {
    return matches;
  }

  public void setMatches(List<ProductMatch> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeLookupResponse barcodeLookupResponse = (BarcodeLookupResponse) o;
    return Objects.equals(this.successful, barcodeLookupResponse.successful) &&
        Objects.equals(this.matches, barcodeLookupResponse.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeLookupResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

