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
import com.cloudmersive.client.model.HttpOrchestrationTask;
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
 * HTTP Orchestration request
 */
@ApiModel(description = "HTTP Orchestration request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-17T20:36:20.700-07:00")
public class HttpOrchestrationRequest {
  @SerializedName("HttpTasks")
  private List<HttpOrchestrationTask> httpTasks = null;

  public HttpOrchestrationRequest httpTasks(List<HttpOrchestrationTask> httpTasks) {
    this.httpTasks = httpTasks;
    return this;
  }

  public HttpOrchestrationRequest addHttpTasksItem(HttpOrchestrationTask httpTasksItem) {
    if (this.httpTasks == null) {
      this.httpTasks = new ArrayList<HttpOrchestrationTask>();
    }
    this.httpTasks.add(httpTasksItem);
    return this;
  }

   /**
   * Tasks to perform, in the order you wish to perform them
   * @return httpTasks
  **/
  @ApiModelProperty(value = "Tasks to perform, in the order you wish to perform them")
  public List<HttpOrchestrationTask> getHttpTasks() {
    return httpTasks;
  }

  public void setHttpTasks(List<HttpOrchestrationTask> httpTasks) {
    this.httpTasks = httpTasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpOrchestrationRequest httpOrchestrationRequest = (HttpOrchestrationRequest) o;
    return Objects.equals(this.httpTasks, httpOrchestrationRequest.httpTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpTasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpOrchestrationRequest {\n");
    
    sb.append("    httpTasks: ").append(toIndentedString(httpTasks)).append("\n");
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

