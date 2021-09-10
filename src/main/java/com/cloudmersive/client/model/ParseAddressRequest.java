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
 * Request to parse an address formatted as a string/free text into a structured address
 */
@ApiModel(description = "Request to parse an address formatted as a string/free text into a structured address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-09T19:28:09.888-07:00")
public class ParseAddressRequest {
  @SerializedName("AddressString")
  private String addressString = null;

  @SerializedName("CapitalizationMode")
  private String capitalizationMode = null;

  public ParseAddressRequest addressString(String addressString) {
    this.addressString = addressString;
    return this;
  }

   /**
   * A mailing address or street address formatted as a single text string; this will be parsed into its components
   * @return addressString
  **/
  @ApiModelProperty(value = "A mailing address or street address formatted as a single text string; this will be parsed into its components")
  public String getAddressString() {
    return addressString;
  }

  public void setAddressString(String addressString) {
    this.addressString = addressString;
  }

  public ParseAddressRequest capitalizationMode(String capitalizationMode) {
    this.capitalizationMode = capitalizationMode;
    return this;
  }

   /**
   * Optional; indicates how the parsed output should be capitalized; default is Title Case; possible values are: \&quot;Uppercase\&quot; will set the capitalization to UPPER CASE; \&quot;Lowercase\&quot; will set the capitalization to lower case; \&quot;Titlecase\&quot; will set the capitalization to Title Case; and \&quot;Originalcase\&quot; will preserve the original casing as much as possible
   * @return capitalizationMode
  **/
  @ApiModelProperty(value = "Optional; indicates how the parsed output should be capitalized; default is Title Case; possible values are: \"Uppercase\" will set the capitalization to UPPER CASE; \"Lowercase\" will set the capitalization to lower case; \"Titlecase\" will set the capitalization to Title Case; and \"Originalcase\" will preserve the original casing as much as possible")
  public String getCapitalizationMode() {
    return capitalizationMode;
  }

  public void setCapitalizationMode(String capitalizationMode) {
    this.capitalizationMode = capitalizationMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseAddressRequest parseAddressRequest = (ParseAddressRequest) o;
    return Objects.equals(this.addressString, parseAddressRequest.addressString) &&
        Objects.equals(this.capitalizationMode, parseAddressRequest.capitalizationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressString, capitalizationMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseAddressRequest {\n");
    
    sb.append("    addressString: ").append(toIndentedString(addressString)).append("\n");
    sb.append("    capitalizationMode: ").append(toIndentedString(capitalizationMode)).append("\n");
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

