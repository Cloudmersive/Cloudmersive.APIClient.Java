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
import com.cloudmersive.client.model.SettingValue;
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
 * Result of enumerating settings
 */
@ApiModel(description = "Result of enumerating settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-18T17:05:15.432-07:00")
public class ListSettingsResponse {
  @SerializedName("Settings")
  private List<SettingValue> settings = null;

  public ListSettingsResponse settings(List<SettingValue> settings) {
    this.settings = settings;
    return this;
  }

  public ListSettingsResponse addSettingsItem(SettingValue settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<SettingValue>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Settings in the bucket
   * @return settings
  **/
  @ApiModelProperty(value = "Settings in the bucket")
  public List<SettingValue> getSettings() {
    return settings;
  }

  public void setSettings(List<SettingValue> settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSettingsResponse listSettingsResponse = (ListSettingsResponse) o;
    return Objects.equals(this.settings, listSettingsResponse.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSettingsResponse {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

