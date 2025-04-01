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
import com.cloudmersive.client.model.PersonWithAge;
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
 * Result from classifying the Age of people in an image
 */
@ApiModel(description = "Result from classifying the Age of people in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:14:44.740-07:00")
public class AgeDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("PeopleWithAge")
  private List<PersonWithAge> peopleWithAge = null;

  @SerializedName("PeopleIdentified")
  private Integer peopleIdentified = null;

  public AgeDetectionResult successful(Boolean successful) {
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

  public AgeDetectionResult peopleWithAge(List<PersonWithAge> peopleWithAge) {
    this.peopleWithAge = peopleWithAge;
    return this;
  }

  public AgeDetectionResult addPeopleWithAgeItem(PersonWithAge peopleWithAgeItem) {
    if (this.peopleWithAge == null) {
      this.peopleWithAge = new ArrayList<PersonWithAge>();
    }
    this.peopleWithAge.add(peopleWithAgeItem);
    return this;
  }

   /**
   * People in the image annotated with age information
   * @return peopleWithAge
  **/
  @ApiModelProperty(value = "People in the image annotated with age information")
  public List<PersonWithAge> getPeopleWithAge() {
    return peopleWithAge;
  }

  public void setPeopleWithAge(List<PersonWithAge> peopleWithAge) {
    this.peopleWithAge = peopleWithAge;
  }

  public AgeDetectionResult peopleIdentified(Integer peopleIdentified) {
    this.peopleIdentified = peopleIdentified;
    return this;
  }

   /**
   * Number of people identified in the image with an age
   * @return peopleIdentified
  **/
  @ApiModelProperty(value = "Number of people identified in the image with an age")
  public Integer getPeopleIdentified() {
    return peopleIdentified;
  }

  public void setPeopleIdentified(Integer peopleIdentified) {
    this.peopleIdentified = peopleIdentified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeDetectionResult ageDetectionResult = (AgeDetectionResult) o;
    return Objects.equals(this.successful, ageDetectionResult.successful) &&
        Objects.equals(this.peopleWithAge, ageDetectionResult.peopleWithAge) &&
        Objects.equals(this.peopleIdentified, ageDetectionResult.peopleIdentified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, peopleWithAge, peopleIdentified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    peopleWithAge: ").append(toIndentedString(peopleWithAge)).append("\n");
    sb.append("    peopleIdentified: ").append(toIndentedString(peopleIdentified)).append("\n");
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

