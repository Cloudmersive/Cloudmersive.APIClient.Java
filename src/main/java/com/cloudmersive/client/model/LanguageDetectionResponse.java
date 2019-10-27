/*
 * nlpapi
 * The powerful Natural Language Processing APIs let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * Output of a language detection operation
 */
@ApiModel(description = "Output of a language detection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-27T16:37:07.850-07:00")
public class LanguageDetectionResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("DetectedLanguage_ThreeLetterCode")
  private String detectedLanguageThreeLetterCode = null;

  @SerializedName("DetectedLanguage_FullName")
  private String detectedLanguageFullName = null;

  public LanguageDetectionResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the language detection operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the language detection operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public LanguageDetectionResponse detectedLanguageThreeLetterCode(String detectedLanguageThreeLetterCode) {
    this.detectedLanguageThreeLetterCode = detectedLanguageThreeLetterCode;
    return this;
  }

   /**
   * ISO 639 three letter language code
   * @return detectedLanguageThreeLetterCode
  **/
  @ApiModelProperty(value = "ISO 639 three letter language code")
  public String getDetectedLanguageThreeLetterCode() {
    return detectedLanguageThreeLetterCode;
  }

  public void setDetectedLanguageThreeLetterCode(String detectedLanguageThreeLetterCode) {
    this.detectedLanguageThreeLetterCode = detectedLanguageThreeLetterCode;
  }

  public LanguageDetectionResponse detectedLanguageFullName(String detectedLanguageFullName) {
    this.detectedLanguageFullName = detectedLanguageFullName;
    return this;
  }

   /**
   * The full name (in English) of the detected language
   * @return detectedLanguageFullName
  **/
  @ApiModelProperty(value = "The full name (in English) of the detected language")
  public String getDetectedLanguageFullName() {
    return detectedLanguageFullName;
  }

  public void setDetectedLanguageFullName(String detectedLanguageFullName) {
    this.detectedLanguageFullName = detectedLanguageFullName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageDetectionResponse languageDetectionResponse = (LanguageDetectionResponse) o;
    return Objects.equals(this.successful, languageDetectionResponse.successful) &&
        Objects.equals(this.detectedLanguageThreeLetterCode, languageDetectionResponse.detectedLanguageThreeLetterCode) &&
        Objects.equals(this.detectedLanguageFullName, languageDetectionResponse.detectedLanguageFullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, detectedLanguageThreeLetterCode, detectedLanguageFullName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDetectionResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    detectedLanguageThreeLetterCode: ").append(toIndentedString(detectedLanguageThreeLetterCode)).append("\n");
    sb.append("    detectedLanguageFullName: ").append(toIndentedString(detectedLanguageFullName)).append("\n");
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

