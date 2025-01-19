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
import com.cloudmersive.client.model.PublicHolidayOccurrence;
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
 * Result of performing a get public holidays request operation
 */
@ApiModel(description = "Result of performing a get public holidays request operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-19T07:33:08.556Z")
public class PublicHolidaysResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("PublicHolidays")
  private List<PublicHolidayOccurrence> publicHolidays = null;

  public PublicHolidaysResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public PublicHolidaysResponse publicHolidays(List<PublicHolidayOccurrence> publicHolidays) {
    this.publicHolidays = publicHolidays;
    return this;
  }

  public PublicHolidaysResponse addPublicHolidaysItem(PublicHolidayOccurrence publicHolidaysItem) {
    if (this.publicHolidays == null) {
      this.publicHolidays = new ArrayList<PublicHolidayOccurrence>();
    }
    this.publicHolidays.add(publicHolidaysItem);
    return this;
  }

   /**
   * Public holidays in the requested country and year
   * @return publicHolidays
  **/
  @ApiModelProperty(value = "Public holidays in the requested country and year")
  public List<PublicHolidayOccurrence> getPublicHolidays() {
    return publicHolidays;
  }

  public void setPublicHolidays(List<PublicHolidayOccurrence> publicHolidays) {
    this.publicHolidays = publicHolidays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicHolidaysResponse publicHolidaysResponse = (PublicHolidaysResponse) o;
    return Objects.equals(this.successful, publicHolidaysResponse.successful) &&
        Objects.equals(this.publicHolidays, publicHolidaysResponse.publicHolidays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, publicHolidays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicHolidaysResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    publicHolidays: ").append(toIndentedString(publicHolidays)).append("\n");
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

