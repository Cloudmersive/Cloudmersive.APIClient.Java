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
 * Result of performing a Reverse Domain (DNS) lookup on an IP address
 */
@ApiModel(description = "Result of performing a Reverse Domain (DNS) lookup on an IP address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T13:18:49.253-07:00")
public class IPReverseDNSLookupResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("HostName")
  private String hostName = null;

  public IPReverseDNSLookupResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if a domain was found, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if a domain was found, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public IPReverseDNSLookupResponse hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Host name (fully-qualified) associated with the IP address, if any
   * @return hostName
  **/
  @ApiModelProperty(value = "Host name (fully-qualified) associated with the IP address, if any")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPReverseDNSLookupResponse ipReverseDNSLookupResponse = (IPReverseDNSLookupResponse) o;
    return Objects.equals(this.successful, ipReverseDNSLookupResponse.successful) &&
        Objects.equals(this.hostName, ipReverseDNSLookupResponse.hostName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, hostName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPReverseDNSLookupResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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

