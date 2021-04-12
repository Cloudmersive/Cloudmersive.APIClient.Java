
# XxeDetectionRequestItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputText** | **String** | Individual input text item to protect from XXE |  [optional]
**allowInternetUrls** | **Boolean** | Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false. |  [optional]
**knownSafeUrls** | **List&lt;String&gt;** | Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe. |  [optional]
**knownUnsafeUrls** | **List&lt;String&gt;** | Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe. |  [optional]



