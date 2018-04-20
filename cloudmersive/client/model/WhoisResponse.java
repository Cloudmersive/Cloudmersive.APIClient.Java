/*
 * validateapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Result of a WHOIS operation
 */
@ApiModel(description = "Result of a WHOIS operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T21:21:06.167-07:00")
public class WhoisResponse {
  @JsonProperty("ValidDomain")
  private Boolean validDomain = null;

  @JsonProperty("WhoisServer")
  private String whoisServer = null;

  @JsonProperty("RawTextRecord")
  private String rawTextRecord = null;

  @JsonProperty("CreatedDt")
  private DateTime createdDt = null;

  public WhoisResponse validDomain(Boolean validDomain) {
    this.validDomain = validDomain;
    return this;
  }

   /**
   * True if the domain is valid, false if it is not
   * @return validDomain
  **/
  @ApiModelProperty(value = "True if the domain is valid, false if it is not")
  public Boolean getValidDomain() {
    return validDomain;
  }

  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }

  public WhoisResponse whoisServer(String whoisServer) {
    this.whoisServer = whoisServer;
    return this;
  }

   /**
   * Server used to lookup WHOIS information (may change based on lookup).
   * @return whoisServer
  **/
  @ApiModelProperty(value = "Server used to lookup WHOIS information (may change based on lookup).")
  public String getWhoisServer() {
    return whoisServer;
  }

  public void setWhoisServer(String whoisServer) {
    this.whoisServer = whoisServer;
  }

  public WhoisResponse rawTextRecord(String rawTextRecord) {
    this.rawTextRecord = rawTextRecord;
    return this;
  }

   /**
   * WHOIS raw text record
   * @return rawTextRecord
  **/
  @ApiModelProperty(value = "WHOIS raw text record")
  public String getRawTextRecord() {
    return rawTextRecord;
  }

  public void setRawTextRecord(String rawTextRecord) {
    this.rawTextRecord = rawTextRecord;
  }

  public WhoisResponse createdDt(DateTime createdDt) {
    this.createdDt = createdDt;
    return this;
  }

   /**
   * Creation date for the record
   * @return createdDt
  **/
  @ApiModelProperty(value = "Creation date for the record")
  public DateTime getCreatedDt() {
    return createdDt;
  }

  public void setCreatedDt(DateTime createdDt) {
    this.createdDt = createdDt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhoisResponse whoisResponse = (WhoisResponse) o;
    return Objects.equals(this.validDomain, whoisResponse.validDomain) &&
        Objects.equals(this.whoisServer, whoisResponse.whoisServer) &&
        Objects.equals(this.rawTextRecord, whoisResponse.rawTextRecord) &&
        Objects.equals(this.createdDt, whoisResponse.createdDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validDomain, whoisServer, rawTextRecord, createdDt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhoisResponse {\n");
    
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
    sb.append("    whoisServer: ").append(toIndentedString(whoisServer)).append("\n");
    sb.append("    rawTextRecord: ").append(toIndentedString(rawTextRecord)).append("\n");
    sb.append("    createdDt: ").append(toIndentedString(createdDt)).append("\n");
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

