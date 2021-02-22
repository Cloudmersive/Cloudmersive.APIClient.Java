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
import com.cloudmersive.client.model.DocxTopLevelComment;
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
 * Result of getting comments hierarchically from a Word Document DOCX
 */
@ApiModel(description = "Result of getting comments hierarchically from a Word Document DOCX")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-21T16:14:43.897-08:00")
public class GetDocxCommentsHierarchicalResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Comments")
  private List<DocxTopLevelComment> comments = null;

  @SerializedName("TopLevelCommentCount")
  private Integer topLevelCommentCount = null;

  public GetDocxCommentsHierarchicalResponse successful(Boolean successful) {
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

  public GetDocxCommentsHierarchicalResponse comments(List<DocxTopLevelComment> comments) {
    this.comments = comments;
    return this;
  }

  public GetDocxCommentsHierarchicalResponse addCommentsItem(DocxTopLevelComment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<DocxTopLevelComment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Comments in the document
   * @return comments
  **/
  @ApiModelProperty(value = "Comments in the document")
  public List<DocxTopLevelComment> getComments() {
    return comments;
  }

  public void setComments(List<DocxTopLevelComment> comments) {
    this.comments = comments;
  }

  public GetDocxCommentsHierarchicalResponse topLevelCommentCount(Integer topLevelCommentCount) {
    this.topLevelCommentCount = topLevelCommentCount;
    return this;
  }

   /**
   * The number of comments in the document
   * @return topLevelCommentCount
  **/
  @ApiModelProperty(value = "The number of comments in the document")
  public Integer getTopLevelCommentCount() {
    return topLevelCommentCount;
  }

  public void setTopLevelCommentCount(Integer topLevelCommentCount) {
    this.topLevelCommentCount = topLevelCommentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxCommentsHierarchicalResponse getDocxCommentsHierarchicalResponse = (GetDocxCommentsHierarchicalResponse) o;
    return Objects.equals(this.successful, getDocxCommentsHierarchicalResponse.successful) &&
        Objects.equals(this.comments, getDocxCommentsHierarchicalResponse.comments) &&
        Objects.equals(this.topLevelCommentCount, getDocxCommentsHierarchicalResponse.topLevelCommentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, comments, topLevelCommentCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxCommentsHierarchicalResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    topLevelCommentCount: ").append(toIndentedString(topLevelCommentCount)).append("\n");
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

