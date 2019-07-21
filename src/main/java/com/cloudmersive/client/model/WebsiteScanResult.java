/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
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
 * Result of running a website scan
 */
@ApiModel(description = "Result of running a website scan")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-21T10:25:23.971-07:00")
public class WebsiteScanResult {
  @SerializedName("CleanResult")
  private Boolean cleanResult = null;

  /**
   * Type of threat returned; can be None, Malware, ForcedDownload or Phishing
   */
  @JsonAdapter(WebsiteThreatTypeEnum.Adapter.class)
  public enum WebsiteThreatTypeEnum {
    NONE("None"),
    
    MALWARE("Malware"),
    
    PHISHING("Phishing"),
    
    FORCEDDOWNLOAD("ForcedDownload"),
    
    UNABLETOCONNECT("UnableToConnect");

    private String value;

    WebsiteThreatTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WebsiteThreatTypeEnum fromValue(String text) {
      for (WebsiteThreatTypeEnum b : WebsiteThreatTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WebsiteThreatTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebsiteThreatTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WebsiteThreatTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WebsiteThreatTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("WebsiteThreatType")
  private WebsiteThreatTypeEnum websiteThreatType = null;

  public WebsiteScanResult cleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
    return this;
  }

   /**
   * True if the scan contained no threats, false otherwise
   * @return cleanResult
  **/
  @ApiModelProperty(value = "True if the scan contained no threats, false otherwise")
  public Boolean isCleanResult() {
    return cleanResult;
  }

  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }

  public WebsiteScanResult websiteThreatType(WebsiteThreatTypeEnum websiteThreatType) {
    this.websiteThreatType = websiteThreatType;
    return this;
  }

   /**
   * Type of threat returned; can be None, Malware, ForcedDownload or Phishing
   * @return websiteThreatType
  **/
  @ApiModelProperty(value = "Type of threat returned; can be None, Malware, ForcedDownload or Phishing")
  public WebsiteThreatTypeEnum getWebsiteThreatType() {
    return websiteThreatType;
  }

  public void setWebsiteThreatType(WebsiteThreatTypeEnum websiteThreatType) {
    this.websiteThreatType = websiteThreatType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteScanResult websiteScanResult = (WebsiteScanResult) o;
    return Objects.equals(this.cleanResult, websiteScanResult.cleanResult) &&
        Objects.equals(this.websiteThreatType, websiteScanResult.websiteThreatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanResult, websiteThreatType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsiteScanResult {\n");
    
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    websiteThreatType: ").append(toIndentedString(websiteThreatType)).append("\n");
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

