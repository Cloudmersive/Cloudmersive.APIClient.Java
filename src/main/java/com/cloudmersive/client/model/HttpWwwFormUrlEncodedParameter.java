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
import com.cloudmersive.client.model.TaskOutputReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines an x-www-form-urlencoded parameter
 */
@ApiModel(description = "Defines an x-www-form-urlencoded parameter")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-20T11:44:25.553-07:00")
public class HttpWwwFormUrlEncodedParameter {
  @SerializedName("KeyName")
  private String keyName = null;

  @SerializedName("KeyValue")
  private String keyValue = null;

  @SerializedName("UseOutputFromPreviousTask")
  private TaskOutputReference useOutputFromPreviousTask = null;

  public HttpWwwFormUrlEncodedParameter keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * Key name of the parameter
   * @return keyName
  **/
  @ApiModelProperty(value = "Key name of the parameter")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public HttpWwwFormUrlEncodedParameter keyValue(String keyValue) {
    this.keyValue = keyValue;
    return this;
  }

   /**
   * Key value of the paramer (must be of type text); if set, do not use UseOutputFromPreviousTask
   * @return keyValue
  **/
  @ApiModelProperty(value = "Key value of the paramer (must be of type text); if set, do not use UseOutputFromPreviousTask")
  public String getKeyValue() {
    return keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }

  public HttpWwwFormUrlEncodedParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

   /**
   * Optional; use the output from a previous task as the input to this parameter.  Set to null (default) to ignore.
   * @return useOutputFromPreviousTask
  **/
  @ApiModelProperty(value = "Optional; use the output from a previous task as the input to this parameter.  Set to null (default) to ignore.")
  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }

  public void setUseOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpWwwFormUrlEncodedParameter httpWwwFormUrlEncodedParameter = (HttpWwwFormUrlEncodedParameter) o;
    return Objects.equals(this.keyName, httpWwwFormUrlEncodedParameter.keyName) &&
        Objects.equals(this.keyValue, httpWwwFormUrlEncodedParameter.keyValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpWwwFormUrlEncodedParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName, keyValue, useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpWwwFormUrlEncodedParameter {\n");
    
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
    sb.append("    useOutputFromPreviousTask: ").append(toIndentedString(useOutputFromPreviousTask)).append("\n");
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

