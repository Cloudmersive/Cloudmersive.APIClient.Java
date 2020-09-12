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
 * Request to decode content from Base 64 into binary
 */
@ApiModel(description = "Request to decode content from Base 64 into binary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-12T15:35:46.385-07:00")
public class Base64DecodeRequest {
  @SerializedName("Base64ContentToDecode")
  private String base64ContentToDecode = null;

  public Base64DecodeRequest base64ContentToDecode(String base64ContentToDecode) {
    this.base64ContentToDecode = base64ContentToDecode;
    return this;
  }

   /**
   * Input content to decode from Base 64 into binary
   * @return base64ContentToDecode
  **/
  @ApiModelProperty(value = "Input content to decode from Base 64 into binary")
  public String getBase64ContentToDecode() {
    return base64ContentToDecode;
  }

  public void setBase64ContentToDecode(String base64ContentToDecode) {
    this.base64ContentToDecode = base64ContentToDecode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64DecodeRequest base64DecodeRequest = (Base64DecodeRequest) o;
    return Objects.equals(this.base64ContentToDecode, base64DecodeRequest.base64ContentToDecode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64ContentToDecode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64DecodeRequest {\n");
    
    sb.append("    base64ContentToDecode: ").append(toIndentedString(base64ContentToDecode)).append("\n");
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

