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
 * Request to enumerate settings
 */
@ApiModel(description = "Request to enumerate settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-24T22:08:15.030-07:00")
public class ListSettingsRequest {
  @SerializedName("BucketID")
  private String bucketID = null;

  @SerializedName("BucketSecretKey")
  private String bucketSecretKey = null;

  public ListSettingsRequest bucketID(String bucketID) {
    this.bucketID = bucketID;
    return this;
  }

   /**
   * BucketID of the bucket to enumerate the settings of; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &amp;gt; API Configuration &amp;gt; Create Bucket
   * @return bucketID
  **/
  @ApiModelProperty(value = "BucketID of the bucket to enumerate the settings of; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &gt; API Configuration &gt; Create Bucket")
  public String getBucketID() {
    return bucketID;
  }

  public void setBucketID(String bucketID) {
    this.bucketID = bucketID;
  }

  public ListSettingsRequest bucketSecretKey(String bucketSecretKey) {
    this.bucketSecretKey = bucketSecretKey;
    return this;
  }

   /**
   * SecretKey of the bucket enumerate the settings of; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &amp;gt; API Configuration &amp;gt; Create Bucket
   * @return bucketSecretKey
  **/
  @ApiModelProperty(value = "SecretKey of the bucket enumerate the settings of; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &gt; API Configuration &gt; Create Bucket")
  public String getBucketSecretKey() {
    return bucketSecretKey;
  }

  public void setBucketSecretKey(String bucketSecretKey) {
    this.bucketSecretKey = bucketSecretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSettingsRequest listSettingsRequest = (ListSettingsRequest) o;
    return Objects.equals(this.bucketID, listSettingsRequest.bucketID) &&
        Objects.equals(this.bucketSecretKey, listSettingsRequest.bucketSecretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketID, bucketSecretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSettingsRequest {\n");
    
    sb.append("    bucketID: ").append(toIndentedString(bucketID)).append("\n");
    sb.append("    bucketSecretKey: ").append(toIndentedString(bucketSecretKey)).append("\n");
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

