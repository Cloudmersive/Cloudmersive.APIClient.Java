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
import com.cloudmersive.client.model.DocumentValidationError;
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
 * Document validation result
 */
@ApiModel(description = "Document validation result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-19T22:02:42.811-07:00")
public class DocumentValidationResult {
  @SerializedName("DocumentIsValid")
  private Boolean documentIsValid = null;

  @SerializedName("PasswordProtected")
  private Boolean passwordProtected = null;

  @SerializedName("ErrorCount")
  private Integer errorCount = null;

  @SerializedName("WarningCount")
  private Integer warningCount = null;

  @SerializedName("ErrorsAndWarnings")
  private List<DocumentValidationError> errorsAndWarnings = null;

  public DocumentValidationResult documentIsValid(Boolean documentIsValid) {
    this.documentIsValid = documentIsValid;
    return this;
  }

   /**
   * True if the document is valid and has no errors, false otherwise
   * @return documentIsValid
  **/
  @ApiModelProperty(value = "True if the document is valid and has no errors, false otherwise")
  public Boolean isDocumentIsValid() {
    return documentIsValid;
  }

  public void setDocumentIsValid(Boolean documentIsValid) {
    this.documentIsValid = documentIsValid;
  }

  public DocumentValidationResult passwordProtected(Boolean passwordProtected) {
    this.passwordProtected = passwordProtected;
    return this;
  }

   /**
   * True if the document is password protected, false otherwise
   * @return passwordProtected
  **/
  @ApiModelProperty(value = "True if the document is password protected, false otherwise")
  public Boolean isPasswordProtected() {
    return passwordProtected;
  }

  public void setPasswordProtected(Boolean passwordProtected) {
    this.passwordProtected = passwordProtected;
  }

  public DocumentValidationResult errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

   /**
   * Number of validation errors found in the document
   * @return errorCount
  **/
  @ApiModelProperty(value = "Number of validation errors found in the document")
  public Integer getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }

  public DocumentValidationResult warningCount(Integer warningCount) {
    this.warningCount = warningCount;
    return this;
  }

   /**
   * Number of validation warnings found in the document
   * @return warningCount
  **/
  @ApiModelProperty(value = "Number of validation warnings found in the document")
  public Integer getWarningCount() {
    return warningCount;
  }

  public void setWarningCount(Integer warningCount) {
    this.warningCount = warningCount;
  }

  public DocumentValidationResult errorsAndWarnings(List<DocumentValidationError> errorsAndWarnings) {
    this.errorsAndWarnings = errorsAndWarnings;
    return this;
  }

  public DocumentValidationResult addErrorsAndWarningsItem(DocumentValidationError errorsAndWarningsItem) {
    if (this.errorsAndWarnings == null) {
      this.errorsAndWarnings = new ArrayList<DocumentValidationError>();
    }
    this.errorsAndWarnings.add(errorsAndWarningsItem);
    return this;
  }

   /**
   * Details of errors and warnings found
   * @return errorsAndWarnings
  **/
  @ApiModelProperty(value = "Details of errors and warnings found")
  public List<DocumentValidationError> getErrorsAndWarnings() {
    return errorsAndWarnings;
  }

  public void setErrorsAndWarnings(List<DocumentValidationError> errorsAndWarnings) {
    this.errorsAndWarnings = errorsAndWarnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentValidationResult documentValidationResult = (DocumentValidationResult) o;
    return Objects.equals(this.documentIsValid, documentValidationResult.documentIsValid) &&
        Objects.equals(this.passwordProtected, documentValidationResult.passwordProtected) &&
        Objects.equals(this.errorCount, documentValidationResult.errorCount) &&
        Objects.equals(this.warningCount, documentValidationResult.warningCount) &&
        Objects.equals(this.errorsAndWarnings, documentValidationResult.errorsAndWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentIsValid, passwordProtected, errorCount, warningCount, errorsAndWarnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentValidationResult {\n");
    
    sb.append("    documentIsValid: ").append(toIndentedString(documentIsValid)).append("\n");
    sb.append("    passwordProtected: ").append(toIndentedString(passwordProtected)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    warningCount: ").append(toIndentedString(warningCount)).append("\n");
    sb.append("    errorsAndWarnings: ").append(toIndentedString(errorsAndWarnings)).append("\n");
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

