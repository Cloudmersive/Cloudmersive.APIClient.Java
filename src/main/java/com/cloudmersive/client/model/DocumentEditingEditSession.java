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
 * Active document editing session result.  To retrieve the document, use the Finish Editing API.
 */
@ApiModel(description = "Active document editing session result.  To retrieve the document, use the Finish Editing API.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:21:31.070-07:00")
public class DocumentEditingEditSession {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("EditSessionURL")
  private String editSessionURL = null;

  public DocumentEditingEditSession successful(Boolean successful) {
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

  public DocumentEditingEditSession editSessionURL(String editSessionURL) {
    this.editSessionURL = editSessionURL;
    return this;
  }

   /**
   * Document editing session URL; in-memory temporary cache link with TTL (Time-to-Live expiration) of 30 minutes.  To retrieve the document, use the Finish Editing API.
   * @return editSessionURL
  **/
  @ApiModelProperty(value = "Document editing session URL; in-memory temporary cache link with TTL (Time-to-Live expiration) of 30 minutes.  To retrieve the document, use the Finish Editing API.")
  public String getEditSessionURL() {
    return editSessionURL;
  }

  public void setEditSessionURL(String editSessionURL) {
    this.editSessionURL = editSessionURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentEditingEditSession documentEditingEditSession = (DocumentEditingEditSession) o;
    return Objects.equals(this.successful, documentEditingEditSession.successful) &&
        Objects.equals(this.editSessionURL, documentEditingEditSession.editSessionURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, editSessionURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEditingEditSession {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    editSessionURL: ").append(toIndentedString(editSessionURL)).append("\n");
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

