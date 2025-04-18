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
 * Public holiday occurrence
 */
@ApiModel(description = "Public holiday occurrence")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-16T23:15:49.551-07:00")
public class PublicHolidayOccurrence {
  @SerializedName("EnglishName")
  private String englishName = null;

  @SerializedName("LocalName")
  private String localName = null;

  @SerializedName("OccurrenceDate")
  private OffsetDateTime occurrenceDate = null;

  @SerializedName("HolidayType")
  private String holidayType = null;

  @SerializedName("Nationwide")
  private Boolean nationwide = null;

  public PublicHolidayOccurrence englishName(String englishName) {
    this.englishName = englishName;
    return this;
  }

   /**
   * Name of the holiday in English
   * @return englishName
  **/
  @ApiModelProperty(value = "Name of the holiday in English")
  public String getEnglishName() {
    return englishName;
  }

  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }

  public PublicHolidayOccurrence localName(String localName) {
    this.localName = localName;
    return this;
  }

   /**
   * Local name of the holiday
   * @return localName
  **/
  @ApiModelProperty(value = "Local name of the holiday")
  public String getLocalName() {
    return localName;
  }

  public void setLocalName(String localName) {
    this.localName = localName;
  }

  public PublicHolidayOccurrence occurrenceDate(OffsetDateTime occurrenceDate) {
    this.occurrenceDate = occurrenceDate;
    return this;
  }

   /**
   * Date of the holiday (start time)
   * @return occurrenceDate
  **/
  @ApiModelProperty(value = "Date of the holiday (start time)")
  public OffsetDateTime getOccurrenceDate() {
    return occurrenceDate;
  }

  public void setOccurrenceDate(OffsetDateTime occurrenceDate) {
    this.occurrenceDate = occurrenceDate;
  }

  public PublicHolidayOccurrence holidayType(String holidayType) {
    this.holidayType = holidayType;
    return this;
  }

   /**
   * Type of the holiday; possible values are: Public, Optional
   * @return holidayType
  **/
  @ApiModelProperty(value = "Type of the holiday; possible values are: Public, Optional")
  public String getHolidayType() {
    return holidayType;
  }

  public void setHolidayType(String holidayType) {
    this.holidayType = holidayType;
  }

  public PublicHolidayOccurrence nationwide(Boolean nationwide) {
    this.nationwide = nationwide;
    return this;
  }

   /**
   * True if the holiday is celebrated in all locales in the country, false otherwise
   * @return nationwide
  **/
  @ApiModelProperty(value = "True if the holiday is celebrated in all locales in the country, false otherwise")
  public Boolean isNationwide() {
    return nationwide;
  }

  public void setNationwide(Boolean nationwide) {
    this.nationwide = nationwide;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicHolidayOccurrence publicHolidayOccurrence = (PublicHolidayOccurrence) o;
    return Objects.equals(this.englishName, publicHolidayOccurrence.englishName) &&
        Objects.equals(this.localName, publicHolidayOccurrence.localName) &&
        Objects.equals(this.occurrenceDate, publicHolidayOccurrence.occurrenceDate) &&
        Objects.equals(this.holidayType, publicHolidayOccurrence.holidayType) &&
        Objects.equals(this.nationwide, publicHolidayOccurrence.nationwide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(englishName, localName, occurrenceDate, holidayType, nationwide);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicHolidayOccurrence {\n");
    
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
    sb.append("    localName: ").append(toIndentedString(localName)).append("\n");
    sb.append("    occurrenceDate: ").append(toIndentedString(occurrenceDate)).append("\n");
    sb.append("    holidayType: ").append(toIndentedString(holidayType)).append("\n");
    sb.append("    nationwide: ").append(toIndentedString(nationwide)).append("\n");
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

