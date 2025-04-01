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
import org.threeten.bp.OffsetDateTime;

/**
 * Value of a setting
 */
@ApiModel(description = "Value of a setting")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:59:57.170-07:00")
public class SettingValue {
  @SerializedName("ConfigSettingValueID")
  private String configSettingValueID = null;

  @SerializedName("ConfigSettingDefinitionID")
  private String configSettingDefinitionID = null;

  @SerializedName("ConfigSettingValue")
  private Object configSettingValue = null;

  @SerializedName("ConfigSettingLastModified")
  private OffsetDateTime configSettingLastModified = null;

  @SerializedName("ConfigSettingName")
  private String configSettingName = null;

  @SerializedName("ConfigSettingDescription")
  private String configSettingDescription = null;

  @SerializedName("ConfigSettingTags")
  private String configSettingTags = null;

  @SerializedName("ConfigSettingType")
  private String configSettingType = null;

  public SettingValue configSettingValueID(String configSettingValueID) {
    this.configSettingValueID = configSettingValueID;
    return this;
  }

   /**
   * The ID of the setting value
   * @return configSettingValueID
  **/
  @ApiModelProperty(value = "The ID of the setting value")
  public String getConfigSettingValueID() {
    return configSettingValueID;
  }

  public void setConfigSettingValueID(String configSettingValueID) {
    this.configSettingValueID = configSettingValueID;
  }

  public SettingValue configSettingDefinitionID(String configSettingDefinitionID) {
    this.configSettingDefinitionID = configSettingDefinitionID;
    return this;
  }

   /**
   * The ID of the definition of the setting
   * @return configSettingDefinitionID
  **/
  @ApiModelProperty(value = "The ID of the definition of the setting")
  public String getConfigSettingDefinitionID() {
    return configSettingDefinitionID;
  }

  public void setConfigSettingDefinitionID(String configSettingDefinitionID) {
    this.configSettingDefinitionID = configSettingDefinitionID;
  }

  public SettingValue configSettingValue(Object configSettingValue) {
    this.configSettingValue = configSettingValue;
    return this;
  }

   /**
   * The value of the setting
   * @return configSettingValue
  **/
  @ApiModelProperty(value = "The value of the setting")
  public Object getConfigSettingValue() {
    return configSettingValue;
  }

  public void setConfigSettingValue(Object configSettingValue) {
    this.configSettingValue = configSettingValue;
  }

  public SettingValue configSettingLastModified(OffsetDateTime configSettingLastModified) {
    this.configSettingLastModified = configSettingLastModified;
    return this;
  }

   /**
   * The last modified date of the setting
   * @return configSettingLastModified
  **/
  @ApiModelProperty(value = "The last modified date of the setting")
  public OffsetDateTime getConfigSettingLastModified() {
    return configSettingLastModified;
  }

  public void setConfigSettingLastModified(OffsetDateTime configSettingLastModified) {
    this.configSettingLastModified = configSettingLastModified;
  }

  public SettingValue configSettingName(String configSettingName) {
    this.configSettingName = configSettingName;
    return this;
  }

   /**
   * Name of the setting
   * @return configSettingName
  **/
  @ApiModelProperty(value = "Name of the setting")
  public String getConfigSettingName() {
    return configSettingName;
  }

  public void setConfigSettingName(String configSettingName) {
    this.configSettingName = configSettingName;
  }

  public SettingValue configSettingDescription(String configSettingDescription) {
    this.configSettingDescription = configSettingDescription;
    return this;
  }

   /**
   * Description of the setting
   * @return configSettingDescription
  **/
  @ApiModelProperty(value = "Description of the setting")
  public String getConfigSettingDescription() {
    return configSettingDescription;
  }

  public void setConfigSettingDescription(String configSettingDescription) {
    this.configSettingDescription = configSettingDescription;
  }

  public SettingValue configSettingTags(String configSettingTags) {
    this.configSettingTags = configSettingTags;
    return this;
  }

   /**
   * Setting tags
   * @return configSettingTags
  **/
  @ApiModelProperty(value = "Setting tags")
  public String getConfigSettingTags() {
    return configSettingTags;
  }

  public void setConfigSettingTags(String configSettingTags) {
    this.configSettingTags = configSettingTags;
  }

  public SettingValue configSettingType(String configSettingType) {
    this.configSettingType = configSettingType;
    return this;
  }

   /**
   * Possible values are: STRING, JSON
   * @return configSettingType
  **/
  @ApiModelProperty(value = "Possible values are: STRING, JSON")
  public String getConfigSettingType() {
    return configSettingType;
  }

  public void setConfigSettingType(String configSettingType) {
    this.configSettingType = configSettingType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingValue settingValue = (SettingValue) o;
    return Objects.equals(this.configSettingValueID, settingValue.configSettingValueID) &&
        Objects.equals(this.configSettingDefinitionID, settingValue.configSettingDefinitionID) &&
        Objects.equals(this.configSettingValue, settingValue.configSettingValue) &&
        Objects.equals(this.configSettingLastModified, settingValue.configSettingLastModified) &&
        Objects.equals(this.configSettingName, settingValue.configSettingName) &&
        Objects.equals(this.configSettingDescription, settingValue.configSettingDescription) &&
        Objects.equals(this.configSettingTags, settingValue.configSettingTags) &&
        Objects.equals(this.configSettingType, settingValue.configSettingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configSettingValueID, configSettingDefinitionID, configSettingValue, configSettingLastModified, configSettingName, configSettingDescription, configSettingTags, configSettingType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingValue {\n");
    
    sb.append("    configSettingValueID: ").append(toIndentedString(configSettingValueID)).append("\n");
    sb.append("    configSettingDefinitionID: ").append(toIndentedString(configSettingDefinitionID)).append("\n");
    sb.append("    configSettingValue: ").append(toIndentedString(configSettingValue)).append("\n");
    sb.append("    configSettingLastModified: ").append(toIndentedString(configSettingLastModified)).append("\n");
    sb.append("    configSettingName: ").append(toIndentedString(configSettingName)).append("\n");
    sb.append("    configSettingDescription: ").append(toIndentedString(configSettingDescription)).append("\n");
    sb.append("    configSettingTags: ").append(toIndentedString(configSettingTags)).append("\n");
    sb.append("    configSettingType: ").append(toIndentedString(configSettingType)).append("\n");
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

