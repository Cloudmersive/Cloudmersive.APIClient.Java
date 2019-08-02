/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
 * Result of recognizing a receipt, to extract the key information from the receipt
 */
@ApiModel(description = "Result of recognizing a receipt, to extract the key information from the receipt")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T20:54:21.432-07:00")
public class ReceiptRecognitionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("BusinessName")
  private String businessName = null;

  @SerializedName("AddressString")
  private String addressString = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("ReceiptTotal")
  private Double receiptTotal = null;

  public ReceiptRecognitionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ReceiptRecognitionResult timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ReceiptRecognitionResult businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @ApiModelProperty(value = "")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public ReceiptRecognitionResult addressString(String addressString) {
    this.addressString = addressString;
    return this;
  }

   /**
   * Get addressString
   * @return addressString
  **/
  @ApiModelProperty(value = "")
  public String getAddressString() {
    return addressString;
  }

  public void setAddressString(String addressString) {
    this.addressString = addressString;
  }

  public ReceiptRecognitionResult phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ReceiptRecognitionResult receiptTotal(Double receiptTotal) {
    this.receiptTotal = receiptTotal;
    return this;
  }

   /**
   * Get receiptTotal
   * @return receiptTotal
  **/
  @ApiModelProperty(value = "")
  public Double getReceiptTotal() {
    return receiptTotal;
  }

  public void setReceiptTotal(Double receiptTotal) {
    this.receiptTotal = receiptTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptRecognitionResult receiptRecognitionResult = (ReceiptRecognitionResult) o;
    return Objects.equals(this.successful, receiptRecognitionResult.successful) &&
        Objects.equals(this.timestamp, receiptRecognitionResult.timestamp) &&
        Objects.equals(this.businessName, receiptRecognitionResult.businessName) &&
        Objects.equals(this.addressString, receiptRecognitionResult.addressString) &&
        Objects.equals(this.phoneNumber, receiptRecognitionResult.phoneNumber) &&
        Objects.equals(this.receiptTotal, receiptRecognitionResult.receiptTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, timestamp, businessName, addressString, phoneNumber, receiptTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptRecognitionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    addressString: ").append(toIndentedString(addressString)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    receiptTotal: ").append(toIndentedString(receiptTotal)).append("\n");
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

