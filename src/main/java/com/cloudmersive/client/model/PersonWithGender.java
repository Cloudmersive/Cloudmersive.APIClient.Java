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
import com.cloudmersive.client.model.Face;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A person identified in an image gender classification operation
 */
@ApiModel(description = "A person identified in an image gender classification operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T00:53:52.264-07:00")
public class PersonWithGender {
  @SerializedName("FaceLocation")
  private Face faceLocation = null;

  @SerializedName("GenderClassificationConfidence")
  private Double genderClassificationConfidence = null;

  @SerializedName("GenderClass")
  private String genderClass = null;

  public PersonWithGender faceLocation(Face faceLocation) {
    this.faceLocation = faceLocation;
    return this;
  }

   /**
   * Location and other information about the person&#39;s face corresponding to this age classification
   * @return faceLocation
  **/
  @ApiModelProperty(value = "Location and other information about the person's face corresponding to this age classification")
  public Face getFaceLocation() {
    return faceLocation;
  }

  public void setFaceLocation(Face faceLocation) {
    this.faceLocation = faceLocation;
  }

  public PersonWithGender genderClassificationConfidence(Double genderClassificationConfidence) {
    this.genderClassificationConfidence = genderClassificationConfidence;
    return this;
  }

   /**
   * Confidence level of gender classification; possible values are between 0.0 and 1.0; higher is better, with values &amp;gt; 0.50 being high confidence results
   * @return genderClassificationConfidence
  **/
  @ApiModelProperty(value = "Confidence level of gender classification; possible values are between 0.0 and 1.0; higher is better, with values &gt; 0.50 being high confidence results")
  public Double getGenderClassificationConfidence() {
    return genderClassificationConfidence;
  }

  public void setGenderClassificationConfidence(Double genderClassificationConfidence) {
    this.genderClassificationConfidence = genderClassificationConfidence;
  }

  public PersonWithGender genderClass(String genderClass) {
    this.genderClass = genderClass;
    return this;
  }

   /**
   * The person&#39;s identified gender; possible values are \&quot;Male\&quot;, \&quot;Female\&quot; and \&quot;Unknown\&quot;
   * @return genderClass
  **/
  @ApiModelProperty(value = "The person's identified gender; possible values are \"Male\", \"Female\" and \"Unknown\"")
  public String getGenderClass() {
    return genderClass;
  }

  public void setGenderClass(String genderClass) {
    this.genderClass = genderClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonWithGender personWithGender = (PersonWithGender) o;
    return Objects.equals(this.faceLocation, personWithGender.faceLocation) &&
        Objects.equals(this.genderClassificationConfidence, personWithGender.genderClassificationConfidence) &&
        Objects.equals(this.genderClass, personWithGender.genderClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faceLocation, genderClassificationConfidence, genderClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonWithGender {\n");
    
    sb.append("    faceLocation: ").append(toIndentedString(faceLocation)).append("\n");
    sb.append("    genderClassificationConfidence: ").append(toIndentedString(genderClassificationConfidence)).append("\n");
    sb.append("    genderClass: ").append(toIndentedString(genderClass)).append("\n");
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

