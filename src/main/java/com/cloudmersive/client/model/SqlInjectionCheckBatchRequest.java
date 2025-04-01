/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
import com.cloudmersive.client.model.SqlInjectionCheckRequestItem;
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
 * Input to a batch SQL Injection detection operation
 */
@ApiModel(description = "Input to a batch SQL Injection detection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:21:22.351-07:00")
public class SqlInjectionCheckBatchRequest {
  @SerializedName("RequestItems")
  private List<SqlInjectionCheckRequestItem> requestItems = null;

  @SerializedName("DetectionLevel")
  private String detectionLevel = null;

  public SqlInjectionCheckBatchRequest requestItems(List<SqlInjectionCheckRequestItem> requestItems) {
    this.requestItems = requestItems;
    return this;
  }

  public SqlInjectionCheckBatchRequest addRequestItemsItem(SqlInjectionCheckRequestItem requestItemsItem) {
    if (this.requestItems == null) {
      this.requestItems = new ArrayList<SqlInjectionCheckRequestItem>();
    }
    this.requestItems.add(requestItemsItem);
    return this;
  }

   /**
   * Multiple items to detect for SQL Injection
   * @return requestItems
  **/
  @ApiModelProperty(value = "Multiple items to detect for SQL Injection")
  public List<SqlInjectionCheckRequestItem> getRequestItems() {
    return requestItems;
  }

  public void setRequestItems(List<SqlInjectionCheckRequestItem> requestItems) {
    this.requestItems = requestItems;
  }

  public SqlInjectionCheckBatchRequest detectionLevel(String detectionLevel) {
    this.detectionLevel = detectionLevel;
    return this;
  }

   /**
   * Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended).
   * @return detectionLevel
  **/
  @ApiModelProperty(value = "Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended).")
  public String getDetectionLevel() {
    return detectionLevel;
  }

  public void setDetectionLevel(String detectionLevel) {
    this.detectionLevel = detectionLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlInjectionCheckBatchRequest sqlInjectionCheckBatchRequest = (SqlInjectionCheckBatchRequest) o;
    return Objects.equals(this.requestItems, sqlInjectionCheckBatchRequest.requestItems) &&
        Objects.equals(this.detectionLevel, sqlInjectionCheckBatchRequest.detectionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestItems, detectionLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlInjectionCheckBatchRequest {\n");
    
    sb.append("    requestItems: ").append(toIndentedString(requestItems)).append("\n");
    sb.append("    detectionLevel: ").append(toIndentedString(detectionLevel)).append("\n");
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

