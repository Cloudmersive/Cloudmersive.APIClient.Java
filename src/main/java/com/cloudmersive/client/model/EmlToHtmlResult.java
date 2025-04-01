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
import com.cloudmersive.client.model.EmlAttachment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Result of converting an EML file to HTML string
 */
@ApiModel(description = "Result of converting an EML file to HTML string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T13:58:55.050-07:00")
public class EmlToHtmlResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Content")
  private String content = null;

  @SerializedName("Body")
  private String body = null;

  @SerializedName("From")
  private String from = null;

  @SerializedName("To")
  private String to = null;

  @SerializedName("Cc")
  private String cc = null;

  @SerializedName("DateSent")
  private String dateSent = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("Attachments")
  private List<EmlAttachment> attachments = null;

  public EmlToHtmlResult successful(Boolean successful) {
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

  public EmlToHtmlResult content(String content) {
    this.content = content;
    return this;
  }

   /**
   * An HTML string version of the EML file
   * @return content
  **/
  @ApiModelProperty(value = "An HTML string version of the EML file")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public EmlToHtmlResult body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The main body of the EML file&#39;s email as an HTML string
   * @return body
  **/
  @ApiModelProperty(value = "The main body of the EML file's email as an HTML string")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public EmlToHtmlResult from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The From sender of the EML file&#39;s email
   * @return from
  **/
  @ApiModelProperty(value = "The From sender of the EML file's email")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public EmlToHtmlResult to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The To recipients of the EML file&#39;s email
   * @return to
  **/
  @ApiModelProperty(value = "The To recipients of the EML file's email")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public EmlToHtmlResult cc(String cc) {
    this.cc = cc;
    return this;
  }

   /**
   * The CC recipients of the EML file&#39;s email
   * @return cc
  **/
  @ApiModelProperty(value = "The CC recipients of the EML file's email")
  public String getCc() {
    return cc;
  }

  public void setCc(String cc) {
    this.cc = cc;
  }

  public EmlToHtmlResult dateSent(String dateSent) {
    this.dateSent = dateSent;
    return this;
  }

   /**
   * The date and time that the EML file&#39;s email was sent
   * @return dateSent
  **/
  @ApiModelProperty(value = "The date and time that the EML file's email was sent")
  public String getDateSent() {
    return dateSent;
  }

  public void setDateSent(String dateSent) {
    this.dateSent = dateSent;
  }

  public EmlToHtmlResult subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the EML file&#39;s email
   * @return subject
  **/
  @ApiModelProperty(value = "The subject of the EML file's email")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public EmlToHtmlResult attachments(List<EmlAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EmlToHtmlResult addAttachmentsItem(EmlAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<EmlAttachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of all attachments for the EML file
   * @return attachments
  **/
  @ApiModelProperty(value = "List of all attachments for the EML file")
  public List<EmlAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<EmlAttachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmlToHtmlResult emlToHtmlResult = (EmlToHtmlResult) o;
    return Objects.equals(this.successful, emlToHtmlResult.successful) &&
        Objects.equals(this.content, emlToHtmlResult.content) &&
        Objects.equals(this.body, emlToHtmlResult.body) &&
        Objects.equals(this.from, emlToHtmlResult.from) &&
        Objects.equals(this.to, emlToHtmlResult.to) &&
        Objects.equals(this.cc, emlToHtmlResult.cc) &&
        Objects.equals(this.dateSent, emlToHtmlResult.dateSent) &&
        Objects.equals(this.subject, emlToHtmlResult.subject) &&
        Objects.equals(this.attachments, emlToHtmlResult.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, content, body, from, to, cc, dateSent, subject, attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmlToHtmlResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

