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
import com.cloudmersive.client.model.FindRegexMatch;
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
 * Result of finding a string
 */
@ApiModel(description = "Result of finding a string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:59:52.360-07:00")
public class FindStringRegexResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Matches")
  private List<FindRegexMatch> matches = null;

  @SerializedName("MatchCount")
  private Integer matchCount = null;

  public FindStringRegexResponse successful(Boolean successful) {
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

  public FindStringRegexResponse matches(List<FindRegexMatch> matches) {
    this.matches = matches;
    return this;
  }

  public FindStringRegexResponse addMatchesItem(FindRegexMatch matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<FindRegexMatch>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Regular expression matches
   * @return matches
  **/
  @ApiModelProperty(value = "Regular expression matches")
  public List<FindRegexMatch> getMatches() {
    return matches;
  }

  public void setMatches(List<FindRegexMatch> matches) {
    this.matches = matches;
  }

  public FindStringRegexResponse matchCount(Integer matchCount) {
    this.matchCount = matchCount;
    return this;
  }

   /**
   * The number of matches
   * @return matchCount
  **/
  @ApiModelProperty(value = "The number of matches")
  public Integer getMatchCount() {
    return matchCount;
  }

  public void setMatchCount(Integer matchCount) {
    this.matchCount = matchCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindStringRegexResponse findStringRegexResponse = (FindStringRegexResponse) o;
    return Objects.equals(this.successful, findStringRegexResponse.successful) &&
        Objects.equals(this.matches, findStringRegexResponse.matches) &&
        Objects.equals(this.matchCount, findStringRegexResponse.matchCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matches, matchCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindStringRegexResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
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

