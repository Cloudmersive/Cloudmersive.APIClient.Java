/*
 * imageapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import com.cloudmersive.client.model.Face;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Results of locating faces in an image
 */
@ApiModel(description = "Results of locating faces in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T20:05:35.150-07:00")
public class FaceLocateResponse {
  @JsonProperty("Successful")
  private Boolean successful = null;

  @JsonProperty("Faces")
  private List<Face> faces = null;

  @JsonProperty("FaceCount")
  private Integer faceCount = null;

  public FaceLocateResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean getSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FaceLocateResponse faces(List<Face> faces) {
    this.faces = faces;
    return this;
  }

  public FaceLocateResponse addFacesItem(Face facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<Face>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * Array of faces found in the image
   * @return faces
  **/
  @ApiModelProperty(value = "Array of faces found in the image")
  public List<Face> getFaces() {
    return faces;
  }

  public void setFaces(List<Face> faces) {
    this.faces = faces;
  }

  public FaceLocateResponse faceCount(Integer faceCount) {
    this.faceCount = faceCount;
    return this;
  }

   /**
   * Number of faces found in the image
   * @return faceCount
  **/
  @ApiModelProperty(value = "Number of faces found in the image")
  public Integer getFaceCount() {
    return faceCount;
  }

  public void setFaceCount(Integer faceCount) {
    this.faceCount = faceCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceLocateResponse faceLocateResponse = (FaceLocateResponse) o;
    return Objects.equals(this.successful, faceLocateResponse.successful) &&
        Objects.equals(this.faces, faceLocateResponse.faces) &&
        Objects.equals(this.faceCount, faceLocateResponse.faceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, faces, faceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceLocateResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
    sb.append("    faceCount: ").append(toIndentedString(faceCount)).append("\n");
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

