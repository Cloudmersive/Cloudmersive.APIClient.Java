
# WebsiteScanResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleanResult** | **Boolean** | True if the scan contained no threats, false otherwise |  [optional]
**websiteThreatType** | [**WebsiteThreatTypeEnum**](#WebsiteThreatTypeEnum) | Type of threat returned; can be None, Malware, ForcedDownload or Phishing |  [optional]
**foundViruses** | [**List&lt;VirusFound&gt;**](VirusFound.md) | Array of viruses found, if any |  [optional]
**websiteHttpResponseCode** | **Integer** | The remote server URL HTTP reasponse code; useful for debugging issues with scanning; typically if the remote server returns a 200 or 300-series code this means a successful response, while a 400 or 500 series code would represent an error returned from the remote server for the provided URL. |  [optional]


<a name="WebsiteThreatTypeEnum"></a>
## Enum: WebsiteThreatTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
MALWARE | &quot;Malware&quot;
PHISHING | &quot;Phishing&quot;
FORCEDDOWNLOAD | &quot;ForcedDownload&quot;
UNABLETOCONNECT | &quot;UnableToConnect&quot;



