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
 * An MSG file attachment
 */
@ApiModel(description = "An MSG file attachment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-19T22:02:42.811-07:00")
public class MsgAttachment {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Content")
  private byte[] content = null;

  public MsgAttachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the attachment, including file extension
   * @return name
  **/
  @ApiModelProperty(value = "Name of the attachment, including file extension")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MsgAttachment content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * The MSG attachment as a byte[]
   * @return content
  **/
  @ApiModelProperty(value = "The MSG attachment as a byte[]")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgAttachment msgAttachment = (MsgAttachment) o;
    return Objects.equals(this.name, msgAttachment.name) &&
        Arrays.equals(this.content, msgAttachment.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, Arrays.hashCode(content));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgAttachment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

