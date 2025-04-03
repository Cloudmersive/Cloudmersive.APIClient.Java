
# CloudStorageVirusScanResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the operation of retrieving the file, and scanning it were successfully completed, false if the file could not be downloaded from cloud storage, or if the file could not be scanned.  Note that successful completion does not mean the file is clean; for the output of the virus scanning operation itself, use the CleanResult and FoundViruses parameters. |  [optional]
**cleanResult** | **Boolean** | True if the scan contained no viruses, false otherwise |  [optional]
**foundViruses** | [**List&lt;CloudStorageVirusFound&gt;**](CloudStorageVirusFound.md) | Array of viruses found, if any |  [optional]
**errorDetailedDescription** | **String** | Detailed error message if the operation was not successful |  [optional]
**fileSize** | **Long** | Size in bytes of the file that was retrieved and scanned |  [optional]
**containsContentModerationRejection** | **Boolean** | Set to true when using NSFW Content Moderation in the Cloudmersive Storage Protect product (disabled by default) |  [optional]



