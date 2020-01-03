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
import java.util.Arrays;
import com.cloudmersive.client.model.ReceiptLineItem;
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
import org.threeten.bp.OffsetDateTime;

/**
 * Result of recognizing a receipt, to extract the key information from the receipt
 */
@ApiModel(description = "Result of recognizing a receipt, to extract the key information from the receipt")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T22:32:48.343-08:00")
public class ReceiptRecognitionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("BusinessName")
  private String businessName = null;

  @SerializedName("BusinessWebsite")
  private String businessWebsite = null;

  @SerializedName("AddressString")
  private String addressString = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("ReceiptItems")
  private List<ReceiptLineItem> receiptItems = null;

  @SerializedName("ReceiptSubTotal")
  private Double receiptSubTotal = null;

  @SerializedName("ReceiptTotal")
  private Double receiptTotal = null;

  public ReceiptRecognitionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
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
   * The date and time printed on the receipt (if included on the receipt)
   * @return timestamp
  **/
  @ApiModelProperty(value = "The date and time printed on the receipt (if included on the receipt)")
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
   * The name of the business printed on the receipt (if included on the receipt)
   * @return businessName
  **/
  @ApiModelProperty(value = "The name of the business printed on the receipt (if included on the receipt)")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public ReceiptRecognitionResult businessWebsite(String businessWebsite) {
    this.businessWebsite = businessWebsite;
    return this;
  }

   /**
   * The website URL of the business printed on the receipt (if included on the receipt)
   * @return businessWebsite
  **/
  @ApiModelProperty(value = "The website URL of the business printed on the receipt (if included on the receipt)")
  public String getBusinessWebsite() {
    return businessWebsite;
  }

  public void setBusinessWebsite(String businessWebsite) {
    this.businessWebsite = businessWebsite;
  }

  public ReceiptRecognitionResult addressString(String addressString) {
    this.addressString = addressString;
    return this;
  }

   /**
   * The address of the business printed on the receipt (if included on the receipt)
   * @return addressString
  **/
  @ApiModelProperty(value = "The address of the business printed on the receipt (if included on the receipt)")
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
   * The phone number printed on the receipt (if included on the receipt)
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number printed on the receipt (if included on the receipt)")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ReceiptRecognitionResult receiptItems(List<ReceiptLineItem> receiptItems) {
    this.receiptItems = receiptItems;
    return this;
  }

  public ReceiptRecognitionResult addReceiptItemsItem(ReceiptLineItem receiptItemsItem) {
    if (this.receiptItems == null) {
      this.receiptItems = new ArrayList<ReceiptLineItem>();
    }
    this.receiptItems.add(receiptItemsItem);
    return this;
  }

   /**
   * The individual line items comprising the order; does not include total (see ReceiptTotal)
   * @return receiptItems
  **/
  @ApiModelProperty(value = "The individual line items comprising the order; does not include total (see ReceiptTotal)")
  public List<ReceiptLineItem> getReceiptItems() {
    return receiptItems;
  }

  public void setReceiptItems(List<ReceiptLineItem> receiptItems) {
    this.receiptItems = receiptItems;
  }

  public ReceiptRecognitionResult receiptSubTotal(Double receiptSubTotal) {
    this.receiptSubTotal = receiptSubTotal;
    return this;
  }

   /**
   * Optional; if available, the monetary value of the receipt subtotal - typically not including specialized line items such as Tax. If this value is not available, it will be 0.
   * @return receiptSubTotal
  **/
  @ApiModelProperty(value = "Optional; if available, the monetary value of the receipt subtotal - typically not including specialized line items such as Tax. If this value is not available, it will be 0.")
  public Double getReceiptSubTotal() {
    return receiptSubTotal;
  }

  public void setReceiptSubTotal(Double receiptSubTotal) {
    this.receiptSubTotal = receiptSubTotal;
  }

  public ReceiptRecognitionResult receiptTotal(Double receiptTotal) {
    this.receiptTotal = receiptTotal;
    return this;
  }

   /**
   * The total monetary value of the receipt (if included on the receipt)
   * @return receiptTotal
  **/
  @ApiModelProperty(value = "The total monetary value of the receipt (if included on the receipt)")
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
        Objects.equals(this.businessWebsite, receiptRecognitionResult.businessWebsite) &&
        Objects.equals(this.addressString, receiptRecognitionResult.addressString) &&
        Objects.equals(this.phoneNumber, receiptRecognitionResult.phoneNumber) &&
        Objects.equals(this.receiptItems, receiptRecognitionResult.receiptItems) &&
        Objects.equals(this.receiptSubTotal, receiptRecognitionResult.receiptSubTotal) &&
        Objects.equals(this.receiptTotal, receiptRecognitionResult.receiptTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, timestamp, businessName, businessWebsite, addressString, phoneNumber, receiptItems, receiptSubTotal, receiptTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptRecognitionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessWebsite: ").append(toIndentedString(businessWebsite)).append("\n");
    sb.append("    addressString: ").append(toIndentedString(addressString)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    receiptItems: ").append(toIndentedString(receiptItems)).append("\n");
    sb.append("    receiptSubTotal: ").append(toIndentedString(receiptSubTotal)).append("\n");
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

