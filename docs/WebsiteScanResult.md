
# WebsiteScanResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleanResult** | **Boolean** | True if the scan contained no threats, false otherwise |  [optional]
**websiteThreatType** | [**WebsiteThreatTypeEnum**](#WebsiteThreatTypeEnum) | Type of threat returned; can be None, Malware, ForcedDownload or Phishing |  [optional]
**foundViruses** | [**List&lt;VirusFound&gt;**](VirusFound.md) | Array of viruses found, if any |  [optional]


<a name="WebsiteThreatTypeEnum"></a>
## Enum: WebsiteThreatTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
MALWARE | &quot;Malware&quot;
PHISHING | &quot;Phishing&quot;
FORCEDDOWNLOAD | &quot;ForcedDownload&quot;
UNABLETOCONNECT | &quot;UnableToConnect&quot;



