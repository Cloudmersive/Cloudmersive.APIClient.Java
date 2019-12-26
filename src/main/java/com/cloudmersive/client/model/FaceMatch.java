/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
 * Location of one face in an image, along with match results
 */
@ApiModel(description = "Location of one face in an image, along with match results")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-25T20:54:09.838-08:00")
public class FaceMatch {
  @SerializedName("LeftX")
  private Integer leftX = null;

  @SerializedName("TopY")
  private Integer topY = null;

  @SerializedName("RightX")
  private Integer rightX = null;

  @SerializedName("BottomY")
  private Integer bottomY = null;

  @SerializedName("HighConfidenceMatch")
  private Boolean highConfidenceMatch = null;

  @SerializedName("MatchScore")
  private Double matchScore = null;

  public FaceMatch leftX(Integer leftX) {
    this.leftX = leftX;
    return this;
  }

   /**
   * X coordinate of the left side of the face
   * @return leftX
  **/
  @ApiModelProperty(value = "X coordinate of the left side of the face")
  public Integer getLeftX() {
    return leftX;
  }

  public void setLeftX(Integer leftX) {
    this.leftX = leftX;
  }

  public FaceMatch topY(Integer topY) {
    this.topY = topY;
    return this;
  }

   /**
   * Y coordinate of the top side of the face
   * @return topY
  **/
  @ApiModelProperty(value = "Y coordinate of the top side of the face")
  public Integer getTopY() {
    return topY;
  }

  public void setTopY(Integer topY) {
    this.topY = topY;
  }

  public FaceMatch rightX(Integer rightX) {
    this.rightX = rightX;
    return this;
  }

   /**
   * X coordinate of the right side of the face
   * @return rightX
  **/
  @ApiModelProperty(value = "X coordinate of the right side of the face")
  public Integer getRightX() {
    return rightX;
  }

  public void setRightX(Integer rightX) {
    this.rightX = rightX;
  }

  public FaceMatch bottomY(Integer bottomY) {
    this.bottomY = bottomY;
    return this;
  }

   /**
   * Y coordinate of the bottom side of the face
   * @return bottomY
  **/
  @ApiModelProperty(value = "Y coordinate of the bottom side of the face")
  public Integer getBottomY() {
    return bottomY;
  }

  public void setBottomY(Integer bottomY) {
    this.bottomY = bottomY;
  }

  public FaceMatch highConfidenceMatch(Boolean highConfidenceMatch) {
    this.highConfidenceMatch = highConfidenceMatch;
    return this;
  }

   /**
   * True if there is a high confidence match, false otherwise
   * @return highConfidenceMatch
  **/
  @ApiModelProperty(value = "True if there is a high confidence match, false otherwise")
  public Boolean isHighConfidenceMatch() {
    return highConfidenceMatch;
  }

  public void setHighConfidenceMatch(Boolean highConfidenceMatch) {
    this.highConfidenceMatch = highConfidenceMatch;
  }

  public FaceMatch matchScore(Double matchScore) {
    this.matchScore = matchScore;
    return this;
  }

   /**
   * Match score from 0.0 to 1.0 with higher scores indicating a greater match; scores above 0.7 indicate a match
   * @return matchScore
  **/
  @ApiModelProperty(value = "Match score from 0.0 to 1.0 with higher scores indicating a greater match; scores above 0.7 indicate a match")
  public Double getMatchScore() {
    return matchScore;
  }

  public void setMatchScore(Double matchScore) {
    this.matchScore = matchScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceMatch faceMatch = (FaceMatch) o;
    return Objects.equals(this.leftX, faceMatch.leftX) &&
        Objects.equals(this.topY, faceMatch.topY) &&
        Objects.equals(this.rightX, faceMatch.rightX) &&
        Objects.equals(this.bottomY, faceMatch.bottomY) &&
        Objects.equals(this.highConfidenceMatch, faceMatch.highConfidenceMatch) &&
        Objects.equals(this.matchScore, faceMatch.matchScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftX, topY, rightX, bottomY, highConfidenceMatch, matchScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceMatch {\n");
    
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    rightX: ").append(toIndentedString(rightX)).append("\n");
    sb.append("    bottomY: ").append(toIndentedString(bottomY)).append("\n");
    sb.append("    highConfidenceMatch: ").append(toIndentedString(highConfidenceMatch)).append("\n");
    sb.append("    matchScore: ").append(toIndentedString(matchScore)).append("\n");
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

