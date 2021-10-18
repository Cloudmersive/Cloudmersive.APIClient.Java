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
 * IANA/Olsen time zone
 */
@ApiModel(description = "IANA/Olsen time zone")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-17T20:35:19.004-07:00")
public class Timezone {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("BaseUTCOffset")
  private String baseUTCOffset = null;

  @SerializedName("Now")
  private OffsetDateTime now = null;

  public Timezone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Time Zone
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Time Zone")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Timezone baseUTCOffset(String baseUTCOffset) {
    this.baseUTCOffset = baseUTCOffset;
    return this;
  }

   /**
   * UTC offset for this time zone
   * @return baseUTCOffset
  **/
  @ApiModelProperty(value = "UTC offset for this time zone")
  public String getBaseUTCOffset() {
    return baseUTCOffset;
  }

  public void setBaseUTCOffset(String baseUTCOffset) {
    this.baseUTCOffset = baseUTCOffset;
  }

  public Timezone now(OffsetDateTime now) {
    this.now = now;
    return this;
  }

   /**
   * The current time (Now) in this time zone
   * @return now
  **/
  @ApiModelProperty(value = "The current time (Now) in this time zone")
  public OffsetDateTime getNow() {
    return now;
  }

  public void setNow(OffsetDateTime now) {
    this.now = now;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timezone timezone = (Timezone) o;
    return Objects.equals(this.name, timezone.name) &&
        Objects.equals(this.baseUTCOffset, timezone.baseUTCOffset) &&
        Objects.equals(this.now, timezone.now);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, baseUTCOffset, now);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timezone {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseUTCOffset: ").append(toIndentedString(baseUTCOffset)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
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

