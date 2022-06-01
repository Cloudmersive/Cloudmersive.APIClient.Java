/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
 * Result of performing a create setting operation
 */
@ApiModel(description = "Result of performing a create setting operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:38:37.148-07:00")
public class CreateSettingResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("SettingDefinitionID")
  private String settingDefinitionID = null;

  @SerializedName("SettingValueID")
  private String settingValueID = null;

  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  public CreateSettingResponse successful(Boolean successful) {
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

  public CreateSettingResponse settingDefinitionID(String settingDefinitionID) {
    this.settingDefinitionID = settingDefinitionID;
    return this;
  }

   /**
   * SettingDefinitionID of the setting created
   * @return settingDefinitionID
  **/
  @ApiModelProperty(value = "SettingDefinitionID of the setting created")
  public String getSettingDefinitionID() {
    return settingDefinitionID;
  }

  public void setSettingDefinitionID(String settingDefinitionID) {
    this.settingDefinitionID = settingDefinitionID;
  }

  public CreateSettingResponse settingValueID(String settingValueID) {
    this.settingValueID = settingValueID;
    return this;
  }

   /**
   * SettingValueID of the value of the setting
   * @return settingValueID
  **/
  @ApiModelProperty(value = "SettingValueID of the value of the setting")
  public String getSettingValueID() {
    return settingValueID;
  }

  public void setSettingValueID(String settingValueID) {
    this.settingValueID = settingValueID;
  }

  public CreateSettingResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message, if any, when the operation was not successful
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error message, if any, when the operation was not successful")
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
    CreateSettingResponse createSettingResponse = (CreateSettingResponse) o;
    return Objects.equals(this.successful, createSettingResponse.successful) &&
        Objects.equals(this.settingDefinitionID, createSettingResponse.settingDefinitionID) &&
        Objects.equals(this.settingValueID, createSettingResponse.settingValueID) &&
        Objects.equals(this.errorMessage, createSettingResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, settingDefinitionID, settingValueID, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSettingResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    settingDefinitionID: ").append(toIndentedString(settingDefinitionID)).append("\n");
    sb.append("    settingValueID: ").append(toIndentedString(settingValueID)).append("\n");
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

