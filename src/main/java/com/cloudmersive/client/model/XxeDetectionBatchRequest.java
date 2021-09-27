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
import com.cloudmersive.client.model.XxeDetectionRequestItem;
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
 * Input to a batch XXE detection operation
 */
@ApiModel(description = "Input to a batch XXE detection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-26T22:12:54.471-07:00")
public class XxeDetectionBatchRequest {
  @SerializedName("RequestItems")
  private List<XxeDetectionRequestItem> requestItems = null;

  public XxeDetectionBatchRequest requestItems(List<XxeDetectionRequestItem> requestItems) {
    this.requestItems = requestItems;
    return this;
  }

  public XxeDetectionBatchRequest addRequestItemsItem(XxeDetectionRequestItem requestItemsItem) {
    if (this.requestItems == null) {
      this.requestItems = new ArrayList<XxeDetectionRequestItem>();
    }
    this.requestItems.add(requestItemsItem);
    return this;
  }

   /**
   * Multiple items to protect for XXE
   * @return requestItems
  **/
  @ApiModelProperty(value = "Multiple items to protect for XXE")
  public List<XxeDetectionRequestItem> getRequestItems() {
    return requestItems;
  }

  public void setRequestItems(List<XxeDetectionRequestItem> requestItems) {
    this.requestItems = requestItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XxeDetectionBatchRequest xxeDetectionBatchRequest = (XxeDetectionBatchRequest) o;
    return Objects.equals(this.requestItems, xxeDetectionBatchRequest.requestItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XxeDetectionBatchRequest {\n");
    
    sb.append("    requestItems: ").append(toIndentedString(requestItems)).append("\n");
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

