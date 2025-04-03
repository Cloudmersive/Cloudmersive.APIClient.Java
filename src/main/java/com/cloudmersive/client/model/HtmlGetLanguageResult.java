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
 * Result of getting the language of the input HTML document
 */
@ApiModel(description = "Result of getting the language of the input HTML document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T13:18:58.216-07:00")
public class HtmlGetLanguageResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("LanguageCode")
  private String languageCode = null;

  public HtmlGetLanguageResult successful(Boolean successful) {
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

  public HtmlGetLanguageResult languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * HTML language code of the HTML document, e.g. \&quot;en\&quot; or \&quot;de\&quot;
   * @return languageCode
  **/
  @ApiModelProperty(value = "HTML language code of the HTML document, e.g. \"en\" or \"de\"")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlGetLanguageResult htmlGetLanguageResult = (HtmlGetLanguageResult) o;
    return Objects.equals(this.successful, htmlGetLanguageResult.successful) &&
        Objects.equals(this.languageCode, htmlGetLanguageResult.languageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, languageCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlGetLanguageResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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

