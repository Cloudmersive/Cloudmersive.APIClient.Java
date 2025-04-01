/*
 * currencyapi
 * The currency APIs help you retrieve exchange rates and convert prices between currencies easily.
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
 * Result of performing a Convert Currency operation
 */
@ApiModel(description = "Result of performing a Convert Currency operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:14:56.965-07:00")
public class ConvertedCurrencyResult {
  @SerializedName("ConvertedPrice")
  private Double convertedPrice = null;

  @SerializedName("ISOCurrencyCode")
  private String isOCurrencyCode = null;

  @SerializedName("CurrencySymbol")
  private String currencySymbol = null;

  @SerializedName("FormattedPriceAsString")
  private String formattedPriceAsString = null;

  public ConvertedCurrencyResult convertedPrice(Double convertedPrice) {
    this.convertedPrice = convertedPrice;
    return this;
  }

   /**
   * The converted price in the destination currency
   * @return convertedPrice
  **/
  @ApiModelProperty(value = "The converted price in the destination currency")
  public Double getConvertedPrice() {
    return convertedPrice;
  }

  public void setConvertedPrice(Double convertedPrice) {
    this.convertedPrice = convertedPrice;
  }

  public ConvertedCurrencyResult isOCurrencyCode(String isOCurrencyCode) {
    this.isOCurrencyCode = isOCurrencyCode;
    return this;
  }

   /**
   * ISO 4217 currency three-letter code of destination price
   * @return isOCurrencyCode
  **/
  @ApiModelProperty(value = "ISO 4217 currency three-letter code of destination price")
  public String getIsOCurrencyCode() {
    return isOCurrencyCode;
  }

  public void setIsOCurrencyCode(String isOCurrencyCode) {
    this.isOCurrencyCode = isOCurrencyCode;
  }

  public ConvertedCurrencyResult currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Destination currency symbol
   * @return currencySymbol
  **/
  @ApiModelProperty(value = "Destination currency symbol")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public ConvertedCurrencyResult formattedPriceAsString(String formattedPriceAsString) {
    this.formattedPriceAsString = formattedPriceAsString;
    return this;
  }

   /**
   * Formatted price in the destination currency as a string
   * @return formattedPriceAsString
  **/
  @ApiModelProperty(value = "Formatted price in the destination currency as a string")
  public String getFormattedPriceAsString() {
    return formattedPriceAsString;
  }

  public void setFormattedPriceAsString(String formattedPriceAsString) {
    this.formattedPriceAsString = formattedPriceAsString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedCurrencyResult convertedCurrencyResult = (ConvertedCurrencyResult) o;
    return Objects.equals(this.convertedPrice, convertedCurrencyResult.convertedPrice) &&
        Objects.equals(this.isOCurrencyCode, convertedCurrencyResult.isOCurrencyCode) &&
        Objects.equals(this.currencySymbol, convertedCurrencyResult.currencySymbol) &&
        Objects.equals(this.formattedPriceAsString, convertedCurrencyResult.formattedPriceAsString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertedPrice, isOCurrencyCode, currencySymbol, formattedPriceAsString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedCurrencyResult {\n");
    
    sb.append("    convertedPrice: ").append(toIndentedString(convertedPrice)).append("\n");
    sb.append("    isOCurrencyCode: ").append(toIndentedString(isOCurrencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    formattedPriceAsString: ").append(toIndentedString(formattedPriceAsString)).append("\n");
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

