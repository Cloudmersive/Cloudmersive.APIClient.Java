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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Instance of a form field that is handlebar style, such as \&quot;{{FieldName}}\&quot;
 */
@ApiModel(description = "Instance of a form field that is handlebar style, such as \"{{FieldName}}\"")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:38:04.235-07:00")
public class HandlebarFormField {
  @SerializedName("FormFieldTitle")
  private String formFieldTitle = null;

  public HandlebarFormField formFieldTitle(String formFieldTitle) {
    this.formFieldTitle = formFieldTitle;
    return this;
  }

   /**
   * Title of the handlebar style form field, such as \&quot;FieldName\&quot; in the case of \&quot;{{FieldName}}\&quot;
   * @return formFieldTitle
  **/
  @ApiModelProperty(value = "Title of the handlebar style form field, such as \"FieldName\" in the case of \"{{FieldName}}\"")
  public String getFormFieldTitle() {
    return formFieldTitle;
  }

  public void setFormFieldTitle(String formFieldTitle) {
    this.formFieldTitle = formFieldTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HandlebarFormField handlebarFormField = (HandlebarFormField) o;
    return Objects.equals(this.formFieldTitle, handlebarFormField.formFieldTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formFieldTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandlebarFormField {\n");
    
    sb.append("    formFieldTitle: ").append(toIndentedString(formFieldTitle)).append("\n");
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

