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
import com.cloudmersive.client.model.DocxComment;
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
 * Result of getting comments from a Word Document DOCX
 */
@ApiModel(description = "Result of getting comments from a Word Document DOCX")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-22T17:07:42.359-08:00")
public class GetDocxCommentsResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Comments")
  private List<DocxComment> comments = null;

  @SerializedName("CommentCount")
  private Integer commentCount = null;

  public GetDocxCommentsResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public GetDocxCommentsResponse comments(List<DocxComment> comments) {
    this.comments = comments;
    return this;
  }

  public GetDocxCommentsResponse addCommentsItem(DocxComment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<DocxComment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Comments in the document
   * @return comments
  **/
  @ApiModelProperty(value = "Comments in the document")
  public List<DocxComment> getComments() {
    return comments;
  }

  public void setComments(List<DocxComment> comments) {
    this.comments = comments;
  }

  public GetDocxCommentsResponse commentCount(Integer commentCount) {
    this.commentCount = commentCount;
    return this;
  }

   /**
   * The number of comments in the document
   * @return commentCount
  **/
  @ApiModelProperty(value = "The number of comments in the document")
  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxCommentsResponse getDocxCommentsResponse = (GetDocxCommentsResponse) o;
    return Objects.equals(this.successful, getDocxCommentsResponse.successful) &&
        Objects.equals(this.comments, getDocxCommentsResponse.comments) &&
        Objects.equals(this.commentCount, getDocxCommentsResponse.commentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, comments, commentCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxCommentsResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
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
