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
 * Result of performing a IP threat check on an IP address
 */
@ApiModel(description = "Result of performing a IP threat check on an IP address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-18T17:04:14.496-07:00")
public class IPThreatResponse {
  @SerializedName("IsThreat")
  private Boolean isThreat = null;

  @SerializedName("ThreatType")
  private String threatType = null;

  public IPThreatResponse isThreat(Boolean isThreat) {
    this.isThreat = isThreat;
    return this;
  }

   /**
   * True if the input IP address is a threat, false otherwise
   * @return isThreat
  **/
  @ApiModelProperty(value = "True if the input IP address is a threat, false otherwise")
  public Boolean isIsThreat() {
    return isThreat;
  }

  public void setIsThreat(Boolean isThreat) {
    this.isThreat = isThreat;
  }

  public IPThreatResponse threatType(String threatType) {
    this.threatType = threatType;
    return this;
  }

   /**
   * Specifies the type of IP threat; possible values include Blocklist, Botnet, WebBot
   * @return threatType
  **/
  @ApiModelProperty(value = "Specifies the type of IP threat; possible values include Blocklist, Botnet, WebBot")
  public String getThreatType() {
    return threatType;
  }

  public void setThreatType(String threatType) {
    this.threatType = threatType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPThreatResponse ipThreatResponse = (IPThreatResponse) o;
    return Objects.equals(this.isThreat, ipThreatResponse.isThreat) &&
        Objects.equals(this.threatType, ipThreatResponse.threatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isThreat, threatType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPThreatResponse {\n");
    
    sb.append("    isThreat: ").append(toIndentedString(isThreat)).append("\n");
    sb.append("    threatType: ").append(toIndentedString(threatType)).append("\n");
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

