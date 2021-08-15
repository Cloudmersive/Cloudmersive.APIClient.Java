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
 * Details of a specific currency
 */
@ApiModel(description = "Details of a specific currency")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-14T17:55:22.590-07:00")
public class AvailableCurrency {
  @SerializedName("ISOCurrencyCode")
  private String isOCurrencyCode = null;

  @SerializedName("CurrencySymbol")
  private String currencySymbol = null;

  @SerializedName("CurrencyEnglishName")
  private String currencyEnglishName = null;

  @SerializedName("CountryName")
  private String countryName = null;

  @SerializedName("CountryThreeLetterCode")
  private String countryThreeLetterCode = null;

  @SerializedName("CountryISOTwoLetterCode")
  private String countryISOTwoLetterCode = null;

  @SerializedName("IsEuropeanUnionMember")
  private Boolean isEuropeanUnionMember = null;

  public AvailableCurrency isOCurrencyCode(String isOCurrencyCode) {
    this.isOCurrencyCode = isOCurrencyCode;
    return this;
  }

   /**
   * ISO 4217 currency three-letter code associated with the country
   * @return isOCurrencyCode
  **/
  @ApiModelProperty(value = "ISO 4217 currency three-letter code associated with the country")
  public String getIsOCurrencyCode() {
    return isOCurrencyCode;
  }

  public void setIsOCurrencyCode(String isOCurrencyCode) {
    this.isOCurrencyCode = isOCurrencyCode;
  }

  public AvailableCurrency currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Symbol associated with the currency
   * @return currencySymbol
  **/
  @ApiModelProperty(value = "Symbol associated with the currency")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public AvailableCurrency currencyEnglishName(String currencyEnglishName) {
    this.currencyEnglishName = currencyEnglishName;
    return this;
  }

   /**
   * Full name of the currency
   * @return currencyEnglishName
  **/
  @ApiModelProperty(value = "Full name of the currency")
  public String getCurrencyEnglishName() {
    return currencyEnglishName;
  }

  public void setCurrencyEnglishName(String currencyEnglishName) {
    this.currencyEnglishName = currencyEnglishName;
  }

  public AvailableCurrency countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Name of the country
   * @return countryName
  **/
  @ApiModelProperty(value = "Name of the country")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public AvailableCurrency countryThreeLetterCode(String countryThreeLetterCode) {
    this.countryThreeLetterCode = countryThreeLetterCode;
    return this;
  }

   /**
   * Three-letter ISO 3166-1 country code
   * @return countryThreeLetterCode
  **/
  @ApiModelProperty(value = "Three-letter ISO 3166-1 country code")
  public String getCountryThreeLetterCode() {
    return countryThreeLetterCode;
  }

  public void setCountryThreeLetterCode(String countryThreeLetterCode) {
    this.countryThreeLetterCode = countryThreeLetterCode;
  }

  public AvailableCurrency countryISOTwoLetterCode(String countryISOTwoLetterCode) {
    this.countryISOTwoLetterCode = countryISOTwoLetterCode;
    return this;
  }

   /**
   * Two-letter ISO 3166-1 country code
   * @return countryISOTwoLetterCode
  **/
  @ApiModelProperty(value = "Two-letter ISO 3166-1 country code")
  public String getCountryISOTwoLetterCode() {
    return countryISOTwoLetterCode;
  }

  public void setCountryISOTwoLetterCode(String countryISOTwoLetterCode) {
    this.countryISOTwoLetterCode = countryISOTwoLetterCode;
  }

  public AvailableCurrency isEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    this.isEuropeanUnionMember = isEuropeanUnionMember;
    return this;
  }

   /**
   * True if this country is currently a member of the European Union (EU), false otherwise
   * @return isEuropeanUnionMember
  **/
  @ApiModelProperty(value = "True if this country is currently a member of the European Union (EU), false otherwise")
  public Boolean isIsEuropeanUnionMember() {
    return isEuropeanUnionMember;
  }

  public void setIsEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    this.isEuropeanUnionMember = isEuropeanUnionMember;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableCurrency availableCurrency = (AvailableCurrency) o;
    return Objects.equals(this.isOCurrencyCode, availableCurrency.isOCurrencyCode) &&
        Objects.equals(this.currencySymbol, availableCurrency.currencySymbol) &&
        Objects.equals(this.currencyEnglishName, availableCurrency.currencyEnglishName) &&
        Objects.equals(this.countryName, availableCurrency.countryName) &&
        Objects.equals(this.countryThreeLetterCode, availableCurrency.countryThreeLetterCode) &&
        Objects.equals(this.countryISOTwoLetterCode, availableCurrency.countryISOTwoLetterCode) &&
        Objects.equals(this.isEuropeanUnionMember, availableCurrency.isEuropeanUnionMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOCurrencyCode, currencySymbol, currencyEnglishName, countryName, countryThreeLetterCode, countryISOTwoLetterCode, isEuropeanUnionMember);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableCurrency {\n");
    
    sb.append("    isOCurrencyCode: ").append(toIndentedString(isOCurrencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    currencyEnglishName: ").append(toIndentedString(currencyEnglishName)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    countryThreeLetterCode: ").append(toIndentedString(countryThreeLetterCode)).append("\n");
    sb.append("    countryISOTwoLetterCode: ").append(toIndentedString(countryISOTwoLetterCode)).append("\n");
    sb.append("    isEuropeanUnionMember: ").append(toIndentedString(isEuropeanUnionMember)).append("\n");
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

