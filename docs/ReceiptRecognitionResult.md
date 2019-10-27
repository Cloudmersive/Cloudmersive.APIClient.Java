
# ReceiptRecognitionResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the operation was successful, false otherwise |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time printed on the receipt (if included on the receipt) |  [optional]
**businessName** | **String** | The name of the business printed on the receipt (if included on the receipt) |  [optional]
**businessWebsite** | **String** | The website URL of the business printed on the receipt (if included on the receipt) |  [optional]
**addressString** | **String** | The address of the business printed on the receipt (if included on the receipt) |  [optional]
**phoneNumber** | **String** | The phone number printed on the receipt (if included on the receipt) |  [optional]
**receiptItems** | [**List&lt;ReceiptLineItem&gt;**](ReceiptLineItem.md) | The individual line items comprising the order; does not include total (see ReceiptTotal) |  [optional]
**receiptSubTotal** | **Double** | Optional; if available, the monetary value of the receipt subtotal - typically not including specialized line items such as Tax. If this value is not available, it will be 0. |  [optional]
**receiptTotal** | **Double** | The total monetary value of the receipt (if included on the receipt) |  [optional]



