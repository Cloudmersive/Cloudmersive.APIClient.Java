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
import com.cloudmersive.client.model.SplitPptxPresentationResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of performing a batch job operation
 */
@ApiModel(description = "Result of performing a batch job operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:09:49.757-07:00")
public class JobStatusResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("AsyncJobStatus")
  private String asyncJobStatus = null;

  @SerializedName("AsyncJobID")
  private String asyncJobID = null;

  @SerializedName("PptxResult")
  private SplitPptxPresentationResult pptxResult = null;

  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  public JobStatusResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation to check the status of the job was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation to check the status of the job was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public JobStatusResult asyncJobStatus(String asyncJobStatus) {
    this.asyncJobStatus = asyncJobStatus;
    return this;
  }

   /**
   * Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED
   * @return asyncJobStatus
  **/
  @ApiModelProperty(value = "Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED")
  public String getAsyncJobStatus() {
    return asyncJobStatus;
  }

  public void setAsyncJobStatus(String asyncJobStatus) {
    this.asyncJobStatus = asyncJobStatus;
  }

  public JobStatusResult asyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
    return this;
  }

   /**
   * When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes
   * @return asyncJobID
  **/
  @ApiModelProperty(value = "When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes")
  public String getAsyncJobID() {
    return asyncJobID;
  }

  public void setAsyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
  }

  public JobStatusResult pptxResult(SplitPptxPresentationResult pptxResult) {
    this.pptxResult = pptxResult;
    return this;
  }

   /**
   * PowerPoint split result (if applicable)
   * @return pptxResult
  **/
  @ApiModelProperty(value = "PowerPoint split result (if applicable)")
  public SplitPptxPresentationResult getPptxResult() {
    return pptxResult;
  }

  public void setPptxResult(SplitPptxPresentationResult pptxResult) {
    this.pptxResult = pptxResult;
  }

  public JobStatusResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message (if any)
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error message (if any)")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatusResult jobStatusResult = (JobStatusResult) o;
    return Objects.equals(this.successful, jobStatusResult.successful) &&
        Objects.equals(this.asyncJobStatus, jobStatusResult.asyncJobStatus) &&
        Objects.equals(this.asyncJobID, jobStatusResult.asyncJobID) &&
        Objects.equals(this.pptxResult, jobStatusResult.pptxResult) &&
        Objects.equals(this.errorMessage, jobStatusResult.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, asyncJobStatus, asyncJobID, pptxResult, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatusResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    asyncJobStatus: ").append(toIndentedString(asyncJobStatus)).append("\n");
    sb.append("    asyncJobID: ").append(toIndentedString(asyncJobID)).append("\n");
    sb.append("    pptxResult: ").append(toIndentedString(pptxResult)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

